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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'REQUIRES'", "'EXCLUDES'", "'feature_model'", "'{'", "'}'", "'name'", "'root'", "'crossTreeConstraints'", "'BasicConstraint'", "'type'", "'rightFeature'", "'leftFeature'", "'Feature'", "'id'", "'mandatory'", "'selected'", "'children'", "','", "'Alternative'", "'OrGroup'"
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


    // $ANTLR start "entryRuleBasicConstraint"
    // InternalFeatureModel.g:104:1: entryRuleBasicConstraint : ruleBasicConstraint EOF ;
    public final void entryRuleBasicConstraint() throws RecognitionException {
        try {
            // InternalFeatureModel.g:105:1: ( ruleBasicConstraint EOF )
            // InternalFeatureModel.g:106:1: ruleBasicConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintRule()); 
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
    // $ANTLR end "entryRuleBasicConstraint"


    // $ANTLR start "ruleBasicConstraint"
    // InternalFeatureModel.g:113:1: ruleBasicConstraint : ( ( rule__BasicConstraint__Group__0 ) ) ;
    public final void ruleBasicConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:117:2: ( ( ( rule__BasicConstraint__Group__0 ) ) )
            // InternalFeatureModel.g:118:2: ( ( rule__BasicConstraint__Group__0 ) )
            {
            // InternalFeatureModel.g:118:2: ( ( rule__BasicConstraint__Group__0 ) )
            // InternalFeatureModel.g:119:3: ( rule__BasicConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getGroup()); 
            }
            // InternalFeatureModel.g:120:3: ( rule__BasicConstraint__Group__0 )
            // InternalFeatureModel.g:120:4: rule__BasicConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getGroup()); 
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
    // $ANTLR end "ruleBasicConstraint"


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


    // $ANTLR start "entryRuleFeature_Impl"
    // InternalFeatureModel.g:154:1: entryRuleFeature_Impl : ruleFeature_Impl EOF ;
    public final void entryRuleFeature_Impl() throws RecognitionException {
        try {
            // InternalFeatureModel.g:155:1: ( ruleFeature_Impl EOF )
            // InternalFeatureModel.g:156:1: ruleFeature_Impl EOF
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
    // InternalFeatureModel.g:163:1: ruleFeature_Impl : ( ( rule__Feature_Impl__Group__0 ) ) ;
    public final void ruleFeature_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:167:2: ( ( ( rule__Feature_Impl__Group__0 ) ) )
            // InternalFeatureModel.g:168:2: ( ( rule__Feature_Impl__Group__0 ) )
            {
            // InternalFeatureModel.g:168:2: ( ( rule__Feature_Impl__Group__0 ) )
            // InternalFeatureModel.g:169:3: ( rule__Feature_Impl__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getGroup()); 
            }
            // InternalFeatureModel.g:170:3: ( rule__Feature_Impl__Group__0 )
            // InternalFeatureModel.g:170:4: rule__Feature_Impl__Group__0
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
    // InternalFeatureModel.g:179:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalFeatureModel.g:180:1: ( ruleEString EOF )
            // InternalFeatureModel.g:181:1: ruleEString EOF
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
    // InternalFeatureModel.g:188:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:192:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalFeatureModel.g:193:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalFeatureModel.g:193:2: ( ( rule__EString__Alternatives ) )
            // InternalFeatureModel.g:194:3: ( rule__EString__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEStringAccess().getAlternatives()); 
            }
            // InternalFeatureModel.g:195:3: ( rule__EString__Alternatives )
            // InternalFeatureModel.g:195:4: rule__EString__Alternatives
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
    // InternalFeatureModel.g:204:1: entryRuleAlternative : ruleAlternative EOF ;
    public final void entryRuleAlternative() throws RecognitionException {
        try {
            // InternalFeatureModel.g:205:1: ( ruleAlternative EOF )
            // InternalFeatureModel.g:206:1: ruleAlternative EOF
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
    // InternalFeatureModel.g:213:1: ruleAlternative : ( ( rule__Alternative__Group__0 ) ) ;
    public final void ruleAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:217:2: ( ( ( rule__Alternative__Group__0 ) ) )
            // InternalFeatureModel.g:218:2: ( ( rule__Alternative__Group__0 ) )
            {
            // InternalFeatureModel.g:218:2: ( ( rule__Alternative__Group__0 ) )
            // InternalFeatureModel.g:219:3: ( rule__Alternative__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getGroup()); 
            }
            // InternalFeatureModel.g:220:3: ( rule__Alternative__Group__0 )
            // InternalFeatureModel.g:220:4: rule__Alternative__Group__0
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
    // InternalFeatureModel.g:229:1: entryRuleOrGroup : ruleOrGroup EOF ;
    public final void entryRuleOrGroup() throws RecognitionException {
        try {
            // InternalFeatureModel.g:230:1: ( ruleOrGroup EOF )
            // InternalFeatureModel.g:231:1: ruleOrGroup EOF
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
    // InternalFeatureModel.g:238:1: ruleOrGroup : ( ( rule__OrGroup__Group__0 ) ) ;
    public final void ruleOrGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:242:2: ( ( ( rule__OrGroup__Group__0 ) ) )
            // InternalFeatureModel.g:243:2: ( ( rule__OrGroup__Group__0 ) )
            {
            // InternalFeatureModel.g:243:2: ( ( rule__OrGroup__Group__0 ) )
            // InternalFeatureModel.g:244:3: ( rule__OrGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getGroup()); 
            }
            // InternalFeatureModel.g:245:3: ( rule__OrGroup__Group__0 )
            // InternalFeatureModel.g:245:4: rule__OrGroup__Group__0
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


    // $ANTLR start "ruleCrossTreeConstraintType"
    // InternalFeatureModel.g:254:1: ruleCrossTreeConstraintType : ( ( rule__CrossTreeConstraintType__Alternatives ) ) ;
    public final void ruleCrossTreeConstraintType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:258:1: ( ( ( rule__CrossTreeConstraintType__Alternatives ) ) )
            // InternalFeatureModel.g:259:2: ( ( rule__CrossTreeConstraintType__Alternatives ) )
            {
            // InternalFeatureModel.g:259:2: ( ( rule__CrossTreeConstraintType__Alternatives ) )
            // InternalFeatureModel.g:260:3: ( rule__CrossTreeConstraintType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCrossTreeConstraintTypeAccess().getAlternatives()); 
            }
            // InternalFeatureModel.g:261:3: ( rule__CrossTreeConstraintType__Alternatives )
            // InternalFeatureModel.g:261:4: rule__CrossTreeConstraintType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CrossTreeConstraintType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCrossTreeConstraintTypeAccess().getAlternatives()); 
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
    // $ANTLR end "ruleCrossTreeConstraintType"


    // $ANTLR start "rule__Feature__Alternatives"
    // InternalFeatureModel.g:269:1: rule__Feature__Alternatives : ( ( ruleFeature_Impl ) | ( ruleAlternative ) | ( ruleOrGroup ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:273:1: ( ( ruleFeature_Impl ) | ( ruleAlternative ) | ( ruleOrGroup ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                switch ( input.LA(2) ) {
                case 26:
                    {
                    switch ( input.LA(3) ) {
                    case 30:
                        {
                        alt1=3;
                        }
                        break;
                    case 26:
                        {
                        switch ( input.LA(4) ) {
                        case 30:
                            {
                            alt1=3;
                            }
                            break;
                        case 23:
                            {
                            alt1=1;
                            }
                            break;
                        case 29:
                            {
                            alt1=2;
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
                    case 23:
                        {
                        alt1=1;
                        }
                        break;
                    case 29:
                        {
                        alt1=2;
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
                case 29:
                    {
                    alt1=2;
                    }
                    break;
                case 25:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                        {
                        switch ( input.LA(4) ) {
                        case 30:
                            {
                            alt1=3;
                            }
                            break;
                        case 26:
                            {
                            switch ( input.LA(5) ) {
                            case 30:
                                {
                                alt1=3;
                                }
                                break;
                            case 23:
                                {
                                alt1=1;
                                }
                                break;
                            case 29:
                                {
                                alt1=2;
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
                        case 23:
                            {
                            alt1=1;
                            }
                            break;
                        case 29:
                            {
                            alt1=2;
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
                    case 29:
                        {
                        alt1=2;
                        }
                        break;
                    case 30:
                        {
                        alt1=3;
                        }
                        break;
                    case 23:
                        {
                        alt1=1;
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
                case 30:
                    {
                    alt1=3;
                    }
                    break;
                case 23:
                    {
                    alt1=1;
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
            case 26:
                {
                switch ( input.LA(2) ) {
                case 30:
                    {
                    alt1=3;
                    }
                    break;
                case 26:
                    {
                    switch ( input.LA(3) ) {
                    case 30:
                        {
                        alt1=3;
                        }
                        break;
                    case 23:
                        {
                        alt1=1;
                        }
                        break;
                    case 29:
                        {
                        alt1=2;
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
                case 23:
                    {
                    alt1=1;
                    }
                    break;
                case 29:
                    {
                    alt1=2;
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
            case 23:
                {
                alt1=1;
                }
                break;
            case 29:
                {
                alt1=2;
                }
                break;
            case 30:
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
                    // InternalFeatureModel.g:274:2: ( ruleFeature_Impl )
                    {
                    // InternalFeatureModel.g:274:2: ( ruleFeature_Impl )
                    // InternalFeatureModel.g:275:3: ruleFeature_Impl
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
                    // InternalFeatureModel.g:280:2: ( ruleAlternative )
                    {
                    // InternalFeatureModel.g:280:2: ( ruleAlternative )
                    // InternalFeatureModel.g:281:3: ruleAlternative
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
                    // InternalFeatureModel.g:286:2: ( ruleOrGroup )
                    {
                    // InternalFeatureModel.g:286:2: ( ruleOrGroup )
                    // InternalFeatureModel.g:287:3: ruleOrGroup
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
    // InternalFeatureModel.g:296:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:300:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalFeatureModel.g:301:2: ( RULE_STRING )
                    {
                    // InternalFeatureModel.g:301:2: ( RULE_STRING )
                    // InternalFeatureModel.g:302:3: RULE_STRING
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
                    // InternalFeatureModel.g:307:2: ( RULE_ID )
                    {
                    // InternalFeatureModel.g:307:2: ( RULE_ID )
                    // InternalFeatureModel.g:308:3: RULE_ID
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


    // $ANTLR start "rule__CrossTreeConstraintType__Alternatives"
    // InternalFeatureModel.g:317:1: rule__CrossTreeConstraintType__Alternatives : ( ( ( 'REQUIRES' ) ) | ( ( 'EXCLUDES' ) ) );
    public final void rule__CrossTreeConstraintType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:321:1: ( ( ( 'REQUIRES' ) ) | ( ( 'EXCLUDES' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFeatureModel.g:322:2: ( ( 'REQUIRES' ) )
                    {
                    // InternalFeatureModel.g:322:2: ( ( 'REQUIRES' ) )
                    // InternalFeatureModel.g:323:3: ( 'REQUIRES' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCrossTreeConstraintTypeAccess().getREQUIRESEnumLiteralDeclaration_0()); 
                    }
                    // InternalFeatureModel.g:324:3: ( 'REQUIRES' )
                    // InternalFeatureModel.g:324:4: 'REQUIRES'
                    {
                    match(input,11,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCrossTreeConstraintTypeAccess().getREQUIRESEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:328:2: ( ( 'EXCLUDES' ) )
                    {
                    // InternalFeatureModel.g:328:2: ( ( 'EXCLUDES' ) )
                    // InternalFeatureModel.g:329:3: ( 'EXCLUDES' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getCrossTreeConstraintTypeAccess().getEXCLUDESEnumLiteralDeclaration_1()); 
                    }
                    // InternalFeatureModel.g:330:3: ( 'EXCLUDES' )
                    // InternalFeatureModel.g:330:4: 'EXCLUDES'
                    {
                    match(input,12,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getCrossTreeConstraintTypeAccess().getEXCLUDESEnumLiteralDeclaration_1()); 
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
    // $ANTLR end "rule__CrossTreeConstraintType__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalFeatureModel.g:338:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:342:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFeatureModel.g:343:2: rule__Model__Group__0__Impl rule__Model__Group__1
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
    // InternalFeatureModel.g:350:1: rule__Model__Group__0__Impl : ( 'feature_model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:354:1: ( ( 'feature_model' ) )
            // InternalFeatureModel.g:355:1: ( 'feature_model' )
            {
            // InternalFeatureModel.g:355:1: ( 'feature_model' )
            // InternalFeatureModel.g:356:2: 'feature_model'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFeature_modelKeyword_0()); 
            }
            match(input,13,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:365:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:369:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalFeatureModel.g:370:2: rule__Model__Group__1__Impl rule__Model__Group__2
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
    // InternalFeatureModel.g:377:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:381:1: ( ( '{' ) )
            // InternalFeatureModel.g:382:1: ( '{' )
            {
            // InternalFeatureModel.g:382:1: ( '{' )
            // InternalFeatureModel.g:383:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:392:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:396:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalFeatureModel.g:397:2: rule__Model__Group__2__Impl rule__Model__Group__3
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
    // InternalFeatureModel.g:404:1: rule__Model__Group__2__Impl : ( ( rule__Model__FmAssignment_2 ) ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:408:1: ( ( ( rule__Model__FmAssignment_2 ) ) )
            // InternalFeatureModel.g:409:1: ( ( rule__Model__FmAssignment_2 ) )
            {
            // InternalFeatureModel.g:409:1: ( ( rule__Model__FmAssignment_2 ) )
            // InternalFeatureModel.g:410:2: ( rule__Model__FmAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getFmAssignment_2()); 
            }
            // InternalFeatureModel.g:411:2: ( rule__Model__FmAssignment_2 )
            // InternalFeatureModel.g:411:3: rule__Model__FmAssignment_2
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
    // InternalFeatureModel.g:419:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:423:1: ( rule__Model__Group__3__Impl )
            // InternalFeatureModel.g:424:2: rule__Model__Group__3__Impl
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
    // InternalFeatureModel.g:430:1: rule__Model__Group__3__Impl : ( '}' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:434:1: ( ( '}' ) )
            // InternalFeatureModel.g:435:1: ( '}' )
            {
            // InternalFeatureModel.g:435:1: ( '}' )
            // InternalFeatureModel.g:436:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:446:1: rule__FeatureModel__Group__0 : rule__FeatureModel__Group__0__Impl rule__FeatureModel__Group__1 ;
    public final void rule__FeatureModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:450:1: ( rule__FeatureModel__Group__0__Impl rule__FeatureModel__Group__1 )
            // InternalFeatureModel.g:451:2: rule__FeatureModel__Group__0__Impl rule__FeatureModel__Group__1
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
    // InternalFeatureModel.g:458:1: rule__FeatureModel__Group__0__Impl : ( 'name' ) ;
    public final void rule__FeatureModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:462:1: ( ( 'name' ) )
            // InternalFeatureModel.g:463:1: ( 'name' )
            {
            // InternalFeatureModel.g:463:1: ( 'name' )
            // InternalFeatureModel.g:464:2: 'name'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getNameKeyword_0()); 
            }
            match(input,16,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:473:1: rule__FeatureModel__Group__1 : rule__FeatureModel__Group__1__Impl rule__FeatureModel__Group__2 ;
    public final void rule__FeatureModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:477:1: ( rule__FeatureModel__Group__1__Impl rule__FeatureModel__Group__2 )
            // InternalFeatureModel.g:478:2: rule__FeatureModel__Group__1__Impl rule__FeatureModel__Group__2
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
    // InternalFeatureModel.g:485:1: rule__FeatureModel__Group__1__Impl : ( ( rule__FeatureModel__NameAssignment_1 ) ) ;
    public final void rule__FeatureModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:489:1: ( ( ( rule__FeatureModel__NameAssignment_1 ) ) )
            // InternalFeatureModel.g:490:1: ( ( rule__FeatureModel__NameAssignment_1 ) )
            {
            // InternalFeatureModel.g:490:1: ( ( rule__FeatureModel__NameAssignment_1 ) )
            // InternalFeatureModel.g:491:2: ( rule__FeatureModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getNameAssignment_1()); 
            }
            // InternalFeatureModel.g:492:2: ( rule__FeatureModel__NameAssignment_1 )
            // InternalFeatureModel.g:492:3: rule__FeatureModel__NameAssignment_1
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
    // InternalFeatureModel.g:500:1: rule__FeatureModel__Group__2 : rule__FeatureModel__Group__2__Impl rule__FeatureModel__Group__3 ;
    public final void rule__FeatureModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:504:1: ( rule__FeatureModel__Group__2__Impl rule__FeatureModel__Group__3 )
            // InternalFeatureModel.g:505:2: rule__FeatureModel__Group__2__Impl rule__FeatureModel__Group__3
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
    // InternalFeatureModel.g:512:1: rule__FeatureModel__Group__2__Impl : ( 'root' ) ;
    public final void rule__FeatureModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:516:1: ( ( 'root' ) )
            // InternalFeatureModel.g:517:1: ( 'root' )
            {
            // InternalFeatureModel.g:517:1: ( 'root' )
            // InternalFeatureModel.g:518:2: 'root'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getRootKeyword_2()); 
            }
            match(input,17,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:527:1: rule__FeatureModel__Group__3 : rule__FeatureModel__Group__3__Impl rule__FeatureModel__Group__4 ;
    public final void rule__FeatureModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:531:1: ( rule__FeatureModel__Group__3__Impl rule__FeatureModel__Group__4 )
            // InternalFeatureModel.g:532:2: rule__FeatureModel__Group__3__Impl rule__FeatureModel__Group__4
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
    // InternalFeatureModel.g:539:1: rule__FeatureModel__Group__3__Impl : ( ( rule__FeatureModel__RootAssignment_3 ) ) ;
    public final void rule__FeatureModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:543:1: ( ( ( rule__FeatureModel__RootAssignment_3 ) ) )
            // InternalFeatureModel.g:544:1: ( ( rule__FeatureModel__RootAssignment_3 ) )
            {
            // InternalFeatureModel.g:544:1: ( ( rule__FeatureModel__RootAssignment_3 ) )
            // InternalFeatureModel.g:545:2: ( rule__FeatureModel__RootAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getRootAssignment_3()); 
            }
            // InternalFeatureModel.g:546:2: ( rule__FeatureModel__RootAssignment_3 )
            // InternalFeatureModel.g:546:3: rule__FeatureModel__RootAssignment_3
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
    // InternalFeatureModel.g:554:1: rule__FeatureModel__Group__4 : rule__FeatureModel__Group__4__Impl rule__FeatureModel__Group__5 ;
    public final void rule__FeatureModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:558:1: ( rule__FeatureModel__Group__4__Impl rule__FeatureModel__Group__5 )
            // InternalFeatureModel.g:559:2: rule__FeatureModel__Group__4__Impl rule__FeatureModel__Group__5
            {
            pushFollow(FOLLOW_10);
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
    // InternalFeatureModel.g:566:1: rule__FeatureModel__Group__4__Impl : ( 'crossTreeConstraints' ) ;
    public final void rule__FeatureModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:570:1: ( ( 'crossTreeConstraints' ) )
            // InternalFeatureModel.g:571:1: ( 'crossTreeConstraints' )
            {
            // InternalFeatureModel.g:571:1: ( 'crossTreeConstraints' )
            // InternalFeatureModel.g:572:2: 'crossTreeConstraints'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsKeyword_4()); 
            }
            match(input,18,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:581:1: rule__FeatureModel__Group__5 : rule__FeatureModel__Group__5__Impl ;
    public final void rule__FeatureModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:585:1: ( rule__FeatureModel__Group__5__Impl )
            // InternalFeatureModel.g:586:2: rule__FeatureModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__5__Impl();

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
    // InternalFeatureModel.g:592:1: rule__FeatureModel__Group__5__Impl : ( ( rule__FeatureModel__CrossTreeConstraintsAssignment_5 )* ) ;
    public final void rule__FeatureModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:596:1: ( ( ( rule__FeatureModel__CrossTreeConstraintsAssignment_5 )* ) )
            // InternalFeatureModel.g:597:1: ( ( rule__FeatureModel__CrossTreeConstraintsAssignment_5 )* )
            {
            // InternalFeatureModel.g:597:1: ( ( rule__FeatureModel__CrossTreeConstraintsAssignment_5 )* )
            // InternalFeatureModel.g:598:2: ( rule__FeatureModel__CrossTreeConstraintsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsAssignment_5()); 
            }
            // InternalFeatureModel.g:599:2: ( rule__FeatureModel__CrossTreeConstraintsAssignment_5 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFeatureModel.g:599:3: rule__FeatureModel__CrossTreeConstraintsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__FeatureModel__CrossTreeConstraintsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsAssignment_5()); 
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


    // $ANTLR start "rule__BasicConstraint__Group__0"
    // InternalFeatureModel.g:608:1: rule__BasicConstraint__Group__0 : rule__BasicConstraint__Group__0__Impl rule__BasicConstraint__Group__1 ;
    public final void rule__BasicConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:612:1: ( rule__BasicConstraint__Group__0__Impl rule__BasicConstraint__Group__1 )
            // InternalFeatureModel.g:613:2: rule__BasicConstraint__Group__0__Impl rule__BasicConstraint__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BasicConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__1();

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
    // $ANTLR end "rule__BasicConstraint__Group__0"


    // $ANTLR start "rule__BasicConstraint__Group__0__Impl"
    // InternalFeatureModel.g:620:1: rule__BasicConstraint__Group__0__Impl : ( 'BasicConstraint' ) ;
    public final void rule__BasicConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:624:1: ( ( 'BasicConstraint' ) )
            // InternalFeatureModel.g:625:1: ( 'BasicConstraint' )
            {
            // InternalFeatureModel.g:625:1: ( 'BasicConstraint' )
            // InternalFeatureModel.g:626:2: 'BasicConstraint'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getBasicConstraintKeyword_0()); 
            }
            match(input,19,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getBasicConstraintKeyword_0()); 
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
    // $ANTLR end "rule__BasicConstraint__Group__0__Impl"


    // $ANTLR start "rule__BasicConstraint__Group__1"
    // InternalFeatureModel.g:635:1: rule__BasicConstraint__Group__1 : rule__BasicConstraint__Group__1__Impl rule__BasicConstraint__Group__2 ;
    public final void rule__BasicConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:639:1: ( rule__BasicConstraint__Group__1__Impl rule__BasicConstraint__Group__2 )
            // InternalFeatureModel.g:640:2: rule__BasicConstraint__Group__1__Impl rule__BasicConstraint__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__BasicConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__2();

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
    // $ANTLR end "rule__BasicConstraint__Group__1"


    // $ANTLR start "rule__BasicConstraint__Group__1__Impl"
    // InternalFeatureModel.g:647:1: rule__BasicConstraint__Group__1__Impl : ( '{' ) ;
    public final void rule__BasicConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:651:1: ( ( '{' ) )
            // InternalFeatureModel.g:652:1: ( '{' )
            {
            // InternalFeatureModel.g:652:1: ( '{' )
            // InternalFeatureModel.g:653:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getLeftCurlyBracketKeyword_1()); 
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
    // $ANTLR end "rule__BasicConstraint__Group__1__Impl"


    // $ANTLR start "rule__BasicConstraint__Group__2"
    // InternalFeatureModel.g:662:1: rule__BasicConstraint__Group__2 : rule__BasicConstraint__Group__2__Impl rule__BasicConstraint__Group__3 ;
    public final void rule__BasicConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:666:1: ( rule__BasicConstraint__Group__2__Impl rule__BasicConstraint__Group__3 )
            // InternalFeatureModel.g:667:2: rule__BasicConstraint__Group__2__Impl rule__BasicConstraint__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__BasicConstraint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__3();

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
    // $ANTLR end "rule__BasicConstraint__Group__2"


    // $ANTLR start "rule__BasicConstraint__Group__2__Impl"
    // InternalFeatureModel.g:674:1: rule__BasicConstraint__Group__2__Impl : ( 'type' ) ;
    public final void rule__BasicConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:678:1: ( ( 'type' ) )
            // InternalFeatureModel.g:679:1: ( 'type' )
            {
            // InternalFeatureModel.g:679:1: ( 'type' )
            // InternalFeatureModel.g:680:2: 'type'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getTypeKeyword_2()); 
            }
            match(input,20,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getTypeKeyword_2()); 
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
    // $ANTLR end "rule__BasicConstraint__Group__2__Impl"


    // $ANTLR start "rule__BasicConstraint__Group__3"
    // InternalFeatureModel.g:689:1: rule__BasicConstraint__Group__3 : rule__BasicConstraint__Group__3__Impl rule__BasicConstraint__Group__4 ;
    public final void rule__BasicConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:693:1: ( rule__BasicConstraint__Group__3__Impl rule__BasicConstraint__Group__4 )
            // InternalFeatureModel.g:694:2: rule__BasicConstraint__Group__3__Impl rule__BasicConstraint__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__BasicConstraint__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__4();

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
    // $ANTLR end "rule__BasicConstraint__Group__3"


    // $ANTLR start "rule__BasicConstraint__Group__3__Impl"
    // InternalFeatureModel.g:701:1: rule__BasicConstraint__Group__3__Impl : ( ( rule__BasicConstraint__TypeAssignment_3 ) ) ;
    public final void rule__BasicConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:705:1: ( ( ( rule__BasicConstraint__TypeAssignment_3 ) ) )
            // InternalFeatureModel.g:706:1: ( ( rule__BasicConstraint__TypeAssignment_3 ) )
            {
            // InternalFeatureModel.g:706:1: ( ( rule__BasicConstraint__TypeAssignment_3 ) )
            // InternalFeatureModel.g:707:2: ( rule__BasicConstraint__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getTypeAssignment_3()); 
            }
            // InternalFeatureModel.g:708:2: ( rule__BasicConstraint__TypeAssignment_3 )
            // InternalFeatureModel.g:708:3: rule__BasicConstraint__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getTypeAssignment_3()); 
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
    // $ANTLR end "rule__BasicConstraint__Group__3__Impl"


    // $ANTLR start "rule__BasicConstraint__Group__4"
    // InternalFeatureModel.g:716:1: rule__BasicConstraint__Group__4 : rule__BasicConstraint__Group__4__Impl rule__BasicConstraint__Group__5 ;
    public final void rule__BasicConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:720:1: ( rule__BasicConstraint__Group__4__Impl rule__BasicConstraint__Group__5 )
            // InternalFeatureModel.g:721:2: rule__BasicConstraint__Group__4__Impl rule__BasicConstraint__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__BasicConstraint__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__5();

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
    // $ANTLR end "rule__BasicConstraint__Group__4"


    // $ANTLR start "rule__BasicConstraint__Group__4__Impl"
    // InternalFeatureModel.g:728:1: rule__BasicConstraint__Group__4__Impl : ( 'rightFeature' ) ;
    public final void rule__BasicConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:732:1: ( ( 'rightFeature' ) )
            // InternalFeatureModel.g:733:1: ( 'rightFeature' )
            {
            // InternalFeatureModel.g:733:1: ( 'rightFeature' )
            // InternalFeatureModel.g:734:2: 'rightFeature'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getRightFeatureKeyword_4()); 
            }
            match(input,21,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getRightFeatureKeyword_4()); 
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
    // $ANTLR end "rule__BasicConstraint__Group__4__Impl"


    // $ANTLR start "rule__BasicConstraint__Group__5"
    // InternalFeatureModel.g:743:1: rule__BasicConstraint__Group__5 : rule__BasicConstraint__Group__5__Impl rule__BasicConstraint__Group__6 ;
    public final void rule__BasicConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:747:1: ( rule__BasicConstraint__Group__5__Impl rule__BasicConstraint__Group__6 )
            // InternalFeatureModel.g:748:2: rule__BasicConstraint__Group__5__Impl rule__BasicConstraint__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__BasicConstraint__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__6();

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
    // $ANTLR end "rule__BasicConstraint__Group__5"


    // $ANTLR start "rule__BasicConstraint__Group__5__Impl"
    // InternalFeatureModel.g:755:1: rule__BasicConstraint__Group__5__Impl : ( ( rule__BasicConstraint__RightFeatureAssignment_5 ) ) ;
    public final void rule__BasicConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:759:1: ( ( ( rule__BasicConstraint__RightFeatureAssignment_5 ) ) )
            // InternalFeatureModel.g:760:1: ( ( rule__BasicConstraint__RightFeatureAssignment_5 ) )
            {
            // InternalFeatureModel.g:760:1: ( ( rule__BasicConstraint__RightFeatureAssignment_5 ) )
            // InternalFeatureModel.g:761:2: ( rule__BasicConstraint__RightFeatureAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getRightFeatureAssignment_5()); 
            }
            // InternalFeatureModel.g:762:2: ( rule__BasicConstraint__RightFeatureAssignment_5 )
            // InternalFeatureModel.g:762:3: rule__BasicConstraint__RightFeatureAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__RightFeatureAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getRightFeatureAssignment_5()); 
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
    // $ANTLR end "rule__BasicConstraint__Group__5__Impl"


    // $ANTLR start "rule__BasicConstraint__Group__6"
    // InternalFeatureModel.g:770:1: rule__BasicConstraint__Group__6 : rule__BasicConstraint__Group__6__Impl rule__BasicConstraint__Group__7 ;
    public final void rule__BasicConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:774:1: ( rule__BasicConstraint__Group__6__Impl rule__BasicConstraint__Group__7 )
            // InternalFeatureModel.g:775:2: rule__BasicConstraint__Group__6__Impl rule__BasicConstraint__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__BasicConstraint__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__7();

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
    // $ANTLR end "rule__BasicConstraint__Group__6"


    // $ANTLR start "rule__BasicConstraint__Group__6__Impl"
    // InternalFeatureModel.g:782:1: rule__BasicConstraint__Group__6__Impl : ( 'leftFeature' ) ;
    public final void rule__BasicConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:786:1: ( ( 'leftFeature' ) )
            // InternalFeatureModel.g:787:1: ( 'leftFeature' )
            {
            // InternalFeatureModel.g:787:1: ( 'leftFeature' )
            // InternalFeatureModel.g:788:2: 'leftFeature'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getLeftFeatureKeyword_6()); 
            }
            match(input,22,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getLeftFeatureKeyword_6()); 
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
    // $ANTLR end "rule__BasicConstraint__Group__6__Impl"


    // $ANTLR start "rule__BasicConstraint__Group__7"
    // InternalFeatureModel.g:797:1: rule__BasicConstraint__Group__7 : rule__BasicConstraint__Group__7__Impl rule__BasicConstraint__Group__8 ;
    public final void rule__BasicConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:801:1: ( rule__BasicConstraint__Group__7__Impl rule__BasicConstraint__Group__8 )
            // InternalFeatureModel.g:802:2: rule__BasicConstraint__Group__7__Impl rule__BasicConstraint__Group__8
            {
            pushFollow(FOLLOW_5);
            rule__BasicConstraint__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__8();

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
    // $ANTLR end "rule__BasicConstraint__Group__7"


    // $ANTLR start "rule__BasicConstraint__Group__7__Impl"
    // InternalFeatureModel.g:809:1: rule__BasicConstraint__Group__7__Impl : ( ( rule__BasicConstraint__LeftFeatureAssignment_7 ) ) ;
    public final void rule__BasicConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:813:1: ( ( ( rule__BasicConstraint__LeftFeatureAssignment_7 ) ) )
            // InternalFeatureModel.g:814:1: ( ( rule__BasicConstraint__LeftFeatureAssignment_7 ) )
            {
            // InternalFeatureModel.g:814:1: ( ( rule__BasicConstraint__LeftFeatureAssignment_7 ) )
            // InternalFeatureModel.g:815:2: ( rule__BasicConstraint__LeftFeatureAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getLeftFeatureAssignment_7()); 
            }
            // InternalFeatureModel.g:816:2: ( rule__BasicConstraint__LeftFeatureAssignment_7 )
            // InternalFeatureModel.g:816:3: rule__BasicConstraint__LeftFeatureAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__LeftFeatureAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getLeftFeatureAssignment_7()); 
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
    // $ANTLR end "rule__BasicConstraint__Group__7__Impl"


    // $ANTLR start "rule__BasicConstraint__Group__8"
    // InternalFeatureModel.g:824:1: rule__BasicConstraint__Group__8 : rule__BasicConstraint__Group__8__Impl ;
    public final void rule__BasicConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:828:1: ( rule__BasicConstraint__Group__8__Impl )
            // InternalFeatureModel.g:829:2: rule__BasicConstraint__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__8__Impl();

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
    // $ANTLR end "rule__BasicConstraint__Group__8"


    // $ANTLR start "rule__BasicConstraint__Group__8__Impl"
    // InternalFeatureModel.g:835:1: rule__BasicConstraint__Group__8__Impl : ( '}' ) ;
    public final void rule__BasicConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:839:1: ( ( '}' ) )
            // InternalFeatureModel.g:840:1: ( '}' )
            {
            // InternalFeatureModel.g:840:1: ( '}' )
            // InternalFeatureModel.g:841:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getRightCurlyBracketKeyword_8()); 
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
    // $ANTLR end "rule__BasicConstraint__Group__8__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__0"
    // InternalFeatureModel.g:851:1: rule__Feature_Impl__Group__0 : rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 ;
    public final void rule__Feature_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:855:1: ( rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 )
            // InternalFeatureModel.g:856:2: rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalFeatureModel.g:863:1: rule__Feature_Impl__Group__0__Impl : ( ( rule__Feature_Impl__Group_0__0 )? ) ;
    public final void rule__Feature_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:867:1: ( ( ( rule__Feature_Impl__Group_0__0 )? ) )
            // InternalFeatureModel.g:868:1: ( ( rule__Feature_Impl__Group_0__0 )? )
            {
            // InternalFeatureModel.g:868:1: ( ( rule__Feature_Impl__Group_0__0 )? )
            // InternalFeatureModel.g:869:2: ( rule__Feature_Impl__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getGroup_0()); 
            }
            // InternalFeatureModel.g:870:2: ( rule__Feature_Impl__Group_0__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalFeatureModel.g:870:3: rule__Feature_Impl__Group_0__0
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
    // InternalFeatureModel.g:878:1: rule__Feature_Impl__Group__1 : rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 ;
    public final void rule__Feature_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:882:1: ( rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 )
            // InternalFeatureModel.g:883:2: rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalFeatureModel.g:890:1: rule__Feature_Impl__Group__1__Impl : ( ( rule__Feature_Impl__Group_1__0 )? ) ;
    public final void rule__Feature_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:894:1: ( ( ( rule__Feature_Impl__Group_1__0 )? ) )
            // InternalFeatureModel.g:895:1: ( ( rule__Feature_Impl__Group_1__0 )? )
            {
            // InternalFeatureModel.g:895:1: ( ( rule__Feature_Impl__Group_1__0 )? )
            // InternalFeatureModel.g:896:2: ( rule__Feature_Impl__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getGroup_1()); 
            }
            // InternalFeatureModel.g:897:2: ( rule__Feature_Impl__Group_1__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureModel.g:897:3: rule__Feature_Impl__Group_1__0
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
    // InternalFeatureModel.g:905:1: rule__Feature_Impl__Group__2 : rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 ;
    public final void rule__Feature_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:909:1: ( rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 )
            // InternalFeatureModel.g:910:2: rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3
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
    // InternalFeatureModel.g:917:1: rule__Feature_Impl__Group__2__Impl : ( 'Feature' ) ;
    public final void rule__Feature_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:921:1: ( ( 'Feature' ) )
            // InternalFeatureModel.g:922:1: ( 'Feature' )
            {
            // InternalFeatureModel.g:922:1: ( 'Feature' )
            // InternalFeatureModel.g:923:2: 'Feature'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getFeatureKeyword_2()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:932:1: rule__Feature_Impl__Group__3 : rule__Feature_Impl__Group__3__Impl rule__Feature_Impl__Group__4 ;
    public final void rule__Feature_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:936:1: ( rule__Feature_Impl__Group__3__Impl rule__Feature_Impl__Group__4 )
            // InternalFeatureModel.g:937:2: rule__Feature_Impl__Group__3__Impl rule__Feature_Impl__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalFeatureModel.g:944:1: rule__Feature_Impl__Group__3__Impl : ( ( rule__Feature_Impl__NameAssignment_3 ) ) ;
    public final void rule__Feature_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:948:1: ( ( ( rule__Feature_Impl__NameAssignment_3 ) ) )
            // InternalFeatureModel.g:949:1: ( ( rule__Feature_Impl__NameAssignment_3 ) )
            {
            // InternalFeatureModel.g:949:1: ( ( rule__Feature_Impl__NameAssignment_3 ) )
            // InternalFeatureModel.g:950:2: ( rule__Feature_Impl__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getNameAssignment_3()); 
            }
            // InternalFeatureModel.g:951:2: ( rule__Feature_Impl__NameAssignment_3 )
            // InternalFeatureModel.g:951:3: rule__Feature_Impl__NameAssignment_3
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
    // InternalFeatureModel.g:959:1: rule__Feature_Impl__Group__4 : rule__Feature_Impl__Group__4__Impl rule__Feature_Impl__Group__5 ;
    public final void rule__Feature_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:963:1: ( rule__Feature_Impl__Group__4__Impl rule__Feature_Impl__Group__5 )
            // InternalFeatureModel.g:964:2: rule__Feature_Impl__Group__4__Impl rule__Feature_Impl__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalFeatureModel.g:971:1: rule__Feature_Impl__Group__4__Impl : ( '{' ) ;
    public final void rule__Feature_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:975:1: ( ( '{' ) )
            // InternalFeatureModel.g:976:1: ( '{' )
            {
            // InternalFeatureModel.g:976:1: ( '{' )
            // InternalFeatureModel.g:977:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_4()); 
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
    // InternalFeatureModel.g:986:1: rule__Feature_Impl__Group__5 : rule__Feature_Impl__Group__5__Impl rule__Feature_Impl__Group__6 ;
    public final void rule__Feature_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:990:1: ( rule__Feature_Impl__Group__5__Impl rule__Feature_Impl__Group__6 )
            // InternalFeatureModel.g:991:2: rule__Feature_Impl__Group__5__Impl rule__Feature_Impl__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalFeatureModel.g:998:1: rule__Feature_Impl__Group__5__Impl : ( 'id' ) ;
    public final void rule__Feature_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1002:1: ( ( 'id' ) )
            // InternalFeatureModel.g:1003:1: ( 'id' )
            {
            // InternalFeatureModel.g:1003:1: ( 'id' )
            // InternalFeatureModel.g:1004:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getIdKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getIdKeyword_5()); 
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
    // InternalFeatureModel.g:1013:1: rule__Feature_Impl__Group__6 : rule__Feature_Impl__Group__6__Impl rule__Feature_Impl__Group__7 ;
    public final void rule__Feature_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1017:1: ( rule__Feature_Impl__Group__6__Impl rule__Feature_Impl__Group__7 )
            // InternalFeatureModel.g:1018:2: rule__Feature_Impl__Group__6__Impl rule__Feature_Impl__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Feature_Impl__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__7();

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
    // InternalFeatureModel.g:1025:1: rule__Feature_Impl__Group__6__Impl : ( ( rule__Feature_Impl__IdAssignment_6 ) ) ;
    public final void rule__Feature_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1029:1: ( ( ( rule__Feature_Impl__IdAssignment_6 ) ) )
            // InternalFeatureModel.g:1030:1: ( ( rule__Feature_Impl__IdAssignment_6 ) )
            {
            // InternalFeatureModel.g:1030:1: ( ( rule__Feature_Impl__IdAssignment_6 ) )
            // InternalFeatureModel.g:1031:2: ( rule__Feature_Impl__IdAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getIdAssignment_6()); 
            }
            // InternalFeatureModel.g:1032:2: ( rule__Feature_Impl__IdAssignment_6 )
            // InternalFeatureModel.g:1032:3: rule__Feature_Impl__IdAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__IdAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getIdAssignment_6()); 
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


    // $ANTLR start "rule__Feature_Impl__Group__7"
    // InternalFeatureModel.g:1040:1: rule__Feature_Impl__Group__7 : rule__Feature_Impl__Group__7__Impl rule__Feature_Impl__Group__8 ;
    public final void rule__Feature_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1044:1: ( rule__Feature_Impl__Group__7__Impl rule__Feature_Impl__Group__8 )
            // InternalFeatureModel.g:1045:2: rule__Feature_Impl__Group__7__Impl rule__Feature_Impl__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Feature_Impl__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__8();

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
    // $ANTLR end "rule__Feature_Impl__Group__7"


    // $ANTLR start "rule__Feature_Impl__Group__7__Impl"
    // InternalFeatureModel.g:1052:1: rule__Feature_Impl__Group__7__Impl : ( ( rule__Feature_Impl__Group_7__0 )? ) ;
    public final void rule__Feature_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1056:1: ( ( ( rule__Feature_Impl__Group_7__0 )? ) )
            // InternalFeatureModel.g:1057:1: ( ( rule__Feature_Impl__Group_7__0 )? )
            {
            // InternalFeatureModel.g:1057:1: ( ( rule__Feature_Impl__Group_7__0 )? )
            // InternalFeatureModel.g:1058:2: ( rule__Feature_Impl__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getGroup_7()); 
            }
            // InternalFeatureModel.g:1059:2: ( rule__Feature_Impl__Group_7__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==27) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalFeatureModel.g:1059:3: rule__Feature_Impl__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature_Impl__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getGroup_7()); 
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
    // $ANTLR end "rule__Feature_Impl__Group__7__Impl"


    // $ANTLR start "rule__Feature_Impl__Group__8"
    // InternalFeatureModel.g:1067:1: rule__Feature_Impl__Group__8 : rule__Feature_Impl__Group__8__Impl ;
    public final void rule__Feature_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1071:1: ( rule__Feature_Impl__Group__8__Impl )
            // InternalFeatureModel.g:1072:2: rule__Feature_Impl__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__8__Impl();

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
    // $ANTLR end "rule__Feature_Impl__Group__8"


    // $ANTLR start "rule__Feature_Impl__Group__8__Impl"
    // InternalFeatureModel.g:1078:1: rule__Feature_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__Feature_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1082:1: ( ( '}' ) )
            // InternalFeatureModel.g:1083:1: ( '}' )
            {
            // InternalFeatureModel.g:1083:1: ( '}' )
            // InternalFeatureModel.g:1084:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_8()); 
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
    // $ANTLR end "rule__Feature_Impl__Group__8__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_0__0"
    // InternalFeatureModel.g:1094:1: rule__Feature_Impl__Group_0__0 : rule__Feature_Impl__Group_0__0__Impl rule__Feature_Impl__Group_0__1 ;
    public final void rule__Feature_Impl__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1098:1: ( rule__Feature_Impl__Group_0__0__Impl rule__Feature_Impl__Group_0__1 )
            // InternalFeatureModel.g:1099:2: rule__Feature_Impl__Group_0__0__Impl rule__Feature_Impl__Group_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFeatureModel.g:1106:1: rule__Feature_Impl__Group_0__0__Impl : ( ( 'mandatory' )? ) ;
    public final void rule__Feature_Impl__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1110:1: ( ( ( 'mandatory' )? ) )
            // InternalFeatureModel.g:1111:1: ( ( 'mandatory' )? )
            {
            // InternalFeatureModel.g:1111:1: ( ( 'mandatory' )? )
            // InternalFeatureModel.g:1112:2: ( 'mandatory' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getMandatoryKeyword_0_0()); 
            }
            // InternalFeatureModel.g:1113:2: ( 'mandatory' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==25) ) {
                    alt8=1;
                }
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureModel.g:1113:3: 'mandatory'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

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
    // InternalFeatureModel.g:1121:1: rule__Feature_Impl__Group_0__1 : rule__Feature_Impl__Group_0__1__Impl ;
    public final void rule__Feature_Impl__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1125:1: ( rule__Feature_Impl__Group_0__1__Impl )
            // InternalFeatureModel.g:1126:2: rule__Feature_Impl__Group_0__1__Impl
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
    // InternalFeatureModel.g:1132:1: rule__Feature_Impl__Group_0__1__Impl : ( ( rule__Feature_Impl__MandatoryAssignment_0_1 ) ) ;
    public final void rule__Feature_Impl__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1136:1: ( ( ( rule__Feature_Impl__MandatoryAssignment_0_1 ) ) )
            // InternalFeatureModel.g:1137:1: ( ( rule__Feature_Impl__MandatoryAssignment_0_1 ) )
            {
            // InternalFeatureModel.g:1137:1: ( ( rule__Feature_Impl__MandatoryAssignment_0_1 ) )
            // InternalFeatureModel.g:1138:2: ( rule__Feature_Impl__MandatoryAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getMandatoryAssignment_0_1()); 
            }
            // InternalFeatureModel.g:1139:2: ( rule__Feature_Impl__MandatoryAssignment_0_1 )
            // InternalFeatureModel.g:1139:3: rule__Feature_Impl__MandatoryAssignment_0_1
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
    // InternalFeatureModel.g:1148:1: rule__Feature_Impl__Group_1__0 : rule__Feature_Impl__Group_1__0__Impl rule__Feature_Impl__Group_1__1 ;
    public final void rule__Feature_Impl__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1152:1: ( rule__Feature_Impl__Group_1__0__Impl rule__Feature_Impl__Group_1__1 )
            // InternalFeatureModel.g:1153:2: rule__Feature_Impl__Group_1__0__Impl rule__Feature_Impl__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFeatureModel.g:1160:1: rule__Feature_Impl__Group_1__0__Impl : ( ( 'selected' )? ) ;
    public final void rule__Feature_Impl__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1164:1: ( ( ( 'selected' )? ) )
            // InternalFeatureModel.g:1165:1: ( ( 'selected' )? )
            {
            // InternalFeatureModel.g:1165:1: ( ( 'selected' )? )
            // InternalFeatureModel.g:1166:2: ( 'selected' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getSelectedKeyword_1_0()); 
            }
            // InternalFeatureModel.g:1167:2: ( 'selected' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==26) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureModel.g:1167:3: 'selected'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

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
    // InternalFeatureModel.g:1175:1: rule__Feature_Impl__Group_1__1 : rule__Feature_Impl__Group_1__1__Impl ;
    public final void rule__Feature_Impl__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1179:1: ( rule__Feature_Impl__Group_1__1__Impl )
            // InternalFeatureModel.g:1180:2: rule__Feature_Impl__Group_1__1__Impl
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
    // InternalFeatureModel.g:1186:1: rule__Feature_Impl__Group_1__1__Impl : ( ( rule__Feature_Impl__SelectedAssignment_1_1 ) ) ;
    public final void rule__Feature_Impl__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1190:1: ( ( ( rule__Feature_Impl__SelectedAssignment_1_1 ) ) )
            // InternalFeatureModel.g:1191:1: ( ( rule__Feature_Impl__SelectedAssignment_1_1 ) )
            {
            // InternalFeatureModel.g:1191:1: ( ( rule__Feature_Impl__SelectedAssignment_1_1 ) )
            // InternalFeatureModel.g:1192:2: ( rule__Feature_Impl__SelectedAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getSelectedAssignment_1_1()); 
            }
            // InternalFeatureModel.g:1193:2: ( rule__Feature_Impl__SelectedAssignment_1_1 )
            // InternalFeatureModel.g:1193:3: rule__Feature_Impl__SelectedAssignment_1_1
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


    // $ANTLR start "rule__Feature_Impl__Group_7__0"
    // InternalFeatureModel.g:1202:1: rule__Feature_Impl__Group_7__0 : rule__Feature_Impl__Group_7__0__Impl rule__Feature_Impl__Group_7__1 ;
    public final void rule__Feature_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1206:1: ( rule__Feature_Impl__Group_7__0__Impl rule__Feature_Impl__Group_7__1 )
            // InternalFeatureModel.g:1207:2: rule__Feature_Impl__Group_7__0__Impl rule__Feature_Impl__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Feature_Impl__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7__1();

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
    // $ANTLR end "rule__Feature_Impl__Group_7__0"


    // $ANTLR start "rule__Feature_Impl__Group_7__0__Impl"
    // InternalFeatureModel.g:1214:1: rule__Feature_Impl__Group_7__0__Impl : ( 'children' ) ;
    public final void rule__Feature_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1218:1: ( ( 'children' ) )
            // InternalFeatureModel.g:1219:1: ( 'children' )
            {
            // InternalFeatureModel.g:1219:1: ( 'children' )
            // InternalFeatureModel.g:1220:2: 'children'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getChildrenKeyword_7_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getChildrenKeyword_7_0()); 
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
    // $ANTLR end "rule__Feature_Impl__Group_7__0__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_7__1"
    // InternalFeatureModel.g:1229:1: rule__Feature_Impl__Group_7__1 : rule__Feature_Impl__Group_7__1__Impl rule__Feature_Impl__Group_7__2 ;
    public final void rule__Feature_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1233:1: ( rule__Feature_Impl__Group_7__1__Impl rule__Feature_Impl__Group_7__2 )
            // InternalFeatureModel.g:1234:2: rule__Feature_Impl__Group_7__1__Impl rule__Feature_Impl__Group_7__2
            {
            pushFollow(FOLLOW_8);
            rule__Feature_Impl__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7__2();

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
    // $ANTLR end "rule__Feature_Impl__Group_7__1"


    // $ANTLR start "rule__Feature_Impl__Group_7__1__Impl"
    // InternalFeatureModel.g:1241:1: rule__Feature_Impl__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Feature_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1245:1: ( ( '{' ) )
            // InternalFeatureModel.g:1246:1: ( '{' )
            {
            // InternalFeatureModel.g:1246:1: ( '{' )
            // InternalFeatureModel.g:1247:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_7_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_7_1()); 
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
    // $ANTLR end "rule__Feature_Impl__Group_7__1__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_7__2"
    // InternalFeatureModel.g:1256:1: rule__Feature_Impl__Group_7__2 : rule__Feature_Impl__Group_7__2__Impl rule__Feature_Impl__Group_7__3 ;
    public final void rule__Feature_Impl__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1260:1: ( rule__Feature_Impl__Group_7__2__Impl rule__Feature_Impl__Group_7__3 )
            // InternalFeatureModel.g:1261:2: rule__Feature_Impl__Group_7__2__Impl rule__Feature_Impl__Group_7__3
            {
            pushFollow(FOLLOW_21);
            rule__Feature_Impl__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7__3();

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
    // $ANTLR end "rule__Feature_Impl__Group_7__2"


    // $ANTLR start "rule__Feature_Impl__Group_7__2__Impl"
    // InternalFeatureModel.g:1268:1: rule__Feature_Impl__Group_7__2__Impl : ( ( rule__Feature_Impl__ChildrenAssignment_7_2 ) ) ;
    public final void rule__Feature_Impl__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1272:1: ( ( ( rule__Feature_Impl__ChildrenAssignment_7_2 ) ) )
            // InternalFeatureModel.g:1273:1: ( ( rule__Feature_Impl__ChildrenAssignment_7_2 ) )
            {
            // InternalFeatureModel.g:1273:1: ( ( rule__Feature_Impl__ChildrenAssignment_7_2 ) )
            // InternalFeatureModel.g:1274:2: ( rule__Feature_Impl__ChildrenAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getChildrenAssignment_7_2()); 
            }
            // InternalFeatureModel.g:1275:2: ( rule__Feature_Impl__ChildrenAssignment_7_2 )
            // InternalFeatureModel.g:1275:3: rule__Feature_Impl__ChildrenAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__ChildrenAssignment_7_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getChildrenAssignment_7_2()); 
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
    // $ANTLR end "rule__Feature_Impl__Group_7__2__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_7__3"
    // InternalFeatureModel.g:1283:1: rule__Feature_Impl__Group_7__3 : rule__Feature_Impl__Group_7__3__Impl rule__Feature_Impl__Group_7__4 ;
    public final void rule__Feature_Impl__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1287:1: ( rule__Feature_Impl__Group_7__3__Impl rule__Feature_Impl__Group_7__4 )
            // InternalFeatureModel.g:1288:2: rule__Feature_Impl__Group_7__3__Impl rule__Feature_Impl__Group_7__4
            {
            pushFollow(FOLLOW_21);
            rule__Feature_Impl__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7__4();

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
    // $ANTLR end "rule__Feature_Impl__Group_7__3"


    // $ANTLR start "rule__Feature_Impl__Group_7__3__Impl"
    // InternalFeatureModel.g:1295:1: rule__Feature_Impl__Group_7__3__Impl : ( ( rule__Feature_Impl__Group_7_3__0 )* ) ;
    public final void rule__Feature_Impl__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1299:1: ( ( ( rule__Feature_Impl__Group_7_3__0 )* ) )
            // InternalFeatureModel.g:1300:1: ( ( rule__Feature_Impl__Group_7_3__0 )* )
            {
            // InternalFeatureModel.g:1300:1: ( ( rule__Feature_Impl__Group_7_3__0 )* )
            // InternalFeatureModel.g:1301:2: ( rule__Feature_Impl__Group_7_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getGroup_7_3()); 
            }
            // InternalFeatureModel.g:1302:2: ( rule__Feature_Impl__Group_7_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==28) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalFeatureModel.g:1302:3: rule__Feature_Impl__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Feature_Impl__Group_7_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getGroup_7_3()); 
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
    // $ANTLR end "rule__Feature_Impl__Group_7__3__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_7__4"
    // InternalFeatureModel.g:1310:1: rule__Feature_Impl__Group_7__4 : rule__Feature_Impl__Group_7__4__Impl ;
    public final void rule__Feature_Impl__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1314:1: ( rule__Feature_Impl__Group_7__4__Impl )
            // InternalFeatureModel.g:1315:2: rule__Feature_Impl__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7__4__Impl();

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
    // $ANTLR end "rule__Feature_Impl__Group_7__4"


    // $ANTLR start "rule__Feature_Impl__Group_7__4__Impl"
    // InternalFeatureModel.g:1321:1: rule__Feature_Impl__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Feature_Impl__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1325:1: ( ( '}' ) )
            // InternalFeatureModel.g:1326:1: ( '}' )
            {
            // InternalFeatureModel.g:1326:1: ( '}' )
            // InternalFeatureModel.g:1327:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_7_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_7_4()); 
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
    // $ANTLR end "rule__Feature_Impl__Group_7__4__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_7_3__0"
    // InternalFeatureModel.g:1337:1: rule__Feature_Impl__Group_7_3__0 : rule__Feature_Impl__Group_7_3__0__Impl rule__Feature_Impl__Group_7_3__1 ;
    public final void rule__Feature_Impl__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1341:1: ( rule__Feature_Impl__Group_7_3__0__Impl rule__Feature_Impl__Group_7_3__1 )
            // InternalFeatureModel.g:1342:2: rule__Feature_Impl__Group_7_3__0__Impl rule__Feature_Impl__Group_7_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Feature_Impl__Group_7_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7_3__1();

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
    // $ANTLR end "rule__Feature_Impl__Group_7_3__0"


    // $ANTLR start "rule__Feature_Impl__Group_7_3__0__Impl"
    // InternalFeatureModel.g:1349:1: rule__Feature_Impl__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Feature_Impl__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1353:1: ( ( ',' ) )
            // InternalFeatureModel.g:1354:1: ( ',' )
            {
            // InternalFeatureModel.g:1354:1: ( ',' )
            // InternalFeatureModel.g:1355:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getCommaKeyword_7_3_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getCommaKeyword_7_3_0()); 
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
    // $ANTLR end "rule__Feature_Impl__Group_7_3__0__Impl"


    // $ANTLR start "rule__Feature_Impl__Group_7_3__1"
    // InternalFeatureModel.g:1364:1: rule__Feature_Impl__Group_7_3__1 : rule__Feature_Impl__Group_7_3__1__Impl ;
    public final void rule__Feature_Impl__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1368:1: ( rule__Feature_Impl__Group_7_3__1__Impl )
            // InternalFeatureModel.g:1369:2: rule__Feature_Impl__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__Feature_Impl__Group_7_3__1"


    // $ANTLR start "rule__Feature_Impl__Group_7_3__1__Impl"
    // InternalFeatureModel.g:1375:1: rule__Feature_Impl__Group_7_3__1__Impl : ( ( rule__Feature_Impl__ChildrenAssignment_7_3_1 ) ) ;
    public final void rule__Feature_Impl__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1379:1: ( ( ( rule__Feature_Impl__ChildrenAssignment_7_3_1 ) ) )
            // InternalFeatureModel.g:1380:1: ( ( rule__Feature_Impl__ChildrenAssignment_7_3_1 ) )
            {
            // InternalFeatureModel.g:1380:1: ( ( rule__Feature_Impl__ChildrenAssignment_7_3_1 ) )
            // InternalFeatureModel.g:1381:2: ( rule__Feature_Impl__ChildrenAssignment_7_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getChildrenAssignment_7_3_1()); 
            }
            // InternalFeatureModel.g:1382:2: ( rule__Feature_Impl__ChildrenAssignment_7_3_1 )
            // InternalFeatureModel.g:1382:3: rule__Feature_Impl__ChildrenAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__ChildrenAssignment_7_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getChildrenAssignment_7_3_1()); 
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
    // $ANTLR end "rule__Feature_Impl__Group_7_3__1__Impl"


    // $ANTLR start "rule__Alternative__Group__0"
    // InternalFeatureModel.g:1391:1: rule__Alternative__Group__0 : rule__Alternative__Group__0__Impl rule__Alternative__Group__1 ;
    public final void rule__Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1395:1: ( rule__Alternative__Group__0__Impl rule__Alternative__Group__1 )
            // InternalFeatureModel.g:1396:2: rule__Alternative__Group__0__Impl rule__Alternative__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalFeatureModel.g:1403:1: rule__Alternative__Group__0__Impl : ( ( rule__Alternative__Group_0__0 )? ) ;
    public final void rule__Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1407:1: ( ( ( rule__Alternative__Group_0__0 )? ) )
            // InternalFeatureModel.g:1408:1: ( ( rule__Alternative__Group_0__0 )? )
            {
            // InternalFeatureModel.g:1408:1: ( ( rule__Alternative__Group_0__0 )? )
            // InternalFeatureModel.g:1409:2: ( rule__Alternative__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getGroup_0()); 
            }
            // InternalFeatureModel.g:1410:2: ( rule__Alternative__Group_0__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureModel.g:1410:3: rule__Alternative__Group_0__0
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
    // InternalFeatureModel.g:1418:1: rule__Alternative__Group__1 : rule__Alternative__Group__1__Impl rule__Alternative__Group__2 ;
    public final void rule__Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1422:1: ( rule__Alternative__Group__1__Impl rule__Alternative__Group__2 )
            // InternalFeatureModel.g:1423:2: rule__Alternative__Group__1__Impl rule__Alternative__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalFeatureModel.g:1430:1: rule__Alternative__Group__1__Impl : ( ( rule__Alternative__Group_1__0 )? ) ;
    public final void rule__Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1434:1: ( ( ( rule__Alternative__Group_1__0 )? ) )
            // InternalFeatureModel.g:1435:1: ( ( rule__Alternative__Group_1__0 )? )
            {
            // InternalFeatureModel.g:1435:1: ( ( rule__Alternative__Group_1__0 )? )
            // InternalFeatureModel.g:1436:2: ( rule__Alternative__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getGroup_1()); 
            }
            // InternalFeatureModel.g:1437:2: ( rule__Alternative__Group_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalFeatureModel.g:1437:3: rule__Alternative__Group_1__0
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
    // InternalFeatureModel.g:1445:1: rule__Alternative__Group__2 : rule__Alternative__Group__2__Impl rule__Alternative__Group__3 ;
    public final void rule__Alternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1449:1: ( rule__Alternative__Group__2__Impl rule__Alternative__Group__3 )
            // InternalFeatureModel.g:1450:2: rule__Alternative__Group__2__Impl rule__Alternative__Group__3
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
    // InternalFeatureModel.g:1457:1: rule__Alternative__Group__2__Impl : ( 'Alternative' ) ;
    public final void rule__Alternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1461:1: ( ( 'Alternative' ) )
            // InternalFeatureModel.g:1462:1: ( 'Alternative' )
            {
            // InternalFeatureModel.g:1462:1: ( 'Alternative' )
            // InternalFeatureModel.g:1463:2: 'Alternative'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getAlternativeKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:1472:1: rule__Alternative__Group__3 : rule__Alternative__Group__3__Impl rule__Alternative__Group__4 ;
    public final void rule__Alternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1476:1: ( rule__Alternative__Group__3__Impl rule__Alternative__Group__4 )
            // InternalFeatureModel.g:1477:2: rule__Alternative__Group__3__Impl rule__Alternative__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalFeatureModel.g:1484:1: rule__Alternative__Group__3__Impl : ( ( rule__Alternative__NameAssignment_3 ) ) ;
    public final void rule__Alternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1488:1: ( ( ( rule__Alternative__NameAssignment_3 ) ) )
            // InternalFeatureModel.g:1489:1: ( ( rule__Alternative__NameAssignment_3 ) )
            {
            // InternalFeatureModel.g:1489:1: ( ( rule__Alternative__NameAssignment_3 ) )
            // InternalFeatureModel.g:1490:2: ( rule__Alternative__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getNameAssignment_3()); 
            }
            // InternalFeatureModel.g:1491:2: ( rule__Alternative__NameAssignment_3 )
            // InternalFeatureModel.g:1491:3: rule__Alternative__NameAssignment_3
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
    // InternalFeatureModel.g:1499:1: rule__Alternative__Group__4 : rule__Alternative__Group__4__Impl rule__Alternative__Group__5 ;
    public final void rule__Alternative__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1503:1: ( rule__Alternative__Group__4__Impl rule__Alternative__Group__5 )
            // InternalFeatureModel.g:1504:2: rule__Alternative__Group__4__Impl rule__Alternative__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalFeatureModel.g:1511:1: rule__Alternative__Group__4__Impl : ( '{' ) ;
    public final void rule__Alternative__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1515:1: ( ( '{' ) )
            // InternalFeatureModel.g:1516:1: ( '{' )
            {
            // InternalFeatureModel.g:1516:1: ( '{' )
            // InternalFeatureModel.g:1517:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_4()); 
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
    // InternalFeatureModel.g:1526:1: rule__Alternative__Group__5 : rule__Alternative__Group__5__Impl rule__Alternative__Group__6 ;
    public final void rule__Alternative__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1530:1: ( rule__Alternative__Group__5__Impl rule__Alternative__Group__6 )
            // InternalFeatureModel.g:1531:2: rule__Alternative__Group__5__Impl rule__Alternative__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalFeatureModel.g:1538:1: rule__Alternative__Group__5__Impl : ( 'id' ) ;
    public final void rule__Alternative__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1542:1: ( ( 'id' ) )
            // InternalFeatureModel.g:1543:1: ( 'id' )
            {
            // InternalFeatureModel.g:1543:1: ( 'id' )
            // InternalFeatureModel.g:1544:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getIdKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getIdKeyword_5()); 
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
    // InternalFeatureModel.g:1553:1: rule__Alternative__Group__6 : rule__Alternative__Group__6__Impl rule__Alternative__Group__7 ;
    public final void rule__Alternative__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1557:1: ( rule__Alternative__Group__6__Impl rule__Alternative__Group__7 )
            // InternalFeatureModel.g:1558:2: rule__Alternative__Group__6__Impl rule__Alternative__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__Alternative__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__7();

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
    // InternalFeatureModel.g:1565:1: rule__Alternative__Group__6__Impl : ( ( rule__Alternative__IdAssignment_6 ) ) ;
    public final void rule__Alternative__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1569:1: ( ( ( rule__Alternative__IdAssignment_6 ) ) )
            // InternalFeatureModel.g:1570:1: ( ( rule__Alternative__IdAssignment_6 ) )
            {
            // InternalFeatureModel.g:1570:1: ( ( rule__Alternative__IdAssignment_6 ) )
            // InternalFeatureModel.g:1571:2: ( rule__Alternative__IdAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getIdAssignment_6()); 
            }
            // InternalFeatureModel.g:1572:2: ( rule__Alternative__IdAssignment_6 )
            // InternalFeatureModel.g:1572:3: rule__Alternative__IdAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__IdAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getIdAssignment_6()); 
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


    // $ANTLR start "rule__Alternative__Group__7"
    // InternalFeatureModel.g:1580:1: rule__Alternative__Group__7 : rule__Alternative__Group__7__Impl rule__Alternative__Group__8 ;
    public final void rule__Alternative__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1584:1: ( rule__Alternative__Group__7__Impl rule__Alternative__Group__8 )
            // InternalFeatureModel.g:1585:2: rule__Alternative__Group__7__Impl rule__Alternative__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__Alternative__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__8();

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
    // $ANTLR end "rule__Alternative__Group__7"


    // $ANTLR start "rule__Alternative__Group__7__Impl"
    // InternalFeatureModel.g:1592:1: rule__Alternative__Group__7__Impl : ( ( rule__Alternative__Group_7__0 )? ) ;
    public final void rule__Alternative__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1596:1: ( ( ( rule__Alternative__Group_7__0 )? ) )
            // InternalFeatureModel.g:1597:1: ( ( rule__Alternative__Group_7__0 )? )
            {
            // InternalFeatureModel.g:1597:1: ( ( rule__Alternative__Group_7__0 )? )
            // InternalFeatureModel.g:1598:2: ( rule__Alternative__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getGroup_7()); 
            }
            // InternalFeatureModel.g:1599:2: ( rule__Alternative__Group_7__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureModel.g:1599:3: rule__Alternative__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alternative__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getGroup_7()); 
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
    // $ANTLR end "rule__Alternative__Group__7__Impl"


    // $ANTLR start "rule__Alternative__Group__8"
    // InternalFeatureModel.g:1607:1: rule__Alternative__Group__8 : rule__Alternative__Group__8__Impl ;
    public final void rule__Alternative__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1611:1: ( rule__Alternative__Group__8__Impl )
            // InternalFeatureModel.g:1612:2: rule__Alternative__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__8__Impl();

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
    // $ANTLR end "rule__Alternative__Group__8"


    // $ANTLR start "rule__Alternative__Group__8__Impl"
    // InternalFeatureModel.g:1618:1: rule__Alternative__Group__8__Impl : ( '}' ) ;
    public final void rule__Alternative__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1622:1: ( ( '}' ) )
            // InternalFeatureModel.g:1623:1: ( '}' )
            {
            // InternalFeatureModel.g:1623:1: ( '}' )
            // InternalFeatureModel.g:1624:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_8()); 
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
    // $ANTLR end "rule__Alternative__Group__8__Impl"


    // $ANTLR start "rule__Alternative__Group_0__0"
    // InternalFeatureModel.g:1634:1: rule__Alternative__Group_0__0 : rule__Alternative__Group_0__0__Impl rule__Alternative__Group_0__1 ;
    public final void rule__Alternative__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1638:1: ( rule__Alternative__Group_0__0__Impl rule__Alternative__Group_0__1 )
            // InternalFeatureModel.g:1639:2: rule__Alternative__Group_0__0__Impl rule__Alternative__Group_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFeatureModel.g:1646:1: rule__Alternative__Group_0__0__Impl : ( ( 'mandatory' )? ) ;
    public final void rule__Alternative__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1650:1: ( ( ( 'mandatory' )? ) )
            // InternalFeatureModel.g:1651:1: ( ( 'mandatory' )? )
            {
            // InternalFeatureModel.g:1651:1: ( ( 'mandatory' )? )
            // InternalFeatureModel.g:1652:2: ( 'mandatory' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getMandatoryKeyword_0_0()); 
            }
            // InternalFeatureModel.g:1653:2: ( 'mandatory' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==25) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==25) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalFeatureModel.g:1653:3: 'mandatory'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

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
    // InternalFeatureModel.g:1661:1: rule__Alternative__Group_0__1 : rule__Alternative__Group_0__1__Impl ;
    public final void rule__Alternative__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1665:1: ( rule__Alternative__Group_0__1__Impl )
            // InternalFeatureModel.g:1666:2: rule__Alternative__Group_0__1__Impl
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
    // InternalFeatureModel.g:1672:1: rule__Alternative__Group_0__1__Impl : ( ( rule__Alternative__MandatoryAssignment_0_1 ) ) ;
    public final void rule__Alternative__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1676:1: ( ( ( rule__Alternative__MandatoryAssignment_0_1 ) ) )
            // InternalFeatureModel.g:1677:1: ( ( rule__Alternative__MandatoryAssignment_0_1 ) )
            {
            // InternalFeatureModel.g:1677:1: ( ( rule__Alternative__MandatoryAssignment_0_1 ) )
            // InternalFeatureModel.g:1678:2: ( rule__Alternative__MandatoryAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getMandatoryAssignment_0_1()); 
            }
            // InternalFeatureModel.g:1679:2: ( rule__Alternative__MandatoryAssignment_0_1 )
            // InternalFeatureModel.g:1679:3: rule__Alternative__MandatoryAssignment_0_1
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
    // InternalFeatureModel.g:1688:1: rule__Alternative__Group_1__0 : rule__Alternative__Group_1__0__Impl rule__Alternative__Group_1__1 ;
    public final void rule__Alternative__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1692:1: ( rule__Alternative__Group_1__0__Impl rule__Alternative__Group_1__1 )
            // InternalFeatureModel.g:1693:2: rule__Alternative__Group_1__0__Impl rule__Alternative__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFeatureModel.g:1700:1: rule__Alternative__Group_1__0__Impl : ( ( 'selected' )? ) ;
    public final void rule__Alternative__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1704:1: ( ( ( 'selected' )? ) )
            // InternalFeatureModel.g:1705:1: ( ( 'selected' )? )
            {
            // InternalFeatureModel.g:1705:1: ( ( 'selected' )? )
            // InternalFeatureModel.g:1706:2: ( 'selected' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getSelectedKeyword_1_0()); 
            }
            // InternalFeatureModel.g:1707:2: ( 'selected' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==26) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalFeatureModel.g:1707:3: 'selected'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

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
    // InternalFeatureModel.g:1715:1: rule__Alternative__Group_1__1 : rule__Alternative__Group_1__1__Impl ;
    public final void rule__Alternative__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1719:1: ( rule__Alternative__Group_1__1__Impl )
            // InternalFeatureModel.g:1720:2: rule__Alternative__Group_1__1__Impl
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
    // InternalFeatureModel.g:1726:1: rule__Alternative__Group_1__1__Impl : ( ( rule__Alternative__SelectedAssignment_1_1 ) ) ;
    public final void rule__Alternative__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1730:1: ( ( ( rule__Alternative__SelectedAssignment_1_1 ) ) )
            // InternalFeatureModel.g:1731:1: ( ( rule__Alternative__SelectedAssignment_1_1 ) )
            {
            // InternalFeatureModel.g:1731:1: ( ( rule__Alternative__SelectedAssignment_1_1 ) )
            // InternalFeatureModel.g:1732:2: ( rule__Alternative__SelectedAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getSelectedAssignment_1_1()); 
            }
            // InternalFeatureModel.g:1733:2: ( rule__Alternative__SelectedAssignment_1_1 )
            // InternalFeatureModel.g:1733:3: rule__Alternative__SelectedAssignment_1_1
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


    // $ANTLR start "rule__Alternative__Group_7__0"
    // InternalFeatureModel.g:1742:1: rule__Alternative__Group_7__0 : rule__Alternative__Group_7__0__Impl rule__Alternative__Group_7__1 ;
    public final void rule__Alternative__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1746:1: ( rule__Alternative__Group_7__0__Impl rule__Alternative__Group_7__1 )
            // InternalFeatureModel.g:1747:2: rule__Alternative__Group_7__0__Impl rule__Alternative__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Alternative__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7__1();

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
    // $ANTLR end "rule__Alternative__Group_7__0"


    // $ANTLR start "rule__Alternative__Group_7__0__Impl"
    // InternalFeatureModel.g:1754:1: rule__Alternative__Group_7__0__Impl : ( 'children' ) ;
    public final void rule__Alternative__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1758:1: ( ( 'children' ) )
            // InternalFeatureModel.g:1759:1: ( 'children' )
            {
            // InternalFeatureModel.g:1759:1: ( 'children' )
            // InternalFeatureModel.g:1760:2: 'children'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getChildrenKeyword_7_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getChildrenKeyword_7_0()); 
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
    // $ANTLR end "rule__Alternative__Group_7__0__Impl"


    // $ANTLR start "rule__Alternative__Group_7__1"
    // InternalFeatureModel.g:1769:1: rule__Alternative__Group_7__1 : rule__Alternative__Group_7__1__Impl rule__Alternative__Group_7__2 ;
    public final void rule__Alternative__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1773:1: ( rule__Alternative__Group_7__1__Impl rule__Alternative__Group_7__2 )
            // InternalFeatureModel.g:1774:2: rule__Alternative__Group_7__1__Impl rule__Alternative__Group_7__2
            {
            pushFollow(FOLLOW_8);
            rule__Alternative__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7__2();

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
    // $ANTLR end "rule__Alternative__Group_7__1"


    // $ANTLR start "rule__Alternative__Group_7__1__Impl"
    // InternalFeatureModel.g:1781:1: rule__Alternative__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Alternative__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1785:1: ( ( '{' ) )
            // InternalFeatureModel.g:1786:1: ( '{' )
            {
            // InternalFeatureModel.g:1786:1: ( '{' )
            // InternalFeatureModel.g:1787:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_7_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_7_1()); 
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
    // $ANTLR end "rule__Alternative__Group_7__1__Impl"


    // $ANTLR start "rule__Alternative__Group_7__2"
    // InternalFeatureModel.g:1796:1: rule__Alternative__Group_7__2 : rule__Alternative__Group_7__2__Impl rule__Alternative__Group_7__3 ;
    public final void rule__Alternative__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1800:1: ( rule__Alternative__Group_7__2__Impl rule__Alternative__Group_7__3 )
            // InternalFeatureModel.g:1801:2: rule__Alternative__Group_7__2__Impl rule__Alternative__Group_7__3
            {
            pushFollow(FOLLOW_21);
            rule__Alternative__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7__3();

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
    // $ANTLR end "rule__Alternative__Group_7__2"


    // $ANTLR start "rule__Alternative__Group_7__2__Impl"
    // InternalFeatureModel.g:1808:1: rule__Alternative__Group_7__2__Impl : ( ( rule__Alternative__ChildrenAssignment_7_2 ) ) ;
    public final void rule__Alternative__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1812:1: ( ( ( rule__Alternative__ChildrenAssignment_7_2 ) ) )
            // InternalFeatureModel.g:1813:1: ( ( rule__Alternative__ChildrenAssignment_7_2 ) )
            {
            // InternalFeatureModel.g:1813:1: ( ( rule__Alternative__ChildrenAssignment_7_2 ) )
            // InternalFeatureModel.g:1814:2: ( rule__Alternative__ChildrenAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getChildrenAssignment_7_2()); 
            }
            // InternalFeatureModel.g:1815:2: ( rule__Alternative__ChildrenAssignment_7_2 )
            // InternalFeatureModel.g:1815:3: rule__Alternative__ChildrenAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__ChildrenAssignment_7_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getChildrenAssignment_7_2()); 
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
    // $ANTLR end "rule__Alternative__Group_7__2__Impl"


    // $ANTLR start "rule__Alternative__Group_7__3"
    // InternalFeatureModel.g:1823:1: rule__Alternative__Group_7__3 : rule__Alternative__Group_7__3__Impl rule__Alternative__Group_7__4 ;
    public final void rule__Alternative__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1827:1: ( rule__Alternative__Group_7__3__Impl rule__Alternative__Group_7__4 )
            // InternalFeatureModel.g:1828:2: rule__Alternative__Group_7__3__Impl rule__Alternative__Group_7__4
            {
            pushFollow(FOLLOW_21);
            rule__Alternative__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7__4();

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
    // $ANTLR end "rule__Alternative__Group_7__3"


    // $ANTLR start "rule__Alternative__Group_7__3__Impl"
    // InternalFeatureModel.g:1835:1: rule__Alternative__Group_7__3__Impl : ( ( rule__Alternative__Group_7_3__0 )* ) ;
    public final void rule__Alternative__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1839:1: ( ( ( rule__Alternative__Group_7_3__0 )* ) )
            // InternalFeatureModel.g:1840:1: ( ( rule__Alternative__Group_7_3__0 )* )
            {
            // InternalFeatureModel.g:1840:1: ( ( rule__Alternative__Group_7_3__0 )* )
            // InternalFeatureModel.g:1841:2: ( rule__Alternative__Group_7_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getGroup_7_3()); 
            }
            // InternalFeatureModel.g:1842:2: ( rule__Alternative__Group_7_3__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalFeatureModel.g:1842:3: rule__Alternative__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__Alternative__Group_7_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getGroup_7_3()); 
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
    // $ANTLR end "rule__Alternative__Group_7__3__Impl"


    // $ANTLR start "rule__Alternative__Group_7__4"
    // InternalFeatureModel.g:1850:1: rule__Alternative__Group_7__4 : rule__Alternative__Group_7__4__Impl ;
    public final void rule__Alternative__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1854:1: ( rule__Alternative__Group_7__4__Impl )
            // InternalFeatureModel.g:1855:2: rule__Alternative__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7__4__Impl();

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
    // $ANTLR end "rule__Alternative__Group_7__4"


    // $ANTLR start "rule__Alternative__Group_7__4__Impl"
    // InternalFeatureModel.g:1861:1: rule__Alternative__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Alternative__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1865:1: ( ( '}' ) )
            // InternalFeatureModel.g:1866:1: ( '}' )
            {
            // InternalFeatureModel.g:1866:1: ( '}' )
            // InternalFeatureModel.g:1867:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_7_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_7_4()); 
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
    // $ANTLR end "rule__Alternative__Group_7__4__Impl"


    // $ANTLR start "rule__Alternative__Group_7_3__0"
    // InternalFeatureModel.g:1877:1: rule__Alternative__Group_7_3__0 : rule__Alternative__Group_7_3__0__Impl rule__Alternative__Group_7_3__1 ;
    public final void rule__Alternative__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1881:1: ( rule__Alternative__Group_7_3__0__Impl rule__Alternative__Group_7_3__1 )
            // InternalFeatureModel.g:1882:2: rule__Alternative__Group_7_3__0__Impl rule__Alternative__Group_7_3__1
            {
            pushFollow(FOLLOW_8);
            rule__Alternative__Group_7_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7_3__1();

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
    // $ANTLR end "rule__Alternative__Group_7_3__0"


    // $ANTLR start "rule__Alternative__Group_7_3__0__Impl"
    // InternalFeatureModel.g:1889:1: rule__Alternative__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Alternative__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1893:1: ( ( ',' ) )
            // InternalFeatureModel.g:1894:1: ( ',' )
            {
            // InternalFeatureModel.g:1894:1: ( ',' )
            // InternalFeatureModel.g:1895:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getCommaKeyword_7_3_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getCommaKeyword_7_3_0()); 
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
    // $ANTLR end "rule__Alternative__Group_7_3__0__Impl"


    // $ANTLR start "rule__Alternative__Group_7_3__1"
    // InternalFeatureModel.g:1904:1: rule__Alternative__Group_7_3__1 : rule__Alternative__Group_7_3__1__Impl ;
    public final void rule__Alternative__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1908:1: ( rule__Alternative__Group_7_3__1__Impl )
            // InternalFeatureModel.g:1909:2: rule__Alternative__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__Alternative__Group_7_3__1"


    // $ANTLR start "rule__Alternative__Group_7_3__1__Impl"
    // InternalFeatureModel.g:1915:1: rule__Alternative__Group_7_3__1__Impl : ( ( rule__Alternative__ChildrenAssignment_7_3_1 ) ) ;
    public final void rule__Alternative__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1919:1: ( ( ( rule__Alternative__ChildrenAssignment_7_3_1 ) ) )
            // InternalFeatureModel.g:1920:1: ( ( rule__Alternative__ChildrenAssignment_7_3_1 ) )
            {
            // InternalFeatureModel.g:1920:1: ( ( rule__Alternative__ChildrenAssignment_7_3_1 ) )
            // InternalFeatureModel.g:1921:2: ( rule__Alternative__ChildrenAssignment_7_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getChildrenAssignment_7_3_1()); 
            }
            // InternalFeatureModel.g:1922:2: ( rule__Alternative__ChildrenAssignment_7_3_1 )
            // InternalFeatureModel.g:1922:3: rule__Alternative__ChildrenAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__ChildrenAssignment_7_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getChildrenAssignment_7_3_1()); 
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
    // $ANTLR end "rule__Alternative__Group_7_3__1__Impl"


    // $ANTLR start "rule__OrGroup__Group__0"
    // InternalFeatureModel.g:1931:1: rule__OrGroup__Group__0 : rule__OrGroup__Group__0__Impl rule__OrGroup__Group__1 ;
    public final void rule__OrGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1935:1: ( rule__OrGroup__Group__0__Impl rule__OrGroup__Group__1 )
            // InternalFeatureModel.g:1936:2: rule__OrGroup__Group__0__Impl rule__OrGroup__Group__1
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
    // InternalFeatureModel.g:1943:1: rule__OrGroup__Group__0__Impl : ( ( rule__OrGroup__Group_0__0 )? ) ;
    public final void rule__OrGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1947:1: ( ( ( rule__OrGroup__Group_0__0 )? ) )
            // InternalFeatureModel.g:1948:1: ( ( rule__OrGroup__Group_0__0 )? )
            {
            // InternalFeatureModel.g:1948:1: ( ( rule__OrGroup__Group_0__0 )? )
            // InternalFeatureModel.g:1949:2: ( rule__OrGroup__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getGroup_0()); 
            }
            // InternalFeatureModel.g:1950:2: ( rule__OrGroup__Group_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==25) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFeatureModel.g:1950:3: rule__OrGroup__Group_0__0
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
    // InternalFeatureModel.g:1958:1: rule__OrGroup__Group__1 : rule__OrGroup__Group__1__Impl rule__OrGroup__Group__2 ;
    public final void rule__OrGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1962:1: ( rule__OrGroup__Group__1__Impl rule__OrGroup__Group__2 )
            // InternalFeatureModel.g:1963:2: rule__OrGroup__Group__1__Impl rule__OrGroup__Group__2
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
    // InternalFeatureModel.g:1970:1: rule__OrGroup__Group__1__Impl : ( ( rule__OrGroup__Group_1__0 )? ) ;
    public final void rule__OrGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1974:1: ( ( ( rule__OrGroup__Group_1__0 )? ) )
            // InternalFeatureModel.g:1975:1: ( ( rule__OrGroup__Group_1__0 )? )
            {
            // InternalFeatureModel.g:1975:1: ( ( rule__OrGroup__Group_1__0 )? )
            // InternalFeatureModel.g:1976:2: ( rule__OrGroup__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getGroup_1()); 
            }
            // InternalFeatureModel.g:1977:2: ( rule__OrGroup__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==26) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalFeatureModel.g:1977:3: rule__OrGroup__Group_1__0
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
    // InternalFeatureModel.g:1985:1: rule__OrGroup__Group__2 : rule__OrGroup__Group__2__Impl rule__OrGroup__Group__3 ;
    public final void rule__OrGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1989:1: ( rule__OrGroup__Group__2__Impl rule__OrGroup__Group__3 )
            // InternalFeatureModel.g:1990:2: rule__OrGroup__Group__2__Impl rule__OrGroup__Group__3
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
    // InternalFeatureModel.g:1997:1: rule__OrGroup__Group__2__Impl : ( 'OrGroup' ) ;
    public final void rule__OrGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2001:1: ( ( 'OrGroup' ) )
            // InternalFeatureModel.g:2002:1: ( 'OrGroup' )
            {
            // InternalFeatureModel.g:2002:1: ( 'OrGroup' )
            // InternalFeatureModel.g:2003:2: 'OrGroup'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getOrGroupKeyword_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:2012:1: rule__OrGroup__Group__3 : rule__OrGroup__Group__3__Impl rule__OrGroup__Group__4 ;
    public final void rule__OrGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2016:1: ( rule__OrGroup__Group__3__Impl rule__OrGroup__Group__4 )
            // InternalFeatureModel.g:2017:2: rule__OrGroup__Group__3__Impl rule__OrGroup__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalFeatureModel.g:2024:1: rule__OrGroup__Group__3__Impl : ( ( rule__OrGroup__NameAssignment_3 ) ) ;
    public final void rule__OrGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2028:1: ( ( ( rule__OrGroup__NameAssignment_3 ) ) )
            // InternalFeatureModel.g:2029:1: ( ( rule__OrGroup__NameAssignment_3 ) )
            {
            // InternalFeatureModel.g:2029:1: ( ( rule__OrGroup__NameAssignment_3 ) )
            // InternalFeatureModel.g:2030:2: ( rule__OrGroup__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getNameAssignment_3()); 
            }
            // InternalFeatureModel.g:2031:2: ( rule__OrGroup__NameAssignment_3 )
            // InternalFeatureModel.g:2031:3: rule__OrGroup__NameAssignment_3
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
    // InternalFeatureModel.g:2039:1: rule__OrGroup__Group__4 : rule__OrGroup__Group__4__Impl rule__OrGroup__Group__5 ;
    public final void rule__OrGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2043:1: ( rule__OrGroup__Group__4__Impl rule__OrGroup__Group__5 )
            // InternalFeatureModel.g:2044:2: rule__OrGroup__Group__4__Impl rule__OrGroup__Group__5
            {
            pushFollow(FOLLOW_17);
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
    // InternalFeatureModel.g:2051:1: rule__OrGroup__Group__4__Impl : ( '{' ) ;
    public final void rule__OrGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2055:1: ( ( '{' ) )
            // InternalFeatureModel.g:2056:1: ( '{' )
            {
            // InternalFeatureModel.g:2056:1: ( '{' )
            // InternalFeatureModel.g:2057:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_4()); 
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
    // InternalFeatureModel.g:2066:1: rule__OrGroup__Group__5 : rule__OrGroup__Group__5__Impl rule__OrGroup__Group__6 ;
    public final void rule__OrGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2070:1: ( rule__OrGroup__Group__5__Impl rule__OrGroup__Group__6 )
            // InternalFeatureModel.g:2071:2: rule__OrGroup__Group__5__Impl rule__OrGroup__Group__6
            {
            pushFollow(FOLLOW_6);
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
    // InternalFeatureModel.g:2078:1: rule__OrGroup__Group__5__Impl : ( 'id' ) ;
    public final void rule__OrGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2082:1: ( ( 'id' ) )
            // InternalFeatureModel.g:2083:1: ( 'id' )
            {
            // InternalFeatureModel.g:2083:1: ( 'id' )
            // InternalFeatureModel.g:2084:2: 'id'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getIdKeyword_5()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getIdKeyword_5()); 
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
    // InternalFeatureModel.g:2093:1: rule__OrGroup__Group__6 : rule__OrGroup__Group__6__Impl rule__OrGroup__Group__7 ;
    public final void rule__OrGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2097:1: ( rule__OrGroup__Group__6__Impl rule__OrGroup__Group__7 )
            // InternalFeatureModel.g:2098:2: rule__OrGroup__Group__6__Impl rule__OrGroup__Group__7
            {
            pushFollow(FOLLOW_18);
            rule__OrGroup__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__7();

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
    // InternalFeatureModel.g:2105:1: rule__OrGroup__Group__6__Impl : ( ( rule__OrGroup__IdAssignment_6 ) ) ;
    public final void rule__OrGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2109:1: ( ( ( rule__OrGroup__IdAssignment_6 ) ) )
            // InternalFeatureModel.g:2110:1: ( ( rule__OrGroup__IdAssignment_6 ) )
            {
            // InternalFeatureModel.g:2110:1: ( ( rule__OrGroup__IdAssignment_6 ) )
            // InternalFeatureModel.g:2111:2: ( rule__OrGroup__IdAssignment_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getIdAssignment_6()); 
            }
            // InternalFeatureModel.g:2112:2: ( rule__OrGroup__IdAssignment_6 )
            // InternalFeatureModel.g:2112:3: rule__OrGroup__IdAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__IdAssignment_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getIdAssignment_6()); 
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


    // $ANTLR start "rule__OrGroup__Group__7"
    // InternalFeatureModel.g:2120:1: rule__OrGroup__Group__7 : rule__OrGroup__Group__7__Impl rule__OrGroup__Group__8 ;
    public final void rule__OrGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2124:1: ( rule__OrGroup__Group__7__Impl rule__OrGroup__Group__8 )
            // InternalFeatureModel.g:2125:2: rule__OrGroup__Group__7__Impl rule__OrGroup__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__OrGroup__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__8();

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
    // $ANTLR end "rule__OrGroup__Group__7"


    // $ANTLR start "rule__OrGroup__Group__7__Impl"
    // InternalFeatureModel.g:2132:1: rule__OrGroup__Group__7__Impl : ( ( rule__OrGroup__Group_7__0 )? ) ;
    public final void rule__OrGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2136:1: ( ( ( rule__OrGroup__Group_7__0 )? ) )
            // InternalFeatureModel.g:2137:1: ( ( rule__OrGroup__Group_7__0 )? )
            {
            // InternalFeatureModel.g:2137:1: ( ( rule__OrGroup__Group_7__0 )? )
            // InternalFeatureModel.g:2138:2: ( rule__OrGroup__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getGroup_7()); 
            }
            // InternalFeatureModel.g:2139:2: ( rule__OrGroup__Group_7__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==27) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFeatureModel.g:2139:3: rule__OrGroup__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrGroup__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getGroup_7()); 
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
    // $ANTLR end "rule__OrGroup__Group__7__Impl"


    // $ANTLR start "rule__OrGroup__Group__8"
    // InternalFeatureModel.g:2147:1: rule__OrGroup__Group__8 : rule__OrGroup__Group__8__Impl ;
    public final void rule__OrGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2151:1: ( rule__OrGroup__Group__8__Impl )
            // InternalFeatureModel.g:2152:2: rule__OrGroup__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__8__Impl();

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
    // $ANTLR end "rule__OrGroup__Group__8"


    // $ANTLR start "rule__OrGroup__Group__8__Impl"
    // InternalFeatureModel.g:2158:1: rule__OrGroup__Group__8__Impl : ( '}' ) ;
    public final void rule__OrGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2162:1: ( ( '}' ) )
            // InternalFeatureModel.g:2163:1: ( '}' )
            {
            // InternalFeatureModel.g:2163:1: ( '}' )
            // InternalFeatureModel.g:2164:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_8()); 
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
    // $ANTLR end "rule__OrGroup__Group__8__Impl"


    // $ANTLR start "rule__OrGroup__Group_0__0"
    // InternalFeatureModel.g:2174:1: rule__OrGroup__Group_0__0 : rule__OrGroup__Group_0__0__Impl rule__OrGroup__Group_0__1 ;
    public final void rule__OrGroup__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2178:1: ( rule__OrGroup__Group_0__0__Impl rule__OrGroup__Group_0__1 )
            // InternalFeatureModel.g:2179:2: rule__OrGroup__Group_0__0__Impl rule__OrGroup__Group_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalFeatureModel.g:2186:1: rule__OrGroup__Group_0__0__Impl : ( ( 'mandatory' )? ) ;
    public final void rule__OrGroup__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2190:1: ( ( ( 'mandatory' )? ) )
            // InternalFeatureModel.g:2191:1: ( ( 'mandatory' )? )
            {
            // InternalFeatureModel.g:2191:1: ( ( 'mandatory' )? )
            // InternalFeatureModel.g:2192:2: ( 'mandatory' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getMandatoryKeyword_0_0()); 
            }
            // InternalFeatureModel.g:2193:2: ( 'mandatory' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==25) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalFeatureModel.g:2193:3: 'mandatory'
                    {
                    match(input,25,FOLLOW_2); if (state.failed) return ;

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
    // InternalFeatureModel.g:2201:1: rule__OrGroup__Group_0__1 : rule__OrGroup__Group_0__1__Impl ;
    public final void rule__OrGroup__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2205:1: ( rule__OrGroup__Group_0__1__Impl )
            // InternalFeatureModel.g:2206:2: rule__OrGroup__Group_0__1__Impl
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
    // InternalFeatureModel.g:2212:1: rule__OrGroup__Group_0__1__Impl : ( ( rule__OrGroup__MandatoryAssignment_0_1 ) ) ;
    public final void rule__OrGroup__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2216:1: ( ( ( rule__OrGroup__MandatoryAssignment_0_1 ) ) )
            // InternalFeatureModel.g:2217:1: ( ( rule__OrGroup__MandatoryAssignment_0_1 ) )
            {
            // InternalFeatureModel.g:2217:1: ( ( rule__OrGroup__MandatoryAssignment_0_1 ) )
            // InternalFeatureModel.g:2218:2: ( rule__OrGroup__MandatoryAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getMandatoryAssignment_0_1()); 
            }
            // InternalFeatureModel.g:2219:2: ( rule__OrGroup__MandatoryAssignment_0_1 )
            // InternalFeatureModel.g:2219:3: rule__OrGroup__MandatoryAssignment_0_1
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
    // InternalFeatureModel.g:2228:1: rule__OrGroup__Group_1__0 : rule__OrGroup__Group_1__0__Impl rule__OrGroup__Group_1__1 ;
    public final void rule__OrGroup__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2232:1: ( rule__OrGroup__Group_1__0__Impl rule__OrGroup__Group_1__1 )
            // InternalFeatureModel.g:2233:2: rule__OrGroup__Group_1__0__Impl rule__OrGroup__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalFeatureModel.g:2240:1: rule__OrGroup__Group_1__0__Impl : ( ( 'selected' )? ) ;
    public final void rule__OrGroup__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2244:1: ( ( ( 'selected' )? ) )
            // InternalFeatureModel.g:2245:1: ( ( 'selected' )? )
            {
            // InternalFeatureModel.g:2245:1: ( ( 'selected' )? )
            // InternalFeatureModel.g:2246:2: ( 'selected' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getSelectedKeyword_1_0()); 
            }
            // InternalFeatureModel.g:2247:2: ( 'selected' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==26) ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1==26) ) {
                    alt21=1;
                }
            }
            switch (alt21) {
                case 1 :
                    // InternalFeatureModel.g:2247:3: 'selected'
                    {
                    match(input,26,FOLLOW_2); if (state.failed) return ;

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
    // InternalFeatureModel.g:2255:1: rule__OrGroup__Group_1__1 : rule__OrGroup__Group_1__1__Impl ;
    public final void rule__OrGroup__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2259:1: ( rule__OrGroup__Group_1__1__Impl )
            // InternalFeatureModel.g:2260:2: rule__OrGroup__Group_1__1__Impl
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
    // InternalFeatureModel.g:2266:1: rule__OrGroup__Group_1__1__Impl : ( ( rule__OrGroup__SelectedAssignment_1_1 ) ) ;
    public final void rule__OrGroup__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2270:1: ( ( ( rule__OrGroup__SelectedAssignment_1_1 ) ) )
            // InternalFeatureModel.g:2271:1: ( ( rule__OrGroup__SelectedAssignment_1_1 ) )
            {
            // InternalFeatureModel.g:2271:1: ( ( rule__OrGroup__SelectedAssignment_1_1 ) )
            // InternalFeatureModel.g:2272:2: ( rule__OrGroup__SelectedAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getSelectedAssignment_1_1()); 
            }
            // InternalFeatureModel.g:2273:2: ( rule__OrGroup__SelectedAssignment_1_1 )
            // InternalFeatureModel.g:2273:3: rule__OrGroup__SelectedAssignment_1_1
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


    // $ANTLR start "rule__OrGroup__Group_7__0"
    // InternalFeatureModel.g:2282:1: rule__OrGroup__Group_7__0 : rule__OrGroup__Group_7__0__Impl rule__OrGroup__Group_7__1 ;
    public final void rule__OrGroup__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2286:1: ( rule__OrGroup__Group_7__0__Impl rule__OrGroup__Group_7__1 )
            // InternalFeatureModel.g:2287:2: rule__OrGroup__Group_7__0__Impl rule__OrGroup__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__OrGroup__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7__1();

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
    // $ANTLR end "rule__OrGroup__Group_7__0"


    // $ANTLR start "rule__OrGroup__Group_7__0__Impl"
    // InternalFeatureModel.g:2294:1: rule__OrGroup__Group_7__0__Impl : ( 'children' ) ;
    public final void rule__OrGroup__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2298:1: ( ( 'children' ) )
            // InternalFeatureModel.g:2299:1: ( 'children' )
            {
            // InternalFeatureModel.g:2299:1: ( 'children' )
            // InternalFeatureModel.g:2300:2: 'children'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getChildrenKeyword_7_0()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getChildrenKeyword_7_0()); 
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
    // $ANTLR end "rule__OrGroup__Group_7__0__Impl"


    // $ANTLR start "rule__OrGroup__Group_7__1"
    // InternalFeatureModel.g:2309:1: rule__OrGroup__Group_7__1 : rule__OrGroup__Group_7__1__Impl rule__OrGroup__Group_7__2 ;
    public final void rule__OrGroup__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2313:1: ( rule__OrGroup__Group_7__1__Impl rule__OrGroup__Group_7__2 )
            // InternalFeatureModel.g:2314:2: rule__OrGroup__Group_7__1__Impl rule__OrGroup__Group_7__2
            {
            pushFollow(FOLLOW_8);
            rule__OrGroup__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7__2();

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
    // $ANTLR end "rule__OrGroup__Group_7__1"


    // $ANTLR start "rule__OrGroup__Group_7__1__Impl"
    // InternalFeatureModel.g:2321:1: rule__OrGroup__Group_7__1__Impl : ( '{' ) ;
    public final void rule__OrGroup__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2325:1: ( ( '{' ) )
            // InternalFeatureModel.g:2326:1: ( '{' )
            {
            // InternalFeatureModel.g:2326:1: ( '{' )
            // InternalFeatureModel.g:2327:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_7_1()); 
            }
            match(input,14,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_7_1()); 
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
    // $ANTLR end "rule__OrGroup__Group_7__1__Impl"


    // $ANTLR start "rule__OrGroup__Group_7__2"
    // InternalFeatureModel.g:2336:1: rule__OrGroup__Group_7__2 : rule__OrGroup__Group_7__2__Impl rule__OrGroup__Group_7__3 ;
    public final void rule__OrGroup__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2340:1: ( rule__OrGroup__Group_7__2__Impl rule__OrGroup__Group_7__3 )
            // InternalFeatureModel.g:2341:2: rule__OrGroup__Group_7__2__Impl rule__OrGroup__Group_7__3
            {
            pushFollow(FOLLOW_21);
            rule__OrGroup__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7__3();

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
    // $ANTLR end "rule__OrGroup__Group_7__2"


    // $ANTLR start "rule__OrGroup__Group_7__2__Impl"
    // InternalFeatureModel.g:2348:1: rule__OrGroup__Group_7__2__Impl : ( ( rule__OrGroup__ChildrenAssignment_7_2 ) ) ;
    public final void rule__OrGroup__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2352:1: ( ( ( rule__OrGroup__ChildrenAssignment_7_2 ) ) )
            // InternalFeatureModel.g:2353:1: ( ( rule__OrGroup__ChildrenAssignment_7_2 ) )
            {
            // InternalFeatureModel.g:2353:1: ( ( rule__OrGroup__ChildrenAssignment_7_2 ) )
            // InternalFeatureModel.g:2354:2: ( rule__OrGroup__ChildrenAssignment_7_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getChildrenAssignment_7_2()); 
            }
            // InternalFeatureModel.g:2355:2: ( rule__OrGroup__ChildrenAssignment_7_2 )
            // InternalFeatureModel.g:2355:3: rule__OrGroup__ChildrenAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__ChildrenAssignment_7_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getChildrenAssignment_7_2()); 
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
    // $ANTLR end "rule__OrGroup__Group_7__2__Impl"


    // $ANTLR start "rule__OrGroup__Group_7__3"
    // InternalFeatureModel.g:2363:1: rule__OrGroup__Group_7__3 : rule__OrGroup__Group_7__3__Impl rule__OrGroup__Group_7__4 ;
    public final void rule__OrGroup__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2367:1: ( rule__OrGroup__Group_7__3__Impl rule__OrGroup__Group_7__4 )
            // InternalFeatureModel.g:2368:2: rule__OrGroup__Group_7__3__Impl rule__OrGroup__Group_7__4
            {
            pushFollow(FOLLOW_21);
            rule__OrGroup__Group_7__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7__4();

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
    // $ANTLR end "rule__OrGroup__Group_7__3"


    // $ANTLR start "rule__OrGroup__Group_7__3__Impl"
    // InternalFeatureModel.g:2375:1: rule__OrGroup__Group_7__3__Impl : ( ( rule__OrGroup__Group_7_3__0 )* ) ;
    public final void rule__OrGroup__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2379:1: ( ( ( rule__OrGroup__Group_7_3__0 )* ) )
            // InternalFeatureModel.g:2380:1: ( ( rule__OrGroup__Group_7_3__0 )* )
            {
            // InternalFeatureModel.g:2380:1: ( ( rule__OrGroup__Group_7_3__0 )* )
            // InternalFeatureModel.g:2381:2: ( rule__OrGroup__Group_7_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getGroup_7_3()); 
            }
            // InternalFeatureModel.g:2382:2: ( rule__OrGroup__Group_7_3__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==28) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalFeatureModel.g:2382:3: rule__OrGroup__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__OrGroup__Group_7_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getGroup_7_3()); 
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
    // $ANTLR end "rule__OrGroup__Group_7__3__Impl"


    // $ANTLR start "rule__OrGroup__Group_7__4"
    // InternalFeatureModel.g:2390:1: rule__OrGroup__Group_7__4 : rule__OrGroup__Group_7__4__Impl ;
    public final void rule__OrGroup__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2394:1: ( rule__OrGroup__Group_7__4__Impl )
            // InternalFeatureModel.g:2395:2: rule__OrGroup__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7__4__Impl();

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
    // $ANTLR end "rule__OrGroup__Group_7__4"


    // $ANTLR start "rule__OrGroup__Group_7__4__Impl"
    // InternalFeatureModel.g:2401:1: rule__OrGroup__Group_7__4__Impl : ( '}' ) ;
    public final void rule__OrGroup__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2405:1: ( ( '}' ) )
            // InternalFeatureModel.g:2406:1: ( '}' )
            {
            // InternalFeatureModel.g:2406:1: ( '}' )
            // InternalFeatureModel.g:2407:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_7_4()); 
            }
            match(input,15,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_7_4()); 
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
    // $ANTLR end "rule__OrGroup__Group_7__4__Impl"


    // $ANTLR start "rule__OrGroup__Group_7_3__0"
    // InternalFeatureModel.g:2417:1: rule__OrGroup__Group_7_3__0 : rule__OrGroup__Group_7_3__0__Impl rule__OrGroup__Group_7_3__1 ;
    public final void rule__OrGroup__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2421:1: ( rule__OrGroup__Group_7_3__0__Impl rule__OrGroup__Group_7_3__1 )
            // InternalFeatureModel.g:2422:2: rule__OrGroup__Group_7_3__0__Impl rule__OrGroup__Group_7_3__1
            {
            pushFollow(FOLLOW_8);
            rule__OrGroup__Group_7_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7_3__1();

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
    // $ANTLR end "rule__OrGroup__Group_7_3__0"


    // $ANTLR start "rule__OrGroup__Group_7_3__0__Impl"
    // InternalFeatureModel.g:2429:1: rule__OrGroup__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__OrGroup__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2433:1: ( ( ',' ) )
            // InternalFeatureModel.g:2434:1: ( ',' )
            {
            // InternalFeatureModel.g:2434:1: ( ',' )
            // InternalFeatureModel.g:2435:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getCommaKeyword_7_3_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getCommaKeyword_7_3_0()); 
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
    // $ANTLR end "rule__OrGroup__Group_7_3__0__Impl"


    // $ANTLR start "rule__OrGroup__Group_7_3__1"
    // InternalFeatureModel.g:2444:1: rule__OrGroup__Group_7_3__1 : rule__OrGroup__Group_7_3__1__Impl ;
    public final void rule__OrGroup__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2448:1: ( rule__OrGroup__Group_7_3__1__Impl )
            // InternalFeatureModel.g:2449:2: rule__OrGroup__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__OrGroup__Group_7_3__1"


    // $ANTLR start "rule__OrGroup__Group_7_3__1__Impl"
    // InternalFeatureModel.g:2455:1: rule__OrGroup__Group_7_3__1__Impl : ( ( rule__OrGroup__ChildrenAssignment_7_3_1 ) ) ;
    public final void rule__OrGroup__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2459:1: ( ( ( rule__OrGroup__ChildrenAssignment_7_3_1 ) ) )
            // InternalFeatureModel.g:2460:1: ( ( rule__OrGroup__ChildrenAssignment_7_3_1 ) )
            {
            // InternalFeatureModel.g:2460:1: ( ( rule__OrGroup__ChildrenAssignment_7_3_1 ) )
            // InternalFeatureModel.g:2461:2: ( rule__OrGroup__ChildrenAssignment_7_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getChildrenAssignment_7_3_1()); 
            }
            // InternalFeatureModel.g:2462:2: ( rule__OrGroup__ChildrenAssignment_7_3_1 )
            // InternalFeatureModel.g:2462:3: rule__OrGroup__ChildrenAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__ChildrenAssignment_7_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getChildrenAssignment_7_3_1()); 
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
    // $ANTLR end "rule__OrGroup__Group_7_3__1__Impl"


    // $ANTLR start "rule__Model__FmAssignment_2"
    // InternalFeatureModel.g:2471:1: rule__Model__FmAssignment_2 : ( ruleFeatureModel ) ;
    public final void rule__Model__FmAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2475:1: ( ( ruleFeatureModel ) )
            // InternalFeatureModel.g:2476:2: ( ruleFeatureModel )
            {
            // InternalFeatureModel.g:2476:2: ( ruleFeatureModel )
            // InternalFeatureModel.g:2477:3: ruleFeatureModel
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
    // InternalFeatureModel.g:2486:1: rule__FeatureModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FeatureModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2490:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2491:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2491:2: ( ruleEString )
            // InternalFeatureModel.g:2492:3: ruleEString
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
    // InternalFeatureModel.g:2501:1: rule__FeatureModel__RootAssignment_3 : ( ruleFeature ) ;
    public final void rule__FeatureModel__RootAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2505:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2506:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2506:2: ( ruleFeature )
            // InternalFeatureModel.g:2507:3: ruleFeature
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


    // $ANTLR start "rule__FeatureModel__CrossTreeConstraintsAssignment_5"
    // InternalFeatureModel.g:2516:1: rule__FeatureModel__CrossTreeConstraintsAssignment_5 : ( ruleBasicConstraint ) ;
    public final void rule__FeatureModel__CrossTreeConstraintsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2520:1: ( ( ruleBasicConstraint ) )
            // InternalFeatureModel.g:2521:2: ( ruleBasicConstraint )
            {
            // InternalFeatureModel.g:2521:2: ( ruleBasicConstraint )
            // InternalFeatureModel.g:2522:3: ruleBasicConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsBasicConstraintParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsBasicConstraintParserRuleCall_5_0()); 
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
    // $ANTLR end "rule__FeatureModel__CrossTreeConstraintsAssignment_5"


    // $ANTLR start "rule__BasicConstraint__TypeAssignment_3"
    // InternalFeatureModel.g:2531:1: rule__BasicConstraint__TypeAssignment_3 : ( ruleCrossTreeConstraintType ) ;
    public final void rule__BasicConstraint__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2535:1: ( ( ruleCrossTreeConstraintType ) )
            // InternalFeatureModel.g:2536:2: ( ruleCrossTreeConstraintType )
            {
            // InternalFeatureModel.g:2536:2: ( ruleCrossTreeConstraintType )
            // InternalFeatureModel.g:2537:3: ruleCrossTreeConstraintType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getTypeCrossTreeConstraintTypeEnumRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCrossTreeConstraintType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getTypeCrossTreeConstraintTypeEnumRuleCall_3_0()); 
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
    // $ANTLR end "rule__BasicConstraint__TypeAssignment_3"


    // $ANTLR start "rule__BasicConstraint__RightFeatureAssignment_5"
    // InternalFeatureModel.g:2546:1: rule__BasicConstraint__RightFeatureAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__BasicConstraint__RightFeatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2550:1: ( ( ( ruleEString ) ) )
            // InternalFeatureModel.g:2551:2: ( ( ruleEString ) )
            {
            // InternalFeatureModel.g:2551:2: ( ( ruleEString ) )
            // InternalFeatureModel.g:2552:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getRightFeatureFeatureCrossReference_5_0()); 
            }
            // InternalFeatureModel.g:2553:3: ( ruleEString )
            // InternalFeatureModel.g:2554:4: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getRightFeatureFeatureEStringParserRuleCall_5_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getRightFeatureFeatureEStringParserRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getRightFeatureFeatureCrossReference_5_0()); 
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
    // $ANTLR end "rule__BasicConstraint__RightFeatureAssignment_5"


    // $ANTLR start "rule__BasicConstraint__LeftFeatureAssignment_7"
    // InternalFeatureModel.g:2565:1: rule__BasicConstraint__LeftFeatureAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__BasicConstraint__LeftFeatureAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2569:1: ( ( ( ruleEString ) ) )
            // InternalFeatureModel.g:2570:2: ( ( ruleEString ) )
            {
            // InternalFeatureModel.g:2570:2: ( ( ruleEString ) )
            // InternalFeatureModel.g:2571:3: ( ruleEString )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getLeftFeatureFeatureCrossReference_7_0()); 
            }
            // InternalFeatureModel.g:2572:3: ( ruleEString )
            // InternalFeatureModel.g:2573:4: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBasicConstraintAccess().getLeftFeatureFeatureEStringParserRuleCall_7_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getLeftFeatureFeatureEStringParserRuleCall_7_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBasicConstraintAccess().getLeftFeatureFeatureCrossReference_7_0()); 
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
    // $ANTLR end "rule__BasicConstraint__LeftFeatureAssignment_7"


    // $ANTLR start "rule__Feature_Impl__MandatoryAssignment_0_1"
    // InternalFeatureModel.g:2584:1: rule__Feature_Impl__MandatoryAssignment_0_1 : ( ( 'mandatory' ) ) ;
    public final void rule__Feature_Impl__MandatoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2588:1: ( ( ( 'mandatory' ) ) )
            // InternalFeatureModel.g:2589:2: ( ( 'mandatory' ) )
            {
            // InternalFeatureModel.g:2589:2: ( ( 'mandatory' ) )
            // InternalFeatureModel.g:2590:3: ( 'mandatory' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }
            // InternalFeatureModel.g:2591:3: ( 'mandatory' )
            // InternalFeatureModel.g:2592:4: 'mandatory'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:2603:1: rule__Feature_Impl__SelectedAssignment_1_1 : ( ( 'selected' ) ) ;
    public final void rule__Feature_Impl__SelectedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2607:1: ( ( ( 'selected' ) ) )
            // InternalFeatureModel.g:2608:2: ( ( 'selected' ) )
            {
            // InternalFeatureModel.g:2608:2: ( ( 'selected' ) )
            // InternalFeatureModel.g:2609:3: ( 'selected' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getSelectedSelectedKeyword_1_1_0()); 
            }
            // InternalFeatureModel.g:2610:3: ( 'selected' )
            // InternalFeatureModel.g:2611:4: 'selected'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getSelectedSelectedKeyword_1_1_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:2622:1: rule__Feature_Impl__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Feature_Impl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2626:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2627:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2627:2: ( ruleEString )
            // InternalFeatureModel.g:2628:3: ruleEString
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


    // $ANTLR start "rule__Feature_Impl__IdAssignment_6"
    // InternalFeatureModel.g:2637:1: rule__Feature_Impl__IdAssignment_6 : ( ruleEString ) ;
    public final void rule__Feature_Impl__IdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2641:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2642:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2642:2: ( ruleEString )
            // InternalFeatureModel.g:2643:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getIdEStringParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getIdEStringParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Feature_Impl__IdAssignment_6"


    // $ANTLR start "rule__Feature_Impl__ChildrenAssignment_7_2"
    // InternalFeatureModel.g:2652:1: rule__Feature_Impl__ChildrenAssignment_7_2 : ( ruleFeature ) ;
    public final void rule__Feature_Impl__ChildrenAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2656:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2657:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2657:2: ( ruleFeature )
            // InternalFeatureModel.g:2658:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_7_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_7_2_0()); 
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
    // $ANTLR end "rule__Feature_Impl__ChildrenAssignment_7_2"


    // $ANTLR start "rule__Feature_Impl__ChildrenAssignment_7_3_1"
    // InternalFeatureModel.g:2667:1: rule__Feature_Impl__ChildrenAssignment_7_3_1 : ( ruleFeature ) ;
    public final void rule__Feature_Impl__ChildrenAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2671:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2672:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2672:2: ( ruleFeature )
            // InternalFeatureModel.g:2673:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_7_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_7_3_1_0()); 
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
    // $ANTLR end "rule__Feature_Impl__ChildrenAssignment_7_3_1"


    // $ANTLR start "rule__Alternative__MandatoryAssignment_0_1"
    // InternalFeatureModel.g:2682:1: rule__Alternative__MandatoryAssignment_0_1 : ( ( 'mandatory' ) ) ;
    public final void rule__Alternative__MandatoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2686:1: ( ( ( 'mandatory' ) ) )
            // InternalFeatureModel.g:2687:2: ( ( 'mandatory' ) )
            {
            // InternalFeatureModel.g:2687:2: ( ( 'mandatory' ) )
            // InternalFeatureModel.g:2688:3: ( 'mandatory' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }
            // InternalFeatureModel.g:2689:3: ( 'mandatory' )
            // InternalFeatureModel.g:2690:4: 'mandatory'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:2701:1: rule__Alternative__SelectedAssignment_1_1 : ( ( 'selected' ) ) ;
    public final void rule__Alternative__SelectedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2705:1: ( ( ( 'selected' ) ) )
            // InternalFeatureModel.g:2706:2: ( ( 'selected' ) )
            {
            // InternalFeatureModel.g:2706:2: ( ( 'selected' ) )
            // InternalFeatureModel.g:2707:3: ( 'selected' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getSelectedSelectedKeyword_1_1_0()); 
            }
            // InternalFeatureModel.g:2708:3: ( 'selected' )
            // InternalFeatureModel.g:2709:4: 'selected'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getSelectedSelectedKeyword_1_1_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:2720:1: rule__Alternative__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Alternative__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2724:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2725:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2725:2: ( ruleEString )
            // InternalFeatureModel.g:2726:3: ruleEString
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


    // $ANTLR start "rule__Alternative__IdAssignment_6"
    // InternalFeatureModel.g:2735:1: rule__Alternative__IdAssignment_6 : ( ruleEString ) ;
    public final void rule__Alternative__IdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2739:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2740:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2740:2: ( ruleEString )
            // InternalFeatureModel.g:2741:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getIdEStringParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getIdEStringParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__Alternative__IdAssignment_6"


    // $ANTLR start "rule__Alternative__ChildrenAssignment_7_2"
    // InternalFeatureModel.g:2750:1: rule__Alternative__ChildrenAssignment_7_2 : ( ruleFeature ) ;
    public final void rule__Alternative__ChildrenAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2754:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2755:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2755:2: ( ruleFeature )
            // InternalFeatureModel.g:2756:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_7_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_7_2_0()); 
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
    // $ANTLR end "rule__Alternative__ChildrenAssignment_7_2"


    // $ANTLR start "rule__Alternative__ChildrenAssignment_7_3_1"
    // InternalFeatureModel.g:2765:1: rule__Alternative__ChildrenAssignment_7_3_1 : ( ruleFeature ) ;
    public final void rule__Alternative__ChildrenAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2769:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2770:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2770:2: ( ruleFeature )
            // InternalFeatureModel.g:2771:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_7_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_7_3_1_0()); 
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
    // $ANTLR end "rule__Alternative__ChildrenAssignment_7_3_1"


    // $ANTLR start "rule__OrGroup__MandatoryAssignment_0_1"
    // InternalFeatureModel.g:2780:1: rule__OrGroup__MandatoryAssignment_0_1 : ( ( 'mandatory' ) ) ;
    public final void rule__OrGroup__MandatoryAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2784:1: ( ( ( 'mandatory' ) ) )
            // InternalFeatureModel.g:2785:2: ( ( 'mandatory' ) )
            {
            // InternalFeatureModel.g:2785:2: ( ( 'mandatory' ) )
            // InternalFeatureModel.g:2786:3: ( 'mandatory' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }
            // InternalFeatureModel.g:2787:3: ( 'mandatory' )
            // InternalFeatureModel.g:2788:4: 'mandatory'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getMandatoryMandatoryKeyword_0_1_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:2799:1: rule__OrGroup__SelectedAssignment_1_1 : ( ( 'selected' ) ) ;
    public final void rule__OrGroup__SelectedAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2803:1: ( ( ( 'selected' ) ) )
            // InternalFeatureModel.g:2804:2: ( ( 'selected' ) )
            {
            // InternalFeatureModel.g:2804:2: ( ( 'selected' ) )
            // InternalFeatureModel.g:2805:3: ( 'selected' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getSelectedSelectedKeyword_1_1_0()); 
            }
            // InternalFeatureModel.g:2806:3: ( 'selected' )
            // InternalFeatureModel.g:2807:4: 'selected'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getSelectedSelectedKeyword_1_1_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalFeatureModel.g:2818:1: rule__OrGroup__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OrGroup__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2822:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2823:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2823:2: ( ruleEString )
            // InternalFeatureModel.g:2824:3: ruleEString
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


    // $ANTLR start "rule__OrGroup__IdAssignment_6"
    // InternalFeatureModel.g:2833:1: rule__OrGroup__IdAssignment_6 : ( ruleEString ) ;
    public final void rule__OrGroup__IdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2837:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2838:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2838:2: ( ruleEString )
            // InternalFeatureModel.g:2839:3: ruleEString
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getIdEStringParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getIdEStringParserRuleCall_6_0()); 
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
    // $ANTLR end "rule__OrGroup__IdAssignment_6"


    // $ANTLR start "rule__OrGroup__ChildrenAssignment_7_2"
    // InternalFeatureModel.g:2848:1: rule__OrGroup__ChildrenAssignment_7_2 : ( ruleFeature ) ;
    public final void rule__OrGroup__ChildrenAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2852:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2853:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2853:2: ( ruleFeature )
            // InternalFeatureModel.g:2854:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_7_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_7_2_0()); 
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
    // $ANTLR end "rule__OrGroup__ChildrenAssignment_7_2"


    // $ANTLR start "rule__OrGroup__ChildrenAssignment_7_3_1"
    // InternalFeatureModel.g:2863:1: rule__OrGroup__ChildrenAssignment_7_3_1 : ( ruleFeature ) ;
    public final void rule__OrGroup__ChildrenAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2867:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2868:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2868:2: ( ruleFeature )
            // InternalFeatureModel.g:2869:3: ruleFeature
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_7_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_7_3_1_0()); 
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
    // $ANTLR end "rule__OrGroup__ChildrenAssignment_7_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000066800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000006800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000026000000L});

}