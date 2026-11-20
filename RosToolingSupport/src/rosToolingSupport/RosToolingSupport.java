package rosToolingSupport;


import org.eclipse.emf.ecore.resource.Resource;
import system.RosNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.nio.file.*;

import system.System;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import com.google.inject.Injector;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import eu.coresense.resolution.resolutionModel.ResolutionModelPackage;
import system.RossystemPackage;
import ros.ParameterType;
import ros.RosFactory;
import ros.RosPackage;
import eu.coresense.adaptation.tactics.TacticsPackage;
import eu.coresense.requirements.requirementsModel.RequirementsModelPackage;	
import system.RossystemFactory;



public class RosToolingSupport {
	
	public static class LoadResult {
	    public final Injector injector;
	    public final List<Resource> resources;

	    public LoadResult(Injector injector, List<Resource> resources) {
	        this.injector = injector;
	        this.resources = resources;
	    }
	}
	
	public static void registerEPackages() {
    // Register the EPackages for the models you want to load
    ResolutionModelPackage.eINSTANCE.eClass();
    RossystemPackage.eINSTANCE.eClass();
    RosPackage.eINSTANCE.eClass();
	TacticsPackage.eINSTANCE.eClass();
	RequirementsModelPackage.eINSTANCE.eClass();
	// Add any other EPackages you need to register
  }
	
  	public static List<system.RosNode> allRossystemNodes( List<Resource> rosSystemResources)
	{
		return allRossystemNodes(true, rosSystemResources);
	}

	public static List<system.RosNode> allRossystemNodes(boolean skipSubnodes, List<Resource> rosSystemResources)
	{
		List<system.RosNode> rosNodesInRossystems = new ArrayList<>();

		for (Resource resource : rosSystemResources) {
			System sys = (System) resource.getContents().get(0);
			for (system.Component component : sys.getComponents()) {
				if (!(component instanceof system.RosNode)) {
					continue;
				}
				system.RosNode ros_node = (system.RosNode) component;
				boolean isSubnode = ros_node.getParent() != null;
				// java.lang.System.out.println("Node: " + ros_node.getName() + " isSubnode: " + isSubnode);
				
				if(!skipSubnodes || !isSubnode) {
					rosNodesInRossystems.add(ros_node);
				}
			}
		}

		return rosNodesInRossystems;
	}
	public static ros.Parameter findParameter(ros.Node node, String parameterName) {
  		return node.getParameter()
		.stream()
		.filter(parameter -> parameter.getName().equals(parameterName)).
		findFirst().
		orElse(null);
	}

	public static system.RosParameter findRosParameter(RosNode rosNode, String parameterName) {
		return rosNode.getRosparameters()
		.stream()
		.filter(parameter -> parameter.getFrom().getName().equals(parameterName))
		.findFirst()
		.orElse(null);
	}

	public static system.RosParameter findRosParameter(ros.Parameter parameter, RosNode rosNode) {
		return rosNode.getRosparameters()
			.stream()
			.filter(rosParam -> rosParam.getFrom().equals(parameter))
			.findFirst()
			.orElse(null);
	}
	
	public static void updateRosParameter(system.RosParameter rosParam, ros.ParameterValue p_val) {
		boolean valueSame = rosParam.getValue().equals(p_val);

		if(!valueSame)
		{
			java.lang.System.out.println("Parameter value changed for " + rosParam.getName() + ", updating rossystem.");
			rosParam.setValue(p_val);
		}
	}
	
	public static void newRosParameter(RosNode rosNode, ros.Parameter originalParameter, ros.ParameterValue p_val) {
		boolean valueSame = originalParameter.getValue().equals(p_val);

		if(!valueSame)
		{
			java.lang.System.out.println("Adding parameter " + originalParameter.getName() + ", to rossystem.");
			system.RosParameter new_parameter = RossystemFactory.eINSTANCE.createRosParameter();
			new_parameter.setName(originalParameter.getName());
			new_parameter.setValue(p_val);
			new_parameter.setFrom(originalParameter);

			rosNode.getRosparameters().add(new_parameter);
		}
	}
	

	public static void newParameter(ros.Node node, String paramName, ros.ParameterValue p_val) {
		ros.Parameter new_parameter = RosFactory.eINSTANCE.createParameter();

		new_parameter.setName(paramName);
		new_parameter.setValue(p_val);
		new_parameter.setType((ParameterType) typeFromValue(p_val));

		node.getParameter().add(new_parameter);
	}
	
	public static ros.ParameterValue convertParameterValue(double value) {
	    return convertParameterValue((Object) Double.valueOf(value));
	}

	public static ros.ParameterValue convertParameterValue(boolean value) {
	    return convertParameterValue((Object) Boolean.valueOf(value));
	}

	public static ros.ParameterValue convertParameterValue(int value) {
	    return convertParameterValue((Object) Integer.valueOf(value));
	}

	public static ros.ParameterValue convertParameterValue(long value) {
	    return convertParameterValue((Object) Long.valueOf(value));
	}

	public static ros.ParameterValue convertParameterValue(String value) {
	    return convertParameterValue((Object) value);
	}

	
	private static ros.ParameterValue convertParameterValue(Object value) {
	    if (value instanceof Double d) {
	        ros.ParameterDouble param =
	                RosFactory.eINSTANCE.createParameterDouble();
	        param.setValue(d);
	        return param;

	    } else if (value instanceof String s) {
	        ros.ParameterString param =
	                RosFactory.eINSTANCE.createParameterString();
	        param.setValue(s);
	        return param;

	    } else if (value instanceof Boolean b) {
	        ros.ParameterBoolean param =
	                RosFactory.eINSTANCE.createParameterBoolean();
	        param.setValue(b);
	        return param;

	    } else if (value instanceof Integer || value instanceof Long) {
	        ros.ParameterInteger param =
	                RosFactory.eINSTANCE.createParameterInteger();
	        param.setValue(((Number) value).intValue());
	        return param;

	    } else if (value instanceof byte[] bytes) {
	        ros.ParameterBase64 param =
	                RosFactory.eINSTANCE.createParameterBase64();
	        param.setValue(bytes);
	        return param;

	    } else if (value instanceof List<?> list) {
	        ros.ParameterSequence sequence =
	                RosFactory.eINSTANCE.createParameterSequence();

	        for (Object item : list) {
	            sequence.getValue().add(convertParameterValue(item));
	        }

	        return sequence;

	    } else {
	        throw new IllegalArgumentException(
	                "Unsupported parameter value type: "
	                        + (value == null ? "null" : value.getClass().getName()));
	    }
	}

	public static RosNode nodeInRosSystems(String nodeName, List<Resource> rosSystemResources) {
		for (Resource resource : rosSystemResources) {
			System sys = (System) resource.getContents().get(0);
			for (system.Component component : sys.getComponents()) {
				if (!(component instanceof system.RosNode)) {
					continue;
				}
				system.RosNode ros_node = (system.RosNode) component;

				if (nodeName.replaceFirst("^/", "").equals(ros_node.getName().replaceFirst("^/", "")))
				{
					return ros_node;
				}
			}
		}
		return null;
	}


	public static Object valueOf(ros.ParameterValue param) {
		if (param instanceof ros.ParameterBoolean) {
			return ((ros.ParameterBoolean) param).isValue();
		} else if (param instanceof ros.ParameterInteger) {
			return ((ros.ParameterInteger) param).getValue();
		} else if (param instanceof ros.ParameterDouble) {
			return ((ros.ParameterDouble) param).getValue();
		} else if (param instanceof ros.ParameterString) {
			return ((ros.ParameterString) param).getValue();
		} else if (param instanceof ros.ParameterBase64) {
			return ((ros.ParameterBase64) param).getValue();
		} else if (param instanceof ros.ParameterSequence) {
			//Return list of valueOf of inside elements
			return ((ros.ParameterSequence) param).getValue().stream()
				.map(RosToolingSupport::valueOf)
				.toList();
		}
		else if (param == null) {
			return null;
		}
		throw new IllegalArgumentException("Unsupported parameter type: " + param.getClass().getName());
	}

	
	public static Object typeFromValue(ros.ParameterValue param) {
		if (param instanceof ros.ParameterBoolean) {
			return ros.ParameterBooleanType.class;
		} else if (param instanceof ros.ParameterInteger) {
			return ros.ParameterIntegerType.class;
		} else if (param instanceof ros.ParameterDouble) {
			return ros.ParameterDoubleType.class;
		} else if (param instanceof ros.ParameterString) {
			return ros.ParameterStringType.class;
		} else if (param instanceof ros.ParameterBase64) {
			return ros.ParameterBase64Type.class;
		} else if (param instanceof ros.ParameterSequence) {
			return ros.ParameterListType.class;
		}
		else if (param == null) {
			return null;
		}
		throw new IllegalArgumentException("Unsupported parameter type: " + param.getClass().getName());
	}
	public static LoadResult loadModel(ISetup setup, ResourceSet resSet, String fileExtension, String... filePaths) throws Exception {
		List<Resource> resources = new ArrayList<>();
		Injector injector = setup.createInjectorAndDoEMFRegistration();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put(fileExtension, injector.getInstance(XtextResourceFactory.class));
		

		for (String filePath : filePaths) {
			Path javaPath = Paths.get(filePath);
			if(Files.isDirectory(javaPath))
			{
				PathMatcher matcher = FileSystems.getDefault()
                    .getPathMatcher("glob:**/*" + fileExtension);

				List<Path> files = Files.walk(javaPath)
						.filter(matcher::matches)
						.toList();
				for(Path path : files)
				{
					Resource resource = resSet.createResource(URI.createFileURI(path.toRealPath().toString()));
					resources.add(resource);
				}
			}
			else
			{
			Resource resource = resSet.createResource(URI.createFileURI(filePath));
				resources.add(resource);
			}
		}

		for (Resource resource : resources) {
			resource.load(null);
			
			EObject root = resource.getContents().get(0);
			if (root != null) {
				validate(resource);
			} else {
				java.lang.System.out.println("Root is null for file: " + resource.getURI());
			}
		}
		
		return new LoadResult(injector, resources);
 	}

	public static void validate(Resource resource) throws RuntimeException
	{
		IResourceValidator validator = ((XtextResource) resource).getResourceServiceProvider().get(IResourceValidator.class);

		List<Issue> issues = validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);

		for (Issue issue : issues) {
			java.lang.System.out.println(issue.getSeverity() + ": " + issue.getMessage());
		}

		if(issues.size() > 0) {
			java.lang.System.out.println("Model has " + issues.size() + " issues.");
			//throw exception
			throw new RuntimeException("Model has " + issues.size() + " issues.");
		}
	}




}