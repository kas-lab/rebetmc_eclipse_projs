package eu.coresense.resolution.generator;

import eu.coresense.common.INameProvider;
import eu.coresense.common.NamingContext;
import eu.coresense.resolution.resolutionModel.Reconfiguration;
import eu.coresense.resolution.resolutionModel.Resolution;
import eu.coresense.resolution.resolutionModel.SetLifecycle;
import eu.coresense.resolution.resolutionModel.SetParam;
import system.RosNode;

@SuppressWarnings("all")
public class ResolutionNameProvider implements INameProvider {
  @Override
  public boolean canHandle(final Object obj) {
    return ((((obj instanceof Resolution) || 
      (obj instanceof SetParam)) || 
      (obj instanceof SetLifecycle)) || 
      (obj instanceof Reconfiguration));
  }

  @Override
  public String computeName(final Object obj, final NamingContext ctx, final String... args) {
    String _switchResult = null;
    boolean _matched = false;
    if (obj instanceof Resolution) {
      _matched=true;
      String _lowerCase = ((Resolution)obj).getFeature().getName().toLowerCase();
      String _plus = (_lowerCase + "_resolution");
      _switchResult = ctx.makeUnique(_plus);
    }
    if (!_matched) {
      if (obj instanceof SetParam) {
        _matched=true;
        String _lowerCase = ((SetParam)obj).getParam().getName().toLowerCase();
        String _plus = ("sp_" + _lowerCase);
        _switchResult = ctx.makeUnique(_plus);
      }
    }
    if (!_matched) {
      if (obj instanceof SetLifecycle) {
        _matched=true;
        String _xblockexpression = null;
        {
          String _xifexpression = null;
          int _length = args.length;
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            _xifexpression = args[0];
          } else {
            _xifexpression = "noNodeNameGiven";
          }
          final String nodeName = _xifexpression;
          String _lowerCase = nodeName.toLowerCase();
          String _plus = ("slc_" + _lowerCase);
          String _plus_1 = (_plus + "_");
          String _lowerCase_1 = ((SetLifecycle)obj).getState().toString().toLowerCase();
          String _plus_2 = (_plus_1 + _lowerCase_1);
          _xblockexpression = ctx.makeUnique(_plus_2);
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (obj instanceof Reconfiguration) {
        _matched=true;
        final RosNode node = ((Reconfiguration)obj).getNode();
        if ((obj instanceof SetParam)) {
          return this.computeName(obj, ctx);
        } else {
          if ((obj instanceof SetLifecycle)) {
            return this.computeName(obj, ctx, node.getName());
          }
        }
      }
    }
    return _switchResult;
  }
}
