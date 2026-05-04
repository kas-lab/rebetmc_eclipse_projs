package eu.coresense.common

import java.util.List
import java.util.ArrayList

class Utilities {
	def static valueOfLiteral(Literal lit)
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
    
    
	def static <T extends Object> List<List<T>> getCartesianProduct(List<List<T>> sets) {
	    val List<List<T>> result = newArrayList
	    getCartesianProductHelper(sets, 0, newArrayList, result);
	    return result;
	}
	
	def static <T extends Object> void getCartesianProductHelper(List<List<T>> sets, int index, List<T> current, List<List<T>> result) {
	    if (index == sets.size()) {
	        result.add(new ArrayList(current))
	        return
	    }
	    val List<T> currentSet = sets.get(index);
	    for (T element: currentSet) {
	        current.add(element)
	        getCartesianProductHelper(sets, index+1, current, result)
	        current.remove(current.size() - 1)
	    }
	}
}
