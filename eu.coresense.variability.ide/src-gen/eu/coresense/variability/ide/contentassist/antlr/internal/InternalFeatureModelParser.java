package eu.coresense.variability.ide.contentassist.antlr.internal;

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
import eu.coresense.variability.services.FeatureModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFeatureModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'not'", "'equiv'", "'excludes'", "'implies'", "'and'", "'or'", "'xor'", "'feature'", "'feature_model'", "'{'", "'}'", "'name'", "'root'", "'crossTreeConstraints'", "'Feature'", "'id'", "'mandatory'", "'selected'", "'children'", "','", "'Alternative'", "'OrGroup'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFeatureModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFeatureModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFeatureModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFeatureModel.g"; }


    	private FeatureModelGrammarAccess grammarAccess;

    	public void setGrammarAccess(FeatureModelGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalFeatureModel.g:54:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalFeatureModel.g:55:1: ( ruleModel EOF )
            // InternalFeatureModel.g:56:1: ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFeatureModel.g:63:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:67:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalFeatureModel.g:68:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalFeatureModel.g:68:2: ( ( rule__Model__Group__0 ) )
            // InternalFeatureModel.g:69:3: ( rule__Model__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getGroup()); 
            }
            // InternalFeatureModel.g:70:3: ( rule__Model__Group__0 )
            // InternalFeatureModel.g:70:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFeatureModel"
    // InternalFeatureModel.g:79:1: entryRuleFeatureModel : ruleFeatureModel EOF ;
    public final void entryRuleFeatureModel() throws RecognitionException {
        try {
            // InternalFeatureModel.g:80:1: ( ruleFeatureModel EOF )
            // InternalFeatureModel.g:81:1: ruleFeatureModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeatureModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeatureModel"


    // $ANTLR start "ruleFeatureModel"
    // InternalFeatureModel.g:88:1: ruleFeatureModel : ( ( rule__FeatureModel__Group__0 ) ) ;
    public final void ruleFeatureModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:92:2: ( ( ( rule__FeatureModel__Group__0 ) ) )
            // InternalFeatureModel.g:93:2: ( ( rule__FeatureModel__Group__0 ) )
            {
            // InternalFeatureModel.g:93:2: ( ( rule__FeatureModel__Group__0 ) )
            // InternalFeatureModel.g:94:3: ( rule__FeatureModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getGroup()); 
            }
            // InternalFeatureModel.g:95:3: ( rule__FeatureModel__Group__0 )
            // InternalFeatureModel.g:95:4: rule__FeatureModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleFeatureModel"


    // $ANTLR start "entryRuleAdvancedConstraint"
    // InternalFeatureModel.g:104:1: entryRuleAdvancedConstraint : ruleAdvancedConstraint EOF ;
    public final void entryRuleAdvancedConstraint() throws RecognitionException {
        try {
            // InternalFeatureModel.g:105:1: ( ruleAdvancedConstraint EOF )
            // InternalFeatureModel.g:106:1: ruleAdvancedConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdvancedConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAdvancedConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdvancedConstraintRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAdvancedConstraint"


    // $ANTLR start "ruleAdvancedConstraint"
    // InternalFeatureModel.g:113:1: ruleAdvancedConstraint : ( ( rule__AdvancedConstraint__TermAssignment ) ) ;
    public final void ruleAdvancedConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:117:2: ( ( ( rule__AdvancedConstraint__TermAssignment ) ) )
            // InternalFeatureModel.g:118:2: ( ( rule__AdvancedConstraint__TermAssignment ) )
            {
            // InternalFeatureModel.g:118:2: ( ( rule__AdvancedConstraint__TermAssignment ) )
            // InternalFeatureModel.g:119:3: ( rule__AdvancedConstraint__TermAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdvancedConstraintAccess().getTermAssignment()); 
            }
            // InternalFeatureModel.g:120:3: ( rule__AdvancedConstraint__TermAssignment )
            // InternalFeatureModel.g:120:4: rule__AdvancedConstraint__TermAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AdvancedConstraint__TermAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdvancedConstraintAccess().getTermAssignment()); 
            }

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
    // $ANTLR end "ruleAdvancedConstraint"


    // $ANTLR start "entryRuleFeature"
    // InternalFeatureModel.g:129:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalFeatureModel.g:130:1: ( ruleFeature EOF )
            // InternalFeatureModel.g:131:1: ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalFeatureModel.g:138:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:142:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalFeatureModel.g:143:2: ( ( rule__Feature__Alternatives ) )
            {
            // InternalFeatureModel.g:143:2: ( ( rule__Feature__Alternatives ) )
            // InternalFeatureModel.g:144:3: ( rule__Feature__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureAccess().getAlternatives()); 
            }
            // InternalFeatureModel.g:145:3: ( rule__Feature__Alternatives )
            // InternalFeatureModel.g:145:4: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleTerm"
    // InternalFeatureModel.g:154:1: entryRuleTerm : ruleTerm EOF ;
    public final void entryRuleTerm() throws RecognitionException {
        try {
            // InternalFeatureModel.g:155:1: ( ruleTerm EOF )
            // InternalFeatureModel.g:156:1: ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalFeatureModel.g:163:1: ruleTerm : ( ( rule__Term__Group__0 ) ) ;
    public final void ruleTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:167:2: ( ( ( rule__Term__Group__0 ) ) )
            // InternalFeatureModel.g:168:2: ( ( rule__Term__Group__0 ) )
            {
            // InternalFeatureModel.g:168:2: ( ( rule__Term__Group__0 ) )
            // InternalFeatureModel.g:169:3: ( rule__Term__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getGroup()); 
            }
            // InternalFeatureModel.g:170:3: ( rule__Term__Group__0 )
            // InternalFeatureModel.g:170:4: rule__Term__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulesecondTerm"
    // InternalFeatureModel.g:179:1: entryRulesecondTerm : rulesecondTerm EOF ;
    public final void entryRulesecondTerm() throws RecognitionException {
        try {
            // InternalFeatureModel.g:180:1: ( rulesecondTerm EOF )
            // InternalFeatureModel.g:181:1: rulesecondTerm EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondTermRule()); 
            }
            pushFollow(FOLLOW_1);
            rulesecondTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondTermRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRulesecondTerm"


    // $ANTLR start "rulesecondTerm"
    // InternalFeatureModel.g:188:1: rulesecondTerm : ( ( rule__SecondTerm__Group__0 ) ) ;
    public final void rulesecondTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:192:2: ( ( ( rule__SecondTerm__Group__0 ) ) )
            // InternalFeatureModel.g:193:2: ( ( rule__SecondTerm__Group__0 ) )
            {
            // InternalFeatureModel.g:193:2: ( ( rule__SecondTerm__Group__0 ) )
            // InternalFeatureModel.g:194:3: ( rule__SecondTerm__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondTermAccess().getGroup()); 
            }
            // InternalFeatureModel.g:195:3: ( rule__SecondTerm__Group__0 )
            // InternalFeatureModel.g:195:4: rule__SecondTerm__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SecondTerm__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondTermAccess().getGroup()); 
            }

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
    // $ANTLR end "rulesecondTerm"


    // $ANTLR start "entryRuleFeature_Impl"
    // InternalFeatureModel.g:204:1: entryRuleFeature_Impl : ruleFeature_Impl EOF ;
    public final void entryRuleFeature_Impl() throws RecognitionException {
        try {
            // InternalFeatureModel.g:205:1: ( ruleFeature_Impl EOF )
            // InternalFeatureModel.g:206:1: ruleFeature_Impl EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFeature_Impl();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleFeature_Impl"


    // $ANTLR start "ruleFeature_Impl"
    // InternalFeatureModel.g:213:1: ruleFeature_Impl : ( ( rule__Feature_Impl__Group__0 ) ) ;
    public final void ruleFeature_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:217:2: ( ( ( rule__Feature_Impl__Group__0 ) ) )
            // InternalFeatureModel.g:218:2: ( ( rule__Feature_Impl__Group__0 ) )
            {
            // InternalFeatureModel.g:218:2: ( ( rule__Feature_Impl__Group__0 ) )
            // InternalFeatureModel.g:219:3: ( rule__Feature_Impl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getGroup()); 
            }
            // InternalFeatureModel.g:220:3: ( rule__Feature_Impl__Group__0 )
            // InternalFeatureModel.g:220:4: rule__Feature_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleFeature_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalFeatureModel.g:229:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalFeatureModel.g:230:1: ( ruleEString EOF )
            // InternalFeatureModel.g:231:1: ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFeatureModel.g:238:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:242:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalFeatureModel.g:243:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalFeatureModel.g:243:2: ( ( rule__EString__Alternatives ) )
            // InternalFeatureModel.g:244:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalFeatureModel.g:245:3: ( rule__EString__Alternatives )
            // InternalFeatureModel.g:245:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEStringAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAlternative"
    // InternalFeatureModel.g:254:1: entryRuleAlternative : ruleAlternative EOF ;
    public final void entryRuleAlternative() throws RecognitionException {
        try {
            // InternalFeatureModel.g:255:1: ( ruleAlternative EOF )
            // InternalFeatureModel.g:256:1: ruleAlternative EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAlternative();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // InternalFeatureModel.g:263:1: ruleAlternative : ( ( rule__Alternative__Group__0 ) ) ;
    public final void ruleAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:267:2: ( ( ( rule__Alternative__Group__0 ) ) )
            // InternalFeatureModel.g:268:2: ( ( rule__Alternative__Group__0 ) )
            {
            // InternalFeatureModel.g:268:2: ( ( rule__Alternative__Group__0 ) )
            // InternalFeatureModel.g:269:3: ( rule__Alternative__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getGroup()); 
            }
            // InternalFeatureModel.g:270:3: ( rule__Alternative__Group__0 )
            // InternalFeatureModel.g:270:4: rule__Alternative__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleOrGroup"
    // InternalFeatureModel.g:279:1: entryRuleOrGroup : ruleOrGroup EOF ;
    public final void entryRuleOrGroup() throws RecognitionException {
        try {
            // InternalFeatureModel.g:280:1: ( ruleOrGroup EOF )
            // InternalFeatureModel.g:281:1: ruleOrGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleOrGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

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
    // $ANTLR end "entryRuleOrGroup"


    // $ANTLR start "ruleOrGroup"
    // InternalFeatureModel.g:288:1: ruleOrGroup : ( ( rule__OrGroup__Group__0 ) ) ;
    public final void ruleOrGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:292:2: ( ( ( rule__OrGroup__Group__0 ) ) )
            // InternalFeatureModel.g:293:2: ( ( rule__OrGroup__Group__0 ) )
            {
            // InternalFeatureModel.g:293:2: ( ( rule__OrGroup__Group__0 ) )
            // InternalFeatureModel.g:294:3: ( rule__OrGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getGroup()); 
            }
            // InternalFeatureModel.g:295:3: ( rule__OrGroup__Group__0 )
            // InternalFeatureModel.g:295:4: rule__OrGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getGroup()); 
            }

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
    // $ANTLR end "ruleOrGroup"


    // $ANTLR start "ruleTermType"
    // InternalFeatureModel.g:304:1: ruleTermType : ( ( rule__TermType__Alternatives ) ) ;
    public final void ruleTermType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:308:1: ( ( ( rule__TermType__Alternatives ) ) )
            // InternalFeatureModel.g:309:2: ( ( rule__TermType__Alternatives ) )
            {
            // InternalFeatureModel.g:309:2: ( ( rule__TermType__Alternatives ) )
            // InternalFeatureModel.g:310:3: ( rule__TermType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermTypeAccess().getAlternatives()); 
            }
            // InternalFeatureModel.g:311:3: ( rule__TermType__Alternatives )
            // InternalFeatureModel.g:311:4: rule__TermType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TermType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermTypeAccess().getAlternatives()); 
            }

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
    // $ANTLR end "ruleTermType"


    // $ANTLR start "rule__Feature__Alternatives"
    // InternalFeatureModel.g:319:1: rule__Feature__Alternatives : ( ( ruleFeature_Impl ) | ( ruleAlternative ) | ( ruleOrGroup ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:323:1: ( ( ruleFeature_Impl ) | ( ruleAlternative ) | ( ruleOrGroup ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                switch ( input.LA(2) ) {
                case 27:
                    {
                    switch ( input.LA(3) ) {
                    case 28:
                        {
                        switch ( input.LA(4) ) {
                        case 28:
                            {
                            switch ( input.LA(5) ) {
                            case 31:
                                {
                                alt1=2;
                                }
                                break;
                            case 25:
                                {
                                alt1=1;
                                }
                                break;
                            case 32:
                                {
                                alt1=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return ;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 1, 7, input);

                                throw nvae;
                            }

                            }
                            break;
                        case 31:
                            {
                            alt1=2;
                            }
                            break;
                        case 25:
                            {
                            alt1=1;
                            }
                            break;
                        case 32:
                            {
                            alt1=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 2, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 25:
                        {
                        alt1=1;
                        }
                        break;
                    case 31:
                        {
                        alt1=2;
                        }
                        break;
                    case 32:
                        {
                        alt1=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 6, input);

                        throw nvae;
                    }

                    }
                    break;
                case 28:
                    {
                    switch ( input.LA(3) ) {
                    case 28:
                        {
                        switch ( input.LA(4) ) {
                        case 31:
                            {
                            alt1=2;
                            }
                            break;
                        case 25:
                            {
                            alt1=1;
                            }
                            break;
                        case 32:
                            {
                            alt1=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return ;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 1, 7, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 31:
                        {
                        alt1=2;
                        }
                        break;
                    case 25:
                        {
                        alt1=1;
                        }
                        break;
                    case 32:
                        {
                        alt1=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 25:
                    {
                    alt1=1;
                    }
                    break;
                case 31:
                    {
                    alt1=2;
                    }
                    break;
                case 32:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }

                }
                break;
            case 28:
                {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    switch ( input.LA(3) ) {
                    case 31:
                        {
                        alt1=2;
                        }
                        break;
                    case 25:
                        {
                        alt1=1;
                        }
                        break;
                    case 32:
                        {
                        alt1=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 7, input);

                        throw nvae;
                    }

                    }
                    break;
                case 31:
                    {
                    alt1=2;
                    }
                    break;
                case 25:
                    {
                    alt1=1;
                    }
                    break;
                case 32:
                    {
                    alt1=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;
                }

                }
                break;
            case 25:
                {
                alt1=1;
                }
                break;
            case 31:
                {
                alt1=2;
                }
                break;
            case 32:
                {
                alt1=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalFeatureModel.g:324:2: ( ruleFeature_Impl )
                    {
                    // InternalFeatureModel.g:324:2: ( ruleFeature_Impl )
                    // InternalFeatureModel.g:325:3: ruleFeature_Impl
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getFeature_ImplParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleFeature_Impl();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getFeature_ImplParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:330:2: ( ruleAlternative )
                    {
                    // InternalFeatureModel.g:330:2: ( ruleAlternative )
                    // InternalFeatureModel.g:331:3: ruleAlternative
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getAlternativeParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAlternative();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getAlternativeParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureModel.g:336:2: ( ruleOrGroup )
                    {
                    // InternalFeatureModel.g:336:2: ( ruleOrGroup )
                    // InternalFeatureModel.g:337:3: ruleOrGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getFeatureAccess().getOrGroupParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleOrGroup();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getFeatureAccess().getOrGroupParserRuleCall_2()); 
                    }

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
    // $ANTLR end "rule__Feature__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalFeatureModel.g:346:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:350:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFeatureModel.g:351:2: ( RULE_STRING )
                    {
                    // InternalFeatureModel.g:351:2: ( RULE_STRING )
                    // InternalFeatureModel.g:352:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:357:2: ( RULE_ID )
                    {
                    // InternalFeatureModel.g:357:2: ( RULE_ID )
                    // InternalFeatureModel.g:358:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    }

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TermType__Alternatives"
    // InternalFeatureModel.g:367:1: rule__TermType__Alternatives : ( ( ( 'not' ) ) | ( ( 'equiv' ) ) | ( ( 'excludes' ) ) | ( ( 'implies' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'xor' ) ) | ( ( 'feature' ) ) );
    public final void rule__TermType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:371:1: ( ( ( 'not' ) ) | ( ( 'equiv' ) ) | ( ( 'excludes' ) ) | ( ( 'implies' ) ) | ( ( 'and' ) ) | ( ( 'or' ) ) | ( ( 'xor' ) ) | ( ( 'feature' ) ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            case 15:
                {
                alt3=5;
                }
                break;
            case 16:
                {
                alt3=6;
                }
                break;
            case 17:
                {
                alt3=7;
                }
                break;
            case 18:
                {
                alt3=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFeatureModel.g:372:2: ( ( 'not' ) )
                    {
                    // InternalFeatureModel.g:372:2: ( ( 'not' ) )
                    // InternalFeatureModel.g:373:3: ( 'not' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermTypeAccess().getNotEnumLiteralDeclaration_0()); 
                    }
                    // InternalFeatureModel.g:374:3: ( 'not' )
                    // InternalFeatureModel.g:374:4: 'not'
                    {
                    match(input,11,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermTypeAccess().getNotEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:378:2: ( ( 'equiv' ) )
                    {
                    // InternalFeatureModel.g:378:2: ( ( 'equiv' ) )
                    // InternalFeatureModel.g:379:3: ( 'equiv' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermTypeAccess().getEquivEnumLiteralDeclaration_1()); 
                    }
                    // InternalFeatureModel.g:380:3: ( 'equiv' )
                    // InternalFeatureModel.g:380:4: 'equiv'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermTypeAccess().getEquivEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureModel.g:384:2: ( ( 'excludes' ) )
                    {
                    // InternalFeatureModel.g:384:2: ( ( 'excludes' ) )
                    // InternalFeatureModel.g:385:3: ( 'excludes' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermTypeAccess().getExcludesEnumLiteralDeclaration_2()); 
                    }
                    // InternalFeatureModel.g:386:3: ( 'excludes' )
                    // InternalFeatureModel.g:386:4: 'excludes'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermTypeAccess().getExcludesEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFeatureModel.g:390:2: ( ( 'implies' ) )
                    {
                    // InternalFeatureModel.g:390:2: ( ( 'implies' ) )
                    // InternalFeatureModel.g:391:3: ( 'implies' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermTypeAccess().getImpliesEnumLiteralDeclaration_3()); 
                    }
                    // InternalFeatureModel.g:392:3: ( 'implies' )
                    // InternalFeatureModel.g:392:4: 'implies'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermTypeAccess().getImpliesEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFeatureModel.g:396:2: ( ( 'and' ) )
                    {
                    // InternalFeatureModel.g:396:2: ( ( 'and' ) )
                    // InternalFeatureModel.g:397:3: ( 'and' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermTypeAccess().getAndEnumLiteralDeclaration_4()); 
                    }
                    // InternalFeatureModel.g:398:3: ( 'and' )
                    // InternalFeatureModel.g:398:4: 'and'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermTypeAccess().getAndEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalFeatureModel.g:402:2: ( ( 'or' ) )
                    {
                    // InternalFeatureModel.g:402:2: ( ( 'or' ) )
                    // InternalFeatureModel.g:403:3: ( 'or' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermTypeAccess().getOrEnumLiteralDeclaration_5()); 
                    }
                    // InternalFeatureModel.g:404:3: ( 'or' )
                    // InternalFeatureModel.g:404:4: 'or'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermTypeAccess().getOrEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalFeatureModel.g:408:2: ( ( 'xor' ) )
                    {
                    // InternalFeatureModel.g:408:2: ( ( 'xor' ) )
                    // InternalFeatureModel.g:409:3: ( 'xor' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermTypeAccess().getXorEnumLiteralDeclaration_6()); 
                    }
                    // InternalFeatureModel.g:410:3: ( 'xor' )
                    // InternalFeatureModel.g:410:4: 'xor'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermTypeAccess().getXorEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalFeatureModel.g:414:2: ( ( 'feature' ) )
                    {
                    // InternalFeatureModel.g:414:2: ( ( 'feature' ) )
                    // InternalFeatureModel.g:415:3: ( 'feature' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTermTypeAccess().getFeatureEnumLiteralDeclaration_7()); 
                    }
                    // InternalFeatureModel.g:416:3: ( 'feature' )
                    // InternalFeatureModel.g:416:4: 'feature'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTermTypeAccess().getFeatureEnumLiteralDeclaration_7()); 
                    }

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
    // $ANTLR end "rule__TermType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalFeatureModel.g:424:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:428:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFeatureModel.g:429:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalFeatureModel.g:436:1: rule__Model__Group__0__Impl : ( 'feature_model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:440:1: ( ( 'feature_model' ) )
            // InternalFeatureModel.g:441:1: ( 'feature_model' )
            {
            // InternalFeatureModel.g:441:1: ( 'feature_model' )
            // InternalFeatureModel.g:442:2: 'feature_model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFeature_modelKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFeature_modelKeyword_0()); 
            }

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalFeatureModel.g:451:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:455:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalFeatureModel.g:456:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalFeatureModel.g:463:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:467:1: ( ( '{' ) )
            // InternalFeatureModel.g:468:1: ( '{' )
            {
            // InternalFeatureModel.g:468:1: ( '{' )
            // InternalFeatureModel.g:469:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            }

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalFeatureModel.g:478:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:482:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalFeatureModel.g:483:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalFeatureModel.g:490:1: rule__Model__Group__2__Impl : ( ( rule__Model__FmAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:494:1: ( ( ( rule__Model__FmAssignment_2 ) ) )
            // InternalFeatureModel.g:495:1: ( ( rule__Model__FmAssignment_2 ) )
            {
            // InternalFeatureModel.g:495:1: ( ( rule__Model__FmAssignment_2 ) )
            // InternalFeatureModel.g:496:2: ( rule__Model__FmAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFmAssignment_2()); 
            }
            // InternalFeatureModel.g:497:2: ( rule__Model__FmAssignment_2 )
            // InternalFeatureModel.g:497:3: rule__Model__FmAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Model__FmAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFmAssignment_2()); 
            }

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalFeatureModel.g:505:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:509:1: ( rule__Model__Group__3__Impl )
            // InternalFeatureModel.g:510:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalFeatureModel.g:516:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:520:1: ( ( '}' ) )
            // InternalFeatureModel.g:521:1: ( '}' )
            {
            // InternalFeatureModel.g:521:1: ( '}' )
            // InternalFeatureModel.g:522:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            }

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__FeatureModel__Group__0"
    // InternalFeatureModel.g:532:1: rule__FeatureModel__Group__0 : rule__FeatureModel__Group__0__Impl rule__FeatureModel__Group__1 ;
    public final void rule__FeatureModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:536:1: ( rule__FeatureModel__Group__0__Impl rule__FeatureModel__Group__1 )
            // InternalFeatureModel.g:537:2: rule__FeatureModel__Group__0__Impl rule__FeatureModel__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__FeatureModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FeatureModel__Group__0"


    // $ANTLR start "rule__FeatureModel__Group__0__Impl"
    // InternalFeatureModel.g:544:1: rule__FeatureModel__Group__0__Impl : ( 'name' ) ;
    public final void rule__FeatureModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:548:1: ( ( 'name' ) )
            // InternalFeatureModel.g:549:1: ( 'name' )
            {
            // InternalFeatureModel.g:549:1: ( 'name' )
            // InternalFeatureModel.g:550:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getNameKeyword_0()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getNameKeyword_0()); 
            }

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
    // $ANTLR end "rule__FeatureModel__Group__0__Impl"


    // $ANTLR start "rule__FeatureModel__Group__1"
    // InternalFeatureModel.g:559:1: rule__FeatureModel__Group__1 : rule__FeatureModel__Group__1__Impl rule__FeatureModel__Group__2 ;
    public final void rule__FeatureModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:563:1: ( rule__FeatureModel__Group__1__Impl rule__FeatureModel__Group__2 )
            // InternalFeatureModel.g:564:2: rule__FeatureModel__Group__1__Impl rule__FeatureModel__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__FeatureModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FeatureModel__Group__1"


    // $ANTLR start "rule__FeatureModel__Group__1__Impl"
    // InternalFeatureModel.g:571:1: rule__FeatureModel__Group__1__Impl : ( ( rule__FeatureModel__NameAssignment_1 ) ) ;
    public final void rule__FeatureModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:575:1: ( ( ( rule__FeatureModel__NameAssignment_1 ) ) )
            // InternalFeatureModel.g:576:1: ( ( rule__FeatureModel__NameAssignment_1 ) )
            {
            // InternalFeatureModel.g:576:1: ( ( rule__FeatureModel__NameAssignment_1 ) )
            // InternalFeatureModel.g:577:2: ( rule__FeatureModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getNameAssignment_1()); 
            }
            // InternalFeatureModel.g:578:2: ( rule__FeatureModel__NameAssignment_1 )
            // InternalFeatureModel.g:578:3: rule__FeatureModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureModel__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getNameAssignment_1()); 
            }

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
    // $ANTLR end "rule__FeatureModel__Group__1__Impl"


    // $ANTLR start "rule__FeatureModel__Group__2"
    // InternalFeatureModel.g:586:1: rule__FeatureModel__Group__2 : rule__FeatureModel__Group__2__Impl rule__FeatureModel__Group__3 ;
    public final void rule__FeatureModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:590:1: ( rule__FeatureModel__Group__2__Impl rule__FeatureModel__Group__3 )
            // InternalFeatureModel.g:591:2: rule__FeatureModel__Group__2__Impl rule__FeatureModel__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__FeatureModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FeatureModel__Group__2"


    // $ANTLR start "rule__FeatureModel__Group__2__Impl"
    // InternalFeatureModel.g:598:1: rule__FeatureModel__Group__2__Impl : ( 'root' ) ;
    public final void rule__FeatureModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:602:1: ( ( 'root' ) )
            // InternalFeatureModel.g:603:1: ( 'root' )
            {
            // InternalFeatureModel.g:603:1: ( 'root' )
            // InternalFeatureModel.g:604:2: 'root'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getRootKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getRootKeyword_2()); 
            }

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
    // $ANTLR end "rule__FeatureModel__Group__2__Impl"


    // $ANTLR start "rule__FeatureModel__Group__3"
    // InternalFeatureModel.g:613:1: rule__FeatureModel__Group__3 : rule__FeatureModel__Group__3__Impl rule__FeatureModel__Group__4 ;
    public final void rule__FeatureModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:617:1: ( rule__FeatureModel__Group__3__Impl rule__FeatureModel__Group__4 )
            // InternalFeatureModel.g:618:2: rule__FeatureModel__Group__3__Impl rule__FeatureModel__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__FeatureModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FeatureModel__Group__3"


    // $ANTLR start "rule__FeatureModel__Group__3__Impl"
    // InternalFeatureModel.g:625:1: rule__FeatureModel__Group__3__Impl : ( ( rule__FeatureModel__RootAssignment_3 ) ) ;
    public final void rule__FeatureModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:629:1: ( ( ( rule__FeatureModel__RootAssignment_3 ) ) )
            // InternalFeatureModel.g:630:1: ( ( rule__FeatureModel__RootAssignment_3 ) )
            {
            // InternalFeatureModel.g:630:1: ( ( rule__FeatureModel__RootAssignment_3 ) )
            // InternalFeatureModel.g:631:2: ( rule__FeatureModel__RootAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getRootAssignment_3()); 
            }
            // InternalFeatureModel.g:632:2: ( rule__FeatureModel__RootAssignment_3 )
            // InternalFeatureModel.g:632:3: rule__FeatureModel__RootAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FeatureModel__RootAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getRootAssignment_3()); 
            }

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
    // $ANTLR end "rule__FeatureModel__Group__3__Impl"


    // $ANTLR start "rule__FeatureModel__Group__4"
    // InternalFeatureModel.g:640:1: rule__FeatureModel__Group__4 : rule__FeatureModel__Group__4__Impl rule__FeatureModel__Group__5 ;
    public final void rule__FeatureModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:644:1: ( rule__FeatureModel__Group__4__Impl rule__FeatureModel__Group__5 )
            // InternalFeatureModel.g:645:2: rule__FeatureModel__Group__4__Impl rule__FeatureModel__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__FeatureModel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FeatureModel__Group__4"


    // $ANTLR start "rule__FeatureModel__Group__4__Impl"
    // InternalFeatureModel.g:652:1: rule__FeatureModel__Group__4__Impl : ( 'crossTreeConstraints' ) ;
    public final void rule__FeatureModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:656:1: ( ( 'crossTreeConstraints' ) )
            // InternalFeatureModel.g:657:1: ( 'crossTreeConstraints' )
            {
            // InternalFeatureModel.g:657:1: ( 'crossTreeConstraints' )
            // InternalFeatureModel.g:658:2: 'crossTreeConstraints'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsKeyword_4()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsKeyword_4()); 
            }

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
    // $ANTLR end "rule__FeatureModel__Group__4__Impl"


    // $ANTLR start "rule__FeatureModel__Group__5"
    // InternalFeatureModel.g:667:1: rule__FeatureModel__Group__5 : rule__FeatureModel__Group__5__Impl rule__FeatureModel__Group__6 ;
    public final void rule__FeatureModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:671:1: ( rule__FeatureModel__Group__5__Impl rule__FeatureModel__Group__6 )
            // InternalFeatureModel.g:672:2: rule__FeatureModel__Group__5__Impl rule__FeatureModel__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__FeatureModel__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FeatureModel__Group__5"


    // $ANTLR start "rule__FeatureModel__Group__5__Impl"
    // InternalFeatureModel.g:679:1: rule__FeatureModel__Group__5__Impl : ( '{' ) ;
    public final void rule__FeatureModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:683:1: ( ( '{' ) )
            // InternalFeatureModel.g:684:1: ( '{' )
            {
            // InternalFeatureModel.g:684:1: ( '{' )
            // InternalFeatureModel.g:685:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getLeftCurlyBracketKeyword_5()); 
            }

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
    // $ANTLR end "rule__FeatureModel__Group__5__Impl"


    // $ANTLR start "rule__FeatureModel__Group__6"
    // InternalFeatureModel.g:694:1: rule__FeatureModel__Group__6 : rule__FeatureModel__Group__6__Impl rule__FeatureModel__Group__7 ;
    public final void rule__FeatureModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:698:1: ( rule__FeatureModel__Group__6__Impl rule__FeatureModel__Group__7 )
            // InternalFeatureModel.g:699:2: rule__FeatureModel__Group__6__Impl rule__FeatureModel__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__FeatureModel__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__7();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FeatureModel__Group__6"


    // $ANTLR start "rule__FeatureModel__Group__6__Impl"
    // InternalFeatureModel.g:706:1: rule__FeatureModel__Group__6__Impl : ( ( rule__FeatureModel__CrossTreeConstraintsAssignment_6 )* ) ;
    public final void rule__FeatureModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:710:1: ( ( ( rule__FeatureModel__CrossTreeConstraintsAssignment_6 )* ) )
            // InternalFeatureModel.g:711:1: ( ( rule__FeatureModel__CrossTreeConstraintsAssignment_6 )* )
            {
            // InternalFeatureModel.g:711:1: ( ( rule__FeatureModel__CrossTreeConstraintsAssignment_6 )* )
            // InternalFeatureModel.g:712:2: ( rule__FeatureModel__CrossTreeConstraintsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsAssignment_6()); 
            }
            // InternalFeatureModel.g:713:2: ( rule__FeatureModel__CrossTreeConstraintsAssignment_6 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFeatureModel.g:713:3: rule__FeatureModel__CrossTreeConstraintsAssignment_6
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__FeatureModel__CrossTreeConstraintsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsAssignment_6()); 
            }

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
    // $ANTLR end "rule__FeatureModel__Group__6__Impl"


    // $ANTLR start "rule__FeatureModel__Group__7"
    // InternalFeatureModel.g:721:1: rule__FeatureModel__Group__7 : rule__FeatureModel__Group__7__Impl ;
    public final void rule__FeatureModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:725:1: ( rule__FeatureModel__Group__7__Impl )
            // InternalFeatureModel.g:726:2: rule__FeatureModel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__FeatureModel__Group__7"


    // $ANTLR start "rule__FeatureModel__Group__7__Impl"
    // InternalFeatureModel.g:732:1: rule__FeatureModel__Group__7__Impl : ( '}' ) ;
    public final void rule__FeatureModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:736:1: ( ( '}' ) )
            // InternalFeatureModel.g:737:1: ( '}' )
            {
            // InternalFeatureModel.g:737:1: ( '}' )
            // InternalFeatureModel.g:738:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getRightCurlyBracketKeyword_7()); 
            }

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
    // $ANTLR end "rule__FeatureModel__Group__7__Impl"


    // $ANTLR start "rule__Term__Group__0"
    // InternalFeatureModel.g:748:1: rule__Term__Group__0 : rule__Term__Group__0__Impl rule__Term__Group__1 ;
    public final void rule__Term__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:752:1: ( rule__Term__Group__0__Impl rule__Term__Group__1 )
            // InternalFeatureModel.g:753:2: rule__Term__Group__0__Impl rule__Term__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Term__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Term__Group__0"


    // $ANTLR start "rule__Term__Group__0__Impl"
    // InternalFeatureModel.g:760:1: rule__Term__Group__0__Impl : ( () ) ;
    public final void rule__Term__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:764:1: ( ( () ) )
            // InternalFeatureModel.g:765:1: ( () )
            {
            // InternalFeatureModel.g:765:1: ( () )
            // InternalFeatureModel.g:766:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTermAction_0()); 
            }
            // InternalFeatureModel.g:767:2: ()
            // InternalFeatureModel.g:767:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getTermAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Term__Group__0__Impl"


    // $ANTLR start "rule__Term__Group__1"
    // InternalFeatureModel.g:775:1: rule__Term__Group__1 : rule__Term__Group__1__Impl rule__Term__Group__2 ;
    public final void rule__Term__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:779:1: ( rule__Term__Group__1__Impl rule__Term__Group__2 )
            // InternalFeatureModel.g:780:2: rule__Term__Group__1__Impl rule__Term__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Term__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Term__Group__1"


    // $ANTLR start "rule__Term__Group__1__Impl"
    // InternalFeatureModel.g:787:1: rule__Term__Group__1__Impl : ( ( rule__Term__FeatureAssignment_1 ) ) ;
    public final void rule__Term__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:791:1: ( ( ( rule__Term__FeatureAssignment_1 ) ) )
            // InternalFeatureModel.g:792:1: ( ( rule__Term__FeatureAssignment_1 ) )
            {
            // InternalFeatureModel.g:792:1: ( ( rule__Term__FeatureAssignment_1 ) )
            // InternalFeatureModel.g:793:2: ( rule__Term__FeatureAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFeatureAssignment_1()); 
            }
            // InternalFeatureModel.g:794:2: ( rule__Term__FeatureAssignment_1 )
            // InternalFeatureModel.g:794:3: rule__Term__FeatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Term__FeatureAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getFeatureAssignment_1()); 
            }

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
    // $ANTLR end "rule__Term__Group__1__Impl"


    // $ANTLR start "rule__Term__Group__2"
    // InternalFeatureModel.g:802:1: rule__Term__Group__2 : rule__Term__Group__2__Impl rule__Term__Group__3 ;
    public final void rule__Term__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:806:1: ( rule__Term__Group__2__Impl rule__Term__Group__3 )
            // InternalFeatureModel.g:807:2: rule__Term__Group__2__Impl rule__Term__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Term__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Term__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Term__Group__2"


    // $ANTLR start "rule__Term__Group__2__Impl"
    // InternalFeatureModel.g:814:1: rule__Term__Group__2__Impl : ( ( rule__Term__TypeAssignment_2 ) ) ;
    public final void rule__Term__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:818:1: ( ( ( rule__Term__TypeAssignment_2 ) ) )
            // InternalFeatureModel.g:819:1: ( ( rule__Term__TypeAssignment_2 ) )
            {
            // InternalFeatureModel.g:819:1: ( ( rule__Term__TypeAssignment_2 ) )
            // InternalFeatureModel.g:820:2: ( rule__Term__TypeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTypeAssignment_2()); 
            }
            // InternalFeatureModel.g:821:2: ( rule__Term__TypeAssignment_2 )
            // InternalFeatureModel.g:821:3: rule__Term__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Term__TypeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getTypeAssignment_2()); 
            }

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
    // $ANTLR end "rule__Term__Group__2__Impl"


    // $ANTLR start "rule__Term__Group__3"
    // InternalFeatureModel.g:829:1: rule__Term__Group__3 : rule__Term__Group__3__Impl ;
    public final void rule__Term__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:833:1: ( rule__Term__Group__3__Impl )
            // InternalFeatureModel.g:834:2: rule__Term__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Term__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Term__Group__3"


    // $ANTLR start "rule__Term__Group__3__Impl"
    // InternalFeatureModel.g:840:1: rule__Term__Group__3__Impl : ( ( rule__Term__OperandsAssignment_3 ) ) ;
    public final void rule__Term__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:844:1: ( ( ( rule__Term__OperandsAssignment_3 ) ) )
            // InternalFeatureModel.g:845:1: ( ( rule__Term__OperandsAssignment_3 ) )
            {
            // InternalFeatureModel.g:845:1: ( ( rule__Term__OperandsAssignment_3 ) )
            // InternalFeatureModel.g:846:2: ( rule__Term__OperandsAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperandsAssignment_3()); 
            }
            // InternalFeatureModel.g:847:2: ( rule__Term__OperandsAssignment_3 )
            // InternalFeatureModel.g:847:3: rule__Term__OperandsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Term__OperandsAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperandsAssignment_3()); 
            }

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
    // $ANTLR end "rule__Term__Group__3__Impl"


    // $ANTLR start "rule__SecondTerm__Group__0"
    // InternalFeatureModel.g:856:1: rule__SecondTerm__Group__0 : rule__SecondTerm__Group__0__Impl rule__SecondTerm__Group__1 ;
    public final void rule__SecondTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:860:1: ( rule__SecondTerm__Group__0__Impl rule__SecondTerm__Group__1 )
            // InternalFeatureModel.g:861:2: rule__SecondTerm__Group__0__Impl rule__SecondTerm__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__SecondTerm__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SecondTerm__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SecondTerm__Group__0"


    // $ANTLR start "rule__SecondTerm__Group__0__Impl"
    // InternalFeatureModel.g:868:1: rule__SecondTerm__Group__0__Impl : ( () ) ;
    public final void rule__SecondTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:872:1: ( ( () ) )
            // InternalFeatureModel.g:873:1: ( () )
            {
            // InternalFeatureModel.g:873:1: ( () )
            // InternalFeatureModel.g:874:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondTermAccess().getTermAction_0()); 
            }
            // InternalFeatureModel.g:875:2: ()
            // InternalFeatureModel.g:875:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondTermAccess().getTermAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SecondTerm__Group__0__Impl"


    // $ANTLR start "rule__SecondTerm__Group__1"
    // InternalFeatureModel.g:883:1: rule__SecondTerm__Group__1 : rule__SecondTerm__Group__1__Impl ;
    public final void rule__SecondTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:887:1: ( rule__SecondTerm__Group__1__Impl )
            // InternalFeatureModel.g:888:2: rule__SecondTerm__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SecondTerm__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__SecondTerm__Group__1"


    // $ANTLR start "rule__SecondTerm__Group__1__Impl"
    // InternalFeatureModel.g:894:1: rule__SecondTerm__Group__1__Impl : ( ( rule__SecondTerm__FeatureAssignment_1 ) ) ;
    public final void rule__SecondTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:898:1: ( ( ( rule__SecondTerm__FeatureAssignment_1 ) ) )
            // InternalFeatureModel.g:899:1: ( ( rule__SecondTerm__FeatureAssignment_1 ) )
            {
            // InternalFeatureModel.g:899:1: ( ( rule__SecondTerm__FeatureAssignment_1 ) )
            // InternalFeatureModel.g:900:2: ( rule__SecondTerm__FeatureAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondTermAccess().getFeatureAssignment_1()); 
            }
            // InternalFeatureModel.g:901:2: ( rule__SecondTerm__FeatureAssignment_1 )
            // InternalFeatureModel.g:901:3: rule__SecondTerm__FeatureAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SecondTerm__FeatureAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondTermAccess().getFeatureAssignment_1()); 
            }

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
    // $ANTLR end "rule__SecondTerm__Group__1__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__0"
    // InternalFeatureModel.g:910:1: rule__Feature_Impl__Group__0 : rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 ;
    public final void rule__Feature_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:914:1: ( rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 )
            // InternalFeatureModel.g:915:2: rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Feature_Impl__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group__0"


    // $ANTLR start "rule__Feature_Impl__Group__0__Impl"
    // InternalFeatureModel.g:922:1: rule__Feature_Impl__Group__0__Impl : ( ( rule__Feature_Impl__Group_0__0 )? ) ;
    public final void rule__Feature_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:926:1: ( ( ( rule__Feature_Impl__Group_0__0 )? ) )
            // InternalFeatureModel.g:927:1: ( ( rule__Feature_Impl__Group_0__0 )? )
            {
            // InternalFeatureModel.g:927:1: ( ( rule__Feature_Impl__Group_0__0 )? )
            // InternalFeatureModel.g:928:2: ( rule__Feature_Impl__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getGroup_0()); 
            }
            // InternalFeatureModel.g:929:2: ( rule__Feature_Impl__Group_0__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFeatureModel.g:929:3: rule__Feature_Impl__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature_Impl__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getGroup_0()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group__0__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__1"
    // InternalFeatureModel.g:937:1: rule__Feature_Impl__Group__1 : rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 ;
    public final void rule__Feature_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:941:1: ( rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 )
            // InternalFeatureModel.g:942:2: rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Feature_Impl__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group__1"


    // $ANTLR start "rule__Feature_Impl__Group__1__Impl"
    // InternalFeatureModel.g:949:1: rule__Feature_Impl__Group__1__Impl : ( ( rule__Feature_Impl__Group_1__0 )? ) ;
    public final void rule__Feature_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:953:1: ( ( ( rule__Feature_Impl__Group_1__0 )? ) )
            // InternalFeatureModel.g:954:1: ( ( rule__Feature_Impl__Group_1__0 )? )
            {
            // InternalFeatureModel.g:954:1: ( ( rule__Feature_Impl__Group_1__0 )? )
            // InternalFeatureModel.g:955:2: ( rule__Feature_Impl__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getGroup_1()); 
            }
            // InternalFeatureModel.g:956:2: ( rule__Feature_Impl__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureModel.g:956:3: rule__Feature_Impl__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature_Impl__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group__1__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__2"
    // InternalFeatureModel.g:964:1: rule__Feature_Impl__Group__2 : rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 ;
    public final void rule__Feature_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:968:1: ( rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 )
            // InternalFeatureModel.g:969:2: rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Feature_Impl__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group__2"


    // $ANTLR start "rule__Feature_Impl__Group__2__Impl"
    // InternalFeatureModel.g:976:1: rule__Feature_Impl__Group__2__Impl : ( 'Feature' ) ;
    public final void rule__Feature_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:980:1: ( ( 'Feature' ) )
            // InternalFeatureModel.g:981:1: ( 'Feature' )
            {
            // InternalFeatureModel.g:981:1: ( 'Feature' )
            // InternalFeatureModel.g:982:2: 'Feature'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getFeatureKeyword_2()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getFeatureKeyword_2()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group__2__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__3"
    // InternalFeatureModel.g:991:1: rule__Feature_Impl__Group__3 : rule__Feature_Impl__Group__3__Impl rule__Feature_Impl__Group__4 ;
    public final void rule__Feature_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:995:1: ( rule__Feature_Impl__Group__3__Impl rule__Feature_Impl__Group__4 )
            // InternalFeatureModel.g:996:2: rule__Feature_Impl__Group__3__Impl rule__Feature_Impl__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Feature_Impl__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group__3"


    // $ANTLR start "rule__Feature_Impl__Group__3__Impl"
    // InternalFeatureModel.g:1003:1: rule__Feature_Impl__Group__3__Impl : ( ( rule__Feature_Impl__NameAssignment_3 ) ) ;
    public final void rule__Feature_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1007:1: ( ( ( rule__Feature_Impl__NameAssignment_3 ) ) )
            // InternalFeatureModel.g:1008:1: ( ( rule__Feature_Impl__NameAssignment_3 ) )
            {
            // InternalFeatureModel.g:1008:1: ( ( rule__Feature_Impl__NameAssignment_3 ) )
            // InternalFeatureModel.g:1009:2: ( rule__Feature_Impl__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getNameAssignment_3()); 
            }
            // InternalFeatureModel.g:1010:2: ( rule__Feature_Impl__NameAssignment_3 )
            // InternalFeatureModel.g:1010:3: rule__Feature_Impl__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getNameAssignment_3()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group__3__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__4"
    // InternalFeatureModel.g:1018:1: rule__Feature_Impl__Group__4 : rule__Feature_Impl__Group__4__Impl rule__Feature_Impl__Group__5 ;
    public final void rule__Feature_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1022:1: ( rule__Feature_Impl__Group__4__Impl rule__Feature_Impl__Group__5 )
            // InternalFeatureModel.g:1023:2: rule__Feature_Impl__Group__4__Impl rule__Feature_Impl__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Feature_Impl__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group__4"


    // $ANTLR start "rule__Feature_Impl__Group__4__Impl"
    // InternalFeatureModel.g:1030:1: rule__Feature_Impl__Group__4__Impl : ( 'id' ) ;
    public final void rule__Feature_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1034:1: ( ( 'id' ) )
            // InternalFeatureModel.g:1035:1: ( 'id' )
            {
            // InternalFeatureModel.g:1035:1: ( 'id' )
            // InternalFeatureModel.g:1036:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getIdKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getIdKeyword_4()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group__4__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__5"
    // InternalFeatureModel.g:1045:1: rule__Feature_Impl__Group__5 : rule__Feature_Impl__Group__5__Impl rule__Feature_Impl__Group__6 ;
    public final void rule__Feature_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1049:1: ( rule__Feature_Impl__Group__5__Impl rule__Feature_Impl__Group__6 )
            // InternalFeatureModel.g:1050:2: rule__Feature_Impl__Group__5__Impl rule__Feature_Impl__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Feature_Impl__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group__5"


    // $ANTLR start "rule__Feature_Impl__Group__5__Impl"
    // InternalFeatureModel.g:1057:1: rule__Feature_Impl__Group__5__Impl : ( ( rule__Feature_Impl__IdAssignment_5 ) ) ;
    public final void rule__Feature_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1061:1: ( ( ( rule__Feature_Impl__IdAssignment_5 ) ) )
            // InternalFeatureModel.g:1062:1: ( ( rule__Feature_Impl__IdAssignment_5 ) )
            {
            // InternalFeatureModel.g:1062:1: ( ( rule__Feature_Impl__IdAssignment_5 ) )
            // InternalFeatureModel.g:1063:2: ( rule__Feature_Impl__IdAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getIdAssignment_5()); 
            }
            // InternalFeatureModel.g:1064:2: ( rule__Feature_Impl__IdAssignment_5 )
            // InternalFeatureModel.g:1064:3: rule__Feature_Impl__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__IdAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getIdAssignment_5()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group__5__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__6"
    // InternalFeatureModel.g:1072:1: rule__Feature_Impl__Group__6 : rule__Feature_Impl__Group__6__Impl ;
    public final void rule__Feature_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1076:1: ( rule__Feature_Impl__Group__6__Impl )
            // InternalFeatureModel.g:1077:2: rule__Feature_Impl__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group__6"


    // $ANTLR start "rule__Feature_Impl__Group__6__Impl"
    // InternalFeatureModel.g:1083:1: rule__Feature_Impl__Group__6__Impl : ( ( rule__Feature_Impl__Group_6__0 )? ) ;
    public final void rule__Feature_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1087:1: ( ( ( rule__Feature_Impl__Group_6__0 )? ) )
            // InternalFeatureModel.g:1088:1: ( ( rule__Feature_Impl__Group_6__0 )? )
            {
            // InternalFeatureModel.g:1088:1: ( ( rule__Feature_Impl__Group_6__0 )? )
            // InternalFeatureModel.g:1089:2: ( rule__Feature_Impl__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getGroup_6()); 
            }
            // InternalFeatureModel.g:1090:2: ( rule__Feature_Impl__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFeatureModel.g:1090:3: rule__Feature_Impl__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature_Impl__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getGroup_6()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group__6__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_0__0"
    // InternalFeatureModel.g:1099:1: rule__Feature_Impl__Group_0__0 : rule__Feature_Impl__Group_0__0__Impl rule__Feature_Impl__Group_0__1 ;
    public final void rule__Feature_Impl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1103:1: ( rule__Feature_Impl__Group_0__0__Impl rule__Feature_Impl__Group_0__1 )
            // InternalFeatureModel.g:1104:2: rule__Feature_Impl__Group_0__0__Impl rule__Feature_Impl__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Feature_Impl__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group_0__0"


    // $ANTLR start "rule__Feature_Impl__Group_0__0__Impl"
    // InternalFeatureModel.g:1111:1: rule__Feature_Impl__Group_0__0__Impl : ( ( 'mandatory' )? ) ;
    public final void rule__Feature_Impl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1115:1: ( ( ( 'mandatory' )? ) )
            // InternalFeatureModel.g:1116:1: ( ( 'mandatory' )? )
            {
            // InternalFeatureModel.g:1116:1: ( ( 'mandatory' )? )
            // InternalFeatureModel.g:1117:2: ( 'mandatory' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getMandatoryKeyword_0_0()); 
            }
            // InternalFeatureModel.g:1118:2: ( 'mandatory' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==27) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureModel.g:1118:3: 'mandatory'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getMandatoryKeyword_0_0()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group_0__0__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_0__1"
    // InternalFeatureModel.g:1126:1: rule__Feature_Impl__Group_0__1 : rule__Feature_Impl__Group_0__1__Impl ;
    public final void rule__Feature_Impl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1130:1: ( rule__Feature_Impl__Group_0__1__Impl )
            // InternalFeatureModel.g:1131:2: rule__Feature_Impl__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group_0__1"


    // $ANTLR start "rule__Feature_Impl__Group_0__1__Impl"
    // InternalFeatureModel.g:1137:1: rule__Feature_Impl__Group_0__1__Impl : ( ( rule__Feature_Impl__MandatoryAssignment_0_1 ) ) ;
    public final void rule__Feature_Impl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1141:1: ( ( ( rule__Feature_Impl__MandatoryAssignment_0_1 ) ) )
            // InternalFeatureModel.g:1142:1: ( ( rule__Feature_Impl__MandatoryAssignment_0_1 ) )
            {
            // InternalFeatureModel.g:1142:1: ( ( rule__Feature_Impl__MandatoryAssignment_0_1 ) )
            // InternalFeatureModel.g:1143:2: ( rule__Feature_Impl__MandatoryAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getMandatoryAssignment_0_1()); 
            }
            // InternalFeatureModel.g:1144:2: ( rule__Feature_Impl__MandatoryAssignment_0_1 )
            // InternalFeatureModel.g:1144:3: rule__Feature_Impl__MandatoryAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__MandatoryAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getMandatoryAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group_0__1__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_1__0"
    // InternalFeatureModel.g:1153:1: rule__Feature_Impl__Group_1__0 : rule__Feature_Impl__Group_1__0__Impl rule__Feature_Impl__Group_1__1 ;
    public final void rule__Feature_Impl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1157:1: ( rule__Feature_Impl__Group_1__0__Impl rule__Feature_Impl__Group_1__1 )
            // InternalFeatureModel.g:1158:2: rule__Feature_Impl__Group_1__0__Impl rule__Feature_Impl__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Feature_Impl__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group_1__0"


    // $ANTLR start "rule__Feature_Impl__Group_1__0__Impl"
    // InternalFeatureModel.g:1165:1: rule__Feature_Impl__Group_1__0__Impl : ( ( 'selected' )? ) ;
    public final void rule__Feature_Impl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1169:1: ( ( ( 'selected' )? ) )
            // InternalFeatureModel.g:1170:1: ( ( 'selected' )? )
            {
            // InternalFeatureModel.g:1170:1: ( ( 'selected' )? )
            // InternalFeatureModel.g:1171:2: ( 'selected' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getSelectedKeyword_1_0()); 
            }
            // InternalFeatureModel.g:1172:2: ( 'selected' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==28) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureModel.g:1172:3: 'selected'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getSelectedKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group_1__0__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_1__1"
    // InternalFeatureModel.g:1180:1: rule__Feature_Impl__Group_1__1 : rule__Feature_Impl__Group_1__1__Impl ;
    public final void rule__Feature_Impl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1184:1: ( rule__Feature_Impl__Group_1__1__Impl )
            // InternalFeatureModel.g:1185:2: rule__Feature_Impl__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group_1__1"


    // $ANTLR start "rule__Feature_Impl__Group_1__1__Impl"
    // InternalFeatureModel.g:1191:1: rule__Feature_Impl__Group_1__1__Impl : ( ( rule__Feature_Impl__SelectedAssignment_1_1 ) ) ;
    public final void rule__Feature_Impl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1195:1: ( ( ( rule__Feature_Impl__SelectedAssignment_1_1 ) ) )
            // InternalFeatureModel.g:1196:1: ( ( rule__Feature_Impl__SelectedAssignment_1_1 ) )
            {
            // InternalFeatureModel.g:1196:1: ( ( rule__Feature_Impl__SelectedAssignment_1_1 ) )
            // InternalFeatureModel.g:1197:2: ( rule__Feature_Impl__SelectedAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getSelectedAssignment_1_1()); 
            }
            // InternalFeatureModel.g:1198:2: ( rule__Feature_Impl__SelectedAssignment_1_1 )
            // InternalFeatureModel.g:1198:3: rule__Feature_Impl__SelectedAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__SelectedAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getSelectedAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group_1__1__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_6__0"
    // InternalFeatureModel.g:1207:1: rule__Feature_Impl__Group_6__0 : rule__Feature_Impl__Group_6__0__Impl rule__Feature_Impl__Group_6__1 ;
    public final void rule__Feature_Impl__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1211:1: ( rule__Feature_Impl__Group_6__0__Impl rule__Feature_Impl__Group_6__1 )
            // InternalFeatureModel.g:1212:2: rule__Feature_Impl__Group_6__0__Impl rule__Feature_Impl__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Feature_Impl__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group_6__0"


    // $ANTLR start "rule__Feature_Impl__Group_6__0__Impl"
    // InternalFeatureModel.g:1219:1: rule__Feature_Impl__Group_6__0__Impl : ( 'children' ) ;
    public final void rule__Feature_Impl__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1223:1: ( ( 'children' ) )
            // InternalFeatureModel.g:1224:1: ( 'children' )
            {
            // InternalFeatureModel.g:1224:1: ( 'children' )
            // InternalFeatureModel.g:1225:2: 'children'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getChildrenKeyword_6_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getChildrenKeyword_6_0()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group_6__0__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_6__1"
    // InternalFeatureModel.g:1234:1: rule__Feature_Impl__Group_6__1 : rule__Feature_Impl__Group_6__1__Impl rule__Feature_Impl__Group_6__2 ;
    public final void rule__Feature_Impl__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1238:1: ( rule__Feature_Impl__Group_6__1__Impl rule__Feature_Impl__Group_6__2 )
            // InternalFeatureModel.g:1239:2: rule__Feature_Impl__Group_6__1__Impl rule__Feature_Impl__Group_6__2
            {
            pushFollow(FOLLOW_8);
            rule__Feature_Impl__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group_6__1"


    // $ANTLR start "rule__Feature_Impl__Group_6__1__Impl"
    // InternalFeatureModel.g:1246:1: rule__Feature_Impl__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Feature_Impl__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1250:1: ( ( '{' ) )
            // InternalFeatureModel.g:1251:1: ( '{' )
            {
            // InternalFeatureModel.g:1251:1: ( '{' )
            // InternalFeatureModel.g:1252:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_6_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_6_1()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group_6__1__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_6__2"
    // InternalFeatureModel.g:1261:1: rule__Feature_Impl__Group_6__2 : rule__Feature_Impl__Group_6__2__Impl rule__Feature_Impl__Group_6__3 ;
    public final void rule__Feature_Impl__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1265:1: ( rule__Feature_Impl__Group_6__2__Impl rule__Feature_Impl__Group_6__3 )
            // InternalFeatureModel.g:1266:2: rule__Feature_Impl__Group_6__2__Impl rule__Feature_Impl__Group_6__3
            {
            pushFollow(FOLLOW_18);
            rule__Feature_Impl__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group_6__2"


    // $ANTLR start "rule__Feature_Impl__Group_6__2__Impl"
    // InternalFeatureModel.g:1273:1: rule__Feature_Impl__Group_6__2__Impl : ( ( rule__Feature_Impl__ChildrenAssignment_6_2 ) ) ;
    public final void rule__Feature_Impl__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1277:1: ( ( ( rule__Feature_Impl__ChildrenAssignment_6_2 ) ) )
            // InternalFeatureModel.g:1278:1: ( ( rule__Feature_Impl__ChildrenAssignment_6_2 ) )
            {
            // InternalFeatureModel.g:1278:1: ( ( rule__Feature_Impl__ChildrenAssignment_6_2 ) )
            // InternalFeatureModel.g:1279:2: ( rule__Feature_Impl__ChildrenAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getChildrenAssignment_6_2()); 
            }
            // InternalFeatureModel.g:1280:2: ( rule__Feature_Impl__ChildrenAssignment_6_2 )
            // InternalFeatureModel.g:1280:3: rule__Feature_Impl__ChildrenAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__ChildrenAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getChildrenAssignment_6_2()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group_6__2__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_6__3"
    // InternalFeatureModel.g:1288:1: rule__Feature_Impl__Group_6__3 : rule__Feature_Impl__Group_6__3__Impl rule__Feature_Impl__Group_6__4 ;
    public final void rule__Feature_Impl__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1292:1: ( rule__Feature_Impl__Group_6__3__Impl rule__Feature_Impl__Group_6__4 )
            // InternalFeatureModel.g:1293:2: rule__Feature_Impl__Group_6__3__Impl rule__Feature_Impl__Group_6__4
            {
            pushFollow(FOLLOW_18);
            rule__Feature_Impl__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_6__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group_6__3"


    // $ANTLR start "rule__Feature_Impl__Group_6__3__Impl"
    // InternalFeatureModel.g:1300:1: rule__Feature_Impl__Group_6__3__Impl : ( ( rule__Feature_Impl__Group_6_3__0 )* ) ;
    public final void rule__Feature_Impl__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1304:1: ( ( ( rule__Feature_Impl__Group_6_3__0 )* ) )
            // InternalFeatureModel.g:1305:1: ( ( rule__Feature_Impl__Group_6_3__0 )* )
            {
            // InternalFeatureModel.g:1305:1: ( ( rule__Feature_Impl__Group_6_3__0 )* )
            // InternalFeatureModel.g:1306:2: ( rule__Feature_Impl__Group_6_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getGroup_6_3()); 
            }
            // InternalFeatureModel.g:1307:2: ( rule__Feature_Impl__Group_6_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==30) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFeatureModel.g:1307:3: rule__Feature_Impl__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Feature_Impl__Group_6_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getGroup_6_3()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group_6__3__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_6__4"
    // InternalFeatureModel.g:1315:1: rule__Feature_Impl__Group_6__4 : rule__Feature_Impl__Group_6__4__Impl ;
    public final void rule__Feature_Impl__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1319:1: ( rule__Feature_Impl__Group_6__4__Impl )
            // InternalFeatureModel.g:1320:2: rule__Feature_Impl__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group_6__4"


    // $ANTLR start "rule__Feature_Impl__Group_6__4__Impl"
    // InternalFeatureModel.g:1326:1: rule__Feature_Impl__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Feature_Impl__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1330:1: ( ( '}' ) )
            // InternalFeatureModel.g:1331:1: ( '}' )
            {
            // InternalFeatureModel.g:1331:1: ( '}' )
            // InternalFeatureModel.g:1332:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_6_4()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_6_4()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group_6__4__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_6_3__0"
    // InternalFeatureModel.g:1342:1: rule__Feature_Impl__Group_6_3__0 : rule__Feature_Impl__Group_6_3__0__Impl rule__Feature_Impl__Group_6_3__1 ;
    public final void rule__Feature_Impl__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1346:1: ( rule__Feature_Impl__Group_6_3__0__Impl rule__Feature_Impl__Group_6_3__1 )
            // InternalFeatureModel.g:1347:2: rule__Feature_Impl__Group_6_3__0__Impl rule__Feature_Impl__Group_6_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Feature_Impl__Group_6_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_6_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group_6_3__0"


    // $ANTLR start "rule__Feature_Impl__Group_6_3__0__Impl"
    // InternalFeatureModel.g:1354:1: rule__Feature_Impl__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Feature_Impl__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1358:1: ( ( ',' ) )
            // InternalFeatureModel.g:1359:1: ( ',' )
            {
            // InternalFeatureModel.g:1359:1: ( ',' )
            // InternalFeatureModel.g:1360:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getCommaKeyword_6_3_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getCommaKeyword_6_3_0()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group_6_3__0__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_6_3__1"
    // InternalFeatureModel.g:1369:1: rule__Feature_Impl__Group_6_3__1 : rule__Feature_Impl__Group_6_3__1__Impl ;
    public final void rule__Feature_Impl__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1373:1: ( rule__Feature_Impl__Group_6_3__1__Impl )
            // InternalFeatureModel.g:1374:2: rule__Feature_Impl__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_6_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Feature_Impl__Group_6_3__1"


    // $ANTLR start "rule__Feature_Impl__Group_6_3__1__Impl"
    // InternalFeatureModel.g:1380:1: rule__Feature_Impl__Group_6_3__1__Impl : ( ( rule__Feature_Impl__ChildrenAssignment_6_3_1 ) ) ;
    public final void rule__Feature_Impl__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1384:1: ( ( ( rule__Feature_Impl__ChildrenAssignment_6_3_1 ) ) )
            // InternalFeatureModel.g:1385:1: ( ( rule__Feature_Impl__ChildrenAssignment_6_3_1 ) )
            {
            // InternalFeatureModel.g:1385:1: ( ( rule__Feature_Impl__ChildrenAssignment_6_3_1 ) )
            // InternalFeatureModel.g:1386:2: ( rule__Feature_Impl__ChildrenAssignment_6_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getChildrenAssignment_6_3_1()); 
            }
            // InternalFeatureModel.g:1387:2: ( rule__Feature_Impl__ChildrenAssignment_6_3_1 )
            // InternalFeatureModel.g:1387:3: rule__Feature_Impl__ChildrenAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__ChildrenAssignment_6_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getChildrenAssignment_6_3_1()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__Group_6_3__1__Impl"


    // $ANTLR start "rule__Alternative__Group__0"
    // InternalFeatureModel.g:1396:1: rule__Alternative__Group__0 : rule__Alternative__Group__0__Impl rule__Alternative__Group__1 ;
    public final void rule__Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1400:1: ( rule__Alternative__Group__0__Impl rule__Alternative__Group__1 )
            // InternalFeatureModel.g:1401:2: rule__Alternative__Group__0__Impl rule__Alternative__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__Alternative__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group__0"


    // $ANTLR start "rule__Alternative__Group__0__Impl"
    // InternalFeatureModel.g:1408:1: rule__Alternative__Group__0__Impl : ( ( rule__Alternative__Group_0__0 )? ) ;
    public final void rule__Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1412:1: ( ( ( rule__Alternative__Group_0__0 )? ) )
            // InternalFeatureModel.g:1413:1: ( ( rule__Alternative__Group_0__0 )? )
            {
            // InternalFeatureModel.g:1413:1: ( ( rule__Alternative__Group_0__0 )? )
            // InternalFeatureModel.g:1414:2: ( rule__Alternative__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getGroup_0()); 
            }
            // InternalFeatureModel.g:1415:2: ( rule__Alternative__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==27) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureModel.g:1415:3: rule__Alternative__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alternative__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getGroup_0()); 
            }

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
    // $ANTLR end "rule__Alternative__Group__0__Impl"


    // $ANTLR start "rule__Alternative__Group__1"
    // InternalFeatureModel.g:1423:1: rule__Alternative__Group__1 : rule__Alternative__Group__1__Impl rule__Alternative__Group__2 ;
    public final void rule__Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1427:1: ( rule__Alternative__Group__1__Impl rule__Alternative__Group__2 )
            // InternalFeatureModel.g:1428:2: rule__Alternative__Group__1__Impl rule__Alternative__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__Alternative__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group__1"


    // $ANTLR start "rule__Alternative__Group__1__Impl"
    // InternalFeatureModel.g:1435:1: rule__Alternative__Group__1__Impl : ( ( rule__Alternative__Group_1__0 )? ) ;
    public final void rule__Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1439:1: ( ( ( rule__Alternative__Group_1__0 )? ) )
            // InternalFeatureModel.g:1440:1: ( ( rule__Alternative__Group_1__0 )? )
            {
            // InternalFeatureModel.g:1440:1: ( ( rule__Alternative__Group_1__0 )? )
            // InternalFeatureModel.g:1441:2: ( rule__Alternative__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getGroup_1()); 
            }
            // InternalFeatureModel.g:1442:2: ( rule__Alternative__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFeatureModel.g:1442:3: rule__Alternative__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alternative__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__Alternative__Group__1__Impl"


    // $ANTLR start "rule__Alternative__Group__2"
    // InternalFeatureModel.g:1450:1: rule__Alternative__Group__2 : rule__Alternative__Group__2__Impl rule__Alternative__Group__3 ;
    public final void rule__Alternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1454:1: ( rule__Alternative__Group__2__Impl rule__Alternative__Group__3 )
            // InternalFeatureModel.g:1455:2: rule__Alternative__Group__2__Impl rule__Alternative__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Alternative__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group__2"


    // $ANTLR start "rule__Alternative__Group__2__Impl"
    // InternalFeatureModel.g:1462:1: rule__Alternative__Group__2__Impl : ( 'Alternative' ) ;
    public final void rule__Alternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1466:1: ( ( 'Alternative' ) )
            // InternalFeatureModel.g:1467:1: ( 'Alternative' )
            {
            // InternalFeatureModel.g:1467:1: ( 'Alternative' )
            // InternalFeatureModel.g:1468:2: 'Alternative'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getAlternativeKeyword_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getAlternativeKeyword_2()); 
            }

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
    // $ANTLR end "rule__Alternative__Group__2__Impl"


    // $ANTLR start "rule__Alternative__Group__3"
    // InternalFeatureModel.g:1477:1: rule__Alternative__Group__3 : rule__Alternative__Group__3__Impl rule__Alternative__Group__4 ;
    public final void rule__Alternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1481:1: ( rule__Alternative__Group__3__Impl rule__Alternative__Group__4 )
            // InternalFeatureModel.g:1482:2: rule__Alternative__Group__3__Impl rule__Alternative__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Alternative__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group__3"


    // $ANTLR start "rule__Alternative__Group__3__Impl"
    // InternalFeatureModel.g:1489:1: rule__Alternative__Group__3__Impl : ( ( rule__Alternative__NameAssignment_3 ) ) ;
    public final void rule__Alternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1493:1: ( ( ( rule__Alternative__NameAssignment_3 ) ) )
            // InternalFeatureModel.g:1494:1: ( ( rule__Alternative__NameAssignment_3 ) )
            {
            // InternalFeatureModel.g:1494:1: ( ( rule__Alternative__NameAssignment_3 ) )
            // InternalFeatureModel.g:1495:2: ( rule__Alternative__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getNameAssignment_3()); 
            }
            // InternalFeatureModel.g:1496:2: ( rule__Alternative__NameAssignment_3 )
            // InternalFeatureModel.g:1496:3: rule__Alternative__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getNameAssignment_3()); 
            }

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
    // $ANTLR end "rule__Alternative__Group__3__Impl"


    // $ANTLR start "rule__Alternative__Group__4"
    // InternalFeatureModel.g:1504:1: rule__Alternative__Group__4 : rule__Alternative__Group__4__Impl rule__Alternative__Group__5 ;
    public final void rule__Alternative__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1508:1: ( rule__Alternative__Group__4__Impl rule__Alternative__Group__5 )
            // InternalFeatureModel.g:1509:2: rule__Alternative__Group__4__Impl rule__Alternative__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Alternative__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group__4"


    // $ANTLR start "rule__Alternative__Group__4__Impl"
    // InternalFeatureModel.g:1516:1: rule__Alternative__Group__4__Impl : ( 'id' ) ;
    public final void rule__Alternative__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1520:1: ( ( 'id' ) )
            // InternalFeatureModel.g:1521:1: ( 'id' )
            {
            // InternalFeatureModel.g:1521:1: ( 'id' )
            // InternalFeatureModel.g:1522:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getIdKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getIdKeyword_4()); 
            }

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
    // $ANTLR end "rule__Alternative__Group__4__Impl"


    // $ANTLR start "rule__Alternative__Group__5"
    // InternalFeatureModel.g:1531:1: rule__Alternative__Group__5 : rule__Alternative__Group__5__Impl rule__Alternative__Group__6 ;
    public final void rule__Alternative__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1535:1: ( rule__Alternative__Group__5__Impl rule__Alternative__Group__6 )
            // InternalFeatureModel.g:1536:2: rule__Alternative__Group__5__Impl rule__Alternative__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Alternative__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group__5"


    // $ANTLR start "rule__Alternative__Group__5__Impl"
    // InternalFeatureModel.g:1543:1: rule__Alternative__Group__5__Impl : ( ( rule__Alternative__IdAssignment_5 ) ) ;
    public final void rule__Alternative__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1547:1: ( ( ( rule__Alternative__IdAssignment_5 ) ) )
            // InternalFeatureModel.g:1548:1: ( ( rule__Alternative__IdAssignment_5 ) )
            {
            // InternalFeatureModel.g:1548:1: ( ( rule__Alternative__IdAssignment_5 ) )
            // InternalFeatureModel.g:1549:2: ( rule__Alternative__IdAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getIdAssignment_5()); 
            }
            // InternalFeatureModel.g:1550:2: ( rule__Alternative__IdAssignment_5 )
            // InternalFeatureModel.g:1550:3: rule__Alternative__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__IdAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getIdAssignment_5()); 
            }

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
    // $ANTLR end "rule__Alternative__Group__5__Impl"


    // $ANTLR start "rule__Alternative__Group__6"
    // InternalFeatureModel.g:1558:1: rule__Alternative__Group__6 : rule__Alternative__Group__6__Impl ;
    public final void rule__Alternative__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1562:1: ( rule__Alternative__Group__6__Impl )
            // InternalFeatureModel.g:1563:2: rule__Alternative__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group__6"


    // $ANTLR start "rule__Alternative__Group__6__Impl"
    // InternalFeatureModel.g:1569:1: rule__Alternative__Group__6__Impl : ( ( rule__Alternative__Group_6__0 )? ) ;
    public final void rule__Alternative__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1573:1: ( ( ( rule__Alternative__Group_6__0 )? ) )
            // InternalFeatureModel.g:1574:1: ( ( rule__Alternative__Group_6__0 )? )
            {
            // InternalFeatureModel.g:1574:1: ( ( rule__Alternative__Group_6__0 )? )
            // InternalFeatureModel.g:1575:2: ( rule__Alternative__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getGroup_6()); 
            }
            // InternalFeatureModel.g:1576:2: ( rule__Alternative__Group_6__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureModel.g:1576:3: rule__Alternative__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alternative__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getGroup_6()); 
            }

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
    // $ANTLR end "rule__Alternative__Group__6__Impl"


    // $ANTLR start "rule__Alternative__Group_0__0"
    // InternalFeatureModel.g:1585:1: rule__Alternative__Group_0__0 : rule__Alternative__Group_0__0__Impl rule__Alternative__Group_0__1 ;
    public final void rule__Alternative__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1589:1: ( rule__Alternative__Group_0__0__Impl rule__Alternative__Group_0__1 )
            // InternalFeatureModel.g:1590:2: rule__Alternative__Group_0__0__Impl rule__Alternative__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Alternative__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group_0__0"


    // $ANTLR start "rule__Alternative__Group_0__0__Impl"
    // InternalFeatureModel.g:1597:1: rule__Alternative__Group_0__0__Impl : ( ( 'mandatory' )? ) ;
    public final void rule__Alternative__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1601:1: ( ( ( 'mandatory' )? ) )
            // InternalFeatureModel.g:1602:1: ( ( 'mandatory' )? )
            {
            // InternalFeatureModel.g:1602:1: ( ( 'mandatory' )? )
            // InternalFeatureModel.g:1603:2: ( 'mandatory' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getMandatoryKeyword_0_0()); 
            }
            // InternalFeatureModel.g:1604:2: ( 'mandatory' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==27) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalFeatureModel.g:1604:3: 'mandatory'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getMandatoryKeyword_0_0()); 
            }

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
    // $ANTLR end "rule__Alternative__Group_0__0__Impl"


    // $ANTLR start "rule__Alternative__Group_0__1"
    // InternalFeatureModel.g:1612:1: rule__Alternative__Group_0__1 : rule__Alternative__Group_0__1__Impl ;
    public final void rule__Alternative__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1616:1: ( rule__Alternative__Group_0__1__Impl )
            // InternalFeatureModel.g:1617:2: rule__Alternative__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group_0__1"


    // $ANTLR start "rule__Alternative__Group_0__1__Impl"
    // InternalFeatureModel.g:1623:1: rule__Alternative__Group_0__1__Impl : ( ( rule__Alternative__MandatoryAssignment_0_1 ) ) ;
    public final void rule__Alternative__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1627:1: ( ( ( rule__Alternative__MandatoryAssignment_0_1 ) ) )
            // InternalFeatureModel.g:1628:1: ( ( rule__Alternative__MandatoryAssignment_0_1 ) )
            {
            // InternalFeatureModel.g:1628:1: ( ( rule__Alternative__MandatoryAssignment_0_1 ) )
            // InternalFeatureModel.g:1629:2: ( rule__Alternative__MandatoryAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getMandatoryAssignment_0_1()); 
            }
            // InternalFeatureModel.g:1630:2: ( rule__Alternative__MandatoryAssignment_0_1 )
            // InternalFeatureModel.g:1630:3: rule__Alternative__MandatoryAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__MandatoryAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getMandatoryAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__Alternative__Group_0__1__Impl"


    // $ANTLR start "rule__Alternative__Group_1__0"
    // InternalFeatureModel.g:1639:1: rule__Alternative__Group_1__0 : rule__Alternative__Group_1__0__Impl rule__Alternative__Group_1__1 ;
    public final void rule__Alternative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1643:1: ( rule__Alternative__Group_1__0__Impl rule__Alternative__Group_1__1 )
            // InternalFeatureModel.g:1644:2: rule__Alternative__Group_1__0__Impl rule__Alternative__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Alternative__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group_1__0"


    // $ANTLR start "rule__Alternative__Group_1__0__Impl"
    // InternalFeatureModel.g:1651:1: rule__Alternative__Group_1__0__Impl : ( ( 'selected' )? ) ;
    public final void rule__Alternative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1655:1: ( ( ( 'selected' )? ) )
            // InternalFeatureModel.g:1656:1: ( ( 'selected' )? )
            {
            // InternalFeatureModel.g:1656:1: ( ( 'selected' )? )
            // InternalFeatureModel.g:1657:2: ( 'selected' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getSelectedKeyword_1_0()); 
            }
            // InternalFeatureModel.g:1658:2: ( 'selected' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==28) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalFeatureModel.g:1658:3: 'selected'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getSelectedKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__Alternative__Group_1__0__Impl"


    // $ANTLR start "rule__Alternative__Group_1__1"
    // InternalFeatureModel.g:1666:1: rule__Alternative__Group_1__1 : rule__Alternative__Group_1__1__Impl ;
    public final void rule__Alternative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1670:1: ( rule__Alternative__Group_1__1__Impl )
            // InternalFeatureModel.g:1671:2: rule__Alternative__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group_1__1"


    // $ANTLR start "rule__Alternative__Group_1__1__Impl"
    // InternalFeatureModel.g:1677:1: rule__Alternative__Group_1__1__Impl : ( ( rule__Alternative__SelectedAssignment_1_1 ) ) ;
    public final void rule__Alternative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1681:1: ( ( ( rule__Alternative__SelectedAssignment_1_1 ) ) )
            // InternalFeatureModel.g:1682:1: ( ( rule__Alternative__SelectedAssignment_1_1 ) )
            {
            // InternalFeatureModel.g:1682:1: ( ( rule__Alternative__SelectedAssignment_1_1 ) )
            // InternalFeatureModel.g:1683:2: ( rule__Alternative__SelectedAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getSelectedAssignment_1_1()); 
            }
            // InternalFeatureModel.g:1684:2: ( rule__Alternative__SelectedAssignment_1_1 )
            // InternalFeatureModel.g:1684:3: rule__Alternative__SelectedAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__SelectedAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getSelectedAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__Alternative__Group_1__1__Impl"


    // $ANTLR start "rule__Alternative__Group_6__0"
    // InternalFeatureModel.g:1693:1: rule__Alternative__Group_6__0 : rule__Alternative__Group_6__0__Impl rule__Alternative__Group_6__1 ;
    public final void rule__Alternative__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1697:1: ( rule__Alternative__Group_6__0__Impl rule__Alternative__Group_6__1 )
            // InternalFeatureModel.g:1698:2: rule__Alternative__Group_6__0__Impl rule__Alternative__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__Alternative__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group_6__0"


    // $ANTLR start "rule__Alternative__Group_6__0__Impl"
    // InternalFeatureModel.g:1705:1: rule__Alternative__Group_6__0__Impl : ( 'children' ) ;
    public final void rule__Alternative__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1709:1: ( ( 'children' ) )
            // InternalFeatureModel.g:1710:1: ( 'children' )
            {
            // InternalFeatureModel.g:1710:1: ( 'children' )
            // InternalFeatureModel.g:1711:2: 'children'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getChildrenKeyword_6_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getChildrenKeyword_6_0()); 
            }

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
    // $ANTLR end "rule__Alternative__Group_6__0__Impl"


    // $ANTLR start "rule__Alternative__Group_6__1"
    // InternalFeatureModel.g:1720:1: rule__Alternative__Group_6__1 : rule__Alternative__Group_6__1__Impl rule__Alternative__Group_6__2 ;
    public final void rule__Alternative__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1724:1: ( rule__Alternative__Group_6__1__Impl rule__Alternative__Group_6__2 )
            // InternalFeatureModel.g:1725:2: rule__Alternative__Group_6__1__Impl rule__Alternative__Group_6__2
            {
            pushFollow(FOLLOW_8);
            rule__Alternative__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group_6__1"


    // $ANTLR start "rule__Alternative__Group_6__1__Impl"
    // InternalFeatureModel.g:1732:1: rule__Alternative__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Alternative__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1736:1: ( ( '{' ) )
            // InternalFeatureModel.g:1737:1: ( '{' )
            {
            // InternalFeatureModel.g:1737:1: ( '{' )
            // InternalFeatureModel.g:1738:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_6_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_6_1()); 
            }

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
    // $ANTLR end "rule__Alternative__Group_6__1__Impl"


    // $ANTLR start "rule__Alternative__Group_6__2"
    // InternalFeatureModel.g:1747:1: rule__Alternative__Group_6__2 : rule__Alternative__Group_6__2__Impl rule__Alternative__Group_6__3 ;
    public final void rule__Alternative__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1751:1: ( rule__Alternative__Group_6__2__Impl rule__Alternative__Group_6__3 )
            // InternalFeatureModel.g:1752:2: rule__Alternative__Group_6__2__Impl rule__Alternative__Group_6__3
            {
            pushFollow(FOLLOW_18);
            rule__Alternative__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group_6__2"


    // $ANTLR start "rule__Alternative__Group_6__2__Impl"
    // InternalFeatureModel.g:1759:1: rule__Alternative__Group_6__2__Impl : ( ( rule__Alternative__ChildrenAssignment_6_2 ) ) ;
    public final void rule__Alternative__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1763:1: ( ( ( rule__Alternative__ChildrenAssignment_6_2 ) ) )
            // InternalFeatureModel.g:1764:1: ( ( rule__Alternative__ChildrenAssignment_6_2 ) )
            {
            // InternalFeatureModel.g:1764:1: ( ( rule__Alternative__ChildrenAssignment_6_2 ) )
            // InternalFeatureModel.g:1765:2: ( rule__Alternative__ChildrenAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getChildrenAssignment_6_2()); 
            }
            // InternalFeatureModel.g:1766:2: ( rule__Alternative__ChildrenAssignment_6_2 )
            // InternalFeatureModel.g:1766:3: rule__Alternative__ChildrenAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__ChildrenAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getChildrenAssignment_6_2()); 
            }

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
    // $ANTLR end "rule__Alternative__Group_6__2__Impl"


    // $ANTLR start "rule__Alternative__Group_6__3"
    // InternalFeatureModel.g:1774:1: rule__Alternative__Group_6__3 : rule__Alternative__Group_6__3__Impl rule__Alternative__Group_6__4 ;
    public final void rule__Alternative__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1778:1: ( rule__Alternative__Group_6__3__Impl rule__Alternative__Group_6__4 )
            // InternalFeatureModel.g:1779:2: rule__Alternative__Group_6__3__Impl rule__Alternative__Group_6__4
            {
            pushFollow(FOLLOW_18);
            rule__Alternative__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_6__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group_6__3"


    // $ANTLR start "rule__Alternative__Group_6__3__Impl"
    // InternalFeatureModel.g:1786:1: rule__Alternative__Group_6__3__Impl : ( ( rule__Alternative__Group_6_3__0 )* ) ;
    public final void rule__Alternative__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1790:1: ( ( ( rule__Alternative__Group_6_3__0 )* ) )
            // InternalFeatureModel.g:1791:1: ( ( rule__Alternative__Group_6_3__0 )* )
            {
            // InternalFeatureModel.g:1791:1: ( ( rule__Alternative__Group_6_3__0 )* )
            // InternalFeatureModel.g:1792:2: ( rule__Alternative__Group_6_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getGroup_6_3()); 
            }
            // InternalFeatureModel.g:1793:2: ( rule__Alternative__Group_6_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==30) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFeatureModel.g:1793:3: rule__Alternative__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Alternative__Group_6_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getGroup_6_3()); 
            }

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
    // $ANTLR end "rule__Alternative__Group_6__3__Impl"


    // $ANTLR start "rule__Alternative__Group_6__4"
    // InternalFeatureModel.g:1801:1: rule__Alternative__Group_6__4 : rule__Alternative__Group_6__4__Impl ;
    public final void rule__Alternative__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1805:1: ( rule__Alternative__Group_6__4__Impl )
            // InternalFeatureModel.g:1806:2: rule__Alternative__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group_6__4"


    // $ANTLR start "rule__Alternative__Group_6__4__Impl"
    // InternalFeatureModel.g:1812:1: rule__Alternative__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Alternative__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1816:1: ( ( '}' ) )
            // InternalFeatureModel.g:1817:1: ( '}' )
            {
            // InternalFeatureModel.g:1817:1: ( '}' )
            // InternalFeatureModel.g:1818:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_6_4()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_6_4()); 
            }

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
    // $ANTLR end "rule__Alternative__Group_6__4__Impl"


    // $ANTLR start "rule__Alternative__Group_6_3__0"
    // InternalFeatureModel.g:1828:1: rule__Alternative__Group_6_3__0 : rule__Alternative__Group_6_3__0__Impl rule__Alternative__Group_6_3__1 ;
    public final void rule__Alternative__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1832:1: ( rule__Alternative__Group_6_3__0__Impl rule__Alternative__Group_6_3__1 )
            // InternalFeatureModel.g:1833:2: rule__Alternative__Group_6_3__0__Impl rule__Alternative__Group_6_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Alternative__Group_6_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_6_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group_6_3__0"


    // $ANTLR start "rule__Alternative__Group_6_3__0__Impl"
    // InternalFeatureModel.g:1840:1: rule__Alternative__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Alternative__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1844:1: ( ( ',' ) )
            // InternalFeatureModel.g:1845:1: ( ',' )
            {
            // InternalFeatureModel.g:1845:1: ( ',' )
            // InternalFeatureModel.g:1846:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getCommaKeyword_6_3_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getCommaKeyword_6_3_0()); 
            }

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
    // $ANTLR end "rule__Alternative__Group_6_3__0__Impl"


    // $ANTLR start "rule__Alternative__Group_6_3__1"
    // InternalFeatureModel.g:1855:1: rule__Alternative__Group_6_3__1 : rule__Alternative__Group_6_3__1__Impl ;
    public final void rule__Alternative__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1859:1: ( rule__Alternative__Group_6_3__1__Impl )
            // InternalFeatureModel.g:1860:2: rule__Alternative__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_6_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__Alternative__Group_6_3__1"


    // $ANTLR start "rule__Alternative__Group_6_3__1__Impl"
    // InternalFeatureModel.g:1866:1: rule__Alternative__Group_6_3__1__Impl : ( ( rule__Alternative__ChildrenAssignment_6_3_1 ) ) ;
    public final void rule__Alternative__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1870:1: ( ( ( rule__Alternative__ChildrenAssignment_6_3_1 ) ) )
            // InternalFeatureModel.g:1871:1: ( ( rule__Alternative__ChildrenAssignment_6_3_1 ) )
            {
            // InternalFeatureModel.g:1871:1: ( ( rule__Alternative__ChildrenAssignment_6_3_1 ) )
            // InternalFeatureModel.g:1872:2: ( rule__Alternative__ChildrenAssignment_6_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getChildrenAssignment_6_3_1()); 
            }
            // InternalFeatureModel.g:1873:2: ( rule__Alternative__ChildrenAssignment_6_3_1 )
            // InternalFeatureModel.g:1873:3: rule__Alternative__ChildrenAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__ChildrenAssignment_6_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getChildrenAssignment_6_3_1()); 
            }

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
    // $ANTLR end "rule__Alternative__Group_6_3__1__Impl"


    // $ANTLR start "rule__OrGroup__Group__0"
    // InternalFeatureModel.g:1882:1: rule__OrGroup__Group__0 : rule__OrGroup__Group__0__Impl rule__OrGroup__Group__1 ;
    public final void rule__OrGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1886:1: ( rule__OrGroup__Group__0__Impl rule__OrGroup__Group__1 )
            // InternalFeatureModel.g:1887:2: rule__OrGroup__Group__0__Impl rule__OrGroup__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__OrGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group__0"


    // $ANTLR start "rule__OrGroup__Group__0__Impl"
    // InternalFeatureModel.g:1894:1: rule__OrGroup__Group__0__Impl : ( ( rule__OrGroup__Group_0__0 )? ) ;
    public final void rule__OrGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1898:1: ( ( ( rule__OrGroup__Group_0__0 )? ) )
            // InternalFeatureModel.g:1899:1: ( ( rule__OrGroup__Group_0__0 )? )
            {
            // InternalFeatureModel.g:1899:1: ( ( rule__OrGroup__Group_0__0 )? )
            // InternalFeatureModel.g:1900:2: ( rule__OrGroup__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getGroup_0()); 
            }
            // InternalFeatureModel.g:1901:2: ( rule__OrGroup__Group_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==27) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFeatureModel.g:1901:3: rule__OrGroup__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrGroup__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getGroup_0()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group__0__Impl"


    // $ANTLR start "rule__OrGroup__Group__1"
    // InternalFeatureModel.g:1909:1: rule__OrGroup__Group__1 : rule__OrGroup__Group__1__Impl rule__OrGroup__Group__2 ;
    public final void rule__OrGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1913:1: ( rule__OrGroup__Group__1__Impl rule__OrGroup__Group__2 )
            // InternalFeatureModel.g:1914:2: rule__OrGroup__Group__1__Impl rule__OrGroup__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__OrGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group__1"


    // $ANTLR start "rule__OrGroup__Group__1__Impl"
    // InternalFeatureModel.g:1921:1: rule__OrGroup__Group__1__Impl : ( ( rule__OrGroup__Group_1__0 )? ) ;
    public final void rule__OrGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1925:1: ( ( ( rule__OrGroup__Group_1__0 )? ) )
            // InternalFeatureModel.g:1926:1: ( ( rule__OrGroup__Group_1__0 )? )
            {
            // InternalFeatureModel.g:1926:1: ( ( rule__OrGroup__Group_1__0 )? )
            // InternalFeatureModel.g:1927:2: ( rule__OrGroup__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getGroup_1()); 
            }
            // InternalFeatureModel.g:1928:2: ( rule__OrGroup__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFeatureModel.g:1928:3: rule__OrGroup__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrGroup__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getGroup_1()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group__1__Impl"


    // $ANTLR start "rule__OrGroup__Group__2"
    // InternalFeatureModel.g:1936:1: rule__OrGroup__Group__2 : rule__OrGroup__Group__2__Impl rule__OrGroup__Group__3 ;
    public final void rule__OrGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1940:1: ( rule__OrGroup__Group__2__Impl rule__OrGroup__Group__3 )
            // InternalFeatureModel.g:1941:2: rule__OrGroup__Group__2__Impl rule__OrGroup__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__OrGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group__2"


    // $ANTLR start "rule__OrGroup__Group__2__Impl"
    // InternalFeatureModel.g:1948:1: rule__OrGroup__Group__2__Impl : ( 'OrGroup' ) ;
    public final void rule__OrGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1952:1: ( ( 'OrGroup' ) )
            // InternalFeatureModel.g:1953:1: ( 'OrGroup' )
            {
            // InternalFeatureModel.g:1953:1: ( 'OrGroup' )
            // InternalFeatureModel.g:1954:2: 'OrGroup'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getOrGroupKeyword_2()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getOrGroupKeyword_2()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group__2__Impl"


    // $ANTLR start "rule__OrGroup__Group__3"
    // InternalFeatureModel.g:1963:1: rule__OrGroup__Group__3 : rule__OrGroup__Group__3__Impl rule__OrGroup__Group__4 ;
    public final void rule__OrGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1967:1: ( rule__OrGroup__Group__3__Impl rule__OrGroup__Group__4 )
            // InternalFeatureModel.g:1968:2: rule__OrGroup__Group__3__Impl rule__OrGroup__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__OrGroup__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group__3"


    // $ANTLR start "rule__OrGroup__Group__3__Impl"
    // InternalFeatureModel.g:1975:1: rule__OrGroup__Group__3__Impl : ( ( rule__OrGroup__NameAssignment_3 ) ) ;
    public final void rule__OrGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1979:1: ( ( ( rule__OrGroup__NameAssignment_3 ) ) )
            // InternalFeatureModel.g:1980:1: ( ( rule__OrGroup__NameAssignment_3 ) )
            {
            // InternalFeatureModel.g:1980:1: ( ( rule__OrGroup__NameAssignment_3 ) )
            // InternalFeatureModel.g:1981:2: ( rule__OrGroup__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getNameAssignment_3()); 
            }
            // InternalFeatureModel.g:1982:2: ( rule__OrGroup__NameAssignment_3 )
            // InternalFeatureModel.g:1982:3: rule__OrGroup__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getNameAssignment_3()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group__3__Impl"


    // $ANTLR start "rule__OrGroup__Group__4"
    // InternalFeatureModel.g:1990:1: rule__OrGroup__Group__4 : rule__OrGroup__Group__4__Impl rule__OrGroup__Group__5 ;
    public final void rule__OrGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1994:1: ( rule__OrGroup__Group__4__Impl rule__OrGroup__Group__5 )
            // InternalFeatureModel.g:1995:2: rule__OrGroup__Group__4__Impl rule__OrGroup__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__OrGroup__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__5();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group__4"


    // $ANTLR start "rule__OrGroup__Group__4__Impl"
    // InternalFeatureModel.g:2002:1: rule__OrGroup__Group__4__Impl : ( 'id' ) ;
    public final void rule__OrGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2006:1: ( ( 'id' ) )
            // InternalFeatureModel.g:2007:1: ( 'id' )
            {
            // InternalFeatureModel.g:2007:1: ( 'id' )
            // InternalFeatureModel.g:2008:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getIdKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getIdKeyword_4()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group__4__Impl"


    // $ANTLR start "rule__OrGroup__Group__5"
    // InternalFeatureModel.g:2017:1: rule__OrGroup__Group__5 : rule__OrGroup__Group__5__Impl rule__OrGroup__Group__6 ;
    public final void rule__OrGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2021:1: ( rule__OrGroup__Group__5__Impl rule__OrGroup__Group__6 )
            // InternalFeatureModel.g:2022:2: rule__OrGroup__Group__5__Impl rule__OrGroup__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__OrGroup__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__6();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group__5"


    // $ANTLR start "rule__OrGroup__Group__5__Impl"
    // InternalFeatureModel.g:2029:1: rule__OrGroup__Group__5__Impl : ( ( rule__OrGroup__IdAssignment_5 ) ) ;
    public final void rule__OrGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2033:1: ( ( ( rule__OrGroup__IdAssignment_5 ) ) )
            // InternalFeatureModel.g:2034:1: ( ( rule__OrGroup__IdAssignment_5 ) )
            {
            // InternalFeatureModel.g:2034:1: ( ( rule__OrGroup__IdAssignment_5 ) )
            // InternalFeatureModel.g:2035:2: ( rule__OrGroup__IdAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getIdAssignment_5()); 
            }
            // InternalFeatureModel.g:2036:2: ( rule__OrGroup__IdAssignment_5 )
            // InternalFeatureModel.g:2036:3: rule__OrGroup__IdAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__IdAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getIdAssignment_5()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group__5__Impl"


    // $ANTLR start "rule__OrGroup__Group__6"
    // InternalFeatureModel.g:2044:1: rule__OrGroup__Group__6 : rule__OrGroup__Group__6__Impl ;
    public final void rule__OrGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2048:1: ( rule__OrGroup__Group__6__Impl )
            // InternalFeatureModel.g:2049:2: rule__OrGroup__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group__6"


    // $ANTLR start "rule__OrGroup__Group__6__Impl"
    // InternalFeatureModel.g:2055:1: rule__OrGroup__Group__6__Impl : ( ( rule__OrGroup__Group_6__0 )? ) ;
    public final void rule__OrGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2059:1: ( ( ( rule__OrGroup__Group_6__0 )? ) )
            // InternalFeatureModel.g:2060:1: ( ( rule__OrGroup__Group_6__0 )? )
            {
            // InternalFeatureModel.g:2060:1: ( ( rule__OrGroup__Group_6__0 )? )
            // InternalFeatureModel.g:2061:2: ( rule__OrGroup__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getGroup_6()); 
            }
            // InternalFeatureModel.g:2062:2: ( rule__OrGroup__Group_6__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==29) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFeatureModel.g:2062:3: rule__OrGroup__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrGroup__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getGroup_6()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group__6__Impl"


    // $ANTLR start "rule__OrGroup__Group_0__0"
    // InternalFeatureModel.g:2071:1: rule__OrGroup__Group_0__0 : rule__OrGroup__Group_0__0__Impl rule__OrGroup__Group_0__1 ;
    public final void rule__OrGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2075:1: ( rule__OrGroup__Group_0__0__Impl rule__OrGroup__Group_0__1 )
            // InternalFeatureModel.g:2076:2: rule__OrGroup__Group_0__0__Impl rule__OrGroup__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__OrGroup__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group_0__0"


    // $ANTLR start "rule__OrGroup__Group_0__0__Impl"
    // InternalFeatureModel.g:2083:1: rule__OrGroup__Group_0__0__Impl : ( ( 'mandatory' )? ) ;
    public final void rule__OrGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2087:1: ( ( ( 'mandatory' )? ) )
            // InternalFeatureModel.g:2088:1: ( ( 'mandatory' )? )
            {
            // InternalFeatureModel.g:2088:1: ( ( 'mandatory' )? )
            // InternalFeatureModel.g:2089:2: ( 'mandatory' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getMandatoryKeyword_0_0()); 
            }
            // InternalFeatureModel.g:2090:2: ( 'mandatory' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==27) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==27) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalFeatureModel.g:2090:3: 'mandatory'
                    {
                    match(input,27,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getMandatoryKeyword_0_0()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group_0__0__Impl"


    // $ANTLR start "rule__OrGroup__Group_0__1"
    // InternalFeatureModel.g:2098:1: rule__OrGroup__Group_0__1 : rule__OrGroup__Group_0__1__Impl ;
    public final void rule__OrGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2102:1: ( rule__OrGroup__Group_0__1__Impl )
            // InternalFeatureModel.g:2103:2: rule__OrGroup__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group_0__1"


    // $ANTLR start "rule__OrGroup__Group_0__1__Impl"
    // InternalFeatureModel.g:2109:1: rule__OrGroup__Group_0__1__Impl : ( ( rule__OrGroup__MandatoryAssignment_0_1 ) ) ;
    public final void rule__OrGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2113:1: ( ( ( rule__OrGroup__MandatoryAssignment_0_1 ) ) )
            // InternalFeatureModel.g:2114:1: ( ( rule__OrGroup__MandatoryAssignment_0_1 ) )
            {
            // InternalFeatureModel.g:2114:1: ( ( rule__OrGroup__MandatoryAssignment_0_1 ) )
            // InternalFeatureModel.g:2115:2: ( rule__OrGroup__MandatoryAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getMandatoryAssignment_0_1()); 
            }
            // InternalFeatureModel.g:2116:2: ( rule__OrGroup__MandatoryAssignment_0_1 )
            // InternalFeatureModel.g:2116:3: rule__OrGroup__MandatoryAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__MandatoryAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getMandatoryAssignment_0_1()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group_0__1__Impl"


    // $ANTLR start "rule__OrGroup__Group_1__0"
    // InternalFeatureModel.g:2125:1: rule__OrGroup__Group_1__0 : rule__OrGroup__Group_1__0__Impl rule__OrGroup__Group_1__1 ;
    public final void rule__OrGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2129:1: ( rule__OrGroup__Group_1__0__Impl rule__OrGroup__Group_1__1 )
            // InternalFeatureModel.g:2130:2: rule__OrGroup__Group_1__0__Impl rule__OrGroup__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__OrGroup__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group_1__0"


    // $ANTLR start "rule__OrGroup__Group_1__0__Impl"
    // InternalFeatureModel.g:2137:1: rule__OrGroup__Group_1__0__Impl : ( ( 'selected' )? ) ;
    public final void rule__OrGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2141:1: ( ( ( 'selected' )? ) )
            // InternalFeatureModel.g:2142:1: ( ( 'selected' )? )
            {
            // InternalFeatureModel.g:2142:1: ( ( 'selected' )? )
            // InternalFeatureModel.g:2143:2: ( 'selected' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getSelectedKeyword_1_0()); 
            }
            // InternalFeatureModel.g:2144:2: ( 'selected' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==28) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalFeatureModel.g:2144:3: 'selected'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getSelectedKeyword_1_0()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group_1__0__Impl"


    // $ANTLR start "rule__OrGroup__Group_1__1"
    // InternalFeatureModel.g:2152:1: rule__OrGroup__Group_1__1 : rule__OrGroup__Group_1__1__Impl ;
    public final void rule__OrGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2156:1: ( rule__OrGroup__Group_1__1__Impl )
            // InternalFeatureModel.g:2157:2: rule__OrGroup__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group_1__1"


    // $ANTLR start "rule__OrGroup__Group_1__1__Impl"
    // InternalFeatureModel.g:2163:1: rule__OrGroup__Group_1__1__Impl : ( ( rule__OrGroup__SelectedAssignment_1_1 ) ) ;
    public final void rule__OrGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2167:1: ( ( ( rule__OrGroup__SelectedAssignment_1_1 ) ) )
            // InternalFeatureModel.g:2168:1: ( ( rule__OrGroup__SelectedAssignment_1_1 ) )
            {
            // InternalFeatureModel.g:2168:1: ( ( rule__OrGroup__SelectedAssignment_1_1 ) )
            // InternalFeatureModel.g:2169:2: ( rule__OrGroup__SelectedAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getSelectedAssignment_1_1()); 
            }
            // InternalFeatureModel.g:2170:2: ( rule__OrGroup__SelectedAssignment_1_1 )
            // InternalFeatureModel.g:2170:3: rule__OrGroup__SelectedAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__SelectedAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getSelectedAssignment_1_1()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group_1__1__Impl"


    // $ANTLR start "rule__OrGroup__Group_6__0"
    // InternalFeatureModel.g:2179:1: rule__OrGroup__Group_6__0 : rule__OrGroup__Group_6__0__Impl rule__OrGroup__Group_6__1 ;
    public final void rule__OrGroup__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2183:1: ( rule__OrGroup__Group_6__0__Impl rule__OrGroup__Group_6__1 )
            // InternalFeatureModel.g:2184:2: rule__OrGroup__Group_6__0__Impl rule__OrGroup__Group_6__1
            {
            pushFollow(FOLLOW_3);
            rule__OrGroup__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group_6__0"


    // $ANTLR start "rule__OrGroup__Group_6__0__Impl"
    // InternalFeatureModel.g:2191:1: rule__OrGroup__Group_6__0__Impl : ( 'children' ) ;
    public final void rule__OrGroup__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2195:1: ( ( 'children' ) )
            // InternalFeatureModel.g:2196:1: ( 'children' )
            {
            // InternalFeatureModel.g:2196:1: ( 'children' )
            // InternalFeatureModel.g:2197:2: 'children'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getChildrenKeyword_6_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getChildrenKeyword_6_0()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group_6__0__Impl"


    // $ANTLR start "rule__OrGroup__Group_6__1"
    // InternalFeatureModel.g:2206:1: rule__OrGroup__Group_6__1 : rule__OrGroup__Group_6__1__Impl rule__OrGroup__Group_6__2 ;
    public final void rule__OrGroup__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2210:1: ( rule__OrGroup__Group_6__1__Impl rule__OrGroup__Group_6__2 )
            // InternalFeatureModel.g:2211:2: rule__OrGroup__Group_6__1__Impl rule__OrGroup__Group_6__2
            {
            pushFollow(FOLLOW_8);
            rule__OrGroup__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group_6__1"


    // $ANTLR start "rule__OrGroup__Group_6__1__Impl"
    // InternalFeatureModel.g:2218:1: rule__OrGroup__Group_6__1__Impl : ( '{' ) ;
    public final void rule__OrGroup__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2222:1: ( ( '{' ) )
            // InternalFeatureModel.g:2223:1: ( '{' )
            {
            // InternalFeatureModel.g:2223:1: ( '{' )
            // InternalFeatureModel.g:2224:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_6_1()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_6_1()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group_6__1__Impl"


    // $ANTLR start "rule__OrGroup__Group_6__2"
    // InternalFeatureModel.g:2233:1: rule__OrGroup__Group_6__2 : rule__OrGroup__Group_6__2__Impl rule__OrGroup__Group_6__3 ;
    public final void rule__OrGroup__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2237:1: ( rule__OrGroup__Group_6__2__Impl rule__OrGroup__Group_6__3 )
            // InternalFeatureModel.g:2238:2: rule__OrGroup__Group_6__2__Impl rule__OrGroup__Group_6__3
            {
            pushFollow(FOLLOW_18);
            rule__OrGroup__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_6__3();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group_6__2"


    // $ANTLR start "rule__OrGroup__Group_6__2__Impl"
    // InternalFeatureModel.g:2245:1: rule__OrGroup__Group_6__2__Impl : ( ( rule__OrGroup__ChildrenAssignment_6_2 ) ) ;
    public final void rule__OrGroup__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2249:1: ( ( ( rule__OrGroup__ChildrenAssignment_6_2 ) ) )
            // InternalFeatureModel.g:2250:1: ( ( rule__OrGroup__ChildrenAssignment_6_2 ) )
            {
            // InternalFeatureModel.g:2250:1: ( ( rule__OrGroup__ChildrenAssignment_6_2 ) )
            // InternalFeatureModel.g:2251:2: ( rule__OrGroup__ChildrenAssignment_6_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getChildrenAssignment_6_2()); 
            }
            // InternalFeatureModel.g:2252:2: ( rule__OrGroup__ChildrenAssignment_6_2 )
            // InternalFeatureModel.g:2252:3: rule__OrGroup__ChildrenAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__ChildrenAssignment_6_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getChildrenAssignment_6_2()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group_6__2__Impl"


    // $ANTLR start "rule__OrGroup__Group_6__3"
    // InternalFeatureModel.g:2260:1: rule__OrGroup__Group_6__3 : rule__OrGroup__Group_6__3__Impl rule__OrGroup__Group_6__4 ;
    public final void rule__OrGroup__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2264:1: ( rule__OrGroup__Group_6__3__Impl rule__OrGroup__Group_6__4 )
            // InternalFeatureModel.g:2265:2: rule__OrGroup__Group_6__3__Impl rule__OrGroup__Group_6__4
            {
            pushFollow(FOLLOW_18);
            rule__OrGroup__Group_6__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_6__4();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group_6__3"


    // $ANTLR start "rule__OrGroup__Group_6__3__Impl"
    // InternalFeatureModel.g:2272:1: rule__OrGroup__Group_6__3__Impl : ( ( rule__OrGroup__Group_6_3__0 )* ) ;
    public final void rule__OrGroup__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2276:1: ( ( ( rule__OrGroup__Group_6_3__0 )* ) )
            // InternalFeatureModel.g:2277:1: ( ( rule__OrGroup__Group_6_3__0 )* )
            {
            // InternalFeatureModel.g:2277:1: ( ( rule__OrGroup__Group_6_3__0 )* )
            // InternalFeatureModel.g:2278:2: ( rule__OrGroup__Group_6_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getGroup_6_3()); 
            }
            // InternalFeatureModel.g:2279:2: ( rule__OrGroup__Group_6_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFeatureModel.g:2279:3: rule__OrGroup__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__OrGroup__Group_6_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getGroup_6_3()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group_6__3__Impl"


    // $ANTLR start "rule__OrGroup__Group_6__4"
    // InternalFeatureModel.g:2287:1: rule__OrGroup__Group_6__4 : rule__OrGroup__Group_6__4__Impl ;
    public final void rule__OrGroup__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2291:1: ( rule__OrGroup__Group_6__4__Impl )
            // InternalFeatureModel.g:2292:2: rule__OrGroup__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_6__4__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group_6__4"


    // $ANTLR start "rule__OrGroup__Group_6__4__Impl"
    // InternalFeatureModel.g:2298:1: rule__OrGroup__Group_6__4__Impl : ( '}' ) ;
    public final void rule__OrGroup__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2302:1: ( ( '}' ) )
            // InternalFeatureModel.g:2303:1: ( '}' )
            {
            // InternalFeatureModel.g:2303:1: ( '}' )
            // InternalFeatureModel.g:2304:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_6_4()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_6_4()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group_6__4__Impl"


    // $ANTLR start "rule__OrGroup__Group_6_3__0"
    // InternalFeatureModel.g:2314:1: rule__OrGroup__Group_6_3__0 : rule__OrGroup__Group_6_3__0__Impl rule__OrGroup__Group_6_3__1 ;
    public final void rule__OrGroup__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2318:1: ( rule__OrGroup__Group_6_3__0__Impl rule__OrGroup__Group_6_3__1 )
            // InternalFeatureModel.g:2319:2: rule__OrGroup__Group_6_3__0__Impl rule__OrGroup__Group_6_3__1
            {
            pushFollow(FOLLOW_8);
            rule__OrGroup__Group_6_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_6_3__1();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group_6_3__0"


    // $ANTLR start "rule__OrGroup__Group_6_3__0__Impl"
    // InternalFeatureModel.g:2326:1: rule__OrGroup__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__OrGroup__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2330:1: ( ( ',' ) )
            // InternalFeatureModel.g:2331:1: ( ',' )
            {
            // InternalFeatureModel.g:2331:1: ( ',' )
            // InternalFeatureModel.g:2332:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getCommaKeyword_6_3_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getCommaKeyword_6_3_0()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group_6_3__0__Impl"


    // $ANTLR start "rule__OrGroup__Group_6_3__1"
    // InternalFeatureModel.g:2341:1: rule__OrGroup__Group_6_3__1 : rule__OrGroup__Group_6_3__1__Impl ;
    public final void rule__OrGroup__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2345:1: ( rule__OrGroup__Group_6_3__1__Impl )
            // InternalFeatureModel.g:2346:2: rule__OrGroup__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_6_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

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
    // $ANTLR end "rule__OrGroup__Group_6_3__1"


    // $ANTLR start "rule__OrGroup__Group_6_3__1__Impl"
    // InternalFeatureModel.g:2352:1: rule__OrGroup__Group_6_3__1__Impl : ( ( rule__OrGroup__ChildrenAssignment_6_3_1 ) ) ;
    public final void rule__OrGroup__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2356:1: ( ( ( rule__OrGroup__ChildrenAssignment_6_3_1 ) ) )
            // InternalFeatureModel.g:2357:1: ( ( rule__OrGroup__ChildrenAssignment_6_3_1 ) )
            {
            // InternalFeatureModel.g:2357:1: ( ( rule__OrGroup__ChildrenAssignment_6_3_1 ) )
            // InternalFeatureModel.g:2358:2: ( rule__OrGroup__ChildrenAssignment_6_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getChildrenAssignment_6_3_1()); 
            }
            // InternalFeatureModel.g:2359:2: ( rule__OrGroup__ChildrenAssignment_6_3_1 )
            // InternalFeatureModel.g:2359:3: rule__OrGroup__ChildrenAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__ChildrenAssignment_6_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getChildrenAssignment_6_3_1()); 
            }

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
    // $ANTLR end "rule__OrGroup__Group_6_3__1__Impl"


    // $ANTLR start "rule__Model__FmAssignment_2"
    // InternalFeatureModel.g:2368:1: rule__Model__FmAssignment_2 : ( ruleFeatureModel ) ;
    public final void rule__Model__FmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2372:1: ( ( ruleFeatureModel ) )
            // InternalFeatureModel.g:2373:2: ( ruleFeatureModel )
            {
            // InternalFeatureModel.g:2373:2: ( ruleFeatureModel )
            // InternalFeatureModel.g:2374:3: ruleFeatureModel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFmFeatureModelParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeatureModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getModelAccess().getFmFeatureModelParserRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Model__FmAssignment_2"


    // $ANTLR start "rule__FeatureModel__NameAssignment_1"
    // InternalFeatureModel.g:2383:1: rule__FeatureModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FeatureModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2387:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2388:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2388:2: ( ruleEString )
            // InternalFeatureModel.g:2389:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getNameEStringParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getNameEStringParserRuleCall_1_0()); 
            }

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
    // $ANTLR end "rule__FeatureModel__NameAssignment_1"


    // $ANTLR start "rule__FeatureModel__RootAssignment_3"
    // InternalFeatureModel.g:2398:1: rule__FeatureModel__RootAssignment_3 : ( ruleFeature ) ;
    public final void rule__FeatureModel__RootAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2402:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2403:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2403:2: ( ruleFeature )
            // InternalFeatureModel.g:2404:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getRootFeatureParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getRootFeatureParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__FeatureModel__RootAssignment_3"


    // $ANTLR start "rule__FeatureModel__CrossTreeConstraintsAssignment_6"
    // InternalFeatureModel.g:2413:1: rule__FeatureModel__CrossTreeConstraintsAssignment_6 : ( ruleAdvancedConstraint ) ;
    public final void rule__FeatureModel__CrossTreeConstraintsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2417:1: ( ( ruleAdvancedConstraint ) )
            // InternalFeatureModel.g:2418:2: ( ruleAdvancedConstraint )
            {
            // InternalFeatureModel.g:2418:2: ( ruleAdvancedConstraint )
            // InternalFeatureModel.g:2419:3: ruleAdvancedConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsAdvancedConstraintParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAdvancedConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsAdvancedConstraintParserRuleCall_6_0()); 
            }

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
    // $ANTLR end "rule__FeatureModel__CrossTreeConstraintsAssignment_6"


    // $ANTLR start "rule__AdvancedConstraint__TermAssignment"
    // InternalFeatureModel.g:2428:1: rule__AdvancedConstraint__TermAssignment : ( ruleTerm ) ;
    public final void rule__AdvancedConstraint__TermAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2432:1: ( ( ruleTerm ) )
            // InternalFeatureModel.g:2433:2: ( ruleTerm )
            {
            // InternalFeatureModel.g:2433:2: ( ruleTerm )
            // InternalFeatureModel.g:2434:3: ruleTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAdvancedConstraintAccess().getTermTermParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAdvancedConstraintAccess().getTermTermParserRuleCall_0()); 
            }

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
    // $ANTLR end "rule__AdvancedConstraint__TermAssignment"


    // $ANTLR start "rule__Term__FeatureAssignment_1"
    // InternalFeatureModel.g:2443:1: rule__Term__FeatureAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__Term__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2447:1: ( ( ( ruleEString ) ) )
            // InternalFeatureModel.g:2448:2: ( ( ruleEString ) )
            {
            // InternalFeatureModel.g:2448:2: ( ( ruleEString ) )
            // InternalFeatureModel.g:2449:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFeatureFeatureCrossReference_1_0()); 
            }
            // InternalFeatureModel.g:2450:3: ( ruleEString )
            // InternalFeatureModel.g:2451:4: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getFeatureFeatureEStringParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getFeatureFeatureEStringParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getFeatureFeatureCrossReference_1_0()); 
            }

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
    // $ANTLR end "rule__Term__FeatureAssignment_1"


    // $ANTLR start "rule__Term__TypeAssignment_2"
    // InternalFeatureModel.g:2462:1: rule__Term__TypeAssignment_2 : ( ruleTermType ) ;
    public final void rule__Term__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2466:1: ( ( ruleTermType ) )
            // InternalFeatureModel.g:2467:2: ( ruleTermType )
            {
            // InternalFeatureModel.g:2467:2: ( ruleTermType )
            // InternalFeatureModel.g:2468:3: ruleTermType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getTypeTermTypeEnumRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTermType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getTypeTermTypeEnumRuleCall_2_0()); 
            }

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
    // $ANTLR end "rule__Term__TypeAssignment_2"


    // $ANTLR start "rule__Term__OperandsAssignment_3"
    // InternalFeatureModel.g:2477:1: rule__Term__OperandsAssignment_3 : ( rulesecondTerm ) ;
    public final void rule__Term__OperandsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2481:1: ( ( rulesecondTerm ) )
            // InternalFeatureModel.g:2482:2: ( rulesecondTerm )
            {
            // InternalFeatureModel.g:2482:2: ( rulesecondTerm )
            // InternalFeatureModel.g:2483:3: rulesecondTerm
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTermAccess().getOperandsSecondTermParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            rulesecondTerm();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTermAccess().getOperandsSecondTermParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__Term__OperandsAssignment_3"


    // $ANTLR start "rule__SecondTerm__FeatureAssignment_1"
    // InternalFeatureModel.g:2492:1: rule__SecondTerm__FeatureAssignment_1 : ( ( ruleEString ) ) ;
    public final void rule__SecondTerm__FeatureAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2496:1: ( ( ( ruleEString ) ) )
            // InternalFeatureModel.g:2497:2: ( ( ruleEString ) )
            {
            // InternalFeatureModel.g:2497:2: ( ( ruleEString ) )
            // InternalFeatureModel.g:2498:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondTermAccess().getFeatureFeatureCrossReference_1_0()); 
            }
            // InternalFeatureModel.g:2499:3: ( ruleEString )
            // InternalFeatureModel.g:2500:4: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSecondTermAccess().getFeatureFeatureEStringParserRuleCall_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondTermAccess().getFeatureFeatureEStringParserRuleCall_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSecondTermAccess().getFeatureFeatureCrossReference_1_0()); 
            }

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
    // $ANTLR end "rule__SecondTerm__FeatureAssignment_1"


    // $ANTLR start "rule__Feature_Impl__MandatoryAssignment_0_1"
    // InternalFeatureModel.g:2511:1: rule__Feature_Impl__MandatoryAssignment_0_1 : ( ( 'mandatory' ) ) ;
    public final void rule__Feature_Impl__MandatoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2515:1: ( ( ( 'mandatory' ) ) )
            // InternalFeatureModel.g:2516:2: ( ( 'mandatory' ) )
            {
            // InternalFeatureModel.g:2516:2: ( ( 'mandatory' ) )
            // InternalFeatureModel.g:2517:3: ( 'mandatory' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }
            // InternalFeatureModel.g:2518:3: ( 'mandatory' )
            // InternalFeatureModel.g:2519:4: 'mandatory'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__MandatoryAssignment_0_1"


    // $ANTLR start "rule__Feature_Impl__SelectedAssignment_1_1"
    // InternalFeatureModel.g:2530:1: rule__Feature_Impl__SelectedAssignment_1_1 : ( ( 'selected' ) ) ;
    public final void rule__Feature_Impl__SelectedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2534:1: ( ( ( 'selected' ) ) )
            // InternalFeatureModel.g:2535:2: ( ( 'selected' ) )
            {
            // InternalFeatureModel.g:2535:2: ( ( 'selected' ) )
            // InternalFeatureModel.g:2536:3: ( 'selected' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getSelectedSelectedKeyword_1_1_0()); 
            }
            // InternalFeatureModel.g:2537:3: ( 'selected' )
            // InternalFeatureModel.g:2538:4: 'selected'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getSelectedSelectedKeyword_1_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getSelectedSelectedKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getSelectedSelectedKeyword_1_1_0()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__SelectedAssignment_1_1"


    // $ANTLR start "rule__Feature_Impl__NameAssignment_3"
    // InternalFeatureModel.g:2549:1: rule__Feature_Impl__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Feature_Impl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2553:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2554:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2554:2: ( ruleEString )
            // InternalFeatureModel.g:2555:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__NameAssignment_3"


    // $ANTLR start "rule__Feature_Impl__IdAssignment_5"
    // InternalFeatureModel.g:2564:1: rule__Feature_Impl__IdAssignment_5 : ( ruleEString ) ;
    public final void rule__Feature_Impl__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2568:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2569:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2569:2: ( ruleEString )
            // InternalFeatureModel.g:2570:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getIdEStringParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getIdEStringParserRuleCall_5_0()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__IdAssignment_5"


    // $ANTLR start "rule__Feature_Impl__ChildrenAssignment_6_2"
    // InternalFeatureModel.g:2579:1: rule__Feature_Impl__ChildrenAssignment_6_2 : ( ruleFeature ) ;
    public final void rule__Feature_Impl__ChildrenAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2583:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2584:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2584:2: ( ruleFeature )
            // InternalFeatureModel.g:2585:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_6_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_6_2_0()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__ChildrenAssignment_6_2"


    // $ANTLR start "rule__Feature_Impl__ChildrenAssignment_6_3_1"
    // InternalFeatureModel.g:2594:1: rule__Feature_Impl__ChildrenAssignment_6_3_1 : ( ruleFeature ) ;
    public final void rule__Feature_Impl__ChildrenAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2598:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2599:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2599:2: ( ruleFeature )
            // InternalFeatureModel.g:2600:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_6_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_6_3_1_0()); 
            }

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
    // $ANTLR end "rule__Feature_Impl__ChildrenAssignment_6_3_1"


    // $ANTLR start "rule__Alternative__MandatoryAssignment_0_1"
    // InternalFeatureModel.g:2609:1: rule__Alternative__MandatoryAssignment_0_1 : ( ( 'mandatory' ) ) ;
    public final void rule__Alternative__MandatoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2613:1: ( ( ( 'mandatory' ) ) )
            // InternalFeatureModel.g:2614:2: ( ( 'mandatory' ) )
            {
            // InternalFeatureModel.g:2614:2: ( ( 'mandatory' ) )
            // InternalFeatureModel.g:2615:3: ( 'mandatory' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }
            // InternalFeatureModel.g:2616:3: ( 'mandatory' )
            // InternalFeatureModel.g:2617:4: 'mandatory'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }

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
    // $ANTLR end "rule__Alternative__MandatoryAssignment_0_1"


    // $ANTLR start "rule__Alternative__SelectedAssignment_1_1"
    // InternalFeatureModel.g:2628:1: rule__Alternative__SelectedAssignment_1_1 : ( ( 'selected' ) ) ;
    public final void rule__Alternative__SelectedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2632:1: ( ( ( 'selected' ) ) )
            // InternalFeatureModel.g:2633:2: ( ( 'selected' ) )
            {
            // InternalFeatureModel.g:2633:2: ( ( 'selected' ) )
            // InternalFeatureModel.g:2634:3: ( 'selected' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getSelectedSelectedKeyword_1_1_0()); 
            }
            // InternalFeatureModel.g:2635:3: ( 'selected' )
            // InternalFeatureModel.g:2636:4: 'selected'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getSelectedSelectedKeyword_1_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getSelectedSelectedKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getSelectedSelectedKeyword_1_1_0()); 
            }

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
    // $ANTLR end "rule__Alternative__SelectedAssignment_1_1"


    // $ANTLR start "rule__Alternative__NameAssignment_3"
    // InternalFeatureModel.g:2647:1: rule__Alternative__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Alternative__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2651:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2652:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2652:2: ( ruleEString )
            // InternalFeatureModel.g:2653:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getNameEStringParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getNameEStringParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__Alternative__NameAssignment_3"


    // $ANTLR start "rule__Alternative__IdAssignment_5"
    // InternalFeatureModel.g:2662:1: rule__Alternative__IdAssignment_5 : ( ruleEString ) ;
    public final void rule__Alternative__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2666:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2667:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2667:2: ( ruleEString )
            // InternalFeatureModel.g:2668:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getIdEStringParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getIdEStringParserRuleCall_5_0()); 
            }

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
    // $ANTLR end "rule__Alternative__IdAssignment_5"


    // $ANTLR start "rule__Alternative__ChildrenAssignment_6_2"
    // InternalFeatureModel.g:2677:1: rule__Alternative__ChildrenAssignment_6_2 : ( ruleFeature ) ;
    public final void rule__Alternative__ChildrenAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2681:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2682:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2682:2: ( ruleFeature )
            // InternalFeatureModel.g:2683:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_6_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_6_2_0()); 
            }

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
    // $ANTLR end "rule__Alternative__ChildrenAssignment_6_2"


    // $ANTLR start "rule__Alternative__ChildrenAssignment_6_3_1"
    // InternalFeatureModel.g:2692:1: rule__Alternative__ChildrenAssignment_6_3_1 : ( ruleFeature ) ;
    public final void rule__Alternative__ChildrenAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2696:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2697:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2697:2: ( ruleFeature )
            // InternalFeatureModel.g:2698:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_6_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_6_3_1_0()); 
            }

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
    // $ANTLR end "rule__Alternative__ChildrenAssignment_6_3_1"


    // $ANTLR start "rule__OrGroup__MandatoryAssignment_0_1"
    // InternalFeatureModel.g:2707:1: rule__OrGroup__MandatoryAssignment_0_1 : ( ( 'mandatory' ) ) ;
    public final void rule__OrGroup__MandatoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2711:1: ( ( ( 'mandatory' ) ) )
            // InternalFeatureModel.g:2712:2: ( ( 'mandatory' ) )
            {
            // InternalFeatureModel.g:2712:2: ( ( 'mandatory' ) )
            // InternalFeatureModel.g:2713:3: ( 'mandatory' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }
            // InternalFeatureModel.g:2714:3: ( 'mandatory' )
            // InternalFeatureModel.g:2715:4: 'mandatory'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }

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
    // $ANTLR end "rule__OrGroup__MandatoryAssignment_0_1"


    // $ANTLR start "rule__OrGroup__SelectedAssignment_1_1"
    // InternalFeatureModel.g:2726:1: rule__OrGroup__SelectedAssignment_1_1 : ( ( 'selected' ) ) ;
    public final void rule__OrGroup__SelectedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2730:1: ( ( ( 'selected' ) ) )
            // InternalFeatureModel.g:2731:2: ( ( 'selected' ) )
            {
            // InternalFeatureModel.g:2731:2: ( ( 'selected' ) )
            // InternalFeatureModel.g:2732:3: ( 'selected' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getSelectedSelectedKeyword_1_1_0()); 
            }
            // InternalFeatureModel.g:2733:3: ( 'selected' )
            // InternalFeatureModel.g:2734:4: 'selected'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getSelectedSelectedKeyword_1_1_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getSelectedSelectedKeyword_1_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getSelectedSelectedKeyword_1_1_0()); 
            }

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
    // $ANTLR end "rule__OrGroup__SelectedAssignment_1_1"


    // $ANTLR start "rule__OrGroup__NameAssignment_3"
    // InternalFeatureModel.g:2745:1: rule__OrGroup__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OrGroup__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2749:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2750:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2750:2: ( ruleEString )
            // InternalFeatureModel.g:2751:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getNameEStringParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getNameEStringParserRuleCall_3_0()); 
            }

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
    // $ANTLR end "rule__OrGroup__NameAssignment_3"


    // $ANTLR start "rule__OrGroup__IdAssignment_5"
    // InternalFeatureModel.g:2760:1: rule__OrGroup__IdAssignment_5 : ( ruleEString ) ;
    public final void rule__OrGroup__IdAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2764:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2765:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2765:2: ( ruleEString )
            // InternalFeatureModel.g:2766:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getIdEStringParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getIdEStringParserRuleCall_5_0()); 
            }

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
    // $ANTLR end "rule__OrGroup__IdAssignment_5"


    // $ANTLR start "rule__OrGroup__ChildrenAssignment_6_2"
    // InternalFeatureModel.g:2775:1: rule__OrGroup__ChildrenAssignment_6_2 : ( ruleFeature ) ;
    public final void rule__OrGroup__ChildrenAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2779:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2780:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2780:2: ( ruleFeature )
            // InternalFeatureModel.g:2781:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_6_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_6_2_0()); 
            }

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
    // $ANTLR end "rule__OrGroup__ChildrenAssignment_6_2"


    // $ANTLR start "rule__OrGroup__ChildrenAssignment_6_3_1"
    // InternalFeatureModel.g:2790:1: rule__OrGroup__ChildrenAssignment_6_3_1 : ( ruleFeature ) ;
    public final void rule__OrGroup__ChildrenAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2794:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2795:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2795:2: ( ruleFeature )
            // InternalFeatureModel.g:2796:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_6_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_6_3_1_0()); 
            }

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
    // $ANTLR end "rule__OrGroup__ChildrenAssignment_6_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000019A000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000007F800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000001A000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000098000000L});

}