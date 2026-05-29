package eu.coresense.context.scoping

import eu.coresense.context.scoping.AbstractContextModelScopeProvider
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import eu.coresense.context.contextModel.QualifiedPublisherRef
import org.eclipse.xtext.scoping.IScope
import ros.Publisher
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.naming.QualifiedName
import eu.coresense.context.contextModel.ContextModelPackage
import eu.coresense.context.contextModel.ContextModel
import org.eclipse.xtext.EcoreUtil2
import java.util.List
import java.util.ArrayList
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import eu.coresense.context.contextModel.QualifiedActionServerRef
import eu.coresense.context.contextModel.QualifiedServiceServerRef
import ros.ServiceServer
import ros.ActionServer
import eu.coresense.common.Import
import eu.coresense.common.Utilities


class ContextModelScopeProviderr extends AbstractContextModelScopeProvider {

	override getScope(EObject context, EReference reference) {
        if (reference == ContextModelPackage.Literals.QUALIFIED_PUBLISHER_REF__PUBLISHER) {
            return scope_QualifiedPublisherRef_publisher((context as QualifiedPublisherRef), reference)
        }
        if(reference == ContextModelPackage.Literals.QUALIFIED_ACTION_SERVER_REF__ACTION_SERVER)
	    {
	    	val qref = context as QualifiedActionServerRef;
	        val node = qref.node;
	  
	        if (node !== null && node.getActionserver().size() != 0) {
	        	

	            // scope over all features in the model
	           	return Scopes.scopeFor(
		            node.getActionserver(),
		            [EObject e | QualifiedName.create((e as ActionServer).name)],
		            IScope.NULLSCOPE
		        )
	        }
	        return IScope.NULLSCOPE;
	    }
	    if(reference == ContextModelPackage.Literals.QUALIFIED_SERVICE_SERVER_REF__SERVICE_SERVER)
	    {
	    	val qref = context as QualifiedServiceServerRef;
	        val node = qref.node;
	        if (node !== null && node.getServiceserver().size() != 0) {
	            // scope over all features in the model
	            return Scopes.scopeFor(
		            node.getServiceserver(), 
		            [EObject e | QualifiedName.create((e as ServiceServer).name)],
		            IScope.NULLSCOPE
		        )
	        }
	        return IScope.NULLSCOPE;
	    }
	    //TODO: These could be separated to only get nodes which have at least one service_server, action_server, publisher.
        if(reference == ContextModelPackage.Literals.QUALIFIED_REF__NODE
        )
	    {
	    	val model = EcoreUtil2.getContainerOfType(context, ContextModel);

	    	return Scopes.scopeFor(
	    		allNodes(model,context),
	    		[EObject e | QualifiedName.create((e as ros.Node).name)],
	    		IScope.NULLSCOPE
	    	);
	    }
         super.getScope(context, reference)
     }

     def IScope scope_QualifiedPublisherRef_publisher(QualifiedPublisherRef context, EReference ref) {
         if (context.node === null) return IScope.NULLSCOPE

         val publishers = context.node.publisher

         // Scopes.scopeFor with lambda keeps '/' literal
         return Scopes.scopeFor(
             publishers, 
             [EObject e | QualifiedName.create((e as Publisher).name)],
             IScope.NULLSCOPE
         )
     }
     
     def List<ros.Node> allNodes(ContextModel model, EObject context) {
     	
     	val sys_defs = collectAllSystems(model, context.eResource());
     	
     	val allNodes = new ArrayList<ros.Node>();
     	for (system.System sys_def : sys_defs)
     	{
     		for(system.Component comp : sys_def.getComponents())
     		{
     			if(comp instanceof system.RosNode)
     			{
     				val node = comp as system.RosNode;
     				allNodes.add(node.getFrom());
     			}
     		}
     	}
     	return allNodes;
	}
	
	def List<system.System> collectAllSystems(ContextModel model, Resource currentResource) {
	    val result = new ArrayList;
	    val resourceSet = currentResource.getResourceSet();

	    for (Import imp : model.getImports()) {
	        val uriStr = imp.getImportURI();
	        if (uriStr !== null && uriStr.endsWith(".rossystem"))
			{
	        var uri = URI.createURI(uriStr);
	        if (uri.isRelative()) {
	            uri = uri.resolve(currentResource.getURI());
	        }

	        try {
	            val imported = resourceSet.getResource(uri, true);
	            if (imported !== null && !imported.getContents().isEmpty())
				{
		            val root = imported.getContents().get(0);
		            if (root instanceof system.System) {
		                collectRecursively(root, result);
		            }
	            }
	        } catch (Exception e) {
	            System.err.println("Failed to load .rossystem import: " + uriStr);
	            e.printStackTrace();
	        }
	        
	        }
	    }

	    return result;
	}
	
	def void collectRecursively(system.System system, List<system.System> result) {
	    if (system === null || result.contains(system)) return;
	    result.add(system);

	    for (system.Component comp : system.getComponents()) {
	        if (comp instanceof system.SubSystem) {
	            collectRecursively(comp.getSystem(), result);
	        }
	    }
	}	
}