package eu.coresense.variability.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.coresense.variability.services.FeatureModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalFeatureModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'feature_model'", "'{'", "'}'", "'name'", "'root'", "'crossTreeConstraints'", "'mandatory'", "'selected'", "'Feature'", "'id'", "'children'", "','", "'Alternative'", "'OrGroup'", "'not'", "'equiv'", "'excludes'", "'implies'", "'and'", "'or'", "'xor'", "'feature'"
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

        public InternalFeatureModelParser(TokenStream input, FeatureModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected FeatureModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalFeatureModel.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalFeatureModel.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalFeatureModel.g:66:2: iv_ruleModel= ruleModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalFeatureModel.g:72:1: ruleModel returns [EObject current=null] : (otherlv_0= 'feature_model' otherlv_1= '{' ( (lv_fm_2_0= ruleFeatureModel ) ) otherlv_3= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_fm_2_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:78:2: ( (otherlv_0= 'feature_model' otherlv_1= '{' ( (lv_fm_2_0= ruleFeatureModel ) ) otherlv_3= '}' ) )
            // InternalFeatureModel.g:79:2: (otherlv_0= 'feature_model' otherlv_1= '{' ( (lv_fm_2_0= ruleFeatureModel ) ) otherlv_3= '}' )
            {
            // InternalFeatureModel.g:79:2: (otherlv_0= 'feature_model' otherlv_1= '{' ( (lv_fm_2_0= ruleFeatureModel ) ) otherlv_3= '}' )
            // InternalFeatureModel.g:80:3: otherlv_0= 'feature_model' otherlv_1= '{' ( (lv_fm_2_0= ruleFeatureModel ) ) otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getFeature_modelKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalFeatureModel.g:88:3: ( (lv_fm_2_0= ruleFeatureModel ) )
            // InternalFeatureModel.g:89:4: (lv_fm_2_0= ruleFeatureModel )
            {
            // InternalFeatureModel.g:89:4: (lv_fm_2_0= ruleFeatureModel )
            // InternalFeatureModel.g:90:5: lv_fm_2_0= ruleFeatureModel
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModelAccess().getFmFeatureModelParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_fm_2_0=ruleFeatureModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModelRule());
              					}
              					set(
              						current,
              						"fm",
              						lv_fm_2_0,
              						"eu.coresense.variability.FeatureModel.FeatureModel");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleFeatureModel"
    // InternalFeatureModel.g:115:1: entryRuleFeatureModel returns [EObject current=null] : iv_ruleFeatureModel= ruleFeatureModel EOF ;
    public final EObject entryRuleFeatureModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeatureModel = null;


        try {
            // InternalFeatureModel.g:115:53: (iv_ruleFeatureModel= ruleFeatureModel EOF )
            // InternalFeatureModel.g:116:2: iv_ruleFeatureModel= ruleFeatureModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeatureModel=ruleFeatureModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeatureModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeatureModel"


    // $ANTLR start "ruleFeatureModel"
    // InternalFeatureModel.g:122:1: ruleFeatureModel returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' otherlv_5= '{' ( (lv_crossTreeConstraints_6_0= ruleAdvancedConstraint ) )* otherlv_7= '}' ) ;
    public final EObject ruleFeatureModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_root_3_0 = null;

        EObject lv_crossTreeConstraints_6_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:128:2: ( (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' otherlv_5= '{' ( (lv_crossTreeConstraints_6_0= ruleAdvancedConstraint ) )* otherlv_7= '}' ) )
            // InternalFeatureModel.g:129:2: (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' otherlv_5= '{' ( (lv_crossTreeConstraints_6_0= ruleAdvancedConstraint ) )* otherlv_7= '}' )
            {
            // InternalFeatureModel.g:129:2: (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' otherlv_5= '{' ( (lv_crossTreeConstraints_6_0= ruleAdvancedConstraint ) )* otherlv_7= '}' )
            // InternalFeatureModel.g:130:3: otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' otherlv_5= '{' ( (lv_crossTreeConstraints_6_0= ruleAdvancedConstraint ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getFeatureModelAccess().getNameKeyword_0());
              		
            }
            // InternalFeatureModel.g:134:3: ( (lv_name_1_0= ruleEString ) )
            // InternalFeatureModel.g:135:4: (lv_name_1_0= ruleEString )
            {
            // InternalFeatureModel.g:135:4: (lv_name_1_0= ruleEString )
            // InternalFeatureModel.g:136:5: lv_name_1_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureModelAccess().getNameEStringParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_name_1_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeatureModelRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"eu.coresense.variability.FeatureModel.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getFeatureModelAccess().getRootKeyword_2());
              		
            }
            // InternalFeatureModel.g:157:3: ( (lv_root_3_0= ruleFeature ) )
            // InternalFeatureModel.g:158:4: (lv_root_3_0= ruleFeature )
            {
            // InternalFeatureModel.g:158:4: (lv_root_3_0= ruleFeature )
            // InternalFeatureModel.g:159:5: lv_root_3_0= ruleFeature
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeatureModelAccess().getRootFeatureParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_root_3_0=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeatureModelRule());
              					}
              					set(
              						current,
              						"root",
              						lv_root_3_0,
              						"eu.coresense.variability.FeatureModel.Feature");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsKeyword_4());
              		
            }
            otherlv_5=(Token)match(input,12,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getFeatureModelAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalFeatureModel.g:184:3: ( (lv_crossTreeConstraints_6_0= ruleAdvancedConstraint ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureModel.g:185:4: (lv_crossTreeConstraints_6_0= ruleAdvancedConstraint )
            	    {
            	    // InternalFeatureModel.g:185:4: (lv_crossTreeConstraints_6_0= ruleAdvancedConstraint )
            	    // InternalFeatureModel.g:186:5: lv_crossTreeConstraints_6_0= ruleAdvancedConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsAdvancedConstraintParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_crossTreeConstraints_6_0=ruleAdvancedConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getFeatureModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"crossTreeConstraints",
            	      						lv_crossTreeConstraints_6_0,
            	      						"eu.coresense.variability.FeatureModel.AdvancedConstraint");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getFeatureModelAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeatureModel"


    // $ANTLR start "entryRuleAdvancedConstraint"
    // InternalFeatureModel.g:211:1: entryRuleAdvancedConstraint returns [EObject current=null] : iv_ruleAdvancedConstraint= ruleAdvancedConstraint EOF ;
    public final EObject entryRuleAdvancedConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdvancedConstraint = null;


        try {
            // InternalFeatureModel.g:211:59: (iv_ruleAdvancedConstraint= ruleAdvancedConstraint EOF )
            // InternalFeatureModel.g:212:2: iv_ruleAdvancedConstraint= ruleAdvancedConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdvancedConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAdvancedConstraint=ruleAdvancedConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdvancedConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAdvancedConstraint"


    // $ANTLR start "ruleAdvancedConstraint"
    // InternalFeatureModel.g:218:1: ruleAdvancedConstraint returns [EObject current=null] : ( (lv_term_0_0= ruleTerm ) ) ;
    public final EObject ruleAdvancedConstraint() throws RecognitionException {
        EObject current = null;

        EObject lv_term_0_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:224:2: ( ( (lv_term_0_0= ruleTerm ) ) )
            // InternalFeatureModel.g:225:2: ( (lv_term_0_0= ruleTerm ) )
            {
            // InternalFeatureModel.g:225:2: ( (lv_term_0_0= ruleTerm ) )
            // InternalFeatureModel.g:226:3: (lv_term_0_0= ruleTerm )
            {
            // InternalFeatureModel.g:226:3: (lv_term_0_0= ruleTerm )
            // InternalFeatureModel.g:227:4: lv_term_0_0= ruleTerm
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAdvancedConstraintAccess().getTermTermParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_term_0_0=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getAdvancedConstraintRule());
              				}
              				set(
              					current,
              					"term",
              					lv_term_0_0,
              					"eu.coresense.variability.FeatureModel.Term");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAdvancedConstraint"


    // $ANTLR start "entryRuleFeature"
    // InternalFeatureModel.g:247:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalFeatureModel.g:247:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalFeatureModel.g:248:2: iv_ruleFeature= ruleFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // InternalFeatureModel.g:254:1: ruleFeature returns [EObject current=null] : (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Feature_Impl_0 = null;

        EObject this_Alternative_1 = null;

        EObject this_OrGroup_2 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:260:2: ( (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup ) )
            // InternalFeatureModel.g:261:2: (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup )
            {
            // InternalFeatureModel.g:261:2: (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                switch ( input.LA(2) ) {
                case 18:
                    {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        alt2=3;
                        }
                        break;
                    case 18:
                        {
                        switch ( input.LA(4) ) {
                        case 24:
                            {
                            alt2=3;
                            }
                            break;
                        case 23:
                            {
                            alt2=2;
                            }
                            break;
                        case 19:
                            {
                            alt2=1;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 7, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 23:
                        {
                        alt2=2;
                        }
                        break;
                    case 19:
                        {
                        alt2=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                case 24:
                    {
                    alt2=3;
                    }
                    break;
                case 17:
                    {
                    switch ( input.LA(3) ) {
                    case 18:
                        {
                        switch ( input.LA(4) ) {
                        case 24:
                            {
                            alt2=3;
                            }
                            break;
                        case 18:
                            {
                            switch ( input.LA(5) ) {
                            case 24:
                                {
                                alt2=3;
                                }
                                break;
                            case 23:
                                {
                                alt2=2;
                                }
                                break;
                            case 19:
                                {
                                alt2=1;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return current;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 2, 7, input);

                                throw nvae;
                            }

                            }
                            break;
                        case 23:
                            {
                            alt2=2;
                            }
                            break;
                        case 19:
                            {
                            alt2=1;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return current;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 2, 2, input);

                            throw nvae;
                        }

                        }
                        break;
                    case 24:
                        {
                        alt2=3;
                        }
                        break;
                    case 23:
                        {
                        alt2=2;
                        }
                        break;
                    case 19:
                        {
                        alt2=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 6, input);

                        throw nvae;
                    }

                    }
                    break;
                case 23:
                    {
                    alt2=2;
                    }
                    break;
                case 19:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 18:
                {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt2=3;
                    }
                    break;
                case 18:
                    {
                    switch ( input.LA(3) ) {
                    case 24:
                        {
                        alt2=3;
                        }
                        break;
                    case 23:
                        {
                        alt2=2;
                        }
                        break;
                    case 19:
                        {
                        alt2=1;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 7, input);

                        throw nvae;
                    }

                    }
                    break;
                case 23:
                    {
                    alt2=2;
                    }
                    break;
                case 19:
                    {
                    alt2=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }

                }
                break;
            case 19:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalFeatureModel.g:262:3: this_Feature_Impl_0= ruleFeature_Impl
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getFeature_ImplParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Feature_Impl_0=ruleFeature_Impl();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Feature_Impl_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:271:3: this_Alternative_1= ruleAlternative
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getAlternativeParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Alternative_1=ruleAlternative();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Alternative_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalFeatureModel.g:280:3: this_OrGroup_2= ruleOrGroup
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFeatureAccess().getOrGroupParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_OrGroup_2=ruleOrGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_OrGroup_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"


    // $ANTLR start "entryRuleTerm"
    // InternalFeatureModel.g:292:1: entryRuleTerm returns [EObject current=null] : iv_ruleTerm= ruleTerm EOF ;
    public final EObject entryRuleTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTerm = null;


        try {
            // InternalFeatureModel.g:292:45: (iv_ruleTerm= ruleTerm EOF )
            // InternalFeatureModel.g:293:2: iv_ruleTerm= ruleTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTerm=ruleTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTerm"


    // $ANTLR start "ruleTerm"
    // InternalFeatureModel.g:299:1: ruleTerm returns [EObject current=null] : ( () ( ( ruleEString ) ) ( (lv_type_2_0= ruleTermType ) ) ( (lv_operands_3_0= rulesecondTerm ) ) ) ;
    public final EObject ruleTerm() throws RecognitionException {
        EObject current = null;

        Enumerator lv_type_2_0 = null;

        EObject lv_operands_3_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:305:2: ( ( () ( ( ruleEString ) ) ( (lv_type_2_0= ruleTermType ) ) ( (lv_operands_3_0= rulesecondTerm ) ) ) )
            // InternalFeatureModel.g:306:2: ( () ( ( ruleEString ) ) ( (lv_type_2_0= ruleTermType ) ) ( (lv_operands_3_0= rulesecondTerm ) ) )
            {
            // InternalFeatureModel.g:306:2: ( () ( ( ruleEString ) ) ( (lv_type_2_0= ruleTermType ) ) ( (lv_operands_3_0= rulesecondTerm ) ) )
            // InternalFeatureModel.g:307:3: () ( ( ruleEString ) ) ( (lv_type_2_0= ruleTermType ) ) ( (lv_operands_3_0= rulesecondTerm ) )
            {
            // InternalFeatureModel.g:307:3: ()
            // InternalFeatureModel.g:308:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getTermAccess().getTermAction_0(),
              					current);
              			
            }

            }

            // InternalFeatureModel.g:314:3: ( ( ruleEString ) )
            // InternalFeatureModel.g:315:4: ( ruleEString )
            {
            // InternalFeatureModel.g:315:4: ( ruleEString )
            // InternalFeatureModel.g:316:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTermRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermAccess().getFeatureFeatureCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFeatureModel.g:330:3: ( (lv_type_2_0= ruleTermType ) )
            // InternalFeatureModel.g:331:4: (lv_type_2_0= ruleTermType )
            {
            // InternalFeatureModel.g:331:4: (lv_type_2_0= ruleTermType )
            // InternalFeatureModel.g:332:5: lv_type_2_0= ruleTermType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermAccess().getTypeTermTypeEnumRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_6);
            lv_type_2_0=ruleTermType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTermRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"eu.coresense.variability.FeatureModel.TermType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFeatureModel.g:349:3: ( (lv_operands_3_0= rulesecondTerm ) )
            // InternalFeatureModel.g:350:4: (lv_operands_3_0= rulesecondTerm )
            {
            // InternalFeatureModel.g:350:4: (lv_operands_3_0= rulesecondTerm )
            // InternalFeatureModel.g:351:5: lv_operands_3_0= rulesecondTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermAccess().getOperandsSecondTermParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_operands_3_0=rulesecondTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTermRule());
              					}
              					add(
              						current,
              						"operands",
              						lv_operands_3_0,
              						"eu.coresense.variability.FeatureModel.secondTerm");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTerm"


    // $ANTLR start "entryRulesecondTerm"
    // InternalFeatureModel.g:372:1: entryRulesecondTerm returns [EObject current=null] : iv_rulesecondTerm= rulesecondTerm EOF ;
    public final EObject entryRulesecondTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesecondTerm = null;


        try {
            // InternalFeatureModel.g:372:51: (iv_rulesecondTerm= rulesecondTerm EOF )
            // InternalFeatureModel.g:373:2: iv_rulesecondTerm= rulesecondTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSecondTermRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulesecondTerm=rulesecondTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulesecondTerm; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesecondTerm"


    // $ANTLR start "rulesecondTerm"
    // InternalFeatureModel.g:379:1: rulesecondTerm returns [EObject current=null] : ( () ( ( ruleEString ) ) ) ;
    public final EObject rulesecondTerm() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalFeatureModel.g:385:2: ( ( () ( ( ruleEString ) ) ) )
            // InternalFeatureModel.g:386:2: ( () ( ( ruleEString ) ) )
            {
            // InternalFeatureModel.g:386:2: ( () ( ( ruleEString ) ) )
            // InternalFeatureModel.g:387:3: () ( ( ruleEString ) )
            {
            // InternalFeatureModel.g:387:3: ()
            // InternalFeatureModel.g:388:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getSecondTermAccess().getTermAction_0(),
              					current);
              			
            }

            }

            // InternalFeatureModel.g:394:3: ( ( ruleEString ) )
            // InternalFeatureModel.g:395:4: ( ruleEString )
            {
            // InternalFeatureModel.g:395:4: ( ruleEString )
            // InternalFeatureModel.g:396:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSecondTermRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSecondTermAccess().getFeatureFeatureCrossReference_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesecondTerm"


    // $ANTLR start "entryRuleFeature_Impl"
    // InternalFeatureModel.g:414:1: entryRuleFeature_Impl returns [EObject current=null] : iv_ruleFeature_Impl= ruleFeature_Impl EOF ;
    public final EObject entryRuleFeature_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature_Impl = null;


        try {
            // InternalFeatureModel.g:414:53: (iv_ruleFeature_Impl= ruleFeature_Impl EOF )
            // InternalFeatureModel.g:415:2: iv_ruleFeature_Impl= ruleFeature_Impl EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFeature_ImplRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFeature_Impl=ruleFeature_Impl();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFeature_Impl; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature_Impl"


    // $ANTLR start "ruleFeature_Impl"
    // InternalFeatureModel.g:421:1: ruleFeature_Impl returns [EObject current=null] : ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleFeature_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mandatory_1_0=null;
        Token otherlv_2=null;
        Token lv_selected_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_id_7_0 = null;

        EObject lv_children_10_0 = null;

        EObject lv_children_12_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:427:2: ( ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) )
            // InternalFeatureModel.g:428:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            {
            // InternalFeatureModel.g:428:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            // InternalFeatureModel.g:429:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            {
            // InternalFeatureModel.g:429:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFeatureModel.g:430:4: (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    {
                    // InternalFeatureModel.g:430:4: (otherlv_0= 'mandatory' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==17) ) {
                        int LA3_1 = input.LA(2);

                        if ( (LA3_1==17) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalFeatureModel.g:431:5: otherlv_0= 'mandatory'
                            {
                            otherlv_0=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getFeature_ImplAccess().getMandatoryKeyword_0_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:436:4: ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    // InternalFeatureModel.g:437:5: ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalFeatureModel.g:441:5: (lv_mandatory_1_0= 'mandatory' )
                    // InternalFeatureModel.g:442:6: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,17,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_mandatory_1_0, grammarAccess.getFeature_ImplAccess().getMandatoryMandatoryKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFeature_ImplRule());
                      						}
                      						setWithLastConsumed(current, "mandatory", lv_mandatory_1_0 != null, "mandatory");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalFeatureModel.g:455:3: ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureModel.g:456:4: (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    {
                    // InternalFeatureModel.g:456:4: (otherlv_2= 'selected' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==18) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==18) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalFeatureModel.g:457:5: otherlv_2= 'selected'
                            {
                            otherlv_2=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getFeature_ImplAccess().getSelectedKeyword_1_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:462:4: ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    // InternalFeatureModel.g:463:5: ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' )
                    {
                    // InternalFeatureModel.g:467:5: (lv_selected_3_0= 'selected' )
                    // InternalFeatureModel.g:468:6: lv_selected_3_0= 'selected'
                    {
                    lv_selected_3_0=(Token)match(input,18,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_selected_3_0, grammarAccess.getFeature_ImplAccess().getSelectedSelectedKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getFeature_ImplRule());
                      						}
                      						setWithLastConsumed(current, "selected", lv_selected_3_0 != null, "selected");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFeature_ImplAccess().getFeatureKeyword_2());
              		
            }
            // InternalFeatureModel.g:485:3: ( (lv_name_5_0= ruleEString ) )
            // InternalFeatureModel.g:486:4: (lv_name_5_0= ruleEString )
            {
            // InternalFeatureModel.g:486:4: (lv_name_5_0= ruleEString )
            // InternalFeatureModel.g:487:5: lv_name_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_name_5_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_5_0,
              						"eu.coresense.variability.FeatureModel.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getFeature_ImplAccess().getIdKeyword_4());
              		
            }
            // InternalFeatureModel.g:508:3: ( (lv_id_7_0= ruleEString ) )
            // InternalFeatureModel.g:509:4: (lv_id_7_0= ruleEString )
            {
            // InternalFeatureModel.g:509:4: (lv_id_7_0= ruleEString )
            // InternalFeatureModel.g:510:5: lv_id_7_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeature_ImplAccess().getIdEStringParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_id_7_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_7_0,
              						"eu.coresense.variability.FeatureModel.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFeatureModel.g:527:3: (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureModel.g:528:4: otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getFeature_ImplAccess().getChildrenKeyword_6_0());
                      			
                    }
                    otherlv_9=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_6_1());
                      			
                    }
                    // InternalFeatureModel.g:536:4: ( (lv_children_10_0= ruleFeature ) )
                    // InternalFeatureModel.g:537:5: (lv_children_10_0= ruleFeature )
                    {
                    // InternalFeatureModel.g:537:5: (lv_children_10_0= ruleFeature )
                    // InternalFeatureModel.g:538:6: lv_children_10_0= ruleFeature
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_children_10_0=ruleFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
                      						}
                      						add(
                      							current,
                      							"children",
                      							lv_children_10_0,
                      							"eu.coresense.variability.FeatureModel.Feature");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalFeatureModel.g:555:4: (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==22) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFeatureModel.g:556:5: otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) )
                    	    {
                    	    otherlv_11=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getFeature_ImplAccess().getCommaKeyword_6_3_0());
                    	      				
                    	    }
                    	    // InternalFeatureModel.g:560:5: ( (lv_children_12_0= ruleFeature ) )
                    	    // InternalFeatureModel.g:561:6: (lv_children_12_0= ruleFeature )
                    	    {
                    	    // InternalFeatureModel.g:561:6: (lv_children_12_0= ruleFeature )
                    	    // InternalFeatureModel.g:562:7: lv_children_12_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_6_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_children_12_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"children",
                    	      								lv_children_12_0,
                    	      								"eu.coresense.variability.FeatureModel.Feature");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_6_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalFeatureModel.g:589:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFeatureModel.g:589:47: (iv_ruleEString= ruleEString EOF )
            // InternalFeatureModel.g:590:2: iv_ruleEString= ruleEString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEStringRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEString.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalFeatureModel.g:596:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFeatureModel.g:602:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFeatureModel.g:603:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFeatureModel.g:603:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalFeatureModel.g:604:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:612:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleAlternative"
    // InternalFeatureModel.g:623:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // InternalFeatureModel.g:623:52: (iv_ruleAlternative= ruleAlternative EOF )
            // InternalFeatureModel.g:624:2: iv_ruleAlternative= ruleAlternative EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlternativeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAlternative=ruleAlternative();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlternative; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternative"


    // $ANTLR start "ruleAlternative"
    // InternalFeatureModel.g:630:1: ruleAlternative returns [EObject current=null] : ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mandatory_1_0=null;
        Token otherlv_2=null;
        Token lv_selected_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_id_7_0 = null;

        EObject lv_children_10_0 = null;

        EObject lv_children_12_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:636:2: ( ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) )
            // InternalFeatureModel.g:637:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            {
            // InternalFeatureModel.g:637:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            // InternalFeatureModel.g:638:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            {
            // InternalFeatureModel.g:638:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureModel.g:639:4: (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    {
                    // InternalFeatureModel.g:639:4: (otherlv_0= 'mandatory' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==17) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==17) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalFeatureModel.g:640:5: otherlv_0= 'mandatory'
                            {
                            otherlv_0=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getAlternativeAccess().getMandatoryKeyword_0_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:645:4: ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    // InternalFeatureModel.g:646:5: ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalFeatureModel.g:650:5: (lv_mandatory_1_0= 'mandatory' )
                    // InternalFeatureModel.g:651:6: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,17,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_mandatory_1_0, grammarAccess.getAlternativeAccess().getMandatoryMandatoryKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAlternativeRule());
                      						}
                      						setWithLastConsumed(current, "mandatory", lv_mandatory_1_0 != null, "mandatory");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalFeatureModel.g:664:3: ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureModel.g:665:4: (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    {
                    // InternalFeatureModel.g:665:4: (otherlv_2= 'selected' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==18) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==18) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalFeatureModel.g:666:5: otherlv_2= 'selected'
                            {
                            otherlv_2=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getAlternativeAccess().getSelectedKeyword_1_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:671:4: ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    // InternalFeatureModel.g:672:5: ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' )
                    {
                    // InternalFeatureModel.g:676:5: (lv_selected_3_0= 'selected' )
                    // InternalFeatureModel.g:677:6: lv_selected_3_0= 'selected'
                    {
                    lv_selected_3_0=(Token)match(input,18,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_selected_3_0, grammarAccess.getAlternativeAccess().getSelectedSelectedKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAlternativeRule());
                      						}
                      						setWithLastConsumed(current, "selected", lv_selected_3_0 != null, "selected");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAlternativeAccess().getAlternativeKeyword_2());
              		
            }
            // InternalFeatureModel.g:694:3: ( (lv_name_5_0= ruleEString ) )
            // InternalFeatureModel.g:695:4: (lv_name_5_0= ruleEString )
            {
            // InternalFeatureModel.g:695:4: (lv_name_5_0= ruleEString )
            // InternalFeatureModel.g:696:5: lv_name_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAlternativeAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_name_5_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAlternativeRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_5_0,
              						"eu.coresense.variability.FeatureModel.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getAlternativeAccess().getIdKeyword_4());
              		
            }
            // InternalFeatureModel.g:717:3: ( (lv_id_7_0= ruleEString ) )
            // InternalFeatureModel.g:718:4: (lv_id_7_0= ruleEString )
            {
            // InternalFeatureModel.g:718:4: (lv_id_7_0= ruleEString )
            // InternalFeatureModel.g:719:5: lv_id_7_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAlternativeAccess().getIdEStringParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_id_7_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAlternativeRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_7_0,
              						"eu.coresense.variability.FeatureModel.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFeatureModel.g:736:3: (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFeatureModel.g:737:4: otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getAlternativeAccess().getChildrenKeyword_6_0());
                      			
                    }
                    otherlv_9=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_6_1());
                      			
                    }
                    // InternalFeatureModel.g:745:4: ( (lv_children_10_0= ruleFeature ) )
                    // InternalFeatureModel.g:746:5: (lv_children_10_0= ruleFeature )
                    {
                    // InternalFeatureModel.g:746:5: (lv_children_10_0= ruleFeature )
                    // InternalFeatureModel.g:747:6: lv_children_10_0= ruleFeature
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_children_10_0=ruleFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAlternativeRule());
                      						}
                      						add(
                      							current,
                      							"children",
                      							lv_children_10_0,
                      							"eu.coresense.variability.FeatureModel.Feature");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalFeatureModel.g:764:4: (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==22) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalFeatureModel.g:765:5: otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) )
                    	    {
                    	    otherlv_11=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getAlternativeAccess().getCommaKeyword_6_3_0());
                    	      				
                    	    }
                    	    // InternalFeatureModel.g:769:5: ( (lv_children_12_0= ruleFeature ) )
                    	    // InternalFeatureModel.g:770:6: (lv_children_12_0= ruleFeature )
                    	    {
                    	    // InternalFeatureModel.g:770:6: (lv_children_12_0= ruleFeature )
                    	    // InternalFeatureModel.g:771:7: lv_children_12_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_6_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_children_12_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAlternativeRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"children",
                    	      								lv_children_12_0,
                    	      								"eu.coresense.variability.FeatureModel.Feature");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_6_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternative"


    // $ANTLR start "entryRuleOrGroup"
    // InternalFeatureModel.g:798:1: entryRuleOrGroup returns [EObject current=null] : iv_ruleOrGroup= ruleOrGroup EOF ;
    public final EObject entryRuleOrGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrGroup = null;


        try {
            // InternalFeatureModel.g:798:48: (iv_ruleOrGroup= ruleOrGroup EOF )
            // InternalFeatureModel.g:799:2: iv_ruleOrGroup= ruleOrGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrGroupRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOrGroup=ruleOrGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrGroup; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrGroup"


    // $ANTLR start "ruleOrGroup"
    // InternalFeatureModel.g:805:1: ruleOrGroup returns [EObject current=null] : ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) ;
    public final EObject ruleOrGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mandatory_1_0=null;
        Token otherlv_2=null;
        Token lv_selected_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        AntlrDatatypeRuleToken lv_id_7_0 = null;

        EObject lv_children_10_0 = null;

        EObject lv_children_12_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:811:2: ( ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )? ) )
            // InternalFeatureModel.g:812:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            {
            // InternalFeatureModel.g:812:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )? )
            // InternalFeatureModel.g:813:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            {
            // InternalFeatureModel.g:813:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFeatureModel.g:814:4: (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    {
                    // InternalFeatureModel.g:814:4: (otherlv_0= 'mandatory' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==17) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==17) ) {
                            alt16=1;
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalFeatureModel.g:815:5: otherlv_0= 'mandatory'
                            {
                            otherlv_0=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getOrGroupAccess().getMandatoryKeyword_0_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:820:4: ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    // InternalFeatureModel.g:821:5: ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalFeatureModel.g:825:5: (lv_mandatory_1_0= 'mandatory' )
                    // InternalFeatureModel.g:826:6: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,17,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_mandatory_1_0, grammarAccess.getOrGroupAccess().getMandatoryMandatoryKeyword_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOrGroupRule());
                      						}
                      						setWithLastConsumed(current, "mandatory", lv_mandatory_1_0 != null, "mandatory");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalFeatureModel.g:839:3: ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==18) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFeatureModel.g:840:4: (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    {
                    // InternalFeatureModel.g:840:4: (otherlv_2= 'selected' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==18) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==18) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalFeatureModel.g:841:5: otherlv_2= 'selected'
                            {
                            otherlv_2=(Token)match(input,18,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getOrGroupAccess().getSelectedKeyword_1_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:846:4: ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    // InternalFeatureModel.g:847:5: ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' )
                    {
                    // InternalFeatureModel.g:851:5: (lv_selected_3_0= 'selected' )
                    // InternalFeatureModel.g:852:6: lv_selected_3_0= 'selected'
                    {
                    lv_selected_3_0=(Token)match(input,18,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_selected_3_0, grammarAccess.getOrGroupAccess().getSelectedSelectedKeyword_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getOrGroupRule());
                      						}
                      						setWithLastConsumed(current, "selected", lv_selected_3_0 != null, "selected");
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getOrGroupAccess().getOrGroupKeyword_2());
              		
            }
            // InternalFeatureModel.g:869:3: ( (lv_name_5_0= ruleEString ) )
            // InternalFeatureModel.g:870:4: (lv_name_5_0= ruleEString )
            {
            // InternalFeatureModel.g:870:4: (lv_name_5_0= ruleEString )
            // InternalFeatureModel.g:871:5: lv_name_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrGroupAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_name_5_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrGroupRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_5_0,
              						"eu.coresense.variability.FeatureModel.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getOrGroupAccess().getIdKeyword_4());
              		
            }
            // InternalFeatureModel.g:892:3: ( (lv_id_7_0= ruleEString ) )
            // InternalFeatureModel.g:893:4: (lv_id_7_0= ruleEString )
            {
            // InternalFeatureModel.g:893:4: (lv_id_7_0= ruleEString )
            // InternalFeatureModel.g:894:5: lv_id_7_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrGroupAccess().getIdEStringParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_id_7_0=ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getOrGroupRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_7_0,
              						"eu.coresense.variability.FeatureModel.EString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalFeatureModel.g:911:3: (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFeatureModel.g:912:4: otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleFeature ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getOrGroupAccess().getChildrenKeyword_6_0());
                      			
                    }
                    otherlv_9=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_6_1());
                      			
                    }
                    // InternalFeatureModel.g:920:4: ( (lv_children_10_0= ruleFeature ) )
                    // InternalFeatureModel.g:921:5: (lv_children_10_0= ruleFeature )
                    {
                    // InternalFeatureModel.g:921:5: (lv_children_10_0= ruleFeature )
                    // InternalFeatureModel.g:922:6: lv_children_10_0= ruleFeature
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_6_2_0());
                      					
                    }
                    pushFollow(FOLLOW_18);
                    lv_children_10_0=ruleFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOrGroupRule());
                      						}
                      						add(
                      							current,
                      							"children",
                      							lv_children_10_0,
                      							"eu.coresense.variability.FeatureModel.Feature");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalFeatureModel.g:939:4: (otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==22) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalFeatureModel.g:940:5: otherlv_11= ',' ( (lv_children_12_0= ruleFeature ) )
                    	    {
                    	    otherlv_11=(Token)match(input,22,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_11, grammarAccess.getOrGroupAccess().getCommaKeyword_6_3_0());
                    	      				
                    	    }
                    	    // InternalFeatureModel.g:944:5: ( (lv_children_12_0= ruleFeature ) )
                    	    // InternalFeatureModel.g:945:6: (lv_children_12_0= ruleFeature )
                    	    {
                    	    // InternalFeatureModel.g:945:6: (lv_children_12_0= ruleFeature )
                    	    // InternalFeatureModel.g:946:7: lv_children_12_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_6_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_18);
                    	    lv_children_12_0=ruleFeature();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getOrGroupRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"children",
                    	      								lv_children_12_0,
                    	      								"eu.coresense.variability.FeatureModel.Feature");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_6_4());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrGroup"


    // $ANTLR start "ruleTermType"
    // InternalFeatureModel.g:973:1: ruleTermType returns [Enumerator current=null] : ( (enumLiteral_0= 'not' ) | (enumLiteral_1= 'equiv' ) | (enumLiteral_2= 'excludes' ) | (enumLiteral_3= 'implies' ) | (enumLiteral_4= 'and' ) | (enumLiteral_5= 'or' ) | (enumLiteral_6= 'xor' ) | (enumLiteral_7= 'feature' ) ) ;
    public final Enumerator ruleTermType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;


        	enterRule();

        try {
            // InternalFeatureModel.g:979:2: ( ( (enumLiteral_0= 'not' ) | (enumLiteral_1= 'equiv' ) | (enumLiteral_2= 'excludes' ) | (enumLiteral_3= 'implies' ) | (enumLiteral_4= 'and' ) | (enumLiteral_5= 'or' ) | (enumLiteral_6= 'xor' ) | (enumLiteral_7= 'feature' ) ) )
            // InternalFeatureModel.g:980:2: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= 'equiv' ) | (enumLiteral_2= 'excludes' ) | (enumLiteral_3= 'implies' ) | (enumLiteral_4= 'and' ) | (enumLiteral_5= 'or' ) | (enumLiteral_6= 'xor' ) | (enumLiteral_7= 'feature' ) )
            {
            // InternalFeatureModel.g:980:2: ( (enumLiteral_0= 'not' ) | (enumLiteral_1= 'equiv' ) | (enumLiteral_2= 'excludes' ) | (enumLiteral_3= 'implies' ) | (enumLiteral_4= 'and' ) | (enumLiteral_5= 'or' ) | (enumLiteral_6= 'xor' ) | (enumLiteral_7= 'feature' ) )
            int alt22=8;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt22=1;
                }
                break;
            case 26:
                {
                alt22=2;
                }
                break;
            case 27:
                {
                alt22=3;
                }
                break;
            case 28:
                {
                alt22=4;
                }
                break;
            case 29:
                {
                alt22=5;
                }
                break;
            case 30:
                {
                alt22=6;
                }
                break;
            case 31:
                {
                alt22=7;
                }
                break;
            case 32:
                {
                alt22=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalFeatureModel.g:981:3: (enumLiteral_0= 'not' )
                    {
                    // InternalFeatureModel.g:981:3: (enumLiteral_0= 'not' )
                    // InternalFeatureModel.g:982:4: enumLiteral_0= 'not'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTermTypeAccess().getNotEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTermTypeAccess().getNotEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:989:3: (enumLiteral_1= 'equiv' )
                    {
                    // InternalFeatureModel.g:989:3: (enumLiteral_1= 'equiv' )
                    // InternalFeatureModel.g:990:4: enumLiteral_1= 'equiv'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTermTypeAccess().getEquivEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTermTypeAccess().getEquivEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalFeatureModel.g:997:3: (enumLiteral_2= 'excludes' )
                    {
                    // InternalFeatureModel.g:997:3: (enumLiteral_2= 'excludes' )
                    // InternalFeatureModel.g:998:4: enumLiteral_2= 'excludes'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTermTypeAccess().getExcludesEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTermTypeAccess().getExcludesEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalFeatureModel.g:1005:3: (enumLiteral_3= 'implies' )
                    {
                    // InternalFeatureModel.g:1005:3: (enumLiteral_3= 'implies' )
                    // InternalFeatureModel.g:1006:4: enumLiteral_3= 'implies'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTermTypeAccess().getImpliesEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTermTypeAccess().getImpliesEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalFeatureModel.g:1013:3: (enumLiteral_4= 'and' )
                    {
                    // InternalFeatureModel.g:1013:3: (enumLiteral_4= 'and' )
                    // InternalFeatureModel.g:1014:4: enumLiteral_4= 'and'
                    {
                    enumLiteral_4=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTermTypeAccess().getAndEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getTermTypeAccess().getAndEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalFeatureModel.g:1021:3: (enumLiteral_5= 'or' )
                    {
                    // InternalFeatureModel.g:1021:3: (enumLiteral_5= 'or' )
                    // InternalFeatureModel.g:1022:4: enumLiteral_5= 'or'
                    {
                    enumLiteral_5=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTermTypeAccess().getOrEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getTermTypeAccess().getOrEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalFeatureModel.g:1029:3: (enumLiteral_6= 'xor' )
                    {
                    // InternalFeatureModel.g:1029:3: (enumLiteral_6= 'xor' )
                    // InternalFeatureModel.g:1030:4: enumLiteral_6= 'xor'
                    {
                    enumLiteral_6=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTermTypeAccess().getXorEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getTermTypeAccess().getXorEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalFeatureModel.g:1037:3: (enumLiteral_7= 'feature' )
                    {
                    // InternalFeatureModel.g:1037:3: (enumLiteral_7= 'feature' )
                    // InternalFeatureModel.g:1038:4: enumLiteral_7= 'feature'
                    {
                    enumLiteral_7=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTermTypeAccess().getFeatureEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getTermTypeAccess().getFeatureEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000018E0000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000001FE000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001040000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});

}