package eu.coresense.common;

@SuppressWarnings("all")
public interface INameProvider {
  boolean canHandle(final Object obj);

  String computeName(final Object obj, final NamingContext ctx, final String... args);
}
