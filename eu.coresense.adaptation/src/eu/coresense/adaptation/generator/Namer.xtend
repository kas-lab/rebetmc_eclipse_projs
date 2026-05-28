package eu.coresense.adaptation.generator

import java.util.Map
import eu.coresense.adaptation.tactics.Condition
import eu.coresense.resolution.resolutionModel.SetParam
import eu.coresense.resolution.resolutionModel.Resolution
import system.RosNode
import ros.ParameterValue
import ros.ParameterSequence
import uma.caosd.rhea.BasicFMmetamodel.Feature
import uma.caosd.rhea.BasicFMmetamodel.Alternative
import uma.caosd.rhea.BasicFMmetamodel.OrGroup
import eu.coresense.resolution.resolutionModel.SetLifecycle
import eu.coresense.resolution.resolutionModel.Reconfiguration
import eu.coresense.adaptation.tactics.LogicalOperator
import ros.ParameterBoolean
import ros.ParameterDouble
import ros.ParameterString
import ros.ParameterBooleanType
import ros.ParameterDoubleType
import ros.ParameterStringType
import ros.ParameterArrayType
import ros.ParameterInteger
import ros.ParameterType
import ros.ParameterIntegerType
import eu.coresense.context.contextModel.ContextVar
import eu.coresense.context.contextModel.DataSource
import eu.coresense.context.contextModel.QualifiedActionServerRef
import eu.coresense.context.contextModel.QualifiedPublisherRef
import eu.coresense.context.contextModel.QualifiedServiceServerRef
import eu.coresense.adaptation.tactics.MeasurementCondition
import eu.coresense.adaptation.tactics.FeatureCondition

class Namer {
	val Map<String, Integer> nameMap = newHashMap
	val Map<MeasurementCondition, String> measurementConditionNames = newHashMap 
	val Map<FeatureCondition, String> featureConditionNames = newHashMap 
	val Map<Pair<String, String>, String> logicNames = newHashMap
	val Map<SetParam, String> setparamNames = newHashMap
	val Map<Resolution, String> resolutionNames = newHashMap
	val Map<RosNode, String> rosnodeNames = newHashMap
	val Map<ros.Node, String> nodeNames = newHashMap
	val Map<ros.Parameter, String> paramNames = newHashMap
	val Map<ParameterValue, String> paramvalNames = newHashMap
	val Map<ParameterSequence, String> paramseqNames = newHashMap
	val Map<Feature, String> featureNames = newHashMap
	val Map<Alternative, String> altNames = newHashMap
	val Map<OrGroup, String> orGroupNames = newHashMap
	val Map<SetLifecycle,String> setlcNames = newHashMap
	val Map<ros.Subscriber,String> subNames = newHashMap
	val Map<ros.Publisher,String> pubNames = newHashMap
	val Map<ros.ActionClient, String> acNames = newHashMap
	val Map<ros.ActionServer, String> asNames = newHashMap
	val Map<ros.ServiceClient, String> scNames = newHashMap
	val Map<ros.ServiceServer, String> ssNames = newHashMap
	val Map<ros.QualityOfService,String> qosNames = newHashMap
	val Map<ContextVar,String> cvNames = newHashMap
	val Map<Expr, String> exprNames = newHashMap
	
	
	
	def makeUniqueName(String baseName) {
	    val count = nameMap.get(baseName) ?: 0
	    val newName = if (count == 0) baseName else baseName + "_" + count
	    nameMap.put(baseName, count + 1)
	    newName
	}
	
	def uniqueName(MeasurementCondition condition) {
	    measurementConditionNames.computeIfAbsent(condition) [
	        makeUniqueName(condition.measurement.name.toLowerCase + "_" + condition.operator.getName().toLowerCase)
	    ]
	}
	
	def uniqueName(FeatureCondition condition) {
	    featureConditionNames.computeIfAbsent(condition) [
	        makeUniqueName("is_selected_" + uniqueName(condition.variant.feature))
	    ]
	}
	
	def uniqueName(ContextVar contextVariable) {
	    cvNames.computeIfAbsent(contextVariable) [
	        makeUniqueName("t_measured_" + contextVariable.name.toLowerCase)
	    ]
	}

	def uniqueName(Condition condition)
	{
		switch condition {
			MeasurementCondition : {
				return uniqueName(condition)
			}
			FeatureCondition: {
				return uniqueName(condition)
			}
		}
	}
	def uniqueName(LogicalOperator logicalOp, String lhs_name, String rhs_name)
	{
		val lhs_short_name = lhs_name.substring(0, Math.min(3, lhs_name.length))
		val rhs_short_name = rhs_name.substring(0, Math.min(3, rhs_name.length))
		val key = Pair.of(lhs_name, rhs_name)
		    logicNames.computeIfAbsent(key) [
        makeUniqueName(logicalOp.literal.toLowerCase + "_" + lhs_short_name + "_" + rhs_short_name)
    ]
	}
	
	def uniqueName(Reconfiguration reconf)
	{
		
		if(reconf instanceof SetParam)
		{
			return uniqueName(reconf)
		}
		else if(reconf instanceof SetLifecycle)
		{
			return uniqueName(reconf)	
		}
		return "shouldn't happen"
		
	}
	
	def uniqueName(DataSource dataSource, String nodeName)
	{	
		val ref = dataSource.ref
		if(ref instanceof QualifiedActionServerRef)
		{
			return uniqueName(ref.actionServer, nodeName)
		}
		if(ref instanceof QualifiedPublisherRef)
		{
			return uniqueName(ref.publisher, nodeName)
		}
		if(ref instanceof QualifiedServiceServerRef)
		{
			return uniqueName(ref.serviceServer, nodeName)
		}
		
	}
	
	def uniqueName(Expr e)
	{
		exprNames.computeIfAbsent(e) [
        	makeUniqueName("expr_")]
	}
	
	def uniqueName(ros.Subscriber subscriber, String node_name)
	{
		subNames.computeIfAbsent(subscriber) [
        	makeUniqueName(node_name + "_sub")]
	}
	
	def uniqueName(ros.Publisher publisher, String node_name)
	{
		pubNames.computeIfAbsent(publisher) [
        	makeUniqueName(node_name + "_pub")]
	}
	
	def uniqueName(ros.ActionClient actionClient, String node_name)
	{
		acNames.computeIfAbsent(actionClient) [
        	makeUniqueName(node_name + "_action_client")]
	}
	
	def uniqueName(ros.ActionServer actionServer, String node_name)
	{
		asNames.computeIfAbsent(actionServer) [
        	makeUniqueName(node_name + "_action_server")]
	}
	
	def uniqueName(ros.ServiceClient serviceClient, String node_name)
	{
		scNames.computeIfAbsent(serviceClient) [
        	makeUniqueName(node_name + "_service_client")]
	}
	
	def uniqueName(ros.ServiceServer serviceServer, String node_name)
	{
		ssNames.computeIfAbsent(serviceServer) [
        	makeUniqueName(node_name + "_service_server")]
	}
	
	def uniqueName(SetLifecycle setl)
	{
		setlcNames.computeIfAbsent(setl) [
        	makeUniqueName("slc_" + setl.node.name.toLowerCase() + "_" + setl.state.toString().toLowerCase())
    ]
		
	}
	
	def uniqueName(SetParam setp)
	{
		setparamNames.computeIfAbsent(setp) [
        	makeUniqueName("sp_" + setp.param.name.toLowerCase())
    ]
	}
	
	def uniqueName(Resolution res)
	{
		resolutionNames.computeIfAbsent(res) [
        	makeUniqueName(res.featureRef.feature.name.toLowerCase() + "_resolution")
    ]
	}
	
	def uniqueName(RosNode node)
	{
		rosnodeNames.computeIfAbsent(node) [
        	makeUniqueName(node.name.replace("/", "") + "_node")
    ]
	}
	
	def uniqueName(ros.QualityOfService qos, String interface_name)
	{
		qosNames.computeIfAbsent(qos) [
        	makeUniqueName(interface_name + "_qos")
    ]
	}
	
	def uniqueName(ros.Node node)
	{
		nodeNames.computeIfAbsent(node) [
        	makeUniqueName(node.name.replace("/", "") + "_node")
    ]
	}
	
	def uniqueName(ParameterValue p_value, String parent_identifier)
	{
		paramvalNames.computeIfAbsent(p_value) [
        	makeUniqueName(parent_identifier + "_pvalue")
    ]
	}
	
	def uniqueName(ParameterSequence p_seq, String parent_name)
	{
		paramseqNames.computeIfAbsent(p_seq) [
        	makeUniqueName(parent_name + "_p_array_value")
    ]
	}
	
	def uniqueName(Feature feat)
	{
		featureNames.computeIfAbsent(feat) [
        	makeUniqueName("f_" + feat.name.toLowerCase())
    ]
	}
	
	def String UniqueName(Alternative alt)
	{
		altNames.computeIfAbsent(alt) [
			makeUniqueName("alt_" + UniqueName(alt))
		]
	}
	
	def String UniqueName(OrGroup or_grp)
	{
		orGroupNames.computeIfAbsent(or_grp) [
			makeUniqueName("or_group_" + UniqueName(or_grp))
		]
	}
	
	def uniqueName(ros.Parameter parameter)
	{
		paramNames.computeIfAbsent(parameter) [
			makeUniqueName(parameter.name.replace('.','_').replace('/','') + "_param")
		]
	}
	
	def String SchemaValueFromParam(ParameterValue param_value)
	{
		//(boolean|boolean_array|double|double_array|long|long_array|string|string_array)
		switch param_value
		{
			ParameterBoolean:
				"ValueBool"
			ParameterDouble:
				"ValueDouble"
			ParameterString:
				"ValueString"
			ParameterInteger:
				"ValueInteger"
			ParameterSequence:
				"ValueArray" 
			default:
				param_value.class.toString()
		}
		
	}
	def String SchemaValueFromParam(ParameterType param_type)
	{
		//(boolean|boolean_array|double|double_array|long|long_array|string|string_array)
		switch param_type
		{
			ParameterBooleanType:
				"ValueBool"
			ParameterDoubleType:
				"ValueDouble"
			ParameterStringType:
				"ValueString"
			ParameterIntegerType:
				"ValueInteger"
			ParameterArrayType:
				"ValueArray"
			default:
				param_type.class.toString()
		}
		
	}
	
	
	def String paramSubClass (ParameterValue param_value)
	{
		//(boolean|boolean_array|double|double_array|long|long_array|string|string_array)
		switch param_value
		{
			ParameterBoolean:
				"ParameterBool"
			ParameterDouble:
				"ParameterDouble"
			ParameterString:
				"ParameterString"
			ParameterInteger:
				"ParameterInteger"
			ParameterSequence:
				"Parameter" + SchemaValueFromParam(param_value.value.get(0)) + "Array" 
		}
		
	}
	
	def String paramSubClass (ParameterType param_type)
	{
		//(boolean|boolean_array|double|double_array|long|long_array|string|string_array)
		switch param_type
		{
			ParameterBooleanType:
				"ParameterBool"
			ParameterDoubleType:
				"ParameterDouble"
			ParameterStringType:
				"ParameterString"
			ParameterIntegerType:
				"ParameterInteger"
			ParameterArrayType:
				paramSubClass(param_type.type) + "Array" 
		}
		
	}
	
	
	def String NiceNameParamValueType(ParameterValue param_value)
	{
		//(boolean|boolean_array|double|double_array|long|long_array|string|string_array)
		switch param_value
		{
			ParameterBoolean:
				"bool"
			ParameterDouble:
				"double"
			ParameterString:
				"string"
			ParameterInteger:
				"integer"
		}
		
	}
	
	
	def String NiceNameParamType(ParameterType param_type)
	{
		//(boolean|boolean_array|double|double_array|long|long_array|string|string_array)
		switch param_type
		{
			ParameterBooleanType:
				"boolean"
			ParameterDoubleType:
				"double"
			ParameterStringType:
				"string"
			ParameterArrayType:
				NiceNameParamType(param_type.type) + "_array" 
		}
		
	}
	
}
