package eu.coresense.resolution.scoping

import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import eu.coresense.resolution.resolutionModel.ResolutionModelPackage
import java.util.List
import java.util.ArrayList
import uma.caosd.rhea.BasicFMmetamodel.Feature
import eu.coresense.resolution.resolutionModel.ResolutionModel
import org.eclipse.emf.ecore.resource.Resource
import eu.coresense.resolution.resolutionModel.Import
import org.eclipse.emf.common.util.URI
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.IScope
import eu.coresense.resolution.resolutionModel.SetParam
import org.eclipse.xtext.naming.QualifiedName
import eu.coresense.resolution.resolutionModel.FeatureReference
import ros.Parameter
import eu.coresense.common.Utilities
import ros.ActionSpec

class ResolutionModelScopeProviderr  extends AbstractResolutionModelScopeProvider {
	
	override getScope(EObject context, EReference reference) {
	    if (reference == ResolutionModelPackage.Literals.FEATURE_REFERENCE__PARENT || reference == ResolutionModelPackage.Literals.FUNCTIONAL_MAPPING__FEATURE) {
	    	val model = EcoreUtil2.getContainerOfType(context, ResolutionModel);
	        if (model !== null && model.getFeatureModel() !== null) {
	            val featureModel = model.getFeatureModel();
	            val root = featureModel.getRoot();
	            val optFeatures = new ArrayList;
	            collectParents(root, optFeatures);
	            return Scopes.scopeFor(optFeatures);
	        }
	    }
	   	if (reference == ResolutionModelPackage.Literals.FEATURE_REFERENCE__FEATURE) {
	    	val fRef = context as FeatureReference;
	    	return Scopes.scopeFor(fRef.parent.children.filter[element | !element.mandatory])
	    }
	    if (reference == ResolutionModelPackage.Literals.RESOLUTION_MODEL__ROSSYSTEM) {
	        var currentResource = context.eResource();
	        
	    	val model = EcoreUtil2.getContainerOfType(context, ResolutionModel);
	    	if (model !== null) {
	    	    val rosSystems = collectAllSystems(model, currentResource);
	    	    return Scopes.scopeFor(rosSystems);
	    	}
	    }
	    if (reference == ResolutionModelPackage.Literals.RECONFIGURATION__NODE) {
	        val model = EcoreUtil2.getContainerOfType(context, ResolutionModel);
	        if (model === null) return IScope.NULLSCOPE;

	        val systems = collectAllSystems(model, context.eResource());

	        val allNodes = new ArrayList;
	        for (system.System sys : systems) {
	            for (system.Component comp : sys.getComponents()) {
	                if (comp instanceof system.RosNode) {
	                    allNodes.add(comp);
	                }
	            }
	        }

//	        return Scopes.scopeFor(allNodes);
         return Scopes.scopeFor(
            		allNodes, 
		            [EObject e | QualifiedName.create(Utilities.escape((e as system.RosNode).name))],
		            IScope.NULLSCOPE
		        )
	    }
	    if (reference == ResolutionModelPackage.Literals.SET_PARAM__PARAM) {
	        val model = EcoreUtil2.getContainerOfType(context, ResolutionModel);
	        val spRef = context as SetParam;
	        if (model === null) return IScope.NULLSCOPE;

	        val systems = collectAllSystems(model, context.eResource());

	        val allParams = new ArrayList;
	        for (system.System sys : systems) {
	            for (system.Component comp : sys.getComponents()) {
	                if (comp instanceof system.RosNode) {
	                	if(spRef.getNode() == comp) {
	                		allParams.addAll(comp.getFrom().getParameter());
	                	}
	                }
	            }
	        }

//	        return Scopes.scopeFor(allParams);
         return Scopes.scopeFor(
            		allParams, 
		            [EObject e | QualifiedName.create(Utilities.escape((e as Parameter).name))],
		            IScope.NULLSCOPE
		        )
	    }
	   	if (reference == ResolutionModelPackage.Literals.FUNCTIONAL_MAPPING__ACTION) {
	        val model = EcoreUtil2.getContainerOfType(context, ResolutionModel);
	     	
	     	return Scopes.scopeFor(
	    		allActions(model,context),
	    		[EObject e | QualifiedName.create(Utilities.escape((e as ActionSpec).name))],
	    		IScope.NULLSCOPE
	    	);
	    }
	    return super.getScope(context, reference);
	}	


def List<ActionSpec> allActions(ResolutionModel model, EObject context) {
     	
     	val sys_defs = collectAllSystems(model, context.eResource());
     	
     	val allActions = new ArrayList<ActionSpec>();
     	for (system.System sys_def : sys_defs)
     	{
     		for(system.Component comp : sys_def.getComponents())
     		{
     			if(comp instanceof system.RosNode)
     			{
     				val node = comp as system.RosNode;
     				val originalNodeActionServers = node.from.actionserver
     				for(actionServer : originalNodeActionServers)
     				{
     					allActions.add(actionServer.action);
     				}
     				
     			}
     		}
     	}
     	return allActions;
	}


def void collectParents(Feature feature, List<Feature> parentFeatures) {
    if(feature !== null)
    {
		if (feature.getChildren().size() > 0) {
			parentFeatures.add(feature);
	    } 
        for (Feature child : feature.getChildren()) {
        	collectParents(child, parentFeatures);
	    }
    }
}


def List<system.System> collectAllSystems(ResolutionModel model, Resource currentResource) {
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