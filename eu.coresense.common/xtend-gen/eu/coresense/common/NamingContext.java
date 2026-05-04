package eu.coresense.common;

import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class NamingContext {
  private final Map<String, Integer> nameMap = CollectionLiterals.<String, Integer>newHashMap();

  public String makeUnique(final String baseName) {
    String _xblockexpression = null;
    {
      Integer _elvis = null;
      Integer _get = this.nameMap.get(baseName);
      if (_get != null) {
        _elvis = _get;
      } else {
        _elvis = Integer.valueOf(0);
      }
      final Integer count = _elvis;
      String _xifexpression = null;
      if (((count).intValue() == 0)) {
        _xifexpression = baseName;
      } else {
        _xifexpression = ((baseName + "_") + count);
      }
      final String newName = _xifexpression;
      this.nameMap.put(baseName, Integer.valueOf(((count).intValue() + 1)));
      _xblockexpression = newName;
    }
    return _xblockexpression;
  }
}
