package eu.coresense.adaptation.generator

import eu.coresense.adaptation.tactics.Condition
import eu.coresense.adaptation.tactics.MeasurementCondition
import eu.coresense.adaptation.tactics.MeasurementThresholdCondition
import eu.coresense.common.Utilities
import eu.coresense.adaptation.tactics.MeasurementMeasurementCondition
import eu.coresense.adaptation.tactics.FeatureCondition
import eu.coresense.common.Literal
import eu.coresense.common.IntLiteral
import eu.coresense.common.DecimalLiteral
import eu.coresense.common.StringLiteral
import eu.coresense.common.BooleanLiteral
import eu.coresense.adaptation.tactics.LogicalOperator
import java.util.List

abstract class Expr {

	def static toCNF(Condition condition)
	{
			var toCheck = ConditionToExpr(condition)
			return toCNF(toCheck)
	}
	
	def static Expr ConditionToExpr(Condition condition)
	{
	    // Base variable is the FIRST condition
	    var Expr expr = new Var(condition)
	
	    // Flatten the chain of (op, nextCondition)
	    val ops = flatten(condition)
	
	    // Fold left: ((A op B) op C)
	    for (pair : ops) {
	        val op = pair.key
	        val next = pair.value
	
	        val rightExpr = new Var(next)
	
	        switch op {
	            case LogicalOperator.AND:
	                expr = new And(expr, rightExpr)
	            case LogicalOperator.OR:
	                expr = new Or(expr, rightExpr)
	        }
	    }
	
	    return expr
	}
	
	def static List<Pair<LogicalOperator, Condition>> flatten(FeatureCondition c) {		
		val result = newArrayList
		
		var current = c
		while (current.secondTerm !== null) {
		    result += current.logicalOp -> current.secondTerm as Condition
		    current = current.secondTerm
		}
		
		return result
	}
	
	def static List<Pair<LogicalOperator, Condition>> flatten(Condition c) {
		if(c instanceof MeasurementCondition)
		{
			return flatten(c)
		}
		if(c instanceof FeatureCondition)
		{
			return flatten(c)
		}
		else
		{
			println("REDFLAGGG")
			return null
		}
	}
	
	def static void flattenORs(Expr e, List<Var> expressionList)
	{
	    switch e {
	        Or: {
	            flattenORs(e.left, expressionList)
	            flattenORs(e.right, expressionList)
	        }
	        And: throw new Exception("There shouldn't be an AND in the OR flattening")
	        Var: expressionList.add(e)
	    }
	}
	
	def static List<Expr> flattenAnds(Expr e) {
    switch e {
        And: {
            val leftClauses  = flattenAnds(e.left)
            val rightClauses = flattenAnds(e.right)
            (leftClauses + rightClauses).toList
        }
        default:
            #[e]  // single clause
    }
}
	
	def static List<Pair<LogicalOperator, Condition>> flatten(MeasurementCondition c) {		
		val result = newArrayList
		var current = c
		while (current.secondTerm !== null) {
		    result += current.logicalOp -> current.secondTerm as Condition
		    current = current.secondTerm
		}
		return result
	}
	
	
	def static Expr distribute(Expr e) {
    	switch e {
	
	        Or: {
	            val A = distribute(e.left)
	            val B = distribute(e.right)
	
	            // A ∨ (B ∧ C) → (A ∨ B) ∧ (A ∨ C)
	            if (B instanceof And) {
	                return new And(
	                    distribute(new Or(A, B.left)),
	                    distribute(new Or(A, B.right))
	                )
	            }
	
	            // (A ∧ B) ∨ C → (A ∨ C) ∧ (B ∨ C)
	            if (A instanceof And) {
	                return new And(
	                    distribute(new Or(A.left, B)),
	                    distribute(new Or(A.right, B))
	                )
	            }
	
	            // Otherwise it's just OR of two non-ANDs
	            return new Or(A, B)
	        }
	
	        And: {
	            // Push distribute through both sides
	            val L = distribute(e.left)
	            val R = distribute(e.right)
	            return new And(L, R)
	        }
	
	        default:
	            // Var or unknown → unchanged
	            return e
	    }
	}

	def static toCNF(Expr expression)
	{
		if (!isCNFConjunction(expression) ){
			return distribute(expression)
		}
			
		return expression;
	}
	
	def static boolean isCNFConjunction(Expr e) {
	    switch e {
	        And: return isCNFConjunction(e.left) && isCNFConjunction(e.right)
	        default: return isClause(e)
	    }
	}
	def static boolean isClause(Expr e) {
	    switch e {
	        Or: return isClause(e.left) && isClause(e.right)
	        Var: return true
	        default: return false
	    }
	}
	
}

	


class Var extends Expr {
    public Condition condition //lone Condition

    new(Condition condition) {
        this.condition = condition
    }

    override toString() {
    	if(this.condition instanceof MeasurementCondition)
    	{
    		if(this.condition instanceof MeasurementThresholdCondition)
        	{
        		condition.measurement.name + condition.operator + Utilities.valueOfLiteral(condition.thresholdValue)
        	}
        	else if(this.condition instanceof MeasurementMeasurementCondition)
        	{
        		condition.measurement.name + condition.operator + condition.otherMeasurement.name
        	}
        }
        else if(this.condition instanceof FeatureCondition)
        {
        	if(this.condition.not === null || this.condition.not == "")
        	{
        		"isSelected(" + condition.variant.model.name + "." + condition.variant.feature.name + ")"	
        	}
        	else
        	{
        		"!isSelected(" + condition.variant.model.name + "." + condition.variant.feature.name + ")"
        	}
        }
    }
    
    def valueOfLiteral(Literal lit)
    {
    	if(lit instanceof IntLiteral)
    	{
    		return lit.value
    	}
    	if(lit instanceof DecimalLiteral)
    	{
    		return lit.value
    	}
    	if(lit instanceof StringLiteral)
    	{
    		return lit.value
    	}
    	if(lit instanceof BooleanLiteral)
    	{
    		return lit.value
    	}
    }
}

class And extends Expr {
    public Expr left
    public Expr right

    new(Expr left, Expr right) {
        this.left = left
        this.right = right
    }

    override toString() {
        "(" + left + " ∧ " + right + ")"
    }
}

class Or extends Expr {
    public Expr left
    public Expr right

    new(Expr left, Expr right) {
        this.left = left
        this.right = right
    }

    override toString() {
        "(" + left + " ∨ " + right + ")"
    }
}
