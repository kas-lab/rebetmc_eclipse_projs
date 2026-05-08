package eu.coresense.resolution.scoping;

import com.google.common.base.Function;
import eu.coresense.resolution.resolutionModel.FeatureReference;
import eu.coresense.resolution.resolutionModel.Import;
import eu.coresense.resolution.resolutionModel.ResolutionModel;
import eu.coresense.resolution.resolutionModel.ResolutionModelPackage;
import eu.coresense.resolution.resolutionModel.SetParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import ros.Parameter;
import system.Component;
import system.RosNode;
import system.SubSystem;
import uma.caosd.rhea.BasicFMmetamodel.Feature;
import uma.caosd.rhea.BasicFMmetamodel.FeatureModel;

@SuppressWarnings("all")
public class ResolutionModelScopeProviderr extends AbstractResolutionModelScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    boolean _equals = Objects.equals(reference, ResolutionModelPackage.Literals.FEATURE_REFERENCE__PARENT);
    if (_equals) {
      final ResolutionModel model = EcoreUtil2.<ResolutionModel>getContainerOfType(context, ResolutionModel.class);
      if (((model != null) && (model.getFeatureModel() != null))) {
        final FeatureModel featureModel = model.getFeatureModel();
        final Feature root = featureModel.getRoot();
        final ArrayList<Feature> optFeatures = new ArrayList<Feature>();
        this.collectParents(root, optFeatures);
        return Scopes.scopeFor(optFeatures);
      }
    }
    boolean _equals_1 = Objects.equals(reference, ResolutionModelPackage.Literals.FEATURE_REFERENCE__FEATURE);
    if (_equals_1) {
      final FeatureReference fRef = ((FeatureReference) context);
      final Function1<Feature, Boolean> _function = (Feature element) -> {
        boolean _isMandatory = element.isMandatory();
        return Boolean.valueOf((!_isMandatory));
      };
      return Scopes.scopeFor(IterableExtensions.<Feature>filter(fRef.getParent().getChildren(), _function));
    }
    boolean _equals_2 = Objects.equals(reference, ResolutionModelPackage.Literals.RESOLUTION_MODEL__ROSSYSTEM);
    if (_equals_2) {
      Resource currentResource = context.eResource();
      final ResolutionModel model_1 = EcoreUtil2.<ResolutionModel>getContainerOfType(context, ResolutionModel.class);
      if ((model_1 != null)) {
        final List<system.System> rosSystems = this.collectAllSystems(model_1, currentResource);
        return Scopes.scopeFor(rosSystems);
      }
    }
    boolean _equals_3 = Objects.equals(reference, ResolutionModelPackage.Literals.RECONFIGURATION__NODE);
    if (_equals_3) {
      final ResolutionModel model_2 = EcoreUtil2.<ResolutionModel>getContainerOfType(context, ResolutionModel.class);
      if ((model_2 == null)) {
        return IScope.NULLSCOPE;
      }
      final List<system.System> systems = this.collectAllSystems(model_2, context.eResource());
      final ArrayList<EObject> allNodes = new ArrayList<EObject>();
      for (final system.System sys : systems) {
        EList<Component> _components = sys.getComponents();
        for (final Component comp : _components) {
          if ((comp instanceof RosNode)) {
            allNodes.add(comp);
          }
        }
      }
      final Function<EObject, QualifiedName> _function_1 = (EObject e) -> {
        return QualifiedName.create(ResolutionModelScopeProviderr.escape(((RosNode) e).getName()));
      };
      return Scopes.<EObject>scopeFor(allNodes, _function_1, 
        IScope.NULLSCOPE);
    }
    boolean _equals_4 = Objects.equals(reference, ResolutionModelPackage.Literals.SET_PARAM__PARAM);
    if (_equals_4) {
      final ResolutionModel model_3 = EcoreUtil2.<ResolutionModel>getContainerOfType(context, ResolutionModel.class);
      final SetParam spRef = ((SetParam) context);
      if ((model_3 == null)) {
        return IScope.NULLSCOPE;
      }
      final List<system.System> systems_1 = this.collectAllSystems(model_3, context.eResource());
      final ArrayList<EObject> allParams = new ArrayList<EObject>();
      for (final system.System sys_1 : systems_1) {
        EList<Component> _components_1 = sys_1.getComponents();
        for (final Component comp_1 : _components_1) {
          if ((comp_1 instanceof RosNode)) {
            RosNode _node = spRef.getNode();
            boolean _equals_5 = Objects.equals(_node, comp_1);
            if (_equals_5) {
              allParams.addAll(((RosNode)comp_1).getFrom().getParameter());
            }
          }
        }
      }
      final Function<EObject, QualifiedName> _function_2 = (EObject e) -> {
        return QualifiedName.create(ResolutionModelScopeProviderr.escape(((Parameter) e).getName()));
      };
      return Scopes.<EObject>scopeFor(allParams, _function_2, 
        IScope.NULLSCOPE);
    }
    return super.getScope(context, reference);
  }

  public void collectParents(final Feature feature, final List<Feature> parentFeatures) {
    if ((feature != null)) {
      int _size = feature.getChildren().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        parentFeatures.add(feature);
      }
      EList<Feature> _children = feature.getChildren();
      for (final Feature child : _children) {
        this.collectParents(child, parentFeatures);
      }
    }
  }

  public List<system.System> collectAllSystems(final ResolutionModel model, final Resource currentResource) {
    final ArrayList<system.System> result = new ArrayList<system.System>();
    final ResourceSet resourceSet = currentResource.getResourceSet();
    EList<Import> _imports = model.getImports();
    for (final Import imp : _imports) {
      {
        final String uriStr = imp.getImportURI();
        if (((uriStr != null) && uriStr.endsWith(".rossystem"))) {
          URI uri = URI.createURI(uriStr);
          boolean _isRelative = uri.isRelative();
          if (_isRelative) {
            uri = uri.resolve(currentResource.getURI());
          }
          try {
            final Resource imported = resourceSet.getResource(uri, true);
            if (((imported != null) && (!imported.getContents().isEmpty()))) {
              final EObject root = imported.getContents().get(0);
              if ((root instanceof system.System)) {
                this.collectRecursively(((system.System)root), result);
              }
            }
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              final Exception e = (Exception)_t;
              System.err.println(("Failed to load .rossystem import: " + uriStr));
              e.printStackTrace();
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        }
      }
    }
    return result;
  }

  public void collectRecursively(final system.System system, final List<system.System> result) {
    if (((system == null) || result.contains(system))) {
      return;
    }
    result.add(system);
    EList<Component> _components = system.getComponents();
    for (final Component comp : _components) {
      if ((comp instanceof SubSystem)) {
        this.collectRecursively(((SubSystem)comp).getSystem(), result);
      }
    }
  }

  public static String escape(final String name) {
    String _xblockexpression = null;
    {
      String noSlash = name.replace("/", "_slash_");
      String noTildenoSlash = noSlash.replace("~", "_tilde_");
      _xblockexpression = noTildenoSlash.replace(".", "_dot_");
    }
    return _xblockexpression;
  }

  /**
   * Unescape `_slash_` back to `/`
   */
  public static String unescape(final String name) {
    String _xblockexpression = null;
    {
      String withSlash = name.replace("_slash_", "/");
      String withTildewithSlash = withSlash.replace("_tilde_", "~");
      _xblockexpression = withTildewithSlash.replace("_dot_", ".");
    }
    return _xblockexpression;
  }
}
