package eu.coresense.common

import java.math.BigDecimal
import java.util.Comparator

class LiteralExtensions {

    def static double operator_plus(Literal left, Literal right) {
        switch left {
            IntLiteral: {
                switch right {
                    IntLiteral:
                        left.value + right.value
                    default:
                        throw new IllegalArgumentException()
                }
            }
            DecimalLiteral: {
                switch right {
                    DecimalLiteral:
                        (left.value).doubleValue() + (right.value).doubleValue()
                    default:
                        throw new IllegalArgumentException()
                }
            }
            default:
                throw new IllegalArgumentException()
        }
    }
    
    def static double operator_divide(Literal left, Literal right) {
        switch left {
            IntLiteral: {
                switch right {
                    IntLiteral:
                        left.value / right.value
                    default:
                        throw new IllegalArgumentException()
                }
            }
            DecimalLiteral: {
                switch right {
                    DecimalLiteral:
                        (left.value / right.value).doubleValue()
                    default:
                        throw new IllegalArgumentException()
                }
            }
            default:
                throw new IllegalArgumentException()
        }
    }
    
    def static double operator_divide(Literal left, int right) {
        switch left {
            IntLiteral: {
                        left.value / right
            }
            DecimalLiteral: {
                        (left.value).doubleValue() / right
            }
            default:
                throw new IllegalArgumentException()
        }
    }
    
   def static boolean operator_lessThan(Literal literal, Literal literal2)
	{
		switch obj : literal {
            IntLiteral:     obj.value < (literal2 as IntLiteral).value
            DecimalLiteral: obj.value < (literal2 as DecimalLiteral).value
            StringLiteral:  obj.value < (literal2 as StringLiteral).value
            BooleanLiteral: obj.value < (literal2 as BooleanLiteral).value
            default:        false
        }
	}
	
	def static boolean operator_lessEqualsThan(Literal literal, Literal literal2)
	{
		switch obj : literal {
            IntLiteral:     obj.value <= (literal2 as IntLiteral).value
            DecimalLiteral: obj.value <= (literal2 as DecimalLiteral).value
            StringLiteral:  obj.value <= (literal2 as StringLiteral).value
            BooleanLiteral: obj.value <= (literal2 as BooleanLiteral).value
            default:        false
        }
	}
	
	def static boolean operator_greaterEqualsThan(Literal literal, Literal literal2)
	{
		switch obj : literal {
            IntLiteral:     obj.value >= (literal2 as IntLiteral).value
            DecimalLiteral: obj.value >= (literal2 as DecimalLiteral).value
            StringLiteral:  obj.value >= (literal2 as StringLiteral).value
            BooleanLiteral: obj.value >= (literal2 as BooleanLiteral).value
            default:        false
        }
	}
	
	def static boolean operator_greaterThan(Literal literal, Literal literal2)
	{
		switch obj : literal {
            IntLiteral:     obj.value > (literal2 as IntLiteral).value
            DecimalLiteral: obj.value > (literal2 as DecimalLiteral).value
            StringLiteral:  obj.value > (literal2 as StringLiteral).value
            BooleanLiteral: obj.value > (literal2 as BooleanLiteral).value
            default:        false
        }
	}
	
	
			
	def static boolean operator_greaterThan(Double number, Literal literal)
	{
	        switch literal {
	            IntLiteral: {
	                        number > literal.value
	            }
	           	DecimalLiteral: {
	                        number > (literal.value).doubleValue()
	            }
	            default:
	                throw new IllegalArgumentException()
	        }
	        
	}
	
	def static boolean operator_lessThan(Double number, Literal literal)
	{
			switch literal {
	            IntLiteral: {
	                        number < literal.value
	            }
	           	DecimalLiteral: {
	                        number < (literal.value).doubleValue()
	            }
	            default:
	                throw new IllegalArgumentException()
	        }
	        
	}
	
	def static boolean sameValue(Literal a, Literal b) {
	    switch a {
	        IntLiteral:     b instanceof IntLiteral     && a.value == (b as IntLiteral).value
	        DecimalLiteral: b instanceof DecimalLiteral && a.value == (b as DecimalLiteral).value
	        StringLiteral:  b instanceof StringLiteral  && a.value == (b as StringLiteral).value
	        BooleanLiteral: b instanceof BooleanLiteral && a.value == (b as BooleanLiteral).value
	        default: false
	    }
	}
	
	def static String render(Literal literal) {
        switch literal {
            IntLiteral: literal.value.toString
            DecimalLiteral: literal.value.toString
            StringLiteral: '"' + literal.value + '"'
            BooleanLiteral: literal.value.toString
        }
    }
	
	
	
		
}


class LiteralComparator implements Comparator<Literal> {

    override compare(Literal a, Literal b) {
        switch a {
            IntLiteral: switch b {
                IntLiteral:
                    a.value.compareTo(b.value)
                default:
                    throw new IllegalArgumentException()
            }
            DecimalLiteral: switch b {
                DecimalLiteral:
                    a.value.compareTo(b.value)
                default:
                    throw new IllegalArgumentException()
            }
            BooleanLiteral: switch b {
                BooleanLiteral:
                    a.value.compareTo(b.value)
                default:
                    throw new IllegalArgumentException()
            }
            
            default:
                throw new IllegalArgumentException()
        }
    }
}

