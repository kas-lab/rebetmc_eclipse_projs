package eu.coresense.context.generator;

import eu.coresense.common.INameProvider;
import eu.coresense.common.NameProvider;
import eu.coresense.common.NamingContext;
import eu.coresense.context.contextModel.ContextVar;
import eu.coresense.context.contextModel.DataSource;
import eu.coresense.context.contextModel.QualifiedActionServerRef;
import eu.coresense.context.contextModel.QualifiedPublisherRef;
import eu.coresense.context.contextModel.QualifiedRef;
import eu.coresense.context.contextModel.QualifiedServiceServerRef;

@SuppressWarnings("all")
public class ContextNameProvider implements INameProvider {
  private final NameProvider nameProvider;

  public ContextNameProvider(final NameProvider nameProvider) {
    this.nameProvider = nameProvider;
  }

  @Override
  public boolean canHandle(final Object obj) {
    return ((obj instanceof ContextVar) || 
      (obj instanceof DataSource));
  }

  @Override
  public String computeName(final Object obj, final NamingContext ctx, final String... args) {
    String _switchResult = null;
    boolean _matched = false;
    if (obj instanceof ContextVar) {
      _matched=true;
      String _lowerCase = ((ContextVar)obj).getName().toLowerCase();
      String _plus = ("t_measured_" + _lowerCase);
      _switchResult = ctx.makeUnique(_plus);
    }
    if (!_matched) {
      if (obj instanceof DataSource) {
        _matched=true;
        String _xifexpression = null;
        int _length = args.length;
        boolean _greaterThan = (_length > 0);
        if (_greaterThan) {
          _xifexpression = args[0];
        } else {
          _xifexpression = "noNodeNameGiven";
        }
        final String nodeName = _xifexpression;
        final QualifiedRef ref = ((DataSource)obj).getRef();
        if ((ref instanceof QualifiedActionServerRef)) {
          return this.nameProvider.uniqueName(((QualifiedActionServerRef)ref).getActionServer(), nodeName);
        }
        if ((ref instanceof QualifiedPublisherRef)) {
          return this.nameProvider.uniqueName(((QualifiedPublisherRef)ref).getPublisher(), nodeName);
        }
        if ((ref instanceof QualifiedServiceServerRef)) {
          return this.nameProvider.uniqueName(((QualifiedServiceServerRef)ref).getServiceServer(), nodeName);
        }
        return "else";
      }
    }
    return _switchResult;
  }
}
