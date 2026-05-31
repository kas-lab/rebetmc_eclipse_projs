package eu.coresense.adaptation.generator

import java.util.List
import eu.coresense.context.contextModel.ContextVar
import java.util.Map
import uma.caosd.rhea.BasicFMmetamodel.Feature
import java.util.Map.Entry

class State {
	val public List<Boolean> featurePrecondition
	var public String TQLName = "UnnamedState"
	val public List<String> associatedRulesTQLNames
	val Map<ContextVar, Pair<LiteralWrapper, LiteralWrapper>> boundPreconditionMap
	val Map<ContextVar, Boolean> boolPreconditionMap
	var List<Feature> featureKeys
	
	
	val Map<ContextVar, LiteralWrapper> medianBounds
	
	new(List<Pair<LiteralWrapper, LiteralWrapper>> contextPrecondition, List<Boolean> booleanContextPreconditions, List<Boolean> featurePrecondition,List<ContextVar> contextKeys, List<Feature> featureKeys) {
		boundPreconditionMap = newHashMap
		medianBounds = newHashMap
		associatedRulesTQLNames = newArrayList
		boolPreconditionMap = newHashMap
		this.featureKeys = featureKeys
		for (contextKeyIndPair : contextKeys.indexed) {
			val contextKey = contextKeyIndPair.value
			if(contextKeyIndPair.key >= contextPrecondition.size())
			{
				val boolval = booleanContextPreconditions.get(contextKeyIndPair.key-contextPrecondition.size())
				boolPreconditionMap.put(contextKey,boolval)
			}
			else
			{
			val bound = contextPrecondition.get(contextKeyIndPair.key)
			boundPreconditionMap.put(contextKey,bound)
			medianBounds.put(contextKey,bound.medianBound)
			}
		}
        this.featurePrecondition = featurePrecondition
    }
    
    def Pair<String,List<String>> stateActionPair()
    {
    	TQLName -> associatedRulesTQLNames
    }
    
    def hasRules()
    {
    	return associatedRulesTQLNames.size > 0
    }
    
    def addRule(String ruleName)
    {
    	associatedRulesTQLNames.add(ruleName)
    }
    def getContextBoundPairs()
    {
    	return boundPreconditionMap.entrySet
    }
    
    def List<Entry<ContextVar, LiteralWrapper>> getMedians()
    {
    	return medianBounds.entrySet.toList
    }
    
    def List<ContextVar> getContextKeys()
    {
    	return boundPreconditionMap.keySet.toList
    }
    
    def List<Pair<LiteralWrapper, LiteralWrapper>> getContextPrecondition()
    {
    	return boundPreconditionMap.values.toList
    }
    
    def List<Boolean> getContextBoolPrecondition()
    {
    	return boolPreconditionMap.values.toList
    }
    
    def Boolean BoundorBoolPrecondition(ContextVar contextVar)
    {
    	val isBound = this.boundPreconditionMap.containsKey(contextVar)
    	val isBool = this.boolPreconditionMap.containsKey(contextVar)
    	if(!isBound && !isBool)
    	{
    		throw new Exception("ContextVar not defined for state")
    	}
    	return isBound //If it is false then it implies that it is a bool.
    }
    
    def Pair<LiteralWrapper, LiteralWrapper> getBoundsOn(ContextVar contextVar)
    {
    	return this.boundPreconditionMap.get(contextVar)
    }
    
    def Boolean getBoolOn(ContextVar contextVar)
    {
    	return this.boolPreconditionMap.get(contextVar)
    }
    
    private def LiteralWrapper medianBound(Pair<LiteralWrapper, LiteralWrapper> bound)
	{		
		val lowerBound = bound.key
		val upperBound = bound.value
		if(lowerBound === null)
		{
			return upperBound
		}
		if(upperBound === null)
		{
			return lowerBound
		}
		if(lowerBound !== null && upperBound !== null)
		{
			return  ((lowerBound + upperBound) / 2)	
		}
		throw new Exception("Could not find Median Bound? " + bound.toString())
	}
	
	def describeMedianBounds()
	{
		'''
		 <----- State: «TQLName» Median Bounds
		«FOR element : this.medianBounds.entrySet»
			«element.key.name» : «element.value.toString»
		«ENDFOR»
		----->
		'''
	}
	
	def describe()
	{
		'''
		<----- State: «TQLName» General Information
		Preconditions are
		<BOOLEAN>
		«FOR element : boolPreconditionMap.entrySet SEPARATOR "; "»
			«element.key.name» : «element.value»
		«ENDFOR»
		</BOOLEAN>
		<FEATURE>
		«FOR element : featurePrecondition.indexed SEPARATOR "; "»
			«featureKeys.get(element.key).name» : «IF element.value»Selected«ELSE»notSelected«ENDIF»
		«ENDFOR»
		</FEATURE>
		Has «associatedRulesTQLNames.size()» rules attached.
		«IF !associatedRulesTQLNames.empty»
			Rules are:
				«FOR rule : associatedRulesTQLNames SEPARATOR ", "»
					«rule»
				«ENDFOR»
		«ENDIF»
		----->
		«describeMedianBounds»
		'''
		
	}
}