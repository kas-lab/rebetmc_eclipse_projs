package eu.coresense.common

import java.util.ArrayList
import java.util.Map
import java.util.HashMap

interface INameProvider {
    def boolean canHandle(Object obj)
    def String computeName(Object obj, NamingContext ctx,  String... args)
}

class NamingContext {
    val Map<String, Integer> nameMap = newHashMap
    
    def String makeUnique(String baseName) {
       	val count = nameMap.get(baseName) ?: 0
	    val newName = if (count == 0) baseName else baseName + "_" + count
	    nameMap.put(baseName, count + 1)
	    newName
    }
}

class NameProvider {
    val providers = new ArrayList<INameProvider>
    val context = new NamingContext()
    val objectNameCache = new HashMap<Object, String> 
    
    def register(INameProvider provider) {
        providers.add(provider)
    }
    
    def String uniqueName(Object obj, String... args) {
        // Check cache first
        if(obj === null)
        {
        	throw new IllegalArgumentException("obj is null")
        }
        if (objectNameCache.containsKey(obj)) {
            return objectNameCache.get(obj)
        }
        
        // Compute new name
        val provider = providers.findFirst[canHandle(obj)]
        if (provider !== null) {
            val name = provider.computeName(obj, context, args)
            objectNameCache.put(obj, name)  // Cache it
            return name
        }
        throw new IllegalArgumentException("No provider for " + obj.class)
    }
}
