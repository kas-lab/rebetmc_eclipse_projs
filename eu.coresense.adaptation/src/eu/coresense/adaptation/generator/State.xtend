package eu.coresense.adaptation.generator

import java.util.List
import eu.coresense.context.contextModel.ContextVar
import java.util.Map
import uma.caosd.rhea.BasicFMmetamodel.Feature
import java.util.Map.Entry
import eu.coresense.adaptation.tactics.AdaptationRule
import eu.coresense.adaptation.tactics.AtomicRule
import eu.coresense.adaptation.tactics.ConditionAction
import eu.coresense.adaptation.tactics.MeasurementThresholdCondition
import eu.coresense.common.BooleanLiteral
import java.util.HashSet
import java.util.Set
import eu.coresense.adaptation.tactics.FeatureCondition
import de.ovgu.featureide.fm.core.io.manager.FeatureModelManager
import de.ovgu.featureide.fm.core.configuration.ConfigurationAnalyzer
import de.ovgu.featureide.fm.core.analysis.cnf.formula.FeatureModelFormula
import de.ovgu.featureide.fm.core.configuration.Configuration
import de.ovgu.featureide.fm.core.init.LibraryManager
import de.ovgu.featureide.fm.core.init.FMCoreLibrary
import eu.coresense.variability.generator.FeatureModelGenerator
import uma.caosd.rhea.BasicFMmetamodel.FeatureModel
import java.nio.file.Files
import java.io.FileWriter
import eu.coresense.common.MathOperator
import eu.coresense.adaptation.tactics.MeasurementMeasurementCondition
import eu.coresense.common.Utilities
import eu.coresense.common.Literal
import eu.coresense.common.IntLiteral
import eu.coresense.common.DecimalLiteral
import eu.coresense.common.StringLiteral
import org.eclipse.emf.common.util.EList
import static extension eu.coresense.common.LiteralExtensions.*
import eu.coresense.common.LiteralComparator
import eu.coresense.adaptation.tactics.TacticsFactory
import eu.coresense.adaptation.tactics.MeasurementCondition
import eu.coresense.adaptation.tactics.LogicalOperator
import eu.coresense.common.CommonFactory
import org.eclipse.emf.ecore.util.EcoreUtil

class State {
	val public List<Boolean> featurePrecondition
	var public String TQLName = "UnnamedState"
	val public List<String> associatedRulesTQLNames
	val public List<AdaptationRule> associatedRules
	val Map<ContextVar, Pair<Literal,Literal>> boundPreconditionMap
	val Map<ContextVar, Boolean> boolPreconditionMap
	var List<Feature> featureKeys
	var public MeasurementCondition precondition
	
	
	val Map<ContextVar, Double> medianBounds
	
	def static constructMeasurementThresholdCondition(ContextVar measurement, MathOperator op, Literal thresholdValue)
	{
		val x = TacticsFactory.eINSTANCE.createMeasurementThresholdCondition()
		x.measurement = measurement
		x.operator = op
		x.thresholdValue = thresholdValue
		return x
	}
	
	def static render(MeasurementCondition mes)
	{
		var str = ""
	   if(mes instanceof MeasurementThresholdCondition)
	   {
       		str += mes.measurement.name + mes.operator + mes.thresholdValue.render
       
       }
       var current = mes
       	while (current !== null && current.secondTerm !== null) {
       		str += " " + current.logicalOp + " "
       		if(mes.secondTerm instanceof MeasurementThresholdCondition)
	  		{
	  			current = current.secondTerm
	  			
       			str += current.measurement.name + current.operator +  (current as MeasurementThresholdCondition).thresholdValue.render
       		}
       		
		}
		return str
	}
	
	new(List<Pair<Literal, Literal>> contextPrecondition, List<Boolean> booleanContextPreconditions, List<Boolean> featurePrecondition, List<ContextVar> contextKeys, List<Feature> featureKeys) {
		boundPreconditionMap = newHashMap
		medianBounds = newHashMap
		associatedRulesTQLNames = newArrayList
		associatedRules = newArrayList
		boolPreconditionMap = newHashMap
		precondition = null
		this.featureKeys = featureKeys
		this.featurePrecondition = featurePrecondition
		for (var i = 0 ; i < contextPrecondition.size() ; i++)
		{
			val contextKey = contextKeys.get(i)
			val bound = contextPrecondition.get(i)
			var MeasurementThresholdCondition lowerComp = null
			var MeasurementThresholdCondition upperComp = null
			val lowerBound = bound.key
			val upperBound = bound.value
			var MeasurementCondition comp = null
			// If neither bounds are infinite
			if(upperBound !== null && lowerBound !== null)
			{
				upperComp = constructMeasurementThresholdCondition(contextKey, MathOperator.LESS, EcoreUtil.copy(upperBound))
				lowerComp = constructMeasurementThresholdCondition(contextKey, MathOperator.GREQ, EcoreUtil.copy(lowerBound))
				
				//combine
				lowerComp.logicalOp = LogicalOperator.AND
				lowerComp.secondTerm = upperComp
				comp = lowerComp
			}
			else 
			{
				if(upperBound !== null)
				{
					upperComp = constructMeasurementThresholdCondition(contextKey, MathOperator.LESS, EcoreUtil.copy(upperBound))
					comp = upperComp
				}
				if(lowerBound !== null)
				{
					lowerComp = constructMeasurementThresholdCondition(contextKey, MathOperator.GREQ, EcoreUtil.copy(lowerBound))
					comp = lowerComp
				}
			}
			
			if(precondition === null)
			{
				precondition = comp
			}
			else
			{
				//Append to the end
				var current = precondition
				while (current.secondTerm !== null) {
				    current = current.secondTerm
				}
				current.secondTerm = comp
			}

			boundPreconditionMap.put(contextKey,bound)
			medianBounds.put(contextKey,bound.medianBound)
			
		}
		for (var i = contextPrecondition.size() ; i < contextKeys.length ; i++)
		{
				val boolval = booleanContextPreconditions.get(i-contextPrecondition.size())
				boolPreconditionMap.put(contextKeys.get(i),boolval)
				
				val boolLit = CommonFactory.eINSTANCE.createBooleanLiteral()
				boolLit.value = boolval
				
				val comp = constructMeasurementThresholdCondition(contextKeys.get(i), MathOperator.EQUAL,boolLit)
				
				if(precondition === null)
				{
					precondition = comp
				}
				else
				{
					//Append to the end
					var current = precondition
					while (current.secondTerm !== null) {
					    current = current.secondTerm
					}
					current.secondTerm = comp
				}
			
		}
		println("state precondition " + precondition.render)
    }
    
//    new(List<Pair<Literal, Literal>> contextPrecondition, List<Boolean> booleanContextPreconditions, List<ContextVar> contextKeys, List<Feature> featureKeys) {
////		boundPreconditionMap = newHashMap
////		medianBounds = newHashMap
////		associatedRulesTQLNames = newArrayList
////		associatedRules = newArrayList
////		boolPreconditionMap = newHashMap
////		this.featureKeys = featureKeys
////		precondition = null
////		for (contextKeyIndPair : contextKeys.indexed) {
////			val contextKey = contextKeyIndPair.value
////			if(contextKeyIndPair.key >= contextPrecondition.size())
////			{
////				val boolval = booleanContextPreconditions.get(contextKeyIndPair.key-contextPrecondition.size())
////				boolPreconditionMap.put(contextKey,boolval)
////			}
////			else
////			{
////			val bound = contextPrecondition.get(contextKeyIndPair.key)
////			boundPreconditionMap.put(contextKey,bound)
////			medianBounds.put(contextKey,bound.medianBound)
////			}
////		}
////        this.featurePrecondition = null
//    }
    
    def boolean varAgainstBounds(Var ruleConditionCNF)
	{
		val condition = ruleConditionCNF.condition
		if(condition instanceof MeasurementThresholdCondition)
    	{
    		if(BoundorBoolPrecondition(condition.measurement))				        		
    		{
    			val bound = getBoundsOn(condition.measurement)
	    		val closedLowerBound = bound.key  
	    		val openUpperBound = bound.value
	    		// [closedLowerBound, openUpperbound) 
	    		switch(condition.operator)
	    		{
		    		case MathOperator.GREATER: {
		    			//The lower bound is not infinitely low, and exceeds or equals what is required to be greater than.
		    			if(closedLowerBound !== null && (closedLowerBound >= condition.thresholdValue))
		    			{
	//						    				println(adap_rule.name + " approved by " + condition.measurement.name + " " + bound.toString())
		    				return true
		    			}
		    		}
		    		case MathOperator.GREQ: {
		    			if(closedLowerBound !== null && (closedLowerBound >= condition.thresholdValue))
		    			{
	//						    				println(adap_rule.name + " approved by " + condition.measurement.name + " " + bound.toString())
		    				return true
		    			}
		    		}
		    		case MathOperator.LESS: {
		    			
		    			//The upper bound is not infinitely high, and is less than or equal than what is required to be lower than. 
		    			if(openUpperBound !== null && (openUpperBound >= condition.thresholdValue))
		    			{
	//						    				println(adap_rule.name + " approved by " + condition.measurement.name + " " + bound.toString())
		    				return true
		    			}
		    		}
		    		case MathOperator.LEQ: {
		    			if(openUpperBound !== null && (openUpperBound <= condition.thresholdValue))
		    			{
	//						    				println(adap_rule.name + " approved by " + condition.measurement.name + " " + bound.toString())
		    				return true
		    			}
		    		}
		    		case MathOperator.EQUAL: {
		    			//TODO
		    			return false
		    		}
		    		case MathOperator.DIFFERENT: {
		    			//TODO
		    			return false
		    		}
	    		}
    		
    		}
    		else
    		{
    			val bool = getBoolOn(condition.measurement)
    			switch (condition.operator)
    			{
    				case MathOperator.EQUAL: {
		    			return bool == (condition.thresholdValue as BooleanLiteral).value
		    		}
		    		case MathOperator.DIFFERENT: {
		    			return bool != (condition.thresholdValue as BooleanLiteral).value
		    		}
					default: {
						throw new Exception("Invalid operator for what should be boolean contextVar")
					}
    				
    			}
    		}
    	}
    	else if(condition instanceof MeasurementMeasurementCondition)
    	{
    		throw new Exception("Not Implemented Yet")
    	}
		return false
	}


    
    def Pair<String,List<String>> stateActionPair()
    {
    	TQLName -> associatedRulesTQLNames
    }
    
    def hasRules()
    {
    	return associatedRulesTQLNames.size > 0
    }
    
    def addRule(AdaptationRule rule)
    {
    	associatedRulesTQLNames.add(rule.name)
    	associatedRules.add(rule)
    }
    def getContextBoundPairs()
    {
    	return boundPreconditionMap.entrySet
    }
    
    def getContextBoolConditions()
    {
    	return boolPreconditionMap.entrySet
    }
    
    
    def List<Entry<ContextVar, Double>> getMedians()
    {
    	return medianBounds.entrySet.toList
    }
    
    def List<ContextVar> getContextKeys()
    {
    	return (boundPreconditionMap.keySet + boolPreconditionMap.keySet).toList
    }
    
    def List<Pair<Literal, Literal>> getContextPrecondition()
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
    
    def Pair<Literal, Literal> getBoundsOn(ContextVar contextVar)
    {
    	return this.boundPreconditionMap.get(contextVar)
    }
    
    def Boolean getBoolOn(ContextVar contextVar)
    {
    	return this.boolPreconditionMap.get(contextVar)
    }
    
    private def double medianBound(Pair<Literal, Literal> bound)
	{		
		val lowerBound = bound.key
		val upperBound = bound.value
		if(lowerBound === null)
		{
			return Utilities.literalDouble(upperBound)
		}
		if(upperBound === null)
		{
			return Utilities.literalDouble(lowerBound)
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
	
	def String name()
	{
		var name = ""
		for (element : boolPreconditionMap.entrySet) {
			name += '''«element.key.name»==«element.value»;'''
		}
		name += "|"
		
		for (element : boundPreconditionMap.entrySet) {
			name += '''«IF element.value.key !== null»«element.value.key.render»«ELSE»-inf«ENDIF»<«element.key.name»<«IF element.value.value !== null»«element.value.value.render»«ELSE»inf«ENDIF»;'''
		}
		return name
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
		<THRESHOLD>
		«FOR element : boundPreconditionMap.entrySet SEPARATOR "; "»
			«element.key.name» > «IF element.value.key !== null»«element.value.key.render»«ELSE»-inf«ENDIF»
			«element.key.name» < «IF element.value.value !== null»«element.value.value.render»«ELSE»inf«ENDIF»
		«ENDFOR»
		</THRESHOLD>
		«IF featurePrecondition !== null»
		<FEATURE>
		«FOR element : featurePrecondition.indexed SEPARATOR "; "»
			«featureKeys.get(element.key).name» : «IF element.value»Selected«ELSE»notSelected«ENDIF»
		«ENDFOR»
		</FEATURE>
		«ENDIF»
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
	
	def static createBounds(Map<ContextVar, Set<Literal>> thresholds)
	{
		val Map<ContextVar, List<Pair<Literal, Literal>>> bounds = newHashMap
		for (measurement : thresholds.keySet) {
			var List<Pair<Literal,Literal>> boundPairs = newArrayList
			val sortedThresholds = thresholds.get(measurement).toList().sortWith(new LiteralComparator)
			boundPairs.add(null -> sortedThresholds.first)
			
			if(sortedThresholds.size() > 1)
			{
				for (indexedLiteral : sortedThresholds.indexed) {
					if(indexedLiteral.key + 1 <= sortedThresholds.size() - 1)
					boundPairs.add(indexedLiteral.value -> sortedThresholds.get(indexedLiteral.key + 1))
				}
			}
			
			boundPairs.add(sortedThresholds.last -> null)
			bounds.put(measurement,boundPairs)

			printBoundPairs(boundPairs)
		}
		return bounds
	}
	
	def static printBoundPairs(List<Pair<Literal,Literal>> boundPairs)
	{
		for (element : boundPairs) {
			if(element.key === null)
			{
				print("(" + "," + Utilities.valueOfLiteral(element.value) + "), ")
			}
			if(element.value === null)
			{
				print("(" + Utilities.valueOfLiteral(element.key) + ",)")
			}
			if(element.value !== null && element.key !== null)
			{
				print("(" + Utilities.valueOfLiteral(element.key) + "," + Utilities.valueOfLiteral(element.value) + "), ")
			}
		}
		println("")
	}
	
	def checkAgainstBounds(AdaptationRule adap_rule)
	{
		val featureValuation = this.featurePrecondition

		if(adap_rule instanceof AtomicRule)
		{
			val ruleBody = adap_rule.ruleBody
					
			if(ruleBody instanceof ConditionAction)
			{
				if(featureValuation !== null)
				{
					if(ruleBody.featureGuard !== null)
					{
						val featureCondition = ruleBody.featureGuard.featureCondition
						
						val isFeatures = flattenAgain(featureCondition)
						
						for (isFeature : isFeatures)
						{
							val featureInQuestion = isFeature.variant.feature
							val featureIndex = featureKeys.indexOf(featureInQuestion)
							if(isFeature.not === null || isFeature.not != "!") {
								//Selected
								if(featureValuation.get(featureIndex) != true)
								{
									return false
								}
							}
							else
							{
								//!Selected
								if(featureValuation.get(featureIndex) == true)
								{
									return false
								}
							}
						}
					}
				}
				if(ruleBody.contextGuard !== null)
				{
					val ruleContextCondition = ruleBody.contextGuard.contextCondition
					val ruleCNF = Expr.toCNF(ruleContextCondition)
					return checkExpression(ruleCNF)
					
				}
			}
			
		}
	}
	
	def expressionFromState(String stateName, Boolean considerFeatures)
    {
    	val stateBounds = contextPrecondition
    	val stateBoolBounds = contextBoolPrecondition
    	val featureValuation = featurePrecondition
    	val boundConditions = newArrayList
    	for (element : stateBounds.indexed) {
    		val contextVar = contextKeys.get(element.key)
    		val name = contextVar.name + stateName + element.key.toString()
    		boundConditions.add(boundToTQL(element.value, name, contextVar))
    	}
    	for (element : stateBoolBounds.indexed) {
    		val contextVar = contextKeys.get((stateBounds.size() + element.key))
    		boundConditions.add(boundToTQL(element.value, contextVar))
    	}
    	
    	var Expr finalY = if (boundConditions.size == 1) boundConditions.get(0) else somethingRecursive(boundConditions)
    	println("boundCondiitions")
    	println(boundConditions.toString())
    	println(boundConditions.size())
    	if(considerFeatures)
    	{
	    	val featureConditions = newArrayList
	    	for (element : featureValuation.indexed)
	    	{
	    		//TODO: For features that have isSelected, and are an alternative, it should be unnecessary to add a notSelected for the siblings.
	    			featureConditions.add(new DerivedVarFeature(!element.value,featureKeys.get(element.key)))
	    	}
	    	var Expr finalX = if (featureConditions.size == 1) featureConditions.get(0) else somethingRecursive(featureConditions)	
	    	return new And(finalY,finalX)
    	
    	}
    	else
    	{
    		return finalY	
    	}
    }
    
        
	private def infinityLiteral(Boolean negative, Literal otherLiteral)
	{
		if(otherLiteral === null)
		{
			throw new Exception("null otherLiteral in infinityLiteral")
		}
		var infInt = Utilities.INF_INT_VAR
		var infDecimal = Utilities.INF_DBL_VAR
		
		if(negative)
		{
			infInt = Utilities.NEG_INF_INT_VAR
			infDecimal = Utilities.NEG_INF_DBL_VAR
		}
		
		switch otherLiteral
		{
			IntLiteral: return infInt
			DecimalLiteral: return infDecimal
			StringLiteral: throw new Exception("Requested infinityLiteral for String")
			BooleanLiteral: throw new Exception("Requested infinityLiteral for Boolean")
			default: throw new Exception("weird Otherliteral in infinityLiteral ")
		}
		
    	
	}

	
	
	private def And somethingRecursive(List<? extends Expr> x)
	{
	    if (x.size == 2) {
	        new And(x.get(0), x.get(1))
	    } else {
	        new And(x.get(0), somethingRecursive(x.subList(1, x.size)))
	    }
	}
    
    private def boundToTQL(Pair<Literal, Literal> lowUpBounds, String name, ContextVar contextVar)
	{
		val lowerBound = lowUpBounds.key
    	val upperBound = lowUpBounds.value
    	var lowerBoundTQL = "" -> ""
    	var upperBoundTQL = "" -> ""

		if(lowerBound === null && upperBound === null)
		{
			println("A")
			throw new Exception("boundToTQL ERROR")
		}
		
		if(lowerBound === null)
		{
			println("B")
			lowerBoundTQL = infinityLiteral(true,upperBound) -> ""
			upperBoundTQL = literalValue(upperBound, name)
			val pointToInf = lowerBoundTQL.key
			val lowerBoundVar = new DerivedVarPointer(MathOperator.GREQ,contextVar,pointToInf)
			val upperBoundVar = new DerivedVarLiteral(MathOperator.LESS,contextVar, upperBound)
			return new And(lowerBoundVar, upperBoundVar)
		} 	
		if(upperBound === null)
		{
			println("C")
			upperBoundTQL = infinityLiteral(false,lowerBound) -> ""
			lowerBoundTQL = literalValue(lowerBound, name)
			var lowerBoundVar = new DerivedVarLiteral(MathOperator.GREQ,contextVar,lowerBound)
			val pointToInf = upperBoundTQL.key
			var upperBoundVar = new DerivedVarPointer(MathOperator.LESS,contextVar, pointToInf)
			return new And(lowerBoundVar, upperBoundVar)
		}
		val upperBoundVar = new DerivedVarLiteral(MathOperator.LESS,contextVar, upperBound)
		var lowerBoundVar = new DerivedVarLiteral(MathOperator.GREQ,contextVar,lowerBound)
		return new And(lowerBoundVar, upperBoundVar)		
	}
	
	private def boundToTQL(Boolean boolValue, ContextVar contextVar)
	{
		if(boolValue)
		{
			return new DerivedVarPointer(MathOperator.EQUAL, contextVar, (Utilities.TQL_TRUE_VAR))
		}
		else
		{
			return new DerivedVarPointer(MathOperator.EQUAL, contextVar, (Utilities.TQL_FALSE_VAR))
		}
			
	}
	
	private def boolean checkExpression(Expr ruleCNF)
	{
		switch ruleCNF 
		{
			And: {
				var flattenedAnds = Expr.flattenAnds(ruleCNF)
				
				return flattenedAnds.forall[expr | checkExpression(expr)]
	        	
			}
			Or: {
				val listORs = newArrayList
	        	Expr.flattenORs(ruleCNF, listORs)
	        	
	        	return listORs.exists[varr | varAgainstBounds(varr)]
    			
				}
			Var: {
				return varAgainstBounds(ruleCNF)
			}
			default:
				throw new Exception("Unexpected situation CheckAgainstBounds")
		
		}
	}
	
	 private def static literalValue(Literal lit, String condition_name)
    {
    	val name = condition_name + "_val"
    	if(lit instanceof IntLiteral)
    	{
    		
    		return name -> '''$«name» isa ValueInteger, has integer_value «Utilities.valueOfLiteral(lit)»;'''
    	}
    	if(lit instanceof DecimalLiteral)
    	{
    		return name -> '''$«name» isa ValueDouble, has double_value «Utilities.valueOfLiteral(lit).toString»;'''
    	}
    	if(lit instanceof StringLiteral)
    	{
    		return name -> '''$«name» isa ValueString, has string_value «Utilities.valueOfLiteral(lit)»;'''
    	}
    	if(lit instanceof BooleanLiteral)
    	{
    		return name -> '''$«name» isa ValueBool, has bool_value «Utilities.valueOfLiteral(lit)»;'''
    	}
    	
    	throw new Exception("Strange Literal received " + lit)
    }
    

	static def FromRules(EList<AdaptationRule> adaptationRules, FeatureModel XfeatureModel, Boolean considerFeatures)
	{
		val Map<Feature, Set<Boolean>> featureSelections = newHashMap
		var Map<ContextVar, Set<Literal>> thresholds = newHashMap
		val Map<ContextVar, Set<Boolean>> booleanVars = newHashMap
		var List<State> allStates = newArrayList
    	for (rule : adaptationRules) {
        	registerComparisonsFromRule(rule,thresholds, featureSelections,booleanVars)
        }
 
//		        thresholds = wrapLiterals(thresholds)
		       	
		        val bounds = createBounds(thresholds)
		        val contextKeys = bounds.keySet.toList
		        val values = bounds.values.toList
	
		       	val product = Utilities.getCartesianProduct(values)
				allStates = newArrayList
				
				
				LibraryManager.registerLibrary(FMCoreLibrary.getInstance())
	      		
	      		val generator = new FeatureModelGenerator()
	
	        	val fm_xml = generator.generateXml(XfeatureModel)
	
		        val path = Files.createTempFile("featuremodel", ".xml")
		        val fw = new FileWriter(path.toFile(), true)
		        fw.write(fm_xml)
		        fw.close()
		        val featureModel = FeatureModelManager.load(path)
		
		        val formula = new FeatureModelFormula(featureModel)
		        val configuration = new Configuration(formula)
		        val configurationAnalyzer = new ConfigurationAnalyzer(formula, configuration)
		        val allConfigurations = configurationAnalyzer.getSolutions(100000)
	
				val Set<List<Boolean>> featureSelectionsToPairs = newHashSet
				
				val relevantFeatures = featureSelections.keySet()

				for (featureList: allConfigurations)
				{
					val List<Boolean> selectedOrNot = newArrayList
					for (relevantFeature : relevantFeatures)
					{
						selectedOrNot.add(featureList.contains(relevantFeature.name))
					}
					featureSelectionsToPairs.add(selectedOrNot)
					
				}
	
				val booleanPreconditions = newArrayList
				for (x : booleanVars.keySet)
				{
					contextKeys.add(x)
					booleanPreconditions.add(booleanVars.get(x).toList)
				}
				
				val booleanPreconditionsCombinations = Utilities.getCartesianProduct(booleanPreconditions)
				
				val featureKeys = featureSelections.keySet.toList
				
				if(considerFeatures)
				{
					for (featurevaluationCombo : featureSelectionsToPairs)
					{
						
						for (contextBooleanPrecondition : booleanPreconditionsCombinations)
						{
							for (contextBoundPrecondition : product)
							{
								allStates.add(new State(contextBoundPrecondition, contextBooleanPrecondition, featurevaluationCombo, contextKeys, featureKeys))
							}
							
						}
					}
				
				}
				else
				{
						for (contextBooleanPrecondition : booleanPreconditionsCombinations)
						{
							for (contextBoundPrecondition : product)
							{
								allStates.add(new State(contextBoundPrecondition, contextBooleanPrecondition, null, contextKeys, featureKeys))
							}
							
						}
				}
				
				for (state : allStates)
		        {
		        	for (rule : adaptationRules) {
		        		if(state.checkAgainstBounds(rule))
		        		{
		        			state.addRule(rule)
		        		}
		        	}
		        	
		        }
		     return allStates  
	}
	
	private def static registerComparisonsFromRule(AdaptationRule adap_rule, Map<ContextVar, Set<Literal>> thresholds, Map<Feature, Set<Boolean>> featureSelections, Map<ContextVar, Set<Boolean>> booleanVars)
	{
		if(adap_rule instanceof AtomicRule)
		{
			val ruleBody = adap_rule.ruleBody
					
			if(ruleBody instanceof ConditionAction)
			{
				if(ruleBody.contextGuard !== null)
				{
					if(ruleBody.contextGuard.contextCondition instanceof MeasurementThresholdCondition)
					{
						recordMeasurementConditionOnlyLiteral(ruleBody.contextGuard.contextCondition as MeasurementThresholdCondition, thresholds, booleanVars)	
					}
				}
				if(ruleBody.featureGuard !== null)
				{
					recordFeatureCondition(ruleBody.featureGuard.featureCondition, featureSelections)
				}
			}
			
		}
	}
	
	private def static recordMeasurementConditionOnlyLiteral(MeasurementThresholdCondition mes_cond, Map<ContextVar, Set<Literal>> comps, Map<ContextVar, Set<Boolean>> booleanVars)
	{
		for (element : flattenAgain(mes_cond)) {
			if(element.thresholdValue instanceof BooleanLiteral)
			{
				if(booleanVars.get(element.measurement) !== null)
				{
				}
				else
				{
					var Set<Boolean> newList =  new HashSet<Boolean>()
					newList.add(true)
					newList.add(false)
	
					booleanVars.put(element.measurement,newList)
				}
			}
			else{
				if(comps.get(element.measurement) !== null)
				{
					comps.get(element.measurement) += (element.thresholdValue)
				}
				else
				{
					var Set<Literal> newList =  new HashSet<Literal>()
					newList.add((element.thresholdValue))
	
					comps.put(element.measurement,newList)
				}
			
			}
			
		}
		
	}
	
	def static List<MeasurementThresholdCondition> flattenAgain(MeasurementThresholdCondition c) {		
		val result = newArrayList
		
		var current = c
		result+= current

		while (current.secondTerm !== null && current.secondTerm instanceof MeasurementThresholdCondition) {
		    result += current.secondTerm as MeasurementThresholdCondition
		    current = current.secondTerm as MeasurementThresholdCondition
		}
		
		return result
	}
	
	def static List<FeatureCondition> flattenAgain(FeatureCondition c) {		
		val result = newArrayList
		
		var current = c
		result+= current

		while (current.secondTerm !== null && current.secondTerm instanceof MeasurementThresholdCondition) {
		    result += current.secondTerm as FeatureCondition
		    current = current.secondTerm as FeatureCondition
		}
		
		return result
	}
	
	private def static recordFeatureCondition(FeatureCondition feat_cond, Map<Feature, Set<Boolean>> sels)
	{
		for (element : flattenAgain(feat_cond)) {
			if(sels.get(element.variant) !== null)
			{
			}
			else
			{
				var Set<Boolean> newList =  new HashSet<Boolean>()
				newList.add(true)
				newList.add(false)

				sels.put(element.variant.feature,newList)
			}
			
		}
		
	}
	
	
}