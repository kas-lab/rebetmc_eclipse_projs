package eu.coresense.context.PythonModel.importer;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import pythonfunctions.PythonModel.PythonFile;
import pythonfunctions.PythonModel.PythonFunction;
import pythonfunctions.PythonModel.PythonModelFactory;

public class PythonResource extends ResourceImpl {

    private static final Pattern FUNCTION_PATTERN = Pattern.compile("^\\s*def\\s+(\\w+)\\s*\\(", Pattern.MULTILINE);

	@Override
    protected void doLoad(InputStream inputStream, java.util.Map<?, ?> options) throws IOException {
        String content = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);

        PythonFile pyFile = PythonModelFactory.eINSTANCE.createPythonFile();
        Matcher m = FUNCTION_PATTERN.matcher(content);
        while (m.find()) {
            PythonFunction f = PythonModelFactory.eINSTANCE.createPythonFunction();
            f.setName(m.group(1));
            pyFile.getFunctions().add(f);
        }

        getContents().add(pyFile);
    }

    @Override
    protected void doSave(java.io.OutputStream outputStream, java.util.Map<?, ?> options) throws IOException {
        // optional: implement if you want to persist modified Python models
    }
}
