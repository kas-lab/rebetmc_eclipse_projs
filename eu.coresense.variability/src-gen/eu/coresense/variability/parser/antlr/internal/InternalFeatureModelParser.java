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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'feature_model'", "'{'", "'}'", "'name'", "'root'", "'crossTreeConstraints'", "'BasicConstraint'", "'type'", "'leftFeature'", "'rightFeature'", "'mandatory'", "'selected'", "'Feature'", "'children'", "','", "'Alternative'", "'OrGroup'", "'REQUIRES'", "'EXCLUDES'"
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
    // InternalFeatureModel.g:122:1: ruleFeatureModel returns [EObject current=null] : (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' otherlv_5= '{' ( (lv_crossTreeConstraints_6_0= ruleBasicConstraint ) )* otherlv_7= '}' ) ;
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
            // InternalFeatureModel.g:128:2: ( (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' otherlv_5= '{' ( (lv_crossTreeConstraints_6_0= ruleBasicConstraint ) )* otherlv_7= '}' ) )
            // InternalFeatureModel.g:129:2: (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' otherlv_5= '{' ( (lv_crossTreeConstraints_6_0= ruleBasicConstraint ) )* otherlv_7= '}' )
            {
            // InternalFeatureModel.g:129:2: (otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' otherlv_5= '{' ( (lv_crossTreeConstraints_6_0= ruleBasicConstraint ) )* otherlv_7= '}' )
            // InternalFeatureModel.g:130:3: otherlv_0= 'name' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'root' ( (lv_root_3_0= ruleFeature ) ) otherlv_4= 'crossTreeConstraints' otherlv_5= '{' ( (lv_crossTreeConstraints_6_0= ruleBasicConstraint ) )* otherlv_7= '}'
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
            // InternalFeatureModel.g:184:3: ( (lv_crossTreeConstraints_6_0= ruleBasicConstraint ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFeatureModel.g:185:4: (lv_crossTreeConstraints_6_0= ruleBasicConstraint )
            	    {
            	    // InternalFeatureModel.g:185:4: (lv_crossTreeConstraints_6_0= ruleBasicConstraint )
            	    // InternalFeatureModel.g:186:5: lv_crossTreeConstraints_6_0= ruleBasicConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getFeatureModelAccess().getCrossTreeConstraintsBasicConstraintParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_crossTreeConstraints_6_0=ruleBasicConstraint();

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
            	      						"eu.coresense.variability.FeatureModel.BasicConstraint");
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


    // $ANTLR start "entryRuleBasicConstraint"
    // InternalFeatureModel.g:211:1: entryRuleBasicConstraint returns [EObject current=null] : iv_ruleBasicConstraint= ruleBasicConstraint EOF ;
    public final EObject entryRuleBasicConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBasicConstraint = null;


        try {
            // InternalFeatureModel.g:211:56: (iv_ruleBasicConstraint= ruleBasicConstraint EOF )
            // InternalFeatureModel.g:212:2: iv_ruleBasicConstraint= ruleBasicConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBasicConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBasicConstraint=ruleBasicConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBasicConstraint; 
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
    // $ANTLR end "entryRuleBasicConstraint"


    // $ANTLR start "ruleBasicConstraint"
    // InternalFeatureModel.g:218:1: ruleBasicConstraint returns [EObject current=null] : (otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'leftFeature' ( ( ruleEString ) ) otherlv_6= 'rightFeature' ( ( ruleEString ) ) otherlv_8= '}' ) ;
    public final EObject ruleBasicConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:224:2: ( (otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'leftFeature' ( ( ruleEString ) ) otherlv_6= 'rightFeature' ( ( ruleEString ) ) otherlv_8= '}' ) )
            // InternalFeatureModel.g:225:2: (otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'leftFeature' ( ( ruleEString ) ) otherlv_6= 'rightFeature' ( ( ruleEString ) ) otherlv_8= '}' )
            {
            // InternalFeatureModel.g:225:2: (otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'leftFeature' ( ( ruleEString ) ) otherlv_6= 'rightFeature' ( ( ruleEString ) ) otherlv_8= '}' )
            // InternalFeatureModel.g:226:3: otherlv_0= 'BasicConstraint' otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= ruleCrossTreeConstraintType ) ) otherlv_4= 'leftFeature' ( ( ruleEString ) ) otherlv_6= 'rightFeature' ( ( ruleEString ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getBasicConstraintAccess().getBasicConstraintKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,12,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getBasicConstraintAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getBasicConstraintAccess().getTypeKeyword_2());
              		
            }
            // InternalFeatureModel.g:238:3: ( (lv_type_3_0= ruleCrossTreeConstraintType ) )
            // InternalFeatureModel.g:239:4: (lv_type_3_0= ruleCrossTreeConstraintType )
            {
            // InternalFeatureModel.g:239:4: (lv_type_3_0= ruleCrossTreeConstraintType )
            // InternalFeatureModel.g:240:5: lv_type_3_0= ruleCrossTreeConstraintType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBasicConstraintAccess().getTypeCrossTreeConstraintTypeEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_type_3_0=ruleCrossTreeConstraintType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBasicConstraintRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"eu.coresense.variability.FeatureModel.CrossTreeConstraintType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getBasicConstraintAccess().getLeftFeatureKeyword_4());
              		
            }
            // InternalFeatureModel.g:261:3: ( ( ruleEString ) )
            // InternalFeatureModel.g:262:4: ( ruleEString )
            {
            // InternalFeatureModel.g:262:4: ( ruleEString )
            // InternalFeatureModel.g:263:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBasicConstraintRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBasicConstraintAccess().getLeftFeatureFeatureCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getBasicConstraintAccess().getRightFeatureKeyword_6());
              		
            }
            // InternalFeatureModel.g:281:3: ( ( ruleEString ) )
            // InternalFeatureModel.g:282:4: ( ruleEString )
            {
            // InternalFeatureModel.g:282:4: ( ruleEString )
            // InternalFeatureModel.g:283:5: ruleEString
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getBasicConstraintRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBasicConstraintAccess().getRightFeatureFeatureCrossReference_7_0());
              				
            }
            pushFollow(FOLLOW_5);
            ruleEString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getBasicConstraintAccess().getRightCurlyBracketKeyword_8());
              		
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
    // $ANTLR end "ruleBasicConstraint"


    // $ANTLR start "entryRuleFeature"
    // InternalFeatureModel.g:305:1: entryRuleFeature returns [EObject current=null] : iv_ruleFeature= ruleFeature EOF ;
    public final EObject entryRuleFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature = null;


        try {
            // InternalFeatureModel.g:305:48: (iv_ruleFeature= ruleFeature EOF )
            // InternalFeatureModel.g:306:2: iv_ruleFeature= ruleFeature EOF
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
    // InternalFeatureModel.g:312:1: ruleFeature returns [EObject current=null] : (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup ) ;
    public final EObject ruleFeature() throws RecognitionException {
        EObject current = null;

        EObject this_Feature_Impl_0 = null;

        EObject this_Alternative_1 = null;

        EObject this_OrGroup_2 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:318:2: ( (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup ) )
            // InternalFeatureModel.g:319:2: (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup )
            {
            // InternalFeatureModel.g:319:2: (this_Feature_Impl_0= ruleFeature_Impl | this_Alternative_1= ruleAlternative | this_OrGroup_2= ruleOrGroup )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    switch ( input.LA(3) ) {
                    case 22:
                        {
                        switch ( input.LA(4) ) {
                        case 26:
                            {
                            alt2=2;
                            }
                            break;
                        case 27:
                            {
                            alt2=3;
                            }
                            break;
                        case 23:
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
                    case 26:
                        {
                        alt2=2;
                        }
                        break;
                    case 27:
                        {
                        alt2=3;
                        }
                        break;
                    case 23:
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
                case 26:
                    {
                    alt2=2;
                    }
                    break;
                case 27:
                    {
                    alt2=3;
                    }
                    break;
                case 23:
                    {
                    alt2=1;
                    }
                    break;
                case 21:
                    {
                    switch ( input.LA(3) ) {
                    case 22:
                        {
                        switch ( input.LA(4) ) {
                        case 22:
                            {
                            switch ( input.LA(5) ) {
                            case 26:
                                {
                                alt2=2;
                                }
                                break;
                            case 27:
                                {
                                alt2=3;
                                }
                                break;
                            case 23:
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
                        case 26:
                            {
                            alt2=2;
                            }
                            break;
                        case 27:
                            {
                            alt2=3;
                            }
                            break;
                        case 23:
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
                    case 26:
                        {
                        alt2=2;
                        }
                        break;
                    case 27:
                        {
                        alt2=3;
                        }
                        break;
                    case 23:
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
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 22:
                {
                switch ( input.LA(2) ) {
                case 22:
                    {
                    switch ( input.LA(3) ) {
                    case 26:
                        {
                        alt2=2;
                        }
                        break;
                    case 27:
                        {
                        alt2=3;
                        }
                        break;
                    case 23:
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
                case 26:
                    {
                    alt2=2;
                    }
                    break;
                case 27:
                    {
                    alt2=3;
                    }
                    break;
                case 23:
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
            case 23:
                {
                alt2=1;
                }
                break;
            case 26:
                {
                alt2=2;
                }
                break;
            case 27:
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
                    // InternalFeatureModel.g:320:3: this_Feature_Impl_0= ruleFeature_Impl
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
                    // InternalFeatureModel.g:329:3: this_Alternative_1= ruleAlternative
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
                    // InternalFeatureModel.g:338:3: this_OrGroup_2= ruleOrGroup
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


    // $ANTLR start "entryRuleFeature_Impl"
    // InternalFeatureModel.g:350:1: entryRuleFeature_Impl returns [EObject current=null] : iv_ruleFeature_Impl= ruleFeature_Impl EOF ;
    public final EObject entryRuleFeature_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFeature_Impl = null;


        try {
            // InternalFeatureModel.g:350:53: (iv_ruleFeature_Impl= ruleFeature_Impl EOF )
            // InternalFeatureModel.g:351:2: iv_ruleFeature_Impl= ruleFeature_Impl EOF
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
    // InternalFeatureModel.g:357:1: ruleFeature_Impl returns [EObject current=null] : ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleFeature_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mandatory_1_0=null;
        Token otherlv_2=null;
        Token lv_selected_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_children_8_0 = null;

        EObject lv_children_10_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:363:2: ( ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )? ) )
            // InternalFeatureModel.g:364:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )? )
            {
            // InternalFeatureModel.g:364:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )? )
            // InternalFeatureModel.g:365:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Feature' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )?
            {
            // InternalFeatureModel.g:365:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFeatureModel.g:366:4: (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    {
                    // InternalFeatureModel.g:366:4: (otherlv_0= 'mandatory' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==21) ) {
                        int LA3_1 = input.LA(2);

                        if ( (LA3_1==21) ) {
                            alt3=1;
                        }
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalFeatureModel.g:367:5: otherlv_0= 'mandatory'
                            {
                            otherlv_0=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getFeature_ImplAccess().getMandatoryKeyword_0_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:372:4: ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    // InternalFeatureModel.g:373:5: ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalFeatureModel.g:377:5: (lv_mandatory_1_0= 'mandatory' )
                    // InternalFeatureModel.g:378:6: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,21,FOLLOW_16); if (state.failed) return current;
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

            // InternalFeatureModel.g:391:3: ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==22) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalFeatureModel.g:392:4: (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    {
                    // InternalFeatureModel.g:392:4: (otherlv_2= 'selected' )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==22) ) {
                        int LA5_1 = input.LA(2);

                        if ( (LA5_1==22) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalFeatureModel.g:393:5: otherlv_2= 'selected'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getFeature_ImplAccess().getSelectedKeyword_1_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:398:4: ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    // InternalFeatureModel.g:399:5: ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' )
                    {
                    // InternalFeatureModel.g:403:5: (lv_selected_3_0= 'selected' )
                    // InternalFeatureModel.g:404:6: lv_selected_3_0= 'selected'
                    {
                    lv_selected_3_0=(Token)match(input,22,FOLLOW_18); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getFeature_ImplAccess().getFeatureKeyword_2());
              		
            }
            // InternalFeatureModel.g:421:3: ( (lv_name_5_0= ruleEString ) )
            // InternalFeatureModel.g:422:4: (lv_name_5_0= ruleEString )
            {
            // InternalFeatureModel.g:422:4: (lv_name_5_0= ruleEString )
            // InternalFeatureModel.g:423:5: lv_name_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFeature_ImplAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalFeatureModel.g:440:3: (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalFeatureModel.g:441:4: otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getFeature_ImplAccess().getChildrenKeyword_4_0());
                      			
                    }
                    otherlv_7=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getFeature_ImplAccess().getLeftCurlyBracketKeyword_4_1());
                      			
                    }
                    // InternalFeatureModel.g:449:4: ( (lv_children_8_0= ruleFeature ) )
                    // InternalFeatureModel.g:450:5: (lv_children_8_0= ruleFeature )
                    {
                    // InternalFeatureModel.g:450:5: (lv_children_8_0= ruleFeature )
                    // InternalFeatureModel.g:451:6: lv_children_8_0= ruleFeature
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_children_8_0=ruleFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getFeature_ImplRule());
                      						}
                      						add(
                      							current,
                      							"children",
                      							lv_children_8_0,
                      							"eu.coresense.variability.FeatureModel.Feature");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalFeatureModel.g:468:4: (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==25) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalFeatureModel.g:469:5: otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) )
                    	    {
                    	    otherlv_9=(Token)match(input,25,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getFeature_ImplAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalFeatureModel.g:473:5: ( (lv_children_10_0= ruleFeature ) )
                    	    // InternalFeatureModel.g:474:6: (lv_children_10_0= ruleFeature )
                    	    {
                    	    // InternalFeatureModel.g:474:6: (lv_children_10_0= ruleFeature )
                    	    // InternalFeatureModel.g:475:7: lv_children_10_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getFeature_ImplAccess().getChildrenFeatureParserRuleCall_4_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getFeature_ImplAccess().getRightCurlyBracketKeyword_4_4());
                      			
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
    // InternalFeatureModel.g:502:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalFeatureModel.g:502:47: (iv_ruleEString= ruleEString EOF )
            // InternalFeatureModel.g:503:2: iv_ruleEString= ruleEString EOF
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
    // InternalFeatureModel.g:509:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalFeatureModel.g:515:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalFeatureModel.g:516:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalFeatureModel.g:516:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalFeatureModel.g:517:3: this_STRING_0= RULE_STRING
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
                    // InternalFeatureModel.g:525:3: this_ID_1= RULE_ID
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
    // InternalFeatureModel.g:536:1: entryRuleAlternative returns [EObject current=null] : iv_ruleAlternative= ruleAlternative EOF ;
    public final EObject entryRuleAlternative() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternative = null;


        try {
            // InternalFeatureModel.g:536:52: (iv_ruleAlternative= ruleAlternative EOF )
            // InternalFeatureModel.g:537:2: iv_ruleAlternative= ruleAlternative EOF
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
    // InternalFeatureModel.g:543:1: ruleAlternative returns [EObject current=null] : ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleAlternative() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mandatory_1_0=null;
        Token otherlv_2=null;
        Token lv_selected_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_children_8_0 = null;

        EObject lv_children_10_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:549:2: ( ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )? ) )
            // InternalFeatureModel.g:550:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )? )
            {
            // InternalFeatureModel.g:550:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )? )
            // InternalFeatureModel.g:551:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'Alternative' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )?
            {
            // InternalFeatureModel.g:551:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalFeatureModel.g:552:4: (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    {
                    // InternalFeatureModel.g:552:4: (otherlv_0= 'mandatory' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==21) ) {
                        int LA10_1 = input.LA(2);

                        if ( (LA10_1==21) ) {
                            alt10=1;
                        }
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalFeatureModel.g:553:5: otherlv_0= 'mandatory'
                            {
                            otherlv_0=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getAlternativeAccess().getMandatoryKeyword_0_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:558:4: ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    // InternalFeatureModel.g:559:5: ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalFeatureModel.g:563:5: (lv_mandatory_1_0= 'mandatory' )
                    // InternalFeatureModel.g:564:6: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,21,FOLLOW_21); if (state.failed) return current;
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

            // InternalFeatureModel.g:577:3: ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalFeatureModel.g:578:4: (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    {
                    // InternalFeatureModel.g:578:4: (otherlv_2= 'selected' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==22) ) {
                        int LA12_1 = input.LA(2);

                        if ( (LA12_1==22) ) {
                            alt12=1;
                        }
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalFeatureModel.g:579:5: otherlv_2= 'selected'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getAlternativeAccess().getSelectedKeyword_1_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:584:4: ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    // InternalFeatureModel.g:585:5: ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' )
                    {
                    // InternalFeatureModel.g:589:5: (lv_selected_3_0= 'selected' )
                    // InternalFeatureModel.g:590:6: lv_selected_3_0= 'selected'
                    {
                    lv_selected_3_0=(Token)match(input,22,FOLLOW_22); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,26,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getAlternativeAccess().getAlternativeKeyword_2());
              		
            }
            // InternalFeatureModel.g:607:3: ( (lv_name_5_0= ruleEString ) )
            // InternalFeatureModel.g:608:4: (lv_name_5_0= ruleEString )
            {
            // InternalFeatureModel.g:608:4: (lv_name_5_0= ruleEString )
            // InternalFeatureModel.g:609:5: lv_name_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAlternativeAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalFeatureModel.g:626:3: (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalFeatureModel.g:627:4: otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getAlternativeAccess().getChildrenKeyword_4_0());
                      			
                    }
                    otherlv_7=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAlternativeAccess().getLeftCurlyBracketKeyword_4_1());
                      			
                    }
                    // InternalFeatureModel.g:635:4: ( (lv_children_8_0= ruleFeature ) )
                    // InternalFeatureModel.g:636:5: (lv_children_8_0= ruleFeature )
                    {
                    // InternalFeatureModel.g:636:5: (lv_children_8_0= ruleFeature )
                    // InternalFeatureModel.g:637:6: lv_children_8_0= ruleFeature
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_children_8_0=ruleFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAlternativeRule());
                      						}
                      						add(
                      							current,
                      							"children",
                      							lv_children_8_0,
                      							"eu.coresense.variability.FeatureModel.Feature");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalFeatureModel.g:654:4: (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==25) ) {
                            alt14=1;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalFeatureModel.g:655:5: otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) )
                    	    {
                    	    otherlv_9=(Token)match(input,25,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getAlternativeAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalFeatureModel.g:659:5: ( (lv_children_10_0= ruleFeature ) )
                    	    // InternalFeatureModel.g:660:6: (lv_children_10_0= ruleFeature )
                    	    {
                    	    // InternalFeatureModel.g:660:6: (lv_children_10_0= ruleFeature )
                    	    // InternalFeatureModel.g:661:7: lv_children_10_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAlternativeAccess().getChildrenFeatureParserRuleCall_4_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getAlternativeAccess().getRightCurlyBracketKeyword_4_4());
                      			
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
    // InternalFeatureModel.g:688:1: entryRuleOrGroup returns [EObject current=null] : iv_ruleOrGroup= ruleOrGroup EOF ;
    public final EObject entryRuleOrGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrGroup = null;


        try {
            // InternalFeatureModel.g:688:48: (iv_ruleOrGroup= ruleOrGroup EOF )
            // InternalFeatureModel.g:689:2: iv_ruleOrGroup= ruleOrGroup EOF
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
    // InternalFeatureModel.g:695:1: ruleOrGroup returns [EObject current=null] : ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )? ) ;
    public final EObject ruleOrGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_mandatory_1_0=null;
        Token otherlv_2=null;
        Token lv_selected_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_5_0 = null;

        EObject lv_children_8_0 = null;

        EObject lv_children_10_0 = null;



        	enterRule();

        try {
            // InternalFeatureModel.g:701:2: ( ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )? ) )
            // InternalFeatureModel.g:702:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )? )
            {
            // InternalFeatureModel.g:702:2: ( ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )? )
            // InternalFeatureModel.g:703:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )? ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )? otherlv_4= 'OrGroup' ( (lv_name_5_0= ruleEString ) ) (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )?
            {
            // InternalFeatureModel.g:703:3: ( (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalFeatureModel.g:704:4: (otherlv_0= 'mandatory' )? ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    {
                    // InternalFeatureModel.g:704:4: (otherlv_0= 'mandatory' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==21) ) {
                        int LA16_1 = input.LA(2);

                        if ( (LA16_1==21) ) {
                            alt16=1;
                        }
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalFeatureModel.g:705:5: otherlv_0= 'mandatory'
                            {
                            otherlv_0=(Token)match(input,21,FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getOrGroupAccess().getMandatoryKeyword_0_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:710:4: ( ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' ) )
                    // InternalFeatureModel.g:711:5: ( ( 'mandatory' ) )=> (lv_mandatory_1_0= 'mandatory' )
                    {
                    // InternalFeatureModel.g:715:5: (lv_mandatory_1_0= 'mandatory' )
                    // InternalFeatureModel.g:716:6: lv_mandatory_1_0= 'mandatory'
                    {
                    lv_mandatory_1_0=(Token)match(input,21,FOLLOW_23); if (state.failed) return current;
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

            // InternalFeatureModel.g:729:3: ( (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalFeatureModel.g:730:4: (otherlv_2= 'selected' )? ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    {
                    // InternalFeatureModel.g:730:4: (otherlv_2= 'selected' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==22) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==22) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalFeatureModel.g:731:5: otherlv_2= 'selected'
                            {
                            otherlv_2=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getOrGroupAccess().getSelectedKeyword_1_0());
                              				
                            }

                            }
                            break;

                    }

                    // InternalFeatureModel.g:736:4: ( ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' ) )
                    // InternalFeatureModel.g:737:5: ( ( 'selected' ) )=> (lv_selected_3_0= 'selected' )
                    {
                    // InternalFeatureModel.g:741:5: (lv_selected_3_0= 'selected' )
                    // InternalFeatureModel.g:742:6: lv_selected_3_0= 'selected'
                    {
                    lv_selected_3_0=(Token)match(input,22,FOLLOW_24); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getOrGroupAccess().getOrGroupKeyword_2());
              		
            }
            // InternalFeatureModel.g:759:3: ( (lv_name_5_0= ruleEString ) )
            // InternalFeatureModel.g:760:4: (lv_name_5_0= ruleEString )
            {
            // InternalFeatureModel.g:760:4: (lv_name_5_0= ruleEString )
            // InternalFeatureModel.g:761:5: lv_name_5_0= ruleEString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getOrGroupAccess().getNameEStringParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_19);
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

            // InternalFeatureModel.g:778:3: (otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==24) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalFeatureModel.g:779:4: otherlv_6= 'children' otherlv_7= '{' ( (lv_children_8_0= ruleFeature ) ) (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getOrGroupAccess().getChildrenKeyword_4_0());
                      			
                    }
                    otherlv_7=(Token)match(input,12,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getOrGroupAccess().getLeftCurlyBracketKeyword_4_1());
                      			
                    }
                    // InternalFeatureModel.g:787:4: ( (lv_children_8_0= ruleFeature ) )
                    // InternalFeatureModel.g:788:5: (lv_children_8_0= ruleFeature )
                    {
                    // InternalFeatureModel.g:788:5: (lv_children_8_0= ruleFeature )
                    // InternalFeatureModel.g:789:6: lv_children_8_0= ruleFeature
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_20);
                    lv_children_8_0=ruleFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getOrGroupRule());
                      						}
                      						add(
                      							current,
                      							"children",
                      							lv_children_8_0,
                      							"eu.coresense.variability.FeatureModel.Feature");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalFeatureModel.g:806:4: (otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==25) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalFeatureModel.g:807:5: otherlv_9= ',' ( (lv_children_10_0= ruleFeature ) )
                    	    {
                    	    otherlv_9=(Token)match(input,25,FOLLOW_8); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_9, grammarAccess.getOrGroupAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalFeatureModel.g:811:5: ( (lv_children_10_0= ruleFeature ) )
                    	    // InternalFeatureModel.g:812:6: (lv_children_10_0= ruleFeature )
                    	    {
                    	    // InternalFeatureModel.g:812:6: (lv_children_10_0= ruleFeature )
                    	    // InternalFeatureModel.g:813:7: lv_children_10_0= ruleFeature
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getOrGroupAccess().getChildrenFeatureParserRuleCall_4_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_20);
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


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getOrGroupAccess().getRightCurlyBracketKeyword_4_4());
                      			
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


    // $ANTLR start "ruleCrossTreeConstraintType"
    // InternalFeatureModel.g:840:1: ruleCrossTreeConstraintType returns [Enumerator current=null] : ( (enumLiteral_0= 'REQUIRES' ) | (enumLiteral_1= 'EXCLUDES' ) ) ;
    public final Enumerator ruleCrossTreeConstraintType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalFeatureModel.g:846:2: ( ( (enumLiteral_0= 'REQUIRES' ) | (enumLiteral_1= 'EXCLUDES' ) ) )
            // InternalFeatureModel.g:847:2: ( (enumLiteral_0= 'REQUIRES' ) | (enumLiteral_1= 'EXCLUDES' ) )
            {
            // InternalFeatureModel.g:847:2: ( (enumLiteral_0= 'REQUIRES' ) | (enumLiteral_1= 'EXCLUDES' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==28) ) {
                alt22=1;
            }
            else if ( (LA22_0==29) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalFeatureModel.g:848:3: (enumLiteral_0= 'REQUIRES' )
                    {
                    // InternalFeatureModel.g:848:3: (enumLiteral_0= 'REQUIRES' )
                    // InternalFeatureModel.g:849:4: enumLiteral_0= 'REQUIRES'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCrossTreeConstraintTypeAccess().getREQUIRESEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getCrossTreeConstraintTypeAccess().getREQUIRESEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalFeatureModel.g:856:3: (enumLiteral_1= 'EXCLUDES' )
                    {
                    // InternalFeatureModel.g:856:3: (enumLiteral_1= 'EXCLUDES' )
                    // InternalFeatureModel.g:857:4: enumLiteral_1= 'EXCLUDES'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getCrossTreeConstraintTypeAccess().getEXCLUDESEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getCrossTreeConstraintTypeAccess().getEXCLUDESEnumLiteralDeclaration_1());
                      			
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
    // $ANTLR end "ruleCrossTreeConstraintType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000CE00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002002000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});

}