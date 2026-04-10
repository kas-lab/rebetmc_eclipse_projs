package eu.coresense.variability;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

import uma.caosd.rhea.*;
import uma.caosd.rhea.BasicFMmetamodel.Alternative;
import uma.caosd.rhea.BasicFMmetamodel.Feature;
import uma.caosd.rhea.BasicFMmetamodel.OrGroup;

public class FeatureModelResource extends XtextResource {

    @Override
    protected void updateInternalState(IParseResult newParseResult) {
        super.updateInternalState(newParseResult);  // linking happens here
        syncIdsFromNames();
    }

    private void syncIdsFromNames() {
        getAllContents().forEachRemaining(obj -> {
            if (obj instanceof Alternative) {
                Alternative a = (Alternative) obj;
                a.setId(a.getName());
            } else if (obj instanceof OrGroup) {
                OrGroup og = (OrGroup) obj;
                og.setId(og.getName());
            } else if (obj instanceof Feature) {
                Feature f = (Feature) obj;
                f.setId(f.getName());
            }
        });
    }
}