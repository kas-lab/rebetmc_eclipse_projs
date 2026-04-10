package eu.coresense.common;

import java.util.ArrayList;
import java.util.HashMap;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class NameProvider {
  private final ArrayList<INameProvider> providers = new ArrayList<INameProvider>();

  private final NamingContext context = new NamingContext();

  private final HashMap<Object, String> objectNameCache = new HashMap<Object, String>();

  public boolean register(final INameProvider provider) {
    return this.providers.add(provider);
  }

  public String uniqueName(final Object obj, final String... args) {
    if ((obj == null)) {
      throw new IllegalArgumentException("obj is null");
    }
    boolean _containsKey = this.objectNameCache.containsKey(obj);
    if (_containsKey) {
      return this.objectNameCache.get(obj);
    }
    final Function1<INameProvider, Boolean> _function = (INameProvider it) -> {
      return Boolean.valueOf(it.canHandle(obj));
    };
    final INameProvider provider = IterableExtensions.<INameProvider>findFirst(this.providers, _function);
    if ((provider != null)) {
      final String name = provider.computeName(obj, this.context, args);
      this.objectNameCache.put(obj, name);
      return name;
    }
    Class<?> _class = obj.getClass();
    String _plus = ("No provider for " + _class);
    throw new IllegalArgumentException(_plus);
  }
}
