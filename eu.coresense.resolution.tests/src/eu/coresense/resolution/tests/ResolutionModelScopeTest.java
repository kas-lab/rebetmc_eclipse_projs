package eu.coresense.resolution.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.google.inject.Inject;

import eu.coresense.resolution.resolutionModel.FeatureReference;
import eu.coresense.resolution.resolutionModel.Resolution;
import eu.coresense.resolution.resolutionModel.ResolutionModel;
import eu.coresense.resolution.resolutionModel.ResolutionModelFactory;
import eu.coresense.resolution.resolutionModel.ResolutionModelPackage;
import uma.caosd.rhea.BasicFMmetamodel.BasicFMmetamodelFactory;
import uma.caosd.rhea.BasicFMmetamodel.Feature;
import uma.caosd.rhea.BasicFMmetamodel.FeatureModel;

@ExtendWith(InjectionExtension.class)
@InjectWith(ResolutionModelInjectorProvider.class)
class ResolutionModelScopeTest {

    @Inject
    private IScopeProvider scopeProvider;

    @Test
    void functionalMappingScopeIncludesParentAndLeafFeatures() {
        ResolutionModel model = createModel();
        var mapping = ResolutionModelFactory.eINSTANCE
                .createFunctionalMapping();
        model.getFunctionalMapping().add(mapping);

        Set<String> names = names(scopeProvider.getScope(mapping,
                ResolutionModelPackage.Literals.FUNCTIONAL_MAPPING__FEATURE));

        assertEquals(Set.of("ROOT", "TASK", "LEAF_A", "LEAF_B"), names);
    }

    @Test
    void featureReferenceParentScopeExcludesLeafFeatures() {
        ResolutionModel model = createModel();
        FeatureReference reference = addFeatureReference(model);

        Set<String> names = names(scopeProvider.getScope(reference,
                ResolutionModelPackage.Literals.FEATURE_REFERENCE__PARENT));

        assertEquals(Set.of("ROOT", "TASK"), names);
        assertFalse(names.contains("LEAF_A"));
        assertFalse(names.contains("LEAF_B"));
    }

    @Test
    void featureReferenceChildScopeContainsOnlySelectedParentsChildren() {
        ResolutionModel model = createModel();
        FeatureReference reference = addFeatureReference(model);
        reference.setParent(model.getFeatureModel().getRoot().getChildren().get(0));

        Set<String> names = names(scopeProvider.getScope(reference,
                ResolutionModelPackage.Literals.FEATURE_REFERENCE__FEATURE));

        assertEquals(Set.of("LEAF_A", "LEAF_B"), names);
        assertTrue(names.contains("LEAF_A"));
        assertTrue(names.contains("LEAF_B"));
    }

    private static Set<String> names(IScope scope) {
        return StreamSupport.stream(scope.getAllElements().spliterator(), false)
                .map(description -> description.getName().toString())
                .collect(Collectors.toSet());
    }

    private static ResolutionModel createModel() {
        BasicFMmetamodelFactory factory = BasicFMmetamodelFactory.eINSTANCE;
        FeatureModel featureModel = factory.createFeatureModel();
        Feature root = createFeature("ROOT");
        Feature task = createFeature("TASK");

        task.getChildren().add(createFeature("LEAF_A"));
        task.getChildren().add(createFeature("LEAF_B"));
        root.getChildren().add(task);
        featureModel.setRoot(root);

        ResolutionModel model = ResolutionModelFactory.eINSTANCE
                .createResolutionModel();
        model.setFeatureModel(featureModel);
        return model;
    }

    private static Feature createFeature(String name) {
        Feature feature = BasicFMmetamodelFactory.eINSTANCE.createFeature();
        feature.setName(name);
        feature.setId(name);
        return feature;
    }

    private static FeatureReference addFeatureReference(ResolutionModel model) {
        Resolution resolution = ResolutionModelFactory.eINSTANCE
                .createResolution();
        FeatureReference reference = ResolutionModelFactory.eINSTANCE
                .createFeatureReference();
        resolution.setFeatureRef(reference);
        model.getResolutions().add(resolution);
        return reference;
    }
}
