package eu.coresense.adaptation.generator;

import eu.coresense.adaptation.tactics.Condition;
import eu.coresense.adaptation.tactics.FeatureCondition;
import eu.coresense.adaptation.tactics.LogicalOperator;
import eu.coresense.adaptation.tactics.MeasurementCondition;
import eu.coresense.context.contextModel.ContextVar;
import eu.coresense.context.contextModel.DataSource;
import eu.coresense.context.contextModel.QualifiedActionServerRef;
import eu.coresense.context.contextModel.QualifiedPublisherRef;
import eu.coresense.context.contextModel.QualifiedRef;
import eu.coresense.context.contextModel.QualifiedServiceServerRef;
import eu.coresense.resolution.resolutionModel.Reconfiguration;
import eu.coresense.resolution.resolutionModel.Resolution;
import eu.coresense.resolution.resolutionModel.SetLifecycle;
import eu.coresense.resolution.resolutionModel.SetParam;
import java.util.Map;
import java.util.function.Function;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;
import ros.ActionClient;
import ros.ActionServer;
import ros.Node;
import ros.Parameter;
import ros.ParameterArrayType;
import ros.ParameterBoolean;
import ros.ParameterBooleanType;
import ros.ParameterDouble;
import ros.ParameterDoubleType;
import ros.ParameterInteger;
import ros.ParameterIntegerType;
import ros.ParameterSequence;
import ros.ParameterString;
import ros.ParameterStringType;
import ros.ParameterType;
import ros.ParameterValue;
import ros.Publisher;
import ros.QualityOfService;
import ros.ServiceClient;
import ros.ServiceServer;
import ros.Subscriber;
import system.RosNode;
import uma.caosd.rhea.BasicFMmetamodel.Alternative;
import uma.caosd.rhea.BasicFMmetamodel.Feature;
import uma.caosd.rhea.BasicFMmetamodel.OrGroup;

@SuppressWarnings("all")
public class Namer {
  private final Map<String, Integer> nameMap = CollectionLiterals.<String, Integer>newHashMap();

  private final Map<MeasurementCondition, String> measurementConditionNames = CollectionLiterals.<MeasurementCondition, String>newHashMap();

  private final Map<FeatureCondition, String> featureConditionNames = CollectionLiterals.<FeatureCondition, String>newHashMap();

  private final Map<Pair<String, String>, String> logicNames = CollectionLiterals.<Pair<String, String>, String>newHashMap();

  private final Map<SetParam, String> setparamNames = CollectionLiterals.<SetParam, String>newHashMap();

  private final Map<Resolution, String> resolutionNames = CollectionLiterals.<Resolution, String>newHashMap();

  private final Map<RosNode, String> rosnodeNames = CollectionLiterals.<RosNode, String>newHashMap();

  private final Map<Node, String> nodeNames = CollectionLiterals.<Node, String>newHashMap();

  private final Map<Parameter, String> paramNames = CollectionLiterals.<Parameter, String>newHashMap();

  private final Map<ParameterValue, String> paramvalNames = CollectionLiterals.<ParameterValue, String>newHashMap();

  private final Map<ParameterSequence, String> paramseqNames = CollectionLiterals.<ParameterSequence, String>newHashMap();

  private final Map<Feature, String> featureNames = CollectionLiterals.<Feature, String>newHashMap();

  private final Map<Alternative, String> altNames = CollectionLiterals.<Alternative, String>newHashMap();

  private final Map<OrGroup, String> orGroupNames = CollectionLiterals.<OrGroup, String>newHashMap();

  private final Map<SetLifecycle, String> setlcNames = CollectionLiterals.<SetLifecycle, String>newHashMap();

  private final Map<Subscriber, String> subNames = CollectionLiterals.<Subscriber, String>newHashMap();

  private final Map<Publisher, String> pubNames = CollectionLiterals.<Publisher, String>newHashMap();

  private final Map<ActionClient, String> acNames = CollectionLiterals.<ActionClient, String>newHashMap();

  private final Map<ActionServer, String> asNames = CollectionLiterals.<ActionServer, String>newHashMap();

  private final Map<ServiceClient, String> scNames = CollectionLiterals.<ServiceClient, String>newHashMap();

  private final Map<ServiceServer, String> ssNames = CollectionLiterals.<ServiceServer, String>newHashMap();

  private final Map<QualityOfService, String> qosNames = CollectionLiterals.<QualityOfService, String>newHashMap();

  private final Map<ContextVar, String> cvNames = CollectionLiterals.<ContextVar, String>newHashMap();

  private final Map<Expr, String> exprNames = CollectionLiterals.<Expr, String>newHashMap();

  public String makeUniqueName(final String baseName) {
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

  public String uniqueName(final MeasurementCondition condition) {
    final Function<MeasurementCondition, String> _function = (MeasurementCondition it) -> {
      String _lowerCase = condition.getMeasurement().getName().toLowerCase();
      String _plus = (_lowerCase + "_");
      String _lowerCase_1 = condition.getOperator().getName().toLowerCase();
      String _plus_1 = (_plus + _lowerCase_1);
      return this.makeUniqueName(_plus_1);
    };
    return this.measurementConditionNames.computeIfAbsent(condition, _function);
  }

  public String uniqueName(final FeatureCondition condition) {
    final Function<FeatureCondition, String> _function = (FeatureCondition it) -> {
      String _uniqueName = this.uniqueName(condition.getVariant().getFeature());
      String _plus = ("is_selected_" + _uniqueName);
      return this.makeUniqueName(_plus);
    };
    return this.featureConditionNames.computeIfAbsent(condition, _function);
  }

  public String uniqueName(final ContextVar contextVariable) {
    final Function<ContextVar, String> _function = (ContextVar it) -> {
      String _lowerCase = contextVariable.getName().toLowerCase();
      String _plus = ("t_measured_" + _lowerCase);
      return this.makeUniqueName(_plus);
    };
    return this.cvNames.computeIfAbsent(contextVariable, _function);
  }

  public String uniqueName(final Condition condition) {
    boolean _matched = false;
    if (condition instanceof MeasurementCondition) {
      _matched=true;
      return this.uniqueName(((MeasurementCondition)condition));
    }
    if (!_matched) {
      if (condition instanceof FeatureCondition) {
        _matched=true;
        return this.uniqueName(((FeatureCondition)condition));
      }
    }
    return null;
  }

  public String uniqueName(final LogicalOperator logicalOp, final String lhs_name, final String rhs_name) {
    String _xblockexpression = null;
    {
      final String lhs_short_name = lhs_name.substring(0, Math.min(3, lhs_name.length()));
      final String rhs_short_name = rhs_name.substring(0, Math.min(3, rhs_name.length()));
      final Pair<String, String> key = Pair.<String, String>of(lhs_name, rhs_name);
      final Function<Pair<String, String>, String> _function = (Pair<String, String> it) -> {
        String _lowerCase = logicalOp.getLiteral().toLowerCase();
        String _plus = (_lowerCase + "_");
        String _plus_1 = (_plus + lhs_short_name);
        String _plus_2 = (_plus_1 + "_");
        String _plus_3 = (_plus_2 + rhs_short_name);
        return this.makeUniqueName(_plus_3);
      };
      _xblockexpression = this.logicNames.computeIfAbsent(key, _function);
    }
    return _xblockexpression;
  }

  public String uniqueName(final Reconfiguration reconf) {
    if ((reconf instanceof SetParam)) {
      return this.uniqueName(((SetParam)reconf));
    } else {
      if ((reconf instanceof SetLifecycle)) {
        return this.uniqueName(((SetLifecycle)reconf));
      }
    }
    return "shouldn\'t happen";
  }

  public String uniqueName(final DataSource dataSource, final String nodeName) {
    final QualifiedRef ref = dataSource.getRef();
    if ((ref instanceof QualifiedActionServerRef)) {
      return this.uniqueName(((QualifiedActionServerRef)ref).getActionServer(), nodeName);
    }
    if ((ref instanceof QualifiedPublisherRef)) {
      return this.uniqueName(((QualifiedPublisherRef)ref).getPublisher(), nodeName);
    }
    if ((ref instanceof QualifiedServiceServerRef)) {
      return this.uniqueName(((QualifiedServiceServerRef)ref).getServiceServer(), nodeName);
    }
    return null;
  }

  public String uniqueName(final Expr e) {
    final Function<Expr, String> _function = (Expr it) -> {
      return this.makeUniqueName("expr_");
    };
    return this.exprNames.computeIfAbsent(e, _function);
  }

  public String uniqueName(final Subscriber subscriber, final String node_name) {
    final Function<Subscriber, String> _function = (Subscriber it) -> {
      return this.makeUniqueName((node_name + "_sub"));
    };
    return this.subNames.computeIfAbsent(subscriber, _function);
  }

  public String uniqueName(final Publisher publisher, final String node_name) {
    final Function<Publisher, String> _function = (Publisher it) -> {
      return this.makeUniqueName((node_name + "_pub"));
    };
    return this.pubNames.computeIfAbsent(publisher, _function);
  }

  public String uniqueName(final ActionClient actionClient, final String node_name) {
    final Function<ActionClient, String> _function = (ActionClient it) -> {
      return this.makeUniqueName((node_name + "_action_client"));
    };
    return this.acNames.computeIfAbsent(actionClient, _function);
  }

  public String uniqueName(final ActionServer actionServer, final String node_name) {
    final Function<ActionServer, String> _function = (ActionServer it) -> {
      return this.makeUniqueName((node_name + "_action_server"));
    };
    return this.asNames.computeIfAbsent(actionServer, _function);
  }

  public String uniqueName(final ServiceClient serviceClient, final String node_name) {
    final Function<ServiceClient, String> _function = (ServiceClient it) -> {
      return this.makeUniqueName((node_name + "_service_client"));
    };
    return this.scNames.computeIfAbsent(serviceClient, _function);
  }

  public String uniqueName(final ServiceServer serviceServer, final String node_name) {
    final Function<ServiceServer, String> _function = (ServiceServer it) -> {
      return this.makeUniqueName((node_name + "_service_server"));
    };
    return this.ssNames.computeIfAbsent(serviceServer, _function);
  }

  public String uniqueName(final SetLifecycle setl) {
    final Function<SetLifecycle, String> _function = (SetLifecycle it) -> {
      String _lowerCase = setl.getNode().getName().toLowerCase();
      String _plus = ("slc_" + _lowerCase);
      String _plus_1 = (_plus + "_");
      String _lowerCase_1 = setl.getState().toString().toLowerCase();
      String _plus_2 = (_plus_1 + _lowerCase_1);
      return this.makeUniqueName(_plus_2);
    };
    return this.setlcNames.computeIfAbsent(setl, _function);
  }

  public String uniqueName(final SetParam setp) {
    final Function<SetParam, String> _function = (SetParam it) -> {
      String _lowerCase = setp.getParam().getName().toLowerCase();
      String _plus = ("sp_" + _lowerCase);
      return this.makeUniqueName(_plus);
    };
    return this.setparamNames.computeIfAbsent(setp, _function);
  }

  public String uniqueName(final Resolution res) {
    final Function<Resolution, String> _function = (Resolution it) -> {
      String _lowerCase = res.getFeature().getName().toLowerCase();
      String _plus = (_lowerCase + "_resolution");
      return this.makeUniqueName(_plus);
    };
    return this.resolutionNames.computeIfAbsent(res, _function);
  }

  public String uniqueName(final RosNode node) {
    final Function<RosNode, String> _function = (RosNode it) -> {
      String _replace = node.getName().replace("/", "");
      String _plus = (_replace + "_node");
      return this.makeUniqueName(_plus);
    };
    return this.rosnodeNames.computeIfAbsent(node, _function);
  }

  public String uniqueName(final QualityOfService qos, final String interface_name) {
    final Function<QualityOfService, String> _function = (QualityOfService it) -> {
      return this.makeUniqueName((interface_name + "_qos"));
    };
    return this.qosNames.computeIfAbsent(qos, _function);
  }

  public String uniqueName(final Node node) {
    final Function<Node, String> _function = (Node it) -> {
      String _replace = node.getName().replace("/", "");
      String _plus = (_replace + "_node");
      return this.makeUniqueName(_plus);
    };
    return this.nodeNames.computeIfAbsent(node, _function);
  }

  public String uniqueName(final ParameterValue p_value, final String parent_identifier) {
    final Function<ParameterValue, String> _function = (ParameterValue it) -> {
      return this.makeUniqueName((parent_identifier + "_pvalue"));
    };
    return this.paramvalNames.computeIfAbsent(p_value, _function);
  }

  public String uniqueName(final ParameterSequence p_seq, final String parent_name) {
    final Function<ParameterSequence, String> _function = (ParameterSequence it) -> {
      return this.makeUniqueName((parent_name + "_p_array_value"));
    };
    return this.paramseqNames.computeIfAbsent(p_seq, _function);
  }

  public String uniqueName(final Feature feat) {
    final Function<Feature, String> _function = (Feature it) -> {
      String _lowerCase = feat.getName().toLowerCase();
      String _plus = ("f_" + _lowerCase);
      return this.makeUniqueName(_plus);
    };
    return this.featureNames.computeIfAbsent(feat, _function);
  }

  public String UniqueName(final Alternative alt) {
    final Function<Alternative, String> _function = (Alternative it) -> {
      String _UniqueName = this.UniqueName(alt);
      String _plus = ("alt_" + _UniqueName);
      return this.makeUniqueName(_plus);
    };
    return this.altNames.computeIfAbsent(alt, _function);
  }

  public String UniqueName(final OrGroup or_grp) {
    final Function<OrGroup, String> _function = (OrGroup it) -> {
      String _UniqueName = this.UniqueName(or_grp);
      String _plus = ("or_group_" + _UniqueName);
      return this.makeUniqueName(_plus);
    };
    return this.orGroupNames.computeIfAbsent(or_grp, _function);
  }

  public String uniqueName(final Parameter parameter) {
    final Function<Parameter, String> _function = (Parameter it) -> {
      String _replace = parameter.getName().replace(".", "_").replace("/", "");
      String _plus = (_replace + "_param");
      return this.makeUniqueName(_plus);
    };
    return this.paramNames.computeIfAbsent(parameter, _function);
  }

  public String SchemaValueFromParam(final ParameterValue param_value) {
    String _switchResult = null;
    boolean _matched = false;
    if (param_value instanceof ParameterBoolean) {
      _matched=true;
      _switchResult = "ValueBool";
    }
    if (!_matched) {
      if (param_value instanceof ParameterDouble) {
        _matched=true;
        _switchResult = "ValueDouble";
      }
    }
    if (!_matched) {
      if (param_value instanceof ParameterString) {
        _matched=true;
        _switchResult = "ValueString";
      }
    }
    if (!_matched) {
      if (param_value instanceof ParameterInteger) {
        _matched=true;
        _switchResult = "ValueInteger";
      }
    }
    if (!_matched) {
      if (param_value instanceof ParameterSequence) {
        _matched=true;
        _switchResult = "ValueArray";
      }
    }
    if (!_matched) {
      _switchResult = param_value.getClass().toString();
    }
    return _switchResult;
  }

  public String SchemaValueFromParam(final ParameterType param_type) {
    String _switchResult = null;
    boolean _matched = false;
    if (param_type instanceof ParameterBooleanType) {
      _matched=true;
      _switchResult = "ValueBool";
    }
    if (!_matched) {
      if (param_type instanceof ParameterDoubleType) {
        _matched=true;
        _switchResult = "ValueDouble";
      }
    }
    if (!_matched) {
      if (param_type instanceof ParameterStringType) {
        _matched=true;
        _switchResult = "ValueString";
      }
    }
    if (!_matched) {
      if (param_type instanceof ParameterIntegerType) {
        _matched=true;
        _switchResult = "ValueInteger";
      }
    }
    if (!_matched) {
      if (param_type instanceof ParameterArrayType) {
        _matched=true;
        _switchResult = "ValueArray";
      }
    }
    if (!_matched) {
      _switchResult = param_type.getClass().toString();
    }
    return _switchResult;
  }

  public String paramSubClass(final ParameterValue param_value) {
    String _switchResult = null;
    boolean _matched = false;
    if (param_value instanceof ParameterBoolean) {
      _matched=true;
      _switchResult = "ParameterBool";
    }
    if (!_matched) {
      if (param_value instanceof ParameterDouble) {
        _matched=true;
        _switchResult = "ParameterDouble";
      }
    }
    if (!_matched) {
      if (param_value instanceof ParameterString) {
        _matched=true;
        _switchResult = "ParameterString";
      }
    }
    if (!_matched) {
      if (param_value instanceof ParameterInteger) {
        _matched=true;
        _switchResult = "ParameterInteger";
      }
    }
    if (!_matched) {
      if (param_value instanceof ParameterSequence) {
        _matched=true;
        String _SchemaValueFromParam = this.SchemaValueFromParam(((ParameterSequence)param_value).getValue().get(0));
        String _plus = ("Parameter" + _SchemaValueFromParam);
        _switchResult = (_plus + "Array");
      }
    }
    return _switchResult;
  }

  public String paramSubClass(final ParameterType param_type) {
    String _switchResult = null;
    boolean _matched = false;
    if (param_type instanceof ParameterBooleanType) {
      _matched=true;
      _switchResult = "ParameterBool";
    }
    if (!_matched) {
      if (param_type instanceof ParameterDoubleType) {
        _matched=true;
        _switchResult = "ParameterDouble";
      }
    }
    if (!_matched) {
      if (param_type instanceof ParameterStringType) {
        _matched=true;
        _switchResult = "ParameterString";
      }
    }
    if (!_matched) {
      if (param_type instanceof ParameterIntegerType) {
        _matched=true;
        _switchResult = "ParameterInteger";
      }
    }
    if (!_matched) {
      if (param_type instanceof ParameterArrayType) {
        _matched=true;
        String _paramSubClass = this.paramSubClass(((ParameterArrayType)param_type).getType());
        _switchResult = (_paramSubClass + "Array");
      }
    }
    return _switchResult;
  }

  public String NiceNameParamValueType(final ParameterValue param_value) {
    String _switchResult = null;
    boolean _matched = false;
    if (param_value instanceof ParameterBoolean) {
      _matched=true;
      _switchResult = "bool";
    }
    if (!_matched) {
      if (param_value instanceof ParameterDouble) {
        _matched=true;
        _switchResult = "double";
      }
    }
    if (!_matched) {
      if (param_value instanceof ParameterString) {
        _matched=true;
        _switchResult = "string";
      }
    }
    if (!_matched) {
      if (param_value instanceof ParameterInteger) {
        _matched=true;
        _switchResult = "integer";
      }
    }
    return _switchResult;
  }

  public String NiceNameParamType(final ParameterType param_type) {
    String _switchResult = null;
    boolean _matched = false;
    if (param_type instanceof ParameterBooleanType) {
      _matched=true;
      _switchResult = "boolean";
    }
    if (!_matched) {
      if (param_type instanceof ParameterDoubleType) {
        _matched=true;
        _switchResult = "double";
      }
    }
    if (!_matched) {
      if (param_type instanceof ParameterStringType) {
        _matched=true;
        _switchResult = "string";
      }
    }
    if (!_matched) {
      if (param_type instanceof ParameterArrayType) {
        _matched=true;
        String _NiceNameParamType = this.NiceNameParamType(((ParameterArrayType)param_type).getType());
        _switchResult = (_NiceNameParamType + "_array");
      }
    }
    return _switchResult;
  }
}
