package eu.coresense.common;

import com.google.inject.Inject;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.lib.XbaseGenerated;
import ros.ActionClient;
import ros.ActionServer;
import ros.InterfaceType;
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
import system.Component;
import system.InterfaceReference;
import system.RosActionClientReference;
import system.RosActionServerReference;
import system.RosInterface;
import system.RosNode;
import system.RosParameter;
import system.RosPublisherReference;
import system.RosServiceClientReference;
import system.RosServiceServerReference;
import system.RosSubscriberReference;
import system.SubSystem;

@SuppressWarnings("all")
public class ArchitectureTQLGenerator extends AbstractGenerator {
  @Extension
  private NameProvider _namer;

  @Inject
  public ArchitectureTQLGenerator(final NameProvider namer) {
    this._namer = namer;
  }

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }

  public String getInterfaceName(final InterfaceType interface_, final RosNode node) {
    String interfaceName = interface_.getName();
    EList<RosInterface> _rosinterfaces = node.getRosinterfaces();
    for (final RosInterface interface__1 : _rosinterfaces) {
      {
        final InterfaceReference reference = interface__1.getReference();
        if ((reference instanceof RosSubscriberReference)) {
          Subscriber _from = ((RosSubscriberReference)reference).getFrom();
          boolean _tripleEquals = (_from == interface_);
          if (_tripleEquals) {
            interfaceName = interface__1.getName();
          }
        }
        if ((reference instanceof RosPublisherReference)) {
          Publisher _from_1 = ((RosPublisherReference)reference).getFrom();
          boolean _tripleEquals_1 = (_from_1 == interface_);
          if (_tripleEquals_1) {
            interfaceName = interface__1.getName();
          }
        }
        if ((reference instanceof RosActionClientReference)) {
          ActionClient _from_2 = ((RosActionClientReference)reference).getFrom();
          boolean _tripleEquals_2 = (_from_2 == interface_);
          if (_tripleEquals_2) {
            interfaceName = interface__1.getName();
          }
        }
        if ((reference instanceof RosActionServerReference)) {
          ActionServer _from_3 = ((RosActionServerReference)reference).getFrom();
          boolean _tripleEquals_3 = (_from_3 == interface_);
          if (_tripleEquals_3) {
            interfaceName = interface__1.getName();
          }
        }
        if ((reference instanceof RosServiceServerReference)) {
          ServiceServer _from_4 = ((RosServiceServerReference)reference).getFrom();
          boolean _tripleEquals_4 = (_from_4 == interface_);
          if (_tripleEquals_4) {
            interfaceName = interface__1.getName();
          }
        }
        if ((reference instanceof RosServiceClientReference)) {
          ServiceClient _from_5 = ((RosServiceClientReference)reference).getFrom();
          boolean _tripleEquals_5 = (_from_5 == interface_);
          if (_tripleEquals_5) {
            interfaceName = interface__1.getName();
          }
        }
      }
    }
    return interfaceName;
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

  protected String _ParamValueToString(final ParameterSequence p) {
    final Function1<ParameterValue, String> _function = (ParameterValue it) -> {
      return this.ParamValueToString(it);
    };
    final List<String> parts = ListExtensions.<ParameterValue, String>map(p.getValue(), _function);
    String _join = IterableExtensions.join(parts, ", ");
    String _plus = ("[" + _join);
    return (_plus + "]");
  }

  protected String _ParamValueToString(final ParameterBoolean p) {
    return Boolean.valueOf(p.isValue()).toString();
  }

  protected String _ParamValueToString(final ParameterInteger p) {
    return p.getValue().toString();
  }

  protected String _ParamValueToString(final ParameterDouble p) {
    return this.doubleToTQLDouble(p.getValue());
  }

  public String doubleToTQLDouble(final double d) {
    String _xblockexpression = null;
    {
      final DecimalFormat format = new DecimalFormat("0.0############################");
      format.setMaximumFractionDigits(30);
      _xblockexpression = format.format(d).toString();
    }
    return _xblockexpression;
  }

  protected String _ParamValueToString(final ParameterString p) {
    return p.getValue();
  }

  protected String _ParamValueToString(final ParameterValue p) {
    String _name = p.getClass().getName();
    String _plus = ("Unknown parameter type: " + _name);
    InputOutput.<String>println(_plus);
    return "ValueTypeNotYetImplementedInGenerator";
  }

  public CharSequence describeParameter(final String name, final ParameterValue the_value) {
    CharSequence _xblockexpression = null;
    {
      final String paramValNiceName = this.NiceNameParamValueType(the_value);
      CharSequence _xifexpression = null;
      boolean _equals = Objects.equals(paramValNiceName, "string");
      if (_equals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("$");
        _builder.append(name);
        _builder.append(" isa ");
        String _SchemaValueFromParam = this.SchemaValueFromParam(the_value);
        _builder.append(_SchemaValueFromParam);
        _builder.append(", has ");
        String _NiceNameParamValueType = this.NiceNameParamValueType(the_value);
        _builder.append(_NiceNameParamValueType);
        _builder.append("_value \"");
        String _ParamValueToString = this.ParamValueToString(the_value);
        _builder.append(_ParamValueToString);
        _builder.append("\";\t");
        _builder.newLineIfNotEmpty();
        _xifexpression = _builder;
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("$");
        _builder_1.append(name);
        _builder_1.append(" isa ");
        String _SchemaValueFromParam_1 = this.SchemaValueFromParam(the_value);
        _builder_1.append(_SchemaValueFromParam_1);
        _builder_1.append(", has ");
        String _NiceNameParamValueType_1 = this.NiceNameParamValueType(the_value);
        _builder_1.append(_NiceNameParamValueType_1);
        _builder_1.append("_value ");
        String _ParamValueToString_1 = this.ParamValueToString(the_value);
        _builder_1.append(_ParamValueToString_1);
        _builder_1.append(";\t");
        _builder_1.newLineIfNotEmpty();
        _xifexpression = _builder_1;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }

  public CharSequence describeParameter(final String name, final Parameter param) {
    CharSequence _xblockexpression = null;
    {
      ParameterValue _value = param.getValue();
      boolean _tripleNotEquals = (_value != null);
      if (_tripleNotEquals) {
        this.describeParameter(name, param.getValue());
      }
      final ParameterType the_type = param.getType();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("$");
      _builder.append(name);
      _builder.append(" isa ");
      String _SchemaValueFromParam = this.SchemaValueFromParam(the_type);
      _builder.append(_SchemaValueFromParam);
      _builder.append(";\t");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }

  public String generateArchitectureInsertQuery(final system.System rossystem, final Boolean includeInsert) {
    StringConcatenation _builder = new StringConcatenation();
    {
      if ((includeInsert).booleanValue()) {
        _builder.append("insert");
        _builder.newLine();
      }
    }
    _builder.newLine();
    {
      List<system.System> _collectAllSystems = this.collectAllSystems(rossystem);
      for(final system.System rossys : _collectAllSystems) {
        final List<RosNode> nodesList = this.rosNodesFromSystem(rossys);
        _builder.newLineIfNotEmpty();
        {
          for(final RosNode comp : nodesList) {
            String _generateInsertQuery = this.generateInsertQuery(comp);
            _builder.append(_generateInsertQuery);
            _builder.newLineIfNotEmpty();
          }
        }
        String _processSubNodes = this.processSubNodes(nodesList);
        _builder.append(_processSubNodes);
        _builder.newLineIfNotEmpty();
        _builder.newLine();
      }
    }
    return _builder.toString();
  }

  public String generateArchitectureInsertQuery(final system.System rossystem) {
    return this.generateArchitectureInsertQuery(rossystem, Boolean.valueOf(true));
  }

  public String describeNode(final Node node, final String namespace) {
    String _xblockexpression = null;
    {
      final EList<ServiceServer> serviceServers = node.getServiceserver();
      final Function1<ServiceServer, Boolean> _function = (ServiceServer server) -> {
        String _fullname = server.getService().getFullname();
        return Boolean.valueOf(Objects.equals(_fullname, "lifecycle_msgs/ChangeState"));
      };
      final boolean isLifecycle = IterableExtensions.<ServiceServer>exists(serviceServers, _function);
      String _xifexpression = null;
      if (isLifecycle) {
        _xifexpression = "LifeCycleNode";
      } else {
        _xifexpression = "ROSNode";
      }
      final String node_kind = _xifexpression;
      final String nodeName = this._namer.uniqueName(node);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("$");
      _builder.append(nodeName);
      _builder.append(" isa ");
      _builder.append(node_kind);
      _builder.append(",");
      _builder.newLineIfNotEmpty();
      _builder.append("has node_name \"");
      String _name = node.getName();
      _builder.append(_name);
      _builder.append("\",");
      _builder.newLineIfNotEmpty();
      _builder.append("has namespace \"");
      _builder.append(namespace);
      _builder.append("\";");
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  public List<Parameter> getParameters(final RosNode node) {
    final EList<Parameter> originalParameters = node.getFrom().getParameter();
    EList<RosParameter> _rosparameters = node.getRosparameters();
    for (final RosParameter parameter_override : _rosparameters) {
      {
        final int indexOverride = originalParameters.indexOf(parameter_override.getFrom());
        Parameter _get = originalParameters.get(indexOverride);
        _get.setValue(parameter_override.getValue());
      }
    }
    return originalParameters;
  }

  public Pair<CharSequence, String> ParamValueToValueEntity(final Parameter the_parameter, final String parent_name) {
    final ParameterValue the_value = the_parameter.getValue();
    if ((the_value instanceof ParameterSequence)) {
      final ArrayList<String> result = CollectionLiterals.<String>newArrayList();
      final String parseq_name = this._namer.uniqueName(the_value, parent_name);
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("$");
      _builder.append(parseq_name);
      _builder.append(" isa ValueArray;");
      _builder.newLineIfNotEmpty();
      {
        Iterable<Pair<Integer, ParameterValue>> _indexed = IterableExtensions.<ParameterValue>indexed(((ParameterSequence)the_value).getValue());
        for(final Pair<Integer, ParameterValue> param_value : _indexed) {
          CharSequence _describeParameter = this.describeParameter(this._namer.uniqueName(param_value.getValue(), parent_name), param_value.getValue());
          _builder.append(_describeParameter);
          _builder.newLineIfNotEmpty();
          _builder.append("$");
          _builder.append(parseq_name);
          _builder.append("_elem_");
          Integer _key = param_value.getKey();
          _builder.append(_key);
          _builder.append(" (array: $");
          _builder.append(parseq_name);
          _builder.append(", array_value: $");
          String _uniqueName = this._namer.uniqueName(param_value.getValue(), parent_name);
          _builder.append(_uniqueName);
          _builder.append(") isa at_index, has index ");
          Integer _key_1 = param_value.getKey();
          _builder.append(_key_1);
          _builder.append(";");
          _builder.newLineIfNotEmpty();
        }
      }
      _builder.newLine();
      final String body = _builder.toString();
      EList<ParameterValue> _value = ((ParameterSequence)the_value).getValue();
      for (final ParameterValue param_value_1 : _value) {
        result.add(this._namer.uniqueName(param_value_1, parent_name));
      }
      return Pair.<CharSequence, String>of(body, parseq_name);
    } else {
      final String name = this._namer.uniqueName(the_value, parent_name);
      final CharSequence single = this.describeParameter(name, the_parameter.getValue());
      return Pair.<CharSequence, String>of(single, name);
    }
  }

  public int handleDuration(final String duration_field) {
    int _xifexpression = (int) 0;
    boolean _equals = Objects.equals(duration_field, "infinite");
    if (_equals) {
      return 0;
    } else {
      _xifexpression = Integer.parseInt(duration_field);
    }
    return _xifexpression;
  }

  public String handleQoS(final QualityOfService qos, final String interfaceName) {
    String _xifexpression = null;
    if ((qos != null)) {
      String _xblockexpression = null;
      {
        final String qosName = this._namer.uniqueName(qos, interfaceName);
        String _xifexpression_1 = null;
        String _reliability = qos.getReliability();
        boolean _tripleNotEquals = (_reliability != null);
        if (_tripleNotEquals) {
          String _upperCase = qos.getReliability().toUpperCase();
          String _plus = ("has reliability \"" + _upperCase);
          _xifexpression_1 = (_plus + "\"");
        } else {
          _xifexpression_1 = null;
        }
        String _xifexpression_2 = null;
        String _history = qos.getHistory();
        boolean _tripleNotEquals_1 = (_history != null);
        if (_tripleNotEquals_1) {
          String _upperCase_1 = qos.getHistory().toUpperCase();
          String _plus_1 = ("has history \"" + _upperCase_1);
          _xifexpression_2 = (_plus_1 + "\"");
        } else {
          _xifexpression_2 = null;
        }
        String _xifexpression_3 = null;
        int _depth = qos.getDepth();
        boolean _notEquals = (_depth != 0);
        if (_notEquals) {
          int _depth_1 = qos.getDepth();
          _xifexpression_3 = ("has depth " + Integer.valueOf(_depth_1));
        } else {
          _xifexpression_3 = null;
        }
        String _xifexpression_4 = null;
        String _durability = qos.getDurability();
        boolean _tripleNotEquals_2 = (_durability != null);
        if (_tripleNotEquals_2) {
          String _upperCase_2 = qos.getDurability().toUpperCase();
          String _plus_2 = ("has durability \"" + _upperCase_2);
          _xifexpression_4 = (_plus_2 + "\"");
        } else {
          _xifexpression_4 = null;
        }
        String _xifexpression_5 = null;
        String _lifespan = qos.getLifespan();
        boolean _tripleNotEquals_3 = (_lifespan != null);
        if (_tripleNotEquals_3) {
          int _handleDuration = this.handleDuration(qos.getLifespan());
          _xifexpression_5 = ("has lifespan " + Integer.valueOf(_handleDuration));
        } else {
          _xifexpression_5 = null;
        }
        String _xifexpression_6 = null;
        String _deadline = qos.getDeadline();
        boolean _tripleNotEquals_4 = (_deadline != null);
        if (_tripleNotEquals_4) {
          int _handleDuration_1 = this.handleDuration(qos.getDeadline());
          _xifexpression_6 = ("has deadline " + Integer.valueOf(_handleDuration_1));
        } else {
          _xifexpression_6 = null;
        }
        String _xifexpression_7 = null;
        String _liveliness = qos.getLiveliness();
        boolean _tripleNotEquals_5 = (_liveliness != null);
        if (_tripleNotEquals_5) {
          String _upperCase_3 = qos.getLiveliness().toUpperCase();
          String _plus_3 = ("has liveliness \"" + _upperCase_3);
          _xifexpression_7 = (_plus_3 + "\"");
        } else {
          _xifexpression_7 = null;
        }
        String _xifexpression_8 = null;
        String _leaseDuration = qos.getLeaseDuration();
        boolean _tripleNotEquals_6 = (_leaseDuration != null);
        if (_tripleNotEquals_6) {
          int _handleDuration_2 = this.handleDuration(qos.getLeaseDuration());
          _xifexpression_8 = ("has lease_duration " + Integer.valueOf(_handleDuration_2));
        } else {
          _xifexpression_8 = null;
        }
        final Iterable<String> qosProps = IterableExtensions.<String>filterNull(CollectionLiterals.<String>newArrayList(_xifexpression_1, _xifexpression_2, _xifexpression_3, _xifexpression_4, _xifexpression_5, _xifexpression_6, _xifexpression_7, _xifexpression_8));
        StringConcatenation _builder = new StringConcatenation();
        _builder.newLine();
        _builder.append("$");
        _builder.append(qosName);
        _builder.append(" isa QoSProfile,");
        _builder.newLineIfNotEmpty();
        _builder.append(" \t   \t");
        String _join = IterableExtensions.join(qosProps, ",\n");
        _builder.append(_join, " \t   \t");
        _builder.newLineIfNotEmpty();
        _builder.append(";");
        _builder.newLine();
        _builder.newLine();
        _builder.append("$");
        _builder.append(qosName);
        _builder.append("_rel (interface: $");
        _builder.append(interfaceName);
        _builder.append(", qos: $");
        _builder.append(qosName);
        _builder.append(") isa has_qos;");
        _builder.newLineIfNotEmpty();
        _xblockexpression = _builder.toString();
      }
      _xifexpression = _xblockexpression;
    }
    return _xifexpression;
  }

  public String generateInsertQuery(final RosNode node) {
    String _xblockexpression = null;
    {
      final Node innerNode = node.getFrom();
      final String nodeName = this._namer.uniqueName(innerNode);
      StringConcatenation _builder = new StringConcatenation();
      String _describeNode = this.describeNode(innerNode, node.getNamespace());
      _builder.append(_describeNode);
      _builder.newLineIfNotEmpty();
      {
        List<Parameter> _parameters = this.getParameters(node);
        for(final Parameter parameter : _parameters) {
          _builder.append("$");
          String _uniqueName = this._namer.uniqueName(parameter);
          _builder.append(_uniqueName);
          _builder.append(" isa ");
          String _paramSubClass = this.paramSubClass(parameter.getType());
          _builder.append(_paramSubClass);
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("has parameter_name \"");
          String _name = parameter.getName();
          _builder.append(_name, "\t");
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          {
            ParameterValue _value = parameter.getValue();
            boolean _tripleNotEquals = (_value != null);
            if (_tripleNotEquals) {
              final Pair<CharSequence, String> paramstringpair = this.ParamValueToValueEntity(parameter, this._namer.uniqueName(parameter));
              _builder.newLineIfNotEmpty();
              CharSequence _key = paramstringpair.getKey();
              _builder.append(_key);
              _builder.newLineIfNotEmpty();
              _builder.append("(node: $");
              _builder.append(nodeName);
              _builder.append(",");
              _builder.newLineIfNotEmpty();
              _builder.append("parameter: $");
              String _uniqueName_1 = this._namer.uniqueName(parameter);
              _builder.append(_uniqueName_1);
              _builder.append(",");
              _builder.newLineIfNotEmpty();
              _builder.append("parameter_value: $");
              String _value_1 = paramstringpair.getValue();
              _builder.append(_value_1);
              _builder.append(")");
              _builder.newLineIfNotEmpty();
              _builder.append("\t");
              _builder.append("isa has_parameter_value, has default_value true;");
              _builder.newLine();
            }
          }
        }
      }
      {
        boolean _isEmpty = this.getParameters(node).isEmpty();
        boolean _not = (!_isEmpty);
        if (_not) {
          _builder.newLine();
          _builder.append("$");
          _builder.append(nodeName);
          _builder.append("_parameters (");
          _builder.newLineIfNotEmpty();
          _builder.append("\t");
          _builder.append("node: $");
          _builder.append(nodeName, "\t");
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          {
            List<Parameter> _parameters_1 = this.getParameters(node);
            boolean _hasElements = false;
            for(final Parameter parameter_1 : _parameters_1) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder.appendImmediate(", ", "\t");
              }
              _builder.append("\t");
              _builder.append("parameter: $");
              String _uniqueName_2 = this._namer.uniqueName(parameter_1);
              _builder.append(_uniqueName_2, "\t");
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append("\t");
          _builder.append(") isa has_parameter;");
          _builder.newLine();
        }
      }
      {
        EList<Subscriber> _subscriber = innerNode.getSubscriber();
        for(final Subscriber subscription : _subscriber) {
          final String subName = this._namer.uniqueName(subscription, nodeName);
          _builder.newLineIfNotEmpty();
          String topicName = this.getInterfaceName(subscription, node);
          _builder.newLineIfNotEmpty();
          _builder.append("$");
          _builder.append(subName);
          _builder.append(" isa Subscriber,");
          _builder.newLineIfNotEmpty();
          _builder.append("has interface_name \"");
          _builder.append(topicName);
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          _builder.append("has interface_type \"");
          String _fullname = subscription.getMessage().getFullname();
          _builder.append(_fullname);
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          String _handleQoS = this.handleQoS(subscription.getQos(), subName);
          _builder.append(_handleQoS);
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          _builder.append("(node: $");
          _builder.append(nodeName);
          _builder.append(", subscriber: $");
          _builder.append(subName);
          _builder.append(") isa has_topic;");
          _builder.newLineIfNotEmpty();
          _builder.newLine();
        }
      }
      {
        EList<Publisher> _publisher = innerNode.getPublisher();
        for(final Publisher publication : _publisher) {
          final String pubName = this._namer.uniqueName(publication, nodeName);
          _builder.newLineIfNotEmpty();
          String topicName_1 = this.getInterfaceName(publication, node);
          _builder.newLineIfNotEmpty();
          _builder.append("$");
          _builder.append(pubName);
          _builder.append(" isa Publisher,");
          _builder.newLineIfNotEmpty();
          _builder.append("has interface_name \"");
          _builder.append(topicName_1);
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          _builder.append("has interface_type \"");
          String _fullname_1 = publication.getMessage().getFullname();
          _builder.append(_fullname_1);
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          String _handleQoS_1 = this.handleQoS(publication.getQos(), pubName);
          _builder.append(_handleQoS_1);
          _builder.newLineIfNotEmpty();
          _builder.newLine();
          _builder.append("(node: $");
          _builder.append(nodeName);
          _builder.append(", publisher: $");
          _builder.append(pubName);
          _builder.append(") isa has_topic;");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<ActionClient> _actionclient = innerNode.getActionclient();
        for(final ActionClient actionClient : _actionclient) {
          final String acName = this._namer.uniqueName(actionClient, nodeName);
          _builder.newLineIfNotEmpty();
          String interfaceName = this.getInterfaceName(actionClient, node);
          _builder.newLineIfNotEmpty();
          _builder.append("$");
          _builder.append(acName);
          _builder.append(" isa ActionClient,");
          _builder.newLineIfNotEmpty();
          _builder.append("has interface_name \"");
          _builder.append(interfaceName);
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          _builder.append("has interface_type \"");
          String _fullname_2 = actionClient.getAction().getFullname();
          _builder.append(_fullname_2);
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          _builder.append("(node: $");
          _builder.append(nodeName);
          _builder.append(", client: $");
          _builder.append(acName);
          _builder.append(") isa has_action;\t");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<ActionServer> _actionserver = innerNode.getActionserver();
        for(final ActionServer actionServer : _actionserver) {
          final String asName = this._namer.uniqueName(actionServer, nodeName);
          _builder.newLineIfNotEmpty();
          String interfaceName_1 = this.getInterfaceName(actionServer, node);
          _builder.newLineIfNotEmpty();
          _builder.append("$");
          _builder.append(asName);
          _builder.append(" isa ActionServer,");
          _builder.newLineIfNotEmpty();
          _builder.append("has interface_name \"");
          _builder.append(interfaceName_1);
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          _builder.append("has interface_type \"");
          String _fullname_3 = actionServer.getAction().getFullname();
          _builder.append(_fullname_3);
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          _builder.append("(node: $");
          _builder.append(nodeName);
          _builder.append(", server: $");
          _builder.append(asName);
          _builder.append(") isa has_action;\t");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<ServiceClient> _serviceclient = innerNode.getServiceclient();
        for(final ServiceClient serviceClient : _serviceclient) {
          final String acName_1 = this._namer.uniqueName(serviceClient, nodeName);
          _builder.newLineIfNotEmpty();
          String interfaceName_2 = this.getInterfaceName(serviceClient, node);
          _builder.newLineIfNotEmpty();
          _builder.append("$");
          _builder.append(acName_1);
          _builder.append(" isa ServiceClient,");
          _builder.newLineIfNotEmpty();
          _builder.append("has interface_name \"");
          _builder.append(interfaceName_2);
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          _builder.append("has interface_type \"");
          String _fullname_4 = serviceClient.getService().getFullname();
          _builder.append(_fullname_4);
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          _builder.append("(node: $");
          _builder.append(nodeName);
          _builder.append(", client: $");
          _builder.append(acName_1);
          _builder.append(") isa has_service;\t");
          _builder.newLineIfNotEmpty();
        }
      }
      {
        EList<ServiceServer> _serviceserver = innerNode.getServiceserver();
        for(final ServiceServer serviceServer : _serviceserver) {
          final String asName_1 = this._namer.uniqueName(serviceServer, nodeName);
          _builder.newLineIfNotEmpty();
          String interfaceName_3 = this.getInterfaceName(serviceServer, node);
          _builder.newLineIfNotEmpty();
          _builder.append("$");
          _builder.append(asName_1);
          _builder.append(" isa ServiceServer,");
          _builder.newLineIfNotEmpty();
          _builder.append("has interface_name \"");
          _builder.append(interfaceName_3);
          _builder.append("\",");
          _builder.newLineIfNotEmpty();
          _builder.append("has interface_type \"");
          String _fullname_5 = serviceServer.getService().getFullname();
          _builder.append(_fullname_5);
          _builder.append("\";");
          _builder.newLineIfNotEmpty();
          _builder.append("(node: $");
          _builder.append(nodeName);
          _builder.append(", server: $");
          _builder.append(asName_1);
          _builder.append(") isa has_service;\t");
          _builder.newLineIfNotEmpty();
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  public List<system.System> collectAllSystems(final system.System rossystem) {
    final List<system.System> result = CollectionLiterals.<system.System>newArrayList();
    this.collectRecursively(rossystem, result);
    return result;
  }

  private void collectRecursively(final system.System ros_sys, final List<system.System> result) {
    if (((ros_sys == null) || result.contains(ros_sys))) {
      return;
    }
    result.add(ros_sys);
    EList<Component> _components = ros_sys.getComponents();
    for (final Component comp : _components) {
      if ((comp instanceof SubSystem)) {
        this.collectRecursively(((SubSystem)comp).getSystem(), result);
      }
    }
  }

  public String processSubNodes(final List<RosNode> rosNodes) {
    String _xblockexpression = null;
    {
      final Map<Node, List<RosNode>> parenthood = CollectionLiterals.<Node, List<RosNode>>newHashMap();
      for (final RosNode rosNode : rosNodes) {
        Node _parent = rosNode.getParent();
        boolean _tripleNotEquals = (_parent != null);
        if (_tripleNotEquals) {
          List<RosNode> children = parenthood.get(rosNode.getParent());
          if ((children == null)) {
            children = CollectionLiterals.<RosNode>newArrayList();
            parenthood.put(rosNode.getParent(), children);
          }
          children.add(rosNode);
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      {
        Set<Map.Entry<Node, List<RosNode>>> _entrySet = parenthood.entrySet();
        for(final Map.Entry<Node, List<RosNode>> family : _entrySet) {
          _builder.append("(node: $");
          String _uniqueName = this._namer.uniqueName(family.getKey());
          _builder.append(_uniqueName);
          _builder.append(",");
          _builder.newLineIfNotEmpty();
          {
            List<RosNode> _value = family.getValue();
            boolean _hasElements = false;
            for(final RosNode child : _value) {
              if (!_hasElements) {
                _hasElements = true;
              } else {
                _builder.appendImmediate(", ", "");
              }
              _builder.append("subnode: $");
              String _uniqueName_1 = this._namer.uniqueName(child.getFrom());
              _builder.append(_uniqueName_1);
              _builder.newLineIfNotEmpty();
            }
          }
          _builder.append(") isa subnode;");
          _builder.newLine();
        }
      }
      _xblockexpression = _builder.toString();
    }
    return _xblockexpression;
  }

  public List<RosNode> rosNodesFromSystem(final system.System ros_system) {
    final ArrayList<RosNode> node_list = CollectionLiterals.<RosNode>newArrayList();
    EList<Component> _components = ros_system.getComponents();
    for (final Component component : _components) {
      if ((component instanceof RosNode)) {
        node_list.add(((RosNode) component));
      }
    }
    return node_list;
  }

  @XbaseGenerated
  public String ParamValueToString(final ParameterValue p) {
    if (p instanceof ParameterBoolean) {
      return _ParamValueToString((ParameterBoolean)p);
    } else if (p instanceof ParameterDouble) {
      return _ParamValueToString((ParameterDouble)p);
    } else if (p instanceof ParameterInteger) {
      return _ParamValueToString((ParameterInteger)p);
    } else if (p instanceof ParameterSequence) {
      return _ParamValueToString((ParameterSequence)p);
    } else if (p instanceof ParameterString) {
      return _ParamValueToString((ParameterString)p);
    } else if (p != null) {
      return _ParamValueToString(p);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(p).toString());
    }
  }
}
