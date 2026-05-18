package eu.coresense.common

import java.util.List
import java.util.ArrayList
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.common.util.URI

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
	
	def static <T extends Object> List<T> deriveFromImports(Resource resource, String fileSuffix, List<Import> imports, Class<T> clas)
	{
		val List<T> entities = newArrayList
		
		for (imp : imports) {
			if(imp.importURI.endsWith(fileSuffix))
			{
				var uri = URI.createURI(imp.importURI)
				if (uri.isRelative()) {
					
            		uri = uri.resolve(resource.getURI());
        		}
        		val imported = resource.resourceSet.getResource(uri, true);
        		if (imported === null || imported.getContents().isEmpty()) 
        		{
        			println("ResolutionModel import fail")
        		}
        			
        		
        		val root = imported.getContents().get(0);
	            if (clas.isInstance(root)) {
	               	entities.add(clas.cast(root))
				}
				
			}
			
		}
		
		return entities;	
		
	}
	
	def static String escape(String name) {
        var noSlash = name.replace("/", "_slash_")
        var noTildenoSlash = noSlash.replace("~","_tilde_")
        noTildenoSlash.replace(".","_dot_")
    }

    /** Unescape `_slash_` back to `/` */
    def static String unescape(String name) {
        var withSlash = name.replace("_slash_", "/")
        var withTildewithSlash = withSlash.replace("_tilde_","~")
        withTildewithSlash.replace("_dot_",".")
        
    }
}
