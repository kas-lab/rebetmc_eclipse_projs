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
import ros.RosPackage;
import eu.coresense.adaptation.tactics.TacticsPackage;
import eu.coresense.requirements.requirementsModel.RequirementsModelPackage;	


public class RosToolingSupport {

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

	public static RosNode nodeInRosSystems(String nodeName, List<Resource> rosSystemResources) {
		for (Resource resource : rosSystemResources) {
			System sys = (System) resource.getContents().get(0);
			for (system.Component component : sys.getComponents()) {
				if (!(component instanceof system.RosNode)) {
					continue;
				}
				system.RosNode ros_node = (system.RosNode) component;

				if (nodeName.equals(ros_node.getName()))
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

	public static List<Resource> loadModel(ISetup setup, ResourceSet resSet, String fileExtension, String... filePaths) throws Exception {
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
				java.lang.System.out.println("Loaded model with root of type: " + root.getClass().getName() + " from file: " + resource.getURI());
				validate(resource);
			} else {
				java.lang.System.out.println("Root is null for file: " + resource.getURI());
			}
		}
		
		java.lang.System.out.println("-----Loaded " + resources.size() + " ." + fileExtension + " files-----\n\n");
		return resources;
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