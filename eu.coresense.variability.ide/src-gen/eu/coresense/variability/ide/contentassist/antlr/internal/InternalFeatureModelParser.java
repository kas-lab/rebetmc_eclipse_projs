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

@SuppressWarnings("all")
public class InternalFeatureModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'REQUIRES'", "'EXCLUDES'", "'feature_model'", "'{'", "'featureDefinitions'", "'}'", "','", "'name'", "'root'", "'features'", "'crossTreeConstraints'", "'BasicConstraint'", "'type'", "'rightFeature'", "'leftFeature'", "'Feature'", "'id'", "'children'", "'Alternative'", "'OrGroup'", "'mandatory'", "'selected'"
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
    // InternalFeatureModel.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalFeatureModel.g:54:1: ( ruleModel EOF )
            // InternalFeatureModel.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFeatureModel.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalFeatureModel.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalFeatureModel.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalFeatureModel.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalFeatureModel.g:69:3: ( rule__Model__Group__0 )
            // InternalFeatureModel.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
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
    // InternalFeatureModel.g:78:1: entryRuleFeatureModel : ruleFeatureModel EOF ;
    public final void entryRuleFeatureModel() throws RecognitionException {
        try {
            // InternalFeatureModel.g:79:1: ( ruleFeatureModel EOF )
            // InternalFeatureModel.g:80:1: ruleFeatureModel EOF
            {
             before(grammarAccess.getFeatureModelRule()); 
            pushFollow(FOLLOW_1);
            ruleFeatureModel();

            state._fsp--;

             after(grammarAccess.getFeatureModelRule()); 
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
    // $ANTLR end "entryRuleFeatureModel"


    // $ANTLR start "ruleFeatureModel"
    // InternalFeatureModel.g:87:1: ruleFeatureModel : ( ( rule__FeatureModel__Group__0 ) ) ;
    public final void ruleFeatureModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:91:2: ( ( ( rule__FeatureModel__Group__0 ) ) )
            // InternalFeatureModel.g:92:2: ( ( rule__FeatureModel__Group__0 ) )
            {
            // InternalFeatureModel.g:92:2: ( ( rule__FeatureModel__Group__0 ) )
            // InternalFeatureModel.g:93:3: ( rule__FeatureModel__Group__0 )
            {
             before(grammarAccess.getFeatureModelAccess().getGroup()); 
            // InternalFeatureModel.g:94:3: ( rule__FeatureModel__Group__0 )
            // InternalFeatureModel.g:94:4: rule__FeatureModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeatureModelAccess().getGroup()); 

            }


            }

        }
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
    // InternalFeatureModel.g:103:1: entryRuleBasicConstraint : ruleBasicConstraint EOF ;
    public final void entryRuleBasicConstraint() throws RecognitionException {
        try {
            // InternalFeatureModel.g:104:1: ( ruleBasicConstraint EOF )
            // InternalFeatureModel.g:105:1: ruleBasicConstraint EOF
            {
             before(grammarAccess.getBasicConstraintRule()); 
            pushFollow(FOLLOW_1);
            ruleBasicConstraint();

            state._fsp--;

             after(grammarAccess.getBasicConstraintRule()); 
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
    // $ANTLR end "entryRuleBasicConstraint"


    // $ANTLR start "ruleBasicConstraint"
    // InternalFeatureModel.g:112:1: ruleBasicConstraint : ( ( rule__BasicConstraint__Group__0 ) ) ;
    public final void ruleBasicConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:116:2: ( ( ( rule__BasicConstraint__Group__0 ) ) )
            // InternalFeatureModel.g:117:2: ( ( rule__BasicConstraint__Group__0 ) )
            {
            // InternalFeatureModel.g:117:2: ( ( rule__BasicConstraint__Group__0 ) )
            // InternalFeatureModel.g:118:3: ( rule__BasicConstraint__Group__0 )
            {
             before(grammarAccess.getBasicConstraintAccess().getGroup()); 
            // InternalFeatureModel.g:119:3: ( rule__BasicConstraint__Group__0 )
            // InternalFeatureModel.g:119:4: rule__BasicConstraint__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBasicConstraintAccess().getGroup()); 

            }


            }

        }
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
    // InternalFeatureModel.g:128:1: entryRuleFeature : ruleFeature EOF ;
    public final void entryRuleFeature() throws RecognitionException {
        try {
            // InternalFeatureModel.g:129:1: ( ruleFeature EOF )
            // InternalFeatureModel.g:130:1: ruleFeature EOF
            {
             before(grammarAccess.getFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureRule()); 
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
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalFeatureModel.g:137:1: ruleFeature : ( ( rule__Feature__Alternatives ) ) ;
    public final void ruleFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:141:2: ( ( ( rule__Feature__Alternatives ) ) )
            // InternalFeatureModel.g:142:2: ( ( rule__Feature__Alternatives ) )
            {
            // InternalFeatureModel.g:142:2: ( ( rule__Feature__Alternatives ) )
            // InternalFeatureModel.g:143:3: ( rule__Feature__Alternatives )
            {
             before(grammarAccess.getFeatureAccess().getAlternatives()); 
            // InternalFeatureModel.g:144:3: ( rule__Feature__Alternatives )
            // InternalFeatureModel.g:144:4: rule__Feature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Feature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFeatureAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalFeatureModel.g:153:1: entryRuleFeature_Impl : ruleFeature_Impl EOF ;
    public final void entryRuleFeature_Impl() throws RecognitionException {
        try {
            // InternalFeatureModel.g:154:1: ( ruleFeature_Impl EOF )
            // InternalFeatureModel.g:155:1: ruleFeature_Impl EOF
            {
             before(grammarAccess.getFeature_ImplRule()); 
            pushFollow(FOLLOW_1);
            ruleFeature_Impl();

            state._fsp--;

             after(grammarAccess.getFeature_ImplRule()); 
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
    // $ANTLR end "entryRuleFeature_Impl"


    // $ANTLR start "ruleFeature_Impl"
    // InternalFeatureModel.g:162:1: ruleFeature_Impl : ( ( rule__Feature_Impl__Group__0 ) ) ;
    public final void ruleFeature_Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:166:2: ( ( ( rule__Feature_Impl__Group__0 ) ) )
            // InternalFeatureModel.g:167:2: ( ( rule__Feature_Impl__Group__0 ) )
            {
            // InternalFeatureModel.g:167:2: ( ( rule__Feature_Impl__Group__0 ) )
            // InternalFeatureModel.g:168:3: ( rule__Feature_Impl__Group__0 )
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup()); 
            // InternalFeatureModel.g:169:3: ( rule__Feature_Impl__Group__0 )
            // InternalFeatureModel.g:169:4: rule__Feature_Impl__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFeature_ImplAccess().getGroup()); 

            }


            }

        }
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
    // InternalFeatureModel.g:178:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalFeatureModel.g:179:1: ( ruleEString EOF )
            // InternalFeatureModel.g:180:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFeatureModel.g:187:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:191:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalFeatureModel.g:192:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalFeatureModel.g:192:2: ( ( rule__EString__Alternatives ) )
            // InternalFeatureModel.g:193:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalFeatureModel.g:194:3: ( rule__EString__Alternatives )
            // InternalFeatureModel.g:194:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalFeatureModel.g:203:1: entryRuleAlternative : ruleAlternative EOF ;
    public final void entryRuleAlternative() throws RecognitionException {
        try {
            // InternalFeatureModel.g:204:1: ( ruleAlternative EOF )
            // InternalFeatureModel.g:205:1: ruleAlternative EOF
            {
             before(grammarAccess.getAlternativeRule()); 
            pushFollow(FOLLOW_1);
            ruleAlternative();

            state._fsp--;

             after(grammarAccess.getAlternativeRule()); 
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
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // InternalFeatureModel.g:212:1: ruleAlternative : ( ( rule__Alternative__Group__0 ) ) ;
    public final void ruleAlternative() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:216:2: ( ( ( rule__Alternative__Group__0 ) ) )
            // InternalFeatureModel.g:217:2: ( ( rule__Alternative__Group__0 ) )
            {
            // InternalFeatureModel.g:217:2: ( ( rule__Alternative__Group__0 ) )
            // InternalFeatureModel.g:218:3: ( rule__Alternative__Group__0 )
            {
             before(grammarAccess.getAlternativeAccess().getGroup()); 
            // InternalFeatureModel.g:219:3: ( rule__Alternative__Group__0 )
            // InternalFeatureModel.g:219:4: rule__Alternative__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getGroup()); 

            }


            }

        }
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
    // InternalFeatureModel.g:228:1: entryRuleOrGroup : ruleOrGroup EOF ;
    public final void entryRuleOrGroup() throws RecognitionException {
        try {
            // InternalFeatureModel.g:229:1: ( ruleOrGroup EOF )
            // InternalFeatureModel.g:230:1: ruleOrGroup EOF
            {
             before(grammarAccess.getOrGroupRule()); 
            pushFollow(FOLLOW_1);
            ruleOrGroup();

            state._fsp--;

             after(grammarAccess.getOrGroupRule()); 
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
    // $ANTLR end "entryRuleOrGroup"


    // $ANTLR start "ruleOrGroup"
    // InternalFeatureModel.g:237:1: ruleOrGroup : ( ( rule__OrGroup__Group__0 ) ) ;
    public final void ruleOrGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:241:2: ( ( ( rule__OrGroup__Group__0 ) ) )
            // InternalFeatureModel.g:242:2: ( ( rule__OrGroup__Group__0 ) )
            {
            // InternalFeatureModel.g:242:2: ( ( rule__OrGroup__Group__0 ) )
            // InternalFeatureModel.g:243:3: ( rule__OrGroup__Group__0 )
            {
             before(grammarAccess.getOrGroupAccess().getGroup()); 
            // InternalFeatureModel.g:244:3: ( rule__OrGroup__Group__0 )
            // InternalFeatureModel.g:244:4: rule__OrGroup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOrGroupAccess().getGroup()); 

            }


            }

        }
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
    // InternalFeatureModel.g:253:1: ruleCrossTreeConstraintType : ( ( rule__CrossTreeConstraintType__Alternatives ) ) ;
    public final void ruleCrossTreeConstraintType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:257:1: ( ( ( rule__CrossTreeConstraintType__Alternatives ) ) )
            // InternalFeatureModel.g:258:2: ( ( rule__CrossTreeConstraintType__Alternatives ) )
            {
            // InternalFeatureModel.g:258:2: ( ( rule__CrossTreeConstraintType__Alternatives ) )
            // InternalFeatureModel.g:259:3: ( rule__CrossTreeConstraintType__Alternatives )
            {
             before(grammarAccess.getCrossTreeConstraintTypeAccess().getAlternatives()); 
            // InternalFeatureModel.g:260:3: ( rule__CrossTreeConstraintType__Alternatives )
            // InternalFeatureModel.g:260:4: rule__CrossTreeConstraintType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CrossTreeConstraintType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCrossTreeConstraintTypeAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalFeatureModel.g:268:1: rule__Feature__Alternatives : ( ( ruleFeature_Impl ) | ( ruleAlternative ) | ( ruleOrGroup ) );
    public final void rule__Feature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:272:1: ( ( ruleFeature_Impl ) | ( ruleAlternative ) | ( ruleOrGroup ) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==31) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==32) ) {
                    switch ( input.LA(3) ) {
                    case 30:
                        {
                        alt1=3;
                        }
                        break;
                    case 29:
                        {
                        alt1=2;
                        }
                        break;
                    case 26:
                        {
                        alt1=1;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;
                    }

                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFeatureModel.g:273:2: ( ruleFeature_Impl )
                    {
                    // InternalFeatureModel.g:273:2: ( ruleFeature_Impl )
                    // InternalFeatureModel.g:274:3: ruleFeature_Impl
                    {
                     before(grammarAccess.getFeatureAccess().getFeature_ImplParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleFeature_Impl();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getFeature_ImplParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:279:2: ( ruleAlternative )
                    {
                    // InternalFeatureModel.g:279:2: ( ruleAlternative )
                    // InternalFeatureModel.g:280:3: ruleAlternative
                    {
                     before(grammarAccess.getFeatureAccess().getAlternativeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAlternative();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getAlternativeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureModel.g:285:2: ( ruleOrGroup )
                    {
                    // InternalFeatureModel.g:285:2: ( ruleOrGroup )
                    // InternalFeatureModel.g:286:3: ruleOrGroup
                    {
                     before(grammarAccess.getFeatureAccess().getOrGroupParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOrGroup();

                    state._fsp--;

                     after(grammarAccess.getFeatureAccess().getOrGroupParserRuleCall_2()); 

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
    // InternalFeatureModel.g:295:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:299:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFeatureModel.g:300:2: ( RULE_STRING )
                    {
                    // InternalFeatureModel.g:300:2: ( RULE_STRING )
                    // InternalFeatureModel.g:301:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:306:2: ( RULE_ID )
                    {
                    // InternalFeatureModel.g:306:2: ( RULE_ID )
                    // InternalFeatureModel.g:307:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // InternalFeatureModel.g:316:1: rule__CrossTreeConstraintType__Alternatives : ( ( ( 'REQUIRES' ) ) | ( ( 'EXCLUDES' ) ) );
    public final void rule__CrossTreeConstraintType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:320:1: ( ( ( 'REQUIRES' ) ) | ( ( 'EXCLUDES' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFeatureModel.g:321:2: ( ( 'REQUIRES' ) )
                    {
                    // InternalFeatureModel.g:321:2: ( ( 'REQUIRES' ) )
                    // InternalFeatureModel.g:322:3: ( 'REQUIRES' )
                    {
                     before(grammarAccess.getCrossTreeConstraintTypeAccess().getREQUIRESEnumLiteralDeclaration_0()); 
                    // InternalFeatureModel.g:323:3: ( 'REQUIRES' )
                    // InternalFeatureModel.g:323:4: 'REQUIRES'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getCrossTreeConstraintTypeAccess().getREQUIRESEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:327:2: ( ( 'EXCLUDES' ) )
                    {
                    // InternalFeatureModel.g:327:2: ( ( 'EXCLUDES' ) )
                    // InternalFeatureModel.g:328:3: ( 'EXCLUDES' )
                    {
                     before(grammarAccess.getCrossTreeConstraintTypeAccess().getEXCLUDESEnumLiteralDeclaration_1()); 
                    // InternalFeatureModel.g:329:3: ( 'EXCLUDES' )
                    // InternalFeatureModel.g:329:4: 'EXCLUDES'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getCrossTreeConstraintTypeAccess().getEXCLUDESEnumLiteralDeclaration_1()); 

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
    // InternalFeatureModel.g:337:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:341:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalFeatureModel.g:342:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalFeatureModel.g:349:1: rule__Model__Group__0__Impl : ( 'feature_model' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:353:1: ( ( 'feature_model' ) )
            // InternalFeatureModel.g:354:1: ( 'feature_model' )
            {
            // InternalFeatureModel.g:354:1: ( 'feature_model' )
            // InternalFeatureModel.g:355:2: 'feature_model'
            {
             before(grammarAccess.getModelAccess().getFeature_modelKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFeature_modelKeyword_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:364:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:368:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalFeatureModel.g:369:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalFeatureModel.g:376:1: rule__Model__Group__1__Impl : ( '{' ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:380:1: ( ( '{' ) )
            // InternalFeatureModel.g:381:1: ( '{' )
            {
            // InternalFeatureModel.g:381:1: ( '{' )
            // InternalFeatureModel.g:382:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalFeatureModel.g:391:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:395:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalFeatureModel.g:396:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalFeatureModel.g:403:1: rule__Model__Group__2__Impl : ( 'featureDefinitions' ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:407:1: ( ( 'featureDefinitions' ) )
            // InternalFeatureModel.g:408:1: ( 'featureDefinitions' )
            {
            // InternalFeatureModel.g:408:1: ( 'featureDefinitions' )
            // InternalFeatureModel.g:409:2: 'featureDefinitions'
            {
             before(grammarAccess.getModelAccess().getFeatureDefinitionsKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getFeatureDefinitionsKeyword_2()); 

            }


            }

        }
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
    // InternalFeatureModel.g:418:1: rule__Model__Group__3 : rule__Model__Group__3__Impl rule__Model__Group__4 ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:422:1: ( rule__Model__Group__3__Impl rule__Model__Group__4 )
            // InternalFeatureModel.g:423:2: rule__Model__Group__3__Impl rule__Model__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__4();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalFeatureModel.g:430:1: rule__Model__Group__3__Impl : ( '{' ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:434:1: ( ( '{' ) )
            // InternalFeatureModel.g:435:1: ( '{' )
            {
            // InternalFeatureModel.g:435:1: ( '{' )
            // InternalFeatureModel.g:436:2: '{'
            {
             before(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__Group__4"
    // InternalFeatureModel.g:445:1: rule__Model__Group__4 : rule__Model__Group__4__Impl rule__Model__Group__5 ;
    public final void rule__Model__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:449:1: ( rule__Model__Group__4__Impl rule__Model__Group__5 )
            // InternalFeatureModel.g:450:2: rule__Model__Group__4__Impl rule__Model__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__5();

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
    // $ANTLR end "rule__Model__Group__4"


    // $ANTLR start "rule__Model__Group__4__Impl"
    // InternalFeatureModel.g:457:1: rule__Model__Group__4__Impl : ( ( rule__Model__FeatureDefinitionsAssignment_4 ) ) ;
    public final void rule__Model__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:461:1: ( ( ( rule__Model__FeatureDefinitionsAssignment_4 ) ) )
            // InternalFeatureModel.g:462:1: ( ( rule__Model__FeatureDefinitionsAssignment_4 ) )
            {
            // InternalFeatureModel.g:462:1: ( ( rule__Model__FeatureDefinitionsAssignment_4 ) )
            // InternalFeatureModel.g:463:2: ( rule__Model__FeatureDefinitionsAssignment_4 )
            {
             before(grammarAccess.getModelAccess().getFeatureDefinitionsAssignment_4()); 
            // InternalFeatureModel.g:464:2: ( rule__Model__FeatureDefinitionsAssignment_4 )
            // InternalFeatureModel.g:464:3: rule__Model__FeatureDefinitionsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Model__FeatureDefinitionsAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getFeatureDefinitionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__4__Impl"


    // $ANTLR start "rule__Model__Group__5"
    // InternalFeatureModel.g:472:1: rule__Model__Group__5 : rule__Model__Group__5__Impl rule__Model__Group__6 ;
    public final void rule__Model__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:476:1: ( rule__Model__Group__5__Impl rule__Model__Group__6 )
            // InternalFeatureModel.g:477:2: rule__Model__Group__5__Impl rule__Model__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__Model__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__6();

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
    // $ANTLR end "rule__Model__Group__5"


    // $ANTLR start "rule__Model__Group__5__Impl"
    // InternalFeatureModel.g:484:1: rule__Model__Group__5__Impl : ( ( rule__Model__Group_5__0 )* ) ;
    public final void rule__Model__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:488:1: ( ( ( rule__Model__Group_5__0 )* ) )
            // InternalFeatureModel.g:489:1: ( ( rule__Model__Group_5__0 )* )
            {
            // InternalFeatureModel.g:489:1: ( ( rule__Model__Group_5__0 )* )
            // InternalFeatureModel.g:490:2: ( rule__Model__Group_5__0 )*
            {
             before(grammarAccess.getModelAccess().getGroup_5()); 
            // InternalFeatureModel.g:491:2: ( rule__Model__Group_5__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFeatureModel.g:491:3: rule__Model__Group_5__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Model__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__5__Impl"


    // $ANTLR start "rule__Model__Group__6"
    // InternalFeatureModel.g:499:1: rule__Model__Group__6 : rule__Model__Group__6__Impl rule__Model__Group__7 ;
    public final void rule__Model__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:503:1: ( rule__Model__Group__6__Impl rule__Model__Group__7 )
            // InternalFeatureModel.g:504:2: rule__Model__Group__6__Impl rule__Model__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Model__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__7();

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
    // $ANTLR end "rule__Model__Group__6"


    // $ANTLR start "rule__Model__Group__6__Impl"
    // InternalFeatureModel.g:511:1: rule__Model__Group__6__Impl : ( '}' ) ;
    public final void rule__Model__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:515:1: ( ( '}' ) )
            // InternalFeatureModel.g:516:1: ( '}' )
            {
            // InternalFeatureModel.g:516:1: ( '}' )
            // InternalFeatureModel.g:517:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__6__Impl"


    // $ANTLR start "rule__Model__Group__7"
    // InternalFeatureModel.g:526:1: rule__Model__Group__7 : rule__Model__Group__7__Impl rule__Model__Group__8 ;
    public final void rule__Model__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:530:1: ( rule__Model__Group__7__Impl rule__Model__Group__8 )
            // InternalFeatureModel.g:531:2: rule__Model__Group__7__Impl rule__Model__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__Model__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__8();

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
    // $ANTLR end "rule__Model__Group__7"


    // $ANTLR start "rule__Model__Group__7__Impl"
    // InternalFeatureModel.g:538:1: rule__Model__Group__7__Impl : ( ( rule__Model__FmAssignment_7 ) ) ;
    public final void rule__Model__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:542:1: ( ( ( rule__Model__FmAssignment_7 ) ) )
            // InternalFeatureModel.g:543:1: ( ( rule__Model__FmAssignment_7 ) )
            {
            // InternalFeatureModel.g:543:1: ( ( rule__Model__FmAssignment_7 ) )
            // InternalFeatureModel.g:544:2: ( rule__Model__FmAssignment_7 )
            {
             before(grammarAccess.getModelAccess().getFmAssignment_7()); 
            // InternalFeatureModel.g:545:2: ( rule__Model__FmAssignment_7 )
            // InternalFeatureModel.g:545:3: rule__Model__FmAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Model__FmAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getFmAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__7__Impl"


    // $ANTLR start "rule__Model__Group__8"
    // InternalFeatureModel.g:553:1: rule__Model__Group__8 : rule__Model__Group__8__Impl ;
    public final void rule__Model__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:557:1: ( rule__Model__Group__8__Impl )
            // InternalFeatureModel.g:558:2: rule__Model__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__8__Impl();

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
    // $ANTLR end "rule__Model__Group__8"


    // $ANTLR start "rule__Model__Group__8__Impl"
    // InternalFeatureModel.g:564:1: rule__Model__Group__8__Impl : ( '}' ) ;
    public final void rule__Model__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:568:1: ( ( '}' ) )
            // InternalFeatureModel.g:569:1: ( '}' )
            {
            // InternalFeatureModel.g:569:1: ( '}' )
            // InternalFeatureModel.g:570:2: '}'
            {
             before(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__8__Impl"


    // $ANTLR start "rule__Model__Group_5__0"
    // InternalFeatureModel.g:580:1: rule__Model__Group_5__0 : rule__Model__Group_5__0__Impl rule__Model__Group_5__1 ;
    public final void rule__Model__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:584:1: ( rule__Model__Group_5__0__Impl rule__Model__Group_5__1 )
            // InternalFeatureModel.g:585:2: rule__Model__Group_5__0__Impl rule__Model__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_5__1();

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
    // $ANTLR end "rule__Model__Group_5__0"


    // $ANTLR start "rule__Model__Group_5__0__Impl"
    // InternalFeatureModel.g:592:1: rule__Model__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Model__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:596:1: ( ( ',' ) )
            // InternalFeatureModel.g:597:1: ( ',' )
            {
            // InternalFeatureModel.g:597:1: ( ',' )
            // InternalFeatureModel.g:598:2: ','
            {
             before(grammarAccess.getModelAccess().getCommaKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__0__Impl"


    // $ANTLR start "rule__Model__Group_5__1"
    // InternalFeatureModel.g:607:1: rule__Model__Group_5__1 : rule__Model__Group_5__1__Impl ;
    public final void rule__Model__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:611:1: ( rule__Model__Group_5__1__Impl )
            // InternalFeatureModel.g:612:2: rule__Model__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_5__1__Impl();

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
    // $ANTLR end "rule__Model__Group_5__1"


    // $ANTLR start "rule__Model__Group_5__1__Impl"
    // InternalFeatureModel.g:618:1: rule__Model__Group_5__1__Impl : ( ( rule__Model__FeatureDefinitionsAssignment_5_1 ) ) ;
    public final void rule__Model__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:622:1: ( ( ( rule__Model__FeatureDefinitionsAssignment_5_1 ) ) )
            // InternalFeatureModel.g:623:1: ( ( rule__Model__FeatureDefinitionsAssignment_5_1 ) )
            {
            // InternalFeatureModel.g:623:1: ( ( rule__Model__FeatureDefinitionsAssignment_5_1 ) )
            // InternalFeatureModel.g:624:2: ( rule__Model__FeatureDefinitionsAssignment_5_1 )
            {
             before(grammarAccess.getModelAccess().getFeatureDefinitionsAssignment_5_1()); 
            // InternalFeatureModel.g:625:2: ( rule__Model__FeatureDefinitionsAssignment_5_1 )
            // InternalFeatureModel.g:625:3: rule__Model__FeatureDefinitionsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__FeatureDefinitionsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getFeatureDefinitionsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_5__1__Impl"


    // $ANTLR start "rule__FeatureModel__Group__0"
    // InternalFeatureModel.g:634:1: rule__FeatureModel__Group__0 : rule__FeatureModel__Group__0__Impl rule__FeatureModel__Group__1 ;
    public final void rule__FeatureModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:638:1: ( rule__FeatureModel__Group__0__Impl rule__FeatureModel__Group__1 )
            // InternalFeatureModel.g:639:2: rule__FeatureModel__Group__0__Impl rule__FeatureModel__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__FeatureModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__1();

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
    // $ANTLR end "rule__FeatureModel__Group__0"


    // $ANTLR start "rule__FeatureModel__Group__0__Impl"
    // InternalFeatureModel.g:646:1: rule__FeatureModel__Group__0__Impl : ( 'name' ) ;
    public final void rule__FeatureModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:650:1: ( ( 'name' ) )
            // InternalFeatureModel.g:651:1: ( 'name' )
            {
            // InternalFeatureModel.g:651:1: ( 'name' )
            // InternalFeatureModel.g:652:2: 'name'
            {
             before(grammarAccess.getFeatureModelAccess().getNameKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getFeatureModelAccess().getNameKeyword_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:661:1: rule__FeatureModel__Group__1 : rule__FeatureModel__Group__1__Impl rule__FeatureModel__Group__2 ;
    public final void rule__FeatureModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:665:1: ( rule__FeatureModel__Group__1__Impl rule__FeatureModel__Group__2 )
            // InternalFeatureModel.g:666:2: rule__FeatureModel__Group__1__Impl rule__FeatureModel__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__FeatureModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__2();

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
    // $ANTLR end "rule__FeatureModel__Group__1"


    // $ANTLR start "rule__FeatureModel__Group__1__Impl"
    // InternalFeatureModel.g:673:1: rule__FeatureModel__Group__1__Impl : ( ( rule__FeatureModel__NameAssignment_1 ) ) ;
    public final void rule__FeatureModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:677:1: ( ( ( rule__FeatureModel__NameAssignment_1 ) ) )
            // InternalFeatureModel.g:678:1: ( ( rule__FeatureModel__NameAssignment_1 ) )
            {
            // InternalFeatureModel.g:678:1: ( ( rule__FeatureModel__NameAssignment_1 ) )
            // InternalFeatureModel.g:679:2: ( rule__FeatureModel__NameAssignment_1 )
            {
             before(grammarAccess.getFeatureModelAccess().getNameAssignment_1()); 
            // InternalFeatureModel.g:680:2: ( rule__FeatureModel__NameAssignment_1 )
            // InternalFeatureModel.g:680:3: rule__FeatureModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FeatureModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeatureModelAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalFeatureModel.g:688:1: rule__FeatureModel__Group__2 : rule__FeatureModel__Group__2__Impl rule__FeatureModel__Group__3 ;
    public final void rule__FeatureModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:692:1: ( rule__FeatureModel__Group__2__Impl rule__FeatureModel__Group__3 )
            // InternalFeatureModel.g:693:2: rule__FeatureModel__Group__2__Impl rule__FeatureModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__FeatureModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__3();

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
    // $ANTLR end "rule__FeatureModel__Group__2"


    // $ANTLR start "rule__FeatureModel__Group__2__Impl"
    // InternalFeatureModel.g:700:1: rule__FeatureModel__Group__2__Impl : ( 'root' ) ;
    public final void rule__FeatureModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:704:1: ( ( 'root' ) )
            // InternalFeatureModel.g:705:1: ( 'root' )
            {
            // InternalFeatureModel.g:705:1: ( 'root' )
            // InternalFeatureModel.g:706:2: 'root'
            {
             before(grammarAccess.getFeatureModelAccess().getRootKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFeatureModelAccess().getRootKeyword_2()); 

            }


            }

        }
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
    // InternalFeatureModel.g:715:1: rule__FeatureModel__Group__3 : rule__FeatureModel__Group__3__Impl rule__FeatureModel__Group__4 ;
    public final void rule__FeatureModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:719:1: ( rule__FeatureModel__Group__3__Impl rule__FeatureModel__Group__4 )
            // InternalFeatureModel.g:720:2: rule__FeatureModel__Group__3__Impl rule__FeatureModel__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__FeatureModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__4();

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
    // $ANTLR end "rule__FeatureModel__Group__3"


    // $ANTLR start "rule__FeatureModel__Group__3__Impl"
    // InternalFeatureModel.g:727:1: rule__FeatureModel__Group__3__Impl : ( ( rule__FeatureModel__RootAssignment_3 ) ) ;
    public final void rule__FeatureModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:731:1: ( ( ( rule__FeatureModel__RootAssignment_3 ) ) )
            // InternalFeatureModel.g:732:1: ( ( rule__FeatureModel__RootAssignment_3 ) )
            {
            // InternalFeatureModel.g:732:1: ( ( rule__FeatureModel__RootAssignment_3 ) )
            // InternalFeatureModel.g:733:2: ( rule__FeatureModel__RootAssignment_3 )
            {
             before(grammarAccess.getFeatureModelAccess().getRootAssignment_3()); 
            // InternalFeatureModel.g:734:2: ( rule__FeatureModel__RootAssignment_3 )
            // InternalFeatureModel.g:734:3: rule__FeatureModel__RootAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__FeatureModel__RootAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeatureModelAccess().getRootAssignment_3()); 

            }


            }

        }
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
    // InternalFeatureModel.g:742:1: rule__FeatureModel__Group__4 : rule__FeatureModel__Group__4__Impl rule__FeatureModel__Group__5 ;
    public final void rule__FeatureModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:746:1: ( rule__FeatureModel__Group__4__Impl rule__FeatureModel__Group__5 )
            // InternalFeatureModel.g:747:2: rule__FeatureModel__Group__4__Impl rule__FeatureModel__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__FeatureModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__5();

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
    // $ANTLR end "rule__FeatureModel__Group__4"


    // $ANTLR start "rule__FeatureModel__Group__4__Impl"
    // InternalFeatureModel.g:754:1: rule__FeatureModel__Group__4__Impl : ( 'features' ) ;
    public final void rule__FeatureModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:758:1: ( ( 'features' ) )
            // InternalFeatureModel.g:759:1: ( 'features' )
            {
            // InternalFeatureModel.g:759:1: ( 'features' )
            // InternalFeatureModel.g:760:2: 'features'
            {
             before(grammarAccess.getFeatureModelAccess().getFeaturesKeyword_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getFeatureModelAccess().getFeaturesKeyword_4()); 

            }


            }

        }
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
    // InternalFeatureModel.g:769:1: rule__FeatureModel__Group__5 : rule__FeatureModel__Group__5__Impl rule__FeatureModel__Group__6 ;
    public final void rule__FeatureModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:773:1: ( rule__FeatureModel__Group__5__Impl rule__FeatureModel__Group__6 )
            // InternalFeatureModel.g:774:2: rule__FeatureModel__Group__5__Impl rule__FeatureModel__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__FeatureModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__6();

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
    // $ANTLR end "rule__FeatureModel__Group__5"


    // $ANTLR start "rule__FeatureModel__Group__5__Impl"
    // InternalFeatureModel.g:781:1: rule__FeatureModel__Group__5__Impl : ( ( rule__FeatureModel__FeaturesAssignment_5 ) ) ;
    public final void rule__FeatureModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:785:1: ( ( ( rule__FeatureModel__FeaturesAssignment_5 ) ) )
            // InternalFeatureModel.g:786:1: ( ( rule__FeatureModel__FeaturesAssignment_5 ) )
            {
            // InternalFeatureModel.g:786:1: ( ( rule__FeatureModel__FeaturesAssignment_5 ) )
            // InternalFeatureModel.g:787:2: ( rule__FeatureModel__FeaturesAssignment_5 )
            {
             before(grammarAccess.getFeatureModelAccess().getFeaturesAssignment_5()); 
            // InternalFeatureModel.g:788:2: ( rule__FeatureModel__FeaturesAssignment_5 )
            // InternalFeatureModel.g:788:3: rule__FeatureModel__FeaturesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__FeatureModel__FeaturesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getFeatureModelAccess().getFeaturesAssignment_5()); 

            }


            }

        }
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
    // InternalFeatureModel.g:796:1: rule__FeatureModel__Group__6 : rule__FeatureModel__Group__6__Impl rule__FeatureModel__Group__7 ;
    public final void rule__FeatureModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:800:1: ( rule__FeatureModel__Group__6__Impl rule__FeatureModel__Group__7 )
            // InternalFeatureModel.g:801:2: rule__FeatureModel__Group__6__Impl rule__FeatureModel__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__FeatureModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__7();

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
    // $ANTLR end "rule__FeatureModel__Group__6"


    // $ANTLR start "rule__FeatureModel__Group__6__Impl"
    // InternalFeatureModel.g:808:1: rule__FeatureModel__Group__6__Impl : ( 'crossTreeConstraints' ) ;
    public final void rule__FeatureModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:812:1: ( ( 'crossTreeConstraints' ) )
            // InternalFeatureModel.g:813:1: ( 'crossTreeConstraints' )
            {
            // InternalFeatureModel.g:813:1: ( 'crossTreeConstraints' )
            // InternalFeatureModel.g:814:2: 'crossTreeConstraints'
            {
             before(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsKeyword_6()); 

            }


            }

        }
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
    // InternalFeatureModel.g:823:1: rule__FeatureModel__Group__7 : rule__FeatureModel__Group__7__Impl ;
    public final void rule__FeatureModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:827:1: ( rule__FeatureModel__Group__7__Impl )
            // InternalFeatureModel.g:828:2: rule__FeatureModel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FeatureModel__Group__7__Impl();

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
    // $ANTLR end "rule__FeatureModel__Group__7"


    // $ANTLR start "rule__FeatureModel__Group__7__Impl"
    // InternalFeatureModel.g:834:1: rule__FeatureModel__Group__7__Impl : ( ( rule__FeatureModel__CrossTreeConstraintsAssignment_7 )* ) ;
    public final void rule__FeatureModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:838:1: ( ( ( rule__FeatureModel__CrossTreeConstraintsAssignment_7 )* ) )
            // InternalFeatureModel.g:839:1: ( ( rule__FeatureModel__CrossTreeConstraintsAssignment_7 )* )
            {
            // InternalFeatureModel.g:839:1: ( ( rule__FeatureModel__CrossTreeConstraintsAssignment_7 )* )
            // InternalFeatureModel.g:840:2: ( rule__FeatureModel__CrossTreeConstraintsAssignment_7 )*
            {
             before(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsAssignment_7()); 
            // InternalFeatureModel.g:841:2: ( rule__FeatureModel__CrossTreeConstraintsAssignment_7 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFeatureModel.g:841:3: rule__FeatureModel__CrossTreeConstraintsAssignment_7
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__FeatureModel__CrossTreeConstraintsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__BasicConstraint__Group__0"
    // InternalFeatureModel.g:850:1: rule__BasicConstraint__Group__0 : rule__BasicConstraint__Group__0__Impl rule__BasicConstraint__Group__1 ;
    public final void rule__BasicConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:854:1: ( rule__BasicConstraint__Group__0__Impl rule__BasicConstraint__Group__1 )
            // InternalFeatureModel.g:855:2: rule__BasicConstraint__Group__0__Impl rule__BasicConstraint__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__BasicConstraint__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__1();

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
    // $ANTLR end "rule__BasicConstraint__Group__0"


    // $ANTLR start "rule__BasicConstraint__Group__0__Impl"
    // InternalFeatureModel.g:862:1: rule__BasicConstraint__Group__0__Impl : ( 'BasicConstraint' ) ;
    public final void rule__BasicConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:866:1: ( ( 'BasicConstraint' ) )
            // InternalFeatureModel.g:867:1: ( 'BasicConstraint' )
            {
            // InternalFeatureModel.g:867:1: ( 'BasicConstraint' )
            // InternalFeatureModel.g:868:2: 'BasicConstraint'
            {
             before(grammarAccess.getBasicConstraintAccess().getBasicConstraintKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getBasicConstraintAccess().getBasicConstraintKeyword_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:877:1: rule__BasicConstraint__Group__1 : rule__BasicConstraint__Group__1__Impl rule__BasicConstraint__Group__2 ;
    public final void rule__BasicConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:881:1: ( rule__BasicConstraint__Group__1__Impl rule__BasicConstraint__Group__2 )
            // InternalFeatureModel.g:882:2: rule__BasicConstraint__Group__1__Impl rule__BasicConstraint__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__BasicConstraint__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__2();

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
    // $ANTLR end "rule__BasicConstraint__Group__1"


    // $ANTLR start "rule__BasicConstraint__Group__1__Impl"
    // InternalFeatureModel.g:889:1: rule__BasicConstraint__Group__1__Impl : ( '{' ) ;
    public final void rule__BasicConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:893:1: ( ( '{' ) )
            // InternalFeatureModel.g:894:1: ( '{' )
            {
            // InternalFeatureModel.g:894:1: ( '{' )
            // InternalFeatureModel.g:895:2: '{'
            {
             before(grammarAccess.getBasicConstraintAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getBasicConstraintAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
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
    // InternalFeatureModel.g:904:1: rule__BasicConstraint__Group__2 : rule__BasicConstraint__Group__2__Impl rule__BasicConstraint__Group__3 ;
    public final void rule__BasicConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:908:1: ( rule__BasicConstraint__Group__2__Impl rule__BasicConstraint__Group__3 )
            // InternalFeatureModel.g:909:2: rule__BasicConstraint__Group__2__Impl rule__BasicConstraint__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__BasicConstraint__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__3();

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
    // $ANTLR end "rule__BasicConstraint__Group__2"


    // $ANTLR start "rule__BasicConstraint__Group__2__Impl"
    // InternalFeatureModel.g:916:1: rule__BasicConstraint__Group__2__Impl : ( 'type' ) ;
    public final void rule__BasicConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:920:1: ( ( 'type' ) )
            // InternalFeatureModel.g:921:1: ( 'type' )
            {
            // InternalFeatureModel.g:921:1: ( 'type' )
            // InternalFeatureModel.g:922:2: 'type'
            {
             before(grammarAccess.getBasicConstraintAccess().getTypeKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getBasicConstraintAccess().getTypeKeyword_2()); 

            }


            }

        }
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
    // InternalFeatureModel.g:931:1: rule__BasicConstraint__Group__3 : rule__BasicConstraint__Group__3__Impl rule__BasicConstraint__Group__4 ;
    public final void rule__BasicConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:935:1: ( rule__BasicConstraint__Group__3__Impl rule__BasicConstraint__Group__4 )
            // InternalFeatureModel.g:936:2: rule__BasicConstraint__Group__3__Impl rule__BasicConstraint__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__BasicConstraint__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__4();

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
    // $ANTLR end "rule__BasicConstraint__Group__3"


    // $ANTLR start "rule__BasicConstraint__Group__3__Impl"
    // InternalFeatureModel.g:943:1: rule__BasicConstraint__Group__3__Impl : ( ( rule__BasicConstraint__TypeAssignment_3 ) ) ;
    public final void rule__BasicConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:947:1: ( ( ( rule__BasicConstraint__TypeAssignment_3 ) ) )
            // InternalFeatureModel.g:948:1: ( ( rule__BasicConstraint__TypeAssignment_3 ) )
            {
            // InternalFeatureModel.g:948:1: ( ( rule__BasicConstraint__TypeAssignment_3 ) )
            // InternalFeatureModel.g:949:2: ( rule__BasicConstraint__TypeAssignment_3 )
            {
             before(grammarAccess.getBasicConstraintAccess().getTypeAssignment_3()); 
            // InternalFeatureModel.g:950:2: ( rule__BasicConstraint__TypeAssignment_3 )
            // InternalFeatureModel.g:950:3: rule__BasicConstraint__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getBasicConstraintAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // InternalFeatureModel.g:958:1: rule__BasicConstraint__Group__4 : rule__BasicConstraint__Group__4__Impl rule__BasicConstraint__Group__5 ;
    public final void rule__BasicConstraint__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:962:1: ( rule__BasicConstraint__Group__4__Impl rule__BasicConstraint__Group__5 )
            // InternalFeatureModel.g:963:2: rule__BasicConstraint__Group__4__Impl rule__BasicConstraint__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__BasicConstraint__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__5();

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
    // $ANTLR end "rule__BasicConstraint__Group__4"


    // $ANTLR start "rule__BasicConstraint__Group__4__Impl"
    // InternalFeatureModel.g:970:1: rule__BasicConstraint__Group__4__Impl : ( 'rightFeature' ) ;
    public final void rule__BasicConstraint__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:974:1: ( ( 'rightFeature' ) )
            // InternalFeatureModel.g:975:1: ( 'rightFeature' )
            {
            // InternalFeatureModel.g:975:1: ( 'rightFeature' )
            // InternalFeatureModel.g:976:2: 'rightFeature'
            {
             before(grammarAccess.getBasicConstraintAccess().getRightFeatureKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBasicConstraintAccess().getRightFeatureKeyword_4()); 

            }


            }

        }
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
    // InternalFeatureModel.g:985:1: rule__BasicConstraint__Group__5 : rule__BasicConstraint__Group__5__Impl rule__BasicConstraint__Group__6 ;
    public final void rule__BasicConstraint__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:989:1: ( rule__BasicConstraint__Group__5__Impl rule__BasicConstraint__Group__6 )
            // InternalFeatureModel.g:990:2: rule__BasicConstraint__Group__5__Impl rule__BasicConstraint__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__BasicConstraint__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__6();

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
    // $ANTLR end "rule__BasicConstraint__Group__5"


    // $ANTLR start "rule__BasicConstraint__Group__5__Impl"
    // InternalFeatureModel.g:997:1: rule__BasicConstraint__Group__5__Impl : ( ( rule__BasicConstraint__RightFeatureAssignment_5 ) ) ;
    public final void rule__BasicConstraint__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1001:1: ( ( ( rule__BasicConstraint__RightFeatureAssignment_5 ) ) )
            // InternalFeatureModel.g:1002:1: ( ( rule__BasicConstraint__RightFeatureAssignment_5 ) )
            {
            // InternalFeatureModel.g:1002:1: ( ( rule__BasicConstraint__RightFeatureAssignment_5 ) )
            // InternalFeatureModel.g:1003:2: ( rule__BasicConstraint__RightFeatureAssignment_5 )
            {
             before(grammarAccess.getBasicConstraintAccess().getRightFeatureAssignment_5()); 
            // InternalFeatureModel.g:1004:2: ( rule__BasicConstraint__RightFeatureAssignment_5 )
            // InternalFeatureModel.g:1004:3: rule__BasicConstraint__RightFeatureAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__RightFeatureAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getBasicConstraintAccess().getRightFeatureAssignment_5()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1012:1: rule__BasicConstraint__Group__6 : rule__BasicConstraint__Group__6__Impl rule__BasicConstraint__Group__7 ;
    public final void rule__BasicConstraint__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1016:1: ( rule__BasicConstraint__Group__6__Impl rule__BasicConstraint__Group__7 )
            // InternalFeatureModel.g:1017:2: rule__BasicConstraint__Group__6__Impl rule__BasicConstraint__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__BasicConstraint__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__7();

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
    // $ANTLR end "rule__BasicConstraint__Group__6"


    // $ANTLR start "rule__BasicConstraint__Group__6__Impl"
    // InternalFeatureModel.g:1024:1: rule__BasicConstraint__Group__6__Impl : ( 'leftFeature' ) ;
    public final void rule__BasicConstraint__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1028:1: ( ( 'leftFeature' ) )
            // InternalFeatureModel.g:1029:1: ( 'leftFeature' )
            {
            // InternalFeatureModel.g:1029:1: ( 'leftFeature' )
            // InternalFeatureModel.g:1030:2: 'leftFeature'
            {
             before(grammarAccess.getBasicConstraintAccess().getLeftFeatureKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getBasicConstraintAccess().getLeftFeatureKeyword_6()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1039:1: rule__BasicConstraint__Group__7 : rule__BasicConstraint__Group__7__Impl rule__BasicConstraint__Group__8 ;
    public final void rule__BasicConstraint__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1043:1: ( rule__BasicConstraint__Group__7__Impl rule__BasicConstraint__Group__8 )
            // InternalFeatureModel.g:1044:2: rule__BasicConstraint__Group__7__Impl rule__BasicConstraint__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__BasicConstraint__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__8();

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
    // $ANTLR end "rule__BasicConstraint__Group__7"


    // $ANTLR start "rule__BasicConstraint__Group__7__Impl"
    // InternalFeatureModel.g:1051:1: rule__BasicConstraint__Group__7__Impl : ( ( rule__BasicConstraint__LeftFeatureAssignment_7 ) ) ;
    public final void rule__BasicConstraint__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1055:1: ( ( ( rule__BasicConstraint__LeftFeatureAssignment_7 ) ) )
            // InternalFeatureModel.g:1056:1: ( ( rule__BasicConstraint__LeftFeatureAssignment_7 ) )
            {
            // InternalFeatureModel.g:1056:1: ( ( rule__BasicConstraint__LeftFeatureAssignment_7 ) )
            // InternalFeatureModel.g:1057:2: ( rule__BasicConstraint__LeftFeatureAssignment_7 )
            {
             before(grammarAccess.getBasicConstraintAccess().getLeftFeatureAssignment_7()); 
            // InternalFeatureModel.g:1058:2: ( rule__BasicConstraint__LeftFeatureAssignment_7 )
            // InternalFeatureModel.g:1058:3: rule__BasicConstraint__LeftFeatureAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__LeftFeatureAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getBasicConstraintAccess().getLeftFeatureAssignment_7()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1066:1: rule__BasicConstraint__Group__8 : rule__BasicConstraint__Group__8__Impl ;
    public final void rule__BasicConstraint__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1070:1: ( rule__BasicConstraint__Group__8__Impl )
            // InternalFeatureModel.g:1071:2: rule__BasicConstraint__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BasicConstraint__Group__8__Impl();

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
    // $ANTLR end "rule__BasicConstraint__Group__8"


    // $ANTLR start "rule__BasicConstraint__Group__8__Impl"
    // InternalFeatureModel.g:1077:1: rule__BasicConstraint__Group__8__Impl : ( '}' ) ;
    public final void rule__BasicConstraint__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1081:1: ( ( '}' ) )
            // InternalFeatureModel.g:1082:1: ( '}' )
            {
            // InternalFeatureModel.g:1082:1: ( '}' )
            // InternalFeatureModel.g:1083:2: '}'
            {
             before(grammarAccess.getBasicConstraintAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getBasicConstraintAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1093:1: rule__Feature_Impl__Group__0 : rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 ;
    public final void rule__Feature_Impl__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1097:1: ( rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1 )
            // InternalFeatureModel.g:1098:2: rule__Feature_Impl__Group__0__Impl rule__Feature_Impl__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Feature_Impl__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__1();

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
    // $ANTLR end "rule__Feature_Impl__Group__0"


    // $ANTLR start "rule__Feature_Impl__Group__0__Impl"
    // InternalFeatureModel.g:1105:1: rule__Feature_Impl__Group__0__Impl : ( ( rule__Feature_Impl__MandatoryAssignment_0 ) ) ;
    public final void rule__Feature_Impl__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1109:1: ( ( ( rule__Feature_Impl__MandatoryAssignment_0 ) ) )
            // InternalFeatureModel.g:1110:1: ( ( rule__Feature_Impl__MandatoryAssignment_0 ) )
            {
            // InternalFeatureModel.g:1110:1: ( ( rule__Feature_Impl__MandatoryAssignment_0 ) )
            // InternalFeatureModel.g:1111:2: ( rule__Feature_Impl__MandatoryAssignment_0 )
            {
             before(grammarAccess.getFeature_ImplAccess().getMandatoryAssignment_0()); 
            // InternalFeatureModel.g:1112:2: ( rule__Feature_Impl__MandatoryAssignment_0 )
            // InternalFeatureModel.g:1112:3: rule__Feature_Impl__MandatoryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__MandatoryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFeature_ImplAccess().getMandatoryAssignment_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1120:1: rule__Feature_Impl__Group__1 : rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 ;
    public final void rule__Feature_Impl__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1124:1: ( rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2 )
            // InternalFeatureModel.g:1125:2: rule__Feature_Impl__Group__1__Impl rule__Feature_Impl__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__Feature_Impl__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__2();

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
    // $ANTLR end "rule__Feature_Impl__Group__1"


    // $ANTLR start "rule__Feature_Impl__Group__1__Impl"
    // InternalFeatureModel.g:1132:1: rule__Feature_Impl__Group__1__Impl : ( ( rule__Feature_Impl__SelectedAssignment_1 ) ) ;
    public final void rule__Feature_Impl__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1136:1: ( ( ( rule__Feature_Impl__SelectedAssignment_1 ) ) )
            // InternalFeatureModel.g:1137:1: ( ( rule__Feature_Impl__SelectedAssignment_1 ) )
            {
            // InternalFeatureModel.g:1137:1: ( ( rule__Feature_Impl__SelectedAssignment_1 ) )
            // InternalFeatureModel.g:1138:2: ( rule__Feature_Impl__SelectedAssignment_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getSelectedAssignment_1()); 
            // InternalFeatureModel.g:1139:2: ( rule__Feature_Impl__SelectedAssignment_1 )
            // InternalFeatureModel.g:1139:3: rule__Feature_Impl__SelectedAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__SelectedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFeature_ImplAccess().getSelectedAssignment_1()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1147:1: rule__Feature_Impl__Group__2 : rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 ;
    public final void rule__Feature_Impl__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1151:1: ( rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3 )
            // InternalFeatureModel.g:1152:2: rule__Feature_Impl__Group__2__Impl rule__Feature_Impl__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Feature_Impl__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__3();

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
    // $ANTLR end "rule__Feature_Impl__Group__2"


    // $ANTLR start "rule__Feature_Impl__Group__2__Impl"
    // InternalFeatureModel.g:1159:1: rule__Feature_Impl__Group__2__Impl : ( 'Feature' ) ;
    public final void rule__Feature_Impl__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1163:1: ( ( 'Feature' ) )
            // InternalFeatureModel.g:1164:1: ( 'Feature' )
            {
            // InternalFeatureModel.g:1164:1: ( 'Feature' )
            // InternalFeatureModel.g:1165:2: 'Feature'
            {
             before(grammarAccess.getFeature_ImplAccess().getFeatureKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getFeature_ImplAccess().getFeatureKeyword_2()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1174:1: rule__Feature_Impl__Group__3 : rule__Feature_Impl__Group__3__Impl rule__Feature_Impl__Group__4 ;
    public final void rule__Feature_Impl__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1178:1: ( rule__Feature_Impl__Group__3__Impl rule__Feature_Impl__Group__4 )
            // InternalFeatureModel.g:1179:2: rule__Feature_Impl__Group__3__Impl rule__Feature_Impl__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Feature_Impl__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__4();

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
    // $ANTLR end "rule__Feature_Impl__Group__3"


    // $ANTLR start "rule__Feature_Impl__Group__3__Impl"
    // InternalFeatureModel.g:1186:1: rule__Feature_Impl__Group__3__Impl : ( ( rule__Feature_Impl__NameAssignment_3 ) ) ;
    public final void rule__Feature_Impl__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1190:1: ( ( ( rule__Feature_Impl__NameAssignment_3 ) ) )
            // InternalFeatureModel.g:1191:1: ( ( rule__Feature_Impl__NameAssignment_3 ) )
            {
            // InternalFeatureModel.g:1191:1: ( ( rule__Feature_Impl__NameAssignment_3 ) )
            // InternalFeatureModel.g:1192:2: ( rule__Feature_Impl__NameAssignment_3 )
            {
             before(grammarAccess.getFeature_ImplAccess().getNameAssignment_3()); 
            // InternalFeatureModel.g:1193:2: ( rule__Feature_Impl__NameAssignment_3 )
            // InternalFeatureModel.g:1193:3: rule__Feature_Impl__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getFeature_ImplAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1201:1: rule__Feature_Impl__Group__4 : rule__Feature_Impl__Group__4__Impl rule__Feature_Impl__Group__5 ;
    public final void rule__Feature_Impl__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1205:1: ( rule__Feature_Impl__Group__4__Impl rule__Feature_Impl__Group__5 )
            // InternalFeatureModel.g:1206:2: rule__Feature_Impl__Group__4__Impl rule__Feature_Impl__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Feature_Impl__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__5();

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
    // $ANTLR end "rule__Feature_Impl__Group__4"


    // $ANTLR start "rule__Feature_Impl__Group__4__Impl"
    // InternalFeatureModel.g:1213:1: rule__Feature_Impl__Group__4__Impl : ( '{' ) ;
    public final void rule__Feature_Impl__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1217:1: ( ( '{' ) )
            // InternalFeatureModel.g:1218:1: ( '{' )
            {
            // InternalFeatureModel.g:1218:1: ( '{' )
            // InternalFeatureModel.g:1219:2: '{'
            {
             before(grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1228:1: rule__Feature_Impl__Group__5 : rule__Feature_Impl__Group__5__Impl rule__Feature_Impl__Group__6 ;
    public final void rule__Feature_Impl__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1232:1: ( rule__Feature_Impl__Group__5__Impl rule__Feature_Impl__Group__6 )
            // InternalFeatureModel.g:1233:2: rule__Feature_Impl__Group__5__Impl rule__Feature_Impl__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Feature_Impl__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__6();

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
    // $ANTLR end "rule__Feature_Impl__Group__5"


    // $ANTLR start "rule__Feature_Impl__Group__5__Impl"
    // InternalFeatureModel.g:1240:1: rule__Feature_Impl__Group__5__Impl : ( 'id' ) ;
    public final void rule__Feature_Impl__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1244:1: ( ( 'id' ) )
            // InternalFeatureModel.g:1245:1: ( 'id' )
            {
            // InternalFeatureModel.g:1245:1: ( 'id' )
            // InternalFeatureModel.g:1246:2: 'id'
            {
             before(grammarAccess.getFeature_ImplAccess().getIdKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFeature_ImplAccess().getIdKeyword_5()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1255:1: rule__Feature_Impl__Group__6 : rule__Feature_Impl__Group__6__Impl rule__Feature_Impl__Group__7 ;
    public final void rule__Feature_Impl__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1259:1: ( rule__Feature_Impl__Group__6__Impl rule__Feature_Impl__Group__7 )
            // InternalFeatureModel.g:1260:2: rule__Feature_Impl__Group__6__Impl rule__Feature_Impl__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Feature_Impl__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__7();

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
    // $ANTLR end "rule__Feature_Impl__Group__6"


    // $ANTLR start "rule__Feature_Impl__Group__6__Impl"
    // InternalFeatureModel.g:1267:1: rule__Feature_Impl__Group__6__Impl : ( ( rule__Feature_Impl__IdAssignment_6 ) ) ;
    public final void rule__Feature_Impl__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1271:1: ( ( ( rule__Feature_Impl__IdAssignment_6 ) ) )
            // InternalFeatureModel.g:1272:1: ( ( rule__Feature_Impl__IdAssignment_6 ) )
            {
            // InternalFeatureModel.g:1272:1: ( ( rule__Feature_Impl__IdAssignment_6 ) )
            // InternalFeatureModel.g:1273:2: ( rule__Feature_Impl__IdAssignment_6 )
            {
             before(grammarAccess.getFeature_ImplAccess().getIdAssignment_6()); 
            // InternalFeatureModel.g:1274:2: ( rule__Feature_Impl__IdAssignment_6 )
            // InternalFeatureModel.g:1274:3: rule__Feature_Impl__IdAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__IdAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getFeature_ImplAccess().getIdAssignment_6()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1282:1: rule__Feature_Impl__Group__7 : rule__Feature_Impl__Group__7__Impl rule__Feature_Impl__Group__8 ;
    public final void rule__Feature_Impl__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1286:1: ( rule__Feature_Impl__Group__7__Impl rule__Feature_Impl__Group__8 )
            // InternalFeatureModel.g:1287:2: rule__Feature_Impl__Group__7__Impl rule__Feature_Impl__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Feature_Impl__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__8();

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
    // $ANTLR end "rule__Feature_Impl__Group__7"


    // $ANTLR start "rule__Feature_Impl__Group__7__Impl"
    // InternalFeatureModel.g:1294:1: rule__Feature_Impl__Group__7__Impl : ( ( rule__Feature_Impl__Group_7__0 )? ) ;
    public final void rule__Feature_Impl__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1298:1: ( ( ( rule__Feature_Impl__Group_7__0 )? ) )
            // InternalFeatureModel.g:1299:1: ( ( rule__Feature_Impl__Group_7__0 )? )
            {
            // InternalFeatureModel.g:1299:1: ( ( rule__Feature_Impl__Group_7__0 )? )
            // InternalFeatureModel.g:1300:2: ( rule__Feature_Impl__Group_7__0 )?
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_7()); 
            // InternalFeatureModel.g:1301:2: ( rule__Feature_Impl__Group_7__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureModel.g:1301:3: rule__Feature_Impl__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Feature_Impl__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFeature_ImplAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1309:1: rule__Feature_Impl__Group__8 : rule__Feature_Impl__Group__8__Impl ;
    public final void rule__Feature_Impl__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1313:1: ( rule__Feature_Impl__Group__8__Impl )
            // InternalFeatureModel.g:1314:2: rule__Feature_Impl__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group__8__Impl();

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
    // $ANTLR end "rule__Feature_Impl__Group__8"


    // $ANTLR start "rule__Feature_Impl__Group__8__Impl"
    // InternalFeatureModel.g:1320:1: rule__Feature_Impl__Group__8__Impl : ( '}' ) ;
    public final void rule__Feature_Impl__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1324:1: ( ( '}' ) )
            // InternalFeatureModel.g:1325:1: ( '}' )
            {
            // InternalFeatureModel.g:1325:1: ( '}' )
            // InternalFeatureModel.g:1326:2: '}'
            {
             before(grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Feature_Impl__Group_7__0"
    // InternalFeatureModel.g:1336:1: rule__Feature_Impl__Group_7__0 : rule__Feature_Impl__Group_7__0__Impl rule__Feature_Impl__Group_7__1 ;
    public final void rule__Feature_Impl__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1340:1: ( rule__Feature_Impl__Group_7__0__Impl rule__Feature_Impl__Group_7__1 )
            // InternalFeatureModel.g:1341:2: rule__Feature_Impl__Group_7__0__Impl rule__Feature_Impl__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Feature_Impl__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7__1();

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
    // $ANTLR end "rule__Feature_Impl__Group_7__0"


    // $ANTLR start "rule__Feature_Impl__Group_7__0__Impl"
    // InternalFeatureModel.g:1348:1: rule__Feature_Impl__Group_7__0__Impl : ( 'children' ) ;
    public final void rule__Feature_Impl__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1352:1: ( ( 'children' ) )
            // InternalFeatureModel.g:1353:1: ( 'children' )
            {
            // InternalFeatureModel.g:1353:1: ( 'children' )
            // InternalFeatureModel.g:1354:2: 'children'
            {
             before(grammarAccess.getFeature_ImplAccess().getChildrenKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getFeature_ImplAccess().getChildrenKeyword_7_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1363:1: rule__Feature_Impl__Group_7__1 : rule__Feature_Impl__Group_7__1__Impl rule__Feature_Impl__Group_7__2 ;
    public final void rule__Feature_Impl__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1367:1: ( rule__Feature_Impl__Group_7__1__Impl rule__Feature_Impl__Group_7__2 )
            // InternalFeatureModel.g:1368:2: rule__Feature_Impl__Group_7__1__Impl rule__Feature_Impl__Group_7__2
            {
            pushFollow(FOLLOW_5);
            rule__Feature_Impl__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7__2();

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
    // $ANTLR end "rule__Feature_Impl__Group_7__1"


    // $ANTLR start "rule__Feature_Impl__Group_7__1__Impl"
    // InternalFeatureModel.g:1375:1: rule__Feature_Impl__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Feature_Impl__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1379:1: ( ( '{' ) )
            // InternalFeatureModel.g:1380:1: ( '{' )
            {
            // InternalFeatureModel.g:1380:1: ( '{' )
            // InternalFeatureModel.g:1381:2: '{'
            {
             before(grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1390:1: rule__Feature_Impl__Group_7__2 : rule__Feature_Impl__Group_7__2__Impl rule__Feature_Impl__Group_7__3 ;
    public final void rule__Feature_Impl__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1394:1: ( rule__Feature_Impl__Group_7__2__Impl rule__Feature_Impl__Group_7__3 )
            // InternalFeatureModel.g:1395:2: rule__Feature_Impl__Group_7__2__Impl rule__Feature_Impl__Group_7__3
            {
            pushFollow(FOLLOW_6);
            rule__Feature_Impl__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7__3();

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
    // $ANTLR end "rule__Feature_Impl__Group_7__2"


    // $ANTLR start "rule__Feature_Impl__Group_7__2__Impl"
    // InternalFeatureModel.g:1402:1: rule__Feature_Impl__Group_7__2__Impl : ( ( rule__Feature_Impl__ChildrenAssignment_7_2 ) ) ;
    public final void rule__Feature_Impl__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1406:1: ( ( ( rule__Feature_Impl__ChildrenAssignment_7_2 ) ) )
            // InternalFeatureModel.g:1407:1: ( ( rule__Feature_Impl__ChildrenAssignment_7_2 ) )
            {
            // InternalFeatureModel.g:1407:1: ( ( rule__Feature_Impl__ChildrenAssignment_7_2 ) )
            // InternalFeatureModel.g:1408:2: ( rule__Feature_Impl__ChildrenAssignment_7_2 )
            {
             before(grammarAccess.getFeature_ImplAccess().getChildrenAssignment_7_2()); 
            // InternalFeatureModel.g:1409:2: ( rule__Feature_Impl__ChildrenAssignment_7_2 )
            // InternalFeatureModel.g:1409:3: rule__Feature_Impl__ChildrenAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__ChildrenAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getFeature_ImplAccess().getChildrenAssignment_7_2()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1417:1: rule__Feature_Impl__Group_7__3 : rule__Feature_Impl__Group_7__3__Impl rule__Feature_Impl__Group_7__4 ;
    public final void rule__Feature_Impl__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1421:1: ( rule__Feature_Impl__Group_7__3__Impl rule__Feature_Impl__Group_7__4 )
            // InternalFeatureModel.g:1422:2: rule__Feature_Impl__Group_7__3__Impl rule__Feature_Impl__Group_7__4
            {
            pushFollow(FOLLOW_6);
            rule__Feature_Impl__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7__4();

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
    // $ANTLR end "rule__Feature_Impl__Group_7__3"


    // $ANTLR start "rule__Feature_Impl__Group_7__3__Impl"
    // InternalFeatureModel.g:1429:1: rule__Feature_Impl__Group_7__3__Impl : ( ( rule__Feature_Impl__Group_7_3__0 )* ) ;
    public final void rule__Feature_Impl__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1433:1: ( ( ( rule__Feature_Impl__Group_7_3__0 )* ) )
            // InternalFeatureModel.g:1434:1: ( ( rule__Feature_Impl__Group_7_3__0 )* )
            {
            // InternalFeatureModel.g:1434:1: ( ( rule__Feature_Impl__Group_7_3__0 )* )
            // InternalFeatureModel.g:1435:2: ( rule__Feature_Impl__Group_7_3__0 )*
            {
             before(grammarAccess.getFeature_ImplAccess().getGroup_7_3()); 
            // InternalFeatureModel.g:1436:2: ( rule__Feature_Impl__Group_7_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFeatureModel.g:1436:3: rule__Feature_Impl__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Feature_Impl__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getFeature_ImplAccess().getGroup_7_3()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1444:1: rule__Feature_Impl__Group_7__4 : rule__Feature_Impl__Group_7__4__Impl ;
    public final void rule__Feature_Impl__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1448:1: ( rule__Feature_Impl__Group_7__4__Impl )
            // InternalFeatureModel.g:1449:2: rule__Feature_Impl__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7__4__Impl();

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
    // $ANTLR end "rule__Feature_Impl__Group_7__4"


    // $ANTLR start "rule__Feature_Impl__Group_7__4__Impl"
    // InternalFeatureModel.g:1455:1: rule__Feature_Impl__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Feature_Impl__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1459:1: ( ( '}' ) )
            // InternalFeatureModel.g:1460:1: ( '}' )
            {
            // InternalFeatureModel.g:1460:1: ( '}' )
            // InternalFeatureModel.g:1461:2: '}'
            {
             before(grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1471:1: rule__Feature_Impl__Group_7_3__0 : rule__Feature_Impl__Group_7_3__0__Impl rule__Feature_Impl__Group_7_3__1 ;
    public final void rule__Feature_Impl__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1475:1: ( rule__Feature_Impl__Group_7_3__0__Impl rule__Feature_Impl__Group_7_3__1 )
            // InternalFeatureModel.g:1476:2: rule__Feature_Impl__Group_7_3__0__Impl rule__Feature_Impl__Group_7_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Feature_Impl__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7_3__1();

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
    // $ANTLR end "rule__Feature_Impl__Group_7_3__0"


    // $ANTLR start "rule__Feature_Impl__Group_7_3__0__Impl"
    // InternalFeatureModel.g:1483:1: rule__Feature_Impl__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Feature_Impl__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1487:1: ( ( ',' ) )
            // InternalFeatureModel.g:1488:1: ( ',' )
            {
            // InternalFeatureModel.g:1488:1: ( ',' )
            // InternalFeatureModel.g:1489:2: ','
            {
             before(grammarAccess.getFeature_ImplAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getFeature_ImplAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1498:1: rule__Feature_Impl__Group_7_3__1 : rule__Feature_Impl__Group_7_3__1__Impl ;
    public final void rule__Feature_Impl__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1502:1: ( rule__Feature_Impl__Group_7_3__1__Impl )
            // InternalFeatureModel.g:1503:2: rule__Feature_Impl__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__Feature_Impl__Group_7_3__1"


    // $ANTLR start "rule__Feature_Impl__Group_7_3__1__Impl"
    // InternalFeatureModel.g:1509:1: rule__Feature_Impl__Group_7_3__1__Impl : ( ( rule__Feature_Impl__ChildrenAssignment_7_3_1 ) ) ;
    public final void rule__Feature_Impl__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1513:1: ( ( ( rule__Feature_Impl__ChildrenAssignment_7_3_1 ) ) )
            // InternalFeatureModel.g:1514:1: ( ( rule__Feature_Impl__ChildrenAssignment_7_3_1 ) )
            {
            // InternalFeatureModel.g:1514:1: ( ( rule__Feature_Impl__ChildrenAssignment_7_3_1 ) )
            // InternalFeatureModel.g:1515:2: ( rule__Feature_Impl__ChildrenAssignment_7_3_1 )
            {
             before(grammarAccess.getFeature_ImplAccess().getChildrenAssignment_7_3_1()); 
            // InternalFeatureModel.g:1516:2: ( rule__Feature_Impl__ChildrenAssignment_7_3_1 )
            // InternalFeatureModel.g:1516:3: rule__Feature_Impl__ChildrenAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Feature_Impl__ChildrenAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFeature_ImplAccess().getChildrenAssignment_7_3_1()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1525:1: rule__Alternative__Group__0 : rule__Alternative__Group__0__Impl rule__Alternative__Group__1 ;
    public final void rule__Alternative__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1529:1: ( rule__Alternative__Group__0__Impl rule__Alternative__Group__1 )
            // InternalFeatureModel.g:1530:2: rule__Alternative__Group__0__Impl rule__Alternative__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__Alternative__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__1();

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
    // $ANTLR end "rule__Alternative__Group__0"


    // $ANTLR start "rule__Alternative__Group__0__Impl"
    // InternalFeatureModel.g:1537:1: rule__Alternative__Group__0__Impl : ( ( rule__Alternative__MandatoryAssignment_0 ) ) ;
    public final void rule__Alternative__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1541:1: ( ( ( rule__Alternative__MandatoryAssignment_0 ) ) )
            // InternalFeatureModel.g:1542:1: ( ( rule__Alternative__MandatoryAssignment_0 ) )
            {
            // InternalFeatureModel.g:1542:1: ( ( rule__Alternative__MandatoryAssignment_0 ) )
            // InternalFeatureModel.g:1543:2: ( rule__Alternative__MandatoryAssignment_0 )
            {
             before(grammarAccess.getAlternativeAccess().getMandatoryAssignment_0()); 
            // InternalFeatureModel.g:1544:2: ( rule__Alternative__MandatoryAssignment_0 )
            // InternalFeatureModel.g:1544:3: rule__Alternative__MandatoryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__MandatoryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getMandatoryAssignment_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1552:1: rule__Alternative__Group__1 : rule__Alternative__Group__1__Impl rule__Alternative__Group__2 ;
    public final void rule__Alternative__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1556:1: ( rule__Alternative__Group__1__Impl rule__Alternative__Group__2 )
            // InternalFeatureModel.g:1557:2: rule__Alternative__Group__1__Impl rule__Alternative__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__Alternative__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__2();

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
    // $ANTLR end "rule__Alternative__Group__1"


    // $ANTLR start "rule__Alternative__Group__1__Impl"
    // InternalFeatureModel.g:1564:1: rule__Alternative__Group__1__Impl : ( ( rule__Alternative__SelectedAssignment_1 ) ) ;
    public final void rule__Alternative__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1568:1: ( ( ( rule__Alternative__SelectedAssignment_1 ) ) )
            // InternalFeatureModel.g:1569:1: ( ( rule__Alternative__SelectedAssignment_1 ) )
            {
            // InternalFeatureModel.g:1569:1: ( ( rule__Alternative__SelectedAssignment_1 ) )
            // InternalFeatureModel.g:1570:2: ( rule__Alternative__SelectedAssignment_1 )
            {
             before(grammarAccess.getAlternativeAccess().getSelectedAssignment_1()); 
            // InternalFeatureModel.g:1571:2: ( rule__Alternative__SelectedAssignment_1 )
            // InternalFeatureModel.g:1571:3: rule__Alternative__SelectedAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__SelectedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getSelectedAssignment_1()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1579:1: rule__Alternative__Group__2 : rule__Alternative__Group__2__Impl rule__Alternative__Group__3 ;
    public final void rule__Alternative__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1583:1: ( rule__Alternative__Group__2__Impl rule__Alternative__Group__3 )
            // InternalFeatureModel.g:1584:2: rule__Alternative__Group__2__Impl rule__Alternative__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Alternative__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__3();

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
    // $ANTLR end "rule__Alternative__Group__2"


    // $ANTLR start "rule__Alternative__Group__2__Impl"
    // InternalFeatureModel.g:1591:1: rule__Alternative__Group__2__Impl : ( 'Alternative' ) ;
    public final void rule__Alternative__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1595:1: ( ( 'Alternative' ) )
            // InternalFeatureModel.g:1596:1: ( 'Alternative' )
            {
            // InternalFeatureModel.g:1596:1: ( 'Alternative' )
            // InternalFeatureModel.g:1597:2: 'Alternative'
            {
             before(grammarAccess.getAlternativeAccess().getAlternativeKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getAlternativeKeyword_2()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1606:1: rule__Alternative__Group__3 : rule__Alternative__Group__3__Impl rule__Alternative__Group__4 ;
    public final void rule__Alternative__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1610:1: ( rule__Alternative__Group__3__Impl rule__Alternative__Group__4 )
            // InternalFeatureModel.g:1611:2: rule__Alternative__Group__3__Impl rule__Alternative__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__Alternative__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__4();

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
    // $ANTLR end "rule__Alternative__Group__3"


    // $ANTLR start "rule__Alternative__Group__3__Impl"
    // InternalFeatureModel.g:1618:1: rule__Alternative__Group__3__Impl : ( ( rule__Alternative__NameAssignment_3 ) ) ;
    public final void rule__Alternative__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1622:1: ( ( ( rule__Alternative__NameAssignment_3 ) ) )
            // InternalFeatureModel.g:1623:1: ( ( rule__Alternative__NameAssignment_3 ) )
            {
            // InternalFeatureModel.g:1623:1: ( ( rule__Alternative__NameAssignment_3 ) )
            // InternalFeatureModel.g:1624:2: ( rule__Alternative__NameAssignment_3 )
            {
             before(grammarAccess.getAlternativeAccess().getNameAssignment_3()); 
            // InternalFeatureModel.g:1625:2: ( rule__Alternative__NameAssignment_3 )
            // InternalFeatureModel.g:1625:3: rule__Alternative__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1633:1: rule__Alternative__Group__4 : rule__Alternative__Group__4__Impl rule__Alternative__Group__5 ;
    public final void rule__Alternative__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1637:1: ( rule__Alternative__Group__4__Impl rule__Alternative__Group__5 )
            // InternalFeatureModel.g:1638:2: rule__Alternative__Group__4__Impl rule__Alternative__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__Alternative__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__5();

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
    // $ANTLR end "rule__Alternative__Group__4"


    // $ANTLR start "rule__Alternative__Group__4__Impl"
    // InternalFeatureModel.g:1645:1: rule__Alternative__Group__4__Impl : ( '{' ) ;
    public final void rule__Alternative__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1649:1: ( ( '{' ) )
            // InternalFeatureModel.g:1650:1: ( '{' )
            {
            // InternalFeatureModel.g:1650:1: ( '{' )
            // InternalFeatureModel.g:1651:2: '{'
            {
             before(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1660:1: rule__Alternative__Group__5 : rule__Alternative__Group__5__Impl rule__Alternative__Group__6 ;
    public final void rule__Alternative__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1664:1: ( rule__Alternative__Group__5__Impl rule__Alternative__Group__6 )
            // InternalFeatureModel.g:1665:2: rule__Alternative__Group__5__Impl rule__Alternative__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Alternative__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__6();

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
    // $ANTLR end "rule__Alternative__Group__5"


    // $ANTLR start "rule__Alternative__Group__5__Impl"
    // InternalFeatureModel.g:1672:1: rule__Alternative__Group__5__Impl : ( 'id' ) ;
    public final void rule__Alternative__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1676:1: ( ( 'id' ) )
            // InternalFeatureModel.g:1677:1: ( 'id' )
            {
            // InternalFeatureModel.g:1677:1: ( 'id' )
            // InternalFeatureModel.g:1678:2: 'id'
            {
             before(grammarAccess.getAlternativeAccess().getIdKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getIdKeyword_5()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1687:1: rule__Alternative__Group__6 : rule__Alternative__Group__6__Impl rule__Alternative__Group__7 ;
    public final void rule__Alternative__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1691:1: ( rule__Alternative__Group__6__Impl rule__Alternative__Group__7 )
            // InternalFeatureModel.g:1692:2: rule__Alternative__Group__6__Impl rule__Alternative__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Alternative__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__7();

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
    // $ANTLR end "rule__Alternative__Group__6"


    // $ANTLR start "rule__Alternative__Group__6__Impl"
    // InternalFeatureModel.g:1699:1: rule__Alternative__Group__6__Impl : ( ( rule__Alternative__IdAssignment_6 ) ) ;
    public final void rule__Alternative__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1703:1: ( ( ( rule__Alternative__IdAssignment_6 ) ) )
            // InternalFeatureModel.g:1704:1: ( ( rule__Alternative__IdAssignment_6 ) )
            {
            // InternalFeatureModel.g:1704:1: ( ( rule__Alternative__IdAssignment_6 ) )
            // InternalFeatureModel.g:1705:2: ( rule__Alternative__IdAssignment_6 )
            {
             before(grammarAccess.getAlternativeAccess().getIdAssignment_6()); 
            // InternalFeatureModel.g:1706:2: ( rule__Alternative__IdAssignment_6 )
            // InternalFeatureModel.g:1706:3: rule__Alternative__IdAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__IdAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getIdAssignment_6()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1714:1: rule__Alternative__Group__7 : rule__Alternative__Group__7__Impl rule__Alternative__Group__8 ;
    public final void rule__Alternative__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1718:1: ( rule__Alternative__Group__7__Impl rule__Alternative__Group__8 )
            // InternalFeatureModel.g:1719:2: rule__Alternative__Group__7__Impl rule__Alternative__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__Alternative__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group__8();

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
    // $ANTLR end "rule__Alternative__Group__7"


    // $ANTLR start "rule__Alternative__Group__7__Impl"
    // InternalFeatureModel.g:1726:1: rule__Alternative__Group__7__Impl : ( ( rule__Alternative__Group_7__0 )? ) ;
    public final void rule__Alternative__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1730:1: ( ( ( rule__Alternative__Group_7__0 )? ) )
            // InternalFeatureModel.g:1731:1: ( ( rule__Alternative__Group_7__0 )? )
            {
            // InternalFeatureModel.g:1731:1: ( ( rule__Alternative__Group_7__0 )? )
            // InternalFeatureModel.g:1732:2: ( rule__Alternative__Group_7__0 )?
            {
             before(grammarAccess.getAlternativeAccess().getGroup_7()); 
            // InternalFeatureModel.g:1733:2: ( rule__Alternative__Group_7__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureModel.g:1733:3: rule__Alternative__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Alternative__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlternativeAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1741:1: rule__Alternative__Group__8 : rule__Alternative__Group__8__Impl ;
    public final void rule__Alternative__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1745:1: ( rule__Alternative__Group__8__Impl )
            // InternalFeatureModel.g:1746:2: rule__Alternative__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group__8__Impl();

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
    // $ANTLR end "rule__Alternative__Group__8"


    // $ANTLR start "rule__Alternative__Group__8__Impl"
    // InternalFeatureModel.g:1752:1: rule__Alternative__Group__8__Impl : ( '}' ) ;
    public final void rule__Alternative__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1756:1: ( ( '}' ) )
            // InternalFeatureModel.g:1757:1: ( '}' )
            {
            // InternalFeatureModel.g:1757:1: ( '}' )
            // InternalFeatureModel.g:1758:2: '}'
            {
             before(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__Alternative__Group_7__0"
    // InternalFeatureModel.g:1768:1: rule__Alternative__Group_7__0 : rule__Alternative__Group_7__0__Impl rule__Alternative__Group_7__1 ;
    public final void rule__Alternative__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1772:1: ( rule__Alternative__Group_7__0__Impl rule__Alternative__Group_7__1 )
            // InternalFeatureModel.g:1773:2: rule__Alternative__Group_7__0__Impl rule__Alternative__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__Alternative__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7__1();

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
    // $ANTLR end "rule__Alternative__Group_7__0"


    // $ANTLR start "rule__Alternative__Group_7__0__Impl"
    // InternalFeatureModel.g:1780:1: rule__Alternative__Group_7__0__Impl : ( 'children' ) ;
    public final void rule__Alternative__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1784:1: ( ( 'children' ) )
            // InternalFeatureModel.g:1785:1: ( 'children' )
            {
            // InternalFeatureModel.g:1785:1: ( 'children' )
            // InternalFeatureModel.g:1786:2: 'children'
            {
             before(grammarAccess.getAlternativeAccess().getChildrenKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getChildrenKeyword_7_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1795:1: rule__Alternative__Group_7__1 : rule__Alternative__Group_7__1__Impl rule__Alternative__Group_7__2 ;
    public final void rule__Alternative__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1799:1: ( rule__Alternative__Group_7__1__Impl rule__Alternative__Group_7__2 )
            // InternalFeatureModel.g:1800:2: rule__Alternative__Group_7__1__Impl rule__Alternative__Group_7__2
            {
            pushFollow(FOLLOW_5);
            rule__Alternative__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7__2();

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
    // $ANTLR end "rule__Alternative__Group_7__1"


    // $ANTLR start "rule__Alternative__Group_7__1__Impl"
    // InternalFeatureModel.g:1807:1: rule__Alternative__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Alternative__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1811:1: ( ( '{' ) )
            // InternalFeatureModel.g:1812:1: ( '{' )
            {
            // InternalFeatureModel.g:1812:1: ( '{' )
            // InternalFeatureModel.g:1813:2: '{'
            {
             before(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1822:1: rule__Alternative__Group_7__2 : rule__Alternative__Group_7__2__Impl rule__Alternative__Group_7__3 ;
    public final void rule__Alternative__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1826:1: ( rule__Alternative__Group_7__2__Impl rule__Alternative__Group_7__3 )
            // InternalFeatureModel.g:1827:2: rule__Alternative__Group_7__2__Impl rule__Alternative__Group_7__3
            {
            pushFollow(FOLLOW_6);
            rule__Alternative__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7__3();

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
    // $ANTLR end "rule__Alternative__Group_7__2"


    // $ANTLR start "rule__Alternative__Group_7__2__Impl"
    // InternalFeatureModel.g:1834:1: rule__Alternative__Group_7__2__Impl : ( ( rule__Alternative__ChildrenAssignment_7_2 ) ) ;
    public final void rule__Alternative__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1838:1: ( ( ( rule__Alternative__ChildrenAssignment_7_2 ) ) )
            // InternalFeatureModel.g:1839:1: ( ( rule__Alternative__ChildrenAssignment_7_2 ) )
            {
            // InternalFeatureModel.g:1839:1: ( ( rule__Alternative__ChildrenAssignment_7_2 ) )
            // InternalFeatureModel.g:1840:2: ( rule__Alternative__ChildrenAssignment_7_2 )
            {
             before(grammarAccess.getAlternativeAccess().getChildrenAssignment_7_2()); 
            // InternalFeatureModel.g:1841:2: ( rule__Alternative__ChildrenAssignment_7_2 )
            // InternalFeatureModel.g:1841:3: rule__Alternative__ChildrenAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__ChildrenAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getChildrenAssignment_7_2()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1849:1: rule__Alternative__Group_7__3 : rule__Alternative__Group_7__3__Impl rule__Alternative__Group_7__4 ;
    public final void rule__Alternative__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1853:1: ( rule__Alternative__Group_7__3__Impl rule__Alternative__Group_7__4 )
            // InternalFeatureModel.g:1854:2: rule__Alternative__Group_7__3__Impl rule__Alternative__Group_7__4
            {
            pushFollow(FOLLOW_6);
            rule__Alternative__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7__4();

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
    // $ANTLR end "rule__Alternative__Group_7__3"


    // $ANTLR start "rule__Alternative__Group_7__3__Impl"
    // InternalFeatureModel.g:1861:1: rule__Alternative__Group_7__3__Impl : ( ( rule__Alternative__Group_7_3__0 )* ) ;
    public final void rule__Alternative__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1865:1: ( ( ( rule__Alternative__Group_7_3__0 )* ) )
            // InternalFeatureModel.g:1866:1: ( ( rule__Alternative__Group_7_3__0 )* )
            {
            // InternalFeatureModel.g:1866:1: ( ( rule__Alternative__Group_7_3__0 )* )
            // InternalFeatureModel.g:1867:2: ( rule__Alternative__Group_7_3__0 )*
            {
             before(grammarAccess.getAlternativeAccess().getGroup_7_3()); 
            // InternalFeatureModel.g:1868:2: ( rule__Alternative__Group_7_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==17) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalFeatureModel.g:1868:3: rule__Alternative__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Alternative__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getAlternativeAccess().getGroup_7_3()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1876:1: rule__Alternative__Group_7__4 : rule__Alternative__Group_7__4__Impl ;
    public final void rule__Alternative__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1880:1: ( rule__Alternative__Group_7__4__Impl )
            // InternalFeatureModel.g:1881:2: rule__Alternative__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7__4__Impl();

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
    // $ANTLR end "rule__Alternative__Group_7__4"


    // $ANTLR start "rule__Alternative__Group_7__4__Impl"
    // InternalFeatureModel.g:1887:1: rule__Alternative__Group_7__4__Impl : ( '}' ) ;
    public final void rule__Alternative__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1891:1: ( ( '}' ) )
            // InternalFeatureModel.g:1892:1: ( '}' )
            {
            // InternalFeatureModel.g:1892:1: ( '}' )
            // InternalFeatureModel.g:1893:2: '}'
            {
             before(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1903:1: rule__Alternative__Group_7_3__0 : rule__Alternative__Group_7_3__0__Impl rule__Alternative__Group_7_3__1 ;
    public final void rule__Alternative__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1907:1: ( rule__Alternative__Group_7_3__0__Impl rule__Alternative__Group_7_3__1 )
            // InternalFeatureModel.g:1908:2: rule__Alternative__Group_7_3__0__Impl rule__Alternative__Group_7_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Alternative__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7_3__1();

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
    // $ANTLR end "rule__Alternative__Group_7_3__0"


    // $ANTLR start "rule__Alternative__Group_7_3__0__Impl"
    // InternalFeatureModel.g:1915:1: rule__Alternative__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__Alternative__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1919:1: ( ( ',' ) )
            // InternalFeatureModel.g:1920:1: ( ',' )
            {
            // InternalFeatureModel.g:1920:1: ( ',' )
            // InternalFeatureModel.g:1921:2: ','
            {
             before(grammarAccess.getAlternativeAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1930:1: rule__Alternative__Group_7_3__1 : rule__Alternative__Group_7_3__1__Impl ;
    public final void rule__Alternative__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1934:1: ( rule__Alternative__Group_7_3__1__Impl )
            // InternalFeatureModel.g:1935:2: rule__Alternative__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__Alternative__Group_7_3__1"


    // $ANTLR start "rule__Alternative__Group_7_3__1__Impl"
    // InternalFeatureModel.g:1941:1: rule__Alternative__Group_7_3__1__Impl : ( ( rule__Alternative__ChildrenAssignment_7_3_1 ) ) ;
    public final void rule__Alternative__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1945:1: ( ( ( rule__Alternative__ChildrenAssignment_7_3_1 ) ) )
            // InternalFeatureModel.g:1946:1: ( ( rule__Alternative__ChildrenAssignment_7_3_1 ) )
            {
            // InternalFeatureModel.g:1946:1: ( ( rule__Alternative__ChildrenAssignment_7_3_1 ) )
            // InternalFeatureModel.g:1947:2: ( rule__Alternative__ChildrenAssignment_7_3_1 )
            {
             before(grammarAccess.getAlternativeAccess().getChildrenAssignment_7_3_1()); 
            // InternalFeatureModel.g:1948:2: ( rule__Alternative__ChildrenAssignment_7_3_1 )
            // InternalFeatureModel.g:1948:3: rule__Alternative__ChildrenAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Alternative__ChildrenAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativeAccess().getChildrenAssignment_7_3_1()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1957:1: rule__OrGroup__Group__0 : rule__OrGroup__Group__0__Impl rule__OrGroup__Group__1 ;
    public final void rule__OrGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1961:1: ( rule__OrGroup__Group__0__Impl rule__OrGroup__Group__1 )
            // InternalFeatureModel.g:1962:2: rule__OrGroup__Group__0__Impl rule__OrGroup__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__OrGroup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__1();

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
    // $ANTLR end "rule__OrGroup__Group__0"


    // $ANTLR start "rule__OrGroup__Group__0__Impl"
    // InternalFeatureModel.g:1969:1: rule__OrGroup__Group__0__Impl : ( ( rule__OrGroup__MandatoryAssignment_0 ) ) ;
    public final void rule__OrGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1973:1: ( ( ( rule__OrGroup__MandatoryAssignment_0 ) ) )
            // InternalFeatureModel.g:1974:1: ( ( rule__OrGroup__MandatoryAssignment_0 ) )
            {
            // InternalFeatureModel.g:1974:1: ( ( rule__OrGroup__MandatoryAssignment_0 ) )
            // InternalFeatureModel.g:1975:2: ( rule__OrGroup__MandatoryAssignment_0 )
            {
             before(grammarAccess.getOrGroupAccess().getMandatoryAssignment_0()); 
            // InternalFeatureModel.g:1976:2: ( rule__OrGroup__MandatoryAssignment_0 )
            // InternalFeatureModel.g:1976:3: rule__OrGroup__MandatoryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__MandatoryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOrGroupAccess().getMandatoryAssignment_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:1984:1: rule__OrGroup__Group__1 : rule__OrGroup__Group__1__Impl rule__OrGroup__Group__2 ;
    public final void rule__OrGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:1988:1: ( rule__OrGroup__Group__1__Impl rule__OrGroup__Group__2 )
            // InternalFeatureModel.g:1989:2: rule__OrGroup__Group__1__Impl rule__OrGroup__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__OrGroup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__2();

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
    // $ANTLR end "rule__OrGroup__Group__1"


    // $ANTLR start "rule__OrGroup__Group__1__Impl"
    // InternalFeatureModel.g:1996:1: rule__OrGroup__Group__1__Impl : ( ( rule__OrGroup__SelectedAssignment_1 ) ) ;
    public final void rule__OrGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2000:1: ( ( ( rule__OrGroup__SelectedAssignment_1 ) ) )
            // InternalFeatureModel.g:2001:1: ( ( rule__OrGroup__SelectedAssignment_1 ) )
            {
            // InternalFeatureModel.g:2001:1: ( ( rule__OrGroup__SelectedAssignment_1 ) )
            // InternalFeatureModel.g:2002:2: ( rule__OrGroup__SelectedAssignment_1 )
            {
             before(grammarAccess.getOrGroupAccess().getSelectedAssignment_1()); 
            // InternalFeatureModel.g:2003:2: ( rule__OrGroup__SelectedAssignment_1 )
            // InternalFeatureModel.g:2003:3: rule__OrGroup__SelectedAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__SelectedAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOrGroupAccess().getSelectedAssignment_1()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2011:1: rule__OrGroup__Group__2 : rule__OrGroup__Group__2__Impl rule__OrGroup__Group__3 ;
    public final void rule__OrGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2015:1: ( rule__OrGroup__Group__2__Impl rule__OrGroup__Group__3 )
            // InternalFeatureModel.g:2016:2: rule__OrGroup__Group__2__Impl rule__OrGroup__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__OrGroup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__3();

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
    // $ANTLR end "rule__OrGroup__Group__2"


    // $ANTLR start "rule__OrGroup__Group__2__Impl"
    // InternalFeatureModel.g:2023:1: rule__OrGroup__Group__2__Impl : ( 'OrGroup' ) ;
    public final void rule__OrGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2027:1: ( ( 'OrGroup' ) )
            // InternalFeatureModel.g:2028:1: ( 'OrGroup' )
            {
            // InternalFeatureModel.g:2028:1: ( 'OrGroup' )
            // InternalFeatureModel.g:2029:2: 'OrGroup'
            {
             before(grammarAccess.getOrGroupAccess().getOrGroupKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getOrGroupAccess().getOrGroupKeyword_2()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2038:1: rule__OrGroup__Group__3 : rule__OrGroup__Group__3__Impl rule__OrGroup__Group__4 ;
    public final void rule__OrGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2042:1: ( rule__OrGroup__Group__3__Impl rule__OrGroup__Group__4 )
            // InternalFeatureModel.g:2043:2: rule__OrGroup__Group__3__Impl rule__OrGroup__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__OrGroup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__4();

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
    // $ANTLR end "rule__OrGroup__Group__3"


    // $ANTLR start "rule__OrGroup__Group__3__Impl"
    // InternalFeatureModel.g:2050:1: rule__OrGroup__Group__3__Impl : ( ( rule__OrGroup__NameAssignment_3 ) ) ;
    public final void rule__OrGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2054:1: ( ( ( rule__OrGroup__NameAssignment_3 ) ) )
            // InternalFeatureModel.g:2055:1: ( ( rule__OrGroup__NameAssignment_3 ) )
            {
            // InternalFeatureModel.g:2055:1: ( ( rule__OrGroup__NameAssignment_3 ) )
            // InternalFeatureModel.g:2056:2: ( rule__OrGroup__NameAssignment_3 )
            {
             before(grammarAccess.getOrGroupAccess().getNameAssignment_3()); 
            // InternalFeatureModel.g:2057:2: ( rule__OrGroup__NameAssignment_3 )
            // InternalFeatureModel.g:2057:3: rule__OrGroup__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOrGroupAccess().getNameAssignment_3()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2065:1: rule__OrGroup__Group__4 : rule__OrGroup__Group__4__Impl rule__OrGroup__Group__5 ;
    public final void rule__OrGroup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2069:1: ( rule__OrGroup__Group__4__Impl rule__OrGroup__Group__5 )
            // InternalFeatureModel.g:2070:2: rule__OrGroup__Group__4__Impl rule__OrGroup__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__OrGroup__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__5();

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
    // $ANTLR end "rule__OrGroup__Group__4"


    // $ANTLR start "rule__OrGroup__Group__4__Impl"
    // InternalFeatureModel.g:2077:1: rule__OrGroup__Group__4__Impl : ( '{' ) ;
    public final void rule__OrGroup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2081:1: ( ( '{' ) )
            // InternalFeatureModel.g:2082:1: ( '{' )
            {
            // InternalFeatureModel.g:2082:1: ( '{' )
            // InternalFeatureModel.g:2083:2: '{'
            {
             before(grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2092:1: rule__OrGroup__Group__5 : rule__OrGroup__Group__5__Impl rule__OrGroup__Group__6 ;
    public final void rule__OrGroup__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2096:1: ( rule__OrGroup__Group__5__Impl rule__OrGroup__Group__6 )
            // InternalFeatureModel.g:2097:2: rule__OrGroup__Group__5__Impl rule__OrGroup__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__OrGroup__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__6();

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
    // $ANTLR end "rule__OrGroup__Group__5"


    // $ANTLR start "rule__OrGroup__Group__5__Impl"
    // InternalFeatureModel.g:2104:1: rule__OrGroup__Group__5__Impl : ( 'id' ) ;
    public final void rule__OrGroup__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2108:1: ( ( 'id' ) )
            // InternalFeatureModel.g:2109:1: ( 'id' )
            {
            // InternalFeatureModel.g:2109:1: ( 'id' )
            // InternalFeatureModel.g:2110:2: 'id'
            {
             before(grammarAccess.getOrGroupAccess().getIdKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOrGroupAccess().getIdKeyword_5()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2119:1: rule__OrGroup__Group__6 : rule__OrGroup__Group__6__Impl rule__OrGroup__Group__7 ;
    public final void rule__OrGroup__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2123:1: ( rule__OrGroup__Group__6__Impl rule__OrGroup__Group__7 )
            // InternalFeatureModel.g:2124:2: rule__OrGroup__Group__6__Impl rule__OrGroup__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__OrGroup__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__7();

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
    // $ANTLR end "rule__OrGroup__Group__6"


    // $ANTLR start "rule__OrGroup__Group__6__Impl"
    // InternalFeatureModel.g:2131:1: rule__OrGroup__Group__6__Impl : ( ( rule__OrGroup__IdAssignment_6 ) ) ;
    public final void rule__OrGroup__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2135:1: ( ( ( rule__OrGroup__IdAssignment_6 ) ) )
            // InternalFeatureModel.g:2136:1: ( ( rule__OrGroup__IdAssignment_6 ) )
            {
            // InternalFeatureModel.g:2136:1: ( ( rule__OrGroup__IdAssignment_6 ) )
            // InternalFeatureModel.g:2137:2: ( rule__OrGroup__IdAssignment_6 )
            {
             before(grammarAccess.getOrGroupAccess().getIdAssignment_6()); 
            // InternalFeatureModel.g:2138:2: ( rule__OrGroup__IdAssignment_6 )
            // InternalFeatureModel.g:2138:3: rule__OrGroup__IdAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__IdAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOrGroupAccess().getIdAssignment_6()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2146:1: rule__OrGroup__Group__7 : rule__OrGroup__Group__7__Impl rule__OrGroup__Group__8 ;
    public final void rule__OrGroup__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2150:1: ( rule__OrGroup__Group__7__Impl rule__OrGroup__Group__8 )
            // InternalFeatureModel.g:2151:2: rule__OrGroup__Group__7__Impl rule__OrGroup__Group__8
            {
            pushFollow(FOLLOW_24);
            rule__OrGroup__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__8();

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
    // $ANTLR end "rule__OrGroup__Group__7"


    // $ANTLR start "rule__OrGroup__Group__7__Impl"
    // InternalFeatureModel.g:2158:1: rule__OrGroup__Group__7__Impl : ( ( rule__OrGroup__Group_7__0 )? ) ;
    public final void rule__OrGroup__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2162:1: ( ( ( rule__OrGroup__Group_7__0 )? ) )
            // InternalFeatureModel.g:2163:1: ( ( rule__OrGroup__Group_7__0 )? )
            {
            // InternalFeatureModel.g:2163:1: ( ( rule__OrGroup__Group_7__0 )? )
            // InternalFeatureModel.g:2164:2: ( rule__OrGroup__Group_7__0 )?
            {
             before(grammarAccess.getOrGroupAccess().getGroup_7()); 
            // InternalFeatureModel.g:2165:2: ( rule__OrGroup__Group_7__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalFeatureModel.g:2165:3: rule__OrGroup__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OrGroup__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOrGroupAccess().getGroup_7()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2173:1: rule__OrGroup__Group__8 : rule__OrGroup__Group__8__Impl ;
    public final void rule__OrGroup__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2177:1: ( rule__OrGroup__Group__8__Impl )
            // InternalFeatureModel.g:2178:2: rule__OrGroup__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group__8__Impl();

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
    // $ANTLR end "rule__OrGroup__Group__8"


    // $ANTLR start "rule__OrGroup__Group__8__Impl"
    // InternalFeatureModel.g:2184:1: rule__OrGroup__Group__8__Impl : ( '}' ) ;
    public final void rule__OrGroup__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2188:1: ( ( '}' ) )
            // InternalFeatureModel.g:2189:1: ( '}' )
            {
            // InternalFeatureModel.g:2189:1: ( '}' )
            // InternalFeatureModel.g:2190:2: '}'
            {
             before(grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__OrGroup__Group_7__0"
    // InternalFeatureModel.g:2200:1: rule__OrGroup__Group_7__0 : rule__OrGroup__Group_7__0__Impl rule__OrGroup__Group_7__1 ;
    public final void rule__OrGroup__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2204:1: ( rule__OrGroup__Group_7__0__Impl rule__OrGroup__Group_7__1 )
            // InternalFeatureModel.g:2205:2: rule__OrGroup__Group_7__0__Impl rule__OrGroup__Group_7__1
            {
            pushFollow(FOLLOW_3);
            rule__OrGroup__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7__1();

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
    // $ANTLR end "rule__OrGroup__Group_7__0"


    // $ANTLR start "rule__OrGroup__Group_7__0__Impl"
    // InternalFeatureModel.g:2212:1: rule__OrGroup__Group_7__0__Impl : ( 'children' ) ;
    public final void rule__OrGroup__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2216:1: ( ( 'children' ) )
            // InternalFeatureModel.g:2217:1: ( 'children' )
            {
            // InternalFeatureModel.g:2217:1: ( 'children' )
            // InternalFeatureModel.g:2218:2: 'children'
            {
             before(grammarAccess.getOrGroupAccess().getChildrenKeyword_7_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOrGroupAccess().getChildrenKeyword_7_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2227:1: rule__OrGroup__Group_7__1 : rule__OrGroup__Group_7__1__Impl rule__OrGroup__Group_7__2 ;
    public final void rule__OrGroup__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2231:1: ( rule__OrGroup__Group_7__1__Impl rule__OrGroup__Group_7__2 )
            // InternalFeatureModel.g:2232:2: rule__OrGroup__Group_7__1__Impl rule__OrGroup__Group_7__2
            {
            pushFollow(FOLLOW_5);
            rule__OrGroup__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7__2();

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
    // $ANTLR end "rule__OrGroup__Group_7__1"


    // $ANTLR start "rule__OrGroup__Group_7__1__Impl"
    // InternalFeatureModel.g:2239:1: rule__OrGroup__Group_7__1__Impl : ( '{' ) ;
    public final void rule__OrGroup__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2243:1: ( ( '{' ) )
            // InternalFeatureModel.g:2244:1: ( '{' )
            {
            // InternalFeatureModel.g:2244:1: ( '{' )
            // InternalFeatureModel.g:2245:2: '{'
            {
             before(grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2254:1: rule__OrGroup__Group_7__2 : rule__OrGroup__Group_7__2__Impl rule__OrGroup__Group_7__3 ;
    public final void rule__OrGroup__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2258:1: ( rule__OrGroup__Group_7__2__Impl rule__OrGroup__Group_7__3 )
            // InternalFeatureModel.g:2259:2: rule__OrGroup__Group_7__2__Impl rule__OrGroup__Group_7__3
            {
            pushFollow(FOLLOW_6);
            rule__OrGroup__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7__3();

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
    // $ANTLR end "rule__OrGroup__Group_7__2"


    // $ANTLR start "rule__OrGroup__Group_7__2__Impl"
    // InternalFeatureModel.g:2266:1: rule__OrGroup__Group_7__2__Impl : ( ( rule__OrGroup__ChildrenAssignment_7_2 ) ) ;
    public final void rule__OrGroup__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2270:1: ( ( ( rule__OrGroup__ChildrenAssignment_7_2 ) ) )
            // InternalFeatureModel.g:2271:1: ( ( rule__OrGroup__ChildrenAssignment_7_2 ) )
            {
            // InternalFeatureModel.g:2271:1: ( ( rule__OrGroup__ChildrenAssignment_7_2 ) )
            // InternalFeatureModel.g:2272:2: ( rule__OrGroup__ChildrenAssignment_7_2 )
            {
             before(grammarAccess.getOrGroupAccess().getChildrenAssignment_7_2()); 
            // InternalFeatureModel.g:2273:2: ( rule__OrGroup__ChildrenAssignment_7_2 )
            // InternalFeatureModel.g:2273:3: rule__OrGroup__ChildrenAssignment_7_2
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__ChildrenAssignment_7_2();

            state._fsp--;


            }

             after(grammarAccess.getOrGroupAccess().getChildrenAssignment_7_2()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2281:1: rule__OrGroup__Group_7__3 : rule__OrGroup__Group_7__3__Impl rule__OrGroup__Group_7__4 ;
    public final void rule__OrGroup__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2285:1: ( rule__OrGroup__Group_7__3__Impl rule__OrGroup__Group_7__4 )
            // InternalFeatureModel.g:2286:2: rule__OrGroup__Group_7__3__Impl rule__OrGroup__Group_7__4
            {
            pushFollow(FOLLOW_6);
            rule__OrGroup__Group_7__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7__4();

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
    // $ANTLR end "rule__OrGroup__Group_7__3"


    // $ANTLR start "rule__OrGroup__Group_7__3__Impl"
    // InternalFeatureModel.g:2293:1: rule__OrGroup__Group_7__3__Impl : ( ( rule__OrGroup__Group_7_3__0 )* ) ;
    public final void rule__OrGroup__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2297:1: ( ( ( rule__OrGroup__Group_7_3__0 )* ) )
            // InternalFeatureModel.g:2298:1: ( ( rule__OrGroup__Group_7_3__0 )* )
            {
            // InternalFeatureModel.g:2298:1: ( ( rule__OrGroup__Group_7_3__0 )* )
            // InternalFeatureModel.g:2299:2: ( rule__OrGroup__Group_7_3__0 )*
            {
             before(grammarAccess.getOrGroupAccess().getGroup_7_3()); 
            // InternalFeatureModel.g:2300:2: ( rule__OrGroup__Group_7_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==17) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalFeatureModel.g:2300:3: rule__OrGroup__Group_7_3__0
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__OrGroup__Group_7_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getOrGroupAccess().getGroup_7_3()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2308:1: rule__OrGroup__Group_7__4 : rule__OrGroup__Group_7__4__Impl ;
    public final void rule__OrGroup__Group_7__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2312:1: ( rule__OrGroup__Group_7__4__Impl )
            // InternalFeatureModel.g:2313:2: rule__OrGroup__Group_7__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7__4__Impl();

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
    // $ANTLR end "rule__OrGroup__Group_7__4"


    // $ANTLR start "rule__OrGroup__Group_7__4__Impl"
    // InternalFeatureModel.g:2319:1: rule__OrGroup__Group_7__4__Impl : ( '}' ) ;
    public final void rule__OrGroup__Group_7__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2323:1: ( ( '}' ) )
            // InternalFeatureModel.g:2324:1: ( '}' )
            {
            // InternalFeatureModel.g:2324:1: ( '}' )
            // InternalFeatureModel.g:2325:2: '}'
            {
             before(grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_7_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_7_4()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2335:1: rule__OrGroup__Group_7_3__0 : rule__OrGroup__Group_7_3__0__Impl rule__OrGroup__Group_7_3__1 ;
    public final void rule__OrGroup__Group_7_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2339:1: ( rule__OrGroup__Group_7_3__0__Impl rule__OrGroup__Group_7_3__1 )
            // InternalFeatureModel.g:2340:2: rule__OrGroup__Group_7_3__0__Impl rule__OrGroup__Group_7_3__1
            {
            pushFollow(FOLLOW_5);
            rule__OrGroup__Group_7_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7_3__1();

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
    // $ANTLR end "rule__OrGroup__Group_7_3__0"


    // $ANTLR start "rule__OrGroup__Group_7_3__0__Impl"
    // InternalFeatureModel.g:2347:1: rule__OrGroup__Group_7_3__0__Impl : ( ',' ) ;
    public final void rule__OrGroup__Group_7_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2351:1: ( ( ',' ) )
            // InternalFeatureModel.g:2352:1: ( ',' )
            {
            // InternalFeatureModel.g:2352:1: ( ',' )
            // InternalFeatureModel.g:2353:2: ','
            {
             before(grammarAccess.getOrGroupAccess().getCommaKeyword_7_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getOrGroupAccess().getCommaKeyword_7_3_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2362:1: rule__OrGroup__Group_7_3__1 : rule__OrGroup__Group_7_3__1__Impl ;
    public final void rule__OrGroup__Group_7_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2366:1: ( rule__OrGroup__Group_7_3__1__Impl )
            // InternalFeatureModel.g:2367:2: rule__OrGroup__Group_7_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__Group_7_3__1__Impl();

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
    // $ANTLR end "rule__OrGroup__Group_7_3__1"


    // $ANTLR start "rule__OrGroup__Group_7_3__1__Impl"
    // InternalFeatureModel.g:2373:1: rule__OrGroup__Group_7_3__1__Impl : ( ( rule__OrGroup__ChildrenAssignment_7_3_1 ) ) ;
    public final void rule__OrGroup__Group_7_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2377:1: ( ( ( rule__OrGroup__ChildrenAssignment_7_3_1 ) ) )
            // InternalFeatureModel.g:2378:1: ( ( rule__OrGroup__ChildrenAssignment_7_3_1 ) )
            {
            // InternalFeatureModel.g:2378:1: ( ( rule__OrGroup__ChildrenAssignment_7_3_1 ) )
            // InternalFeatureModel.g:2379:2: ( rule__OrGroup__ChildrenAssignment_7_3_1 )
            {
             before(grammarAccess.getOrGroupAccess().getChildrenAssignment_7_3_1()); 
            // InternalFeatureModel.g:2380:2: ( rule__OrGroup__ChildrenAssignment_7_3_1 )
            // InternalFeatureModel.g:2380:3: rule__OrGroup__ChildrenAssignment_7_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OrGroup__ChildrenAssignment_7_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOrGroupAccess().getChildrenAssignment_7_3_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__Model__FeatureDefinitionsAssignment_4"
    // InternalFeatureModel.g:2389:1: rule__Model__FeatureDefinitionsAssignment_4 : ( ruleFeature ) ;
    public final void rule__Model__FeatureDefinitionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2393:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2394:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2394:2: ( ruleFeature )
            // InternalFeatureModel.g:2395:3: ruleFeature
            {
             before(grammarAccess.getModelAccess().getFeatureDefinitionsFeatureParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFeatureDefinitionsFeatureParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FeatureDefinitionsAssignment_4"


    // $ANTLR start "rule__Model__FeatureDefinitionsAssignment_5_1"
    // InternalFeatureModel.g:2404:1: rule__Model__FeatureDefinitionsAssignment_5_1 : ( ruleFeature ) ;
    public final void rule__Model__FeatureDefinitionsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2408:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2409:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2409:2: ( ruleFeature )
            // InternalFeatureModel.g:2410:3: ruleFeature
            {
             before(grammarAccess.getModelAccess().getFeatureDefinitionsFeatureParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFeatureDefinitionsFeatureParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FeatureDefinitionsAssignment_5_1"


    // $ANTLR start "rule__Model__FmAssignment_7"
    // InternalFeatureModel.g:2419:1: rule__Model__FmAssignment_7 : ( ruleFeatureModel ) ;
    public final void rule__Model__FmAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2423:1: ( ( ruleFeatureModel ) )
            // InternalFeatureModel.g:2424:2: ( ruleFeatureModel )
            {
            // InternalFeatureModel.g:2424:2: ( ruleFeatureModel )
            // InternalFeatureModel.g:2425:3: ruleFeatureModel
            {
             before(grammarAccess.getModelAccess().getFmFeatureModelParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleFeatureModel();

            state._fsp--;

             after(grammarAccess.getModelAccess().getFmFeatureModelParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__FmAssignment_7"


    // $ANTLR start "rule__FeatureModel__NameAssignment_1"
    // InternalFeatureModel.g:2434:1: rule__FeatureModel__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__FeatureModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2438:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2439:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2439:2: ( ruleEString )
            // InternalFeatureModel.g:2440:3: ruleEString
            {
             before(grammarAccess.getFeatureModelAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeatureModelAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2449:1: rule__FeatureModel__RootAssignment_3 : ( ruleFeature ) ;
    public final void rule__FeatureModel__RootAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2453:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2454:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2454:2: ( ruleFeature )
            // InternalFeatureModel.g:2455:3: ruleFeature
            {
             before(grammarAccess.getFeatureModelAccess().getRootFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeatureModelAccess().getRootFeatureParserRuleCall_3_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__FeatureModel__FeaturesAssignment_5"
    // InternalFeatureModel.g:2464:1: rule__FeatureModel__FeaturesAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__FeatureModel__FeaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2468:1: ( ( ( RULE_ID ) ) )
            // InternalFeatureModel.g:2469:2: ( ( RULE_ID ) )
            {
            // InternalFeatureModel.g:2469:2: ( ( RULE_ID ) )
            // InternalFeatureModel.g:2470:3: ( RULE_ID )
            {
             before(grammarAccess.getFeatureModelAccess().getFeaturesFeatureCrossReference_5_0()); 
            // InternalFeatureModel.g:2471:3: ( RULE_ID )
            // InternalFeatureModel.g:2472:4: RULE_ID
            {
             before(grammarAccess.getFeatureModelAccess().getFeaturesFeatureIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFeatureModelAccess().getFeaturesFeatureIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getFeatureModelAccess().getFeaturesFeatureCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureModel__FeaturesAssignment_5"


    // $ANTLR start "rule__FeatureModel__CrossTreeConstraintsAssignment_7"
    // InternalFeatureModel.g:2483:1: rule__FeatureModel__CrossTreeConstraintsAssignment_7 : ( ruleBasicConstraint ) ;
    public final void rule__FeatureModel__CrossTreeConstraintsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2487:1: ( ( ruleBasicConstraint ) )
            // InternalFeatureModel.g:2488:2: ( ruleBasicConstraint )
            {
            // InternalFeatureModel.g:2488:2: ( ruleBasicConstraint )
            // InternalFeatureModel.g:2489:3: ruleBasicConstraint
            {
             before(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsBasicConstraintParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleBasicConstraint();

            state._fsp--;

             after(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsBasicConstraintParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FeatureModel__CrossTreeConstraintsAssignment_7"


    // $ANTLR start "rule__BasicConstraint__TypeAssignment_3"
    // InternalFeatureModel.g:2498:1: rule__BasicConstraint__TypeAssignment_3 : ( ruleCrossTreeConstraintType ) ;
    public final void rule__BasicConstraint__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2502:1: ( ( ruleCrossTreeConstraintType ) )
            // InternalFeatureModel.g:2503:2: ( ruleCrossTreeConstraintType )
            {
            // InternalFeatureModel.g:2503:2: ( ruleCrossTreeConstraintType )
            // InternalFeatureModel.g:2504:3: ruleCrossTreeConstraintType
            {
             before(grammarAccess.getBasicConstraintAccess().getTypeCrossTreeConstraintTypeEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCrossTreeConstraintType();

            state._fsp--;

             after(grammarAccess.getBasicConstraintAccess().getTypeCrossTreeConstraintTypeEnumRuleCall_3_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2513:1: rule__BasicConstraint__RightFeatureAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__BasicConstraint__RightFeatureAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2517:1: ( ( ( ruleEString ) ) )
            // InternalFeatureModel.g:2518:2: ( ( ruleEString ) )
            {
            // InternalFeatureModel.g:2518:2: ( ( ruleEString ) )
            // InternalFeatureModel.g:2519:3: ( ruleEString )
            {
             before(grammarAccess.getBasicConstraintAccess().getRightFeatureFeatureCrossReference_5_0()); 
            // InternalFeatureModel.g:2520:3: ( ruleEString )
            // InternalFeatureModel.g:2521:4: ruleEString
            {
             before(grammarAccess.getBasicConstraintAccess().getRightFeatureFeatureEStringParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBasicConstraintAccess().getRightFeatureFeatureEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getBasicConstraintAccess().getRightFeatureFeatureCrossReference_5_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2532:1: rule__BasicConstraint__LeftFeatureAssignment_7 : ( ( ruleEString ) ) ;
    public final void rule__BasicConstraint__LeftFeatureAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2536:1: ( ( ( ruleEString ) ) )
            // InternalFeatureModel.g:2537:2: ( ( ruleEString ) )
            {
            // InternalFeatureModel.g:2537:2: ( ( ruleEString ) )
            // InternalFeatureModel.g:2538:3: ( ruleEString )
            {
             before(grammarAccess.getBasicConstraintAccess().getLeftFeatureFeatureCrossReference_7_0()); 
            // InternalFeatureModel.g:2539:3: ( ruleEString )
            // InternalFeatureModel.g:2540:4: ruleEString
            {
             before(grammarAccess.getBasicConstraintAccess().getLeftFeatureFeatureEStringParserRuleCall_7_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getBasicConstraintAccess().getLeftFeatureFeatureEStringParserRuleCall_7_0_1()); 

            }

             after(grammarAccess.getBasicConstraintAccess().getLeftFeatureFeatureCrossReference_7_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Feature_Impl__MandatoryAssignment_0"
    // InternalFeatureModel.g:2551:1: rule__Feature_Impl__MandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__Feature_Impl__MandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2555:1: ( ( ( 'mandatory' ) ) )
            // InternalFeatureModel.g:2556:2: ( ( 'mandatory' ) )
            {
            // InternalFeatureModel.g:2556:2: ( ( 'mandatory' ) )
            // InternalFeatureModel.g:2557:3: ( 'mandatory' )
            {
             before(grammarAccess.getFeature_ImplAccess().getMandatoryMandatoryKeyword_0_0()); 
            // InternalFeatureModel.g:2558:3: ( 'mandatory' )
            // InternalFeatureModel.g:2559:4: 'mandatory'
            {
             before(grammarAccess.getFeature_ImplAccess().getMandatoryMandatoryKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFeature_ImplAccess().getMandatoryMandatoryKeyword_0_0()); 

            }

             after(grammarAccess.getFeature_ImplAccess().getMandatoryMandatoryKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__MandatoryAssignment_0"


    // $ANTLR start "rule__Feature_Impl__SelectedAssignment_1"
    // InternalFeatureModel.g:2570:1: rule__Feature_Impl__SelectedAssignment_1 : ( ( 'selected' ) ) ;
    public final void rule__Feature_Impl__SelectedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2574:1: ( ( ( 'selected' ) ) )
            // InternalFeatureModel.g:2575:2: ( ( 'selected' ) )
            {
            // InternalFeatureModel.g:2575:2: ( ( 'selected' ) )
            // InternalFeatureModel.g:2576:3: ( 'selected' )
            {
             before(grammarAccess.getFeature_ImplAccess().getSelectedSelectedKeyword_1_0()); 
            // InternalFeatureModel.g:2577:3: ( 'selected' )
            // InternalFeatureModel.g:2578:4: 'selected'
            {
             before(grammarAccess.getFeature_ImplAccess().getSelectedSelectedKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFeature_ImplAccess().getSelectedSelectedKeyword_1_0()); 

            }

             after(grammarAccess.getFeature_ImplAccess().getSelectedSelectedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Feature_Impl__SelectedAssignment_1"


    // $ANTLR start "rule__Feature_Impl__NameAssignment_3"
    // InternalFeatureModel.g:2589:1: rule__Feature_Impl__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Feature_Impl__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2593:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2594:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2594:2: ( ruleEString )
            // InternalFeatureModel.g:2595:3: ruleEString
            {
             before(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2604:1: rule__Feature_Impl__IdAssignment_6 : ( ruleEString ) ;
    public final void rule__Feature_Impl__IdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2608:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2609:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2609:2: ( ruleEString )
            // InternalFeatureModel.g:2610:3: ruleEString
            {
             before(grammarAccess.getFeature_ImplAccess().getIdEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFeature_ImplAccess().getIdEStringParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2619:1: rule__Feature_Impl__ChildrenAssignment_7_2 : ( ruleFeature ) ;
    public final void rule__Feature_Impl__ChildrenAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2623:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2624:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2624:2: ( ruleFeature )
            // InternalFeatureModel.g:2625:3: ruleFeature
            {
             before(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_7_2_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2634:1: rule__Feature_Impl__ChildrenAssignment_7_3_1 : ( ruleFeature ) ;
    public final void rule__Feature_Impl__ChildrenAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2638:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2639:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2639:2: ( ruleFeature )
            // InternalFeatureModel.g:2640:3: ruleFeature
            {
             before(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_7_3_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Alternative__MandatoryAssignment_0"
    // InternalFeatureModel.g:2649:1: rule__Alternative__MandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__Alternative__MandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2653:1: ( ( ( 'mandatory' ) ) )
            // InternalFeatureModel.g:2654:2: ( ( 'mandatory' ) )
            {
            // InternalFeatureModel.g:2654:2: ( ( 'mandatory' ) )
            // InternalFeatureModel.g:2655:3: ( 'mandatory' )
            {
             before(grammarAccess.getAlternativeAccess().getMandatoryMandatoryKeyword_0_0()); 
            // InternalFeatureModel.g:2656:3: ( 'mandatory' )
            // InternalFeatureModel.g:2657:4: 'mandatory'
            {
             before(grammarAccess.getAlternativeAccess().getMandatoryMandatoryKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getMandatoryMandatoryKeyword_0_0()); 

            }

             after(grammarAccess.getAlternativeAccess().getMandatoryMandatoryKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__MandatoryAssignment_0"


    // $ANTLR start "rule__Alternative__SelectedAssignment_1"
    // InternalFeatureModel.g:2668:1: rule__Alternative__SelectedAssignment_1 : ( ( 'selected' ) ) ;
    public final void rule__Alternative__SelectedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2672:1: ( ( ( 'selected' ) ) )
            // InternalFeatureModel.g:2673:2: ( ( 'selected' ) )
            {
            // InternalFeatureModel.g:2673:2: ( ( 'selected' ) )
            // InternalFeatureModel.g:2674:3: ( 'selected' )
            {
             before(grammarAccess.getAlternativeAccess().getSelectedSelectedKeyword_1_0()); 
            // InternalFeatureModel.g:2675:3: ( 'selected' )
            // InternalFeatureModel.g:2676:4: 'selected'
            {
             before(grammarAccess.getAlternativeAccess().getSelectedSelectedKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getAlternativeAccess().getSelectedSelectedKeyword_1_0()); 

            }

             after(grammarAccess.getAlternativeAccess().getSelectedSelectedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternative__SelectedAssignment_1"


    // $ANTLR start "rule__Alternative__NameAssignment_3"
    // InternalFeatureModel.g:2687:1: rule__Alternative__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Alternative__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2691:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2692:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2692:2: ( ruleEString )
            // InternalFeatureModel.g:2693:3: ruleEString
            {
             before(grammarAccess.getAlternativeAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlternativeAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2702:1: rule__Alternative__IdAssignment_6 : ( ruleEString ) ;
    public final void rule__Alternative__IdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2706:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2707:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2707:2: ( ruleEString )
            // InternalFeatureModel.g:2708:3: ruleEString
            {
             before(grammarAccess.getAlternativeAccess().getIdEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getAlternativeAccess().getIdEStringParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2717:1: rule__Alternative__ChildrenAssignment_7_2 : ( ruleFeature ) ;
    public final void rule__Alternative__ChildrenAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2721:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2722:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2722:2: ( ruleFeature )
            // InternalFeatureModel.g:2723:3: ruleFeature
            {
             before(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_7_2_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2732:1: rule__Alternative__ChildrenAssignment_7_3_1 : ( ruleFeature ) ;
    public final void rule__Alternative__ChildrenAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2736:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2737:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2737:2: ( ruleFeature )
            // InternalFeatureModel.g:2738:3: ruleFeature
            {
             before(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_7_3_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__OrGroup__MandatoryAssignment_0"
    // InternalFeatureModel.g:2747:1: rule__OrGroup__MandatoryAssignment_0 : ( ( 'mandatory' ) ) ;
    public final void rule__OrGroup__MandatoryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2751:1: ( ( ( 'mandatory' ) ) )
            // InternalFeatureModel.g:2752:2: ( ( 'mandatory' ) )
            {
            // InternalFeatureModel.g:2752:2: ( ( 'mandatory' ) )
            // InternalFeatureModel.g:2753:3: ( 'mandatory' )
            {
             before(grammarAccess.getOrGroupAccess().getMandatoryMandatoryKeyword_0_0()); 
            // InternalFeatureModel.g:2754:3: ( 'mandatory' )
            // InternalFeatureModel.g:2755:4: 'mandatory'
            {
             before(grammarAccess.getOrGroupAccess().getMandatoryMandatoryKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getOrGroupAccess().getMandatoryMandatoryKeyword_0_0()); 

            }

             after(grammarAccess.getOrGroupAccess().getMandatoryMandatoryKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrGroup__MandatoryAssignment_0"


    // $ANTLR start "rule__OrGroup__SelectedAssignment_1"
    // InternalFeatureModel.g:2766:1: rule__OrGroup__SelectedAssignment_1 : ( ( 'selected' ) ) ;
    public final void rule__OrGroup__SelectedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2770:1: ( ( ( 'selected' ) ) )
            // InternalFeatureModel.g:2771:2: ( ( 'selected' ) )
            {
            // InternalFeatureModel.g:2771:2: ( ( 'selected' ) )
            // InternalFeatureModel.g:2772:3: ( 'selected' )
            {
             before(grammarAccess.getOrGroupAccess().getSelectedSelectedKeyword_1_0()); 
            // InternalFeatureModel.g:2773:3: ( 'selected' )
            // InternalFeatureModel.g:2774:4: 'selected'
            {
             before(grammarAccess.getOrGroupAccess().getSelectedSelectedKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getOrGroupAccess().getSelectedSelectedKeyword_1_0()); 

            }

             after(grammarAccess.getOrGroupAccess().getSelectedSelectedKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrGroup__SelectedAssignment_1"


    // $ANTLR start "rule__OrGroup__NameAssignment_3"
    // InternalFeatureModel.g:2785:1: rule__OrGroup__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__OrGroup__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2789:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2790:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2790:2: ( ruleEString )
            // InternalFeatureModel.g:2791:3: ruleEString
            {
             before(grammarAccess.getOrGroupAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrGroupAccess().getNameEStringParserRuleCall_3_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2800:1: rule__OrGroup__IdAssignment_6 : ( ruleEString ) ;
    public final void rule__OrGroup__IdAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2804:1: ( ( ruleEString ) )
            // InternalFeatureModel.g:2805:2: ( ruleEString )
            {
            // InternalFeatureModel.g:2805:2: ( ruleEString )
            // InternalFeatureModel.g:2806:3: ruleEString
            {
             before(grammarAccess.getOrGroupAccess().getIdEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOrGroupAccess().getIdEStringParserRuleCall_6_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2815:1: rule__OrGroup__ChildrenAssignment_7_2 : ( ruleFeature ) ;
    public final void rule__OrGroup__ChildrenAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2819:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2820:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2820:2: ( ruleFeature )
            // InternalFeatureModel.g:2821:3: ruleFeature
            {
             before(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_7_2_0()); 

            }


            }

        }
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
    // InternalFeatureModel.g:2830:1: rule__OrGroup__ChildrenAssignment_7_3_1 : ( ruleFeature ) ;
    public final void rule__OrGroup__ChildrenAssignment_7_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFeatureModel.g:2834:1: ( ( ruleFeature ) )
            // InternalFeatureModel.g:2835:2: ( ruleFeature )
            {
            // InternalFeatureModel.g:2835:2: ( ruleFeature )
            // InternalFeatureModel.g:2836:3: ruleFeature
            {
             before(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_7_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFeature();

            state._fsp--;

             after(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_7_3_1_0()); 

            }


            }

        }
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010010000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});

}