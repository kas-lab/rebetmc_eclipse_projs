package eu.coresense.common;

import ros.ActionClient;
import ros.ActionServer;
import ros.Node;
import ros.Parameter;
import ros.ParameterSequence;
import ros.ParameterValue;
import ros.Publisher;
import ros.QualityOfService;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.Subscriber;

@SuppressWarnings("all")
public class RosNameProvider implements INameProvider {
  @Override
  public boolean canHandle(final Object obj) {
    return (((((((((((obj instanceof Subscriber) || 
      (obj instanceof Publisher)) || 
      (obj instanceof ActionClient)) || 
      (obj instanceof ActionServer)) || 
      (obj instanceof ServiceClient)) || 
      (obj instanceof ServiceServer)) || 
      (obj instanceof QualityOfService)) || 
      (obj instanceof Node)) || 
      (obj instanceof Parameter)) || 
      (obj instanceof ParameterValue)) || 
      (obj instanceof ParameterSequence));
  }

  @Override
  public String computeName(final Object obj, final NamingContext ctx, final String... args) {
    String _switchResult = null;
    boolean _matched = false;
    if (obj instanceof Subscriber) {
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
        _xblockexpression = ctx.makeUnique((nodeName + "_sub"));
      }
      _switchResult = _xblockexpression;
    }
    if (!_matched) {
      if (obj instanceof Publisher) {
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
          _xblockexpression = ctx.makeUnique((nodeName + "pub"));
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (obj instanceof ActionClient) {
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
          _xblockexpression = ctx.makeUnique((nodeName + "_action_client"));
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (obj instanceof ActionServer) {
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
          _xblockexpression = ctx.makeUnique((nodeName + "_action_server"));
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (obj instanceof ServiceClient) {
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
          _xblockexpression = ctx.makeUnique((nodeName + "_service_client"));
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (obj instanceof ServiceServer) {
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
          _xblockexpression = ctx.makeUnique((nodeName + "_service_server"));
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (obj instanceof QualityOfService) {
        _matched=true;
        String _xblockexpression = null;
        {
          String _xifexpression = null;
          int _length = args.length;
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            _xifexpression = args[0];
          } else {
            _xifexpression = "noInterfaceNameGiven";
          }
          final String interfaceName = _xifexpression;
          _xblockexpression = ctx.makeUnique((interfaceName + "_qos"));
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (obj instanceof ParameterSequence) {
        _matched=true;
        String _xblockexpression = null;
        {
          String _xifexpression = null;
          int _length = args.length;
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            _xifexpression = args[0];
          } else {
            _xifexpression = "noParentIDGiven";
          }
          final String parentID = _xifexpression;
          _xblockexpression = ctx.makeUnique((parentID + "_p_array_value"));
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (obj instanceof ParameterValue) {
        _matched=true;
        String _xblockexpression = null;
        {
          String _xifexpression = null;
          int _length = args.length;
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            _xifexpression = args[0];
          } else {
            _xifexpression = "noParentIDGiven";
          }
          final String parentID = _xifexpression;
          _xblockexpression = ctx.makeUnique((parentID + "_pvalue"));
        }
        _switchResult = _xblockexpression;
      }
    }
    if (!_matched) {
      if (obj instanceof Node) {
        _matched=true;
        String _replace = ((Node)obj).getName().replace("/", "");
        String _plus = (_replace + "_node");
        _switchResult = ctx.makeUnique(_plus);
      }
    }
    if (!_matched) {
      if (obj instanceof Parameter) {
        _matched=true;
        String _replace = ((Parameter)obj).getName().replace(".", "_").replace("/", "");
        String _plus = (_replace + "_param");
        _switchResult = ctx.makeUnique(_plus);
      }
    }
    return _switchResult;
  }
}
