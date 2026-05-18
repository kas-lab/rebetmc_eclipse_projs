package eu.coresense.resolution;

import eu.coresense.resolution.resolutionModel.ResolutionModel;
import uma.caosd.rhea.BasicFMmetamodel.Feature;

import java.util.ArrayList;
import java.util.List;

import eu.coresense.resolution.resolutionModel.Reconfiguration;
import eu.coresense.resolution.resolutionModel.Resolution;

public class Resolver {
	ResolutionModel model;
	public Resolver(ResolutionModel model) {
		this.model = model;
	}
	
	public List<Reconfiguration> selectionActions(String featureName) {
		
		List<Reconfiguration> actions = new ArrayList<>();
		for(Resolution r : model.getResolutions()) {
			if(r.getFeatureRef().getFeature().getName().equals(featureName)) {
				actions.addAll(r.getSelection_actions());
			}
		}
		return actions;
	}
	
	public List<Reconfiguration> deselectionActions(String featureName) {
		
		List<Reconfiguration> actions = new ArrayList<>();
		for(Resolution r : model.getResolutions()) {
			if(r.getFeatureRef().getFeature().getName().equals(featureName)) {
				actions.addAll(r.getDeselection_actions());
			}
		}
		return actions;
	}
	
	public List<Reconfiguration> selectionActions(Feature feature) {
		
		List<Reconfiguration> actions = new ArrayList<>();
		for(Resolution r : model.getResolutions()) {
			if(r.getFeatureRef().getFeature() == feature) {
				actions.addAll(r.getSelection_actions());
			}
		}
		return actions;
	}
	
	public List<Reconfiguration> deselectionActions(Feature feature) {
		List<Reconfiguration> actions = new ArrayList<>();
		for(Resolution r : model.getResolutions()) {
			if(r.getFeatureRef().getFeature() == feature) {
				actions.addAll(r.getDeselection_actions());
			}
		}
		return actions;
	}

}
