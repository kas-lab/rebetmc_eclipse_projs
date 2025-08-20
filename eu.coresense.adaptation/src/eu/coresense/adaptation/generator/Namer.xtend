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

class Namer {
	val Map<String, Integer> nameMap = newHashMap
	val Map<Condition, String> conditionNames = newHashMap 
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
	
	def makeUniqueName(String baseName) {
	    val count = nameMap.get(baseName) ?: 0
	    val newName = if (count == 0) baseName else baseName + "_" + count
	    nameMap.put(baseName, count + 1)
	    newName
	}
	
	def uniqueName(Condition condition) {
	    conditionNames.computeIfAbsent(condition) [
	        makeUniqueName(condition.measurement.toLowerCase + "_" + condition.operator.getName().toLowerCase)
	    ]
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
        	makeUniqueName(res.feature.name.toLowerCase() + "_resolution")
    ]
	}
	
	def uniqueName(RosNode node)
	{
		rosnodeNames.computeIfAbsent(node) [
        	makeUniqueName(node.name + "_node")
    ]
	}
	
	def uniqueName(ros.Node node)
	{
		nodeNames.computeIfAbsent(node) [
        	makeUniqueName(node.name + "_node")
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
			makeUniqueName(parameter.name + "_param")
		]
	}
	
	def String NiceNameParamValueClass(ParameterValue param_value)
	{
		//(boolean|boolean_array|double|double_array|long|long_array|string|string_array)
		switch param_value
		{
			ParameterBoolean:
				"ParameterValueBoolean"
			ParameterDouble:
				"ParameterValueDouble"
			ParameterString:
				"ParameterValueString"
			ParameterInteger:
				"ParameterValueInteger"
			ParameterSequence:
				NiceNameParamValueClass(param_value.value.get(0)) + "Array" 
			default:
				param_value.class.toString()
		}
		
	}
	
	def String paramSubClass (ParameterValue param_value)
	{
		//(boolean|boolean_array|double|double_array|long|long_array|string|string_array)
		switch param_value
		{
			ParameterBoolean:
				"ParameterBoolean"
			ParameterDouble:
				"ParameterDouble"
			ParameterString:
				"ParameterString"
			ParameterInteger:
				"ParameterInteger"
			ParameterSequence:
				NiceNameParamValueClass(param_value.value.get(0)) + "Array" 
		}
		
	}
	
	def String NiceNameParamValueType(ParameterValue param_value)
	{
		//(boolean|boolean_array|double|double_array|long|long_array|string|string_array)
		switch param_value
		{
			ParameterBoolean:
				"boolean"
			ParameterDouble:
				"double"
			ParameterString:
				"string"
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