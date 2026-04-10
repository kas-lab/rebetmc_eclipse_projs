package eu.coresense.context.generator

import eu.coresense.common.INameProvider
import eu.coresense.context.contextModel.ContextVar
import eu.coresense.context.contextModel.DataSource
import eu.coresense.context.contextModel.QualifiedActionServerRef
import eu.coresense.context.contextModel.QualifiedPublisherRef
import eu.coresense.context.contextModel.QualifiedServiceServerRef
import eu.coresense.common.NamingContext
import eu.coresense.common.NameProvider

class ContextNameProvider implements INameProvider {
	val NameProvider nameProvider  // Keep reference to the main provider
    
    new(NameProvider nameProvider) {
        this.nameProvider = nameProvider
    }
	 override canHandle(Object obj) {
        return 
        obj instanceof ContextVar ||
		obj instanceof DataSource
    }
    
    override computeName(Object obj, NamingContext ctx, String... args) {
        switch obj {
            ContextVar: ctx.makeUnique("t_measured_" + obj.name.toLowerCase)
            DataSource: {
            	val nodeName = if (args.length > 0) args.get(0) else "noNodeNameGiven"
            	val ref = obj.ref
				if(ref instanceof QualifiedActionServerRef)
				{
					return nameProvider.uniqueName(ref.actionServer, nodeName)
				}
				if(ref instanceof QualifiedPublisherRef)
				{
					return nameProvider.uniqueName(ref.publisher, nodeName)
				}
				if(ref instanceof QualifiedServiceServerRef)
				{	
					return nameProvider.uniqueName(ref.serviceServer, nodeName)
				}	
				return "else"
            }
        }
    }	
	
}