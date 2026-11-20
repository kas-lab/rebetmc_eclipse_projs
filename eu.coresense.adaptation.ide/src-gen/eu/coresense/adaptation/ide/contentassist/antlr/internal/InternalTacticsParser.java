package eu.coresense.adaptation.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import eu.coresense.adaptation.services.TacticsGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTacticsParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_DECIMAL", "RULE_BOOLEAN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'=='", "'!='", "'>='", "'<='", "'AND'", "'OR'", "'name'", "';'", "'{'", "'}'", "'import'", "'rule'", "'action'", "'guard'", "'context'", "'('", "')'", "'features'", "'selected('", "'select_variant'", "'unselect_variant'", "'.'", "'!'"
    };
    public static final int RULE_BOOLEAN=8;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_DECIMAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTacticsParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTacticsParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTacticsParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTactics.g"; }


    	private TacticsGrammarAccess grammarAccess;

    	public void setGrammarAccess(TacticsGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleTacticsModel"
    // InternalTactics.g:53:1: entryRuleTacticsModel : ruleTacticsModel EOF ;
    public final void entryRuleTacticsModel() throws RecognitionException {
        try {
            // InternalTactics.g:54:1: ( ruleTacticsModel EOF )
            // InternalTactics.g:55:1: ruleTacticsModel EOF
            {
             before(grammarAccess.getTacticsModelRule()); 
            pushFollow(FOLLOW_1);
            ruleTacticsModel();

            state._fsp--;

             after(grammarAccess.getTacticsModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTacticsModel"


    // $ANTLR start "ruleTacticsModel"
    // InternalTactics.g:62:1: ruleTacticsModel : ( ( rule__TacticsModel__Group__0 ) ) ;
    public final void ruleTacticsModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:66:2: ( ( ( rule__TacticsModel__Group__0 ) ) )
            // InternalTactics.g:67:2: ( ( rule__TacticsModel__Group__0 ) )
            {
            // InternalTactics.g:67:2: ( ( rule__TacticsModel__Group__0 ) )
            // InternalTactics.g:68:3: ( rule__TacticsModel__Group__0 )
            {
             before(grammarAccess.getTacticsModelAccess().getGroup()); 
            // InternalTactics.g:69:3: ( rule__TacticsModel__Group__0 )
            // InternalTactics.g:69:4: rule__TacticsModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TacticsModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTacticsModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTacticsModel"


    // $ANTLR start "entryRuleTactic"
    // InternalTactics.g:78:1: entryRuleTactic : ruleTactic EOF ;
    public final void entryRuleTactic() throws RecognitionException {
        try {
            // InternalTactics.g:79:1: ( ruleTactic EOF )
            // InternalTactics.g:80:1: ruleTactic EOF
            {
             before(grammarAccess.getTacticRule()); 
            pushFollow(FOLLOW_1);
            ruleTactic();

            state._fsp--;

             after(grammarAccess.getTacticRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTactic"


    // $ANTLR start "ruleTactic"
    // InternalTactics.g:87:1: ruleTactic : ( ( rule__Tactic__Alternatives ) ) ;
    public final void ruleTactic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:91:2: ( ( ( rule__Tactic__Alternatives ) ) )
            // InternalTactics.g:92:2: ( ( rule__Tactic__Alternatives ) )
            {
            // InternalTactics.g:92:2: ( ( rule__Tactic__Alternatives ) )
            // InternalTactics.g:93:3: ( rule__Tactic__Alternatives )
            {
             before(grammarAccess.getTacticAccess().getAlternatives()); 
            // InternalTactics.g:94:3: ( rule__Tactic__Alternatives )
            // InternalTactics.g:94:4: rule__Tactic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Tactic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTacticAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTactic"


    // $ANTLR start "entryRuleActionTactics"
    // InternalTactics.g:103:1: entryRuleActionTactics : ruleActionTactics EOF ;
    public final void entryRuleActionTactics() throws RecognitionException {
        try {
            // InternalTactics.g:104:1: ( ruleActionTactics EOF )
            // InternalTactics.g:105:1: ruleActionTactics EOF
            {
             before(grammarAccess.getActionTacticsRule()); 
            pushFollow(FOLLOW_1);
            ruleActionTactics();

            state._fsp--;

             after(grammarAccess.getActionTacticsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActionTactics"


    // $ANTLR start "ruleActionTactics"
    // InternalTactics.g:112:1: ruleActionTactics : ( ( rule__ActionTactics__Group__0 ) ) ;
    public final void ruleActionTactics() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:116:2: ( ( ( rule__ActionTactics__Group__0 ) ) )
            // InternalTactics.g:117:2: ( ( rule__ActionTactics__Group__0 ) )
            {
            // InternalTactics.g:117:2: ( ( rule__ActionTactics__Group__0 ) )
            // InternalTactics.g:118:3: ( rule__ActionTactics__Group__0 )
            {
             before(grammarAccess.getActionTacticsAccess().getGroup()); 
            // InternalTactics.g:119:3: ( rule__ActionTactics__Group__0 )
            // InternalTactics.g:119:4: rule__ActionTactics__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActionTactics__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActionTacticsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActionTactics"


    // $ANTLR start "entryRuleImport"
    // InternalTactics.g:128:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalTactics.g:129:1: ( ruleImport EOF )
            // InternalTactics.g:130:1: ruleImport EOF
            {
             before(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getImportRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalTactics.g:137:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:141:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalTactics.g:142:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalTactics.g:142:2: ( ( rule__Import__Group__0 ) )
            // InternalTactics.g:143:3: ( rule__Import__Group__0 )
            {
             before(grammarAccess.getImportAccess().getGroup()); 
            // InternalTactics.g:144:3: ( rule__Import__Group__0 )
            // InternalTactics.g:144:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRulePureTactic"
    // InternalTactics.g:153:1: entryRulePureTactic : rulePureTactic EOF ;
    public final void entryRulePureTactic() throws RecognitionException {
        try {
            // InternalTactics.g:154:1: ( rulePureTactic EOF )
            // InternalTactics.g:155:1: rulePureTactic EOF
            {
             before(grammarAccess.getPureTacticRule()); 
            pushFollow(FOLLOW_1);
            rulePureTactic();

            state._fsp--;

             after(grammarAccess.getPureTacticRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePureTactic"


    // $ANTLR start "rulePureTactic"
    // InternalTactics.g:162:1: rulePureTactic : ( ( rule__PureTactic__Group__0 ) ) ;
    public final void rulePureTactic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:166:2: ( ( ( rule__PureTactic__Group__0 ) ) )
            // InternalTactics.g:167:2: ( ( rule__PureTactic__Group__0 ) )
            {
            // InternalTactics.g:167:2: ( ( rule__PureTactic__Group__0 ) )
            // InternalTactics.g:168:3: ( rule__PureTactic__Group__0 )
            {
             before(grammarAccess.getPureTacticAccess().getGroup()); 
            // InternalTactics.g:169:3: ( rule__PureTactic__Group__0 )
            // InternalTactics.g:169:4: rule__PureTactic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PureTactic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPureTacticAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePureTactic"


    // $ANTLR start "entryRuleSelection"
    // InternalTactics.g:178:1: entryRuleSelection : ruleSelection EOF ;
    public final void entryRuleSelection() throws RecognitionException {
        try {
            // InternalTactics.g:179:1: ( ruleSelection EOF )
            // InternalTactics.g:180:1: ruleSelection EOF
            {
             before(grammarAccess.getSelectionRule()); 
            pushFollow(FOLLOW_1);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getSelectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelection"


    // $ANTLR start "ruleSelection"
    // InternalTactics.g:187:1: ruleSelection : ( ( rule__Selection__Alternatives ) ) ;
    public final void ruleSelection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:191:2: ( ( ( rule__Selection__Alternatives ) ) )
            // InternalTactics.g:192:2: ( ( rule__Selection__Alternatives ) )
            {
            // InternalTactics.g:192:2: ( ( rule__Selection__Alternatives ) )
            // InternalTactics.g:193:3: ( rule__Selection__Alternatives )
            {
             before(grammarAccess.getSelectionAccess().getAlternatives()); 
            // InternalTactics.g:194:3: ( rule__Selection__Alternatives )
            // InternalTactics.g:194:4: rule__Selection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Selection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelection"


    // $ANTLR start "entryRuleTacticAction"
    // InternalTactics.g:203:1: entryRuleTacticAction : ruleTacticAction EOF ;
    public final void entryRuleTacticAction() throws RecognitionException {
        try {
            // InternalTactics.g:204:1: ( ruleTacticAction EOF )
            // InternalTactics.g:205:1: ruleTacticAction EOF
            {
             before(grammarAccess.getTacticActionRule()); 
            pushFollow(FOLLOW_1);
            ruleTacticAction();

            state._fsp--;

             after(grammarAccess.getTacticActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTacticAction"


    // $ANTLR start "ruleTacticAction"
    // InternalTactics.g:212:1: ruleTacticAction : ( ( rule__TacticAction__Group__0 ) ) ;
    public final void ruleTacticAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:216:2: ( ( ( rule__TacticAction__Group__0 ) ) )
            // InternalTactics.g:217:2: ( ( rule__TacticAction__Group__0 ) )
            {
            // InternalTactics.g:217:2: ( ( rule__TacticAction__Group__0 ) )
            // InternalTactics.g:218:3: ( rule__TacticAction__Group__0 )
            {
             before(grammarAccess.getTacticActionAccess().getGroup()); 
            // InternalTactics.g:219:3: ( rule__TacticAction__Group__0 )
            // InternalTactics.g:219:4: rule__TacticAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TacticAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTacticActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTacticAction"


    // $ANTLR start "entryRuleGuard"
    // InternalTactics.g:228:1: entryRuleGuard : ruleGuard EOF ;
    public final void entryRuleGuard() throws RecognitionException {
        try {
            // InternalTactics.g:229:1: ( ruleGuard EOF )
            // InternalTactics.g:230:1: ruleGuard EOF
            {
             before(grammarAccess.getGuardRule()); 
            pushFollow(FOLLOW_1);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getGuardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGuard"


    // $ANTLR start "ruleGuard"
    // InternalTactics.g:237:1: ruleGuard : ( ( rule__Guard__Group__0 ) ) ;
    public final void ruleGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:241:2: ( ( ( rule__Guard__Group__0 ) ) )
            // InternalTactics.g:242:2: ( ( rule__Guard__Group__0 ) )
            {
            // InternalTactics.g:242:2: ( ( rule__Guard__Group__0 ) )
            // InternalTactics.g:243:3: ( rule__Guard__Group__0 )
            {
             before(grammarAccess.getGuardAccess().getGroup()); 
            // InternalTactics.g:244:3: ( rule__Guard__Group__0 )
            // InternalTactics.g:244:4: rule__Guard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Guard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGuard"


    // $ANTLR start "entryRuleContextGuard"
    // InternalTactics.g:253:1: entryRuleContextGuard : ruleContextGuard EOF ;
    public final void entryRuleContextGuard() throws RecognitionException {
        try {
            // InternalTactics.g:254:1: ( ruleContextGuard EOF )
            // InternalTactics.g:255:1: ruleContextGuard EOF
            {
             before(grammarAccess.getContextGuardRule()); 
            pushFollow(FOLLOW_1);
            ruleContextGuard();

            state._fsp--;

             after(grammarAccess.getContextGuardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContextGuard"


    // $ANTLR start "ruleContextGuard"
    // InternalTactics.g:262:1: ruleContextGuard : ( ( rule__ContextGuard__Group__0 ) ) ;
    public final void ruleContextGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:266:2: ( ( ( rule__ContextGuard__Group__0 ) ) )
            // InternalTactics.g:267:2: ( ( rule__ContextGuard__Group__0 ) )
            {
            // InternalTactics.g:267:2: ( ( rule__ContextGuard__Group__0 ) )
            // InternalTactics.g:268:3: ( rule__ContextGuard__Group__0 )
            {
             before(grammarAccess.getContextGuardAccess().getGroup()); 
            // InternalTactics.g:269:3: ( rule__ContextGuard__Group__0 )
            // InternalTactics.g:269:4: rule__ContextGuard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextGuard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextGuardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextGuard"


    // $ANTLR start "entryRuleFeatureGuard"
    // InternalTactics.g:278:1: entryRuleFeatureGuard : ruleFeatureGuard EOF ;
    public final void entryRuleFeatureGuard() throws RecognitionException {
        try {
            // InternalTactics.g:279:1: ( ruleFeatureGuard EOF )
            // InternalTactics.g:280:1: ruleFeatureGuard EOF
            {
             before(grammarAccess.getFeatureGuardRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureGuard();

            state._fsp--;

             after(grammarAccess.getFeatureGuardRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureGuard"


    // $ANTLR start "ruleFeatureGuard"
    // InternalTactics.g:287:1: ruleFeatureGuard : ( ( rule__FeatureGuard__Group__0 ) ) ;
    public final void ruleFeatureGuard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:291:2: ( ( ( rule__FeatureGuard__Group__0 ) ) )
            // InternalTactics.g:292:2: ( ( rule__FeatureGuard__Group__0 ) )
            {
            // InternalTactics.g:292:2: ( ( rule__FeatureGuard__Group__0 ) )
            // InternalTactics.g:293:3: ( rule__FeatureGuard__Group__0 )
            {
             before(grammarAccess.getFeatureGuardAccess().getGroup()); 
            // InternalTactics.g:294:3: ( rule__FeatureGuard__Group__0 )
            // InternalTactics.g:294:4: rule__FeatureGuard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureGuard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureGuardAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureGuard"


    // $ANTLR start "entryRuleFeatureCondition"
    // InternalTactics.g:303:1: entryRuleFeatureCondition : ruleFeatureCondition EOF ;
    public final void entryRuleFeatureCondition() throws RecognitionException {
        try {
            // InternalTactics.g:304:1: ( ruleFeatureCondition EOF )
            // InternalTactics.g:305:1: ruleFeatureCondition EOF
            {
             before(grammarAccess.getFeatureConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureCondition();

            state._fsp--;

             after(grammarAccess.getFeatureConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFeatureCondition"


    // $ANTLR start "ruleFeatureCondition"
    // InternalTactics.g:312:1: ruleFeatureCondition : ( ( rule__FeatureCondition__Group__0 ) ) ;
    public final void ruleFeatureCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:316:2: ( ( ( rule__FeatureCondition__Group__0 ) ) )
            // InternalTactics.g:317:2: ( ( rule__FeatureCondition__Group__0 ) )
            {
            // InternalTactics.g:317:2: ( ( rule__FeatureCondition__Group__0 ) )
            // InternalTactics.g:318:3: ( rule__FeatureCondition__Group__0 )
            {
             before(grammarAccess.getFeatureConditionAccess().getGroup()); 
            // InternalTactics.g:319:3: ( rule__FeatureCondition__Group__0 )
            // InternalTactics.g:319:4: rule__FeatureCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFeatureCondition"


    // $ANTLR start "entryRuleContextCondition"
    // InternalTactics.g:328:1: entryRuleContextCondition : ruleContextCondition EOF ;
    public final void entryRuleContextCondition() throws RecognitionException {
        try {
            // InternalTactics.g:329:1: ( ruleContextCondition EOF )
            // InternalTactics.g:330:1: ruleContextCondition EOF
            {
             before(grammarAccess.getContextConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleContextCondition();

            state._fsp--;

             after(grammarAccess.getContextConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContextCondition"


    // $ANTLR start "ruleContextCondition"
    // InternalTactics.g:337:1: ruleContextCondition : ( ( rule__ContextCondition__Alternatives ) ) ;
    public final void ruleContextCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:341:2: ( ( ( rule__ContextCondition__Alternatives ) ) )
            // InternalTactics.g:342:2: ( ( rule__ContextCondition__Alternatives ) )
            {
            // InternalTactics.g:342:2: ( ( rule__ContextCondition__Alternatives ) )
            // InternalTactics.g:343:3: ( rule__ContextCondition__Alternatives )
            {
             before(grammarAccess.getContextConditionAccess().getAlternatives()); 
            // InternalTactics.g:344:3: ( rule__ContextCondition__Alternatives )
            // InternalTactics.g:344:4: rule__ContextCondition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ContextCondition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getContextConditionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextCondition"


    // $ANTLR start "entryRuleContextThresholdCondition"
    // InternalTactics.g:353:1: entryRuleContextThresholdCondition : ruleContextThresholdCondition EOF ;
    public final void entryRuleContextThresholdCondition() throws RecognitionException {
        try {
            // InternalTactics.g:354:1: ( ruleContextThresholdCondition EOF )
            // InternalTactics.g:355:1: ruleContextThresholdCondition EOF
            {
             before(grammarAccess.getContextThresholdConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleContextThresholdCondition();

            state._fsp--;

             after(grammarAccess.getContextThresholdConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContextThresholdCondition"


    // $ANTLR start "ruleContextThresholdCondition"
    // InternalTactics.g:362:1: ruleContextThresholdCondition : ( ( rule__ContextThresholdCondition__Group__0 ) ) ;
    public final void ruleContextThresholdCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:366:2: ( ( ( rule__ContextThresholdCondition__Group__0 ) ) )
            // InternalTactics.g:367:2: ( ( rule__ContextThresholdCondition__Group__0 ) )
            {
            // InternalTactics.g:367:2: ( ( rule__ContextThresholdCondition__Group__0 ) )
            // InternalTactics.g:368:3: ( rule__ContextThresholdCondition__Group__0 )
            {
             before(grammarAccess.getContextThresholdConditionAccess().getGroup()); 
            // InternalTactics.g:369:3: ( rule__ContextThresholdCondition__Group__0 )
            // InternalTactics.g:369:4: rule__ContextThresholdCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextThresholdCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextThresholdConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextThresholdCondition"


    // $ANTLR start "entryRuleContextContextCondition"
    // InternalTactics.g:378:1: entryRuleContextContextCondition : ruleContextContextCondition EOF ;
    public final void entryRuleContextContextCondition() throws RecognitionException {
        try {
            // InternalTactics.g:379:1: ( ruleContextContextCondition EOF )
            // InternalTactics.g:380:1: ruleContextContextCondition EOF
            {
             before(grammarAccess.getContextContextConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleContextContextCondition();

            state._fsp--;

             after(grammarAccess.getContextContextConditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleContextContextCondition"


    // $ANTLR start "ruleContextContextCondition"
    // InternalTactics.g:387:1: ruleContextContextCondition : ( ( rule__ContextContextCondition__Group__0 ) ) ;
    public final void ruleContextContextCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:391:2: ( ( ( rule__ContextContextCondition__Group__0 ) ) )
            // InternalTactics.g:392:2: ( ( rule__ContextContextCondition__Group__0 ) )
            {
            // InternalTactics.g:392:2: ( ( rule__ContextContextCondition__Group__0 ) )
            // InternalTactics.g:393:3: ( rule__ContextContextCondition__Group__0 )
            {
             before(grammarAccess.getContextContextConditionAccess().getGroup()); 
            // InternalTactics.g:394:3: ( rule__ContextContextCondition__Group__0 )
            // InternalTactics.g:394:4: rule__ContextContextCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ContextContextCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getContextContextConditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleContextContextCondition"


    // $ANTLR start "entryRuleSelectVariant"
    // InternalTactics.g:403:1: entryRuleSelectVariant : ruleSelectVariant EOF ;
    public final void entryRuleSelectVariant() throws RecognitionException {
        try {
            // InternalTactics.g:404:1: ( ruleSelectVariant EOF )
            // InternalTactics.g:405:1: ruleSelectVariant EOF
            {
             before(grammarAccess.getSelectVariantRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectVariant();

            state._fsp--;

             after(grammarAccess.getSelectVariantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectVariant"


    // $ANTLR start "ruleSelectVariant"
    // InternalTactics.g:412:1: ruleSelectVariant : ( ( rule__SelectVariant__Group__0 ) ) ;
    public final void ruleSelectVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:416:2: ( ( ( rule__SelectVariant__Group__0 ) ) )
            // InternalTactics.g:417:2: ( ( rule__SelectVariant__Group__0 ) )
            {
            // InternalTactics.g:417:2: ( ( rule__SelectVariant__Group__0 ) )
            // InternalTactics.g:418:3: ( rule__SelectVariant__Group__0 )
            {
             before(grammarAccess.getSelectVariantAccess().getGroup()); 
            // InternalTactics.g:419:3: ( rule__SelectVariant__Group__0 )
            // InternalTactics.g:419:4: rule__SelectVariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SelectVariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectVariantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectVariant"


    // $ANTLR start "entryRuleDeselectVariant"
    // InternalTactics.g:428:1: entryRuleDeselectVariant : ruleDeselectVariant EOF ;
    public final void entryRuleDeselectVariant() throws RecognitionException {
        try {
            // InternalTactics.g:429:1: ( ruleDeselectVariant EOF )
            // InternalTactics.g:430:1: ruleDeselectVariant EOF
            {
             before(grammarAccess.getDeselectVariantRule()); 
            pushFollow(FOLLOW_1);
            ruleDeselectVariant();

            state._fsp--;

             after(grammarAccess.getDeselectVariantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDeselectVariant"


    // $ANTLR start "ruleDeselectVariant"
    // InternalTactics.g:437:1: ruleDeselectVariant : ( ( rule__DeselectVariant__Group__0 ) ) ;
    public final void ruleDeselectVariant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:441:2: ( ( ( rule__DeselectVariant__Group__0 ) ) )
            // InternalTactics.g:442:2: ( ( rule__DeselectVariant__Group__0 ) )
            {
            // InternalTactics.g:442:2: ( ( rule__DeselectVariant__Group__0 ) )
            // InternalTactics.g:443:3: ( rule__DeselectVariant__Group__0 )
            {
             before(grammarAccess.getDeselectVariantAccess().getGroup()); 
            // InternalTactics.g:444:3: ( rule__DeselectVariant__Group__0 )
            // InternalTactics.g:444:4: rule__DeselectVariant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DeselectVariant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDeselectVariantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDeselectVariant"


    // $ANTLR start "entryRuleQualifiedFeatureRef"
    // InternalTactics.g:453:1: entryRuleQualifiedFeatureRef : ruleQualifiedFeatureRef EOF ;
    public final void entryRuleQualifiedFeatureRef() throws RecognitionException {
        try {
            // InternalTactics.g:454:1: ( ruleQualifiedFeatureRef EOF )
            // InternalTactics.g:455:1: ruleQualifiedFeatureRef EOF
            {
             before(grammarAccess.getQualifiedFeatureRefRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedFeatureRef();

            state._fsp--;

             after(grammarAccess.getQualifiedFeatureRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedFeatureRef"


    // $ANTLR start "ruleQualifiedFeatureRef"
    // InternalTactics.g:462:1: ruleQualifiedFeatureRef : ( ( rule__QualifiedFeatureRef__Group__0 ) ) ;
    public final void ruleQualifiedFeatureRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:466:2: ( ( ( rule__QualifiedFeatureRef__Group__0 ) ) )
            // InternalTactics.g:467:2: ( ( rule__QualifiedFeatureRef__Group__0 ) )
            {
            // InternalTactics.g:467:2: ( ( rule__QualifiedFeatureRef__Group__0 ) )
            // InternalTactics.g:468:3: ( rule__QualifiedFeatureRef__Group__0 )
            {
             before(grammarAccess.getQualifiedFeatureRefAccess().getGroup()); 
            // InternalTactics.g:469:3: ( rule__QualifiedFeatureRef__Group__0 )
            // InternalTactics.g:469:4: rule__QualifiedFeatureRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedFeatureRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedFeatureRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedFeatureRef"


    // $ANTLR start "entryRuleLiteral"
    // InternalTactics.g:478:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalTactics.g:479:1: ( ruleLiteral EOF )
            // InternalTactics.g:480:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalTactics.g:487:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:491:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalTactics.g:492:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalTactics.g:492:2: ( ( rule__Literal__Alternatives ) )
            // InternalTactics.g:493:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalTactics.g:494:3: ( rule__Literal__Alternatives )
            // InternalTactics.g:494:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalTactics.g:503:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalTactics.g:504:1: ( ruleIntLiteral EOF )
            // InternalTactics.g:505:1: ruleIntLiteral EOF
            {
             before(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleIntLiteral();

            state._fsp--;

             after(grammarAccess.getIntLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalTactics.g:512:1: ruleIntLiteral : ( ( rule__IntLiteral__ValueAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:516:2: ( ( ( rule__IntLiteral__ValueAssignment ) ) )
            // InternalTactics.g:517:2: ( ( rule__IntLiteral__ValueAssignment ) )
            {
            // InternalTactics.g:517:2: ( ( rule__IntLiteral__ValueAssignment ) )
            // InternalTactics.g:518:3: ( rule__IntLiteral__ValueAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValueAssignment()); 
            // InternalTactics.g:519:3: ( rule__IntLiteral__ValueAssignment )
            // InternalTactics.g:519:4: rule__IntLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleDecimalLiteral"
    // InternalTactics.g:528:1: entryRuleDecimalLiteral : ruleDecimalLiteral EOF ;
    public final void entryRuleDecimalLiteral() throws RecognitionException {
        try {
            // InternalTactics.g:529:1: ( ruleDecimalLiteral EOF )
            // InternalTactics.g:530:1: ruleDecimalLiteral EOF
            {
             before(grammarAccess.getDecimalLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleDecimalLiteral();

            state._fsp--;

             after(grammarAccess.getDecimalLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalLiteral"


    // $ANTLR start "ruleDecimalLiteral"
    // InternalTactics.g:537:1: ruleDecimalLiteral : ( ( rule__DecimalLiteral__ValueAssignment ) ) ;
    public final void ruleDecimalLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:541:2: ( ( ( rule__DecimalLiteral__ValueAssignment ) ) )
            // InternalTactics.g:542:2: ( ( rule__DecimalLiteral__ValueAssignment ) )
            {
            // InternalTactics.g:542:2: ( ( rule__DecimalLiteral__ValueAssignment ) )
            // InternalTactics.g:543:3: ( rule__DecimalLiteral__ValueAssignment )
            {
             before(grammarAccess.getDecimalLiteralAccess().getValueAssignment()); 
            // InternalTactics.g:544:3: ( rule__DecimalLiteral__ValueAssignment )
            // InternalTactics.g:544:4: rule__DecimalLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__DecimalLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDecimalLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalTactics.g:553:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalTactics.g:554:1: ( ruleStringLiteral EOF )
            // InternalTactics.g:555:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalTactics.g:562:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:566:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalTactics.g:567:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalTactics.g:567:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalTactics.g:568:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalTactics.g:569:3: ( rule__StringLiteral__ValueAssignment )
            // InternalTactics.g:569:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleBooleanLiteral"
    // InternalTactics.g:578:1: entryRuleBooleanLiteral : ruleBooleanLiteral EOF ;
    public final void entryRuleBooleanLiteral() throws RecognitionException {
        try {
            // InternalTactics.g:579:1: ( ruleBooleanLiteral EOF )
            // InternalTactics.g:580:1: ruleBooleanLiteral EOF
            {
             before(grammarAccess.getBooleanLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleBooleanLiteral();

            state._fsp--;

             after(grammarAccess.getBooleanLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // InternalTactics.g:587:1: ruleBooleanLiteral : ( ( rule__BooleanLiteral__ValueAssignment ) ) ;
    public final void ruleBooleanLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:591:2: ( ( ( rule__BooleanLiteral__ValueAssignment ) ) )
            // InternalTactics.g:592:2: ( ( rule__BooleanLiteral__ValueAssignment ) )
            {
            // InternalTactics.g:592:2: ( ( rule__BooleanLiteral__ValueAssignment ) )
            // InternalTactics.g:593:3: ( rule__BooleanLiteral__ValueAssignment )
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 
            // InternalTactics.g:594:3: ( rule__BooleanLiteral__ValueAssignment )
            // InternalTactics.g:594:4: rule__BooleanLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BooleanLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBooleanLiteralAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "ruleMathOperator"
    // InternalTactics.g:603:1: ruleMathOperator : ( ( rule__MathOperator__Alternatives ) ) ;
    public final void ruleMathOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:607:1: ( ( ( rule__MathOperator__Alternatives ) ) )
            // InternalTactics.g:608:2: ( ( rule__MathOperator__Alternatives ) )
            {
            // InternalTactics.g:608:2: ( ( rule__MathOperator__Alternatives ) )
            // InternalTactics.g:609:3: ( rule__MathOperator__Alternatives )
            {
             before(grammarAccess.getMathOperatorAccess().getAlternatives()); 
            // InternalTactics.g:610:3: ( rule__MathOperator__Alternatives )
            // InternalTactics.g:610:4: rule__MathOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MathOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMathOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathOperator"


    // $ANTLR start "ruleLogicalOperator"
    // InternalTactics.g:619:1: ruleLogicalOperator : ( ( rule__LogicalOperator__Alternatives ) ) ;
    public final void ruleLogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:623:1: ( ( ( rule__LogicalOperator__Alternatives ) ) )
            // InternalTactics.g:624:2: ( ( rule__LogicalOperator__Alternatives ) )
            {
            // InternalTactics.g:624:2: ( ( rule__LogicalOperator__Alternatives ) )
            // InternalTactics.g:625:3: ( rule__LogicalOperator__Alternatives )
            {
             before(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 
            // InternalTactics.g:626:3: ( rule__LogicalOperator__Alternatives )
            // InternalTactics.g:626:4: rule__LogicalOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "rule__Tactic__Alternatives"
    // InternalTactics.g:634:1: rule__Tactic__Alternatives : ( ( ruleActionTactics ) | ( rulePureTactic ) );
    public final void rule__Tactic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:638:1: ( ( ruleActionTactics ) | ( rulePureTactic ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==RULE_ID||LA1_1==23) ) {
                    alt1=1;
                }
                else if ( (LA1_1==26) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0==26) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTactics.g:639:2: ( ruleActionTactics )
                    {
                    // InternalTactics.g:639:2: ( ruleActionTactics )
                    // InternalTactics.g:640:3: ruleActionTactics
                    {
                     before(grammarAccess.getTacticAccess().getActionTacticsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActionTactics();

                    state._fsp--;

                     after(grammarAccess.getTacticAccess().getActionTacticsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:645:2: ( rulePureTactic )
                    {
                    // InternalTactics.g:645:2: ( rulePureTactic )
                    // InternalTactics.g:646:3: rulePureTactic
                    {
                     before(grammarAccess.getTacticAccess().getPureTacticParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePureTactic();

                    state._fsp--;

                     after(grammarAccess.getTacticAccess().getPureTacticParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Tactic__Alternatives"


    // $ANTLR start "rule__Selection__Alternatives"
    // InternalTactics.g:655:1: rule__Selection__Alternatives : ( ( ruleSelectVariant ) | ( ruleDeselectVariant ) );
    public final void rule__Selection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:659:1: ( ( ruleSelectVariant ) | ( ruleDeselectVariant ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==34) ) {
                alt2=1;
            }
            else if ( (LA2_0==35) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalTactics.g:660:2: ( ruleSelectVariant )
                    {
                    // InternalTactics.g:660:2: ( ruleSelectVariant )
                    // InternalTactics.g:661:3: ruleSelectVariant
                    {
                     before(grammarAccess.getSelectionAccess().getSelectVariantParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSelectVariant();

                    state._fsp--;

                     after(grammarAccess.getSelectionAccess().getSelectVariantParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:666:2: ( ruleDeselectVariant )
                    {
                    // InternalTactics.g:666:2: ( ruleDeselectVariant )
                    // InternalTactics.g:667:3: ruleDeselectVariant
                    {
                     before(grammarAccess.getSelectionAccess().getDeselectVariantParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDeselectVariant();

                    state._fsp--;

                     after(grammarAccess.getSelectionAccess().getDeselectVariantParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Selection__Alternatives"


    // $ANTLR start "rule__Guard__Alternatives_2"
    // InternalTactics.g:676:1: rule__Guard__Alternatives_2 : ( ( ( rule__Guard__Group_2_0__0 ) ) | ( ( rule__Guard__Group_2_1__0 ) ) );
    public final void rule__Guard__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:680:1: ( ( ( rule__Guard__Group_2_0__0 ) ) | ( ( rule__Guard__Group_2_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTactics.g:681:2: ( ( rule__Guard__Group_2_0__0 ) )
                    {
                    // InternalTactics.g:681:2: ( ( rule__Guard__Group_2_0__0 ) )
                    // InternalTactics.g:682:3: ( rule__Guard__Group_2_0__0 )
                    {
                     before(grammarAccess.getGuardAccess().getGroup_2_0()); 
                    // InternalTactics.g:683:3: ( rule__Guard__Group_2_0__0 )
                    // InternalTactics.g:683:4: rule__Guard__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guard__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGuardAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:687:2: ( ( rule__Guard__Group_2_1__0 ) )
                    {
                    // InternalTactics.g:687:2: ( ( rule__Guard__Group_2_1__0 ) )
                    // InternalTactics.g:688:3: ( rule__Guard__Group_2_1__0 )
                    {
                     before(grammarAccess.getGuardAccess().getGroup_2_1()); 
                    // InternalTactics.g:689:3: ( rule__Guard__Group_2_1__0 )
                    // InternalTactics.g:689:4: rule__Guard__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guard__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getGuardAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Alternatives_2"


    // $ANTLR start "rule__ContextCondition__Alternatives"
    // InternalTactics.g:697:1: rule__ContextCondition__Alternatives : ( ( ruleContextThresholdCondition ) | ( ruleContextContextCondition ) );
    public final void rule__ContextCondition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:701:1: ( ( ruleContextThresholdCondition ) | ( ruleContextContextCondition ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalTactics.g:702:2: ( ruleContextThresholdCondition )
                    {
                    // InternalTactics.g:702:2: ( ruleContextThresholdCondition )
                    // InternalTactics.g:703:3: ruleContextThresholdCondition
                    {
                     before(grammarAccess.getContextConditionAccess().getContextThresholdConditionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleContextThresholdCondition();

                    state._fsp--;

                     after(grammarAccess.getContextConditionAccess().getContextThresholdConditionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:708:2: ( ruleContextContextCondition )
                    {
                    // InternalTactics.g:708:2: ( ruleContextContextCondition )
                    // InternalTactics.g:709:3: ruleContextContextCondition
                    {
                     before(grammarAccess.getContextConditionAccess().getContextContextConditionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleContextContextCondition();

                    state._fsp--;

                     after(grammarAccess.getContextConditionAccess().getContextContextConditionParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextCondition__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalTactics.g:718:1: rule__Literal__Alternatives : ( ( ruleIntLiteral ) | ( ruleDecimalLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:722:1: ( ( ruleIntLiteral ) | ( ruleDecimalLiteral ) | ( ruleStringLiteral ) | ( ruleBooleanLiteral ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case RULE_DECIMAL:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            case RULE_BOOLEAN:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalTactics.g:723:2: ( ruleIntLiteral )
                    {
                    // InternalTactics.g:723:2: ( ruleIntLiteral )
                    // InternalTactics.g:724:3: ruleIntLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:729:2: ( ruleDecimalLiteral )
                    {
                    // InternalTactics.g:729:2: ( ruleDecimalLiteral )
                    // InternalTactics.g:730:3: ruleDecimalLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getDecimalLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDecimalLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getDecimalLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTactics.g:735:2: ( ruleStringLiteral )
                    {
                    // InternalTactics.g:735:2: ( ruleStringLiteral )
                    // InternalTactics.g:736:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTactics.g:741:2: ( ruleBooleanLiteral )
                    {
                    // InternalTactics.g:741:2: ( ruleBooleanLiteral )
                    // InternalTactics.g:742:3: ruleBooleanLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBooleanLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getBooleanLiteralParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__MathOperator__Alternatives"
    // InternalTactics.g:751:1: rule__MathOperator__Alternatives : ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__MathOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:755:1: ( ( ( '<' ) ) | ( ( '>' ) ) | ( ( '==' ) ) | ( ( '!=' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt6=6;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            case 16:
                {
                alt6=4;
                }
                break;
            case 17:
                {
                alt6=5;
                }
                break;
            case 18:
                {
                alt6=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalTactics.g:756:2: ( ( '<' ) )
                    {
                    // InternalTactics.g:756:2: ( ( '<' ) )
                    // InternalTactics.g:757:3: ( '<' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0()); 
                    // InternalTactics.g:758:3: ( '<' )
                    // InternalTactics.g:758:4: '<'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getLESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:762:2: ( ( '>' ) )
                    {
                    // InternalTactics.g:762:2: ( ( '>' ) )
                    // InternalTactics.g:763:3: ( '>' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 
                    // InternalTactics.g:764:3: ( '>' )
                    // InternalTactics.g:764:4: '>'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getGREATEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTactics.g:768:2: ( ( '==' ) )
                    {
                    // InternalTactics.g:768:2: ( ( '==' ) )
                    // InternalTactics.g:769:3: ( '==' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 
                    // InternalTactics.g:770:3: ( '==' )
                    // InternalTactics.g:770:4: '=='
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getEQUALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTactics.g:774:2: ( ( '!=' ) )
                    {
                    // InternalTactics.g:774:2: ( ( '!=' ) )
                    // InternalTactics.g:775:3: ( '!=' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getDIFFERENTEnumLiteralDeclaration_3()); 
                    // InternalTactics.g:776:3: ( '!=' )
                    // InternalTactics.g:776:4: '!='
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getDIFFERENTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTactics.g:780:2: ( ( '>=' ) )
                    {
                    // InternalTactics.g:780:2: ( ( '>=' ) )
                    // InternalTactics.g:781:3: ( '>=' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getGREQEnumLiteralDeclaration_4()); 
                    // InternalTactics.g:782:3: ( '>=' )
                    // InternalTactics.g:782:4: '>='
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getGREQEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTactics.g:786:2: ( ( '<=' ) )
                    {
                    // InternalTactics.g:786:2: ( ( '<=' ) )
                    // InternalTactics.g:787:3: ( '<=' )
                    {
                     before(grammarAccess.getMathOperatorAccess().getLEQEnumLiteralDeclaration_5()); 
                    // InternalTactics.g:788:3: ( '<=' )
                    // InternalTactics.g:788:4: '<='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getMathOperatorAccess().getLEQEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathOperator__Alternatives"


    // $ANTLR start "rule__LogicalOperator__Alternatives"
    // InternalTactics.g:796:1: rule__LogicalOperator__Alternatives : ( ( ( 'AND' ) ) | ( ( 'OR' ) ) );
    public final void rule__LogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:800:1: ( ( ( 'AND' ) ) | ( ( 'OR' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalTactics.g:801:2: ( ( 'AND' ) )
                    {
                    // InternalTactics.g:801:2: ( ( 'AND' ) )
                    // InternalTactics.g:802:3: ( 'AND' )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0()); 
                    // InternalTactics.g:803:3: ( 'AND' )
                    // InternalTactics.g:803:4: 'AND'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicalOperatorAccess().getANDEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTactics.g:807:2: ( ( 'OR' ) )
                    {
                    // InternalTactics.g:807:2: ( ( 'OR' ) )
                    // InternalTactics.g:808:3: ( 'OR' )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getOREnumLiteralDeclaration_1()); 
                    // InternalTactics.g:809:3: ( 'OR' )
                    // InternalTactics.g:809:4: 'OR'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogicalOperatorAccess().getOREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOperator__Alternatives"


    // $ANTLR start "rule__TacticsModel__Group__0"
    // InternalTactics.g:817:1: rule__TacticsModel__Group__0 : rule__TacticsModel__Group__0__Impl rule__TacticsModel__Group__1 ;
    public final void rule__TacticsModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:821:1: ( rule__TacticsModel__Group__0__Impl rule__TacticsModel__Group__1 )
            // InternalTactics.g:822:2: rule__TacticsModel__Group__0__Impl rule__TacticsModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TacticsModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TacticsModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticsModel__Group__0"


    // $ANTLR start "rule__TacticsModel__Group__0__Impl"
    // InternalTactics.g:829:1: rule__TacticsModel__Group__0__Impl : ( 'name' ) ;
    public final void rule__TacticsModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:833:1: ( ( 'name' ) )
            // InternalTactics.g:834:1: ( 'name' )
            {
            // InternalTactics.g:834:1: ( 'name' )
            // InternalTactics.g:835:2: 'name'
            {
             before(grammarAccess.getTacticsModelAccess().getNameKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTacticsModelAccess().getNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticsModel__Group__0__Impl"


    // $ANTLR start "rule__TacticsModel__Group__1"
    // InternalTactics.g:844:1: rule__TacticsModel__Group__1 : rule__TacticsModel__Group__1__Impl rule__TacticsModel__Group__2 ;
    public final void rule__TacticsModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:848:1: ( rule__TacticsModel__Group__1__Impl rule__TacticsModel__Group__2 )
            // InternalTactics.g:849:2: rule__TacticsModel__Group__1__Impl rule__TacticsModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TacticsModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TacticsModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticsModel__Group__1"


    // $ANTLR start "rule__TacticsModel__Group__1__Impl"
    // InternalTactics.g:856:1: rule__TacticsModel__Group__1__Impl : ( ( rule__TacticsModel__NameAssignment_1 ) ) ;
    public final void rule__TacticsModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:860:1: ( ( ( rule__TacticsModel__NameAssignment_1 ) ) )
            // InternalTactics.g:861:1: ( ( rule__TacticsModel__NameAssignment_1 ) )
            {
            // InternalTactics.g:861:1: ( ( rule__TacticsModel__NameAssignment_1 ) )
            // InternalTactics.g:862:2: ( rule__TacticsModel__NameAssignment_1 )
            {
             before(grammarAccess.getTacticsModelAccess().getNameAssignment_1()); 
            // InternalTactics.g:863:2: ( rule__TacticsModel__NameAssignment_1 )
            // InternalTactics.g:863:3: rule__TacticsModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TacticsModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTacticsModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticsModel__Group__1__Impl"


    // $ANTLR start "rule__TacticsModel__Group__2"
    // InternalTactics.g:871:1: rule__TacticsModel__Group__2 : rule__TacticsModel__Group__2__Impl rule__TacticsModel__Group__3 ;
    public final void rule__TacticsModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:875:1: ( rule__TacticsModel__Group__2__Impl rule__TacticsModel__Group__3 )
            // InternalTactics.g:876:2: rule__TacticsModel__Group__2__Impl rule__TacticsModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TacticsModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TacticsModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticsModel__Group__2"


    // $ANTLR start "rule__TacticsModel__Group__2__Impl"
    // InternalTactics.g:883:1: rule__TacticsModel__Group__2__Impl : ( ';' ) ;
    public final void rule__TacticsModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:887:1: ( ( ';' ) )
            // InternalTactics.g:888:1: ( ';' )
            {
            // InternalTactics.g:888:1: ( ';' )
            // InternalTactics.g:889:2: ';'
            {
             before(grammarAccess.getTacticsModelAccess().getSemicolonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getTacticsModelAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticsModel__Group__2__Impl"


    // $ANTLR start "rule__TacticsModel__Group__3"
    // InternalTactics.g:898:1: rule__TacticsModel__Group__3 : rule__TacticsModel__Group__3__Impl rule__TacticsModel__Group__4 ;
    public final void rule__TacticsModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:902:1: ( rule__TacticsModel__Group__3__Impl rule__TacticsModel__Group__4 )
            // InternalTactics.g:903:2: rule__TacticsModel__Group__3__Impl rule__TacticsModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__TacticsModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TacticsModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticsModel__Group__3"


    // $ANTLR start "rule__TacticsModel__Group__3__Impl"
    // InternalTactics.g:910:1: rule__TacticsModel__Group__3__Impl : ( ( rule__TacticsModel__ImportsAssignment_3 )* ) ;
    public final void rule__TacticsModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:914:1: ( ( ( rule__TacticsModel__ImportsAssignment_3 )* ) )
            // InternalTactics.g:915:1: ( ( rule__TacticsModel__ImportsAssignment_3 )* )
            {
            // InternalTactics.g:915:1: ( ( rule__TacticsModel__ImportsAssignment_3 )* )
            // InternalTactics.g:916:2: ( rule__TacticsModel__ImportsAssignment_3 )*
            {
             before(grammarAccess.getTacticsModelAccess().getImportsAssignment_3()); 
            // InternalTactics.g:917:2: ( rule__TacticsModel__ImportsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTactics.g:917:3: rule__TacticsModel__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__TacticsModel__ImportsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTacticsModelAccess().getImportsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticsModel__Group__3__Impl"


    // $ANTLR start "rule__TacticsModel__Group__4"
    // InternalTactics.g:925:1: rule__TacticsModel__Group__4 : rule__TacticsModel__Group__4__Impl ;
    public final void rule__TacticsModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:929:1: ( rule__TacticsModel__Group__4__Impl )
            // InternalTactics.g:930:2: rule__TacticsModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TacticsModel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticsModel__Group__4"


    // $ANTLR start "rule__TacticsModel__Group__4__Impl"
    // InternalTactics.g:936:1: rule__TacticsModel__Group__4__Impl : ( ( rule__TacticsModel__TacticsAssignment_4 )* ) ;
    public final void rule__TacticsModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:940:1: ( ( ( rule__TacticsModel__TacticsAssignment_4 )* ) )
            // InternalTactics.g:941:1: ( ( rule__TacticsModel__TacticsAssignment_4 )* )
            {
            // InternalTactics.g:941:1: ( ( rule__TacticsModel__TacticsAssignment_4 )* )
            // InternalTactics.g:942:2: ( rule__TacticsModel__TacticsAssignment_4 )*
            {
             before(grammarAccess.getTacticsModelAccess().getTacticsAssignment_4()); 
            // InternalTactics.g:943:2: ( rule__TacticsModel__TacticsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID||LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalTactics.g:943:3: rule__TacticsModel__TacticsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TacticsModel__TacticsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getTacticsModelAccess().getTacticsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticsModel__Group__4__Impl"


    // $ANTLR start "rule__ActionTactics__Group__0"
    // InternalTactics.g:952:1: rule__ActionTactics__Group__0 : rule__ActionTactics__Group__0__Impl rule__ActionTactics__Group__1 ;
    public final void rule__ActionTactics__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:956:1: ( rule__ActionTactics__Group__0__Impl rule__ActionTactics__Group__1 )
            // InternalTactics.g:957:2: rule__ActionTactics__Group__0__Impl rule__ActionTactics__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ActionTactics__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionTactics__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTactics__Group__0"


    // $ANTLR start "rule__ActionTactics__Group__0__Impl"
    // InternalTactics.g:964:1: rule__ActionTactics__Group__0__Impl : ( ( rule__ActionTactics__RequirementAssignment_0 )? ) ;
    public final void rule__ActionTactics__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:968:1: ( ( ( rule__ActionTactics__RequirementAssignment_0 )? ) )
            // InternalTactics.g:969:1: ( ( rule__ActionTactics__RequirementAssignment_0 )? )
            {
            // InternalTactics.g:969:1: ( ( rule__ActionTactics__RequirementAssignment_0 )? )
            // InternalTactics.g:970:2: ( rule__ActionTactics__RequirementAssignment_0 )?
            {
             before(grammarAccess.getActionTacticsAccess().getRequirementAssignment_0()); 
            // InternalTactics.g:971:2: ( rule__ActionTactics__RequirementAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==RULE_ID) ) {
                    alt10=1;
                }
            }
            switch (alt10) {
                case 1 :
                    // InternalTactics.g:971:3: rule__ActionTactics__RequirementAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActionTactics__RequirementAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionTacticsAccess().getRequirementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTactics__Group__0__Impl"


    // $ANTLR start "rule__ActionTactics__Group__1"
    // InternalTactics.g:979:1: rule__ActionTactics__Group__1 : rule__ActionTactics__Group__1__Impl rule__ActionTactics__Group__2 ;
    public final void rule__ActionTactics__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:983:1: ( rule__ActionTactics__Group__1__Impl rule__ActionTactics__Group__2 )
            // InternalTactics.g:984:2: rule__ActionTactics__Group__1__Impl rule__ActionTactics__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ActionTactics__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionTactics__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTactics__Group__1"


    // $ANTLR start "rule__ActionTactics__Group__1__Impl"
    // InternalTactics.g:991:1: rule__ActionTactics__Group__1__Impl : ( ( rule__ActionTactics__ActionAssignment_1 ) ) ;
    public final void rule__ActionTactics__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:995:1: ( ( ( rule__ActionTactics__ActionAssignment_1 ) ) )
            // InternalTactics.g:996:1: ( ( rule__ActionTactics__ActionAssignment_1 ) )
            {
            // InternalTactics.g:996:1: ( ( rule__ActionTactics__ActionAssignment_1 ) )
            // InternalTactics.g:997:2: ( rule__ActionTactics__ActionAssignment_1 )
            {
             before(grammarAccess.getActionTacticsAccess().getActionAssignment_1()); 
            // InternalTactics.g:998:2: ( rule__ActionTactics__ActionAssignment_1 )
            // InternalTactics.g:998:3: rule__ActionTactics__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActionTactics__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActionTacticsAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTactics__Group__1__Impl"


    // $ANTLR start "rule__ActionTactics__Group__2"
    // InternalTactics.g:1006:1: rule__ActionTactics__Group__2 : rule__ActionTactics__Group__2__Impl rule__ActionTactics__Group__3 ;
    public final void rule__ActionTactics__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1010:1: ( rule__ActionTactics__Group__2__Impl rule__ActionTactics__Group__3 )
            // InternalTactics.g:1011:2: rule__ActionTactics__Group__2__Impl rule__ActionTactics__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ActionTactics__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionTactics__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTactics__Group__2"


    // $ANTLR start "rule__ActionTactics__Group__2__Impl"
    // InternalTactics.g:1018:1: rule__ActionTactics__Group__2__Impl : ( '{' ) ;
    public final void rule__ActionTactics__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1022:1: ( ( '{' ) )
            // InternalTactics.g:1023:1: ( '{' )
            {
            // InternalTactics.g:1023:1: ( '{' )
            // InternalTactics.g:1024:2: '{'
            {
             before(grammarAccess.getActionTacticsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActionTacticsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTactics__Group__2__Impl"


    // $ANTLR start "rule__ActionTactics__Group__3"
    // InternalTactics.g:1033:1: rule__ActionTactics__Group__3 : rule__ActionTactics__Group__3__Impl rule__ActionTactics__Group__4 ;
    public final void rule__ActionTactics__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1037:1: ( rule__ActionTactics__Group__3__Impl rule__ActionTactics__Group__4 )
            // InternalTactics.g:1038:2: rule__ActionTactics__Group__3__Impl rule__ActionTactics__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ActionTactics__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActionTactics__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTactics__Group__3"


    // $ANTLR start "rule__ActionTactics__Group__3__Impl"
    // InternalTactics.g:1045:1: rule__ActionTactics__Group__3__Impl : ( ( rule__ActionTactics__TacticsAssignment_3 )* ) ;
    public final void rule__ActionTactics__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1049:1: ( ( ( rule__ActionTactics__TacticsAssignment_3 )* ) )
            // InternalTactics.g:1050:1: ( ( rule__ActionTactics__TacticsAssignment_3 )* )
            {
            // InternalTactics.g:1050:1: ( ( rule__ActionTactics__TacticsAssignment_3 )* )
            // InternalTactics.g:1051:2: ( rule__ActionTactics__TacticsAssignment_3 )*
            {
             before(grammarAccess.getActionTacticsAccess().getTacticsAssignment_3()); 
            // InternalTactics.g:1052:2: ( rule__ActionTactics__TacticsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID||LA11_0==26) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalTactics.g:1052:3: rule__ActionTactics__TacticsAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ActionTactics__TacticsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getActionTacticsAccess().getTacticsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTactics__Group__3__Impl"


    // $ANTLR start "rule__ActionTactics__Group__4"
    // InternalTactics.g:1060:1: rule__ActionTactics__Group__4 : rule__ActionTactics__Group__4__Impl ;
    public final void rule__ActionTactics__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1064:1: ( rule__ActionTactics__Group__4__Impl )
            // InternalTactics.g:1065:2: rule__ActionTactics__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActionTactics__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTactics__Group__4"


    // $ANTLR start "rule__ActionTactics__Group__4__Impl"
    // InternalTactics.g:1071:1: rule__ActionTactics__Group__4__Impl : ( '}' ) ;
    public final void rule__ActionTactics__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1075:1: ( ( '}' ) )
            // InternalTactics.g:1076:1: ( '}' )
            {
            // InternalTactics.g:1076:1: ( '}' )
            // InternalTactics.g:1077:2: '}'
            {
             before(grammarAccess.getActionTacticsAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getActionTacticsAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTactics__Group__4__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalTactics.g:1087:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1091:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalTactics.g:1092:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Import__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalTactics.g:1099:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1103:1: ( ( 'import' ) )
            // InternalTactics.g:1104:1: ( 'import' )
            {
            // InternalTactics.g:1104:1: ( 'import' )
            // InternalTactics.g:1105:2: 'import'
            {
             before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalTactics.g:1114:1: rule__Import__Group__1 : rule__Import__Group__1__Impl rule__Import__Group__2 ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1118:1: ( rule__Import__Group__1__Impl rule__Import__Group__2 )
            // InternalTactics.g:1119:2: rule__Import__Group__1__Impl rule__Import__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Import__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Import__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalTactics.g:1126:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportURIAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1130:1: ( ( ( rule__Import__ImportURIAssignment_1 ) ) )
            // InternalTactics.g:1131:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            {
            // InternalTactics.g:1131:1: ( ( rule__Import__ImportURIAssignment_1 ) )
            // InternalTactics.g:1132:2: ( rule__Import__ImportURIAssignment_1 )
            {
             before(grammarAccess.getImportAccess().getImportURIAssignment_1()); 
            // InternalTactics.g:1133:2: ( rule__Import__ImportURIAssignment_1 )
            // InternalTactics.g:1133:3: rule__Import__ImportURIAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportURIAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getImportAccess().getImportURIAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__Import__Group__2"
    // InternalTactics.g:1141:1: rule__Import__Group__2 : rule__Import__Group__2__Impl ;
    public final void rule__Import__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1145:1: ( rule__Import__Group__2__Impl )
            // InternalTactics.g:1146:2: rule__Import__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2"


    // $ANTLR start "rule__Import__Group__2__Impl"
    // InternalTactics.g:1152:1: rule__Import__Group__2__Impl : ( ';' ) ;
    public final void rule__Import__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1156:1: ( ( ';' ) )
            // InternalTactics.g:1157:1: ( ';' )
            {
            // InternalTactics.g:1157:1: ( ';' )
            // InternalTactics.g:1158:2: ';'
            {
             before(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__2__Impl"


    // $ANTLR start "rule__PureTactic__Group__0"
    // InternalTactics.g:1168:1: rule__PureTactic__Group__0 : rule__PureTactic__Group__0__Impl rule__PureTactic__Group__1 ;
    public final void rule__PureTactic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1172:1: ( rule__PureTactic__Group__0__Impl rule__PureTactic__Group__1 )
            // InternalTactics.g:1173:2: rule__PureTactic__Group__0__Impl rule__PureTactic__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__PureTactic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureTactic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__0"


    // $ANTLR start "rule__PureTactic__Group__0__Impl"
    // InternalTactics.g:1180:1: rule__PureTactic__Group__0__Impl : ( ( rule__PureTactic__RequirementAssignment_0 )? ) ;
    public final void rule__PureTactic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1184:1: ( ( ( rule__PureTactic__RequirementAssignment_0 )? ) )
            // InternalTactics.g:1185:1: ( ( rule__PureTactic__RequirementAssignment_0 )? )
            {
            // InternalTactics.g:1185:1: ( ( rule__PureTactic__RequirementAssignment_0 )? )
            // InternalTactics.g:1186:2: ( rule__PureTactic__RequirementAssignment_0 )?
            {
             before(grammarAccess.getPureTacticAccess().getRequirementAssignment_0()); 
            // InternalTactics.g:1187:2: ( rule__PureTactic__RequirementAssignment_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTactics.g:1187:3: rule__PureTactic__RequirementAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PureTactic__RequirementAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPureTacticAccess().getRequirementAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__0__Impl"


    // $ANTLR start "rule__PureTactic__Group__1"
    // InternalTactics.g:1195:1: rule__PureTactic__Group__1 : rule__PureTactic__Group__1__Impl rule__PureTactic__Group__2 ;
    public final void rule__PureTactic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1199:1: ( rule__PureTactic__Group__1__Impl rule__PureTactic__Group__2 )
            // InternalTactics.g:1200:2: rule__PureTactic__Group__1__Impl rule__PureTactic__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__PureTactic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureTactic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__1"


    // $ANTLR start "rule__PureTactic__Group__1__Impl"
    // InternalTactics.g:1207:1: rule__PureTactic__Group__1__Impl : ( 'rule' ) ;
    public final void rule__PureTactic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1211:1: ( ( 'rule' ) )
            // InternalTactics.g:1212:1: ( 'rule' )
            {
            // InternalTactics.g:1212:1: ( 'rule' )
            // InternalTactics.g:1213:2: 'rule'
            {
             before(grammarAccess.getPureTacticAccess().getRuleKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPureTacticAccess().getRuleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__1__Impl"


    // $ANTLR start "rule__PureTactic__Group__2"
    // InternalTactics.g:1222:1: rule__PureTactic__Group__2 : rule__PureTactic__Group__2__Impl rule__PureTactic__Group__3 ;
    public final void rule__PureTactic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1226:1: ( rule__PureTactic__Group__2__Impl rule__PureTactic__Group__3 )
            // InternalTactics.g:1227:2: rule__PureTactic__Group__2__Impl rule__PureTactic__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__PureTactic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureTactic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__2"


    // $ANTLR start "rule__PureTactic__Group__2__Impl"
    // InternalTactics.g:1234:1: rule__PureTactic__Group__2__Impl : ( ( rule__PureTactic__NameAssignment_2 ) ) ;
    public final void rule__PureTactic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1238:1: ( ( ( rule__PureTactic__NameAssignment_2 ) ) )
            // InternalTactics.g:1239:1: ( ( rule__PureTactic__NameAssignment_2 ) )
            {
            // InternalTactics.g:1239:1: ( ( rule__PureTactic__NameAssignment_2 ) )
            // InternalTactics.g:1240:2: ( rule__PureTactic__NameAssignment_2 )
            {
             before(grammarAccess.getPureTacticAccess().getNameAssignment_2()); 
            // InternalTactics.g:1241:2: ( rule__PureTactic__NameAssignment_2 )
            // InternalTactics.g:1241:3: rule__PureTactic__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__PureTactic__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPureTacticAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__2__Impl"


    // $ANTLR start "rule__PureTactic__Group__3"
    // InternalTactics.g:1249:1: rule__PureTactic__Group__3 : rule__PureTactic__Group__3__Impl rule__PureTactic__Group__4 ;
    public final void rule__PureTactic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1253:1: ( rule__PureTactic__Group__3__Impl rule__PureTactic__Group__4 )
            // InternalTactics.g:1254:2: rule__PureTactic__Group__3__Impl rule__PureTactic__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__PureTactic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureTactic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__3"


    // $ANTLR start "rule__PureTactic__Group__3__Impl"
    // InternalTactics.g:1261:1: rule__PureTactic__Group__3__Impl : ( '{' ) ;
    public final void rule__PureTactic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1265:1: ( ( '{' ) )
            // InternalTactics.g:1266:1: ( '{' )
            {
            // InternalTactics.g:1266:1: ( '{' )
            // InternalTactics.g:1267:2: '{'
            {
             before(grammarAccess.getPureTacticAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPureTacticAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__3__Impl"


    // $ANTLR start "rule__PureTactic__Group__4"
    // InternalTactics.g:1276:1: rule__PureTactic__Group__4 : rule__PureTactic__Group__4__Impl rule__PureTactic__Group__5 ;
    public final void rule__PureTactic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1280:1: ( rule__PureTactic__Group__4__Impl rule__PureTactic__Group__5 )
            // InternalTactics.g:1281:2: rule__PureTactic__Group__4__Impl rule__PureTactic__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__PureTactic__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureTactic__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__4"


    // $ANTLR start "rule__PureTactic__Group__4__Impl"
    // InternalTactics.g:1288:1: rule__PureTactic__Group__4__Impl : ( ( rule__PureTactic__GuardAssignment_4 )? ) ;
    public final void rule__PureTactic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1292:1: ( ( ( rule__PureTactic__GuardAssignment_4 )? ) )
            // InternalTactics.g:1293:1: ( ( rule__PureTactic__GuardAssignment_4 )? )
            {
            // InternalTactics.g:1293:1: ( ( rule__PureTactic__GuardAssignment_4 )? )
            // InternalTactics.g:1294:2: ( rule__PureTactic__GuardAssignment_4 )?
            {
             before(grammarAccess.getPureTacticAccess().getGuardAssignment_4()); 
            // InternalTactics.g:1295:2: ( rule__PureTactic__GuardAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTactics.g:1295:3: rule__PureTactic__GuardAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__PureTactic__GuardAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPureTacticAccess().getGuardAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__4__Impl"


    // $ANTLR start "rule__PureTactic__Group__5"
    // InternalTactics.g:1303:1: rule__PureTactic__Group__5 : rule__PureTactic__Group__5__Impl rule__PureTactic__Group__6 ;
    public final void rule__PureTactic__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1307:1: ( rule__PureTactic__Group__5__Impl rule__PureTactic__Group__6 )
            // InternalTactics.g:1308:2: rule__PureTactic__Group__5__Impl rule__PureTactic__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__PureTactic__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureTactic__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__5"


    // $ANTLR start "rule__PureTactic__Group__5__Impl"
    // InternalTactics.g:1315:1: rule__PureTactic__Group__5__Impl : ( ( rule__PureTactic__ActionAssignment_5 ) ) ;
    public final void rule__PureTactic__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1319:1: ( ( ( rule__PureTactic__ActionAssignment_5 ) ) )
            // InternalTactics.g:1320:1: ( ( rule__PureTactic__ActionAssignment_5 ) )
            {
            // InternalTactics.g:1320:1: ( ( rule__PureTactic__ActionAssignment_5 ) )
            // InternalTactics.g:1321:2: ( rule__PureTactic__ActionAssignment_5 )
            {
             before(grammarAccess.getPureTacticAccess().getActionAssignment_5()); 
            // InternalTactics.g:1322:2: ( rule__PureTactic__ActionAssignment_5 )
            // InternalTactics.g:1322:3: rule__PureTactic__ActionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PureTactic__ActionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPureTacticAccess().getActionAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__5__Impl"


    // $ANTLR start "rule__PureTactic__Group__6"
    // InternalTactics.g:1330:1: rule__PureTactic__Group__6 : rule__PureTactic__Group__6__Impl rule__PureTactic__Group__7 ;
    public final void rule__PureTactic__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1334:1: ( rule__PureTactic__Group__6__Impl rule__PureTactic__Group__7 )
            // InternalTactics.g:1335:2: rule__PureTactic__Group__6__Impl rule__PureTactic__Group__7
            {
            pushFollow(FOLLOW_4);
            rule__PureTactic__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PureTactic__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__6"


    // $ANTLR start "rule__PureTactic__Group__6__Impl"
    // InternalTactics.g:1342:1: rule__PureTactic__Group__6__Impl : ( '}' ) ;
    public final void rule__PureTactic__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1346:1: ( ( '}' ) )
            // InternalTactics.g:1347:1: ( '}' )
            {
            // InternalTactics.g:1347:1: ( '}' )
            // InternalTactics.g:1348:2: '}'
            {
             before(grammarAccess.getPureTacticAccess().getRightCurlyBracketKeyword_6()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPureTacticAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__6__Impl"


    // $ANTLR start "rule__PureTactic__Group__7"
    // InternalTactics.g:1357:1: rule__PureTactic__Group__7 : rule__PureTactic__Group__7__Impl ;
    public final void rule__PureTactic__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1361:1: ( rule__PureTactic__Group__7__Impl )
            // InternalTactics.g:1362:2: rule__PureTactic__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PureTactic__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__7"


    // $ANTLR start "rule__PureTactic__Group__7__Impl"
    // InternalTactics.g:1368:1: rule__PureTactic__Group__7__Impl : ( ';' ) ;
    public final void rule__PureTactic__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1372:1: ( ( ';' ) )
            // InternalTactics.g:1373:1: ( ';' )
            {
            // InternalTactics.g:1373:1: ( ';' )
            // InternalTactics.g:1374:2: ';'
            {
             before(grammarAccess.getPureTacticAccess().getSemicolonKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPureTacticAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__Group__7__Impl"


    // $ANTLR start "rule__TacticAction__Group__0"
    // InternalTactics.g:1384:1: rule__TacticAction__Group__0 : rule__TacticAction__Group__0__Impl rule__TacticAction__Group__1 ;
    public final void rule__TacticAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1388:1: ( rule__TacticAction__Group__0__Impl rule__TacticAction__Group__1 )
            // InternalTactics.g:1389:2: rule__TacticAction__Group__0__Impl rule__TacticAction__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__TacticAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TacticAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group__0"


    // $ANTLR start "rule__TacticAction__Group__0__Impl"
    // InternalTactics.g:1396:1: rule__TacticAction__Group__0__Impl : ( 'action' ) ;
    public final void rule__TacticAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1400:1: ( ( 'action' ) )
            // InternalTactics.g:1401:1: ( 'action' )
            {
            // InternalTactics.g:1401:1: ( 'action' )
            // InternalTactics.g:1402:2: 'action'
            {
             before(grammarAccess.getTacticActionAccess().getActionKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getTacticActionAccess().getActionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group__0__Impl"


    // $ANTLR start "rule__TacticAction__Group__1"
    // InternalTactics.g:1411:1: rule__TacticAction__Group__1 : rule__TacticAction__Group__1__Impl rule__TacticAction__Group__2 ;
    public final void rule__TacticAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1415:1: ( rule__TacticAction__Group__1__Impl rule__TacticAction__Group__2 )
            // InternalTactics.g:1416:2: rule__TacticAction__Group__1__Impl rule__TacticAction__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__TacticAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TacticAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group__1"


    // $ANTLR start "rule__TacticAction__Group__1__Impl"
    // InternalTactics.g:1423:1: rule__TacticAction__Group__1__Impl : ( '{' ) ;
    public final void rule__TacticAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1427:1: ( ( '{' ) )
            // InternalTactics.g:1428:1: ( '{' )
            {
            // InternalTactics.g:1428:1: ( '{' )
            // InternalTactics.g:1429:2: '{'
            {
             before(grammarAccess.getTacticActionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTacticActionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group__1__Impl"


    // $ANTLR start "rule__TacticAction__Group__2"
    // InternalTactics.g:1438:1: rule__TacticAction__Group__2 : rule__TacticAction__Group__2__Impl rule__TacticAction__Group__3 ;
    public final void rule__TacticAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1442:1: ( rule__TacticAction__Group__2__Impl rule__TacticAction__Group__3 )
            // InternalTactics.g:1443:2: rule__TacticAction__Group__2__Impl rule__TacticAction__Group__3
            {
            pushFollow(FOLLOW_15);
            rule__TacticAction__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TacticAction__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group__2"


    // $ANTLR start "rule__TacticAction__Group__2__Impl"
    // InternalTactics.g:1450:1: rule__TacticAction__Group__2__Impl : ( ( rule__TacticAction__ActionsAssignment_2 ) ) ;
    public final void rule__TacticAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1454:1: ( ( ( rule__TacticAction__ActionsAssignment_2 ) ) )
            // InternalTactics.g:1455:1: ( ( rule__TacticAction__ActionsAssignment_2 ) )
            {
            // InternalTactics.g:1455:1: ( ( rule__TacticAction__ActionsAssignment_2 ) )
            // InternalTactics.g:1456:2: ( rule__TacticAction__ActionsAssignment_2 )
            {
             before(grammarAccess.getTacticActionAccess().getActionsAssignment_2()); 
            // InternalTactics.g:1457:2: ( rule__TacticAction__ActionsAssignment_2 )
            // InternalTactics.g:1457:3: rule__TacticAction__ActionsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TacticAction__ActionsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTacticActionAccess().getActionsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group__2__Impl"


    // $ANTLR start "rule__TacticAction__Group__3"
    // InternalTactics.g:1465:1: rule__TacticAction__Group__3 : rule__TacticAction__Group__3__Impl rule__TacticAction__Group__4 ;
    public final void rule__TacticAction__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1469:1: ( rule__TacticAction__Group__3__Impl rule__TacticAction__Group__4 )
            // InternalTactics.g:1470:2: rule__TacticAction__Group__3__Impl rule__TacticAction__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__TacticAction__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TacticAction__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group__3"


    // $ANTLR start "rule__TacticAction__Group__3__Impl"
    // InternalTactics.g:1477:1: rule__TacticAction__Group__3__Impl : ( ( rule__TacticAction__Group_3__0 )* ) ;
    public final void rule__TacticAction__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1481:1: ( ( ( rule__TacticAction__Group_3__0 )* ) )
            // InternalTactics.g:1482:1: ( ( rule__TacticAction__Group_3__0 )* )
            {
            // InternalTactics.g:1482:1: ( ( rule__TacticAction__Group_3__0 )* )
            // InternalTactics.g:1483:2: ( rule__TacticAction__Group_3__0 )*
            {
             before(grammarAccess.getTacticActionAccess().getGroup_3()); 
            // InternalTactics.g:1484:2: ( rule__TacticAction__Group_3__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTactics.g:1484:3: rule__TacticAction__Group_3__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__TacticAction__Group_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTacticActionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group__3__Impl"


    // $ANTLR start "rule__TacticAction__Group__4"
    // InternalTactics.g:1492:1: rule__TacticAction__Group__4 : rule__TacticAction__Group__4__Impl ;
    public final void rule__TacticAction__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1496:1: ( rule__TacticAction__Group__4__Impl )
            // InternalTactics.g:1497:2: rule__TacticAction__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TacticAction__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group__4"


    // $ANTLR start "rule__TacticAction__Group__4__Impl"
    // InternalTactics.g:1503:1: rule__TacticAction__Group__4__Impl : ( '}' ) ;
    public final void rule__TacticAction__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1507:1: ( ( '}' ) )
            // InternalTactics.g:1508:1: ( '}' )
            {
            // InternalTactics.g:1508:1: ( '}' )
            // InternalTactics.g:1509:2: '}'
            {
             before(grammarAccess.getTacticActionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getTacticActionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group__4__Impl"


    // $ANTLR start "rule__TacticAction__Group_3__0"
    // InternalTactics.g:1519:1: rule__TacticAction__Group_3__0 : rule__TacticAction__Group_3__0__Impl rule__TacticAction__Group_3__1 ;
    public final void rule__TacticAction__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1523:1: ( rule__TacticAction__Group_3__0__Impl rule__TacticAction__Group_3__1 )
            // InternalTactics.g:1524:2: rule__TacticAction__Group_3__0__Impl rule__TacticAction__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__TacticAction__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TacticAction__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group_3__0"


    // $ANTLR start "rule__TacticAction__Group_3__0__Impl"
    // InternalTactics.g:1531:1: rule__TacticAction__Group_3__0__Impl : ( 'AND' ) ;
    public final void rule__TacticAction__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1535:1: ( ( 'AND' ) )
            // InternalTactics.g:1536:1: ( 'AND' )
            {
            // InternalTactics.g:1536:1: ( 'AND' )
            // InternalTactics.g:1537:2: 'AND'
            {
             before(grammarAccess.getTacticActionAccess().getANDKeyword_3_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTacticActionAccess().getANDKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group_3__0__Impl"


    // $ANTLR start "rule__TacticAction__Group_3__1"
    // InternalTactics.g:1546:1: rule__TacticAction__Group_3__1 : rule__TacticAction__Group_3__1__Impl ;
    public final void rule__TacticAction__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1550:1: ( rule__TacticAction__Group_3__1__Impl )
            // InternalTactics.g:1551:2: rule__TacticAction__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TacticAction__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group_3__1"


    // $ANTLR start "rule__TacticAction__Group_3__1__Impl"
    // InternalTactics.g:1557:1: rule__TacticAction__Group_3__1__Impl : ( ( rule__TacticAction__ActionsAssignment_3_1 ) ) ;
    public final void rule__TacticAction__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1561:1: ( ( ( rule__TacticAction__ActionsAssignment_3_1 ) ) )
            // InternalTactics.g:1562:1: ( ( rule__TacticAction__ActionsAssignment_3_1 ) )
            {
            // InternalTactics.g:1562:1: ( ( rule__TacticAction__ActionsAssignment_3_1 ) )
            // InternalTactics.g:1563:2: ( rule__TacticAction__ActionsAssignment_3_1 )
            {
             before(grammarAccess.getTacticActionAccess().getActionsAssignment_3_1()); 
            // InternalTactics.g:1564:2: ( rule__TacticAction__ActionsAssignment_3_1 )
            // InternalTactics.g:1564:3: rule__TacticAction__ActionsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__TacticAction__ActionsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTacticActionAccess().getActionsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__Group_3__1__Impl"


    // $ANTLR start "rule__Guard__Group__0"
    // InternalTactics.g:1573:1: rule__Guard__Group__0 : rule__Guard__Group__0__Impl rule__Guard__Group__1 ;
    public final void rule__Guard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1577:1: ( rule__Guard__Group__0__Impl rule__Guard__Group__1 )
            // InternalTactics.g:1578:2: rule__Guard__Group__0__Impl rule__Guard__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Guard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__0"


    // $ANTLR start "rule__Guard__Group__0__Impl"
    // InternalTactics.g:1585:1: rule__Guard__Group__0__Impl : ( 'guard' ) ;
    public final void rule__Guard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1589:1: ( ( 'guard' ) )
            // InternalTactics.g:1590:1: ( 'guard' )
            {
            // InternalTactics.g:1590:1: ( 'guard' )
            // InternalTactics.g:1591:2: 'guard'
            {
             before(grammarAccess.getGuardAccess().getGuardKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getGuardAccess().getGuardKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__0__Impl"


    // $ANTLR start "rule__Guard__Group__1"
    // InternalTactics.g:1600:1: rule__Guard__Group__1 : rule__Guard__Group__1__Impl rule__Guard__Group__2 ;
    public final void rule__Guard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1604:1: ( rule__Guard__Group__1__Impl rule__Guard__Group__2 )
            // InternalTactics.g:1605:2: rule__Guard__Group__1__Impl rule__Guard__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Guard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__1"


    // $ANTLR start "rule__Guard__Group__1__Impl"
    // InternalTactics.g:1612:1: rule__Guard__Group__1__Impl : ( '{' ) ;
    public final void rule__Guard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1616:1: ( ( '{' ) )
            // InternalTactics.g:1617:1: ( '{' )
            {
            // InternalTactics.g:1617:1: ( '{' )
            // InternalTactics.g:1618:2: '{'
            {
             before(grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getGuardAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__1__Impl"


    // $ANTLR start "rule__Guard__Group__2"
    // InternalTactics.g:1627:1: rule__Guard__Group__2 : rule__Guard__Group__2__Impl rule__Guard__Group__3 ;
    public final void rule__Guard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1631:1: ( rule__Guard__Group__2__Impl rule__Guard__Group__3 )
            // InternalTactics.g:1632:2: rule__Guard__Group__2__Impl rule__Guard__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Guard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__2"


    // $ANTLR start "rule__Guard__Group__2__Impl"
    // InternalTactics.g:1639:1: rule__Guard__Group__2__Impl : ( ( rule__Guard__Alternatives_2 ) ) ;
    public final void rule__Guard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1643:1: ( ( ( rule__Guard__Alternatives_2 ) ) )
            // InternalTactics.g:1644:1: ( ( rule__Guard__Alternatives_2 ) )
            {
            // InternalTactics.g:1644:1: ( ( rule__Guard__Alternatives_2 ) )
            // InternalTactics.g:1645:2: ( rule__Guard__Alternatives_2 )
            {
             before(grammarAccess.getGuardAccess().getAlternatives_2()); 
            // InternalTactics.g:1646:2: ( rule__Guard__Alternatives_2 )
            // InternalTactics.g:1646:3: rule__Guard__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Guard__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__2__Impl"


    // $ANTLR start "rule__Guard__Group__3"
    // InternalTactics.g:1654:1: rule__Guard__Group__3 : rule__Guard__Group__3__Impl ;
    public final void rule__Guard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1658:1: ( rule__Guard__Group__3__Impl )
            // InternalTactics.g:1659:2: rule__Guard__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guard__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__3"


    // $ANTLR start "rule__Guard__Group__3__Impl"
    // InternalTactics.g:1665:1: rule__Guard__Group__3__Impl : ( '}' ) ;
    public final void rule__Guard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1669:1: ( ( '}' ) )
            // InternalTactics.g:1670:1: ( '}' )
            {
            // InternalTactics.g:1670:1: ( '}' )
            // InternalTactics.g:1671:2: '}'
            {
             before(grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getGuardAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group__3__Impl"


    // $ANTLR start "rule__Guard__Group_2_0__0"
    // InternalTactics.g:1681:1: rule__Guard__Group_2_0__0 : rule__Guard__Group_2_0__0__Impl rule__Guard__Group_2_0__1 ;
    public final void rule__Guard__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1685:1: ( rule__Guard__Group_2_0__0__Impl rule__Guard__Group_2_0__1 )
            // InternalTactics.g:1686:2: rule__Guard__Group_2_0__0__Impl rule__Guard__Group_2_0__1
            {
            pushFollow(FOLLOW_17);
            rule__Guard__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guard__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_2_0__0"


    // $ANTLR start "rule__Guard__Group_2_0__0__Impl"
    // InternalTactics.g:1693:1: rule__Guard__Group_2_0__0__Impl : ( ( rule__Guard__ContextGuardAssignment_2_0_0 ) ) ;
    public final void rule__Guard__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1697:1: ( ( ( rule__Guard__ContextGuardAssignment_2_0_0 ) ) )
            // InternalTactics.g:1698:1: ( ( rule__Guard__ContextGuardAssignment_2_0_0 ) )
            {
            // InternalTactics.g:1698:1: ( ( rule__Guard__ContextGuardAssignment_2_0_0 ) )
            // InternalTactics.g:1699:2: ( rule__Guard__ContextGuardAssignment_2_0_0 )
            {
             before(grammarAccess.getGuardAccess().getContextGuardAssignment_2_0_0()); 
            // InternalTactics.g:1700:2: ( rule__Guard__ContextGuardAssignment_2_0_0 )
            // InternalTactics.g:1700:3: rule__Guard__ContextGuardAssignment_2_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Guard__ContextGuardAssignment_2_0_0();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getContextGuardAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_2_0__0__Impl"


    // $ANTLR start "rule__Guard__Group_2_0__1"
    // InternalTactics.g:1708:1: rule__Guard__Group_2_0__1 : rule__Guard__Group_2_0__1__Impl ;
    public final void rule__Guard__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1712:1: ( rule__Guard__Group_2_0__1__Impl )
            // InternalTactics.g:1713:2: rule__Guard__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guard__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_2_0__1"


    // $ANTLR start "rule__Guard__Group_2_0__1__Impl"
    // InternalTactics.g:1719:1: rule__Guard__Group_2_0__1__Impl : ( ( rule__Guard__FeatureGuardAssignment_2_0_1 )? ) ;
    public final void rule__Guard__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1723:1: ( ( ( rule__Guard__FeatureGuardAssignment_2_0_1 )? ) )
            // InternalTactics.g:1724:1: ( ( rule__Guard__FeatureGuardAssignment_2_0_1 )? )
            {
            // InternalTactics.g:1724:1: ( ( rule__Guard__FeatureGuardAssignment_2_0_1 )? )
            // InternalTactics.g:1725:2: ( rule__Guard__FeatureGuardAssignment_2_0_1 )?
            {
             before(grammarAccess.getGuardAccess().getFeatureGuardAssignment_2_0_1()); 
            // InternalTactics.g:1726:2: ( rule__Guard__FeatureGuardAssignment_2_0_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==32) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTactics.g:1726:3: rule__Guard__FeatureGuardAssignment_2_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guard__FeatureGuardAssignment_2_0_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuardAccess().getFeatureGuardAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_2_0__1__Impl"


    // $ANTLR start "rule__Guard__Group_2_1__0"
    // InternalTactics.g:1735:1: rule__Guard__Group_2_1__0 : rule__Guard__Group_2_1__0__Impl rule__Guard__Group_2_1__1 ;
    public final void rule__Guard__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1739:1: ( rule__Guard__Group_2_1__0__Impl rule__Guard__Group_2_1__1 )
            // InternalTactics.g:1740:2: rule__Guard__Group_2_1__0__Impl rule__Guard__Group_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__Guard__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Guard__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_2_1__0"


    // $ANTLR start "rule__Guard__Group_2_1__0__Impl"
    // InternalTactics.g:1747:1: rule__Guard__Group_2_1__0__Impl : ( ( rule__Guard__FeatureGuardAssignment_2_1_0 ) ) ;
    public final void rule__Guard__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1751:1: ( ( ( rule__Guard__FeatureGuardAssignment_2_1_0 ) ) )
            // InternalTactics.g:1752:1: ( ( rule__Guard__FeatureGuardAssignment_2_1_0 ) )
            {
            // InternalTactics.g:1752:1: ( ( rule__Guard__FeatureGuardAssignment_2_1_0 ) )
            // InternalTactics.g:1753:2: ( rule__Guard__FeatureGuardAssignment_2_1_0 )
            {
             before(grammarAccess.getGuardAccess().getFeatureGuardAssignment_2_1_0()); 
            // InternalTactics.g:1754:2: ( rule__Guard__FeatureGuardAssignment_2_1_0 )
            // InternalTactics.g:1754:3: rule__Guard__FeatureGuardAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Guard__FeatureGuardAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getGuardAccess().getFeatureGuardAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_2_1__0__Impl"


    // $ANTLR start "rule__Guard__Group_2_1__1"
    // InternalTactics.g:1762:1: rule__Guard__Group_2_1__1 : rule__Guard__Group_2_1__1__Impl ;
    public final void rule__Guard__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1766:1: ( rule__Guard__Group_2_1__1__Impl )
            // InternalTactics.g:1767:2: rule__Guard__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Guard__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_2_1__1"


    // $ANTLR start "rule__Guard__Group_2_1__1__Impl"
    // InternalTactics.g:1773:1: rule__Guard__Group_2_1__1__Impl : ( ( rule__Guard__ContextGuardAssignment_2_1_1 )? ) ;
    public final void rule__Guard__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1777:1: ( ( ( rule__Guard__ContextGuardAssignment_2_1_1 )? ) )
            // InternalTactics.g:1778:1: ( ( rule__Guard__ContextGuardAssignment_2_1_1 )? )
            {
            // InternalTactics.g:1778:1: ( ( rule__Guard__ContextGuardAssignment_2_1_1 )? )
            // InternalTactics.g:1779:2: ( rule__Guard__ContextGuardAssignment_2_1_1 )?
            {
             before(grammarAccess.getGuardAccess().getContextGuardAssignment_2_1_1()); 
            // InternalTactics.g:1780:2: ( rule__Guard__ContextGuardAssignment_2_1_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTactics.g:1780:3: rule__Guard__ContextGuardAssignment_2_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Guard__ContextGuardAssignment_2_1_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getGuardAccess().getContextGuardAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__Group_2_1__1__Impl"


    // $ANTLR start "rule__ContextGuard__Group__0"
    // InternalTactics.g:1789:1: rule__ContextGuard__Group__0 : rule__ContextGuard__Group__0__Impl rule__ContextGuard__Group__1 ;
    public final void rule__ContextGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1793:1: ( rule__ContextGuard__Group__0__Impl rule__ContextGuard__Group__1 )
            // InternalTactics.g:1794:2: rule__ContextGuard__Group__0__Impl rule__ContextGuard__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__ContextGuard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextGuard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextGuard__Group__0"


    // $ANTLR start "rule__ContextGuard__Group__0__Impl"
    // InternalTactics.g:1801:1: rule__ContextGuard__Group__0__Impl : ( 'context' ) ;
    public final void rule__ContextGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1805:1: ( ( 'context' ) )
            // InternalTactics.g:1806:1: ( 'context' )
            {
            // InternalTactics.g:1806:1: ( 'context' )
            // InternalTactics.g:1807:2: 'context'
            {
             before(grammarAccess.getContextGuardAccess().getContextKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getContextGuardAccess().getContextKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextGuard__Group__0__Impl"


    // $ANTLR start "rule__ContextGuard__Group__1"
    // InternalTactics.g:1816:1: rule__ContextGuard__Group__1 : rule__ContextGuard__Group__1__Impl rule__ContextGuard__Group__2 ;
    public final void rule__ContextGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1820:1: ( rule__ContextGuard__Group__1__Impl rule__ContextGuard__Group__2 )
            // InternalTactics.g:1821:2: rule__ContextGuard__Group__1__Impl rule__ContextGuard__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ContextGuard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextGuard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextGuard__Group__1"


    // $ANTLR start "rule__ContextGuard__Group__1__Impl"
    // InternalTactics.g:1828:1: rule__ContextGuard__Group__1__Impl : ( '(' ) ;
    public final void rule__ContextGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1832:1: ( ( '(' ) )
            // InternalTactics.g:1833:1: ( '(' )
            {
            // InternalTactics.g:1833:1: ( '(' )
            // InternalTactics.g:1834:2: '('
            {
             before(grammarAccess.getContextGuardAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getContextGuardAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextGuard__Group__1__Impl"


    // $ANTLR start "rule__ContextGuard__Group__2"
    // InternalTactics.g:1843:1: rule__ContextGuard__Group__2 : rule__ContextGuard__Group__2__Impl rule__ContextGuard__Group__3 ;
    public final void rule__ContextGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1847:1: ( rule__ContextGuard__Group__2__Impl rule__ContextGuard__Group__3 )
            // InternalTactics.g:1848:2: rule__ContextGuard__Group__2__Impl rule__ContextGuard__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__ContextGuard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextGuard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextGuard__Group__2"


    // $ANTLR start "rule__ContextGuard__Group__2__Impl"
    // InternalTactics.g:1855:1: rule__ContextGuard__Group__2__Impl : ( ( rule__ContextGuard__ContextConditionAssignment_2 ) ) ;
    public final void rule__ContextGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1859:1: ( ( ( rule__ContextGuard__ContextConditionAssignment_2 ) ) )
            // InternalTactics.g:1860:1: ( ( rule__ContextGuard__ContextConditionAssignment_2 ) )
            {
            // InternalTactics.g:1860:1: ( ( rule__ContextGuard__ContextConditionAssignment_2 ) )
            // InternalTactics.g:1861:2: ( rule__ContextGuard__ContextConditionAssignment_2 )
            {
             before(grammarAccess.getContextGuardAccess().getContextConditionAssignment_2()); 
            // InternalTactics.g:1862:2: ( rule__ContextGuard__ContextConditionAssignment_2 )
            // InternalTactics.g:1862:3: rule__ContextGuard__ContextConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContextGuard__ContextConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContextGuardAccess().getContextConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextGuard__Group__2__Impl"


    // $ANTLR start "rule__ContextGuard__Group__3"
    // InternalTactics.g:1870:1: rule__ContextGuard__Group__3 : rule__ContextGuard__Group__3__Impl ;
    public final void rule__ContextGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1874:1: ( rule__ContextGuard__Group__3__Impl )
            // InternalTactics.g:1875:2: rule__ContextGuard__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextGuard__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextGuard__Group__3"


    // $ANTLR start "rule__ContextGuard__Group__3__Impl"
    // InternalTactics.g:1881:1: rule__ContextGuard__Group__3__Impl : ( ')' ) ;
    public final void rule__ContextGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1885:1: ( ( ')' ) )
            // InternalTactics.g:1886:1: ( ')' )
            {
            // InternalTactics.g:1886:1: ( ')' )
            // InternalTactics.g:1887:2: ')'
            {
             before(grammarAccess.getContextGuardAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getContextGuardAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextGuard__Group__3__Impl"


    // $ANTLR start "rule__FeatureGuard__Group__0"
    // InternalTactics.g:1897:1: rule__FeatureGuard__Group__0 : rule__FeatureGuard__Group__0__Impl rule__FeatureGuard__Group__1 ;
    public final void rule__FeatureGuard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1901:1: ( rule__FeatureGuard__Group__0__Impl rule__FeatureGuard__Group__1 )
            // InternalTactics.g:1902:2: rule__FeatureGuard__Group__0__Impl rule__FeatureGuard__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__FeatureGuard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureGuard__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGuard__Group__0"


    // $ANTLR start "rule__FeatureGuard__Group__0__Impl"
    // InternalTactics.g:1909:1: rule__FeatureGuard__Group__0__Impl : ( 'features' ) ;
    public final void rule__FeatureGuard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1913:1: ( ( 'features' ) )
            // InternalTactics.g:1914:1: ( 'features' )
            {
            // InternalTactics.g:1914:1: ( 'features' )
            // InternalTactics.g:1915:2: 'features'
            {
             before(grammarAccess.getFeatureGuardAccess().getFeaturesKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFeatureGuardAccess().getFeaturesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGuard__Group__0__Impl"


    // $ANTLR start "rule__FeatureGuard__Group__1"
    // InternalTactics.g:1924:1: rule__FeatureGuard__Group__1 : rule__FeatureGuard__Group__1__Impl rule__FeatureGuard__Group__2 ;
    public final void rule__FeatureGuard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1928:1: ( rule__FeatureGuard__Group__1__Impl rule__FeatureGuard__Group__2 )
            // InternalTactics.g:1929:2: rule__FeatureGuard__Group__1__Impl rule__FeatureGuard__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__FeatureGuard__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureGuard__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGuard__Group__1"


    // $ANTLR start "rule__FeatureGuard__Group__1__Impl"
    // InternalTactics.g:1936:1: rule__FeatureGuard__Group__1__Impl : ( '(' ) ;
    public final void rule__FeatureGuard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1940:1: ( ( '(' ) )
            // InternalTactics.g:1941:1: ( '(' )
            {
            // InternalTactics.g:1941:1: ( '(' )
            // InternalTactics.g:1942:2: '('
            {
             before(grammarAccess.getFeatureGuardAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFeatureGuardAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGuard__Group__1__Impl"


    // $ANTLR start "rule__FeatureGuard__Group__2"
    // InternalTactics.g:1951:1: rule__FeatureGuard__Group__2 : rule__FeatureGuard__Group__2__Impl rule__FeatureGuard__Group__3 ;
    public final void rule__FeatureGuard__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1955:1: ( rule__FeatureGuard__Group__2__Impl rule__FeatureGuard__Group__3 )
            // InternalTactics.g:1956:2: rule__FeatureGuard__Group__2__Impl rule__FeatureGuard__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__FeatureGuard__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureGuard__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGuard__Group__2"


    // $ANTLR start "rule__FeatureGuard__Group__2__Impl"
    // InternalTactics.g:1963:1: rule__FeatureGuard__Group__2__Impl : ( ( rule__FeatureGuard__FeatureConditionAssignment_2 ) ) ;
    public final void rule__FeatureGuard__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1967:1: ( ( ( rule__FeatureGuard__FeatureConditionAssignment_2 ) ) )
            // InternalTactics.g:1968:1: ( ( rule__FeatureGuard__FeatureConditionAssignment_2 ) )
            {
            // InternalTactics.g:1968:1: ( ( rule__FeatureGuard__FeatureConditionAssignment_2 ) )
            // InternalTactics.g:1969:2: ( rule__FeatureGuard__FeatureConditionAssignment_2 )
            {
             before(grammarAccess.getFeatureGuardAccess().getFeatureConditionAssignment_2()); 
            // InternalTactics.g:1970:2: ( rule__FeatureGuard__FeatureConditionAssignment_2 )
            // InternalTactics.g:1970:3: rule__FeatureGuard__FeatureConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FeatureGuard__FeatureConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureGuardAccess().getFeatureConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGuard__Group__2__Impl"


    // $ANTLR start "rule__FeatureGuard__Group__3"
    // InternalTactics.g:1978:1: rule__FeatureGuard__Group__3 : rule__FeatureGuard__Group__3__Impl ;
    public final void rule__FeatureGuard__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1982:1: ( rule__FeatureGuard__Group__3__Impl )
            // InternalTactics.g:1983:2: rule__FeatureGuard__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureGuard__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGuard__Group__3"


    // $ANTLR start "rule__FeatureGuard__Group__3__Impl"
    // InternalTactics.g:1989:1: rule__FeatureGuard__Group__3__Impl : ( ')' ) ;
    public final void rule__FeatureGuard__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:1993:1: ( ( ')' ) )
            // InternalTactics.g:1994:1: ( ')' )
            {
            // InternalTactics.g:1994:1: ( ')' )
            // InternalTactics.g:1995:2: ')'
            {
             before(grammarAccess.getFeatureGuardAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFeatureGuardAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGuard__Group__3__Impl"


    // $ANTLR start "rule__FeatureCondition__Group__0"
    // InternalTactics.g:2005:1: rule__FeatureCondition__Group__0 : rule__FeatureCondition__Group__0__Impl rule__FeatureCondition__Group__1 ;
    public final void rule__FeatureCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2009:1: ( rule__FeatureCondition__Group__0__Impl rule__FeatureCondition__Group__1 )
            // InternalTactics.g:2010:2: rule__FeatureCondition__Group__0__Impl rule__FeatureCondition__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__FeatureCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group__0"


    // $ANTLR start "rule__FeatureCondition__Group__0__Impl"
    // InternalTactics.g:2017:1: rule__FeatureCondition__Group__0__Impl : ( ( rule__FeatureCondition__NotAssignment_0 )? ) ;
    public final void rule__FeatureCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2021:1: ( ( ( rule__FeatureCondition__NotAssignment_0 )? ) )
            // InternalTactics.g:2022:1: ( ( rule__FeatureCondition__NotAssignment_0 )? )
            {
            // InternalTactics.g:2022:1: ( ( rule__FeatureCondition__NotAssignment_0 )? )
            // InternalTactics.g:2023:2: ( rule__FeatureCondition__NotAssignment_0 )?
            {
             before(grammarAccess.getFeatureConditionAccess().getNotAssignment_0()); 
            // InternalTactics.g:2024:2: ( rule__FeatureCondition__NotAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTactics.g:2024:3: rule__FeatureCondition__NotAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureCondition__NotAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureConditionAccess().getNotAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group__0__Impl"


    // $ANTLR start "rule__FeatureCondition__Group__1"
    // InternalTactics.g:2032:1: rule__FeatureCondition__Group__1 : rule__FeatureCondition__Group__1__Impl rule__FeatureCondition__Group__2 ;
    public final void rule__FeatureCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2036:1: ( rule__FeatureCondition__Group__1__Impl rule__FeatureCondition__Group__2 )
            // InternalTactics.g:2037:2: rule__FeatureCondition__Group__1__Impl rule__FeatureCondition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__FeatureCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group__1"


    // $ANTLR start "rule__FeatureCondition__Group__1__Impl"
    // InternalTactics.g:2044:1: rule__FeatureCondition__Group__1__Impl : ( 'selected(' ) ;
    public final void rule__FeatureCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2048:1: ( ( 'selected(' ) )
            // InternalTactics.g:2049:1: ( 'selected(' )
            {
            // InternalTactics.g:2049:1: ( 'selected(' )
            // InternalTactics.g:2050:2: 'selected('
            {
             before(grammarAccess.getFeatureConditionAccess().getSelectedKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFeatureConditionAccess().getSelectedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group__1__Impl"


    // $ANTLR start "rule__FeatureCondition__Group__2"
    // InternalTactics.g:2059:1: rule__FeatureCondition__Group__2 : rule__FeatureCondition__Group__2__Impl rule__FeatureCondition__Group__3 ;
    public final void rule__FeatureCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2063:1: ( rule__FeatureCondition__Group__2__Impl rule__FeatureCondition__Group__3 )
            // InternalTactics.g:2064:2: rule__FeatureCondition__Group__2__Impl rule__FeatureCondition__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__FeatureCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group__2"


    // $ANTLR start "rule__FeatureCondition__Group__2__Impl"
    // InternalTactics.g:2071:1: rule__FeatureCondition__Group__2__Impl : ( ( rule__FeatureCondition__VariantAssignment_2 ) ) ;
    public final void rule__FeatureCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2075:1: ( ( ( rule__FeatureCondition__VariantAssignment_2 ) ) )
            // InternalTactics.g:2076:1: ( ( rule__FeatureCondition__VariantAssignment_2 ) )
            {
            // InternalTactics.g:2076:1: ( ( rule__FeatureCondition__VariantAssignment_2 ) )
            // InternalTactics.g:2077:2: ( rule__FeatureCondition__VariantAssignment_2 )
            {
             before(grammarAccess.getFeatureConditionAccess().getVariantAssignment_2()); 
            // InternalTactics.g:2078:2: ( rule__FeatureCondition__VariantAssignment_2 )
            // InternalTactics.g:2078:3: rule__FeatureCondition__VariantAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCondition__VariantAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFeatureConditionAccess().getVariantAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group__2__Impl"


    // $ANTLR start "rule__FeatureCondition__Group__3"
    // InternalTactics.g:2086:1: rule__FeatureCondition__Group__3 : rule__FeatureCondition__Group__3__Impl rule__FeatureCondition__Group__4 ;
    public final void rule__FeatureCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2090:1: ( rule__FeatureCondition__Group__3__Impl rule__FeatureCondition__Group__4 )
            // InternalTactics.g:2091:2: rule__FeatureCondition__Group__3__Impl rule__FeatureCondition__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__FeatureCondition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCondition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group__3"


    // $ANTLR start "rule__FeatureCondition__Group__3__Impl"
    // InternalTactics.g:2098:1: rule__FeatureCondition__Group__3__Impl : ( ')' ) ;
    public final void rule__FeatureCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2102:1: ( ( ')' ) )
            // InternalTactics.g:2103:1: ( ')' )
            {
            // InternalTactics.g:2103:1: ( ')' )
            // InternalTactics.g:2104:2: ')'
            {
             before(grammarAccess.getFeatureConditionAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFeatureConditionAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group__3__Impl"


    // $ANTLR start "rule__FeatureCondition__Group__4"
    // InternalTactics.g:2113:1: rule__FeatureCondition__Group__4 : rule__FeatureCondition__Group__4__Impl ;
    public final void rule__FeatureCondition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2117:1: ( rule__FeatureCondition__Group__4__Impl )
            // InternalTactics.g:2118:2: rule__FeatureCondition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCondition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group__4"


    // $ANTLR start "rule__FeatureCondition__Group__4__Impl"
    // InternalTactics.g:2124:1: rule__FeatureCondition__Group__4__Impl : ( ( rule__FeatureCondition__Group_4__0 )? ) ;
    public final void rule__FeatureCondition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2128:1: ( ( ( rule__FeatureCondition__Group_4__0 )? ) )
            // InternalTactics.g:2129:1: ( ( rule__FeatureCondition__Group_4__0 )? )
            {
            // InternalTactics.g:2129:1: ( ( rule__FeatureCondition__Group_4__0 )? )
            // InternalTactics.g:2130:2: ( rule__FeatureCondition__Group_4__0 )?
            {
             before(grammarAccess.getFeatureConditionAccess().getGroup_4()); 
            // InternalTactics.g:2131:2: ( rule__FeatureCondition__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=19 && LA18_0<=20)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTactics.g:2131:3: rule__FeatureCondition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FeatureCondition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeatureConditionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group__4__Impl"


    // $ANTLR start "rule__FeatureCondition__Group_4__0"
    // InternalTactics.g:2140:1: rule__FeatureCondition__Group_4__0 : rule__FeatureCondition__Group_4__0__Impl rule__FeatureCondition__Group_4__1 ;
    public final void rule__FeatureCondition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2144:1: ( rule__FeatureCondition__Group_4__0__Impl rule__FeatureCondition__Group_4__1 )
            // InternalTactics.g:2145:2: rule__FeatureCondition__Group_4__0__Impl rule__FeatureCondition__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__FeatureCondition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureCondition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group_4__0"


    // $ANTLR start "rule__FeatureCondition__Group_4__0__Impl"
    // InternalTactics.g:2152:1: rule__FeatureCondition__Group_4__0__Impl : ( ( rule__FeatureCondition__LogicalOpAssignment_4_0 ) ) ;
    public final void rule__FeatureCondition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2156:1: ( ( ( rule__FeatureCondition__LogicalOpAssignment_4_0 ) ) )
            // InternalTactics.g:2157:1: ( ( rule__FeatureCondition__LogicalOpAssignment_4_0 ) )
            {
            // InternalTactics.g:2157:1: ( ( rule__FeatureCondition__LogicalOpAssignment_4_0 ) )
            // InternalTactics.g:2158:2: ( rule__FeatureCondition__LogicalOpAssignment_4_0 )
            {
             before(grammarAccess.getFeatureConditionAccess().getLogicalOpAssignment_4_0()); 
            // InternalTactics.g:2159:2: ( rule__FeatureCondition__LogicalOpAssignment_4_0 )
            // InternalTactics.g:2159:3: rule__FeatureCondition__LogicalOpAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCondition__LogicalOpAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureConditionAccess().getLogicalOpAssignment_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group_4__0__Impl"


    // $ANTLR start "rule__FeatureCondition__Group_4__1"
    // InternalTactics.g:2167:1: rule__FeatureCondition__Group_4__1 : rule__FeatureCondition__Group_4__1__Impl ;
    public final void rule__FeatureCondition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2171:1: ( rule__FeatureCondition__Group_4__1__Impl )
            // InternalTactics.g:2172:2: rule__FeatureCondition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCondition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group_4__1"


    // $ANTLR start "rule__FeatureCondition__Group_4__1__Impl"
    // InternalTactics.g:2178:1: rule__FeatureCondition__Group_4__1__Impl : ( ( rule__FeatureCondition__SecondTermAssignment_4_1 ) ) ;
    public final void rule__FeatureCondition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2182:1: ( ( ( rule__FeatureCondition__SecondTermAssignment_4_1 ) ) )
            // InternalTactics.g:2183:1: ( ( rule__FeatureCondition__SecondTermAssignment_4_1 ) )
            {
            // InternalTactics.g:2183:1: ( ( rule__FeatureCondition__SecondTermAssignment_4_1 ) )
            // InternalTactics.g:2184:2: ( rule__FeatureCondition__SecondTermAssignment_4_1 )
            {
             before(grammarAccess.getFeatureConditionAccess().getSecondTermAssignment_4_1()); 
            // InternalTactics.g:2185:2: ( rule__FeatureCondition__SecondTermAssignment_4_1 )
            // InternalTactics.g:2185:3: rule__FeatureCondition__SecondTermAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureCondition__SecondTermAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureConditionAccess().getSecondTermAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__Group_4__1__Impl"


    // $ANTLR start "rule__ContextThresholdCondition__Group__0"
    // InternalTactics.g:2194:1: rule__ContextThresholdCondition__Group__0 : rule__ContextThresholdCondition__Group__0__Impl rule__ContextThresholdCondition__Group__1 ;
    public final void rule__ContextThresholdCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2198:1: ( rule__ContextThresholdCondition__Group__0__Impl rule__ContextThresholdCondition__Group__1 )
            // InternalTactics.g:2199:2: rule__ContextThresholdCondition__Group__0__Impl rule__ContextThresholdCondition__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ContextThresholdCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextThresholdCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__Group__0"


    // $ANTLR start "rule__ContextThresholdCondition__Group__0__Impl"
    // InternalTactics.g:2206:1: rule__ContextThresholdCondition__Group__0__Impl : ( ( rule__ContextThresholdCondition__ContextVarAssignment_0 ) ) ;
    public final void rule__ContextThresholdCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2210:1: ( ( ( rule__ContextThresholdCondition__ContextVarAssignment_0 ) ) )
            // InternalTactics.g:2211:1: ( ( rule__ContextThresholdCondition__ContextVarAssignment_0 ) )
            {
            // InternalTactics.g:2211:1: ( ( rule__ContextThresholdCondition__ContextVarAssignment_0 ) )
            // InternalTactics.g:2212:2: ( rule__ContextThresholdCondition__ContextVarAssignment_0 )
            {
             before(grammarAccess.getContextThresholdConditionAccess().getContextVarAssignment_0()); 
            // InternalTactics.g:2213:2: ( rule__ContextThresholdCondition__ContextVarAssignment_0 )
            // InternalTactics.g:2213:3: rule__ContextThresholdCondition__ContextVarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ContextThresholdCondition__ContextVarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContextThresholdConditionAccess().getContextVarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__Group__0__Impl"


    // $ANTLR start "rule__ContextThresholdCondition__Group__1"
    // InternalTactics.g:2221:1: rule__ContextThresholdCondition__Group__1 : rule__ContextThresholdCondition__Group__1__Impl rule__ContextThresholdCondition__Group__2 ;
    public final void rule__ContextThresholdCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2225:1: ( rule__ContextThresholdCondition__Group__1__Impl rule__ContextThresholdCondition__Group__2 )
            // InternalTactics.g:2226:2: rule__ContextThresholdCondition__Group__1__Impl rule__ContextThresholdCondition__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__ContextThresholdCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextThresholdCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__Group__1"


    // $ANTLR start "rule__ContextThresholdCondition__Group__1__Impl"
    // InternalTactics.g:2233:1: rule__ContextThresholdCondition__Group__1__Impl : ( ( rule__ContextThresholdCondition__OperatorAssignment_1 ) ) ;
    public final void rule__ContextThresholdCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2237:1: ( ( ( rule__ContextThresholdCondition__OperatorAssignment_1 ) ) )
            // InternalTactics.g:2238:1: ( ( rule__ContextThresholdCondition__OperatorAssignment_1 ) )
            {
            // InternalTactics.g:2238:1: ( ( rule__ContextThresholdCondition__OperatorAssignment_1 ) )
            // InternalTactics.g:2239:2: ( rule__ContextThresholdCondition__OperatorAssignment_1 )
            {
             before(grammarAccess.getContextThresholdConditionAccess().getOperatorAssignment_1()); 
            // InternalTactics.g:2240:2: ( rule__ContextThresholdCondition__OperatorAssignment_1 )
            // InternalTactics.g:2240:3: rule__ContextThresholdCondition__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContextThresholdCondition__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextThresholdConditionAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__Group__1__Impl"


    // $ANTLR start "rule__ContextThresholdCondition__Group__2"
    // InternalTactics.g:2248:1: rule__ContextThresholdCondition__Group__2 : rule__ContextThresholdCondition__Group__2__Impl rule__ContextThresholdCondition__Group__3 ;
    public final void rule__ContextThresholdCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2252:1: ( rule__ContextThresholdCondition__Group__2__Impl rule__ContextThresholdCondition__Group__3 )
            // InternalTactics.g:2253:2: rule__ContextThresholdCondition__Group__2__Impl rule__ContextThresholdCondition__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ContextThresholdCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextThresholdCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__Group__2"


    // $ANTLR start "rule__ContextThresholdCondition__Group__2__Impl"
    // InternalTactics.g:2260:1: rule__ContextThresholdCondition__Group__2__Impl : ( ( rule__ContextThresholdCondition__ThresholdValueAssignment_2 ) ) ;
    public final void rule__ContextThresholdCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2264:1: ( ( ( rule__ContextThresholdCondition__ThresholdValueAssignment_2 ) ) )
            // InternalTactics.g:2265:1: ( ( rule__ContextThresholdCondition__ThresholdValueAssignment_2 ) )
            {
            // InternalTactics.g:2265:1: ( ( rule__ContextThresholdCondition__ThresholdValueAssignment_2 ) )
            // InternalTactics.g:2266:2: ( rule__ContextThresholdCondition__ThresholdValueAssignment_2 )
            {
             before(grammarAccess.getContextThresholdConditionAccess().getThresholdValueAssignment_2()); 
            // InternalTactics.g:2267:2: ( rule__ContextThresholdCondition__ThresholdValueAssignment_2 )
            // InternalTactics.g:2267:3: rule__ContextThresholdCondition__ThresholdValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContextThresholdCondition__ThresholdValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContextThresholdConditionAccess().getThresholdValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__Group__2__Impl"


    // $ANTLR start "rule__ContextThresholdCondition__Group__3"
    // InternalTactics.g:2275:1: rule__ContextThresholdCondition__Group__3 : rule__ContextThresholdCondition__Group__3__Impl ;
    public final void rule__ContextThresholdCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2279:1: ( rule__ContextThresholdCondition__Group__3__Impl )
            // InternalTactics.g:2280:2: rule__ContextThresholdCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextThresholdCondition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__Group__3"


    // $ANTLR start "rule__ContextThresholdCondition__Group__3__Impl"
    // InternalTactics.g:2286:1: rule__ContextThresholdCondition__Group__3__Impl : ( ( rule__ContextThresholdCondition__Group_3__0 )? ) ;
    public final void rule__ContextThresholdCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2290:1: ( ( ( rule__ContextThresholdCondition__Group_3__0 )? ) )
            // InternalTactics.g:2291:1: ( ( rule__ContextThresholdCondition__Group_3__0 )? )
            {
            // InternalTactics.g:2291:1: ( ( rule__ContextThresholdCondition__Group_3__0 )? )
            // InternalTactics.g:2292:2: ( rule__ContextThresholdCondition__Group_3__0 )?
            {
             before(grammarAccess.getContextThresholdConditionAccess().getGroup_3()); 
            // InternalTactics.g:2293:2: ( rule__ContextThresholdCondition__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=19 && LA19_0<=20)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTactics.g:2293:3: rule__ContextThresholdCondition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContextThresholdCondition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextThresholdConditionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__Group__3__Impl"


    // $ANTLR start "rule__ContextThresholdCondition__Group_3__0"
    // InternalTactics.g:2302:1: rule__ContextThresholdCondition__Group_3__0 : rule__ContextThresholdCondition__Group_3__0__Impl rule__ContextThresholdCondition__Group_3__1 ;
    public final void rule__ContextThresholdCondition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2306:1: ( rule__ContextThresholdCondition__Group_3__0__Impl rule__ContextThresholdCondition__Group_3__1 )
            // InternalTactics.g:2307:2: rule__ContextThresholdCondition__Group_3__0__Impl rule__ContextThresholdCondition__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ContextThresholdCondition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextThresholdCondition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__Group_3__0"


    // $ANTLR start "rule__ContextThresholdCondition__Group_3__0__Impl"
    // InternalTactics.g:2314:1: rule__ContextThresholdCondition__Group_3__0__Impl : ( ( rule__ContextThresholdCondition__LogicalOpAssignment_3_0 ) ) ;
    public final void rule__ContextThresholdCondition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2318:1: ( ( ( rule__ContextThresholdCondition__LogicalOpAssignment_3_0 ) ) )
            // InternalTactics.g:2319:1: ( ( rule__ContextThresholdCondition__LogicalOpAssignment_3_0 ) )
            {
            // InternalTactics.g:2319:1: ( ( rule__ContextThresholdCondition__LogicalOpAssignment_3_0 ) )
            // InternalTactics.g:2320:2: ( rule__ContextThresholdCondition__LogicalOpAssignment_3_0 )
            {
             before(grammarAccess.getContextThresholdConditionAccess().getLogicalOpAssignment_3_0()); 
            // InternalTactics.g:2321:2: ( rule__ContextThresholdCondition__LogicalOpAssignment_3_0 )
            // InternalTactics.g:2321:3: rule__ContextThresholdCondition__LogicalOpAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ContextThresholdCondition__LogicalOpAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getContextThresholdConditionAccess().getLogicalOpAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__Group_3__0__Impl"


    // $ANTLR start "rule__ContextThresholdCondition__Group_3__1"
    // InternalTactics.g:2329:1: rule__ContextThresholdCondition__Group_3__1 : rule__ContextThresholdCondition__Group_3__1__Impl ;
    public final void rule__ContextThresholdCondition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2333:1: ( rule__ContextThresholdCondition__Group_3__1__Impl )
            // InternalTactics.g:2334:2: rule__ContextThresholdCondition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextThresholdCondition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__Group_3__1"


    // $ANTLR start "rule__ContextThresholdCondition__Group_3__1__Impl"
    // InternalTactics.g:2340:1: rule__ContextThresholdCondition__Group_3__1__Impl : ( ( rule__ContextThresholdCondition__SecondTermAssignment_3_1 ) ) ;
    public final void rule__ContextThresholdCondition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2344:1: ( ( ( rule__ContextThresholdCondition__SecondTermAssignment_3_1 ) ) )
            // InternalTactics.g:2345:1: ( ( rule__ContextThresholdCondition__SecondTermAssignment_3_1 ) )
            {
            // InternalTactics.g:2345:1: ( ( rule__ContextThresholdCondition__SecondTermAssignment_3_1 ) )
            // InternalTactics.g:2346:2: ( rule__ContextThresholdCondition__SecondTermAssignment_3_1 )
            {
             before(grammarAccess.getContextThresholdConditionAccess().getSecondTermAssignment_3_1()); 
            // InternalTactics.g:2347:2: ( rule__ContextThresholdCondition__SecondTermAssignment_3_1 )
            // InternalTactics.g:2347:3: rule__ContextThresholdCondition__SecondTermAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ContextThresholdCondition__SecondTermAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContextThresholdConditionAccess().getSecondTermAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__Group_3__1__Impl"


    // $ANTLR start "rule__ContextContextCondition__Group__0"
    // InternalTactics.g:2356:1: rule__ContextContextCondition__Group__0 : rule__ContextContextCondition__Group__0__Impl rule__ContextContextCondition__Group__1 ;
    public final void rule__ContextContextCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2360:1: ( rule__ContextContextCondition__Group__0__Impl rule__ContextContextCondition__Group__1 )
            // InternalTactics.g:2361:2: rule__ContextContextCondition__Group__0__Impl rule__ContextContextCondition__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__ContextContextCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextContextCondition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__Group__0"


    // $ANTLR start "rule__ContextContextCondition__Group__0__Impl"
    // InternalTactics.g:2368:1: rule__ContextContextCondition__Group__0__Impl : ( ( rule__ContextContextCondition__ContextVarAssignment_0 ) ) ;
    public final void rule__ContextContextCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2372:1: ( ( ( rule__ContextContextCondition__ContextVarAssignment_0 ) ) )
            // InternalTactics.g:2373:1: ( ( rule__ContextContextCondition__ContextVarAssignment_0 ) )
            {
            // InternalTactics.g:2373:1: ( ( rule__ContextContextCondition__ContextVarAssignment_0 ) )
            // InternalTactics.g:2374:2: ( rule__ContextContextCondition__ContextVarAssignment_0 )
            {
             before(grammarAccess.getContextContextConditionAccess().getContextVarAssignment_0()); 
            // InternalTactics.g:2375:2: ( rule__ContextContextCondition__ContextVarAssignment_0 )
            // InternalTactics.g:2375:3: rule__ContextContextCondition__ContextVarAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ContextContextCondition__ContextVarAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getContextContextConditionAccess().getContextVarAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__Group__0__Impl"


    // $ANTLR start "rule__ContextContextCondition__Group__1"
    // InternalTactics.g:2383:1: rule__ContextContextCondition__Group__1 : rule__ContextContextCondition__Group__1__Impl rule__ContextContextCondition__Group__2 ;
    public final void rule__ContextContextCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2387:1: ( rule__ContextContextCondition__Group__1__Impl rule__ContextContextCondition__Group__2 )
            // InternalTactics.g:2388:2: rule__ContextContextCondition__Group__1__Impl rule__ContextContextCondition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ContextContextCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextContextCondition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__Group__1"


    // $ANTLR start "rule__ContextContextCondition__Group__1__Impl"
    // InternalTactics.g:2395:1: rule__ContextContextCondition__Group__1__Impl : ( ( rule__ContextContextCondition__OperatorAssignment_1 ) ) ;
    public final void rule__ContextContextCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2399:1: ( ( ( rule__ContextContextCondition__OperatorAssignment_1 ) ) )
            // InternalTactics.g:2400:1: ( ( rule__ContextContextCondition__OperatorAssignment_1 ) )
            {
            // InternalTactics.g:2400:1: ( ( rule__ContextContextCondition__OperatorAssignment_1 ) )
            // InternalTactics.g:2401:2: ( rule__ContextContextCondition__OperatorAssignment_1 )
            {
             before(grammarAccess.getContextContextConditionAccess().getOperatorAssignment_1()); 
            // InternalTactics.g:2402:2: ( rule__ContextContextCondition__OperatorAssignment_1 )
            // InternalTactics.g:2402:3: rule__ContextContextCondition__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ContextContextCondition__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getContextContextConditionAccess().getOperatorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__Group__1__Impl"


    // $ANTLR start "rule__ContextContextCondition__Group__2"
    // InternalTactics.g:2410:1: rule__ContextContextCondition__Group__2 : rule__ContextContextCondition__Group__2__Impl rule__ContextContextCondition__Group__3 ;
    public final void rule__ContextContextCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2414:1: ( rule__ContextContextCondition__Group__2__Impl rule__ContextContextCondition__Group__3 )
            // InternalTactics.g:2415:2: rule__ContextContextCondition__Group__2__Impl rule__ContextContextCondition__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ContextContextCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextContextCondition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__Group__2"


    // $ANTLR start "rule__ContextContextCondition__Group__2__Impl"
    // InternalTactics.g:2422:1: rule__ContextContextCondition__Group__2__Impl : ( ( rule__ContextContextCondition__OtherContextVarAssignment_2 ) ) ;
    public final void rule__ContextContextCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2426:1: ( ( ( rule__ContextContextCondition__OtherContextVarAssignment_2 ) ) )
            // InternalTactics.g:2427:1: ( ( rule__ContextContextCondition__OtherContextVarAssignment_2 ) )
            {
            // InternalTactics.g:2427:1: ( ( rule__ContextContextCondition__OtherContextVarAssignment_2 ) )
            // InternalTactics.g:2428:2: ( rule__ContextContextCondition__OtherContextVarAssignment_2 )
            {
             before(grammarAccess.getContextContextConditionAccess().getOtherContextVarAssignment_2()); 
            // InternalTactics.g:2429:2: ( rule__ContextContextCondition__OtherContextVarAssignment_2 )
            // InternalTactics.g:2429:3: rule__ContextContextCondition__OtherContextVarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ContextContextCondition__OtherContextVarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getContextContextConditionAccess().getOtherContextVarAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__Group__2__Impl"


    // $ANTLR start "rule__ContextContextCondition__Group__3"
    // InternalTactics.g:2437:1: rule__ContextContextCondition__Group__3 : rule__ContextContextCondition__Group__3__Impl ;
    public final void rule__ContextContextCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2441:1: ( rule__ContextContextCondition__Group__3__Impl )
            // InternalTactics.g:2442:2: rule__ContextContextCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextContextCondition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__Group__3"


    // $ANTLR start "rule__ContextContextCondition__Group__3__Impl"
    // InternalTactics.g:2448:1: rule__ContextContextCondition__Group__3__Impl : ( ( rule__ContextContextCondition__Group_3__0 )? ) ;
    public final void rule__ContextContextCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2452:1: ( ( ( rule__ContextContextCondition__Group_3__0 )? ) )
            // InternalTactics.g:2453:1: ( ( rule__ContextContextCondition__Group_3__0 )? )
            {
            // InternalTactics.g:2453:1: ( ( rule__ContextContextCondition__Group_3__0 )? )
            // InternalTactics.g:2454:2: ( rule__ContextContextCondition__Group_3__0 )?
            {
             before(grammarAccess.getContextContextConditionAccess().getGroup_3()); 
            // InternalTactics.g:2455:2: ( rule__ContextContextCondition__Group_3__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=19 && LA20_0<=20)) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTactics.g:2455:3: rule__ContextContextCondition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ContextContextCondition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getContextContextConditionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__Group__3__Impl"


    // $ANTLR start "rule__ContextContextCondition__Group_3__0"
    // InternalTactics.g:2464:1: rule__ContextContextCondition__Group_3__0 : rule__ContextContextCondition__Group_3__0__Impl rule__ContextContextCondition__Group_3__1 ;
    public final void rule__ContextContextCondition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2468:1: ( rule__ContextContextCondition__Group_3__0__Impl rule__ContextContextCondition__Group_3__1 )
            // InternalTactics.g:2469:2: rule__ContextContextCondition__Group_3__0__Impl rule__ContextContextCondition__Group_3__1
            {
            pushFollow(FOLLOW_3);
            rule__ContextContextCondition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ContextContextCondition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__Group_3__0"


    // $ANTLR start "rule__ContextContextCondition__Group_3__0__Impl"
    // InternalTactics.g:2476:1: rule__ContextContextCondition__Group_3__0__Impl : ( ( rule__ContextContextCondition__LogicalOpAssignment_3_0 ) ) ;
    public final void rule__ContextContextCondition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2480:1: ( ( ( rule__ContextContextCondition__LogicalOpAssignment_3_0 ) ) )
            // InternalTactics.g:2481:1: ( ( rule__ContextContextCondition__LogicalOpAssignment_3_0 ) )
            {
            // InternalTactics.g:2481:1: ( ( rule__ContextContextCondition__LogicalOpAssignment_3_0 ) )
            // InternalTactics.g:2482:2: ( rule__ContextContextCondition__LogicalOpAssignment_3_0 )
            {
             before(grammarAccess.getContextContextConditionAccess().getLogicalOpAssignment_3_0()); 
            // InternalTactics.g:2483:2: ( rule__ContextContextCondition__LogicalOpAssignment_3_0 )
            // InternalTactics.g:2483:3: rule__ContextContextCondition__LogicalOpAssignment_3_0
            {
            pushFollow(FOLLOW_2);
            rule__ContextContextCondition__LogicalOpAssignment_3_0();

            state._fsp--;


            }

             after(grammarAccess.getContextContextConditionAccess().getLogicalOpAssignment_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__Group_3__0__Impl"


    // $ANTLR start "rule__ContextContextCondition__Group_3__1"
    // InternalTactics.g:2491:1: rule__ContextContextCondition__Group_3__1 : rule__ContextContextCondition__Group_3__1__Impl ;
    public final void rule__ContextContextCondition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2495:1: ( rule__ContextContextCondition__Group_3__1__Impl )
            // InternalTactics.g:2496:2: rule__ContextContextCondition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ContextContextCondition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__Group_3__1"


    // $ANTLR start "rule__ContextContextCondition__Group_3__1__Impl"
    // InternalTactics.g:2502:1: rule__ContextContextCondition__Group_3__1__Impl : ( ( rule__ContextContextCondition__SecondTermAssignment_3_1 ) ) ;
    public final void rule__ContextContextCondition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2506:1: ( ( ( rule__ContextContextCondition__SecondTermAssignment_3_1 ) ) )
            // InternalTactics.g:2507:1: ( ( rule__ContextContextCondition__SecondTermAssignment_3_1 ) )
            {
            // InternalTactics.g:2507:1: ( ( rule__ContextContextCondition__SecondTermAssignment_3_1 ) )
            // InternalTactics.g:2508:2: ( rule__ContextContextCondition__SecondTermAssignment_3_1 )
            {
             before(grammarAccess.getContextContextConditionAccess().getSecondTermAssignment_3_1()); 
            // InternalTactics.g:2509:2: ( rule__ContextContextCondition__SecondTermAssignment_3_1 )
            // InternalTactics.g:2509:3: rule__ContextContextCondition__SecondTermAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ContextContextCondition__SecondTermAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getContextContextConditionAccess().getSecondTermAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__Group_3__1__Impl"


    // $ANTLR start "rule__SelectVariant__Group__0"
    // InternalTactics.g:2518:1: rule__SelectVariant__Group__0 : rule__SelectVariant__Group__0__Impl rule__SelectVariant__Group__1 ;
    public final void rule__SelectVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2522:1: ( rule__SelectVariant__Group__0__Impl rule__SelectVariant__Group__1 )
            // InternalTactics.g:2523:2: rule__SelectVariant__Group__0__Impl rule__SelectVariant__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__SelectVariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectVariant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectVariant__Group__0"


    // $ANTLR start "rule__SelectVariant__Group__0__Impl"
    // InternalTactics.g:2530:1: rule__SelectVariant__Group__0__Impl : ( 'select_variant' ) ;
    public final void rule__SelectVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2534:1: ( ( 'select_variant' ) )
            // InternalTactics.g:2535:1: ( 'select_variant' )
            {
            // InternalTactics.g:2535:1: ( 'select_variant' )
            // InternalTactics.g:2536:2: 'select_variant'
            {
             before(grammarAccess.getSelectVariantAccess().getSelect_variantKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSelectVariantAccess().getSelect_variantKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectVariant__Group__0__Impl"


    // $ANTLR start "rule__SelectVariant__Group__1"
    // InternalTactics.g:2545:1: rule__SelectVariant__Group__1 : rule__SelectVariant__Group__1__Impl rule__SelectVariant__Group__2 ;
    public final void rule__SelectVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2549:1: ( rule__SelectVariant__Group__1__Impl rule__SelectVariant__Group__2 )
            // InternalTactics.g:2550:2: rule__SelectVariant__Group__1__Impl rule__SelectVariant__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__SelectVariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectVariant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectVariant__Group__1"


    // $ANTLR start "rule__SelectVariant__Group__1__Impl"
    // InternalTactics.g:2557:1: rule__SelectVariant__Group__1__Impl : ( '(' ) ;
    public final void rule__SelectVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2561:1: ( ( '(' ) )
            // InternalTactics.g:2562:1: ( '(' )
            {
            // InternalTactics.g:2562:1: ( '(' )
            // InternalTactics.g:2563:2: '('
            {
             before(grammarAccess.getSelectVariantAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSelectVariantAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectVariant__Group__1__Impl"


    // $ANTLR start "rule__SelectVariant__Group__2"
    // InternalTactics.g:2572:1: rule__SelectVariant__Group__2 : rule__SelectVariant__Group__2__Impl rule__SelectVariant__Group__3 ;
    public final void rule__SelectVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2576:1: ( rule__SelectVariant__Group__2__Impl rule__SelectVariant__Group__3 )
            // InternalTactics.g:2577:2: rule__SelectVariant__Group__2__Impl rule__SelectVariant__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__SelectVariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectVariant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectVariant__Group__2"


    // $ANTLR start "rule__SelectVariant__Group__2__Impl"
    // InternalTactics.g:2584:1: rule__SelectVariant__Group__2__Impl : ( ( rule__SelectVariant__VariantAssignment_2 ) ) ;
    public final void rule__SelectVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2588:1: ( ( ( rule__SelectVariant__VariantAssignment_2 ) ) )
            // InternalTactics.g:2589:1: ( ( rule__SelectVariant__VariantAssignment_2 ) )
            {
            // InternalTactics.g:2589:1: ( ( rule__SelectVariant__VariantAssignment_2 ) )
            // InternalTactics.g:2590:2: ( rule__SelectVariant__VariantAssignment_2 )
            {
             before(grammarAccess.getSelectVariantAccess().getVariantAssignment_2()); 
            // InternalTactics.g:2591:2: ( rule__SelectVariant__VariantAssignment_2 )
            // InternalTactics.g:2591:3: rule__SelectVariant__VariantAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectVariant__VariantAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectVariantAccess().getVariantAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectVariant__Group__2__Impl"


    // $ANTLR start "rule__SelectVariant__Group__3"
    // InternalTactics.g:2599:1: rule__SelectVariant__Group__3 : rule__SelectVariant__Group__3__Impl ;
    public final void rule__SelectVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2603:1: ( rule__SelectVariant__Group__3__Impl )
            // InternalTactics.g:2604:2: rule__SelectVariant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectVariant__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectVariant__Group__3"


    // $ANTLR start "rule__SelectVariant__Group__3__Impl"
    // InternalTactics.g:2610:1: rule__SelectVariant__Group__3__Impl : ( ')' ) ;
    public final void rule__SelectVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2614:1: ( ( ')' ) )
            // InternalTactics.g:2615:1: ( ')' )
            {
            // InternalTactics.g:2615:1: ( ')' )
            // InternalTactics.g:2616:2: ')'
            {
             before(grammarAccess.getSelectVariantAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSelectVariantAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectVariant__Group__3__Impl"


    // $ANTLR start "rule__DeselectVariant__Group__0"
    // InternalTactics.g:2626:1: rule__DeselectVariant__Group__0 : rule__DeselectVariant__Group__0__Impl rule__DeselectVariant__Group__1 ;
    public final void rule__DeselectVariant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2630:1: ( rule__DeselectVariant__Group__0__Impl rule__DeselectVariant__Group__1 )
            // InternalTactics.g:2631:2: rule__DeselectVariant__Group__0__Impl rule__DeselectVariant__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__DeselectVariant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeselectVariant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectVariant__Group__0"


    // $ANTLR start "rule__DeselectVariant__Group__0__Impl"
    // InternalTactics.g:2638:1: rule__DeselectVariant__Group__0__Impl : ( 'unselect_variant' ) ;
    public final void rule__DeselectVariant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2642:1: ( ( 'unselect_variant' ) )
            // InternalTactics.g:2643:1: ( 'unselect_variant' )
            {
            // InternalTactics.g:2643:1: ( 'unselect_variant' )
            // InternalTactics.g:2644:2: 'unselect_variant'
            {
             before(grammarAccess.getDeselectVariantAccess().getUnselect_variantKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDeselectVariantAccess().getUnselect_variantKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectVariant__Group__0__Impl"


    // $ANTLR start "rule__DeselectVariant__Group__1"
    // InternalTactics.g:2653:1: rule__DeselectVariant__Group__1 : rule__DeselectVariant__Group__1__Impl rule__DeselectVariant__Group__2 ;
    public final void rule__DeselectVariant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2657:1: ( rule__DeselectVariant__Group__1__Impl rule__DeselectVariant__Group__2 )
            // InternalTactics.g:2658:2: rule__DeselectVariant__Group__1__Impl rule__DeselectVariant__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__DeselectVariant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeselectVariant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectVariant__Group__1"


    // $ANTLR start "rule__DeselectVariant__Group__1__Impl"
    // InternalTactics.g:2665:1: rule__DeselectVariant__Group__1__Impl : ( '(' ) ;
    public final void rule__DeselectVariant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2669:1: ( ( '(' ) )
            // InternalTactics.g:2670:1: ( '(' )
            {
            // InternalTactics.g:2670:1: ( '(' )
            // InternalTactics.g:2671:2: '('
            {
             before(grammarAccess.getDeselectVariantAccess().getLeftParenthesisKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getDeselectVariantAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectVariant__Group__1__Impl"


    // $ANTLR start "rule__DeselectVariant__Group__2"
    // InternalTactics.g:2680:1: rule__DeselectVariant__Group__2 : rule__DeselectVariant__Group__2__Impl rule__DeselectVariant__Group__3 ;
    public final void rule__DeselectVariant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2684:1: ( rule__DeselectVariant__Group__2__Impl rule__DeselectVariant__Group__3 )
            // InternalTactics.g:2685:2: rule__DeselectVariant__Group__2__Impl rule__DeselectVariant__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__DeselectVariant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DeselectVariant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectVariant__Group__2"


    // $ANTLR start "rule__DeselectVariant__Group__2__Impl"
    // InternalTactics.g:2692:1: rule__DeselectVariant__Group__2__Impl : ( ( rule__DeselectVariant__VariantAssignment_2 ) ) ;
    public final void rule__DeselectVariant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2696:1: ( ( ( rule__DeselectVariant__VariantAssignment_2 ) ) )
            // InternalTactics.g:2697:1: ( ( rule__DeselectVariant__VariantAssignment_2 ) )
            {
            // InternalTactics.g:2697:1: ( ( rule__DeselectVariant__VariantAssignment_2 ) )
            // InternalTactics.g:2698:2: ( rule__DeselectVariant__VariantAssignment_2 )
            {
             before(grammarAccess.getDeselectVariantAccess().getVariantAssignment_2()); 
            // InternalTactics.g:2699:2: ( rule__DeselectVariant__VariantAssignment_2 )
            // InternalTactics.g:2699:3: rule__DeselectVariant__VariantAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DeselectVariant__VariantAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDeselectVariantAccess().getVariantAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectVariant__Group__2__Impl"


    // $ANTLR start "rule__DeselectVariant__Group__3"
    // InternalTactics.g:2707:1: rule__DeselectVariant__Group__3 : rule__DeselectVariant__Group__3__Impl ;
    public final void rule__DeselectVariant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2711:1: ( rule__DeselectVariant__Group__3__Impl )
            // InternalTactics.g:2712:2: rule__DeselectVariant__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DeselectVariant__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectVariant__Group__3"


    // $ANTLR start "rule__DeselectVariant__Group__3__Impl"
    // InternalTactics.g:2718:1: rule__DeselectVariant__Group__3__Impl : ( ')' ) ;
    public final void rule__DeselectVariant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2722:1: ( ( ')' ) )
            // InternalTactics.g:2723:1: ( ')' )
            {
            // InternalTactics.g:2723:1: ( ')' )
            // InternalTactics.g:2724:2: ')'
            {
             before(grammarAccess.getDeselectVariantAccess().getRightParenthesisKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDeselectVariantAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectVariant__Group__3__Impl"


    // $ANTLR start "rule__QualifiedFeatureRef__Group__0"
    // InternalTactics.g:2734:1: rule__QualifiedFeatureRef__Group__0 : rule__QualifiedFeatureRef__Group__0__Impl rule__QualifiedFeatureRef__Group__1 ;
    public final void rule__QualifiedFeatureRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2738:1: ( rule__QualifiedFeatureRef__Group__0__Impl rule__QualifiedFeatureRef__Group__1 )
            // InternalTactics.g:2739:2: rule__QualifiedFeatureRef__Group__0__Impl rule__QualifiedFeatureRef__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__QualifiedFeatureRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedFeatureRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedFeatureRef__Group__0"


    // $ANTLR start "rule__QualifiedFeatureRef__Group__0__Impl"
    // InternalTactics.g:2746:1: rule__QualifiedFeatureRef__Group__0__Impl : ( ( rule__QualifiedFeatureRef__ModelAssignment_0 ) ) ;
    public final void rule__QualifiedFeatureRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2750:1: ( ( ( rule__QualifiedFeatureRef__ModelAssignment_0 ) ) )
            // InternalTactics.g:2751:1: ( ( rule__QualifiedFeatureRef__ModelAssignment_0 ) )
            {
            // InternalTactics.g:2751:1: ( ( rule__QualifiedFeatureRef__ModelAssignment_0 ) )
            // InternalTactics.g:2752:2: ( rule__QualifiedFeatureRef__ModelAssignment_0 )
            {
             before(grammarAccess.getQualifiedFeatureRefAccess().getModelAssignment_0()); 
            // InternalTactics.g:2753:2: ( rule__QualifiedFeatureRef__ModelAssignment_0 )
            // InternalTactics.g:2753:3: rule__QualifiedFeatureRef__ModelAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedFeatureRef__ModelAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedFeatureRefAccess().getModelAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedFeatureRef__Group__0__Impl"


    // $ANTLR start "rule__QualifiedFeatureRef__Group__1"
    // InternalTactics.g:2761:1: rule__QualifiedFeatureRef__Group__1 : rule__QualifiedFeatureRef__Group__1__Impl rule__QualifiedFeatureRef__Group__2 ;
    public final void rule__QualifiedFeatureRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2765:1: ( rule__QualifiedFeatureRef__Group__1__Impl rule__QualifiedFeatureRef__Group__2 )
            // InternalTactics.g:2766:2: rule__QualifiedFeatureRef__Group__1__Impl rule__QualifiedFeatureRef__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedFeatureRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedFeatureRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedFeatureRef__Group__1"


    // $ANTLR start "rule__QualifiedFeatureRef__Group__1__Impl"
    // InternalTactics.g:2773:1: rule__QualifiedFeatureRef__Group__1__Impl : ( '.' ) ;
    public final void rule__QualifiedFeatureRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2777:1: ( ( '.' ) )
            // InternalTactics.g:2778:1: ( '.' )
            {
            // InternalTactics.g:2778:1: ( '.' )
            // InternalTactics.g:2779:2: '.'
            {
             before(grammarAccess.getQualifiedFeatureRefAccess().getFullStopKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getQualifiedFeatureRefAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedFeatureRef__Group__1__Impl"


    // $ANTLR start "rule__QualifiedFeatureRef__Group__2"
    // InternalTactics.g:2788:1: rule__QualifiedFeatureRef__Group__2 : rule__QualifiedFeatureRef__Group__2__Impl ;
    public final void rule__QualifiedFeatureRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2792:1: ( rule__QualifiedFeatureRef__Group__2__Impl )
            // InternalTactics.g:2793:2: rule__QualifiedFeatureRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedFeatureRef__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedFeatureRef__Group__2"


    // $ANTLR start "rule__QualifiedFeatureRef__Group__2__Impl"
    // InternalTactics.g:2799:1: rule__QualifiedFeatureRef__Group__2__Impl : ( ( rule__QualifiedFeatureRef__FeatureAssignment_2 ) ) ;
    public final void rule__QualifiedFeatureRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2803:1: ( ( ( rule__QualifiedFeatureRef__FeatureAssignment_2 ) ) )
            // InternalTactics.g:2804:1: ( ( rule__QualifiedFeatureRef__FeatureAssignment_2 ) )
            {
            // InternalTactics.g:2804:1: ( ( rule__QualifiedFeatureRef__FeatureAssignment_2 ) )
            // InternalTactics.g:2805:2: ( rule__QualifiedFeatureRef__FeatureAssignment_2 )
            {
             before(grammarAccess.getQualifiedFeatureRefAccess().getFeatureAssignment_2()); 
            // InternalTactics.g:2806:2: ( rule__QualifiedFeatureRef__FeatureAssignment_2 )
            // InternalTactics.g:2806:3: rule__QualifiedFeatureRef__FeatureAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedFeatureRef__FeatureAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedFeatureRefAccess().getFeatureAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedFeatureRef__Group__2__Impl"


    // $ANTLR start "rule__TacticsModel__NameAssignment_1"
    // InternalTactics.g:2815:1: rule__TacticsModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TacticsModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2819:1: ( ( RULE_ID ) )
            // InternalTactics.g:2820:2: ( RULE_ID )
            {
            // InternalTactics.g:2820:2: ( RULE_ID )
            // InternalTactics.g:2821:3: RULE_ID
            {
             before(grammarAccess.getTacticsModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTacticsModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticsModel__NameAssignment_1"


    // $ANTLR start "rule__TacticsModel__ImportsAssignment_3"
    // InternalTactics.g:2830:1: rule__TacticsModel__ImportsAssignment_3 : ( ruleImport ) ;
    public final void rule__TacticsModel__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2834:1: ( ( ruleImport ) )
            // InternalTactics.g:2835:2: ( ruleImport )
            {
            // InternalTactics.g:2835:2: ( ruleImport )
            // InternalTactics.g:2836:3: ruleImport
            {
             before(grammarAccess.getTacticsModelAccess().getImportsImportParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;

             after(grammarAccess.getTacticsModelAccess().getImportsImportParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticsModel__ImportsAssignment_3"


    // $ANTLR start "rule__TacticsModel__TacticsAssignment_4"
    // InternalTactics.g:2845:1: rule__TacticsModel__TacticsAssignment_4 : ( ruleTactic ) ;
    public final void rule__TacticsModel__TacticsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2849:1: ( ( ruleTactic ) )
            // InternalTactics.g:2850:2: ( ruleTactic )
            {
            // InternalTactics.g:2850:2: ( ruleTactic )
            // InternalTactics.g:2851:3: ruleTactic
            {
             before(grammarAccess.getTacticsModelAccess().getTacticsTacticParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTactic();

            state._fsp--;

             after(grammarAccess.getTacticsModelAccess().getTacticsTacticParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticsModel__TacticsAssignment_4"


    // $ANTLR start "rule__ActionTactics__RequirementAssignment_0"
    // InternalTactics.g:2860:1: rule__ActionTactics__RequirementAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ActionTactics__RequirementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2864:1: ( ( ( RULE_ID ) ) )
            // InternalTactics.g:2865:2: ( ( RULE_ID ) )
            {
            // InternalTactics.g:2865:2: ( ( RULE_ID ) )
            // InternalTactics.g:2866:3: ( RULE_ID )
            {
             before(grammarAccess.getActionTacticsAccess().getRequirementRequirementCrossReference_0_0()); 
            // InternalTactics.g:2867:3: ( RULE_ID )
            // InternalTactics.g:2868:4: RULE_ID
            {
             before(grammarAccess.getActionTacticsAccess().getRequirementRequirementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionTacticsAccess().getRequirementRequirementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getActionTacticsAccess().getRequirementRequirementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTactics__RequirementAssignment_0"


    // $ANTLR start "rule__ActionTactics__ActionAssignment_1"
    // InternalTactics.g:2879:1: rule__ActionTactics__ActionAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ActionTactics__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2883:1: ( ( ( RULE_ID ) ) )
            // InternalTactics.g:2884:2: ( ( RULE_ID ) )
            {
            // InternalTactics.g:2884:2: ( ( RULE_ID ) )
            // InternalTactics.g:2885:3: ( RULE_ID )
            {
             before(grammarAccess.getActionTacticsAccess().getActionActionSpecCrossReference_1_0()); 
            // InternalTactics.g:2886:3: ( RULE_ID )
            // InternalTactics.g:2887:4: RULE_ID
            {
             before(grammarAccess.getActionTacticsAccess().getActionActionSpecIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActionTacticsAccess().getActionActionSpecIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActionTacticsAccess().getActionActionSpecCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTactics__ActionAssignment_1"


    // $ANTLR start "rule__ActionTactics__TacticsAssignment_3"
    // InternalTactics.g:2898:1: rule__ActionTactics__TacticsAssignment_3 : ( rulePureTactic ) ;
    public final void rule__ActionTactics__TacticsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2902:1: ( ( rulePureTactic ) )
            // InternalTactics.g:2903:2: ( rulePureTactic )
            {
            // InternalTactics.g:2903:2: ( rulePureTactic )
            // InternalTactics.g:2904:3: rulePureTactic
            {
             before(grammarAccess.getActionTacticsAccess().getTacticsPureTacticParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePureTactic();

            state._fsp--;

             after(grammarAccess.getActionTacticsAccess().getTacticsPureTacticParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActionTactics__TacticsAssignment_3"


    // $ANTLR start "rule__Import__ImportURIAssignment_1"
    // InternalTactics.g:2913:1: rule__Import__ImportURIAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Import__ImportURIAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2917:1: ( ( RULE_STRING ) )
            // InternalTactics.g:2918:2: ( RULE_STRING )
            {
            // InternalTactics.g:2918:2: ( RULE_STRING )
            // InternalTactics.g:2919:3: RULE_STRING
            {
             before(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportURIAssignment_1"


    // $ANTLR start "rule__PureTactic__RequirementAssignment_0"
    // InternalTactics.g:2928:1: rule__PureTactic__RequirementAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__PureTactic__RequirementAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2932:1: ( ( ( RULE_ID ) ) )
            // InternalTactics.g:2933:2: ( ( RULE_ID ) )
            {
            // InternalTactics.g:2933:2: ( ( RULE_ID ) )
            // InternalTactics.g:2934:3: ( RULE_ID )
            {
             before(grammarAccess.getPureTacticAccess().getRequirementRequirementCrossReference_0_0()); 
            // InternalTactics.g:2935:3: ( RULE_ID )
            // InternalTactics.g:2936:4: RULE_ID
            {
             before(grammarAccess.getPureTacticAccess().getRequirementRequirementIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPureTacticAccess().getRequirementRequirementIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getPureTacticAccess().getRequirementRequirementCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__RequirementAssignment_0"


    // $ANTLR start "rule__PureTactic__NameAssignment_2"
    // InternalTactics.g:2947:1: rule__PureTactic__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__PureTactic__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2951:1: ( ( RULE_ID ) )
            // InternalTactics.g:2952:2: ( RULE_ID )
            {
            // InternalTactics.g:2952:2: ( RULE_ID )
            // InternalTactics.g:2953:3: RULE_ID
            {
             before(grammarAccess.getPureTacticAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPureTacticAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__NameAssignment_2"


    // $ANTLR start "rule__PureTactic__GuardAssignment_4"
    // InternalTactics.g:2962:1: rule__PureTactic__GuardAssignment_4 : ( ruleGuard ) ;
    public final void rule__PureTactic__GuardAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2966:1: ( ( ruleGuard ) )
            // InternalTactics.g:2967:2: ( ruleGuard )
            {
            // InternalTactics.g:2967:2: ( ruleGuard )
            // InternalTactics.g:2968:3: ruleGuard
            {
             before(grammarAccess.getPureTacticAccess().getGuardGuardParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleGuard();

            state._fsp--;

             after(grammarAccess.getPureTacticAccess().getGuardGuardParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__GuardAssignment_4"


    // $ANTLR start "rule__PureTactic__ActionAssignment_5"
    // InternalTactics.g:2977:1: rule__PureTactic__ActionAssignment_5 : ( ruleTacticAction ) ;
    public final void rule__PureTactic__ActionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2981:1: ( ( ruleTacticAction ) )
            // InternalTactics.g:2982:2: ( ruleTacticAction )
            {
            // InternalTactics.g:2982:2: ( ruleTacticAction )
            // InternalTactics.g:2983:3: ruleTacticAction
            {
             before(grammarAccess.getPureTacticAccess().getActionTacticActionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTacticAction();

            state._fsp--;

             after(grammarAccess.getPureTacticAccess().getActionTacticActionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PureTactic__ActionAssignment_5"


    // $ANTLR start "rule__TacticAction__ActionsAssignment_2"
    // InternalTactics.g:2992:1: rule__TacticAction__ActionsAssignment_2 : ( ruleSelection ) ;
    public final void rule__TacticAction__ActionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:2996:1: ( ( ruleSelection ) )
            // InternalTactics.g:2997:2: ( ruleSelection )
            {
            // InternalTactics.g:2997:2: ( ruleSelection )
            // InternalTactics.g:2998:3: ruleSelection
            {
             before(grammarAccess.getTacticActionAccess().getActionsSelectionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getTacticActionAccess().getActionsSelectionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__ActionsAssignment_2"


    // $ANTLR start "rule__TacticAction__ActionsAssignment_3_1"
    // InternalTactics.g:3007:1: rule__TacticAction__ActionsAssignment_3_1 : ( ruleSelection ) ;
    public final void rule__TacticAction__ActionsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3011:1: ( ( ruleSelection ) )
            // InternalTactics.g:3012:2: ( ruleSelection )
            {
            // InternalTactics.g:3012:2: ( ruleSelection )
            // InternalTactics.g:3013:3: ruleSelection
            {
             before(grammarAccess.getTacticActionAccess().getActionsSelectionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelection();

            state._fsp--;

             after(grammarAccess.getTacticActionAccess().getActionsSelectionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TacticAction__ActionsAssignment_3_1"


    // $ANTLR start "rule__Guard__ContextGuardAssignment_2_0_0"
    // InternalTactics.g:3022:1: rule__Guard__ContextGuardAssignment_2_0_0 : ( ruleContextGuard ) ;
    public final void rule__Guard__ContextGuardAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3026:1: ( ( ruleContextGuard ) )
            // InternalTactics.g:3027:2: ( ruleContextGuard )
            {
            // InternalTactics.g:3027:2: ( ruleContextGuard )
            // InternalTactics.g:3028:3: ruleContextGuard
            {
             before(grammarAccess.getGuardAccess().getContextGuardContextGuardParserRuleCall_2_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleContextGuard();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getContextGuardContextGuardParserRuleCall_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__ContextGuardAssignment_2_0_0"


    // $ANTLR start "rule__Guard__FeatureGuardAssignment_2_0_1"
    // InternalTactics.g:3037:1: rule__Guard__FeatureGuardAssignment_2_0_1 : ( ruleFeatureGuard ) ;
    public final void rule__Guard__FeatureGuardAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3041:1: ( ( ruleFeatureGuard ) )
            // InternalTactics.g:3042:2: ( ruleFeatureGuard )
            {
            // InternalTactics.g:3042:2: ( ruleFeatureGuard )
            // InternalTactics.g:3043:3: ruleFeatureGuard
            {
             before(grammarAccess.getGuardAccess().getFeatureGuardFeatureGuardParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureGuard();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getFeatureGuardFeatureGuardParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__FeatureGuardAssignment_2_0_1"


    // $ANTLR start "rule__Guard__FeatureGuardAssignment_2_1_0"
    // InternalTactics.g:3052:1: rule__Guard__FeatureGuardAssignment_2_1_0 : ( ruleFeatureGuard ) ;
    public final void rule__Guard__FeatureGuardAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3056:1: ( ( ruleFeatureGuard ) )
            // InternalTactics.g:3057:2: ( ruleFeatureGuard )
            {
            // InternalTactics.g:3057:2: ( ruleFeatureGuard )
            // InternalTactics.g:3058:3: ruleFeatureGuard
            {
             before(grammarAccess.getGuardAccess().getFeatureGuardFeatureGuardParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureGuard();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getFeatureGuardFeatureGuardParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__FeatureGuardAssignment_2_1_0"


    // $ANTLR start "rule__Guard__ContextGuardAssignment_2_1_1"
    // InternalTactics.g:3067:1: rule__Guard__ContextGuardAssignment_2_1_1 : ( ruleContextGuard ) ;
    public final void rule__Guard__ContextGuardAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3071:1: ( ( ruleContextGuard ) )
            // InternalTactics.g:3072:2: ( ruleContextGuard )
            {
            // InternalTactics.g:3072:2: ( ruleContextGuard )
            // InternalTactics.g:3073:3: ruleContextGuard
            {
             before(grammarAccess.getGuardAccess().getContextGuardContextGuardParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContextGuard();

            state._fsp--;

             after(grammarAccess.getGuardAccess().getContextGuardContextGuardParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guard__ContextGuardAssignment_2_1_1"


    // $ANTLR start "rule__ContextGuard__ContextConditionAssignment_2"
    // InternalTactics.g:3082:1: rule__ContextGuard__ContextConditionAssignment_2 : ( ruleContextCondition ) ;
    public final void rule__ContextGuard__ContextConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3086:1: ( ( ruleContextCondition ) )
            // InternalTactics.g:3087:2: ( ruleContextCondition )
            {
            // InternalTactics.g:3087:2: ( ruleContextCondition )
            // InternalTactics.g:3088:3: ruleContextCondition
            {
             before(grammarAccess.getContextGuardAccess().getContextConditionContextConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleContextCondition();

            state._fsp--;

             after(grammarAccess.getContextGuardAccess().getContextConditionContextConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextGuard__ContextConditionAssignment_2"


    // $ANTLR start "rule__FeatureGuard__FeatureConditionAssignment_2"
    // InternalTactics.g:3097:1: rule__FeatureGuard__FeatureConditionAssignment_2 : ( ruleFeatureCondition ) ;
    public final void rule__FeatureGuard__FeatureConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3101:1: ( ( ruleFeatureCondition ) )
            // InternalTactics.g:3102:2: ( ruleFeatureCondition )
            {
            // InternalTactics.g:3102:2: ( ruleFeatureCondition )
            // InternalTactics.g:3103:3: ruleFeatureCondition
            {
             before(grammarAccess.getFeatureGuardAccess().getFeatureConditionFeatureConditionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureCondition();

            state._fsp--;

             after(grammarAccess.getFeatureGuardAccess().getFeatureConditionFeatureConditionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureGuard__FeatureConditionAssignment_2"


    // $ANTLR start "rule__FeatureCondition__NotAssignment_0"
    // InternalTactics.g:3112:1: rule__FeatureCondition__NotAssignment_0 : ( ( '!' ) ) ;
    public final void rule__FeatureCondition__NotAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3116:1: ( ( ( '!' ) ) )
            // InternalTactics.g:3117:2: ( ( '!' ) )
            {
            // InternalTactics.g:3117:2: ( ( '!' ) )
            // InternalTactics.g:3118:3: ( '!' )
            {
             before(grammarAccess.getFeatureConditionAccess().getNotExclamationMarkKeyword_0_0()); 
            // InternalTactics.g:3119:3: ( '!' )
            // InternalTactics.g:3120:4: '!'
            {
             before(grammarAccess.getFeatureConditionAccess().getNotExclamationMarkKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFeatureConditionAccess().getNotExclamationMarkKeyword_0_0()); 

            }

             after(grammarAccess.getFeatureConditionAccess().getNotExclamationMarkKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__NotAssignment_0"


    // $ANTLR start "rule__FeatureCondition__VariantAssignment_2"
    // InternalTactics.g:3131:1: rule__FeatureCondition__VariantAssignment_2 : ( ruleQualifiedFeatureRef ) ;
    public final void rule__FeatureCondition__VariantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3135:1: ( ( ruleQualifiedFeatureRef ) )
            // InternalTactics.g:3136:2: ( ruleQualifiedFeatureRef )
            {
            // InternalTactics.g:3136:2: ( ruleQualifiedFeatureRef )
            // InternalTactics.g:3137:3: ruleQualifiedFeatureRef
            {
             before(grammarAccess.getFeatureConditionAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedFeatureRef();

            state._fsp--;

             after(grammarAccess.getFeatureConditionAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__VariantAssignment_2"


    // $ANTLR start "rule__FeatureCondition__LogicalOpAssignment_4_0"
    // InternalTactics.g:3146:1: rule__FeatureCondition__LogicalOpAssignment_4_0 : ( ruleLogicalOperator ) ;
    public final void rule__FeatureCondition__LogicalOpAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3150:1: ( ( ruleLogicalOperator ) )
            // InternalTactics.g:3151:2: ( ruleLogicalOperator )
            {
            // InternalTactics.g:3151:2: ( ruleLogicalOperator )
            // InternalTactics.g:3152:3: ruleLogicalOperator
            {
             before(grammarAccess.getFeatureConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalOperator();

            state._fsp--;

             after(grammarAccess.getFeatureConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__LogicalOpAssignment_4_0"


    // $ANTLR start "rule__FeatureCondition__SecondTermAssignment_4_1"
    // InternalTactics.g:3161:1: rule__FeatureCondition__SecondTermAssignment_4_1 : ( ruleFeatureCondition ) ;
    public final void rule__FeatureCondition__SecondTermAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3165:1: ( ( ruleFeatureCondition ) )
            // InternalTactics.g:3166:2: ( ruleFeatureCondition )
            {
            // InternalTactics.g:3166:2: ( ruleFeatureCondition )
            // InternalTactics.g:3167:3: ruleFeatureCondition
            {
             before(grammarAccess.getFeatureConditionAccess().getSecondTermFeatureConditionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureCondition();

            state._fsp--;

             after(grammarAccess.getFeatureConditionAccess().getSecondTermFeatureConditionParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureCondition__SecondTermAssignment_4_1"


    // $ANTLR start "rule__ContextThresholdCondition__ContextVarAssignment_0"
    // InternalTactics.g:3176:1: rule__ContextThresholdCondition__ContextVarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ContextThresholdCondition__ContextVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3180:1: ( ( ( RULE_ID ) ) )
            // InternalTactics.g:3181:2: ( ( RULE_ID ) )
            {
            // InternalTactics.g:3181:2: ( ( RULE_ID ) )
            // InternalTactics.g:3182:3: ( RULE_ID )
            {
             before(grammarAccess.getContextThresholdConditionAccess().getContextVarContextVarCrossReference_0_0()); 
            // InternalTactics.g:3183:3: ( RULE_ID )
            // InternalTactics.g:3184:4: RULE_ID
            {
             before(grammarAccess.getContextThresholdConditionAccess().getContextVarContextVarIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextThresholdConditionAccess().getContextVarContextVarIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getContextThresholdConditionAccess().getContextVarContextVarCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__ContextVarAssignment_0"


    // $ANTLR start "rule__ContextThresholdCondition__OperatorAssignment_1"
    // InternalTactics.g:3195:1: rule__ContextThresholdCondition__OperatorAssignment_1 : ( ruleMathOperator ) ;
    public final void rule__ContextThresholdCondition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3199:1: ( ( ruleMathOperator ) )
            // InternalTactics.g:3200:2: ( ruleMathOperator )
            {
            // InternalTactics.g:3200:2: ( ruleMathOperator )
            // InternalTactics.g:3201:3: ruleMathOperator
            {
             before(grammarAccess.getContextThresholdConditionAccess().getOperatorMathOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMathOperator();

            state._fsp--;

             after(grammarAccess.getContextThresholdConditionAccess().getOperatorMathOperatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__OperatorAssignment_1"


    // $ANTLR start "rule__ContextThresholdCondition__ThresholdValueAssignment_2"
    // InternalTactics.g:3210:1: rule__ContextThresholdCondition__ThresholdValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__ContextThresholdCondition__ThresholdValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3214:1: ( ( ruleLiteral ) )
            // InternalTactics.g:3215:2: ( ruleLiteral )
            {
            // InternalTactics.g:3215:2: ( ruleLiteral )
            // InternalTactics.g:3216:3: ruleLiteral
            {
             before(grammarAccess.getContextThresholdConditionAccess().getThresholdValueLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getContextThresholdConditionAccess().getThresholdValueLiteralParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__ThresholdValueAssignment_2"


    // $ANTLR start "rule__ContextThresholdCondition__LogicalOpAssignment_3_0"
    // InternalTactics.g:3225:1: rule__ContextThresholdCondition__LogicalOpAssignment_3_0 : ( ruleLogicalOperator ) ;
    public final void rule__ContextThresholdCondition__LogicalOpAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3229:1: ( ( ruleLogicalOperator ) )
            // InternalTactics.g:3230:2: ( ruleLogicalOperator )
            {
            // InternalTactics.g:3230:2: ( ruleLogicalOperator )
            // InternalTactics.g:3231:3: ruleLogicalOperator
            {
             before(grammarAccess.getContextThresholdConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalOperator();

            state._fsp--;

             after(grammarAccess.getContextThresholdConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__LogicalOpAssignment_3_0"


    // $ANTLR start "rule__ContextThresholdCondition__SecondTermAssignment_3_1"
    // InternalTactics.g:3240:1: rule__ContextThresholdCondition__SecondTermAssignment_3_1 : ( ruleContextCondition ) ;
    public final void rule__ContextThresholdCondition__SecondTermAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3244:1: ( ( ruleContextCondition ) )
            // InternalTactics.g:3245:2: ( ruleContextCondition )
            {
            // InternalTactics.g:3245:2: ( ruleContextCondition )
            // InternalTactics.g:3246:3: ruleContextCondition
            {
             before(grammarAccess.getContextThresholdConditionAccess().getSecondTermContextConditionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContextCondition();

            state._fsp--;

             after(grammarAccess.getContextThresholdConditionAccess().getSecondTermContextConditionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextThresholdCondition__SecondTermAssignment_3_1"


    // $ANTLR start "rule__ContextContextCondition__ContextVarAssignment_0"
    // InternalTactics.g:3255:1: rule__ContextContextCondition__ContextVarAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__ContextContextCondition__ContextVarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3259:1: ( ( ( RULE_ID ) ) )
            // InternalTactics.g:3260:2: ( ( RULE_ID ) )
            {
            // InternalTactics.g:3260:2: ( ( RULE_ID ) )
            // InternalTactics.g:3261:3: ( RULE_ID )
            {
             before(grammarAccess.getContextContextConditionAccess().getContextVarContextVarCrossReference_0_0()); 
            // InternalTactics.g:3262:3: ( RULE_ID )
            // InternalTactics.g:3263:4: RULE_ID
            {
             before(grammarAccess.getContextContextConditionAccess().getContextVarContextVarIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextContextConditionAccess().getContextVarContextVarIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getContextContextConditionAccess().getContextVarContextVarCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__ContextVarAssignment_0"


    // $ANTLR start "rule__ContextContextCondition__OperatorAssignment_1"
    // InternalTactics.g:3274:1: rule__ContextContextCondition__OperatorAssignment_1 : ( ruleMathOperator ) ;
    public final void rule__ContextContextCondition__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3278:1: ( ( ruleMathOperator ) )
            // InternalTactics.g:3279:2: ( ruleMathOperator )
            {
            // InternalTactics.g:3279:2: ( ruleMathOperator )
            // InternalTactics.g:3280:3: ruleMathOperator
            {
             before(grammarAccess.getContextContextConditionAccess().getOperatorMathOperatorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMathOperator();

            state._fsp--;

             after(grammarAccess.getContextContextConditionAccess().getOperatorMathOperatorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__OperatorAssignment_1"


    // $ANTLR start "rule__ContextContextCondition__OtherContextVarAssignment_2"
    // InternalTactics.g:3289:1: rule__ContextContextCondition__OtherContextVarAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__ContextContextCondition__OtherContextVarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3293:1: ( ( ( RULE_ID ) ) )
            // InternalTactics.g:3294:2: ( ( RULE_ID ) )
            {
            // InternalTactics.g:3294:2: ( ( RULE_ID ) )
            // InternalTactics.g:3295:3: ( RULE_ID )
            {
             before(grammarAccess.getContextContextConditionAccess().getOtherContextVarContextVarCrossReference_2_0()); 
            // InternalTactics.g:3296:3: ( RULE_ID )
            // InternalTactics.g:3297:4: RULE_ID
            {
             before(grammarAccess.getContextContextConditionAccess().getOtherContextVarContextVarIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getContextContextConditionAccess().getOtherContextVarContextVarIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getContextContextConditionAccess().getOtherContextVarContextVarCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__OtherContextVarAssignment_2"


    // $ANTLR start "rule__ContextContextCondition__LogicalOpAssignment_3_0"
    // InternalTactics.g:3308:1: rule__ContextContextCondition__LogicalOpAssignment_3_0 : ( ruleLogicalOperator ) ;
    public final void rule__ContextContextCondition__LogicalOpAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3312:1: ( ( ruleLogicalOperator ) )
            // InternalTactics.g:3313:2: ( ruleLogicalOperator )
            {
            // InternalTactics.g:3313:2: ( ruleLogicalOperator )
            // InternalTactics.g:3314:3: ruleLogicalOperator
            {
             before(grammarAccess.getContextContextConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalOperator();

            state._fsp--;

             after(grammarAccess.getContextContextConditionAccess().getLogicalOpLogicalOperatorEnumRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__LogicalOpAssignment_3_0"


    // $ANTLR start "rule__ContextContextCondition__SecondTermAssignment_3_1"
    // InternalTactics.g:3323:1: rule__ContextContextCondition__SecondTermAssignment_3_1 : ( ruleContextCondition ) ;
    public final void rule__ContextContextCondition__SecondTermAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3327:1: ( ( ruleContextCondition ) )
            // InternalTactics.g:3328:2: ( ruleContextCondition )
            {
            // InternalTactics.g:3328:2: ( ruleContextCondition )
            // InternalTactics.g:3329:3: ruleContextCondition
            {
             before(grammarAccess.getContextContextConditionAccess().getSecondTermContextConditionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleContextCondition();

            state._fsp--;

             after(grammarAccess.getContextContextConditionAccess().getSecondTermContextConditionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ContextContextCondition__SecondTermAssignment_3_1"


    // $ANTLR start "rule__SelectVariant__VariantAssignment_2"
    // InternalTactics.g:3338:1: rule__SelectVariant__VariantAssignment_2 : ( ruleQualifiedFeatureRef ) ;
    public final void rule__SelectVariant__VariantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3342:1: ( ( ruleQualifiedFeatureRef ) )
            // InternalTactics.g:3343:2: ( ruleQualifiedFeatureRef )
            {
            // InternalTactics.g:3343:2: ( ruleQualifiedFeatureRef )
            // InternalTactics.g:3344:3: ruleQualifiedFeatureRef
            {
             before(grammarAccess.getSelectVariantAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedFeatureRef();

            state._fsp--;

             after(grammarAccess.getSelectVariantAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectVariant__VariantAssignment_2"


    // $ANTLR start "rule__DeselectVariant__VariantAssignment_2"
    // InternalTactics.g:3353:1: rule__DeselectVariant__VariantAssignment_2 : ( ruleQualifiedFeatureRef ) ;
    public final void rule__DeselectVariant__VariantAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3357:1: ( ( ruleQualifiedFeatureRef ) )
            // InternalTactics.g:3358:2: ( ruleQualifiedFeatureRef )
            {
            // InternalTactics.g:3358:2: ( ruleQualifiedFeatureRef )
            // InternalTactics.g:3359:3: ruleQualifiedFeatureRef
            {
             before(grammarAccess.getDeselectVariantAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedFeatureRef();

            state._fsp--;

             after(grammarAccess.getDeselectVariantAccess().getVariantQualifiedFeatureRefParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DeselectVariant__VariantAssignment_2"


    // $ANTLR start "rule__QualifiedFeatureRef__ModelAssignment_0"
    // InternalTactics.g:3368:1: rule__QualifiedFeatureRef__ModelAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__QualifiedFeatureRef__ModelAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3372:1: ( ( ( RULE_ID ) ) )
            // InternalTactics.g:3373:2: ( ( RULE_ID ) )
            {
            // InternalTactics.g:3373:2: ( ( RULE_ID ) )
            // InternalTactics.g:3374:3: ( RULE_ID )
            {
             before(grammarAccess.getQualifiedFeatureRefAccess().getModelResolutionModelCrossReference_0_0()); 
            // InternalTactics.g:3375:3: ( RULE_ID )
            // InternalTactics.g:3376:4: RULE_ID
            {
             before(grammarAccess.getQualifiedFeatureRefAccess().getModelResolutionModelIDTerminalRuleCall_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedFeatureRefAccess().getModelResolutionModelIDTerminalRuleCall_0_0_1()); 

            }

             after(grammarAccess.getQualifiedFeatureRefAccess().getModelResolutionModelCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedFeatureRef__ModelAssignment_0"


    // $ANTLR start "rule__QualifiedFeatureRef__FeatureAssignment_2"
    // InternalTactics.g:3387:1: rule__QualifiedFeatureRef__FeatureAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__QualifiedFeatureRef__FeatureAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3391:1: ( ( ( RULE_ID ) ) )
            // InternalTactics.g:3392:2: ( ( RULE_ID ) )
            {
            // InternalTactics.g:3392:2: ( ( RULE_ID ) )
            // InternalTactics.g:3393:3: ( RULE_ID )
            {
             before(grammarAccess.getQualifiedFeatureRefAccess().getFeatureFeatureCrossReference_2_0()); 
            // InternalTactics.g:3394:3: ( RULE_ID )
            // InternalTactics.g:3395:4: RULE_ID
            {
             before(grammarAccess.getQualifiedFeatureRefAccess().getFeatureFeatureIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedFeatureRefAccess().getFeatureFeatureIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getQualifiedFeatureRefAccess().getFeatureFeatureCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedFeatureRef__FeatureAssignment_2"


    // $ANTLR start "rule__IntLiteral__ValueAssignment"
    // InternalTactics.g:3406:1: rule__IntLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3410:1: ( ( RULE_INT ) )
            // InternalTactics.g:3411:2: ( RULE_INT )
            {
            // InternalTactics.g:3411:2: ( RULE_INT )
            // InternalTactics.g:3412:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValueAssignment"


    // $ANTLR start "rule__DecimalLiteral__ValueAssignment"
    // InternalTactics.g:3421:1: rule__DecimalLiteral__ValueAssignment : ( RULE_DECIMAL ) ;
    public final void rule__DecimalLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3425:1: ( ( RULE_DECIMAL ) )
            // InternalTactics.g:3426:2: ( RULE_DECIMAL )
            {
            // InternalTactics.g:3426:2: ( RULE_DECIMAL )
            // InternalTactics.g:3427:3: RULE_DECIMAL
            {
             before(grammarAccess.getDecimalLiteralAccess().getValueDECIMALTerminalRuleCall_0()); 
            match(input,RULE_DECIMAL,FOLLOW_2); 
             after(grammarAccess.getDecimalLiteralAccess().getValueDECIMALTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalLiteral__ValueAssignment"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalTactics.g:3436:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3440:1: ( ( RULE_STRING ) )
            // InternalTactics.g:3441:2: ( RULE_STRING )
            {
            // InternalTactics.g:3441:2: ( RULE_STRING )
            // InternalTactics.g:3442:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__BooleanLiteral__ValueAssignment"
    // InternalTactics.g:3451:1: rule__BooleanLiteral__ValueAssignment : ( RULE_BOOLEAN ) ;
    public final void rule__BooleanLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTactics.g:3455:1: ( ( RULE_BOOLEAN ) )
            // InternalTactics.g:3456:2: ( RULE_BOOLEAN )
            {
            // InternalTactics.g:3456:2: ( RULE_BOOLEAN )
            // InternalTactics.g:3457:3: RULE_BOOLEAN
            {
             before(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 
            match(input,RULE_BOOLEAN,FOLLOW_2); 
             after(grammarAccess.getBooleanLiteralAccess().getValueBOOLEANTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanLiteral__ValueAssignment"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\4\1\15\6\4\2\uffff";
    static final String dfa_3s = "\1\4\1\22\6\10\2\uffff";
    static final String dfa_4s = "\10\uffff\1\2\1\1";
    static final String dfa_5s = "\12\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2\1\3\1\4\1\5\1\6\1\7",
            "\1\10\4\11",
            "\1\10\4\11",
            "\1\10\4\11",
            "\1\10\4\11",
            "\1\10\4\11",
            "\1\10\4\11",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "697:1: rule__ContextCondition__Alternatives : ( ( ruleContextThresholdCondition ) | ( ruleContextContextCondition ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000006000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000004000012L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000005000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002200000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000000007E000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000001E0L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});

}