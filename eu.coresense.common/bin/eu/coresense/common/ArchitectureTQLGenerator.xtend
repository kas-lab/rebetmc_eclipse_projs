package eu.coresense.common

import java.util.List
import system.Component
import system.RosNode
import system.RosPublisherReference
import system.RosSubscriberReference
import system.SubSystem
import system.System
import java.util.Map
import org.eclipse.xtext.generator.AbstractGenerator
import com.google.inject.Inject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import ros.Parameter
import ros.ParameterSequence
import ros.ParameterValue
import ros.ParameterBoolean
import ros.ParameterDouble
import ros.ParameterString
import ros.ParameterInteger
import ros.InterfaceType

class ArchitectureTQLGenerator extends AbstractGenerator {
	extension NameProvider _namer
	
	@Inject
    new(NameProvider namer) {
        this._namer = namer
    }

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	}
	
	def String getInterfaceName(InterfaceType interface_, RosNode node){

	    var interfaceName = interface_.name
		for(interface: node.rosinterfaces)
		{
			val reference = interface.reference
			if(reference instanceof system.RosSubscriberReference)
			{
				if(reference.from === interface_)
				{
					interfaceName = interface.name
				}
			}
			if(reference instanceof system.RosPublisherReference)
			{
				if(reference.from === interface_)
				{
					interfaceName = interface.name
				}
			}
			if(reference instanceof system.RosActionClientReference)
			{
				if(reference.from === interface_)
				{
					interfaceName = interface.name
				}
			}
			if(reference instanceof system.RosActionServerReference)
			{
				if(reference.from === interface_)
				{
					interfaceName = interface.name
				}
			}
			if(reference instanceof system.RosServiceServerReference)
			{
				if(reference.from === interface_)
				{
					interfaceName = interface.name
				}
			}
			if(reference instanceof system.RosServiceClientReference)
			{
				if(reference.from === interface_)
				{
					interfaceName = interface.name
				}
			}
		}
		
		return interfaceName
    }
	
	// This is a class that should probably be inside .rossystem's generator, but I am avoiding modifying rosTooling for now.
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
	def String SchemaValueFromParam(ros.ParameterType param_type)
	{
		//(boolean|boolean_array|double|double_array|long|long_array|string|string_array)
		switch param_type
		{
			ros.ParameterBooleanType:
				"ValueBool"
			ros.ParameterDoubleType:
				"ValueDouble"
			ros.ParameterStringType:
				"ValueString"
			ros.ParameterIntegerType:
				"ValueInteger"
			ros.ParameterArrayType:
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
	
	def String paramSubClass (ros.ParameterType param_type)
	{
		//(boolean|boolean_array|double|double_array|long|long_array|string|string_array)
		switch param_type
		{
			ros.ParameterBooleanType:
				"ParameterBool"
			ros.ParameterDoubleType:
				"ParameterDouble"
			ros.ParameterStringType:
				"ParameterString"
			ros.ParameterIntegerType:
				"ParameterInteger"
			ros.ParameterArrayType:
				paramSubClass(param_type.type) + "Array" 
		}
		
	}
	
	def dispatch String ParamValueToString(ParameterSequence p) {
	    val parts = p.value.map[ParamValueToString(it)]
    	return "[" + parts.join(", ") + "]"
	}
	
	def dispatch String ParamValueToString(ParameterBoolean p) { p.value.toString()}
	def dispatch String ParamValueToString(ParameterInteger p) { p.value.toString()}
	def dispatch String ParamValueToString(ParameterDouble p) {
		return doubleToTQLDouble(p.value)
	}
	
	def doubleToTQLDouble(double d)
	{
		val format = new java.text.DecimalFormat("0.0############################")
		format.setMaximumFractionDigits(30)
		format.format(d).toString()
	}
	def dispatch String ParamValueToString(ParameterString p) { p.value}
	
	
	def dispatch String ParamValueToString(ParameterValue p) {
	    println("Unknown parameter type: " + p.class.name)
	    return "ValueTypeNotYetImplementedInGenerator"
	}
	
	def describeParameter(String name, ParameterValue the_value) {
		val paramValNiceName = NiceNameParamValueType(the_value)
		if(paramValNiceName == "string")
			'''
				$«name» isa «SchemaValueFromParam(the_value)», has «NiceNameParamValueType(the_value)»_value "«ParamValueToString(the_value)»";	
			'''
		else
		{
			'''
				$«name» isa «SchemaValueFromParam(the_value)», has «NiceNameParamValueType(the_value)»_value «ParamValueToString(the_value)»;	
			'''
			
		}
	}
	
	def describeParameter(String name, Parameter param) {
		if(param.value !== null)
		{
			describeParameter(name, param.value)
		}
		val the_type = param.type
		//TODO: Consider whether I should restore the 'has' and put an empty value.
		'''
			$«name» isa «SchemaValueFromParam(the_type)»;	
		'''

	}
	
	def String generateArchitectureInsertQuery(System rossystem, Boolean includeInsert)
    {
		'''
			«IF includeInsert»
				insert
			«ENDIF»
			
			«FOR rossys : collectAllSystems(rossystem)»
				«val nodesList = rosNodesFromSystem(rossys)»
				«FOR comp : nodesList»
					«generateInsertQuery(comp)»
				«ENDFOR»
				«processSubNodes(nodesList)»
				
			«ENDFOR»
		'''	      
    	
    }
    
    	
	def String generateArchitectureInsertQuery(System rossystem)
    {
		return generateArchitectureInsertQuery(rossystem, true)
    }
    
    
	def String describeNode(ros.Node node, String namespace)
	{
		val serviceServers = node.getServiceserver();
	    
	    val isLifecycle = serviceServers.exists[ server | server.service.fullname == "lifecycle_msgs/ChangeState"]
	    
	    val node_kind = isLifecycle ? "LifeCycleNode" : "ROSNode"
	    val nodeName = _namer.uniqueName(node)
		'''
			$«nodeName» isa «node_kind»,
			has node_name "«node.name»",
			has namespace "«namespace»";
		'''
	}
      
    def List<Parameter> getParameters(RosNode node)
	{
		val originalParameters = node.from.parameter
		
		for (parameter_override : node.rosparameters) {
			val indexOverride = originalParameters.indexOf(parameter_override.from)
			originalParameters.get(indexOverride).value = parameter_override.value
		}
		
		return originalParameters
	}
	
	def Pair<CharSequence, String> ParamValueToValueEntity(Parameter the_parameter, String parent_name) {
		val the_value = the_parameter.value
//		println("parent_name " + parent_name)
//		println("thevalue " + the_value)
		if(the_value instanceof ParameterSequence)
		{
			
			val result = newArrayList
			val parseq_name = _namer.uniqueName(the_value, parent_name)
//			println(parseq_name)
//			println(the_value.value)
			val body = '''
				$«parseq_name» isa ValueArray;
				«FOR param_value : the_value.value.indexed»
					«describeParameter(_namer.uniqueName(param_value.value, parent_name), param_value.value)»
					$«parseq_name»_elem_«param_value.key» (array: $«parseq_name», array_value: $«_namer.uniqueName(param_value.value, parent_name)») isa at_index, has index «param_value.key»;
				«ENDFOR»
				
			'''
			// Insert end thing for the actual array :-)
			for (param_value : the_value.value) {
				result.add(_namer.uniqueName(param_value, parent_name))
			}
			return body -> parseq_name
		} 
		else
		{
			val name = _namer.uniqueName(the_value, parent_name)
			val single = describeParameter(name, the_parameter.value)
			return single -> name
		}
	}
	
	def int handleDuration(String duration_field)
    {
    	if(duration_field == 'infinite')
    	{
    		return 0
    	}
    	else
    	{
    		Integer.parseInt(duration_field)
    	}
    }
	
	def String handleQoS(ros.QualityOfService qos, String interfaceName)
    {
    	if(qos !== null)
    	{
    	val qosName = _namer.uniqueName(qos, interfaceName)
    	// TODO: Make it so that these IFs are not necessary. This requires making sure ros2model generates complete qos descriptions for each interface.
    	val qosProps = newArrayList(
		    if (qos.reliability !== null) 'has reliability "' + qos.reliability.toUpperCase + '"' else null,
		    if (qos.history !== null) 'has history "' + qos.history.toUpperCase + '"' else null,
		    if (qos.depth != 0) 'has depth ' + qos.depth else null,
		    if (qos.durability !== null) 'has durability "' + qos.durability.toUpperCase + '"' else null,
		    if (qos.lifespan !== null) 'has lifespan ' + handleDuration(qos.lifespan) else null,
		    if (qos.deadline !== null) 'has deadline ' + handleDuration(qos.deadline) else null,
		    if (qos.liveliness !== null) 'has liveliness "' + qos.liveliness.toUpperCase + '"' else null,
		    if (qos.leaseDuration !== null) 'has lease_duration ' + handleDuration(qos.leaseDuration) else null
		).filterNull
    	'''
				
				$«qosName» isa QoSProfile,
				 	   	«qosProps.join(",\n")»
				;
				
				$«qosName»_rel (interface: $«interfaceName», qos: $«qosName») isa has_qos;
			'''
    	}
    }
    
    def String generateInsertQuery(RosNode node)
    {
    	val innerNode = node.from
	    
	    val nodeName = _namer.uniqueName(innerNode)
	    '''
			«describeNode(innerNode, node.namespace)»
			«FOR parameter : node.getParameters»
				$«_namer.uniqueName(parameter)» isa «paramSubClass(parameter.type)»,
					has parameter_name "«parameter.name»";
				«IF parameter.value !==null»
					«val paramstringpair = ParamValueToValueEntity(parameter, _namer.uniqueName(parameter))»
					«paramstringpair.key»
					(node: $«nodeName»,
					parameter: $«_namer.uniqueName(parameter)»,
					parameter_value: $«paramstringpair.value»)
						isa has_parameter_value, has default_value true;
				«ENDIF»
			«ENDFOR»
			«IF !node.getParameters.empty»
				
				$«nodeName»_parameters (
					node: $«nodeName»,
					«FOR parameter : node.getParameters SEPARATOR ", "»
						parameter: $«_namer.uniqueName(parameter)»
					«ENDFOR»
					) isa has_parameter;
			«ENDIF»
			«FOR subscription : innerNode.subscriber»
				«val subName = _namer.uniqueName(subscription, nodeName)»
				«var topicName = getInterfaceName(subscription,node)»
				$«subName» isa Subscriber,
				has interface_name "«topicName»",
				has interface_type "«subscription.message.fullname»";
				«handleQoS(subscription.qos, subName)»
				
				(node: $«nodeName», subscriber: $«subName») isa has_topic;
				
			«ENDFOR»
			«FOR publication : innerNode.publisher»
				«val pubName = _namer.uniqueName(publication, nodeName)»
				«var topicName = getInterfaceName(publication,node)»
				$«pubName» isa Publisher,
				has interface_name "«topicName»",
				has interface_type "«publication.message.fullname»";
				«handleQoS(publication.qos, pubName)»
				
				(node: $«nodeName», publisher: $«pubName») isa has_topic;
			«ENDFOR»
			«FOR actionClient : innerNode.actionclient»
				«val acName = _namer.uniqueName(actionClient, nodeName)»
				«var interfaceName = getInterfaceName(actionClient,node)»
				$«acName» isa ActionClient,
				has interface_name "«interfaceName»",
				has interface_type "«actionClient.action.fullname»";
				(node: $«nodeName», client: $«acName») isa has_action;	
			«ENDFOR»
			«FOR actionServer : innerNode.actionserver»
				«val asName = _namer.uniqueName(actionServer, nodeName)»
				«var interfaceName = getInterfaceName(actionServer,node)»
				$«asName» isa ActionServer,
				has interface_name "«interfaceName»",
				has interface_type "«actionServer.action.fullname»";
				(node: $«nodeName», server: $«asName») isa has_action;	
			«ENDFOR»
			«FOR serviceClient : innerNode.serviceclient»
				«val acName = _namer.uniqueName(serviceClient, nodeName)»
				«var interfaceName = getInterfaceName(serviceClient,node)»
				$«acName» isa ServiceClient,
				has interface_name "«interfaceName»",
				has interface_type "«serviceClient.service.fullname»";
				(node: $«nodeName», client: $«acName») isa has_service;	
			«ENDFOR»
			«FOR serviceServer : innerNode.serviceserver»
				«val asName = _namer.uniqueName(serviceServer, nodeName)»
				«var interfaceName = getInterfaceName(serviceServer,node)»
				$«asName» isa ServiceServer,
				has interface_name "«interfaceName»",
				has interface_type "«serviceServer.service.fullname»";
				(node: $«nodeName», server: $«asName») isa has_service;	
			«ENDFOR»
		'''			    
    }
    
    def List<System> collectAllSystems(System rossystem) {
    	val List<System> result = newArrayList
        collectRecursively(rossystem, result)
        return result       
    }
    
    private def void collectRecursively(System ros_sys, List<System> result) {
    	if (ros_sys === null || result.contains(ros_sys)) return;
    	result.add(ros_sys);

	    for (Component comp : ros_sys.getComponents()) {
	        if (comp instanceof SubSystem) {
	            collectRecursively(comp.getSystem(), result);
	        }
	    }
	}
	
	def String processSubNodes(List<RosNode> rosNodes)
    {
    	val Map<ros.Node, List<RosNode>> parenthood = newHashMap
    	for (rosNode : rosNodes)
    	{
    		if(rosNode.parent !== null)
    		{
    			var children = parenthood.get(rosNode.parent)
		        if (children === null) {
		            children = newArrayList
		            parenthood.put(rosNode.parent, children)
		        }
		        children.add(rosNode)
    		}

    	}
    	'''
			«FOR family : parenthood.entrySet»
				(node: $«uniqueName(family.key)»,
				«FOR child : family.value SEPARATOR ", "» 
					subnode: $«uniqueName(child.from)»
				«ENDFOR»
				) isa subnode;
			«ENDFOR»
		'''
    }
    
    def List<RosNode> rosNodesFromSystem(System ros_system) {
    	val node_list = newArrayList
    	
    	for (component : ros_system.components)
    	{
    		if(component instanceof RosNode)
    		{
    			node_list.add(component as RosNode)
    		}
    	}
    	
    	return node_list    	
    }
				    
}
