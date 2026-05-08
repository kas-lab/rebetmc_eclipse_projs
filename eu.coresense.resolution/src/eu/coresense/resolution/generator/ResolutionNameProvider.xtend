package eu.coresense.resolution.generator

import eu.coresense.common.INameProvider
import eu.coresense.common.NamingContext
import eu.coresense.resolution.resolutionModel.Resolution
import eu.coresense.resolution.resolutionModel.SetParam
import eu.coresense.resolution.resolutionModel.SetLifecycle
import eu.coresense.resolution.resolutionModel.Reconfiguration

class ResolutionNameProvider implements INameProvider {
	 override canHandle(Object obj) {
        return 
        obj instanceof Resolution ||
		obj instanceof SetParam ||
		obj instanceof SetLifecycle ||
		obj instanceof Reconfiguration
    }
    
    override computeName(Object obj, NamingContext ctx, String... args) {
        switch obj {
            Resolution: ctx.makeUnique(obj.featureRef.feature.name.toLowerCase() + "_resolution")
            SetParam: ctx.makeUnique("sp_" + obj.param.name.toLowerCase())
            SetLifecycle: {
            	val nodeName = if (args.length > 0) args.get(0) else "noNodeNameGiven"
            	ctx.makeUnique("slc_" + nodeName.toLowerCase() + "_" + obj.state.toString().toLowerCase())
            }
            Reconfiguration: {
            	val node = obj.node
				if(obj instanceof SetParam)
				{
					return computeName(obj, ctx)
				}
				else if(obj instanceof SetLifecycle)
				{
					return computeName(obj, ctx, node.name)	
				}
            }
            
        }
    }	
	
}