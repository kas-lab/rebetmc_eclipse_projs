package eu.coresense.context.scoping;

import com.google.common.base.Function;
import eu.coresense.context.contextModel.ContextModel;
import eu.coresense.context.contextModel.ContextModelPackage;
import eu.coresense.context.contextModel.Import;
import eu.coresense.context.contextModel.QualifiedActionServerRef;
import eu.coresense.context.contextModel.QualifiedPublisherRef;
import eu.coresense.context.contextModel.QualifiedServiceServerRef;
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
import ros.ActionServer;
import ros.Node;
import ros.Publisher;
import ros.ServiceServer;
import system.Component;
import system.RosNode;
import system.SubSystem;

@SuppressWarnings("all")
public class ContextModelScopeProviderr extends AbstractContextModelScopeProvider {
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    IScope _xblockexpression = null;
    {
      boolean _equals = Objects.equals(reference, ContextModelPackage.Literals.QUALIFIED_PUBLISHER_REF__PUBLISHER);
      if (_equals) {
        return this.scope_QualifiedPublisherRef_publisher(((QualifiedPublisherRef) context), reference);
      }
      boolean _equals_1 = Objects.equals(reference, ContextModelPackage.Literals.QUALIFIED_ACTION_SERVER_REF__ACTION_SERVER);
      if (_equals_1) {
        final QualifiedActionServerRef qref = ((QualifiedActionServerRef) context);
        final Node node = qref.getNode();
        if (((node != null) && (node.getActionserver().size() != 0))) {
          final Function<EObject, QualifiedName> _function = (EObject e) -> {
            return QualifiedName.create(ContextModelScopeProviderr.escape(((ActionServer) e).getName()));
          };
          return Scopes.<EObject>scopeFor(
            node.getActionserver(), _function, 
            IScope.NULLSCOPE);
        }
        return IScope.NULLSCOPE;
      }
      boolean _equals_2 = Objects.equals(reference, ContextModelPackage.Literals.QUALIFIED_SERVICE_SERVER_REF__SERVICE_SERVER);
      if (_equals_2) {
        final QualifiedServiceServerRef qref_1 = ((QualifiedServiceServerRef) context);
        final Node node_1 = qref_1.getNode();
        if (((node_1 != null) && (node_1.getServiceserver().size() != 0))) {
          final Function<EObject, QualifiedName> _function_1 = (EObject e) -> {
            return QualifiedName.create(ContextModelScopeProviderr.escape(((ServiceServer) e).getName()));
          };
          return Scopes.<EObject>scopeFor(
            node_1.getServiceserver(), _function_1, 
            IScope.NULLSCOPE);
        }
        return IScope.NULLSCOPE;
      }
      boolean _equals_3 = Objects.equals(reference, ContextModelPackage.Literals.QUALIFIED_REF__NODE);
      if (_equals_3) {
        final ContextModel model = EcoreUtil2.<ContextModel>getContainerOfType(context, ContextModel.class);
        return Scopes.scopeFor(this.allNodes(model, context));
      }
      _xblockexpression = super.getScope(context, reference);
    }
    return _xblockexpression;
  }

  public IScope scope_QualifiedPublisherRef_publisher(final QualifiedPublisherRef context, final EReference ref) {
    Node _node = context.getNode();
    boolean _tripleEquals = (_node == null);
    if (_tripleEquals) {
      return IScope.NULLSCOPE;
    }
    final EList<Publisher> publishers = context.getNode().getPublisher();
    final Function<EObject, QualifiedName> _function = (EObject e) -> {
      return QualifiedName.create(ContextModelScopeProviderr.escape(((Publisher) e).getName()));
    };
    return Scopes.<EObject>scopeFor(publishers, _function, 
      IScope.NULLSCOPE);
  }

  public List<Node> allNodes(final ContextModel model, final EObject context) {
    final List<system.System> sys_defs = this.collectAllSystems(model, context.eResource());
    final ArrayList<Node> allNodes = new ArrayList<Node>();
    for (final system.System sys_def : sys_defs) {
      EList<Component> _components = sys_def.getComponents();
      for (final Component comp : _components) {
        if ((comp instanceof RosNode)) {
          final RosNode node = ((RosNode) comp);
          allNodes.add(node.getFrom());
        }
      }
    }
    return allNodes;
  }

  public List<system.System> collectAllSystems(final ContextModel model, final Resource currentResource) {
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
      _xblockexpression = noSlash.replace("~", "_tilde_");
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
      _xblockexpression = withSlash.replace("_tilde_", "~");
    }
    return _xblockexpression;
  }
}
