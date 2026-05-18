package eu.coresense.common;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class Utilities {
  public static Object valueOfLiteral(final Literal lit) {
    if ((lit instanceof IntLiteral)) {
      return Integer.valueOf(((IntLiteral)lit).getValue());
    }
    if ((lit instanceof DecimalLiteral)) {
      return ((DecimalLiteral)lit).getValue();
    }
    if ((lit instanceof StringLiteral)) {
      return ((StringLiteral)lit).getValue();
    }
    if ((lit instanceof BooleanLiteral)) {
      return Boolean.valueOf(((BooleanLiteral)lit).isValue());
    }
    return null;
  }

  public static <T extends Object> List<List<T>> getCartesianProduct(final List<List<T>> sets) {
    final List<List<T>> result = CollectionLiterals.<List<T>>newArrayList();
    Utilities.<T>getCartesianProductHelper(sets, 0, CollectionLiterals.<T>newArrayList(), result);
    return result;
  }

  public static <T extends Object> void getCartesianProductHelper(final List<List<T>> sets, final int index, final List<T> current, final List<List<T>> result) {
    int _size = sets.size();
    boolean _equals = (index == _size);
    if (_equals) {
      ArrayList<T> _arrayList = new ArrayList<T>(current);
      result.add(_arrayList);
      return;
    }
    final List<T> currentSet = sets.get(index);
    for (final T element : currentSet) {
      {
        current.add(element);
        Utilities.<T>getCartesianProductHelper(sets, (index + 1), current, result);
        int _size_1 = current.size();
        int _minus = (_size_1 - 1);
        current.remove(_minus);
      }
    }
  }

  public static <T extends Object> List<T> deriveFromImports(final Resource resource, final String fileSuffix, final List<Import> imports, final Class<T> clas) {
    final List<T> entities = CollectionLiterals.<T>newArrayList();
    for (final Import imp : imports) {
      boolean _endsWith = imp.getImportURI().endsWith(fileSuffix);
      if (_endsWith) {
        URI uri = URI.createURI(imp.getImportURI());
        boolean _isRelative = uri.isRelative();
        if (_isRelative) {
          uri = uri.resolve(resource.getURI());
        }
        final Resource imported = resource.getResourceSet().getResource(uri, true);
        if (((imported == null) || imported.getContents().isEmpty())) {
          InputOutput.<String>println("ResolutionModel import fail");
        }
        final EObject root = imported.getContents().get(0);
        boolean _isInstance = clas.isInstance(root);
        if (_isInstance) {
          entities.add(clas.cast(root));
        }
      }
    }
    return entities;
  }
}
