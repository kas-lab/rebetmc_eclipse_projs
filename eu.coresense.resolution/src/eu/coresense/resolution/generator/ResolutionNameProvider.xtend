package eu.coresense.resolution.generator

import eu.coresense.common.INameProvider
import eu.coresense.common.NamingContext
import eu.coresense.common.Utilities
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
            SetParam: ctx.makeUnique("sp_" + Utilities.escape(obj.param.name.toLowerCase()))
            SetLifecycle: {
            	val nodeName = obj.node.name
            	ctx.makeUnique("slc_" + Utilities.escape(nodeName.toLowerCase()) + "_" + obj.state.toString().toLowerCase())
            }            
        }
    }	
	
} 