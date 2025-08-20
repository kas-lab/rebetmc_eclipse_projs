package eu.coresense.context.PythonModel.importer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import eu.coresense.context.PythonModel.*;
import pythonfunctions.PythonModel.PythonFile;
import pythonfunctions.PythonModel.PythonFunction;
import pythonfunctions.PythonModel.PythonModelFactory;

public class PythonModelImporter {
	
	 private static final Pattern FUNCTION_PATTERN = Pattern.compile("^\\s*def\\s+(\\w+)\\s*\\(", Pattern.MULTILINE);
	 
	 
	    public PythonFile parseUriToModel(URI pyUri, ResourceSet rs) throws IOException {
	        URI normalized = rs.getURIConverter().normalize(pyUri);
	        String content;
	        try (InputStream in = rs.getURIConverter().createInputStream(normalized)) {
	            content = new String(in.readAllBytes(), StandardCharsets.UTF_8);
	        }

	        PythonFile pyFile = PythonModelFactory.eINSTANCE.createPythonFile();
	        Matcher m = FUNCTION_PATTERN.matcher(content);
	        while (m.find()) {
	            String name = m.group(1);
	            PythonFunction f = PythonModelFactory.eINSTANCE.createPythonFunction();
	            f.setName(name);
	            pyFile.getFunctions().add(f);
	        }
	        return pyFile;
	    }

	    public Resource parseUriToResource(URI pyUri, ResourceSet rs) throws IOException {
	        URI mem = URI.createURI("memory:/py/" + pyUri.lastSegment() + ".pythonmodel");

	        // If it already exists, just return it
	        Resource existing = rs.getResource(mem, false);
	        if (existing != null) {
	            return existing;
	        }

	        PythonFile pyFile = parseUriToModel(pyUri, rs);
	        Resource r = rs.createResource(mem);
	        r.getContents().add(pyFile);
	        return r;
	    }
}
