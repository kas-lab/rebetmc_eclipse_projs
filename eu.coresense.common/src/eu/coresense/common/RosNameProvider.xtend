package eu.coresense.common

class RosNameProvider implements INameProvider {
	 override canHandle(Object obj) {
        return 
        obj instanceof ros.Subscriber ||
		obj instanceof ros.Publisher ||
		obj instanceof ros.ActionClient ||
		obj instanceof ros.ActionServer ||
		obj instanceof ros.ServiceClient ||
		obj instanceof ros.ServiceServer ||
		obj instanceof ros.QualityOfService ||
		obj instanceof ros.Node ||
		obj instanceof ros.Parameter ||
		obj instanceof ros.ParameterValue ||
		obj instanceof ros.ParameterSequence ||
		obj instanceof system.RosNode
    }
    
    override computeName(Object obj, NamingContext ctx, String... args) {
        switch obj {
        	ros.Subscriber: {
            	val nodeName = if (args.length > 0) args.get(0) else "noNodeNameGiven"
            	ctx.makeUnique(nodeName + "_sub")
            	}
			ros.Publisher: {
            	val nodeName = if (args.length > 0) args.get(0) else "noNodeNameGiven"
            	ctx.makeUnique(nodeName + "pub")
            	}
			ros.ActionClient: {
            	val nodeName = if (args.length > 0) args.get(0) else "noNodeNameGiven"
            	ctx.makeUnique(nodeName + "_action_client")
            	}
			ros.ActionServer: {
            	val nodeName = if (args.length > 0) args.get(0) else "noNodeNameGiven"
            	ctx.makeUnique(nodeName + "_action_server")
            	}
			ros.ServiceClient: {
            	val nodeName = if (args.length > 0) args.get(0) else "noNodeNameGiven"
            	ctx.makeUnique(nodeName + "_service_client")
            	}
			ros.ServiceServer: {
            	val nodeName = if (args.length > 0) args.get(0) else "noNodeNameGiven"
            	ctx.makeUnique(nodeName + "_service_server")
            	}
			ros.QualityOfService: {
            	val interfaceName = if (args.length > 0) args.get(0) else "noInterfaceNameGiven"
            	ctx.makeUnique(interfaceName + "_qos")
            	}
            ros.ParameterSequence: {
            	val parentID = if (args.length > 0) args.get(0) else "noParentIDGiven"
            	ctx.makeUnique(parentID + "_p_array_value")
            }
            ros.ParameterValue: {
            	val parentID = if (args.length > 0) args.get(0) else "noParentIDGiven"
            	ctx.makeUnique(parentID + "_pvalue")
            	}
			ros.Node: ctx.makeUnique(obj.name.replace("/", "") + "_node")
			ros.Parameter: ctx.makeUnique(obj.name.replace('.','_').replace('/','') + "_param")
			system.RosNode: ctx.makeUnique(obj.name.replace("/", "") + "_node") //TODO: This should probably be different from ros.Node, something like, recursive(obj.from + "rosNode")
        }
    }	
	
}
