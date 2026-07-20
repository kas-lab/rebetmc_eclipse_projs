package eu.coresense.adaptation.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.google.inject.Injector;

import de.fraunhofer.ipa.ros.RosStandaloneSetupGenerated;
import de.fraunhofer.ipa.ros2.Ros2StandaloneSetupGenerated;
import de.fraunhofer.ipa.rossystem.RosSystemStandaloneSetupGenerated;
import eu.coresense.adaptation.TacticsStandaloneSetupGenerated;
import eu.coresense.adaptation.generator.TQLGenerator;
import eu.coresense.adaptation.generator.TacticsNameProvider;
import eu.coresense.adaptation.tactics.TacticsModel;
import eu.coresense.common.NameProvider;
import eu.coresense.common.RosNameProvider;
import eu.coresense.context.ContextModelStandaloneSetupGenerated;
import eu.coresense.context.generator.ContextNameProvider;
import eu.coresense.resolution.ResolutionModelStandaloneSetupGenerated;
import eu.coresense.resolution.generator.ResolutionNameProvider;
import eu.coresense.variability.FeatureModelStandaloneSetupGenerated;
import uma.caosd.rhea.AdvancedConstraintsFMmetamodel.AdvancedConstraintsFMmetamodelPackage;

@EnabledIfEnvironmentVariable(named = "CORESENSE_SUAVE_MODELS", matches = ".+")
class CombinedTQLGeneratorTest {
    private static final Pattern ACTION_RELATION = Pattern.compile(
        "\\$(ta_[a-zA-Z0-9_]+_to_action_[a-zA-Z0-9_]+)\\s*\\(");

    private static TQLGenerator generator;
    private static TacticsModel model;
    private static Resource modelResource;

    @BeforeAll
    static void loadModels() throws Exception {
        String configuredPath = System.getenv("CORESENSE_SUAVE_MODELS");
        Path models = Path.of(configuredPath).toAbsolutePath();
        assertTrue(Files.isDirectory(models),
            "CORESENSE_SUAVE_MODELS must name the SUAVE models directory");

        XtextResourceSet resources = new XtextResourceSet();
        AdvancedConstraintsFMmetamodelPackage.eINSTANCE.eClass();

        load(new RosStandaloneSetupGenerated(), resources, "ros",
            models.resolve("interfaces"));
        load(new Ros2StandaloneSetupGenerated(), resources, "ros2",
            models.resolve("ros"));
        load(new RosSystemStandaloneSetupGenerated(), resources, "rossystem",
            models.resolve("system"));
        load(new FeatureModelStandaloneSetupGenerated(), resources, "var",
            models.resolve("tactical_retreat/suave.var"));
        load(new ResolutionModelStandaloneSetupGenerated(), resources, "resolution",
            models.resolve("tactical_retreat/suave.resolution"));
        load(new ContextModelStandaloneSetupGenerated(), resources, "context",
            models.resolve("tactical_retreat/suave.context"));
        List<Resource> tactics = load(new TacticsStandaloneSetupGenerated(), resources,
            "tactics", models.resolve("tactical_retreat/suave.tactics"));

        modelResource = tactics.get(0);
        model = (TacticsModel) modelResource.getContents().get(0);

        NameProvider namer = new NameProvider();
        namer.register(new RosNameProvider());
        namer.register(new TacticsNameProvider());
        namer.register(new ContextNameProvider(namer));
        namer.register(new ResolutionNameProvider());
        generator = new TQLGenerator(namer);
    }

    @Test
    void combinedOutputContainsRulesFromBothActionGroups() {
        String tql = generator.generateCombinedTQL(model, modelResource, false, false);

        assertTrue(tql.contains("has rule_name \"LOW_ALTITUDE\""));
        assertTrue(tql.contains("has rule_name \"START_RECOVER_MOTION\""));
        assertTrue(tql.contains("has rule_name \"END_RECOVER_MOTION\""));
    }

    @Test
    void combinedOutputQuotesContextStringLiteralsOnce() {
        String tql = generator.generateCombinedTQL(model, modelResource, false, false);

        assertTrue(tql.contains("has string_value \"RECOVERED\""));
        assertFalse(tql.contains("has string_value '\"RECOVERED\"'"));
    }

    @Test
    void combinedOutputWrapsNegatedFeatureCondition() {
        String tql = generator.generateCombinedTQL(model, modelResource, false, false);
        Pattern wrapper = Pattern.compile(
            "\\$(is_selected_f_recover_motion(?:_\\d+)?)_positive\\s*"
                + "\\(atom: \\$f_recover_motion\\) isa propositional_expression;\\s*"
                + "\\$\\1\\s*\\(expression: \\$\\1_positive\\) isa not_expression;");
        Matcher matcher = wrapper.matcher(tql);

        assertTrue(matcher.find());
        assertTrue(Pattern.compile("expression:\\s*\\$"
            + Pattern.quote(matcher.group(1)) + "(?![a-zA-Z0-9_])")
            .matcher(tql).find());
    }

    @Test
    void combinedOutputEmitsSharedDeclarationsOnce() {
        String tql = generator.generateCombinedTQL(model, modelResource, false, false);

        assertEquals(1, occurrences(tql,
            "isa Tactic, has tactic_name \"suave_tactics\""));
        assertEquals(1, occurrences(tql,
            "has feature_name \"RECOVER_MOTION\""));
    }

    @Test
    void combinedOutputUsesDistinctActionRelationVariables() {
        String tql = generator.generateCombinedTQL(model, modelResource, false, false);
        Matcher matcher = ACTION_RELATION.matcher(tql);

        assertTrue(matcher.find());
        String first = matcher.group(1);
        assertTrue(matcher.find());
        String second = matcher.group(1);
        assertNotEquals(first, second);
        assertFalse(matcher.find());
    }

    @Test
    void legacyOutputStillReturnsOneDocumentPerActionGroup() {
        List<String> documents = generator.generateTQL(
            model, modelResource, false, false);

        assertEquals(2, documents.size());
        assertTrue(documents.get(0).contains("has rule_name \"LOW_ALTITUDE\""));
        assertFalse(documents.get(0).contains("START_RECOVER_MOTION"));
        assertTrue(documents.get(1).contains(
            "has rule_name \"START_RECOVER_MOTION\""));
    }

    private static int occurrences(String text, String needle) {
        return (text.length() - text.replace(needle, "").length()) / needle.length();
    }

    private static List<Resource> load(ISetup setup, XtextResourceSet resourceSet,
            String extension, Path path) throws Exception {
        Injector injector = setup.createInjectorAndDoEMFRegistration();
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
            extension,
            injector.getInstance(org.eclipse.xtext.resource.XtextResourceFactory.class));

        List<Path> paths;
        if (Files.isDirectory(path)) {
            try (var files = Files.walk(path)) {
                paths = files.filter(file -> file.toString().endsWith("." + extension))
                    .sorted()
                    .toList();
            }
        } else {
            paths = List.of(path);
        }

        List<Resource> loaded = new java.util.ArrayList<>();
        for (Path file : paths) {
            Resource resource = resourceSet.createResource(
                org.eclipse.emf.common.util.URI.createFileURI(
                    file.toRealPath().toString()));
            resource.load(null);
            loaded.add(resource);
        }
        return loaded;
    }
}
