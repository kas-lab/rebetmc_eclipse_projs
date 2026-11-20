package eu.coresense.context.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.coresense.context.services.ContextModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalContextModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Meta_last_published", "Meta_has_published", "RelativeNamespace", "PrivateNamespace", "ContextVariable", "GlobalNamespace", "MissionRelated", "Request_kwargs", "Environmental", "Function_args", "Function_name", "ParameterAny", "Function_lib", "Goal_kwargs", "Meta_count", "Publisher", "Thresholds", "GraphName", "Float32_1", "Float64_1", "Default", "Duration", "Feedback", "Service_1", "String_2", "Uint16_1", "Uint32_1", "Uint64_1", "Boolean", "Integer", "Action_1", "Float32", "Float64", "Int16_1", "Int32_1", "Int64_1", "Message", "Origin", "Service", "Source", "Uint8_1", "Base64", "Double", "Header", "String", "Struct", "Action", "Bool_1", "Byte_1", "Cache_1", "Char_1", "Import", "Int8_1", "Length", "Period", "Result", "String_1", "Uint16", "Uint32", "Uint64", "Value_1", "Array", "Cache", "Int16", "Int32", "Int64", "Proxy", "Type_1", "Uint8", "Value", "Date", "List", "Bool", "Byte", "Char", "Goal", "Int8", "Name", "Node", "Time", "Type", "Any", "Ns_1", "LeftSquareBracketRightSquareBracket", "Ns", "Comma", "FullStop", "Colon", "Semicolon", "LeftSquareBracket", "RightSquareBracket", "S", "LeftCurlyBracket", "RightCurlyBracket", "RULE_INT", "RULE_DECIMAL", "RULE_DIGIT", "RULE_BINARY", "RULE_BOOLEAN", "RULE_DECINT", "RULE_DOUBLE", "RULE_DAY", "RULE_MONTH", "RULE_YEAR", "RULE_HOUR", "RULE_MIN_SEC", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_MESSAGE_ASIGMENT", "RULE_BEGIN", "RULE_END", "RULE_SL_COMMENT", "RULE_ROS_CONVENTION_A", "RULE_ROS_CONVENTION_PARAM", "RULE_ML_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
    public static final int Origin=41;
    public static final int Import=55;
    public static final int Float32_1=22;
    public static final int Node=82;
    public static final int RULE_DATE_TIME=110;
    public static final int Uint64_1=31;
    public static final int String=48;
    public static final int Int16=67;
    public static final int Float32=35;
    public static final int Goal=79;
    public static final int Bool=76;
    public static final int Uint16=61;
    public static final int Boolean=32;
    public static final int Uint8=72;
    public static final int RULE_ID=111;
    public static final int Goal_kwargs=17;
    public static final int RULE_DIGIT=100;
    public static final int GlobalNamespace=9;
    public static final int Int16_1=37;
    public static final int Header=47;
    public static final int Request_kwargs=11;
    public static final int RULE_INT=98;
    public static final int Byte=77;
    public static final int RULE_ML_COMMENT=119;
    public static final int Function_args=13;
    public static final int LeftSquareBracket=93;
    public static final int Base64=45;
    public static final int ContextVariable=8;
    public static final int Comma=89;
    public static final int RULE_MESSAGE_ASIGMENT=113;
    public static final int S=95;
    public static final int LeftSquareBracketRightSquareBracket=87;
    public static final int Int32=68;
    public static final int Char=78;
    public static final int RightCurlyBracket=97;
    public static final int RULE_DECINT=103;
    public static final int Uint32=62;
    public static final int FullStop=90;
    public static final int RULE_HOUR=108;
    public static final int Meta_count=18;
    public static final int Publisher=19;
    public static final int Int8=80;
    public static final int Default=24;
    public static final int Int8_1=56;
    public static final int Uint16_1=29;
    public static final int Semicolon=92;
    public static final int Type=84;
    public static final int Ns_1=86;
    public static final int Float64=36;
    public static final int Length=57;
    public static final int Function_name=14;
    public static final int Int32_1=38;
    public static final int RULE_BINARY=101;
    public static final int String_1=60;
    public static final int Meta_last_published=4;
    public static final int String_2=28;
    public static final int RULE_DAY=105;
    public static final int RULE_BEGIN=114;
    public static final int Function_lib=16;
    public static final int RULE_BOOLEAN=102;
    public static final int RelativeNamespace=6;
    public static final int RULE_YEAR=107;
    public static final int Result=59;
    public static final int Name=81;
    public static final int RULE_MIN_SEC=109;
    public static final int Char_1=54;
    public static final int ParameterAny=15;
    public static final int List=75;
    public static final int RightSquareBracket=94;
    public static final int PrivateNamespace=7;
    public static final int Environmental=12;
    public static final int GraphName=21;
    public static final int Thresholds=20;
    public static final int Byte_1=52;
    public static final int Float64_1=23;
    public static final int Period=58;
    public static final int Duration=25;
    public static final int Uint32_1=30;
    public static final int Action_1=34;
    public static final int Double=46;
    public static final int RULE_DECIMAL=99;
    public static final int Type_1=71;
    public static final int Value=73;
    public static final int Uint64=63;
    public static final int Cache=66;
    public static final int Action=50;
    public static final int RULE_END=115;
    public static final int Message=40;
    public static final int Value_1=64;
    public static final int Time=83;
    public static final int RULE_STRING=112;
    public static final int Bool_1=51;
    public static final int Any=85;
    public static final int Source=43;
    public static final int Struct=49;
    public static final int RULE_SL_COMMENT=116;
    public static final int Uint8_1=44;
    public static final int Proxy=70;
    public static final int Meta_has_published=5;
    public static final int RULE_DOUBLE=104;
    public static final int Feedback=26;
    public static final int RULE_ROS_CONVENTION_A=117;
    public static final int Service_1=27;
    public static final int RULE_ROS_CONVENTION_PARAM=118;
    public static final int Colon=91;
    public static final int EOF=-1;
    public static final int MissionRelated=10;
    public static final int Ns=88;
    public static final int RULE_WS=120;
    public static final int Int64_1=39;
    public static final int LeftCurlyBracket=96;
    public static final int Service=42;
    public static final int RULE_ANY_OTHER=121;
    public static final int Date=74;
    public static final int Integer=33;
    public static final int Array=65;
    public static final int Int64=69;
    public static final int RULE_MONTH=106;
    public static final int Cache_1=53;

    // delegates
    // delegators


        public InternalContextModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalContextModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalContextModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalContextModelParser.g"; }



     	private ContextModelGrammarAccess grammarAccess;

        public InternalContextModelParser(TokenStream input, ContextModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "ContextModel";
       	}

       	@Override
       	protected ContextModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleContextModel"
    // InternalContextModelParser.g:57:1: entryRuleContextModel returns [EObject current=null] : iv_ruleContextModel= ruleContextModel EOF ;
    public final EObject entryRuleContextModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextModel = null;


        try {
            // InternalContextModelParser.g:57:53: (iv_ruleContextModel= ruleContextModel EOF )
            // InternalContextModelParser.g:58:2: iv_ruleContextModel= ruleContextModel EOF
            {
             newCompositeNode(grammarAccess.getContextModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextModel=ruleContextModel();

            state._fsp--;

             current =iv_ruleContextModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContextModel"


    // $ANTLR start "ruleContextModel"
    // InternalContextModelParser.g:64:1: ruleContextModel returns [EObject current=null] : ( () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= Environmental otherlv_3= LeftCurlyBracket ( (lv_environmental_variables_4_0= ruleContextVar ) )* otherlv_5= RightCurlyBracket otherlv_6= MissionRelated otherlv_7= LeftCurlyBracket ( (lv_mission_variables_8_0= ruleMissionVar ) )* otherlv_9= RightCurlyBracket ) ;
    public final EObject ruleContextModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_imports_1_0 = null;

        EObject lv_environmental_variables_4_0 = null;

        EObject lv_mission_variables_8_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:70:2: ( ( () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= Environmental otherlv_3= LeftCurlyBracket ( (lv_environmental_variables_4_0= ruleContextVar ) )* otherlv_5= RightCurlyBracket otherlv_6= MissionRelated otherlv_7= LeftCurlyBracket ( (lv_mission_variables_8_0= ruleMissionVar ) )* otherlv_9= RightCurlyBracket ) )
            // InternalContextModelParser.g:71:2: ( () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= Environmental otherlv_3= LeftCurlyBracket ( (lv_environmental_variables_4_0= ruleContextVar ) )* otherlv_5= RightCurlyBracket otherlv_6= MissionRelated otherlv_7= LeftCurlyBracket ( (lv_mission_variables_8_0= ruleMissionVar ) )* otherlv_9= RightCurlyBracket )
            {
            // InternalContextModelParser.g:71:2: ( () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= Environmental otherlv_3= LeftCurlyBracket ( (lv_environmental_variables_4_0= ruleContextVar ) )* otherlv_5= RightCurlyBracket otherlv_6= MissionRelated otherlv_7= LeftCurlyBracket ( (lv_mission_variables_8_0= ruleMissionVar ) )* otherlv_9= RightCurlyBracket )
            // InternalContextModelParser.g:72:3: () ( (lv_imports_1_0= ruleImport ) )* otherlv_2= Environmental otherlv_3= LeftCurlyBracket ( (lv_environmental_variables_4_0= ruleContextVar ) )* otherlv_5= RightCurlyBracket otherlv_6= MissionRelated otherlv_7= LeftCurlyBracket ( (lv_mission_variables_8_0= ruleMissionVar ) )* otherlv_9= RightCurlyBracket
            {
            // InternalContextModelParser.g:72:3: ()
            // InternalContextModelParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getContextModelAccess().getContextModelAction_0(),
            					current);
            			

            }

            // InternalContextModelParser.g:79:3: ( (lv_imports_1_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==Import) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalContextModelParser.g:80:4: (lv_imports_1_0= ruleImport )
            	    {
            	    // InternalContextModelParser.g:80:4: (lv_imports_1_0= ruleImport )
            	    // InternalContextModelParser.g:81:5: lv_imports_1_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getImportsImportParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_imports_1_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_1_0,
            	    						"eu.coresense.context.ContextModel.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_2=(Token)match(input,Environmental,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getContextModelAccess().getEnvironmentalKeyword_2());
            		
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getContextModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalContextModelParser.g:106:3: ( (lv_environmental_variables_4_0= ruleContextVar ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ContextVariable) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalContextModelParser.g:107:4: (lv_environmental_variables_4_0= ruleContextVar )
            	    {
            	    // InternalContextModelParser.g:107:4: (lv_environmental_variables_4_0= ruleContextVar )
            	    // InternalContextModelParser.g:108:5: lv_environmental_variables_4_0= ruleContextVar
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getEnvironmental_variablesContextVarParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_environmental_variables_4_0=ruleContextVar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"environmental_variables",
            	    						lv_environmental_variables_4_0,
            	    						"eu.coresense.context.ContextModel.ContextVar");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getContextModelAccess().getRightCurlyBracketKeyword_5());
            		
            otherlv_6=(Token)match(input,MissionRelated,FOLLOW_4); 

            			newLeafNode(otherlv_6, grammarAccess.getContextModelAccess().getMissionRelatedKeyword_6());
            		
            otherlv_7=(Token)match(input,LeftCurlyBracket,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getContextModelAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalContextModelParser.g:137:3: ( (lv_mission_variables_8_0= ruleMissionVar ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_ID) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalContextModelParser.g:138:4: (lv_mission_variables_8_0= ruleMissionVar )
            	    {
            	    // InternalContextModelParser.g:138:4: (lv_mission_variables_8_0= ruleMissionVar )
            	    // InternalContextModelParser.g:139:5: lv_mission_variables_8_0= ruleMissionVar
            	    {

            	    					newCompositeNode(grammarAccess.getContextModelAccess().getMission_variablesMissionVarParserRuleCall_8_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_mission_variables_8_0=ruleMissionVar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getContextModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"mission_variables",
            	    						lv_mission_variables_8_0,
            	    						"eu.coresense.context.ContextModel.MissionVar");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_9=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getContextModelAccess().getRightCurlyBracketKeyword_9());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextModel"


    // $ANTLR start "entryRuleContextVar"
    // InternalContextModelParser.g:164:1: entryRuleContextVar returns [EObject current=null] : iv_ruleContextVar= ruleContextVar EOF ;
    public final EObject entryRuleContextVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextVar = null;


        try {
            // InternalContextModelParser.g:164:51: (iv_ruleContextVar= ruleContextVar EOF )
            // InternalContextModelParser.g:165:2: iv_ruleContextVar= ruleContextVar EOF
            {
             newCompositeNode(grammarAccess.getContextVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextVar=ruleContextVar();

            state._fsp--;

             current =iv_ruleContextVar; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContextVar"


    // $ANTLR start "ruleContextVar"
    // InternalContextModelParser.g:171:1: ruleContextVar returns [EObject current=null] : (otherlv_0= ContextVariable ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= Type_1 ( (lv_type_5_0= ruleAbstractType ) ) otherlv_6= Cache_1 ( (lv_doCache_7_0= ruleDoCache ) ) (otherlv_8= Cache otherlv_9= Length ( (lv_length_10_0= RULE_INT ) ) otherlv_11= S )? (otherlv_12= Period ( (lv_period_13_0= RULE_INT ) ) otherlv_14= Ns )? (otherlv_15= Proxy ( (lv_doProxy_16_0= ruleDoProxy ) ) )? otherlv_17= Function_name ( (lv_functionName_18_0= ruleFunctionName ) ) (otherlv_19= Function_lib ( (lv_functionLibrary_20_0= RULE_STRING ) ) )? (otherlv_21= Function_args ( (lv_functionArgs_22_0= RULE_STRING ) ) )? (otherlv_23= Thresholds ( (lv_thresholds_24_0= ruleLiteral ) )* )? otherlv_25= RightCurlyBracket ) ;
    public final EObject ruleContextVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_length_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_period_13_0=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_functionLibrary_20_0=null;
        Token otherlv_21=null;
        Token lv_functionArgs_22_0=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        EObject lv_source_3_0 = null;

        EObject lv_type_5_0 = null;

        EObject lv_doCache_7_0 = null;

        EObject lv_doProxy_16_0 = null;

        AntlrDatatypeRuleToken lv_functionName_18_0 = null;

        EObject lv_thresholds_24_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:177:2: ( (otherlv_0= ContextVariable ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= Type_1 ( (lv_type_5_0= ruleAbstractType ) ) otherlv_6= Cache_1 ( (lv_doCache_7_0= ruleDoCache ) ) (otherlv_8= Cache otherlv_9= Length ( (lv_length_10_0= RULE_INT ) ) otherlv_11= S )? (otherlv_12= Period ( (lv_period_13_0= RULE_INT ) ) otherlv_14= Ns )? (otherlv_15= Proxy ( (lv_doProxy_16_0= ruleDoProxy ) ) )? otherlv_17= Function_name ( (lv_functionName_18_0= ruleFunctionName ) ) (otherlv_19= Function_lib ( (lv_functionLibrary_20_0= RULE_STRING ) ) )? (otherlv_21= Function_args ( (lv_functionArgs_22_0= RULE_STRING ) ) )? (otherlv_23= Thresholds ( (lv_thresholds_24_0= ruleLiteral ) )* )? otherlv_25= RightCurlyBracket ) )
            // InternalContextModelParser.g:178:2: (otherlv_0= ContextVariable ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= Type_1 ( (lv_type_5_0= ruleAbstractType ) ) otherlv_6= Cache_1 ( (lv_doCache_7_0= ruleDoCache ) ) (otherlv_8= Cache otherlv_9= Length ( (lv_length_10_0= RULE_INT ) ) otherlv_11= S )? (otherlv_12= Period ( (lv_period_13_0= RULE_INT ) ) otherlv_14= Ns )? (otherlv_15= Proxy ( (lv_doProxy_16_0= ruleDoProxy ) ) )? otherlv_17= Function_name ( (lv_functionName_18_0= ruleFunctionName ) ) (otherlv_19= Function_lib ( (lv_functionLibrary_20_0= RULE_STRING ) ) )? (otherlv_21= Function_args ( (lv_functionArgs_22_0= RULE_STRING ) ) )? (otherlv_23= Thresholds ( (lv_thresholds_24_0= ruleLiteral ) )* )? otherlv_25= RightCurlyBracket )
            {
            // InternalContextModelParser.g:178:2: (otherlv_0= ContextVariable ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= Type_1 ( (lv_type_5_0= ruleAbstractType ) ) otherlv_6= Cache_1 ( (lv_doCache_7_0= ruleDoCache ) ) (otherlv_8= Cache otherlv_9= Length ( (lv_length_10_0= RULE_INT ) ) otherlv_11= S )? (otherlv_12= Period ( (lv_period_13_0= RULE_INT ) ) otherlv_14= Ns )? (otherlv_15= Proxy ( (lv_doProxy_16_0= ruleDoProxy ) ) )? otherlv_17= Function_name ( (lv_functionName_18_0= ruleFunctionName ) ) (otherlv_19= Function_lib ( (lv_functionLibrary_20_0= RULE_STRING ) ) )? (otherlv_21= Function_args ( (lv_functionArgs_22_0= RULE_STRING ) ) )? (otherlv_23= Thresholds ( (lv_thresholds_24_0= ruleLiteral ) )* )? otherlv_25= RightCurlyBracket )
            // InternalContextModelParser.g:179:3: otherlv_0= ContextVariable ( (lv_name_1_0= RULE_ID ) ) otherlv_2= LeftCurlyBracket ( (lv_source_3_0= ruleDataSource ) ) otherlv_4= Type_1 ( (lv_type_5_0= ruleAbstractType ) ) otherlv_6= Cache_1 ( (lv_doCache_7_0= ruleDoCache ) ) (otherlv_8= Cache otherlv_9= Length ( (lv_length_10_0= RULE_INT ) ) otherlv_11= S )? (otherlv_12= Period ( (lv_period_13_0= RULE_INT ) ) otherlv_14= Ns )? (otherlv_15= Proxy ( (lv_doProxy_16_0= ruleDoProxy ) ) )? otherlv_17= Function_name ( (lv_functionName_18_0= ruleFunctionName ) ) (otherlv_19= Function_lib ( (lv_functionLibrary_20_0= RULE_STRING ) ) )? (otherlv_21= Function_args ( (lv_functionArgs_22_0= RULE_STRING ) ) )? (otherlv_23= Thresholds ( (lv_thresholds_24_0= ruleLiteral ) )* )? otherlv_25= RightCurlyBracket
            {
            otherlv_0=(Token)match(input,ContextVariable,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getContextVarAccess().getContextVariableKeyword_0());
            		
            // InternalContextModelParser.g:183:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalContextModelParser.g:184:4: (lv_name_1_0= RULE_ID )
            {
            // InternalContextModelParser.g:184:4: (lv_name_1_0= RULE_ID )
            // InternalContextModelParser.g:185:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContextVarAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextVarRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getContextVarAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalContextModelParser.g:205:3: ( (lv_source_3_0= ruleDataSource ) )
            // InternalContextModelParser.g:206:4: (lv_source_3_0= ruleDataSource )
            {
            // InternalContextModelParser.g:206:4: (lv_source_3_0= ruleDataSource )
            // InternalContextModelParser.g:207:5: lv_source_3_0= ruleDataSource
            {

            					newCompositeNode(grammarAccess.getContextVarAccess().getSourceDataSourceParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_10);
            lv_source_3_0=ruleDataSource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextVarRule());
            					}
            					set(
            						current,
            						"source",
            						lv_source_3_0,
            						"eu.coresense.context.ContextModel.DataSource");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,Type_1,FOLLOW_11); 

            			newLeafNode(otherlv_4, grammarAccess.getContextVarAccess().getTypeKeyword_4());
            		
            // InternalContextModelParser.g:228:3: ( (lv_type_5_0= ruleAbstractType ) )
            // InternalContextModelParser.g:229:4: (lv_type_5_0= ruleAbstractType )
            {
            // InternalContextModelParser.g:229:4: (lv_type_5_0= ruleAbstractType )
            // InternalContextModelParser.g:230:5: lv_type_5_0= ruleAbstractType
            {

            					newCompositeNode(grammarAccess.getContextVarAccess().getTypeAbstractTypeParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_12);
            lv_type_5_0=ruleAbstractType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextVarRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_5_0,
            						"de.fraunhofer.ipa.ros.Basics.AbstractType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,Cache_1,FOLLOW_13); 

            			newLeafNode(otherlv_6, grammarAccess.getContextVarAccess().getCacheKeyword_6());
            		
            // InternalContextModelParser.g:251:3: ( (lv_doCache_7_0= ruleDoCache ) )
            // InternalContextModelParser.g:252:4: (lv_doCache_7_0= ruleDoCache )
            {
            // InternalContextModelParser.g:252:4: (lv_doCache_7_0= ruleDoCache )
            // InternalContextModelParser.g:253:5: lv_doCache_7_0= ruleDoCache
            {

            					newCompositeNode(grammarAccess.getContextVarAccess().getDoCacheDoCacheParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_14);
            lv_doCache_7_0=ruleDoCache();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextVarRule());
            					}
            					set(
            						current,
            						"doCache",
            						lv_doCache_7_0,
            						"eu.coresense.context.ContextModel.DoCache");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalContextModelParser.g:270:3: (otherlv_8= Cache otherlv_9= Length ( (lv_length_10_0= RULE_INT ) ) otherlv_11= S )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==Cache) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalContextModelParser.g:271:4: otherlv_8= Cache otherlv_9= Length ( (lv_length_10_0= RULE_INT ) ) otherlv_11= S
                    {
                    otherlv_8=(Token)match(input,Cache,FOLLOW_15); 

                    				newLeafNode(otherlv_8, grammarAccess.getContextVarAccess().getCacheKeyword_8_0());
                    			
                    otherlv_9=(Token)match(input,Length,FOLLOW_16); 

                    				newLeafNode(otherlv_9, grammarAccess.getContextVarAccess().getLengthKeyword_8_1());
                    			
                    // InternalContextModelParser.g:279:4: ( (lv_length_10_0= RULE_INT ) )
                    // InternalContextModelParser.g:280:5: (lv_length_10_0= RULE_INT )
                    {
                    // InternalContextModelParser.g:280:5: (lv_length_10_0= RULE_INT )
                    // InternalContextModelParser.g:281:6: lv_length_10_0= RULE_INT
                    {
                    lv_length_10_0=(Token)match(input,RULE_INT,FOLLOW_17); 

                    						newLeafNode(lv_length_10_0, grammarAccess.getContextVarAccess().getLengthINTTerminalRuleCall_8_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextVarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"length",
                    							lv_length_10_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,S,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getContextVarAccess().getSKeyword_8_3());
                    			

                    }
                    break;

            }

            // InternalContextModelParser.g:302:3: (otherlv_12= Period ( (lv_period_13_0= RULE_INT ) ) otherlv_14= Ns )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==Period) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalContextModelParser.g:303:4: otherlv_12= Period ( (lv_period_13_0= RULE_INT ) ) otherlv_14= Ns
                    {
                    otherlv_12=(Token)match(input,Period,FOLLOW_16); 

                    				newLeafNode(otherlv_12, grammarAccess.getContextVarAccess().getPeriodKeyword_9_0());
                    			
                    // InternalContextModelParser.g:307:4: ( (lv_period_13_0= RULE_INT ) )
                    // InternalContextModelParser.g:308:5: (lv_period_13_0= RULE_INT )
                    {
                    // InternalContextModelParser.g:308:5: (lv_period_13_0= RULE_INT )
                    // InternalContextModelParser.g:309:6: lv_period_13_0= RULE_INT
                    {
                    lv_period_13_0=(Token)match(input,RULE_INT,FOLLOW_19); 

                    						newLeafNode(lv_period_13_0, grammarAccess.getContextVarAccess().getPeriodINTTerminalRuleCall_9_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextVarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"period",
                    							lv_period_13_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_14=(Token)match(input,Ns,FOLLOW_20); 

                    				newLeafNode(otherlv_14, grammarAccess.getContextVarAccess().getNsKeyword_9_2());
                    			

                    }
                    break;

            }

            // InternalContextModelParser.g:330:3: (otherlv_15= Proxy ( (lv_doProxy_16_0= ruleDoProxy ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==Proxy) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalContextModelParser.g:331:4: otherlv_15= Proxy ( (lv_doProxy_16_0= ruleDoProxy ) )
                    {
                    otherlv_15=(Token)match(input,Proxy,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getContextVarAccess().getProxyKeyword_10_0());
                    			
                    // InternalContextModelParser.g:335:4: ( (lv_doProxy_16_0= ruleDoProxy ) )
                    // InternalContextModelParser.g:336:5: (lv_doProxy_16_0= ruleDoProxy )
                    {
                    // InternalContextModelParser.g:336:5: (lv_doProxy_16_0= ruleDoProxy )
                    // InternalContextModelParser.g:337:6: lv_doProxy_16_0= ruleDoProxy
                    {

                    						newCompositeNode(grammarAccess.getContextVarAccess().getDoProxyDoProxyParserRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_doProxy_16_0=ruleDoProxy();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getContextVarRule());
                    						}
                    						set(
                    							current,
                    							"doProxy",
                    							lv_doProxy_16_0,
                    							"eu.coresense.context.ContextModel.DoProxy");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_17=(Token)match(input,Function_name,FOLLOW_22); 

            			newLeafNode(otherlv_17, grammarAccess.getContextVarAccess().getFunction_nameKeyword_11());
            		
            // InternalContextModelParser.g:359:3: ( (lv_functionName_18_0= ruleFunctionName ) )
            // InternalContextModelParser.g:360:4: (lv_functionName_18_0= ruleFunctionName )
            {
            // InternalContextModelParser.g:360:4: (lv_functionName_18_0= ruleFunctionName )
            // InternalContextModelParser.g:361:5: lv_functionName_18_0= ruleFunctionName
            {

            					newCompositeNode(grammarAccess.getContextVarAccess().getFunctionNameFunctionNameParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_23);
            lv_functionName_18_0=ruleFunctionName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getContextVarRule());
            					}
            					set(
            						current,
            						"functionName",
            						lv_functionName_18_0,
            						"eu.coresense.context.ContextModel.FunctionName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalContextModelParser.g:378:3: (otherlv_19= Function_lib ( (lv_functionLibrary_20_0= RULE_STRING ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Function_lib) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalContextModelParser.g:379:4: otherlv_19= Function_lib ( (lv_functionLibrary_20_0= RULE_STRING ) )
                    {
                    otherlv_19=(Token)match(input,Function_lib,FOLLOW_24); 

                    				newLeafNode(otherlv_19, grammarAccess.getContextVarAccess().getFunction_libKeyword_13_0());
                    			
                    // InternalContextModelParser.g:383:4: ( (lv_functionLibrary_20_0= RULE_STRING ) )
                    // InternalContextModelParser.g:384:5: (lv_functionLibrary_20_0= RULE_STRING )
                    {
                    // InternalContextModelParser.g:384:5: (lv_functionLibrary_20_0= RULE_STRING )
                    // InternalContextModelParser.g:385:6: lv_functionLibrary_20_0= RULE_STRING
                    {
                    lv_functionLibrary_20_0=(Token)match(input,RULE_STRING,FOLLOW_25); 

                    						newLeafNode(lv_functionLibrary_20_0, grammarAccess.getContextVarAccess().getFunctionLibrarySTRINGTerminalRuleCall_13_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextVarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"functionLibrary",
                    							lv_functionLibrary_20_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalContextModelParser.g:402:3: (otherlv_21= Function_args ( (lv_functionArgs_22_0= RULE_STRING ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Function_args) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalContextModelParser.g:403:4: otherlv_21= Function_args ( (lv_functionArgs_22_0= RULE_STRING ) )
                    {
                    otherlv_21=(Token)match(input,Function_args,FOLLOW_24); 

                    				newLeafNode(otherlv_21, grammarAccess.getContextVarAccess().getFunction_argsKeyword_14_0());
                    			
                    // InternalContextModelParser.g:407:4: ( (lv_functionArgs_22_0= RULE_STRING ) )
                    // InternalContextModelParser.g:408:5: (lv_functionArgs_22_0= RULE_STRING )
                    {
                    // InternalContextModelParser.g:408:5: (lv_functionArgs_22_0= RULE_STRING )
                    // InternalContextModelParser.g:409:6: lv_functionArgs_22_0= RULE_STRING
                    {
                    lv_functionArgs_22_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_functionArgs_22_0, grammarAccess.getContextVarAccess().getFunctionArgsSTRINGTerminalRuleCall_14_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getContextVarRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"functionArgs",
                    							lv_functionArgs_22_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalContextModelParser.g:426:3: (otherlv_23= Thresholds ( (lv_thresholds_24_0= ruleLiteral ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Thresholds) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalContextModelParser.g:427:4: otherlv_23= Thresholds ( (lv_thresholds_24_0= ruleLiteral ) )*
                    {
                    otherlv_23=(Token)match(input,Thresholds,FOLLOW_27); 

                    				newLeafNode(otherlv_23, grammarAccess.getContextVarAccess().getThresholdsKeyword_15_0());
                    			
                    // InternalContextModelParser.g:431:4: ( (lv_thresholds_24_0= ruleLiteral ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_DECIMAL)) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalContextModelParser.g:432:5: (lv_thresholds_24_0= ruleLiteral )
                    	    {
                    	    // InternalContextModelParser.g:432:5: (lv_thresholds_24_0= ruleLiteral )
                    	    // InternalContextModelParser.g:433:6: lv_thresholds_24_0= ruleLiteral
                    	    {

                    	    						newCompositeNode(grammarAccess.getContextVarAccess().getThresholdsLiteralParserRuleCall_15_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
                    	    lv_thresholds_24_0=ruleLiteral();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getContextVarRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"thresholds",
                    	    							lv_thresholds_24_0,
                    	    							"eu.coresense.context.ContextModel.Literal");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_25=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getContextVarAccess().getRightCurlyBracketKeyword_16());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextVar"


    // $ANTLR start "entryRuleLiteral"
    // InternalContextModelParser.g:459:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalContextModelParser.g:459:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalContextModelParser.g:460:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalContextModelParser.g:466:1: ruleLiteral returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_IntLiteral_0 = null;

        EObject this_DecimalLiteral_1 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:472:2: ( (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral ) )
            // InternalContextModelParser.g:473:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral )
            {
            // InternalContextModelParser.g:473:2: (this_IntLiteral_0= ruleIntLiteral | this_DecimalLiteral_1= ruleDecimalLiteral )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_INT) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_DECIMAL) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalContextModelParser.g:474:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalContextModelParser.g:483:3: this_DecimalLiteral_1= ruleDecimalLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getDecimalLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_DecimalLiteral_1=ruleDecimalLiteral();

                    state._fsp--;


                    			current = this_DecimalLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleFunctionName"
    // InternalContextModelParser.g:495:1: entryRuleFunctionName returns [String current=null] : iv_ruleFunctionName= ruleFunctionName EOF ;
    public final String entryRuleFunctionName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFunctionName = null;


        try {
            // InternalContextModelParser.g:495:52: (iv_ruleFunctionName= ruleFunctionName EOF )
            // InternalContextModelParser.g:496:2: iv_ruleFunctionName= ruleFunctionName EOF
            {
             newCompositeNode(grammarAccess.getFunctionNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFunctionName=ruleFunctionName();

            state._fsp--;

             current =iv_ruleFunctionName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFunctionName"


    // $ANTLR start "ruleFunctionName"
    // InternalContextModelParser.g:502:1: ruleFunctionName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | kw= Meta_count | kw= Meta_last_published | kw= Meta_has_published ) ;
    public final AntlrDatatypeRuleToken ruleFunctionName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:508:2: ( (this_STRING_0= RULE_STRING | kw= Meta_count | kw= Meta_last_published | kw= Meta_has_published ) )
            // InternalContextModelParser.g:509:2: (this_STRING_0= RULE_STRING | kw= Meta_count | kw= Meta_last_published | kw= Meta_has_published )
            {
            // InternalContextModelParser.g:509:2: (this_STRING_0= RULE_STRING | kw= Meta_count | kw= Meta_last_published | kw= Meta_has_published )
            int alt12=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt12=1;
                }
                break;
            case Meta_count:
                {
                alt12=2;
                }
                break;
            case Meta_last_published:
                {
                alt12=3;
                }
                break;
            case Meta_has_published:
                {
                alt12=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalContextModelParser.g:510:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getFunctionNameAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalContextModelParser.g:518:3: kw= Meta_count
                    {
                    kw=(Token)match(input,Meta_count,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionNameAccess().getMeta_countKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalContextModelParser.g:524:3: kw= Meta_last_published
                    {
                    kw=(Token)match(input,Meta_last_published,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionNameAccess().getMeta_last_publishedKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalContextModelParser.g:530:3: kw= Meta_has_published
                    {
                    kw=(Token)match(input,Meta_has_published,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getFunctionNameAccess().getMeta_has_publishedKeyword_3());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFunctionName"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalContextModelParser.g:539:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalContextModelParser.g:539:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalContextModelParser.g:540:2: iv_ruleIntLiteral= ruleIntLiteral EOF
            {
             newCompositeNode(grammarAccess.getIntLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIntLiteral=ruleIntLiteral();

            state._fsp--;

             current =iv_ruleIntLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleIntLiteral"


    // $ANTLR start "ruleIntLiteral"
    // InternalContextModelParser.g:546:1: ruleIntLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:552:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalContextModelParser.g:553:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalContextModelParser.g:553:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalContextModelParser.g:554:3: (lv_value_0_0= RULE_INT )
            {
            // InternalContextModelParser.g:554:3: (lv_value_0_0= RULE_INT )
            // InternalContextModelParser.g:555:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getIntLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntLiteral"


    // $ANTLR start "entryRuleDecimalLiteral"
    // InternalContextModelParser.g:574:1: entryRuleDecimalLiteral returns [EObject current=null] : iv_ruleDecimalLiteral= ruleDecimalLiteral EOF ;
    public final EObject entryRuleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalLiteral = null;


        try {
            // InternalContextModelParser.g:574:55: (iv_ruleDecimalLiteral= ruleDecimalLiteral EOF )
            // InternalContextModelParser.g:575:2: iv_ruleDecimalLiteral= ruleDecimalLiteral EOF
            {
             newCompositeNode(grammarAccess.getDecimalLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDecimalLiteral=ruleDecimalLiteral();

            state._fsp--;

             current =iv_ruleDecimalLiteral; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDecimalLiteral"


    // $ANTLR start "ruleDecimalLiteral"
    // InternalContextModelParser.g:581:1: ruleDecimalLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_DECIMAL ) ) ;
    public final EObject ruleDecimalLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:587:2: ( ( (lv_value_0_0= RULE_DECIMAL ) ) )
            // InternalContextModelParser.g:588:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            {
            // InternalContextModelParser.g:588:2: ( (lv_value_0_0= RULE_DECIMAL ) )
            // InternalContextModelParser.g:589:3: (lv_value_0_0= RULE_DECIMAL )
            {
            // InternalContextModelParser.g:589:3: (lv_value_0_0= RULE_DECIMAL )
            // InternalContextModelParser.g:590:4: lv_value_0_0= RULE_DECIMAL
            {
            lv_value_0_0=(Token)match(input,RULE_DECIMAL,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getDecimalLiteralAccess().getValueDECIMALTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getDecimalLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"eu.coresense.context.ContextModel.DECIMAL");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecimalLiteral"


    // $ANTLR start "entryRuleMissionVar"
    // InternalContextModelParser.g:609:1: entryRuleMissionVar returns [EObject current=null] : iv_ruleMissionVar= ruleMissionVar EOF ;
    public final EObject entryRuleMissionVar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMissionVar = null;


        try {
            // InternalContextModelParser.g:609:51: (iv_ruleMissionVar= ruleMissionVar EOF )
            // InternalContextModelParser.g:610:2: iv_ruleMissionVar= ruleMissionVar EOF
            {
             newCompositeNode(grammarAccess.getMissionVarRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMissionVar=ruleMissionVar();

            state._fsp--;

             current =iv_ruleMissionVar; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMissionVar"


    // $ANTLR start "ruleMissionVar"
    // InternalContextModelParser.g:616:1: ruleMissionVar returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= Colon ( (lv_context_vars_2_0= ruleContextVar ) )* ) ;
    public final EObject ruleMissionVar() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_context_vars_2_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:622:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= Colon ( (lv_context_vars_2_0= ruleContextVar ) )* ) )
            // InternalContextModelParser.g:623:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= Colon ( (lv_context_vars_2_0= ruleContextVar ) )* )
            {
            // InternalContextModelParser.g:623:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= Colon ( (lv_context_vars_2_0= ruleContextVar ) )* )
            // InternalContextModelParser.g:624:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= Colon ( (lv_context_vars_2_0= ruleContextVar ) )*
            {
            // InternalContextModelParser.g:624:3: ( (otherlv_0= RULE_ID ) )
            // InternalContextModelParser.g:625:4: (otherlv_0= RULE_ID )
            {
            // InternalContextModelParser.g:625:4: (otherlv_0= RULE_ID )
            // InternalContextModelParser.g:626:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMissionVarRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(otherlv_0, grammarAccess.getMissionVarAccess().getActionActionSpecCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getMissionVarAccess().getColonKeyword_1());
            		
            // InternalContextModelParser.g:641:3: ( (lv_context_vars_2_0= ruleContextVar ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ContextVariable) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalContextModelParser.g:642:4: (lv_context_vars_2_0= ruleContextVar )
            	    {
            	    // InternalContextModelParser.g:642:4: (lv_context_vars_2_0= ruleContextVar )
            	    // InternalContextModelParser.g:643:5: lv_context_vars_2_0= ruleContextVar
            	    {

            	    					newCompositeNode(grammarAccess.getMissionVarAccess().getContext_varsContextVarParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_context_vars_2_0=ruleContextVar();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMissionVarRule());
            	    					}
            	    					add(
            	    						current,
            	    						"context_vars",
            	    						lv_context_vars_2_0,
            	    						"eu.coresense.context.ContextModel.ContextVar");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMissionVar"


    // $ANTLR start "entryRuleDoCache"
    // InternalContextModelParser.g:664:1: entryRuleDoCache returns [EObject current=null] : iv_ruleDoCache= ruleDoCache EOF ;
    public final EObject entryRuleDoCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoCache = null;


        try {
            // InternalContextModelParser.g:664:48: (iv_ruleDoCache= ruleDoCache EOF )
            // InternalContextModelParser.g:665:2: iv_ruleDoCache= ruleDoCache EOF
            {
             newCompositeNode(grammarAccess.getDoCacheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoCache=ruleDoCache();

            state._fsp--;

             current =iv_ruleDoCache; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoCache"


    // $ANTLR start "ruleDoCache"
    // InternalContextModelParser.g:671:1: ruleDoCache returns [EObject current=null] : ( () ( (lv_do_1_0= ruleContextBoolean ) ) ) ;
    public final EObject ruleDoCache() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_do_1_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:677:2: ( ( () ( (lv_do_1_0= ruleContextBoolean ) ) ) )
            // InternalContextModelParser.g:678:2: ( () ( (lv_do_1_0= ruleContextBoolean ) ) )
            {
            // InternalContextModelParser.g:678:2: ( () ( (lv_do_1_0= ruleContextBoolean ) ) )
            // InternalContextModelParser.g:679:3: () ( (lv_do_1_0= ruleContextBoolean ) )
            {
            // InternalContextModelParser.g:679:3: ()
            // InternalContextModelParser.g:680:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDoCacheAccess().getDoCacheAction_0(),
            					current);
            			

            }

            // InternalContextModelParser.g:686:3: ( (lv_do_1_0= ruleContextBoolean ) )
            // InternalContextModelParser.g:687:4: (lv_do_1_0= ruleContextBoolean )
            {
            // InternalContextModelParser.g:687:4: (lv_do_1_0= ruleContextBoolean )
            // InternalContextModelParser.g:688:5: lv_do_1_0= ruleContextBoolean
            {

            					newCompositeNode(grammarAccess.getDoCacheAccess().getDoContextBooleanParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_do_1_0=ruleContextBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoCacheRule());
            					}
            					set(
            						current,
            						"do",
            						lv_do_1_0,
            						"eu.coresense.context.ContextModel.ContextBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoCache"


    // $ANTLR start "entryRuleDoProxy"
    // InternalContextModelParser.g:709:1: entryRuleDoProxy returns [EObject current=null] : iv_ruleDoProxy= ruleDoProxy EOF ;
    public final EObject entryRuleDoProxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoProxy = null;


        try {
            // InternalContextModelParser.g:709:48: (iv_ruleDoProxy= ruleDoProxy EOF )
            // InternalContextModelParser.g:710:2: iv_ruleDoProxy= ruleDoProxy EOF
            {
             newCompositeNode(grammarAccess.getDoProxyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoProxy=ruleDoProxy();

            state._fsp--;

             current =iv_ruleDoProxy; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDoProxy"


    // $ANTLR start "ruleDoProxy"
    // InternalContextModelParser.g:716:1: ruleDoProxy returns [EObject current=null] : ( () ( (lv_do_1_0= ruleContextBoolean ) ) ) ;
    public final EObject ruleDoProxy() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_do_1_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:722:2: ( ( () ( (lv_do_1_0= ruleContextBoolean ) ) ) )
            // InternalContextModelParser.g:723:2: ( () ( (lv_do_1_0= ruleContextBoolean ) ) )
            {
            // InternalContextModelParser.g:723:2: ( () ( (lv_do_1_0= ruleContextBoolean ) ) )
            // InternalContextModelParser.g:724:3: () ( (lv_do_1_0= ruleContextBoolean ) )
            {
            // InternalContextModelParser.g:724:3: ()
            // InternalContextModelParser.g:725:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDoProxyAccess().getDoProxyAction_0(),
            					current);
            			

            }

            // InternalContextModelParser.g:731:3: ( (lv_do_1_0= ruleContextBoolean ) )
            // InternalContextModelParser.g:732:4: (lv_do_1_0= ruleContextBoolean )
            {
            // InternalContextModelParser.g:732:4: (lv_do_1_0= ruleContextBoolean )
            // InternalContextModelParser.g:733:5: lv_do_1_0= ruleContextBoolean
            {

            					newCompositeNode(grammarAccess.getDoProxyAccess().getDoContextBooleanParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_do_1_0=ruleContextBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDoProxyRule());
            					}
            					set(
            						current,
            						"do",
            						lv_do_1_0,
            						"eu.coresense.context.ContextModel.ContextBoolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoProxy"


    // $ANTLR start "entryRuleDataSource"
    // InternalContextModelParser.g:754:1: entryRuleDataSource returns [EObject current=null] : iv_ruleDataSource= ruleDataSource EOF ;
    public final EObject entryRuleDataSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataSource = null;


        try {
            // InternalContextModelParser.g:754:51: (iv_ruleDataSource= ruleDataSource EOF )
            // InternalContextModelParser.g:755:2: iv_ruleDataSource= ruleDataSource EOF
            {
             newCompositeNode(grammarAccess.getDataSourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataSource=ruleDataSource();

            state._fsp--;

             current =iv_ruleDataSource; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDataSource"


    // $ANTLR start "ruleDataSource"
    // InternalContextModelParser.g:761:1: ruleDataSource returns [EObject current=null] : (otherlv_0= Source (otherlv_1= Origin ( (lv_ref_2_0= ruleReference ) ) ) ) ;
    public final EObject ruleDataSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_ref_2_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:767:2: ( (otherlv_0= Source (otherlv_1= Origin ( (lv_ref_2_0= ruleReference ) ) ) ) )
            // InternalContextModelParser.g:768:2: (otherlv_0= Source (otherlv_1= Origin ( (lv_ref_2_0= ruleReference ) ) ) )
            {
            // InternalContextModelParser.g:768:2: (otherlv_0= Source (otherlv_1= Origin ( (lv_ref_2_0= ruleReference ) ) ) )
            // InternalContextModelParser.g:769:3: otherlv_0= Source (otherlv_1= Origin ( (lv_ref_2_0= ruleReference ) ) )
            {
            otherlv_0=(Token)match(input,Source,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getDataSourceAccess().getSourceKeyword_0());
            		
            // InternalContextModelParser.g:773:3: (otherlv_1= Origin ( (lv_ref_2_0= ruleReference ) ) )
            // InternalContextModelParser.g:774:4: otherlv_1= Origin ( (lv_ref_2_0= ruleReference ) )
            {
            otherlv_1=(Token)match(input,Origin,FOLLOW_31); 

            				newLeafNode(otherlv_1, grammarAccess.getDataSourceAccess().getOriginKeyword_1_0());
            			
            // InternalContextModelParser.g:778:4: ( (lv_ref_2_0= ruleReference ) )
            // InternalContextModelParser.g:779:5: (lv_ref_2_0= ruleReference )
            {
            // InternalContextModelParser.g:779:5: (lv_ref_2_0= ruleReference )
            // InternalContextModelParser.g:780:6: lv_ref_2_0= ruleReference
            {

            						newCompositeNode(grammarAccess.getDataSourceAccess().getRefReferenceParserRuleCall_1_1_0());
            					
            pushFollow(FOLLOW_2);
            lv_ref_2_0=ruleReference();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getDataSourceRule());
            						}
            						set(
            							current,
            							"ref",
            							lv_ref_2_0,
            							"eu.coresense.context.ContextModel.Reference");
            						afterParserOrEnumRuleCall();
            					

            }


            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataSource"


    // $ANTLR start "entryRuleKeyWordArguments"
    // InternalContextModelParser.g:802:1: entryRuleKeyWordArguments returns [String current=null] : iv_ruleKeyWordArguments= ruleKeyWordArguments EOF ;
    public final String entryRuleKeyWordArguments() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKeyWordArguments = null;


        try {
            // InternalContextModelParser.g:802:56: (iv_ruleKeyWordArguments= ruleKeyWordArguments EOF )
            // InternalContextModelParser.g:803:2: iv_ruleKeyWordArguments= ruleKeyWordArguments EOF
            {
             newCompositeNode(grammarAccess.getKeyWordArgumentsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyWordArguments=ruleKeyWordArguments();

            state._fsp--;

             current =iv_ruleKeyWordArguments.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKeyWordArguments"


    // $ANTLR start "ruleKeyWordArguments"
    // InternalContextModelParser.g:809:1: ruleKeyWordArguments returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleKeyWordArguments() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:815:2: (this_STRING_0= RULE_STRING )
            // InternalContextModelParser.g:816:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getKeyWordArgumentsAccess().getSTRINGTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKeyWordArguments"


    // $ANTLR start "entryRuleReference"
    // InternalContextModelParser.g:826:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalContextModelParser.g:826:50: (iv_ruleReference= ruleReference EOF )
            // InternalContextModelParser.g:827:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalContextModelParser.g:833:1: ruleReference returns [EObject current=null] : (this_QualifiedRef_0= ruleQualifiedRef | this_CompositeRef_1= ruleCompositeRef ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        EObject this_QualifiedRef_0 = null;

        EObject this_CompositeRef_1 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:839:2: ( (this_QualifiedRef_0= ruleQualifiedRef | this_CompositeRef_1= ruleCompositeRef ) )
            // InternalContextModelParser.g:840:2: (this_QualifiedRef_0= ruleQualifiedRef | this_CompositeRef_1= ruleCompositeRef )
            {
            // InternalContextModelParser.g:840:2: (this_QualifiedRef_0= ruleQualifiedRef | this_CompositeRef_1= ruleCompositeRef )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Publisher||LA14_0==Service_1||LA14_0==Action_1) ) {
                alt14=1;
            }
            else if ( (LA14_0==EOF||LA14_0==Type_1||LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalContextModelParser.g:841:3: this_QualifiedRef_0= ruleQualifiedRef
                    {

                    			newCompositeNode(grammarAccess.getReferenceAccess().getQualifiedRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedRef_0=ruleQualifiedRef();

                    state._fsp--;


                    			current = this_QualifiedRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalContextModelParser.g:850:3: this_CompositeRef_1= ruleCompositeRef
                    {

                    			newCompositeNode(grammarAccess.getReferenceAccess().getCompositeRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_CompositeRef_1=ruleCompositeRef();

                    state._fsp--;


                    			current = this_CompositeRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleCompositeRef"
    // InternalContextModelParser.g:862:1: entryRuleCompositeRef returns [EObject current=null] : iv_ruleCompositeRef= ruleCompositeRef EOF ;
    public final EObject entryRuleCompositeRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeRef = null;


        try {
            // InternalContextModelParser.g:862:53: (iv_ruleCompositeRef= ruleCompositeRef EOF )
            // InternalContextModelParser.g:863:2: iv_ruleCompositeRef= ruleCompositeRef EOF
            {
             newCompositeNode(grammarAccess.getCompositeRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompositeRef=ruleCompositeRef();

            state._fsp--;

             current =iv_ruleCompositeRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCompositeRef"


    // $ANTLR start "ruleCompositeRef"
    // InternalContextModelParser.g:869:1: ruleCompositeRef returns [EObject current=null] : ( () ( (otherlv_1= RULE_ID ) )* ) ;
    public final EObject ruleCompositeRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:875:2: ( ( () ( (otherlv_1= RULE_ID ) )* ) )
            // InternalContextModelParser.g:876:2: ( () ( (otherlv_1= RULE_ID ) )* )
            {
            // InternalContextModelParser.g:876:2: ( () ( (otherlv_1= RULE_ID ) )* )
            // InternalContextModelParser.g:877:3: () ( (otherlv_1= RULE_ID ) )*
            {
            // InternalContextModelParser.g:877:3: ()
            // InternalContextModelParser.g:878:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCompositeRefAccess().getCompositeRefAction_0(),
            					current);
            			

            }

            // InternalContextModelParser.g:884:3: ( (otherlv_1= RULE_ID ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalContextModelParser.g:885:4: (otherlv_1= RULE_ID )
            	    {
            	    // InternalContextModelParser.g:885:4: (otherlv_1= RULE_ID )
            	    // InternalContextModelParser.g:886:5: otherlv_1= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getCompositeRefRule());
            	    					}
            	    				
            	    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_32); 

            	    					newLeafNode(otherlv_1, grammarAccess.getCompositeRefAccess().getContextVarsContextVarCrossReference_1_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompositeRef"


    // $ANTLR start "entryRuleQualifiedRef"
    // InternalContextModelParser.g:901:1: entryRuleQualifiedRef returns [EObject current=null] : iv_ruleQualifiedRef= ruleQualifiedRef EOF ;
    public final EObject entryRuleQualifiedRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedRef = null;


        try {
            // InternalContextModelParser.g:901:53: (iv_ruleQualifiedRef= ruleQualifiedRef EOF )
            // InternalContextModelParser.g:902:2: iv_ruleQualifiedRef= ruleQualifiedRef EOF
            {
             newCompositeNode(grammarAccess.getQualifiedRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedRef=ruleQualifiedRef();

            state._fsp--;

             current =iv_ruleQualifiedRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedRef"


    // $ANTLR start "ruleQualifiedRef"
    // InternalContextModelParser.g:908:1: ruleQualifiedRef returns [EObject current=null] : (this_QualifiedPublisherRef_0= ruleQualifiedPublisherRef | this_QualifiedServiceServerRef_1= ruleQualifiedServiceServerRef | this_QualifiedActionServerRef_2= ruleQualifiedActionServerRef ) ;
    public final EObject ruleQualifiedRef() throws RecognitionException {
        EObject current = null;

        EObject this_QualifiedPublisherRef_0 = null;

        EObject this_QualifiedServiceServerRef_1 = null;

        EObject this_QualifiedActionServerRef_2 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:914:2: ( (this_QualifiedPublisherRef_0= ruleQualifiedPublisherRef | this_QualifiedServiceServerRef_1= ruleQualifiedServiceServerRef | this_QualifiedActionServerRef_2= ruleQualifiedActionServerRef ) )
            // InternalContextModelParser.g:915:2: (this_QualifiedPublisherRef_0= ruleQualifiedPublisherRef | this_QualifiedServiceServerRef_1= ruleQualifiedServiceServerRef | this_QualifiedActionServerRef_2= ruleQualifiedActionServerRef )
            {
            // InternalContextModelParser.g:915:2: (this_QualifiedPublisherRef_0= ruleQualifiedPublisherRef | this_QualifiedServiceServerRef_1= ruleQualifiedServiceServerRef | this_QualifiedActionServerRef_2= ruleQualifiedActionServerRef )
            int alt16=3;
            switch ( input.LA(1) ) {
            case Publisher:
                {
                alt16=1;
                }
                break;
            case Service_1:
                {
                alt16=2;
                }
                break;
            case Action_1:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalContextModelParser.g:916:3: this_QualifiedPublisherRef_0= ruleQualifiedPublisherRef
                    {

                    			newCompositeNode(grammarAccess.getQualifiedRefAccess().getQualifiedPublisherRefParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedPublisherRef_0=ruleQualifiedPublisherRef();

                    state._fsp--;


                    			current = this_QualifiedPublisherRef_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalContextModelParser.g:925:3: this_QualifiedServiceServerRef_1= ruleQualifiedServiceServerRef
                    {

                    			newCompositeNode(grammarAccess.getQualifiedRefAccess().getQualifiedServiceServerRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedServiceServerRef_1=ruleQualifiedServiceServerRef();

                    state._fsp--;


                    			current = this_QualifiedServiceServerRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalContextModelParser.g:934:3: this_QualifiedActionServerRef_2= ruleQualifiedActionServerRef
                    {

                    			newCompositeNode(grammarAccess.getQualifiedRefAccess().getQualifiedActionServerRefParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_QualifiedActionServerRef_2=ruleQualifiedActionServerRef();

                    state._fsp--;


                    			current = this_QualifiedActionServerRef_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedRef"


    // $ANTLR start "entryRuleQualifiedPublisherRef"
    // InternalContextModelParser.g:946:1: entryRuleQualifiedPublisherRef returns [EObject current=null] : iv_ruleQualifiedPublisherRef= ruleQualifiedPublisherRef EOF ;
    public final EObject entryRuleQualifiedPublisherRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedPublisherRef = null;


        try {
            // InternalContextModelParser.g:946:62: (iv_ruleQualifiedPublisherRef= ruleQualifiedPublisherRef EOF )
            // InternalContextModelParser.g:947:2: iv_ruleQualifiedPublisherRef= ruleQualifiedPublisherRef EOF
            {
             newCompositeNode(grammarAccess.getQualifiedPublisherRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedPublisherRef=ruleQualifiedPublisherRef();

            state._fsp--;

             current =iv_ruleQualifiedPublisherRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedPublisherRef"


    // $ANTLR start "ruleQualifiedPublisherRef"
    // InternalContextModelParser.g:953:1: ruleQualifiedPublisherRef returns [EObject current=null] : (otherlv_0= Publisher ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) ) ;
    public final EObject ruleQualifiedPublisherRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:959:2: ( (otherlv_0= Publisher ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) ) )
            // InternalContextModelParser.g:960:2: (otherlv_0= Publisher ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) )
            {
            // InternalContextModelParser.g:960:2: (otherlv_0= Publisher ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) )
            // InternalContextModelParser.g:961:3: otherlv_0= Publisher ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,Publisher,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getQualifiedPublisherRefAccess().getPublisherKeyword_0());
            		
            // InternalContextModelParser.g:965:3: ( (otherlv_1= RULE_ID ) )
            // InternalContextModelParser.g:966:4: (otherlv_1= RULE_ID )
            {
            // InternalContextModelParser.g:966:4: (otherlv_1= RULE_ID )
            // InternalContextModelParser.g:967:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedPublisherRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getQualifiedPublisherRefAccess().getNodeRosNodeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,FullStop,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getQualifiedPublisherRefAccess().getFullStopKeyword_2());
            		
            // InternalContextModelParser.g:982:3: ( (otherlv_3= RULE_ID ) )
            // InternalContextModelParser.g:983:4: (otherlv_3= RULE_ID )
            {
            // InternalContextModelParser.g:983:4: (otherlv_3= RULE_ID )
            // InternalContextModelParser.g:984:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedPublisherRefRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getQualifiedPublisherRefAccess().getPublisherPublisherCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedPublisherRef"


    // $ANTLR start "entryRuleQualifiedServiceServerRef"
    // InternalContextModelParser.g:999:1: entryRuleQualifiedServiceServerRef returns [EObject current=null] : iv_ruleQualifiedServiceServerRef= ruleQualifiedServiceServerRef EOF ;
    public final EObject entryRuleQualifiedServiceServerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedServiceServerRef = null;


        try {
            // InternalContextModelParser.g:999:66: (iv_ruleQualifiedServiceServerRef= ruleQualifiedServiceServerRef EOF )
            // InternalContextModelParser.g:1000:2: iv_ruleQualifiedServiceServerRef= ruleQualifiedServiceServerRef EOF
            {
             newCompositeNode(grammarAccess.getQualifiedServiceServerRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedServiceServerRef=ruleQualifiedServiceServerRef();

            state._fsp--;

             current =iv_ruleQualifiedServiceServerRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedServiceServerRef"


    // $ANTLR start "ruleQualifiedServiceServerRef"
    // InternalContextModelParser.g:1006:1: ruleQualifiedServiceServerRef returns [EObject current=null] : (otherlv_0= Service_1 ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) otherlv_4= Request_kwargs ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) ) ;
    public final EObject ruleQualifiedServiceServerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_kwargs_5_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:1012:2: ( (otherlv_0= Service_1 ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) otherlv_4= Request_kwargs ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) ) )
            // InternalContextModelParser.g:1013:2: (otherlv_0= Service_1 ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) otherlv_4= Request_kwargs ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) )
            {
            // InternalContextModelParser.g:1013:2: (otherlv_0= Service_1 ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) otherlv_4= Request_kwargs ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) )
            // InternalContextModelParser.g:1014:3: otherlv_0= Service_1 ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) otherlv_4= Request_kwargs ( (lv_kwargs_5_0= ruleKeyWordArguments ) )
            {
            otherlv_0=(Token)match(input,Service_1,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getQualifiedServiceServerRefAccess().getServiceKeyword_0());
            		
            // InternalContextModelParser.g:1018:3: ( (otherlv_1= RULE_ID ) )
            // InternalContextModelParser.g:1019:4: (otherlv_1= RULE_ID )
            {
            // InternalContextModelParser.g:1019:4: (otherlv_1= RULE_ID )
            // InternalContextModelParser.g:1020:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedServiceServerRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getQualifiedServiceServerRefAccess().getNodeRosNodeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,FullStop,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getQualifiedServiceServerRefAccess().getFullStopKeyword_2());
            		
            // InternalContextModelParser.g:1035:3: ( (otherlv_3= RULE_ID ) )
            // InternalContextModelParser.g:1036:4: (otherlv_3= RULE_ID )
            {
            // InternalContextModelParser.g:1036:4: (otherlv_3= RULE_ID )
            // InternalContextModelParser.g:1037:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedServiceServerRefRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); 

            					newLeafNode(otherlv_3, grammarAccess.getQualifiedServiceServerRefAccess().getServiceServerServiceServerCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,Request_kwargs,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getQualifiedServiceServerRefAccess().getRequest_kwargsKeyword_4());
            		
            // InternalContextModelParser.g:1052:3: ( (lv_kwargs_5_0= ruleKeyWordArguments ) )
            // InternalContextModelParser.g:1053:4: (lv_kwargs_5_0= ruleKeyWordArguments )
            {
            // InternalContextModelParser.g:1053:4: (lv_kwargs_5_0= ruleKeyWordArguments )
            // InternalContextModelParser.g:1054:5: lv_kwargs_5_0= ruleKeyWordArguments
            {

            					newCompositeNode(grammarAccess.getQualifiedServiceServerRefAccess().getKwargsKeyWordArgumentsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_kwargs_5_0=ruleKeyWordArguments();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifiedServiceServerRefRule());
            					}
            					set(
            						current,
            						"kwargs",
            						lv_kwargs_5_0,
            						"eu.coresense.context.ContextModel.KeyWordArguments");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedServiceServerRef"


    // $ANTLR start "entryRuleQualifiedActionServerRef"
    // InternalContextModelParser.g:1075:1: entryRuleQualifiedActionServerRef returns [EObject current=null] : iv_ruleQualifiedActionServerRef= ruleQualifiedActionServerRef EOF ;
    public final EObject entryRuleQualifiedActionServerRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedActionServerRef = null;


        try {
            // InternalContextModelParser.g:1075:65: (iv_ruleQualifiedActionServerRef= ruleQualifiedActionServerRef EOF )
            // InternalContextModelParser.g:1076:2: iv_ruleQualifiedActionServerRef= ruleQualifiedActionServerRef EOF
            {
             newCompositeNode(grammarAccess.getQualifiedActionServerRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedActionServerRef=ruleQualifiedActionServerRef();

            state._fsp--;

             current =iv_ruleQualifiedActionServerRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleQualifiedActionServerRef"


    // $ANTLR start "ruleQualifiedActionServerRef"
    // InternalContextModelParser.g:1082:1: ruleQualifiedActionServerRef returns [EObject current=null] : (otherlv_0= Action_1 ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) otherlv_4= Goal_kwargs ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) ) ;
    public final EObject ruleQualifiedActionServerRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_kwargs_5_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:1088:2: ( (otherlv_0= Action_1 ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) otherlv_4= Goal_kwargs ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) ) )
            // InternalContextModelParser.g:1089:2: (otherlv_0= Action_1 ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) otherlv_4= Goal_kwargs ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) )
            {
            // InternalContextModelParser.g:1089:2: (otherlv_0= Action_1 ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) otherlv_4= Goal_kwargs ( (lv_kwargs_5_0= ruleKeyWordArguments ) ) )
            // InternalContextModelParser.g:1090:3: otherlv_0= Action_1 ( (otherlv_1= RULE_ID ) ) otherlv_2= FullStop ( (otherlv_3= RULE_ID ) ) otherlv_4= Goal_kwargs ( (lv_kwargs_5_0= ruleKeyWordArguments ) )
            {
            otherlv_0=(Token)match(input,Action_1,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getQualifiedActionServerRefAccess().getActionKeyword_0());
            		
            // InternalContextModelParser.g:1094:3: ( (otherlv_1= RULE_ID ) )
            // InternalContextModelParser.g:1095:4: (otherlv_1= RULE_ID )
            {
            // InternalContextModelParser.g:1095:4: (otherlv_1= RULE_ID )
            // InternalContextModelParser.g:1096:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedActionServerRefRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(otherlv_1, grammarAccess.getQualifiedActionServerRefAccess().getNodeRosNodeCrossReference_1_0());
            				

            }


            }

            otherlv_2=(Token)match(input,FullStop,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getQualifiedActionServerRefAccess().getFullStopKeyword_2());
            		
            // InternalContextModelParser.g:1111:3: ( (otherlv_3= RULE_ID ) )
            // InternalContextModelParser.g:1112:4: (otherlv_3= RULE_ID )
            {
            // InternalContextModelParser.g:1112:4: (otherlv_3= RULE_ID )
            // InternalContextModelParser.g:1113:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getQualifiedActionServerRefRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_3, grammarAccess.getQualifiedActionServerRefAccess().getActionServerActionServerCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,Goal_kwargs,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getQualifiedActionServerRefAccess().getGoal_kwargsKeyword_4());
            		
            // InternalContextModelParser.g:1128:3: ( (lv_kwargs_5_0= ruleKeyWordArguments ) )
            // InternalContextModelParser.g:1129:4: (lv_kwargs_5_0= ruleKeyWordArguments )
            {
            // InternalContextModelParser.g:1129:4: (lv_kwargs_5_0= ruleKeyWordArguments )
            // InternalContextModelParser.g:1130:5: lv_kwargs_5_0= ruleKeyWordArguments
            {

            					newCompositeNode(grammarAccess.getQualifiedActionServerRefAccess().getKwargsKeyWordArgumentsParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_kwargs_5_0=ruleKeyWordArguments();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getQualifiedActionServerRefRule());
            					}
            					set(
            						current,
            						"kwargs",
            						lv_kwargs_5_0,
            						"eu.coresense.context.ContextModel.KeyWordArguments");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedActionServerRef"


    // $ANTLR start "entryRuleImport"
    // InternalContextModelParser.g:1151:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalContextModelParser.g:1151:47: (iv_ruleImport= ruleImport EOF )
            // InternalContextModelParser.g:1152:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalContextModelParser.g:1158:1: ruleImport returns [EObject current=null] : (otherlv_0= Import ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= Semicolon ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_importURI_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:1164:2: ( (otherlv_0= Import ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= Semicolon ) )
            // InternalContextModelParser.g:1165:2: (otherlv_0= Import ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= Semicolon )
            {
            // InternalContextModelParser.g:1165:2: (otherlv_0= Import ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= Semicolon )
            // InternalContextModelParser.g:1166:3: otherlv_0= Import ( (lv_importURI_1_0= RULE_STRING ) ) otherlv_2= Semicolon
            {
            otherlv_0=(Token)match(input,Import,FOLLOW_24); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalContextModelParser.g:1170:3: ( (lv_importURI_1_0= RULE_STRING ) )
            // InternalContextModelParser.g:1171:4: (lv_importURI_1_0= RULE_STRING )
            {
            // InternalContextModelParser.g:1171:4: (lv_importURI_1_0= RULE_STRING )
            // InternalContextModelParser.g:1172:5: lv_importURI_1_0= RULE_STRING
            {
            lv_importURI_1_0=(Token)match(input,RULE_STRING,FOLLOW_36); 

            					newLeafNode(lv_importURI_1_0, grammarAccess.getImportAccess().getImportURISTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImportRule());
            					}
            					setWithLastConsumed(
            						current,
            						"importURI",
            						lv_importURI_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getImportAccess().getSemicolonKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleContextBoolean"
    // InternalContextModelParser.g:1196:1: entryRuleContextBoolean returns [String current=null] : iv_ruleContextBoolean= ruleContextBoolean EOF ;
    public final String entryRuleContextBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleContextBoolean = null;


        try {
            // InternalContextModelParser.g:1196:54: (iv_ruleContextBoolean= ruleContextBoolean EOF )
            // InternalContextModelParser.g:1197:2: iv_ruleContextBoolean= ruleContextBoolean EOF
            {
             newCompositeNode(grammarAccess.getContextBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextBoolean=ruleContextBoolean();

            state._fsp--;

             current =iv_ruleContextBoolean.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleContextBoolean"


    // $ANTLR start "ruleContextBoolean"
    // InternalContextModelParser.g:1203:1: ruleContextBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleContextBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:1209:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalContextModelParser.g:1210:2: this_BOOLEAN_0= RULE_BOOLEAN
            {
            this_BOOLEAN_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            		current.merge(this_BOOLEAN_0);
            	

            		newLeafNode(this_BOOLEAN_0, grammarAccess.getContextBooleanAccess().getBOOLEANTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContextBoolean"


    // $ANTLR start "entryRuleNamespace"
    // InternalContextModelParser.g:1220:1: entryRuleNamespace returns [EObject current=null] : iv_ruleNamespace= ruleNamespace EOF ;
    public final EObject entryRuleNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNamespace = null;


        try {
            // InternalContextModelParser.g:1220:50: (iv_ruleNamespace= ruleNamespace EOF )
            // InternalContextModelParser.g:1221:2: iv_ruleNamespace= ruleNamespace EOF
            {
             newCompositeNode(grammarAccess.getNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNamespace=ruleNamespace();

            state._fsp--;

             current =iv_ruleNamespace; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleNamespace"


    // $ANTLR start "ruleNamespace"
    // InternalContextModelParser.g:1227:1: ruleNamespace returns [EObject current=null] : (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) ;
    public final EObject ruleNamespace() throws RecognitionException {
        EObject current = null;

        EObject this_GlobalNamespace_0 = null;

        EObject this_RelativeNamespace_Impl_1 = null;

        EObject this_PrivateNamespace_2 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:1233:2: ( (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace ) )
            // InternalContextModelParser.g:1234:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            {
            // InternalContextModelParser.g:1234:2: (this_GlobalNamespace_0= ruleGlobalNamespace | this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl | this_PrivateNamespace_2= rulePrivateNamespace )
            int alt17=3;
            switch ( input.LA(1) ) {
            case GlobalNamespace:
                {
                alt17=1;
                }
                break;
            case RelativeNamespace:
                {
                alt17=2;
                }
                break;
            case PrivateNamespace:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalContextModelParser.g:1235:3: this_GlobalNamespace_0= ruleGlobalNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getGlobalNamespaceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_GlobalNamespace_0=ruleGlobalNamespace();

                    state._fsp--;


                    			current = this_GlobalNamespace_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalContextModelParser.g:1244:3: this_RelativeNamespace_Impl_1= ruleRelativeNamespace_Impl
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getRelativeNamespace_ImplParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RelativeNamespace_Impl_1=ruleRelativeNamespace_Impl();

                    state._fsp--;


                    			current = this_RelativeNamespace_Impl_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalContextModelParser.g:1253:3: this_PrivateNamespace_2= rulePrivateNamespace
                    {

                    			newCompositeNode(grammarAccess.getNamespaceAccess().getPrivateNamespaceParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrivateNamespace_2=rulePrivateNamespace();

                    state._fsp--;


                    			current = this_PrivateNamespace_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNamespace"


    // $ANTLR start "entryRuleGraphName"
    // InternalContextModelParser.g:1265:1: entryRuleGraphName returns [String current=null] : iv_ruleGraphName= ruleGraphName EOF ;
    public final String entryRuleGraphName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGraphName = null;


        try {
            // InternalContextModelParser.g:1265:49: (iv_ruleGraphName= ruleGraphName EOF )
            // InternalContextModelParser.g:1266:2: iv_ruleGraphName= ruleGraphName EOF
            {
             newCompositeNode(grammarAccess.getGraphNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGraphName=ruleGraphName();

            state._fsp--;

             current =iv_ruleGraphName.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGraphName"


    // $ANTLR start "ruleGraphName"
    // InternalContextModelParser.g:1272:1: ruleGraphName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= GraphName ;
    public final AntlrDatatypeRuleToken ruleGraphName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:1278:2: (kw= GraphName )
            // InternalContextModelParser.g:1279:2: kw= GraphName
            {
            kw=(Token)match(input,GraphName,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getGraphNameAccess().getGraphNameKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGraphName"


    // $ANTLR start "entryRuleGlobalNamespace"
    // InternalContextModelParser.g:1287:1: entryRuleGlobalNamespace returns [EObject current=null] : iv_ruleGlobalNamespace= ruleGlobalNamespace EOF ;
    public final EObject entryRuleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGlobalNamespace = null;


        try {
            // InternalContextModelParser.g:1287:56: (iv_ruleGlobalNamespace= ruleGlobalNamespace EOF )
            // InternalContextModelParser.g:1288:2: iv_ruleGlobalNamespace= ruleGlobalNamespace EOF
            {
             newCompositeNode(grammarAccess.getGlobalNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGlobalNamespace=ruleGlobalNamespace();

            state._fsp--;

             current =iv_ruleGlobalNamespace; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleGlobalNamespace"


    // $ANTLR start "ruleGlobalNamespace"
    // InternalContextModelParser.g:1294:1: ruleGlobalNamespace returns [EObject current=null] : ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
    public final EObject ruleGlobalNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_parts_3_0 = null;

        AntlrDatatypeRuleToken lv_parts_5_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:1300:2: ( ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalContextModelParser.g:1301:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalContextModelParser.g:1301:2: ( () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalContextModelParser.g:1302:3: () otherlv_1= GlobalNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalContextModelParser.g:1302:3: ()
            // InternalContextModelParser.g:1303:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,GlobalNamespace,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getGlobalNamespaceAccess().getGlobalNamespaceKeyword_1());
            		
            // InternalContextModelParser.g:1313:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==LeftSquareBracket) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalContextModelParser.g:1314:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_38); 

                    				newLeafNode(otherlv_2, grammarAccess.getGlobalNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalContextModelParser.g:1318:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalContextModelParser.g:1319:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalContextModelParser.g:1319:5: (lv_parts_3_0= ruleGraphName )
                    // InternalContextModelParser.g:1320:6: lv_parts_3_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_3_0,
                    							"de.fraunhofer.ipa.ros.Basics.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalContextModelParser.g:1337:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==Comma) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalContextModelParser.g:1338:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_38); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getGlobalNamespaceAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalContextModelParser.g:1342:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalContextModelParser.g:1343:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalContextModelParser.g:1343:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalContextModelParser.g:1344:7: lv_parts_5_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getGlobalNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getGlobalNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_5_0,
                    	    								"de.fraunhofer.ipa.ros.Basics.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getGlobalNamespaceAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGlobalNamespace"


    // $ANTLR start "entryRuleRelativeNamespace_Impl"
    // InternalContextModelParser.g:1371:1: entryRuleRelativeNamespace_Impl returns [EObject current=null] : iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF ;
    public final EObject entryRuleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelativeNamespace_Impl = null;


        try {
            // InternalContextModelParser.g:1371:63: (iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF )
            // InternalContextModelParser.g:1372:2: iv_ruleRelativeNamespace_Impl= ruleRelativeNamespace_Impl EOF
            {
             newCompositeNode(grammarAccess.getRelativeNamespace_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelativeNamespace_Impl=ruleRelativeNamespace_Impl();

            state._fsp--;

             current =iv_ruleRelativeNamespace_Impl; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleRelativeNamespace_Impl"


    // $ANTLR start "ruleRelativeNamespace_Impl"
    // InternalContextModelParser.g:1378:1: ruleRelativeNamespace_Impl returns [EObject current=null] : ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
    public final EObject ruleRelativeNamespace_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_parts_3_0 = null;

        AntlrDatatypeRuleToken lv_parts_5_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:1384:2: ( ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalContextModelParser.g:1385:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalContextModelParser.g:1385:2: ( () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalContextModelParser.g:1386:3: () otherlv_1= RelativeNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalContextModelParser.g:1386:3: ()
            // InternalContextModelParser.g:1387:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,RelativeNamespace,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getRelativeNamespace_ImplAccess().getRelativeNamespaceKeyword_1());
            		
            // InternalContextModelParser.g:1397:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==LeftSquareBracket) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalContextModelParser.g:1398:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_38); 

                    				newLeafNode(otherlv_2, grammarAccess.getRelativeNamespace_ImplAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalContextModelParser.g:1402:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalContextModelParser.g:1403:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalContextModelParser.g:1403:5: (lv_parts_3_0= ruleGraphName )
                    // InternalContextModelParser.g:1404:6: lv_parts_3_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_3_0,
                    							"de.fraunhofer.ipa.ros.Basics.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalContextModelParser.g:1421:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==Comma) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalContextModelParser.g:1422:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_38); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getRelativeNamespace_ImplAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalContextModelParser.g:1426:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalContextModelParser.g:1427:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalContextModelParser.g:1427:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalContextModelParser.g:1428:7: lv_parts_5_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getRelativeNamespace_ImplAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRelativeNamespace_ImplRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_5_0,
                    	    								"de.fraunhofer.ipa.ros.Basics.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getRelativeNamespace_ImplAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelativeNamespace_Impl"


    // $ANTLR start "entryRulePrivateNamespace"
    // InternalContextModelParser.g:1455:1: entryRulePrivateNamespace returns [EObject current=null] : iv_rulePrivateNamespace= rulePrivateNamespace EOF ;
    public final EObject entryRulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrivateNamespace = null;


        try {
            // InternalContextModelParser.g:1455:57: (iv_rulePrivateNamespace= rulePrivateNamespace EOF )
            // InternalContextModelParser.g:1456:2: iv_rulePrivateNamespace= rulePrivateNamespace EOF
            {
             newCompositeNode(grammarAccess.getPrivateNamespaceRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrivateNamespace=rulePrivateNamespace();

            state._fsp--;

             current =iv_rulePrivateNamespace; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrivateNamespace"


    // $ANTLR start "rulePrivateNamespace"
    // InternalContextModelParser.g:1462:1: rulePrivateNamespace returns [EObject current=null] : ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) ;
    public final EObject rulePrivateNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_parts_3_0 = null;

        AntlrDatatypeRuleToken lv_parts_5_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:1468:2: ( ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? ) )
            // InternalContextModelParser.g:1469:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            {
            // InternalContextModelParser.g:1469:2: ( () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )? )
            // InternalContextModelParser.g:1470:3: () otherlv_1= PrivateNamespace (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            {
            // InternalContextModelParser.g:1470:3: ()
            // InternalContextModelParser.g:1471:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,PrivateNamespace,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getPrivateNamespaceAccess().getPrivateNamespaceKeyword_1());
            		
            // InternalContextModelParser.g:1481:3: (otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==LeftSquareBracket) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalContextModelParser.g:1482:4: otherlv_2= LeftSquareBracket ( (lv_parts_3_0= ruleGraphName ) ) (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )* otherlv_6= RightSquareBracket
                    {
                    otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_38); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrivateNamespaceAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalContextModelParser.g:1486:4: ( (lv_parts_3_0= ruleGraphName ) )
                    // InternalContextModelParser.g:1487:5: (lv_parts_3_0= ruleGraphName )
                    {
                    // InternalContextModelParser.g:1487:5: (lv_parts_3_0= ruleGraphName )
                    // InternalContextModelParser.g:1488:6: lv_parts_3_0= ruleGraphName
                    {

                    						newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_39);
                    lv_parts_3_0=ruleGraphName();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    						}
                    						add(
                    							current,
                    							"parts",
                    							lv_parts_3_0,
                    							"de.fraunhofer.ipa.ros.Basics.GraphName");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalContextModelParser.g:1505:4: (otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalContextModelParser.g:1506:5: otherlv_4= Comma ( (lv_parts_5_0= ruleGraphName ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_38); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getPrivateNamespaceAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalContextModelParser.g:1510:5: ( (lv_parts_5_0= ruleGraphName ) )
                    	    // InternalContextModelParser.g:1511:6: (lv_parts_5_0= ruleGraphName )
                    	    {
                    	    // InternalContextModelParser.g:1511:6: (lv_parts_5_0= ruleGraphName )
                    	    // InternalContextModelParser.g:1512:7: lv_parts_5_0= ruleGraphName
                    	    {

                    	    							newCompositeNode(grammarAccess.getPrivateNamespaceAccess().getPartsGraphNameParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_39);
                    	    lv_parts_5_0=ruleGraphName();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getPrivateNamespaceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parts",
                    	    								lv_parts_5_0,
                    	    								"de.fraunhofer.ipa.ros.Basics.GraphName");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getPrivateNamespaceAccess().getRightSquareBracketKeyword_2_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrivateNamespace"


    // $ANTLR start "entryRuleParameterType"
    // InternalContextModelParser.g:1539:1: entryRuleParameterType returns [EObject current=null] : iv_ruleParameterType= ruleParameterType EOF ;
    public final EObject entryRuleParameterType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterType = null;


        try {
            // InternalContextModelParser.g:1539:54: (iv_ruleParameterType= ruleParameterType EOF )
            // InternalContextModelParser.g:1540:2: iv_ruleParameterType= ruleParameterType EOF
            {
             newCompositeNode(grammarAccess.getParameterTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterType=ruleParameterType();

            state._fsp--;

             current =iv_ruleParameterType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterType"


    // $ANTLR start "ruleParameterType"
    // InternalContextModelParser.g:1546:1: ruleParameterType returns [EObject current=null] : (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) ;
    public final EObject ruleParameterType() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterListType_0 = null;

        EObject this_ParameterStructType_1 = null;

        EObject this_ParameterIntegerType_2 = null;

        EObject this_ParameterStringType_3 = null;

        EObject this_ParameterDoubleType_4 = null;

        EObject this_ParameterBooleanType_5 = null;

        EObject this_ParameterBase64Type_6 = null;

        EObject this_ParameterArrayType_7 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:1552:2: ( (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType ) )
            // InternalContextModelParser.g:1553:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            {
            // InternalContextModelParser.g:1553:2: (this_ParameterListType_0= ruleParameterListType | this_ParameterStructType_1= ruleParameterStructType | this_ParameterIntegerType_2= ruleParameterIntegerType | this_ParameterStringType_3= ruleParameterStringType | this_ParameterDoubleType_4= ruleParameterDoubleType | this_ParameterBooleanType_5= ruleParameterBooleanType | this_ParameterBase64Type_6= ruleParameterBase64Type | this_ParameterArrayType_7= ruleParameterArrayType )
            int alt24=8;
            switch ( input.LA(1) ) {
            case List:
                {
                alt24=1;
                }
                break;
            case Struct:
                {
                alt24=2;
                }
                break;
            case Integer:
                {
                alt24=3;
                }
                break;
            case String:
                {
                alt24=4;
                }
                break;
            case Double:
                {
                alt24=5;
                }
                break;
            case Boolean:
                {
                alt24=6;
                }
                break;
            case Base64:
                {
                alt24=7;
                }
                break;
            case Array:
                {
                alt24=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalContextModelParser.g:1554:3: this_ParameterListType_0= ruleParameterListType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterListTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterListType_0=ruleParameterListType();

                    state._fsp--;


                    			current = this_ParameterListType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalContextModelParser.g:1563:3: this_ParameterStructType_1= ruleParameterStructType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStructTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStructType_1=ruleParameterStructType();

                    state._fsp--;


                    			current = this_ParameterStructType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalContextModelParser.g:1572:3: this_ParameterIntegerType_2= ruleParameterIntegerType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterIntegerTypeParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterIntegerType_2=ruleParameterIntegerType();

                    state._fsp--;


                    			current = this_ParameterIntegerType_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalContextModelParser.g:1581:3: this_ParameterStringType_3= ruleParameterStringType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterStringTypeParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStringType_3=ruleParameterStringType();

                    state._fsp--;


                    			current = this_ParameterStringType_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalContextModelParser.g:1590:3: this_ParameterDoubleType_4= ruleParameterDoubleType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterDoubleTypeParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDoubleType_4=ruleParameterDoubleType();

                    state._fsp--;


                    			current = this_ParameterDoubleType_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalContextModelParser.g:1599:3: this_ParameterBooleanType_5= ruleParameterBooleanType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBooleanTypeParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBooleanType_5=ruleParameterBooleanType();

                    state._fsp--;


                    			current = this_ParameterBooleanType_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalContextModelParser.g:1608:3: this_ParameterBase64Type_6= ruleParameterBase64Type
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterBase64TypeParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64Type_6=ruleParameterBase64Type();

                    state._fsp--;


                    			current = this_ParameterBase64Type_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalContextModelParser.g:1617:3: this_ParameterArrayType_7= ruleParameterArrayType
                    {

                    			newCompositeNode(grammarAccess.getParameterTypeAccess().getParameterArrayTypeParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterArrayType_7=ruleParameterArrayType();

                    state._fsp--;


                    			current = this_ParameterArrayType_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterType"


    // $ANTLR start "entryRuleParameterValue"
    // InternalContextModelParser.g:1629:1: entryRuleParameterValue returns [EObject current=null] : iv_ruleParameterValue= ruleParameterValue EOF ;
    public final EObject entryRuleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterValue = null;


        try {
            // InternalContextModelParser.g:1629:55: (iv_ruleParameterValue= ruleParameterValue EOF )
            // InternalContextModelParser.g:1630:2: iv_ruleParameterValue= ruleParameterValue EOF
            {
             newCompositeNode(grammarAccess.getParameterValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterValue=ruleParameterValue();

            state._fsp--;

             current =iv_ruleParameterValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterValue"


    // $ANTLR start "ruleParameterValue"
    // InternalContextModelParser.g:1636:1: ruleParameterValue returns [EObject current=null] : (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) ;
    public final EObject ruleParameterValue() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterString_0 = null;

        EObject this_ParameterBase64_1 = null;

        EObject this_ParameterInteger_2 = null;

        EObject this_ParameterDouble_3 = null;

        EObject this_ParameterBoolean_4 = null;

        EObject this_ParameterList_5 = null;

        EObject this_ParameterStruct_6 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:1642:2: ( (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct ) )
            // InternalContextModelParser.g:1643:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            {
            // InternalContextModelParser.g:1643:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )
            int alt25=7;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalContextModelParser.g:1644:3: this_ParameterString_0= ruleParameterString
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStringParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterString_0=ruleParameterString();

                    state._fsp--;


                    			current = this_ParameterString_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalContextModelParser.g:1653:3: this_ParameterBase64_1= ruleParameterBase64
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBase64ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBase64_1=ruleParameterBase64();

                    state._fsp--;


                    			current = this_ParameterBase64_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalContextModelParser.g:1662:3: this_ParameterInteger_2= ruleParameterInteger
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterIntegerParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterInteger_2=ruleParameterInteger();

                    state._fsp--;


                    			current = this_ParameterInteger_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalContextModelParser.g:1671:3: this_ParameterDouble_3= ruleParameterDouble
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterDoubleParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterDouble_3=ruleParameterDouble();

                    state._fsp--;


                    			current = this_ParameterDouble_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalContextModelParser.g:1680:3: this_ParameterBoolean_4= ruleParameterBoolean
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterBooleanParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterBoolean_4=ruleParameterBoolean();

                    state._fsp--;


                    			current = this_ParameterBoolean_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalContextModelParser.g:1689:3: this_ParameterList_5= ruleParameterList
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterListParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterList_5=ruleParameterList();

                    state._fsp--;


                    			current = this_ParameterList_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalContextModelParser.g:1698:3: this_ParameterStruct_6= ruleParameterStruct
                    {

                    			newCompositeNode(grammarAccess.getParameterValueAccess().getParameterStructParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterStruct_6=ruleParameterStruct();

                    state._fsp--;


                    			current = this_ParameterStruct_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterValue"


    // $ANTLR start "entryRuleParameterListType"
    // InternalContextModelParser.g:1710:1: entryRuleParameterListType returns [EObject current=null] : iv_ruleParameterListType= ruleParameterListType EOF ;
    public final EObject entryRuleParameterListType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterListType = null;


        try {
            // InternalContextModelParser.g:1710:58: (iv_ruleParameterListType= ruleParameterListType EOF )
            // InternalContextModelParser.g:1711:2: iv_ruleParameterListType= ruleParameterListType EOF
            {
             newCompositeNode(grammarAccess.getParameterListTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterListType=ruleParameterListType();

            state._fsp--;

             current =iv_ruleParameterListType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterListType"


    // $ANTLR start "ruleParameterListType"
    // InternalContextModelParser.g:1717:1: ruleParameterListType returns [EObject current=null] : ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) ;
    public final EObject ruleParameterListType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_sequence_3_0 = null;

        EObject lv_sequence_5_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:1723:2: ( ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalContextModelParser.g:1724:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalContextModelParser.g:1724:2: ( () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket )
            // InternalContextModelParser.g:1725:3: () otherlv_1= List otherlv_2= LeftSquareBracket ( (lv_sequence_3_0= ruleParameterType ) ) (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalContextModelParser.g:1725:3: ()
            // InternalContextModelParser.g:1726:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListTypeAccess().getParameterListTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,List,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListTypeAccess().getListKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterListTypeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalContextModelParser.g:1740:3: ( (lv_sequence_3_0= ruleParameterType ) )
            // InternalContextModelParser.g:1741:4: (lv_sequence_3_0= ruleParameterType )
            {
            // InternalContextModelParser.g:1741:4: (lv_sequence_3_0= ruleParameterType )
            // InternalContextModelParser.g:1742:5: lv_sequence_3_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_sequence_3_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
            					}
            					add(
            						current,
            						"sequence",
            						lv_sequence_3_0,
            						"de.fraunhofer.ipa.ros.Basics.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalContextModelParser.g:1759:3: (otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Comma) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalContextModelParser.g:1760:4: otherlv_4= Comma ( (lv_sequence_5_0= ruleParameterType ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_41); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterListTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalContextModelParser.g:1764:4: ( (lv_sequence_5_0= ruleParameterType ) )
            	    // InternalContextModelParser.g:1765:5: (lv_sequence_5_0= ruleParameterType )
            	    {
            	    // InternalContextModelParser.g:1765:5: (lv_sequence_5_0= ruleParameterType )
            	    // InternalContextModelParser.g:1766:6: lv_sequence_5_0= ruleParameterType
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListTypeAccess().getSequenceParameterTypeParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_sequence_5_0=ruleParameterType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterListTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"sequence",
            	    							lv_sequence_5_0,
            	    							"de.fraunhofer.ipa.ros.Basics.ParameterType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterListTypeAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterListType"


    // $ANTLR start "entryRuleParameterStructType"
    // InternalContextModelParser.g:1792:1: entryRuleParameterStructType returns [EObject current=null] : iv_ruleParameterStructType= ruleParameterStructType EOF ;
    public final EObject entryRuleParameterStructType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructType = null;


        try {
            // InternalContextModelParser.g:1792:60: (iv_ruleParameterStructType= ruleParameterStructType EOF )
            // InternalContextModelParser.g:1793:2: iv_ruleParameterStructType= ruleParameterStructType EOF
            {
             newCompositeNode(grammarAccess.getParameterStructTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructType=ruleParameterStructType();

            state._fsp--;

             current =iv_ruleParameterStructType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterStructType"


    // $ANTLR start "ruleParameterStructType"
    // InternalContextModelParser.g:1799:1: ruleParameterStructType returns [EObject current=null] : ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) ;
    public final EObject ruleParameterStructType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameterstructypetmember_3_0 = null;

        EObject lv_parameterstructypetmember_5_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:1805:2: ( ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket ) )
            // InternalContextModelParser.g:1806:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            {
            // InternalContextModelParser.g:1806:2: ( () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket )
            // InternalContextModelParser.g:1807:3: () otherlv_1= Struct otherlv_2= LeftSquareBracket ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) ) (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )* otherlv_6= RightSquareBracket
            {
            // InternalContextModelParser.g:1807:3: ()
            // InternalContextModelParser.g:1808:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructTypeAccess().getParameterStructTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Struct,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructTypeAccess().getStructKeyword_1());
            		
            otherlv_2=(Token)match(input,LeftSquareBracket,FOLLOW_42); 

            			newLeafNode(otherlv_2, grammarAccess.getParameterStructTypeAccess().getLeftSquareBracketKeyword_2());
            		
            // InternalContextModelParser.g:1822:3: ( (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember ) )
            // InternalContextModelParser.g:1823:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            {
            // InternalContextModelParser.g:1823:4: (lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember )
            // InternalContextModelParser.g:1824:5: lv_parameterstructypetmember_3_0= ruleParameterStructTypeMember
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_parameterstructypetmember_3_0=ruleParameterStructTypeMember();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
            					}
            					add(
            						current,
            						"parameterstructypetmember",
            						lv_parameterstructypetmember_3_0,
            						"de.fraunhofer.ipa.ros.Basics.ParameterStructTypeMember");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalContextModelParser.g:1841:3: (otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==Comma) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalContextModelParser.g:1842:4: otherlv_4= Comma ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    {
            	    otherlv_4=(Token)match(input,Comma,FOLLOW_42); 

            	    				newLeafNode(otherlv_4, grammarAccess.getParameterStructTypeAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalContextModelParser.g:1846:4: ( (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember ) )
            	    // InternalContextModelParser.g:1847:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    {
            	    // InternalContextModelParser.g:1847:5: (lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember )
            	    // InternalContextModelParser.g:1848:6: lv_parameterstructypetmember_5_0= ruleParameterStructTypeMember
            	    {

            	    						newCompositeNode(grammarAccess.getParameterStructTypeAccess().getParameterstructypetmemberParameterStructTypeMemberParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_parameterstructypetmember_5_0=ruleParameterStructTypeMember();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterStructTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parameterstructypetmember",
            	    							lv_parameterstructypetmember_5_0,
            	    							"de.fraunhofer.ipa.ros.Basics.ParameterStructTypeMember");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_6=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getParameterStructTypeAccess().getRightSquareBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStructType"


    // $ANTLR start "entryRuleParameterIntegerType"
    // InternalContextModelParser.g:1874:1: entryRuleParameterIntegerType returns [EObject current=null] : iv_ruleParameterIntegerType= ruleParameterIntegerType EOF ;
    public final EObject entryRuleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterIntegerType = null;


        try {
            // InternalContextModelParser.g:1874:61: (iv_ruleParameterIntegerType= ruleParameterIntegerType EOF )
            // InternalContextModelParser.g:1875:2: iv_ruleParameterIntegerType= ruleParameterIntegerType EOF
            {
             newCompositeNode(grammarAccess.getParameterIntegerTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterIntegerType=ruleParameterIntegerType();

            state._fsp--;

             current =iv_ruleParameterIntegerType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterIntegerType"


    // $ANTLR start "ruleParameterIntegerType"
    // InternalContextModelParser.g:1881:1: ruleParameterIntegerType returns [EObject current=null] : ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) ;
    public final EObject ruleParameterIntegerType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:1887:2: ( ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? ) )
            // InternalContextModelParser.g:1888:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            {
            // InternalContextModelParser.g:1888:2: ( () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )? )
            // InternalContextModelParser.g:1889:3: () otherlv_1= Integer (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            {
            // InternalContextModelParser.g:1889:3: ()
            // InternalContextModelParser.g:1890:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterIntegerTypeAccess().getParameterIntegerTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Integer,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterIntegerTypeAccess().getIntegerKeyword_1());
            		
            // InternalContextModelParser.g:1900:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==Default) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalContextModelParser.g:1901:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterInteger ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_44); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterIntegerTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalContextModelParser.g:1905:4: ( (lv_default_3_0= ruleParameterInteger ) )
                    // InternalContextModelParser.g:1906:5: (lv_default_3_0= ruleParameterInteger )
                    {
                    // InternalContextModelParser.g:1906:5: (lv_default_3_0= ruleParameterInteger )
                    // InternalContextModelParser.g:1907:6: lv_default_3_0= ruleParameterInteger
                    {

                    						newCompositeNode(grammarAccess.getParameterIntegerTypeAccess().getDefaultParameterIntegerParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterInteger();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterIntegerTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_3_0,
                    							"de.fraunhofer.ipa.ros.Basics.ParameterInteger");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterIntegerType"


    // $ANTLR start "entryRuleParameterStringType"
    // InternalContextModelParser.g:1929:1: entryRuleParameterStringType returns [EObject current=null] : iv_ruleParameterStringType= ruleParameterStringType EOF ;
    public final EObject entryRuleParameterStringType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStringType = null;


        try {
            // InternalContextModelParser.g:1929:60: (iv_ruleParameterStringType= ruleParameterStringType EOF )
            // InternalContextModelParser.g:1930:2: iv_ruleParameterStringType= ruleParameterStringType EOF
            {
             newCompositeNode(grammarAccess.getParameterStringTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStringType=ruleParameterStringType();

            state._fsp--;

             current =iv_ruleParameterStringType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterStringType"


    // $ANTLR start "ruleParameterStringType"
    // InternalContextModelParser.g:1936:1: ruleParameterStringType returns [EObject current=null] : ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) ;
    public final EObject ruleParameterStringType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:1942:2: ( ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? ) )
            // InternalContextModelParser.g:1943:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            {
            // InternalContextModelParser.g:1943:2: ( () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )? )
            // InternalContextModelParser.g:1944:3: () otherlv_1= String (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            {
            // InternalContextModelParser.g:1944:3: ()
            // InternalContextModelParser.g:1945:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStringTypeAccess().getParameterStringTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,String,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStringTypeAccess().getStringKeyword_1());
            		
            // InternalContextModelParser.g:1955:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Default) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalContextModelParser.g:1956:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterString ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_42); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterStringTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalContextModelParser.g:1960:4: ( (lv_default_3_0= ruleParameterString ) )
                    // InternalContextModelParser.g:1961:5: (lv_default_3_0= ruleParameterString )
                    {
                    // InternalContextModelParser.g:1961:5: (lv_default_3_0= ruleParameterString )
                    // InternalContextModelParser.g:1962:6: lv_default_3_0= ruleParameterString
                    {

                    						newCompositeNode(grammarAccess.getParameterStringTypeAccess().getDefaultParameterStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterStringTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_3_0,
                    							"de.fraunhofer.ipa.ros.Basics.ParameterString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStringType"


    // $ANTLR start "entryRuleParameterDoubleType"
    // InternalContextModelParser.g:1984:1: entryRuleParameterDoubleType returns [EObject current=null] : iv_ruleParameterDoubleType= ruleParameterDoubleType EOF ;
    public final EObject entryRuleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDoubleType = null;


        try {
            // InternalContextModelParser.g:1984:60: (iv_ruleParameterDoubleType= ruleParameterDoubleType EOF )
            // InternalContextModelParser.g:1985:2: iv_ruleParameterDoubleType= ruleParameterDoubleType EOF
            {
             newCompositeNode(grammarAccess.getParameterDoubleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDoubleType=ruleParameterDoubleType();

            state._fsp--;

             current =iv_ruleParameterDoubleType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterDoubleType"


    // $ANTLR start "ruleParameterDoubleType"
    // InternalContextModelParser.g:1991:1: ruleParameterDoubleType returns [EObject current=null] : ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) ;
    public final EObject ruleParameterDoubleType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:1997:2: ( ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? ) )
            // InternalContextModelParser.g:1998:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            {
            // InternalContextModelParser.g:1998:2: ( () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )? )
            // InternalContextModelParser.g:1999:3: () otherlv_1= Double (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            {
            // InternalContextModelParser.g:1999:3: ()
            // InternalContextModelParser.g:2000:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDoubleTypeAccess().getParameterDoubleTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Double,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterDoubleTypeAccess().getDoubleKeyword_1());
            		
            // InternalContextModelParser.g:2010:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==Default) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalContextModelParser.g:2011:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterDouble ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_45); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterDoubleTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalContextModelParser.g:2015:4: ( (lv_default_3_0= ruleParameterDouble ) )
                    // InternalContextModelParser.g:2016:5: (lv_default_3_0= ruleParameterDouble )
                    {
                    // InternalContextModelParser.g:2016:5: (lv_default_3_0= ruleParameterDouble )
                    // InternalContextModelParser.g:2017:6: lv_default_3_0= ruleParameterDouble
                    {

                    						newCompositeNode(grammarAccess.getParameterDoubleTypeAccess().getDefaultParameterDoubleParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterDouble();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterDoubleTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_3_0,
                    							"de.fraunhofer.ipa.ros.Basics.ParameterDouble");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDoubleType"


    // $ANTLR start "entryRuleParameterBooleanType"
    // InternalContextModelParser.g:2039:1: entryRuleParameterBooleanType returns [EObject current=null] : iv_ruleParameterBooleanType= ruleParameterBooleanType EOF ;
    public final EObject entryRuleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBooleanType = null;


        try {
            // InternalContextModelParser.g:2039:61: (iv_ruleParameterBooleanType= ruleParameterBooleanType EOF )
            // InternalContextModelParser.g:2040:2: iv_ruleParameterBooleanType= ruleParameterBooleanType EOF
            {
             newCompositeNode(grammarAccess.getParameterBooleanTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBooleanType=ruleParameterBooleanType();

            state._fsp--;

             current =iv_ruleParameterBooleanType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterBooleanType"


    // $ANTLR start "ruleParameterBooleanType"
    // InternalContextModelParser.g:2046:1: ruleParameterBooleanType returns [EObject current=null] : ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) ;
    public final EObject ruleParameterBooleanType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2052:2: ( ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? ) )
            // InternalContextModelParser.g:2053:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            {
            // InternalContextModelParser.g:2053:2: ( () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )? )
            // InternalContextModelParser.g:2054:3: () otherlv_1= Boolean (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            {
            // InternalContextModelParser.g:2054:3: ()
            // InternalContextModelParser.g:2055:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBooleanTypeAccess().getParameterBooleanTypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Boolean,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBooleanTypeAccess().getBooleanKeyword_1());
            		
            // InternalContextModelParser.g:2065:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==Default) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalContextModelParser.g:2066:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBoolean ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_13); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBooleanTypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalContextModelParser.g:2070:4: ( (lv_default_3_0= ruleParameterBoolean ) )
                    // InternalContextModelParser.g:2071:5: (lv_default_3_0= ruleParameterBoolean )
                    {
                    // InternalContextModelParser.g:2071:5: (lv_default_3_0= ruleParameterBoolean )
                    // InternalContextModelParser.g:2072:6: lv_default_3_0= ruleParameterBoolean
                    {

                    						newCompositeNode(grammarAccess.getParameterBooleanTypeAccess().getDefaultParameterBooleanParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterBoolean();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterBooleanTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_3_0,
                    							"de.fraunhofer.ipa.ros.Basics.ParameterBoolean");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBooleanType"


    // $ANTLR start "entryRuleParameterBase64Type"
    // InternalContextModelParser.g:2094:1: entryRuleParameterBase64Type returns [EObject current=null] : iv_ruleParameterBase64Type= ruleParameterBase64Type EOF ;
    public final EObject entryRuleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64Type = null;


        try {
            // InternalContextModelParser.g:2094:60: (iv_ruleParameterBase64Type= ruleParameterBase64Type EOF )
            // InternalContextModelParser.g:2095:2: iv_ruleParameterBase64Type= ruleParameterBase64Type EOF
            {
             newCompositeNode(grammarAccess.getParameterBase64TypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBase64Type=ruleParameterBase64Type();

            state._fsp--;

             current =iv_ruleParameterBase64Type; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterBase64Type"


    // $ANTLR start "ruleParameterBase64Type"
    // InternalContextModelParser.g:2101:1: ruleParameterBase64Type returns [EObject current=null] : ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) ;
    public final EObject ruleParameterBase64Type() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_default_3_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2107:2: ( ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? ) )
            // InternalContextModelParser.g:2108:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            {
            // InternalContextModelParser.g:2108:2: ( () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )? )
            // InternalContextModelParser.g:2109:3: () otherlv_1= Base64 (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            {
            // InternalContextModelParser.g:2109:3: ()
            // InternalContextModelParser.g:2110:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterBase64TypeAccess().getParameterBase64TypeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Base64,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterBase64TypeAccess().getBase64Keyword_1());
            		
            // InternalContextModelParser.g:2120:3: (otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Default) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalContextModelParser.g:2121:4: otherlv_2= Default ( (lv_default_3_0= ruleParameterBase64 ) )
                    {
                    otherlv_2=(Token)match(input,Default,FOLLOW_46); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterBase64TypeAccess().getDefaultKeyword_2_0());
                    			
                    // InternalContextModelParser.g:2125:4: ( (lv_default_3_0= ruleParameterBase64 ) )
                    // InternalContextModelParser.g:2126:5: (lv_default_3_0= ruleParameterBase64 )
                    {
                    // InternalContextModelParser.g:2126:5: (lv_default_3_0= ruleParameterBase64 )
                    // InternalContextModelParser.g:2127:6: lv_default_3_0= ruleParameterBase64
                    {

                    						newCompositeNode(grammarAccess.getParameterBase64TypeAccess().getDefaultParameterBase64ParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_3_0=ruleParameterBase64();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterBase64TypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_3_0,
                    							"de.fraunhofer.ipa.ros.Basics.ParameterBase64");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBase64Type"


    // $ANTLR start "entryRuleParameterArrayType"
    // InternalContextModelParser.g:2149:1: entryRuleParameterArrayType returns [EObject current=null] : iv_ruleParameterArrayType= ruleParameterArrayType EOF ;
    public final EObject entryRuleParameterArrayType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterArrayType = null;


        try {
            // InternalContextModelParser.g:2149:59: (iv_ruleParameterArrayType= ruleParameterArrayType EOF )
            // InternalContextModelParser.g:2150:2: iv_ruleParameterArrayType= ruleParameterArrayType EOF
            {
             newCompositeNode(grammarAccess.getParameterArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterArrayType=ruleParameterArrayType();

            state._fsp--;

             current =iv_ruleParameterArrayType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterArrayType"


    // $ANTLR start "ruleParameterArrayType"
    // InternalContextModelParser.g:2156:1: ruleParameterArrayType returns [EObject current=null] : (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? ) ;
    public final EObject ruleParameterArrayType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_type_2_0 = null;

        EObject lv_default_5_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2162:2: ( (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? ) )
            // InternalContextModelParser.g:2163:2: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? )
            {
            // InternalContextModelParser.g:2163:2: (otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )? )
            // InternalContextModelParser.g:2164:3: otherlv_0= Array otherlv_1= LeftSquareBracket ( (lv_type_2_0= ruleParameterType ) ) otherlv_3= RightSquareBracket (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )?
            {
            otherlv_0=(Token)match(input,Array,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getParameterArrayTypeAccess().getArrayKeyword_0());
            		
            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_41); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterArrayTypeAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalContextModelParser.g:2172:3: ( (lv_type_2_0= ruleParameterType ) )
            // InternalContextModelParser.g:2173:4: (lv_type_2_0= ruleParameterType )
            {
            // InternalContextModelParser.g:2173:4: (lv_type_2_0= ruleParameterType )
            // InternalContextModelParser.g:2174:5: lv_type_2_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getTypeParameterTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_47);
            lv_type_2_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"de.fraunhofer.ipa.ros.Basics.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,RightSquareBracket,FOLLOW_43); 

            			newLeafNode(otherlv_3, grammarAccess.getParameterArrayTypeAccess().getRightSquareBracketKeyword_3());
            		
            // InternalContextModelParser.g:2195:3: (otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Default) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalContextModelParser.g:2196:4: otherlv_4= Default ( (lv_default_5_0= ruleParameterList ) )
                    {
                    otherlv_4=(Token)match(input,Default,FOLLOW_40); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterArrayTypeAccess().getDefaultKeyword_4_0());
                    			
                    // InternalContextModelParser.g:2200:4: ( (lv_default_5_0= ruleParameterList ) )
                    // InternalContextModelParser.g:2201:5: (lv_default_5_0= ruleParameterList )
                    {
                    // InternalContextModelParser.g:2201:5: (lv_default_5_0= ruleParameterList )
                    // InternalContextModelParser.g:2202:6: lv_default_5_0= ruleParameterList
                    {

                    						newCompositeNode(grammarAccess.getParameterArrayTypeAccess().getDefaultParameterListParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_default_5_0=ruleParameterList();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterArrayTypeRule());
                    						}
                    						set(
                    							current,
                    							"default",
                    							lv_default_5_0,
                    							"de.fraunhofer.ipa.ros.Basics.ParameterList");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterArrayType"


    // $ANTLR start "entryRuleParameterList"
    // InternalContextModelParser.g:2224:1: entryRuleParameterList returns [EObject current=null] : iv_ruleParameterList= ruleParameterList EOF ;
    public final EObject entryRuleParameterList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterList = null;


        try {
            // InternalContextModelParser.g:2224:54: (iv_ruleParameterList= ruleParameterList EOF )
            // InternalContextModelParser.g:2225:2: iv_ruleParameterList= ruleParameterList EOF
            {
             newCompositeNode(grammarAccess.getParameterListRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterList=ruleParameterList();

            state._fsp--;

             current =iv_ruleParameterList; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterList"


    // $ANTLR start "ruleParameterList"
    // InternalContextModelParser.g:2231:1: ruleParameterList returns [EObject current=null] : ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) ;
    public final EObject ruleParameterList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2237:2: ( ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket ) )
            // InternalContextModelParser.g:2238:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            {
            // InternalContextModelParser.g:2238:2: ( () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket )
            // InternalContextModelParser.g:2239:3: () otherlv_1= LeftSquareBracket ( (lv_value_2_0= ruleParameterValue ) ) (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )* otherlv_5= RightSquareBracket
            {
            // InternalContextModelParser.g:2239:3: ()
            // InternalContextModelParser.g:2240:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterListAccess().getParameterSequenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterListAccess().getLeftSquareBracketKeyword_1());
            		
            // InternalContextModelParser.g:2250:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalContextModelParser.g:2251:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalContextModelParser.g:2251:4: (lv_value_2_0= ruleParameterValue )
            // InternalContextModelParser.g:2252:5: lv_value_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_39);
            lv_value_2_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterListRule());
            					}
            					add(
            						current,
            						"value",
            						lv_value_2_0,
            						"de.fraunhofer.ipa.ros.Basics.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalContextModelParser.g:2269:3: (otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalContextModelParser.g:2270:4: otherlv_3= Comma ( (lv_value_4_0= ruleParameterValue ) )
            	    {
            	    otherlv_3=(Token)match(input,Comma,FOLLOW_48); 

            	    				newLeafNode(otherlv_3, grammarAccess.getParameterListAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalContextModelParser.g:2274:4: ( (lv_value_4_0= ruleParameterValue ) )
            	    // InternalContextModelParser.g:2275:5: (lv_value_4_0= ruleParameterValue )
            	    {
            	    // InternalContextModelParser.g:2275:5: (lv_value_4_0= ruleParameterValue )
            	    // InternalContextModelParser.g:2276:6: lv_value_4_0= ruleParameterValue
            	    {

            	    						newCompositeNode(grammarAccess.getParameterListAccess().getValueParameterValueParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_value_4_0=ruleParameterValue();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getParameterListRule());
            	    						}
            	    						add(
            	    							current,
            	    							"value",
            	    							lv_value_4_0,
            	    							"de.fraunhofer.ipa.ros.Basics.ParameterValue");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getParameterListAccess().getRightSquareBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterList"


    // $ANTLR start "entryRuleParameterAny"
    // InternalContextModelParser.g:2302:1: entryRuleParameterAny returns [EObject current=null] : iv_ruleParameterAny= ruleParameterAny EOF ;
    public final EObject entryRuleParameterAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterAny = null;


        try {
            // InternalContextModelParser.g:2302:53: (iv_ruleParameterAny= ruleParameterAny EOF )
            // InternalContextModelParser.g:2303:2: iv_ruleParameterAny= ruleParameterAny EOF
            {
             newCompositeNode(grammarAccess.getParameterAnyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterAny=ruleParameterAny();

            state._fsp--;

             current =iv_ruleParameterAny; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterAny"


    // $ANTLR start "ruleParameterAny"
    // InternalContextModelParser.g:2309:1: ruleParameterAny returns [EObject current=null] : ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) ;
    public final EObject ruleParameterAny() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2315:2: ( ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? ) )
            // InternalContextModelParser.g:2316:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            {
            // InternalContextModelParser.g:2316:2: ( () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )? )
            // InternalContextModelParser.g:2317:3: () otherlv_1= ParameterAny (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            {
            // InternalContextModelParser.g:2317:3: ()
            // InternalContextModelParser.g:2318:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterAnyAccess().getParameterAnyAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,ParameterAny,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterAnyAccess().getParameterAnyKeyword_1());
            		
            // InternalContextModelParser.g:2328:3: (otherlv_2= Value ( (lv_value_3_0= ruleEString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==Value) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalContextModelParser.g:2329:4: otherlv_2= Value ( (lv_value_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,Value,FOLLOW_42); 

                    				newLeafNode(otherlv_2, grammarAccess.getParameterAnyAccess().getValueKeyword_2_0());
                    			
                    // InternalContextModelParser.g:2333:4: ( (lv_value_3_0= ruleEString ) )
                    // InternalContextModelParser.g:2334:5: (lv_value_3_0= ruleEString )
                    {
                    // InternalContextModelParser.g:2334:5: (lv_value_3_0= ruleEString )
                    // InternalContextModelParser.g:2335:6: lv_value_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getParameterAnyAccess().getValueEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterAnyRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_3_0,
                    							"de.fraunhofer.ipa.ros.Basics.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterAny"


    // $ANTLR start "entryRuleParameterString"
    // InternalContextModelParser.g:2357:1: entryRuleParameterString returns [EObject current=null] : iv_ruleParameterString= ruleParameterString EOF ;
    public final EObject entryRuleParameterString() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterString = null;


        try {
            // InternalContextModelParser.g:2357:56: (iv_ruleParameterString= ruleParameterString EOF )
            // InternalContextModelParser.g:2358:2: iv_ruleParameterString= ruleParameterString EOF
            {
             newCompositeNode(grammarAccess.getParameterStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterString=ruleParameterString();

            state._fsp--;

             current =iv_ruleParameterString; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterString"


    // $ANTLR start "ruleParameterString"
    // InternalContextModelParser.g:2364:1: ruleParameterString returns [EObject current=null] : ( (lv_value_0_0= ruleEString ) ) ;
    public final EObject ruleParameterString() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2370:2: ( ( (lv_value_0_0= ruleEString ) ) )
            // InternalContextModelParser.g:2371:2: ( (lv_value_0_0= ruleEString ) )
            {
            // InternalContextModelParser.g:2371:2: ( (lv_value_0_0= ruleEString ) )
            // InternalContextModelParser.g:2372:3: (lv_value_0_0= ruleEString )
            {
            // InternalContextModelParser.g:2372:3: (lv_value_0_0= ruleEString )
            // InternalContextModelParser.g:2373:4: lv_value_0_0= ruleEString
            {

            				newCompositeNode(grammarAccess.getParameterStringAccess().getValueEStringParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleEString();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterStringRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.ros.Basics.EString");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterString"


    // $ANTLR start "entryRuleParameterBase64"
    // InternalContextModelParser.g:2393:1: entryRuleParameterBase64 returns [EObject current=null] : iv_ruleParameterBase64= ruleParameterBase64 EOF ;
    public final EObject entryRuleParameterBase64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBase64 = null;


        try {
            // InternalContextModelParser.g:2393:56: (iv_ruleParameterBase64= ruleParameterBase64 EOF )
            // InternalContextModelParser.g:2394:2: iv_ruleParameterBase64= ruleParameterBase64 EOF
            {
             newCompositeNode(grammarAccess.getParameterBase64Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBase64=ruleParameterBase64();

            state._fsp--;

             current =iv_ruleParameterBase64; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterBase64"


    // $ANTLR start "ruleParameterBase64"
    // InternalContextModelParser.g:2400:1: ruleParameterBase64 returns [EObject current=null] : ( (lv_value_0_0= ruleBase64Binary ) ) ;
    public final EObject ruleParameterBase64() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2406:2: ( ( (lv_value_0_0= ruleBase64Binary ) ) )
            // InternalContextModelParser.g:2407:2: ( (lv_value_0_0= ruleBase64Binary ) )
            {
            // InternalContextModelParser.g:2407:2: ( (lv_value_0_0= ruleBase64Binary ) )
            // InternalContextModelParser.g:2408:3: (lv_value_0_0= ruleBase64Binary )
            {
            // InternalContextModelParser.g:2408:3: (lv_value_0_0= ruleBase64Binary )
            // InternalContextModelParser.g:2409:4: lv_value_0_0= ruleBase64Binary
            {

            				newCompositeNode(grammarAccess.getParameterBase64Access().getValueBase64BinaryParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleBase64Binary();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterBase64Rule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.ros.Basics.Base64Binary");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBase64"


    // $ANTLR start "entryRuleParameterInteger"
    // InternalContextModelParser.g:2429:1: entryRuleParameterInteger returns [EObject current=null] : iv_ruleParameterInteger= ruleParameterInteger EOF ;
    public final EObject entryRuleParameterInteger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterInteger = null;


        try {
            // InternalContextModelParser.g:2429:57: (iv_ruleParameterInteger= ruleParameterInteger EOF )
            // InternalContextModelParser.g:2430:2: iv_ruleParameterInteger= ruleParameterInteger EOF
            {
             newCompositeNode(grammarAccess.getParameterIntegerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterInteger=ruleParameterInteger();

            state._fsp--;

             current =iv_ruleParameterInteger; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterInteger"


    // $ANTLR start "ruleParameterInteger"
    // InternalContextModelParser.g:2436:1: ruleParameterInteger returns [EObject current=null] : ( (lv_value_0_0= ruleInteger0 ) ) ;
    public final EObject ruleParameterInteger() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2442:2: ( ( (lv_value_0_0= ruleInteger0 ) ) )
            // InternalContextModelParser.g:2443:2: ( (lv_value_0_0= ruleInteger0 ) )
            {
            // InternalContextModelParser.g:2443:2: ( (lv_value_0_0= ruleInteger0 ) )
            // InternalContextModelParser.g:2444:3: (lv_value_0_0= ruleInteger0 )
            {
            // InternalContextModelParser.g:2444:3: (lv_value_0_0= ruleInteger0 )
            // InternalContextModelParser.g:2445:4: lv_value_0_0= ruleInteger0
            {

            				newCompositeNode(grammarAccess.getParameterIntegerAccess().getValueInteger0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleInteger0();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterIntegerRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.ros.Basics.Integer0");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterInteger"


    // $ANTLR start "entryRuleParameterDouble"
    // InternalContextModelParser.g:2465:1: entryRuleParameterDouble returns [EObject current=null] : iv_ruleParameterDouble= ruleParameterDouble EOF ;
    public final EObject entryRuleParameterDouble() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDouble = null;


        try {
            // InternalContextModelParser.g:2465:56: (iv_ruleParameterDouble= ruleParameterDouble EOF )
            // InternalContextModelParser.g:2466:2: iv_ruleParameterDouble= ruleParameterDouble EOF
            {
             newCompositeNode(grammarAccess.getParameterDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDouble=ruleParameterDouble();

            state._fsp--;

             current =iv_ruleParameterDouble; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterDouble"


    // $ANTLR start "ruleParameterDouble"
    // InternalContextModelParser.g:2472:1: ruleParameterDouble returns [EObject current=null] : ( (lv_value_0_0= ruleDouble0 ) ) ;
    public final EObject ruleParameterDouble() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2478:2: ( ( (lv_value_0_0= ruleDouble0 ) ) )
            // InternalContextModelParser.g:2479:2: ( (lv_value_0_0= ruleDouble0 ) )
            {
            // InternalContextModelParser.g:2479:2: ( (lv_value_0_0= ruleDouble0 ) )
            // InternalContextModelParser.g:2480:3: (lv_value_0_0= ruleDouble0 )
            {
            // InternalContextModelParser.g:2480:3: (lv_value_0_0= ruleDouble0 )
            // InternalContextModelParser.g:2481:4: lv_value_0_0= ruleDouble0
            {

            				newCompositeNode(grammarAccess.getParameterDoubleAccess().getValueDouble0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDouble0();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterDoubleRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.ros.Basics.Double0");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDouble"


    // $ANTLR start "entryRuleParameterBoolean"
    // InternalContextModelParser.g:2501:1: entryRuleParameterBoolean returns [EObject current=null] : iv_ruleParameterBoolean= ruleParameterBoolean EOF ;
    public final EObject entryRuleParameterBoolean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterBoolean = null;


        try {
            // InternalContextModelParser.g:2501:57: (iv_ruleParameterBoolean= ruleParameterBoolean EOF )
            // InternalContextModelParser.g:2502:2: iv_ruleParameterBoolean= ruleParameterBoolean EOF
            {
             newCompositeNode(grammarAccess.getParameterBooleanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterBoolean=ruleParameterBoolean();

            state._fsp--;

             current =iv_ruleParameterBoolean; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterBoolean"


    // $ANTLR start "ruleParameterBoolean"
    // InternalContextModelParser.g:2508:1: ruleParameterBoolean returns [EObject current=null] : ( (lv_value_0_0= ruleboolean0 ) ) ;
    public final EObject ruleParameterBoolean() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2514:2: ( ( (lv_value_0_0= ruleboolean0 ) ) )
            // InternalContextModelParser.g:2515:2: ( (lv_value_0_0= ruleboolean0 ) )
            {
            // InternalContextModelParser.g:2515:2: ( (lv_value_0_0= ruleboolean0 ) )
            // InternalContextModelParser.g:2516:3: (lv_value_0_0= ruleboolean0 )
            {
            // InternalContextModelParser.g:2516:3: (lv_value_0_0= ruleboolean0 )
            // InternalContextModelParser.g:2517:4: lv_value_0_0= ruleboolean0
            {

            				newCompositeNode(grammarAccess.getParameterBooleanAccess().getValueBoolean0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleboolean0();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterBooleanRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.ros.Basics.boolean0");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterBoolean"


    // $ANTLR start "entryRuleParameterStruct"
    // InternalContextModelParser.g:2537:1: entryRuleParameterStruct returns [EObject current=null] : iv_ruleParameterStruct= ruleParameterStruct EOF ;
    public final EObject entryRuleParameterStruct() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStruct = null;


        try {
            // InternalContextModelParser.g:2537:56: (iv_ruleParameterStruct= ruleParameterStruct EOF )
            // InternalContextModelParser.g:2538:2: iv_ruleParameterStruct= ruleParameterStruct EOF
            {
             newCompositeNode(grammarAccess.getParameterStructRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStruct=ruleParameterStruct();

            state._fsp--;

             current =iv_ruleParameterStruct; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterStruct"


    // $ANTLR start "ruleParameterStruct"
    // InternalContextModelParser.g:2544:1: ruleParameterStruct returns [EObject current=null] : ( () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )? ) ;
    public final EObject ruleParameterStruct() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token this_BEGIN_2=null;
        Token otherlv_4=null;
        Token this_END_5=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2550:2: ( ( () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )? ) )
            // InternalContextModelParser.g:2551:2: ( () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )? )
            {
            // InternalContextModelParser.g:2551:2: ( () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )? )
            // InternalContextModelParser.g:2552:3: () (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )?
            {
            // InternalContextModelParser.g:2552:3: ()
            // InternalContextModelParser.g:2553:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterStructAccess().getParameterStructAction_0(),
            					current);
            			

            }

            // InternalContextModelParser.g:2559:3: (otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==LeftSquareBracket) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalContextModelParser.g:2560:4: otherlv_1= LeftSquareBracket this_BEGIN_2= RULE_BEGIN ( (lv_value_3_0= ruleParameterStructMember ) )* otherlv_4= RightSquareBracket this_END_5= RULE_END
                    {
                    otherlv_1=(Token)match(input,LeftSquareBracket,FOLLOW_50); 

                    				newLeafNode(otherlv_1, grammarAccess.getParameterStructAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    this_BEGIN_2=(Token)match(input,RULE_BEGIN,FOLLOW_51); 

                    				newLeafNode(this_BEGIN_2, grammarAccess.getParameterStructAccess().getBEGINTerminalRuleCall_1_1());
                    			
                    // InternalContextModelParser.g:2568:4: ( (lv_value_3_0= ruleParameterStructMember ) )*
                    loop36:
                    do {
                        int alt36=2;
                        int LA36_0 = input.LA(1);

                        if ( ((LA36_0>=RULE_ID && LA36_0<=RULE_STRING)) ) {
                            alt36=1;
                        }


                        switch (alt36) {
                    	case 1 :
                    	    // InternalContextModelParser.g:2569:5: (lv_value_3_0= ruleParameterStructMember )
                    	    {
                    	    // InternalContextModelParser.g:2569:5: (lv_value_3_0= ruleParameterStructMember )
                    	    // InternalContextModelParser.g:2570:6: lv_value_3_0= ruleParameterStructMember
                    	    {

                    	    						newCompositeNode(grammarAccess.getParameterStructAccess().getValueParameterStructMemberParserRuleCall_1_2_0());
                    	    					
                    	    pushFollow(FOLLOW_51);
                    	    lv_value_3_0=ruleParameterStructMember();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getParameterStructRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"value",
                    	    							lv_value_3_0,
                    	    							"de.fraunhofer.ipa.ros.Basics.ParameterStructMember");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop36;
                        }
                    } while (true);

                    otherlv_4=(Token)match(input,RightSquareBracket,FOLLOW_52); 

                    				newLeafNode(otherlv_4, grammarAccess.getParameterStructAccess().getRightSquareBracketKeyword_1_3());
                    			
                    this_END_5=(Token)match(input,RULE_END,FOLLOW_2); 

                    				newLeafNode(this_END_5, grammarAccess.getParameterStructAccess().getENDTerminalRuleCall_1_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStruct"


    // $ANTLR start "entryRuleParameterDate"
    // InternalContextModelParser.g:2600:1: entryRuleParameterDate returns [EObject current=null] : iv_ruleParameterDate= ruleParameterDate EOF ;
    public final EObject entryRuleParameterDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDate = null;


        try {
            // InternalContextModelParser.g:2600:54: (iv_ruleParameterDate= ruleParameterDate EOF )
            // InternalContextModelParser.g:2601:2: iv_ruleParameterDate= ruleParameterDate EOF
            {
             newCompositeNode(grammarAccess.getParameterDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDate=ruleParameterDate();

            state._fsp--;

             current =iv_ruleParameterDate; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterDate"


    // $ANTLR start "ruleParameterDate"
    // InternalContextModelParser.g:2607:1: ruleParameterDate returns [EObject current=null] : ( (lv_value_0_0= ruleDateTime0 ) ) ;
    public final EObject ruleParameterDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2613:2: ( ( (lv_value_0_0= ruleDateTime0 ) ) )
            // InternalContextModelParser.g:2614:2: ( (lv_value_0_0= ruleDateTime0 ) )
            {
            // InternalContextModelParser.g:2614:2: ( (lv_value_0_0= ruleDateTime0 ) )
            // InternalContextModelParser.g:2615:3: (lv_value_0_0= ruleDateTime0 )
            {
            // InternalContextModelParser.g:2615:3: (lv_value_0_0= ruleDateTime0 )
            // InternalContextModelParser.g:2616:4: lv_value_0_0= ruleDateTime0
            {

            				newCompositeNode(grammarAccess.getParameterDateAccess().getValueDateTime0ParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_value_0_0=ruleDateTime0();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getParameterDateRule());
            				}
            				set(
            					current,
            					"value",
            					lv_value_0_0,
            					"de.fraunhofer.ipa.ros.Basics.DateTime0");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterDate"


    // $ANTLR start "entryRuleParameterStructMember"
    // InternalContextModelParser.g:2636:1: entryRuleParameterStructMember returns [EObject current=null] : iv_ruleParameterStructMember= ruleParameterStructMember EOF ;
    public final EObject entryRuleParameterStructMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructMember = null;


        try {
            // InternalContextModelParser.g:2636:62: (iv_ruleParameterStructMember= ruleParameterStructMember EOF )
            // InternalContextModelParser.g:2637:2: iv_ruleParameterStructMember= ruleParameterStructMember EOF
            {
             newCompositeNode(grammarAccess.getParameterStructMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructMember=ruleParameterStructMember();

            state._fsp--;

             current =iv_ruleParameterStructMember; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterStructMember"


    // $ANTLR start "ruleParameterStructMember"
    // InternalContextModelParser.g:2643:1: ruleParameterStructMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) ) ) ;
    public final EObject ruleParameterStructMember() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2649:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) ) ) )
            // InternalContextModelParser.g:2650:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) ) )
            {
            // InternalContextModelParser.g:2650:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) ) )
            // InternalContextModelParser.g:2651:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= Colon ( (lv_value_2_0= ruleParameterValue ) )
            {
            // InternalContextModelParser.g:2651:3: ( (lv_name_0_0= ruleEString ) )
            // InternalContextModelParser.g:2652:4: (lv_name_0_0= ruleEString )
            {
            // InternalContextModelParser.g:2652:4: (lv_name_0_0= ruleEString )
            // InternalContextModelParser.g:2653:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.fraunhofer.ipa.ros.Basics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,Colon,FOLLOW_48); 

            			newLeafNode(otherlv_1, grammarAccess.getParameterStructMemberAccess().getColonKeyword_1());
            		
            // InternalContextModelParser.g:2674:3: ( (lv_value_2_0= ruleParameterValue ) )
            // InternalContextModelParser.g:2675:4: (lv_value_2_0= ruleParameterValue )
            {
            // InternalContextModelParser.g:2675:4: (lv_value_2_0= ruleParameterValue )
            // InternalContextModelParser.g:2676:5: lv_value_2_0= ruleParameterValue
            {

            					newCompositeNode(grammarAccess.getParameterStructMemberAccess().getValueParameterValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleParameterValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructMemberRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"de.fraunhofer.ipa.ros.Basics.ParameterValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStructMember"


    // $ANTLR start "entryRuleParameterStructTypeMember"
    // InternalContextModelParser.g:2697:1: entryRuleParameterStructTypeMember returns [EObject current=null] : iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF ;
    public final EObject entryRuleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterStructTypeMember = null;


        try {
            // InternalContextModelParser.g:2697:66: (iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF )
            // InternalContextModelParser.g:2698:2: iv_ruleParameterStructTypeMember= ruleParameterStructTypeMember EOF
            {
             newCompositeNode(grammarAccess.getParameterStructTypeMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterStructTypeMember=ruleParameterStructTypeMember();

            state._fsp--;

             current =iv_ruleParameterStructTypeMember; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleParameterStructTypeMember"


    // $ANTLR start "ruleParameterStructTypeMember"
    // InternalContextModelParser.g:2704:1: ruleParameterStructTypeMember returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) ;
    public final EObject ruleParameterStructTypeMember() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_type_1_0 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2710:2: ( ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) ) )
            // InternalContextModelParser.g:2711:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            {
            // InternalContextModelParser.g:2711:2: ( ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) ) )
            // InternalContextModelParser.g:2712:3: ( (lv_name_0_0= ruleEString ) ) ( (lv_type_1_0= ruleParameterType ) )
            {
            // InternalContextModelParser.g:2712:3: ( (lv_name_0_0= ruleEString ) )
            // InternalContextModelParser.g:2713:4: (lv_name_0_0= ruleEString )
            {
            // InternalContextModelParser.g:2713:4: (lv_name_0_0= ruleEString )
            // InternalContextModelParser.g:2714:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"de.fraunhofer.ipa.ros.Basics.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalContextModelParser.g:2731:3: ( (lv_type_1_0= ruleParameterType ) )
            // InternalContextModelParser.g:2732:4: (lv_type_1_0= ruleParameterType )
            {
            // InternalContextModelParser.g:2732:4: (lv_type_1_0= ruleParameterType )
            // InternalContextModelParser.g:2733:5: lv_type_1_0= ruleParameterType
            {

            					newCompositeNode(grammarAccess.getParameterStructTypeMemberAccess().getTypeParameterTypeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_1_0=ruleParameterType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getParameterStructTypeMemberRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_1_0,
            						"de.fraunhofer.ipa.ros.Basics.ParameterType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParameterStructTypeMember"


    // $ANTLR start "entryRuleBase64Binary"
    // InternalContextModelParser.g:2754:1: entryRuleBase64Binary returns [String current=null] : iv_ruleBase64Binary= ruleBase64Binary EOF ;
    public final String entryRuleBase64Binary() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBase64Binary = null;


        try {
            // InternalContextModelParser.g:2754:52: (iv_ruleBase64Binary= ruleBase64Binary EOF )
            // InternalContextModelParser.g:2755:2: iv_ruleBase64Binary= ruleBase64Binary EOF
            {
             newCompositeNode(grammarAccess.getBase64BinaryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBase64Binary=ruleBase64Binary();

            state._fsp--;

             current =iv_ruleBase64Binary.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBase64Binary"


    // $ANTLR start "ruleBase64Binary"
    // InternalContextModelParser.g:2761:1: ruleBase64Binary returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BINARY_0= RULE_BINARY ;
    public final AntlrDatatypeRuleToken ruleBase64Binary() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BINARY_0=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:2767:2: (this_BINARY_0= RULE_BINARY )
            // InternalContextModelParser.g:2768:2: this_BINARY_0= RULE_BINARY
            {
            this_BINARY_0=(Token)match(input,RULE_BINARY,FOLLOW_2); 

            		current.merge(this_BINARY_0);
            	

            		newLeafNode(this_BINARY_0, grammarAccess.getBase64BinaryAccess().getBINARYTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBase64Binary"


    // $ANTLR start "entryRuleboolean0"
    // InternalContextModelParser.g:2778:1: entryRuleboolean0 returns [String current=null] : iv_ruleboolean0= ruleboolean0 EOF ;
    public final String entryRuleboolean0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleboolean0 = null;


        try {
            // InternalContextModelParser.g:2778:48: (iv_ruleboolean0= ruleboolean0 EOF )
            // InternalContextModelParser.g:2779:2: iv_ruleboolean0= ruleboolean0 EOF
            {
             newCompositeNode(grammarAccess.getBoolean0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleboolean0=ruleboolean0();

            state._fsp--;

             current =iv_ruleboolean0.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleboolean0"


    // $ANTLR start "ruleboolean0"
    // InternalContextModelParser.g:2785:1: ruleboolean0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_BOOLEAN_0= RULE_BOOLEAN ;
    public final AntlrDatatypeRuleToken ruleboolean0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOLEAN_0=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:2791:2: (this_BOOLEAN_0= RULE_BOOLEAN )
            // InternalContextModelParser.g:2792:2: this_BOOLEAN_0= RULE_BOOLEAN
            {
            this_BOOLEAN_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_2); 

            		current.merge(this_BOOLEAN_0);
            	

            		newLeafNode(this_BOOLEAN_0, grammarAccess.getBoolean0Access().getBOOLEANTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleboolean0"


    // $ANTLR start "entryRuleDouble0"
    // InternalContextModelParser.g:2802:1: entryRuleDouble0 returns [String current=null] : iv_ruleDouble0= ruleDouble0 EOF ;
    public final String entryRuleDouble0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDouble0 = null;


        try {
            // InternalContextModelParser.g:2802:47: (iv_ruleDouble0= ruleDouble0 EOF )
            // InternalContextModelParser.g:2803:2: iv_ruleDouble0= ruleDouble0 EOF
            {
             newCompositeNode(grammarAccess.getDouble0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDouble0=ruleDouble0();

            state._fsp--;

             current =iv_ruleDouble0.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDouble0"


    // $ANTLR start "ruleDouble0"
    // InternalContextModelParser.g:2809:1: ruleDouble0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DOUBLE_0= RULE_DOUBLE ;
    public final AntlrDatatypeRuleToken ruleDouble0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOUBLE_0=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:2815:2: (this_DOUBLE_0= RULE_DOUBLE )
            // InternalContextModelParser.g:2816:2: this_DOUBLE_0= RULE_DOUBLE
            {
            this_DOUBLE_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

            		current.merge(this_DOUBLE_0);
            	

            		newLeafNode(this_DOUBLE_0, grammarAccess.getDouble0Access().getDOUBLETerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDouble0"


    // $ANTLR start "entryRuleInteger0"
    // InternalContextModelParser.g:2826:1: entryRuleInteger0 returns [String current=null] : iv_ruleInteger0= ruleInteger0 EOF ;
    public final String entryRuleInteger0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger0 = null;


        try {
            // InternalContextModelParser.g:2826:48: (iv_ruleInteger0= ruleInteger0 EOF )
            // InternalContextModelParser.g:2827:2: iv_ruleInteger0= ruleInteger0 EOF
            {
             newCompositeNode(grammarAccess.getInteger0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInteger0=ruleInteger0();

            state._fsp--;

             current =iv_ruleInteger0.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleInteger0"


    // $ANTLR start "ruleInteger0"
    // InternalContextModelParser.g:2833:1: ruleInteger0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DECINT_0= RULE_DECINT ;
    public final AntlrDatatypeRuleToken ruleInteger0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DECINT_0=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:2839:2: (this_DECINT_0= RULE_DECINT )
            // InternalContextModelParser.g:2840:2: this_DECINT_0= RULE_DECINT
            {
            this_DECINT_0=(Token)match(input,RULE_DECINT,FOLLOW_2); 

            		current.merge(this_DECINT_0);
            	

            		newLeafNode(this_DECINT_0, grammarAccess.getInteger0Access().getDECINTTerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger0"


    // $ANTLR start "entryRuleDateTime0"
    // InternalContextModelParser.g:2850:1: entryRuleDateTime0 returns [String current=null] : iv_ruleDateTime0= ruleDateTime0 EOF ;
    public final String entryRuleDateTime0() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDateTime0 = null;


        try {
            // InternalContextModelParser.g:2850:49: (iv_ruleDateTime0= ruleDateTime0 EOF )
            // InternalContextModelParser.g:2851:2: iv_ruleDateTime0= ruleDateTime0 EOF
            {
             newCompositeNode(grammarAccess.getDateTime0Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDateTime0=ruleDateTime0();

            state._fsp--;

             current =iv_ruleDateTime0.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleDateTime0"


    // $ANTLR start "ruleDateTime0"
    // InternalContextModelParser.g:2857:1: ruleDateTime0 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_DATE_TIME_0= RULE_DATE_TIME ;
    public final AntlrDatatypeRuleToken ruleDateTime0() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DATE_TIME_0=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:2863:2: (this_DATE_TIME_0= RULE_DATE_TIME )
            // InternalContextModelParser.g:2864:2: this_DATE_TIME_0= RULE_DATE_TIME
            {
            this_DATE_TIME_0=(Token)match(input,RULE_DATE_TIME,FOLLOW_2); 

            		current.merge(this_DATE_TIME_0);
            	

            		newLeafNode(this_DATE_TIME_0, grammarAccess.getDateTime0Access().getDATE_TIMETerminalRuleCall());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDateTime0"


    // $ANTLR start "entryRuleAbstractType"
    // InternalContextModelParser.g:2874:1: entryRuleAbstractType returns [EObject current=null] : iv_ruleAbstractType= ruleAbstractType EOF ;
    public final EObject entryRuleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbstractType = null;


        try {
            // InternalContextModelParser.g:2874:53: (iv_ruleAbstractType= ruleAbstractType EOF )
            // InternalContextModelParser.g:2875:2: iv_ruleAbstractType= ruleAbstractType EOF
            {
             newCompositeNode(grammarAccess.getAbstractTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractType=ruleAbstractType();

            state._fsp--;

             current =iv_ruleAbstractType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractType"


    // $ANTLR start "ruleAbstractType"
    // InternalContextModelParser.g:2881:1: ruleAbstractType returns [EObject current=null] : (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray ) ;
    public final EObject ruleAbstractType() throws RecognitionException {
        EObject current = null;

        EObject this_bool_0 = null;

        EObject this_int8_1 = null;

        EObject this_uint8_2 = null;

        EObject this_int16_3 = null;

        EObject this_uint16_4 = null;

        EObject this_int32_5 = null;

        EObject this_uint32_6 = null;

        EObject this_int64_7 = null;

        EObject this_uint64_8 = null;

        EObject this_float32_9 = null;

        EObject this_float64_10 = null;

        EObject this_string0_11 = null;

        EObject this_byte_12 = null;

        EObject this_time_13 = null;

        EObject this_duration_14 = null;

        EObject this_Header_15 = null;

        EObject this_boolArray_16 = null;

        EObject this_int8Array_17 = null;

        EObject this_uint8Array_18 = null;

        EObject this_int16Array_19 = null;

        EObject this_uint16Array_20 = null;

        EObject this_int32Array_21 = null;

        EObject this_uint32Array_22 = null;

        EObject this_int64Array_23 = null;

        EObject this_uint64Array_24 = null;

        EObject this_float32Array_25 = null;

        EObject this_float64Array_26 = null;

        EObject this_string0Array_27 = null;

        EObject this_byteArray_28 = null;

        EObject this_SpecBaseRef_29 = null;

        EObject this_ArraySpecRef_30 = null;

        EObject this_char_31 = null;

        EObject this_charArray_32 = null;



        	enterRule();

        try {
            // InternalContextModelParser.g:2887:2: ( (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray ) )
            // InternalContextModelParser.g:2888:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )
            {
            // InternalContextModelParser.g:2888:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )
            int alt38=33;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalContextModelParser.g:2889:3: this_bool_0= rulebool
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getBoolParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_bool_0=rulebool();

                    state._fsp--;


                    			current = this_bool_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalContextModelParser.g:2898:3: this_int8_1= ruleint8
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt8ParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_int8_1=ruleint8();

                    state._fsp--;


                    			current = this_int8_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalContextModelParser.g:2907:3: this_uint8_2= ruleuint8
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint8ParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint8_2=ruleuint8();

                    state._fsp--;


                    			current = this_uint8_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalContextModelParser.g:2916:3: this_int16_3= ruleint16
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt16ParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_int16_3=ruleint16();

                    state._fsp--;


                    			current = this_int16_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalContextModelParser.g:2925:3: this_uint16_4= ruleuint16
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint16ParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint16_4=ruleuint16();

                    state._fsp--;


                    			current = this_uint16_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalContextModelParser.g:2934:3: this_int32_5= ruleint32
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt32ParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_int32_5=ruleint32();

                    state._fsp--;


                    			current = this_int32_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalContextModelParser.g:2943:3: this_uint32_6= ruleuint32
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint32ParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint32_6=ruleuint32();

                    state._fsp--;


                    			current = this_uint32_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalContextModelParser.g:2952:3: this_int64_7= ruleint64
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt64ParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_int64_7=ruleint64();

                    state._fsp--;


                    			current = this_int64_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalContextModelParser.g:2961:3: this_uint64_8= ruleuint64
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint64ParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint64_8=ruleuint64();

                    state._fsp--;


                    			current = this_uint64_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalContextModelParser.g:2970:3: this_float32_9= rulefloat32
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat32ParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_float32_9=rulefloat32();

                    state._fsp--;


                    			current = this_float32_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalContextModelParser.g:2979:3: this_float64_10= rulefloat64
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat64ParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_float64_10=rulefloat64();

                    state._fsp--;


                    			current = this_float64_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalContextModelParser.g:2988:3: this_string0_11= rulestring0
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getString0ParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_string0_11=rulestring0();

                    state._fsp--;


                    			current = this_string0_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalContextModelParser.g:2997:3: this_byte_12= rulebyte
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getByteParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_byte_12=rulebyte();

                    state._fsp--;


                    			current = this_byte_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 14 :
                    // InternalContextModelParser.g:3006:3: this_time_13= ruletime
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getTimeParserRuleCall_13());
                    		
                    pushFollow(FOLLOW_2);
                    this_time_13=ruletime();

                    state._fsp--;


                    			current = this_time_13;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 15 :
                    // InternalContextModelParser.g:3015:3: this_duration_14= ruleduration
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getDurationParserRuleCall_14());
                    		
                    pushFollow(FOLLOW_2);
                    this_duration_14=ruleduration();

                    state._fsp--;


                    			current = this_duration_14;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 16 :
                    // InternalContextModelParser.g:3024:3: this_Header_15= ruleHeader
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getHeaderParserRuleCall_15());
                    		
                    pushFollow(FOLLOW_2);
                    this_Header_15=ruleHeader();

                    state._fsp--;


                    			current = this_Header_15;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 17 :
                    // InternalContextModelParser.g:3033:3: this_boolArray_16= ruleboolArray
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getBoolArrayParserRuleCall_16());
                    		
                    pushFollow(FOLLOW_2);
                    this_boolArray_16=ruleboolArray();

                    state._fsp--;


                    			current = this_boolArray_16;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 18 :
                    // InternalContextModelParser.g:3042:3: this_int8Array_17= ruleint8Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt8ArrayParserRuleCall_17());
                    		
                    pushFollow(FOLLOW_2);
                    this_int8Array_17=ruleint8Array();

                    state._fsp--;


                    			current = this_int8Array_17;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 19 :
                    // InternalContextModelParser.g:3051:3: this_uint8Array_18= ruleuint8Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint8ArrayParserRuleCall_18());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint8Array_18=ruleuint8Array();

                    state._fsp--;


                    			current = this_uint8Array_18;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 20 :
                    // InternalContextModelParser.g:3060:3: this_int16Array_19= ruleint16Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt16ArrayParserRuleCall_19());
                    		
                    pushFollow(FOLLOW_2);
                    this_int16Array_19=ruleint16Array();

                    state._fsp--;


                    			current = this_int16Array_19;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 21 :
                    // InternalContextModelParser.g:3069:3: this_uint16Array_20= ruleuint16Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint16ArrayParserRuleCall_20());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint16Array_20=ruleuint16Array();

                    state._fsp--;


                    			current = this_uint16Array_20;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 22 :
                    // InternalContextModelParser.g:3078:3: this_int32Array_21= ruleint32Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt32ArrayParserRuleCall_21());
                    		
                    pushFollow(FOLLOW_2);
                    this_int32Array_21=ruleint32Array();

                    state._fsp--;


                    			current = this_int32Array_21;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 23 :
                    // InternalContextModelParser.g:3087:3: this_uint32Array_22= ruleuint32Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint32ArrayParserRuleCall_22());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint32Array_22=ruleuint32Array();

                    state._fsp--;


                    			current = this_uint32Array_22;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 24 :
                    // InternalContextModelParser.g:3096:3: this_int64Array_23= ruleint64Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getInt64ArrayParserRuleCall_23());
                    		
                    pushFollow(FOLLOW_2);
                    this_int64Array_23=ruleint64Array();

                    state._fsp--;


                    			current = this_int64Array_23;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 25 :
                    // InternalContextModelParser.g:3105:3: this_uint64Array_24= ruleuint64Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getUint64ArrayParserRuleCall_24());
                    		
                    pushFollow(FOLLOW_2);
                    this_uint64Array_24=ruleuint64Array();

                    state._fsp--;


                    			current = this_uint64Array_24;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 26 :
                    // InternalContextModelParser.g:3114:3: this_float32Array_25= rulefloat32Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat32ArrayParserRuleCall_25());
                    		
                    pushFollow(FOLLOW_2);
                    this_float32Array_25=rulefloat32Array();

                    state._fsp--;


                    			current = this_float32Array_25;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 27 :
                    // InternalContextModelParser.g:3123:3: this_float64Array_26= rulefloat64Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getFloat64ArrayParserRuleCall_26());
                    		
                    pushFollow(FOLLOW_2);
                    this_float64Array_26=rulefloat64Array();

                    state._fsp--;


                    			current = this_float64Array_26;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 28 :
                    // InternalContextModelParser.g:3132:3: this_string0Array_27= rulestring0Array
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getString0ArrayParserRuleCall_27());
                    		
                    pushFollow(FOLLOW_2);
                    this_string0Array_27=rulestring0Array();

                    state._fsp--;


                    			current = this_string0Array_27;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 29 :
                    // InternalContextModelParser.g:3141:3: this_byteArray_28= rulebyteArray
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getByteArrayParserRuleCall_28());
                    		
                    pushFollow(FOLLOW_2);
                    this_byteArray_28=rulebyteArray();

                    state._fsp--;


                    			current = this_byteArray_28;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 30 :
                    // InternalContextModelParser.g:3150:3: this_SpecBaseRef_29= ruleSpecBaseRef
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getSpecBaseRefParserRuleCall_29());
                    		
                    pushFollow(FOLLOW_2);
                    this_SpecBaseRef_29=ruleSpecBaseRef();

                    state._fsp--;


                    			current = this_SpecBaseRef_29;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 31 :
                    // InternalContextModelParser.g:3159:3: this_ArraySpecRef_30= ruleArraySpecRef
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getArraySpecRefParserRuleCall_30());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArraySpecRef_30=ruleArraySpecRef();

                    state._fsp--;


                    			current = this_ArraySpecRef_30;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 32 :
                    // InternalContextModelParser.g:3168:3: this_char_31= rulechar
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getCharParserRuleCall_31());
                    		
                    pushFollow(FOLLOW_2);
                    this_char_31=rulechar();

                    state._fsp--;


                    			current = this_char_31;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 33 :
                    // InternalContextModelParser.g:3177:3: this_charArray_32= rulecharArray
                    {

                    			newCompositeNode(grammarAccess.getAbstractTypeAccess().getCharArrayParserRuleCall_32());
                    		
                    pushFollow(FOLLOW_2);
                    this_charArray_32=rulecharArray();

                    state._fsp--;


                    			current = this_charArray_32;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractType"


    // $ANTLR start "entryRulebool"
    // InternalContextModelParser.g:3189:1: entryRulebool returns [EObject current=null] : iv_rulebool= rulebool EOF ;
    public final EObject entryRulebool() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebool = null;


        try {
            // InternalContextModelParser.g:3189:45: (iv_rulebool= rulebool EOF )
            // InternalContextModelParser.g:3190:2: iv_rulebool= rulebool EOF
            {
             newCompositeNode(grammarAccess.getBoolRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebool=rulebool();

            state._fsp--;

             current =iv_rulebool; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulebool"


    // $ANTLR start "rulebool"
    // InternalContextModelParser.g:3196:1: rulebool returns [EObject current=null] : ( () otherlv_1= Bool ) ;
    public final EObject rulebool() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3202:2: ( ( () otherlv_1= Bool ) )
            // InternalContextModelParser.g:3203:2: ( () otherlv_1= Bool )
            {
            // InternalContextModelParser.g:3203:2: ( () otherlv_1= Bool )
            // InternalContextModelParser.g:3204:3: () otherlv_1= Bool
            {
            // InternalContextModelParser.g:3204:3: ()
            // InternalContextModelParser.g:3205:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolAccess().getBoolAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Bool,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolAccess().getBoolKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebool"


    // $ANTLR start "entryRuleint8"
    // InternalContextModelParser.g:3219:1: entryRuleint8 returns [EObject current=null] : iv_ruleint8= ruleint8 EOF ;
    public final EObject entryRuleint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8 = null;


        try {
            // InternalContextModelParser.g:3219:45: (iv_ruleint8= ruleint8 EOF )
            // InternalContextModelParser.g:3220:2: iv_ruleint8= ruleint8 EOF
            {
             newCompositeNode(grammarAccess.getInt8Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint8=ruleint8();

            state._fsp--;

             current =iv_ruleint8; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleint8"


    // $ANTLR start "ruleint8"
    // InternalContextModelParser.g:3226:1: ruleint8 returns [EObject current=null] : ( () otherlv_1= Int8 ) ;
    public final EObject ruleint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3232:2: ( ( () otherlv_1= Int8 ) )
            // InternalContextModelParser.g:3233:2: ( () otherlv_1= Int8 )
            {
            // InternalContextModelParser.g:3233:2: ( () otherlv_1= Int8 )
            // InternalContextModelParser.g:3234:3: () otherlv_1= Int8
            {
            // InternalContextModelParser.g:3234:3: ()
            // InternalContextModelParser.g:3235:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt8Access().getInt8Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int8,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt8Access().getInt8Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint8"


    // $ANTLR start "entryRuleuint8"
    // InternalContextModelParser.g:3249:1: entryRuleuint8 returns [EObject current=null] : iv_ruleuint8= ruleuint8 EOF ;
    public final EObject entryRuleuint8() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8 = null;


        try {
            // InternalContextModelParser.g:3249:46: (iv_ruleuint8= ruleuint8 EOF )
            // InternalContextModelParser.g:3250:2: iv_ruleuint8= ruleuint8 EOF
            {
             newCompositeNode(grammarAccess.getUint8Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint8=ruleuint8();

            state._fsp--;

             current =iv_ruleuint8; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleuint8"


    // $ANTLR start "ruleuint8"
    // InternalContextModelParser.g:3256:1: ruleuint8 returns [EObject current=null] : ( () otherlv_1= Uint8 ) ;
    public final EObject ruleuint8() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3262:2: ( ( () otherlv_1= Uint8 ) )
            // InternalContextModelParser.g:3263:2: ( () otherlv_1= Uint8 )
            {
            // InternalContextModelParser.g:3263:2: ( () otherlv_1= Uint8 )
            // InternalContextModelParser.g:3264:3: () otherlv_1= Uint8
            {
            // InternalContextModelParser.g:3264:3: ()
            // InternalContextModelParser.g:3265:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint8Access().getUint8Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint8,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint8Access().getUint8Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint8"


    // $ANTLR start "entryRuleint16"
    // InternalContextModelParser.g:3279:1: entryRuleint16 returns [EObject current=null] : iv_ruleint16= ruleint16 EOF ;
    public final EObject entryRuleint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16 = null;


        try {
            // InternalContextModelParser.g:3279:46: (iv_ruleint16= ruleint16 EOF )
            // InternalContextModelParser.g:3280:2: iv_ruleint16= ruleint16 EOF
            {
             newCompositeNode(grammarAccess.getInt16Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint16=ruleint16();

            state._fsp--;

             current =iv_ruleint16; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleint16"


    // $ANTLR start "ruleint16"
    // InternalContextModelParser.g:3286:1: ruleint16 returns [EObject current=null] : ( () otherlv_1= Int16 ) ;
    public final EObject ruleint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3292:2: ( ( () otherlv_1= Int16 ) )
            // InternalContextModelParser.g:3293:2: ( () otherlv_1= Int16 )
            {
            // InternalContextModelParser.g:3293:2: ( () otherlv_1= Int16 )
            // InternalContextModelParser.g:3294:3: () otherlv_1= Int16
            {
            // InternalContextModelParser.g:3294:3: ()
            // InternalContextModelParser.g:3295:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt16Access().getInt16Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int16,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt16Access().getInt16Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint16"


    // $ANTLR start "entryRuleuint16"
    // InternalContextModelParser.g:3309:1: entryRuleuint16 returns [EObject current=null] : iv_ruleuint16= ruleuint16 EOF ;
    public final EObject entryRuleuint16() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16 = null;


        try {
            // InternalContextModelParser.g:3309:47: (iv_ruleuint16= ruleuint16 EOF )
            // InternalContextModelParser.g:3310:2: iv_ruleuint16= ruleuint16 EOF
            {
             newCompositeNode(grammarAccess.getUint16Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint16=ruleuint16();

            state._fsp--;

             current =iv_ruleuint16; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleuint16"


    // $ANTLR start "ruleuint16"
    // InternalContextModelParser.g:3316:1: ruleuint16 returns [EObject current=null] : ( () otherlv_1= Uint16 ) ;
    public final EObject ruleuint16() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3322:2: ( ( () otherlv_1= Uint16 ) )
            // InternalContextModelParser.g:3323:2: ( () otherlv_1= Uint16 )
            {
            // InternalContextModelParser.g:3323:2: ( () otherlv_1= Uint16 )
            // InternalContextModelParser.g:3324:3: () otherlv_1= Uint16
            {
            // InternalContextModelParser.g:3324:3: ()
            // InternalContextModelParser.g:3325:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint16Access().getUint16Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint16,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint16Access().getUint16Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint16"


    // $ANTLR start "entryRuleint32"
    // InternalContextModelParser.g:3339:1: entryRuleint32 returns [EObject current=null] : iv_ruleint32= ruleint32 EOF ;
    public final EObject entryRuleint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32 = null;


        try {
            // InternalContextModelParser.g:3339:46: (iv_ruleint32= ruleint32 EOF )
            // InternalContextModelParser.g:3340:2: iv_ruleint32= ruleint32 EOF
            {
             newCompositeNode(grammarAccess.getInt32Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint32=ruleint32();

            state._fsp--;

             current =iv_ruleint32; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleint32"


    // $ANTLR start "ruleint32"
    // InternalContextModelParser.g:3346:1: ruleint32 returns [EObject current=null] : ( () otherlv_1= Int32 ) ;
    public final EObject ruleint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3352:2: ( ( () otherlv_1= Int32 ) )
            // InternalContextModelParser.g:3353:2: ( () otherlv_1= Int32 )
            {
            // InternalContextModelParser.g:3353:2: ( () otherlv_1= Int32 )
            // InternalContextModelParser.g:3354:3: () otherlv_1= Int32
            {
            // InternalContextModelParser.g:3354:3: ()
            // InternalContextModelParser.g:3355:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt32Access().getInt32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt32Access().getInt32Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint32"


    // $ANTLR start "entryRuleuint32"
    // InternalContextModelParser.g:3369:1: entryRuleuint32 returns [EObject current=null] : iv_ruleuint32= ruleuint32 EOF ;
    public final EObject entryRuleuint32() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32 = null;


        try {
            // InternalContextModelParser.g:3369:47: (iv_ruleuint32= ruleuint32 EOF )
            // InternalContextModelParser.g:3370:2: iv_ruleuint32= ruleuint32 EOF
            {
             newCompositeNode(grammarAccess.getUint32Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint32=ruleuint32();

            state._fsp--;

             current =iv_ruleuint32; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleuint32"


    // $ANTLR start "ruleuint32"
    // InternalContextModelParser.g:3376:1: ruleuint32 returns [EObject current=null] : ( () otherlv_1= Uint32 ) ;
    public final EObject ruleuint32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3382:2: ( ( () otherlv_1= Uint32 ) )
            // InternalContextModelParser.g:3383:2: ( () otherlv_1= Uint32 )
            {
            // InternalContextModelParser.g:3383:2: ( () otherlv_1= Uint32 )
            // InternalContextModelParser.g:3384:3: () otherlv_1= Uint32
            {
            // InternalContextModelParser.g:3384:3: ()
            // InternalContextModelParser.g:3385:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint32Access().getUint32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint32Access().getUint32Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint32"


    // $ANTLR start "entryRuleint64"
    // InternalContextModelParser.g:3399:1: entryRuleint64 returns [EObject current=null] : iv_ruleint64= ruleint64 EOF ;
    public final EObject entryRuleint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64 = null;


        try {
            // InternalContextModelParser.g:3399:46: (iv_ruleint64= ruleint64 EOF )
            // InternalContextModelParser.g:3400:2: iv_ruleint64= ruleint64 EOF
            {
             newCompositeNode(grammarAccess.getInt64Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint64=ruleint64();

            state._fsp--;

             current =iv_ruleint64; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleint64"


    // $ANTLR start "ruleint64"
    // InternalContextModelParser.g:3406:1: ruleint64 returns [EObject current=null] : ( () otherlv_1= Int64 ) ;
    public final EObject ruleint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3412:2: ( ( () otherlv_1= Int64 ) )
            // InternalContextModelParser.g:3413:2: ( () otherlv_1= Int64 )
            {
            // InternalContextModelParser.g:3413:2: ( () otherlv_1= Int64 )
            // InternalContextModelParser.g:3414:3: () otherlv_1= Int64
            {
            // InternalContextModelParser.g:3414:3: ()
            // InternalContextModelParser.g:3415:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt64Access().getInt64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int64,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt64Access().getInt64Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint64"


    // $ANTLR start "entryRuleuint64"
    // InternalContextModelParser.g:3429:1: entryRuleuint64 returns [EObject current=null] : iv_ruleuint64= ruleuint64 EOF ;
    public final EObject entryRuleuint64() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64 = null;


        try {
            // InternalContextModelParser.g:3429:47: (iv_ruleuint64= ruleuint64 EOF )
            // InternalContextModelParser.g:3430:2: iv_ruleuint64= ruleuint64 EOF
            {
             newCompositeNode(grammarAccess.getUint64Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint64=ruleuint64();

            state._fsp--;

             current =iv_ruleuint64; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleuint64"


    // $ANTLR start "ruleuint64"
    // InternalContextModelParser.g:3436:1: ruleuint64 returns [EObject current=null] : ( () otherlv_1= Uint64 ) ;
    public final EObject ruleuint64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3442:2: ( ( () otherlv_1= Uint64 ) )
            // InternalContextModelParser.g:3443:2: ( () otherlv_1= Uint64 )
            {
            // InternalContextModelParser.g:3443:2: ( () otherlv_1= Uint64 )
            // InternalContextModelParser.g:3444:3: () otherlv_1= Uint64
            {
            // InternalContextModelParser.g:3444:3: ()
            // InternalContextModelParser.g:3445:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint64Access().getUint64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint64,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint64Access().getUint64Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint64"


    // $ANTLR start "entryRulefloat32"
    // InternalContextModelParser.g:3459:1: entryRulefloat32 returns [EObject current=null] : iv_rulefloat32= rulefloat32 EOF ;
    public final EObject entryRulefloat32() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32 = null;


        try {
            // InternalContextModelParser.g:3459:48: (iv_rulefloat32= rulefloat32 EOF )
            // InternalContextModelParser.g:3460:2: iv_rulefloat32= rulefloat32 EOF
            {
             newCompositeNode(grammarAccess.getFloat32Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulefloat32=rulefloat32();

            state._fsp--;

             current =iv_rulefloat32; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefloat32"


    // $ANTLR start "rulefloat32"
    // InternalContextModelParser.g:3466:1: rulefloat32 returns [EObject current=null] : ( () otherlv_1= Float32 ) ;
    public final EObject rulefloat32() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3472:2: ( ( () otherlv_1= Float32 ) )
            // InternalContextModelParser.g:3473:2: ( () otherlv_1= Float32 )
            {
            // InternalContextModelParser.g:3473:2: ( () otherlv_1= Float32 )
            // InternalContextModelParser.g:3474:3: () otherlv_1= Float32
            {
            // InternalContextModelParser.g:3474:3: ()
            // InternalContextModelParser.g:3475:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat32Access().getFloat32Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Float32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFloat32Access().getFloat32Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat32"


    // $ANTLR start "entryRulefloat64"
    // InternalContextModelParser.g:3489:1: entryRulefloat64 returns [EObject current=null] : iv_rulefloat64= rulefloat64 EOF ;
    public final EObject entryRulefloat64() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64 = null;


        try {
            // InternalContextModelParser.g:3489:48: (iv_rulefloat64= rulefloat64 EOF )
            // InternalContextModelParser.g:3490:2: iv_rulefloat64= rulefloat64 EOF
            {
             newCompositeNode(grammarAccess.getFloat64Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulefloat64=rulefloat64();

            state._fsp--;

             current =iv_rulefloat64; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefloat64"


    // $ANTLR start "rulefloat64"
    // InternalContextModelParser.g:3496:1: rulefloat64 returns [EObject current=null] : ( () otherlv_1= Float64 ) ;
    public final EObject rulefloat64() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3502:2: ( ( () otherlv_1= Float64 ) )
            // InternalContextModelParser.g:3503:2: ( () otherlv_1= Float64 )
            {
            // InternalContextModelParser.g:3503:2: ( () otherlv_1= Float64 )
            // InternalContextModelParser.g:3504:3: () otherlv_1= Float64
            {
            // InternalContextModelParser.g:3504:3: ()
            // InternalContextModelParser.g:3505:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat64Access().getFloat64Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Float64,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFloat64Access().getFloat64Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat64"


    // $ANTLR start "entryRulestring0"
    // InternalContextModelParser.g:3519:1: entryRulestring0 returns [EObject current=null] : iv_rulestring0= rulestring0 EOF ;
    public final EObject entryRulestring0() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0 = null;


        try {
            // InternalContextModelParser.g:3519:48: (iv_rulestring0= rulestring0 EOF )
            // InternalContextModelParser.g:3520:2: iv_rulestring0= rulestring0 EOF
            {
             newCompositeNode(grammarAccess.getString0Rule()); 
            pushFollow(FOLLOW_1);
            iv_rulestring0=rulestring0();

            state._fsp--;

             current =iv_rulestring0; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestring0"


    // $ANTLR start "rulestring0"
    // InternalContextModelParser.g:3526:1: rulestring0 returns [EObject current=null] : ( () otherlv_1= String_1 ) ;
    public final EObject rulestring0() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3532:2: ( ( () otherlv_1= String_1 ) )
            // InternalContextModelParser.g:3533:2: ( () otherlv_1= String_1 )
            {
            // InternalContextModelParser.g:3533:2: ( () otherlv_1= String_1 )
            // InternalContextModelParser.g:3534:3: () otherlv_1= String_1
            {
            // InternalContextModelParser.g:3534:3: ()
            // InternalContextModelParser.g:3535:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0Access().getStringAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,String_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getString0Access().getStringKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestring0"


    // $ANTLR start "entryRulechar"
    // InternalContextModelParser.g:3549:1: entryRulechar returns [EObject current=null] : iv_rulechar= rulechar EOF ;
    public final EObject entryRulechar() throws RecognitionException {
        EObject current = null;

        EObject iv_rulechar = null;


        try {
            // InternalContextModelParser.g:3549:45: (iv_rulechar= rulechar EOF )
            // InternalContextModelParser.g:3550:2: iv_rulechar= rulechar EOF
            {
             newCompositeNode(grammarAccess.getCharRule()); 
            pushFollow(FOLLOW_1);
            iv_rulechar=rulechar();

            state._fsp--;

             current =iv_rulechar; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulechar"


    // $ANTLR start "rulechar"
    // InternalContextModelParser.g:3556:1: rulechar returns [EObject current=null] : ( () otherlv_1= Char ) ;
    public final EObject rulechar() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3562:2: ( ( () otherlv_1= Char ) )
            // InternalContextModelParser.g:3563:2: ( () otherlv_1= Char )
            {
            // InternalContextModelParser.g:3563:2: ( () otherlv_1= Char )
            // InternalContextModelParser.g:3564:3: () otherlv_1= Char
            {
            // InternalContextModelParser.g:3564:3: ()
            // InternalContextModelParser.g:3565:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCharAccess().getChar0Action_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Char,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCharAccess().getCharKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulechar"


    // $ANTLR start "entryRulebyte"
    // InternalContextModelParser.g:3579:1: entryRulebyte returns [EObject current=null] : iv_rulebyte= rulebyte EOF ;
    public final EObject entryRulebyte() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyte = null;


        try {
            // InternalContextModelParser.g:3579:45: (iv_rulebyte= rulebyte EOF )
            // InternalContextModelParser.g:3580:2: iv_rulebyte= rulebyte EOF
            {
             newCompositeNode(grammarAccess.getByteRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebyte=rulebyte();

            state._fsp--;

             current =iv_rulebyte; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulebyte"


    // $ANTLR start "rulebyte"
    // InternalContextModelParser.g:3586:1: rulebyte returns [EObject current=null] : ( () otherlv_1= Byte ) ;
    public final EObject rulebyte() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3592:2: ( ( () otherlv_1= Byte ) )
            // InternalContextModelParser.g:3593:2: ( () otherlv_1= Byte )
            {
            // InternalContextModelParser.g:3593:2: ( () otherlv_1= Byte )
            // InternalContextModelParser.g:3594:3: () otherlv_1= Byte
            {
            // InternalContextModelParser.g:3594:3: ()
            // InternalContextModelParser.g:3595:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getByteAccess().getByteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Byte,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getByteAccess().getByteKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebyte"


    // $ANTLR start "entryRuletime"
    // InternalContextModelParser.g:3609:1: entryRuletime returns [EObject current=null] : iv_ruletime= ruletime EOF ;
    public final EObject entryRuletime() throws RecognitionException {
        EObject current = null;

        EObject iv_ruletime = null;


        try {
            // InternalContextModelParser.g:3609:45: (iv_ruletime= ruletime EOF )
            // InternalContextModelParser.g:3610:2: iv_ruletime= ruletime EOF
            {
             newCompositeNode(grammarAccess.getTimeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruletime=ruletime();

            state._fsp--;

             current =iv_ruletime; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuletime"


    // $ANTLR start "ruletime"
    // InternalContextModelParser.g:3616:1: ruletime returns [EObject current=null] : ( () otherlv_1= Time ) ;
    public final EObject ruletime() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3622:2: ( ( () otherlv_1= Time ) )
            // InternalContextModelParser.g:3623:2: ( () otherlv_1= Time )
            {
            // InternalContextModelParser.g:3623:2: ( () otherlv_1= Time )
            // InternalContextModelParser.g:3624:3: () otherlv_1= Time
            {
            // InternalContextModelParser.g:3624:3: ()
            // InternalContextModelParser.g:3625:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTimeAccess().getTimeAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Time,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getTimeAccess().getTimeKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruletime"


    // $ANTLR start "entryRuleduration"
    // InternalContextModelParser.g:3639:1: entryRuleduration returns [EObject current=null] : iv_ruleduration= ruleduration EOF ;
    public final EObject entryRuleduration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleduration = null;


        try {
            // InternalContextModelParser.g:3639:49: (iv_ruleduration= ruleduration EOF )
            // InternalContextModelParser.g:3640:2: iv_ruleduration= ruleduration EOF
            {
             newCompositeNode(grammarAccess.getDurationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleduration=ruleduration();

            state._fsp--;

             current =iv_ruleduration; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleduration"


    // $ANTLR start "ruleduration"
    // InternalContextModelParser.g:3646:1: ruleduration returns [EObject current=null] : ( () otherlv_1= Duration ) ;
    public final EObject ruleduration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3652:2: ( ( () otherlv_1= Duration ) )
            // InternalContextModelParser.g:3653:2: ( () otherlv_1= Duration )
            {
            // InternalContextModelParser.g:3653:2: ( () otherlv_1= Duration )
            // InternalContextModelParser.g:3654:3: () otherlv_1= Duration
            {
            // InternalContextModelParser.g:3654:3: ()
            // InternalContextModelParser.g:3655:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDurationAccess().getDurationAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Duration,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getDurationAccess().getDurationKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleduration"


    // $ANTLR start "entryRuleboolArray"
    // InternalContextModelParser.g:3669:1: entryRuleboolArray returns [EObject current=null] : iv_ruleboolArray= ruleboolArray EOF ;
    public final EObject entryRuleboolArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleboolArray = null;


        try {
            // InternalContextModelParser.g:3669:50: (iv_ruleboolArray= ruleboolArray EOF )
            // InternalContextModelParser.g:3670:2: iv_ruleboolArray= ruleboolArray EOF
            {
             newCompositeNode(grammarAccess.getBoolArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleboolArray=ruleboolArray();

            state._fsp--;

             current =iv_ruleboolArray; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleboolArray"


    // $ANTLR start "ruleboolArray"
    // InternalContextModelParser.g:3676:1: ruleboolArray returns [EObject current=null] : ( () otherlv_1= Bool_1 ) ;
    public final EObject ruleboolArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3682:2: ( ( () otherlv_1= Bool_1 ) )
            // InternalContextModelParser.g:3683:2: ( () otherlv_1= Bool_1 )
            {
            // InternalContextModelParser.g:3683:2: ( () otherlv_1= Bool_1 )
            // InternalContextModelParser.g:3684:3: () otherlv_1= Bool_1
            {
            // InternalContextModelParser.g:3684:3: ()
            // InternalContextModelParser.g:3685:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBoolArrayAccess().getBoolArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Bool_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getBoolArrayAccess().getBoolKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleboolArray"


    // $ANTLR start "entryRuleint8Array"
    // InternalContextModelParser.g:3699:1: entryRuleint8Array returns [EObject current=null] : iv_ruleint8Array= ruleint8Array EOF ;
    public final EObject entryRuleint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint8Array = null;


        try {
            // InternalContextModelParser.g:3699:50: (iv_ruleint8Array= ruleint8Array EOF )
            // InternalContextModelParser.g:3700:2: iv_ruleint8Array= ruleint8Array EOF
            {
             newCompositeNode(grammarAccess.getInt8ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint8Array=ruleint8Array();

            state._fsp--;

             current =iv_ruleint8Array; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleint8Array"


    // $ANTLR start "ruleint8Array"
    // InternalContextModelParser.g:3706:1: ruleint8Array returns [EObject current=null] : ( () otherlv_1= Int8_1 ) ;
    public final EObject ruleint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3712:2: ( ( () otherlv_1= Int8_1 ) )
            // InternalContextModelParser.g:3713:2: ( () otherlv_1= Int8_1 )
            {
            // InternalContextModelParser.g:3713:2: ( () otherlv_1= Int8_1 )
            // InternalContextModelParser.g:3714:3: () otherlv_1= Int8_1
            {
            // InternalContextModelParser.g:3714:3: ()
            // InternalContextModelParser.g:3715:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt8ArrayAccess().getInt8ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int8_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt8ArrayAccess().getInt8Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint8Array"


    // $ANTLR start "entryRuleuint8Array"
    // InternalContextModelParser.g:3729:1: entryRuleuint8Array returns [EObject current=null] : iv_ruleuint8Array= ruleuint8Array EOF ;
    public final EObject entryRuleuint8Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint8Array = null;


        try {
            // InternalContextModelParser.g:3729:51: (iv_ruleuint8Array= ruleuint8Array EOF )
            // InternalContextModelParser.g:3730:2: iv_ruleuint8Array= ruleuint8Array EOF
            {
             newCompositeNode(grammarAccess.getUint8ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint8Array=ruleuint8Array();

            state._fsp--;

             current =iv_ruleuint8Array; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleuint8Array"


    // $ANTLR start "ruleuint8Array"
    // InternalContextModelParser.g:3736:1: ruleuint8Array returns [EObject current=null] : ( () otherlv_1= Uint8_1 ) ;
    public final EObject ruleuint8Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3742:2: ( ( () otherlv_1= Uint8_1 ) )
            // InternalContextModelParser.g:3743:2: ( () otherlv_1= Uint8_1 )
            {
            // InternalContextModelParser.g:3743:2: ( () otherlv_1= Uint8_1 )
            // InternalContextModelParser.g:3744:3: () otherlv_1= Uint8_1
            {
            // InternalContextModelParser.g:3744:3: ()
            // InternalContextModelParser.g:3745:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint8ArrayAccess().getUint8ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint8_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint8ArrayAccess().getUint8Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint8Array"


    // $ANTLR start "entryRuleint16Array"
    // InternalContextModelParser.g:3759:1: entryRuleint16Array returns [EObject current=null] : iv_ruleint16Array= ruleint16Array EOF ;
    public final EObject entryRuleint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint16Array = null;


        try {
            // InternalContextModelParser.g:3759:51: (iv_ruleint16Array= ruleint16Array EOF )
            // InternalContextModelParser.g:3760:2: iv_ruleint16Array= ruleint16Array EOF
            {
             newCompositeNode(grammarAccess.getInt16ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint16Array=ruleint16Array();

            state._fsp--;

             current =iv_ruleint16Array; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleint16Array"


    // $ANTLR start "ruleint16Array"
    // InternalContextModelParser.g:3766:1: ruleint16Array returns [EObject current=null] : ( () otherlv_1= Int16_1 ) ;
    public final EObject ruleint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3772:2: ( ( () otherlv_1= Int16_1 ) )
            // InternalContextModelParser.g:3773:2: ( () otherlv_1= Int16_1 )
            {
            // InternalContextModelParser.g:3773:2: ( () otherlv_1= Int16_1 )
            // InternalContextModelParser.g:3774:3: () otherlv_1= Int16_1
            {
            // InternalContextModelParser.g:3774:3: ()
            // InternalContextModelParser.g:3775:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt16ArrayAccess().getInt16ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int16_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt16ArrayAccess().getInt16Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint16Array"


    // $ANTLR start "entryRuleuint16Array"
    // InternalContextModelParser.g:3789:1: entryRuleuint16Array returns [EObject current=null] : iv_ruleuint16Array= ruleuint16Array EOF ;
    public final EObject entryRuleuint16Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint16Array = null;


        try {
            // InternalContextModelParser.g:3789:52: (iv_ruleuint16Array= ruleuint16Array EOF )
            // InternalContextModelParser.g:3790:2: iv_ruleuint16Array= ruleuint16Array EOF
            {
             newCompositeNode(grammarAccess.getUint16ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint16Array=ruleuint16Array();

            state._fsp--;

             current =iv_ruleuint16Array; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleuint16Array"


    // $ANTLR start "ruleuint16Array"
    // InternalContextModelParser.g:3796:1: ruleuint16Array returns [EObject current=null] : ( () otherlv_1= Uint16_1 ) ;
    public final EObject ruleuint16Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3802:2: ( ( () otherlv_1= Uint16_1 ) )
            // InternalContextModelParser.g:3803:2: ( () otherlv_1= Uint16_1 )
            {
            // InternalContextModelParser.g:3803:2: ( () otherlv_1= Uint16_1 )
            // InternalContextModelParser.g:3804:3: () otherlv_1= Uint16_1
            {
            // InternalContextModelParser.g:3804:3: ()
            // InternalContextModelParser.g:3805:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint16ArrayAccess().getUint16ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint16_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint16ArrayAccess().getUint16Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint16Array"


    // $ANTLR start "entryRuleint32Array"
    // InternalContextModelParser.g:3819:1: entryRuleint32Array returns [EObject current=null] : iv_ruleint32Array= ruleint32Array EOF ;
    public final EObject entryRuleint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint32Array = null;


        try {
            // InternalContextModelParser.g:3819:51: (iv_ruleint32Array= ruleint32Array EOF )
            // InternalContextModelParser.g:3820:2: iv_ruleint32Array= ruleint32Array EOF
            {
             newCompositeNode(grammarAccess.getInt32ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint32Array=ruleint32Array();

            state._fsp--;

             current =iv_ruleint32Array; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleint32Array"


    // $ANTLR start "ruleint32Array"
    // InternalContextModelParser.g:3826:1: ruleint32Array returns [EObject current=null] : ( () otherlv_1= Int32_1 ) ;
    public final EObject ruleint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3832:2: ( ( () otherlv_1= Int32_1 ) )
            // InternalContextModelParser.g:3833:2: ( () otherlv_1= Int32_1 )
            {
            // InternalContextModelParser.g:3833:2: ( () otherlv_1= Int32_1 )
            // InternalContextModelParser.g:3834:3: () otherlv_1= Int32_1
            {
            // InternalContextModelParser.g:3834:3: ()
            // InternalContextModelParser.g:3835:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt32ArrayAccess().getInt32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int32_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt32ArrayAccess().getInt32Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint32Array"


    // $ANTLR start "entryRuleuint32Array"
    // InternalContextModelParser.g:3849:1: entryRuleuint32Array returns [EObject current=null] : iv_ruleuint32Array= ruleuint32Array EOF ;
    public final EObject entryRuleuint32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint32Array = null;


        try {
            // InternalContextModelParser.g:3849:52: (iv_ruleuint32Array= ruleuint32Array EOF )
            // InternalContextModelParser.g:3850:2: iv_ruleuint32Array= ruleuint32Array EOF
            {
             newCompositeNode(grammarAccess.getUint32ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint32Array=ruleuint32Array();

            state._fsp--;

             current =iv_ruleuint32Array; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleuint32Array"


    // $ANTLR start "ruleuint32Array"
    // InternalContextModelParser.g:3856:1: ruleuint32Array returns [EObject current=null] : ( () otherlv_1= Uint32_1 ) ;
    public final EObject ruleuint32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3862:2: ( ( () otherlv_1= Uint32_1 ) )
            // InternalContextModelParser.g:3863:2: ( () otherlv_1= Uint32_1 )
            {
            // InternalContextModelParser.g:3863:2: ( () otherlv_1= Uint32_1 )
            // InternalContextModelParser.g:3864:3: () otherlv_1= Uint32_1
            {
            // InternalContextModelParser.g:3864:3: ()
            // InternalContextModelParser.g:3865:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint32ArrayAccess().getUint32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint32_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint32ArrayAccess().getUint32Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint32Array"


    // $ANTLR start "entryRuleint64Array"
    // InternalContextModelParser.g:3879:1: entryRuleint64Array returns [EObject current=null] : iv_ruleint64Array= ruleint64Array EOF ;
    public final EObject entryRuleint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleint64Array = null;


        try {
            // InternalContextModelParser.g:3879:51: (iv_ruleint64Array= ruleint64Array EOF )
            // InternalContextModelParser.g:3880:2: iv_ruleint64Array= ruleint64Array EOF
            {
             newCompositeNode(grammarAccess.getInt64ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleint64Array=ruleint64Array();

            state._fsp--;

             current =iv_ruleint64Array; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleint64Array"


    // $ANTLR start "ruleint64Array"
    // InternalContextModelParser.g:3886:1: ruleint64Array returns [EObject current=null] : ( () otherlv_1= Int64_1 ) ;
    public final EObject ruleint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3892:2: ( ( () otherlv_1= Int64_1 ) )
            // InternalContextModelParser.g:3893:2: ( () otherlv_1= Int64_1 )
            {
            // InternalContextModelParser.g:3893:2: ( () otherlv_1= Int64_1 )
            // InternalContextModelParser.g:3894:3: () otherlv_1= Int64_1
            {
            // InternalContextModelParser.g:3894:3: ()
            // InternalContextModelParser.g:3895:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInt64ArrayAccess().getInt64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Int64_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getInt64ArrayAccess().getInt64Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleint64Array"


    // $ANTLR start "entryRuleuint64Array"
    // InternalContextModelParser.g:3909:1: entryRuleuint64Array returns [EObject current=null] : iv_ruleuint64Array= ruleuint64Array EOF ;
    public final EObject entryRuleuint64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleuint64Array = null;


        try {
            // InternalContextModelParser.g:3909:52: (iv_ruleuint64Array= ruleuint64Array EOF )
            // InternalContextModelParser.g:3910:2: iv_ruleuint64Array= ruleuint64Array EOF
            {
             newCompositeNode(grammarAccess.getUint64ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleuint64Array=ruleuint64Array();

            state._fsp--;

             current =iv_ruleuint64Array; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleuint64Array"


    // $ANTLR start "ruleuint64Array"
    // InternalContextModelParser.g:3916:1: ruleuint64Array returns [EObject current=null] : ( () otherlv_1= Uint64_1 ) ;
    public final EObject ruleuint64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3922:2: ( ( () otherlv_1= Uint64_1 ) )
            // InternalContextModelParser.g:3923:2: ( () otherlv_1= Uint64_1 )
            {
            // InternalContextModelParser.g:3923:2: ( () otherlv_1= Uint64_1 )
            // InternalContextModelParser.g:3924:3: () otherlv_1= Uint64_1
            {
            // InternalContextModelParser.g:3924:3: ()
            // InternalContextModelParser.g:3925:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUint64ArrayAccess().getUint64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Uint64_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getUint64ArrayAccess().getUint64Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleuint64Array"


    // $ANTLR start "entryRulefloat32Array"
    // InternalContextModelParser.g:3939:1: entryRulefloat32Array returns [EObject current=null] : iv_rulefloat32Array= rulefloat32Array EOF ;
    public final EObject entryRulefloat32Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat32Array = null;


        try {
            // InternalContextModelParser.g:3939:53: (iv_rulefloat32Array= rulefloat32Array EOF )
            // InternalContextModelParser.g:3940:2: iv_rulefloat32Array= rulefloat32Array EOF
            {
             newCompositeNode(grammarAccess.getFloat32ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefloat32Array=rulefloat32Array();

            state._fsp--;

             current =iv_rulefloat32Array; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefloat32Array"


    // $ANTLR start "rulefloat32Array"
    // InternalContextModelParser.g:3946:1: rulefloat32Array returns [EObject current=null] : ( () otherlv_1= Float32_1 ) ;
    public final EObject rulefloat32Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3952:2: ( ( () otherlv_1= Float32_1 ) )
            // InternalContextModelParser.g:3953:2: ( () otherlv_1= Float32_1 )
            {
            // InternalContextModelParser.g:3953:2: ( () otherlv_1= Float32_1 )
            // InternalContextModelParser.g:3954:3: () otherlv_1= Float32_1
            {
            // InternalContextModelParser.g:3954:3: ()
            // InternalContextModelParser.g:3955:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat32ArrayAccess().getFloat32ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Float32_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFloat32ArrayAccess().getFloat32Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat32Array"


    // $ANTLR start "entryRulefloat64Array"
    // InternalContextModelParser.g:3969:1: entryRulefloat64Array returns [EObject current=null] : iv_rulefloat64Array= rulefloat64Array EOF ;
    public final EObject entryRulefloat64Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulefloat64Array = null;


        try {
            // InternalContextModelParser.g:3969:53: (iv_rulefloat64Array= rulefloat64Array EOF )
            // InternalContextModelParser.g:3970:2: iv_rulefloat64Array= rulefloat64Array EOF
            {
             newCompositeNode(grammarAccess.getFloat64ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulefloat64Array=rulefloat64Array();

            state._fsp--;

             current =iv_rulefloat64Array; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulefloat64Array"


    // $ANTLR start "rulefloat64Array"
    // InternalContextModelParser.g:3976:1: rulefloat64Array returns [EObject current=null] : ( () otherlv_1= Float64_1 ) ;
    public final EObject rulefloat64Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:3982:2: ( ( () otherlv_1= Float64_1 ) )
            // InternalContextModelParser.g:3983:2: ( () otherlv_1= Float64_1 )
            {
            // InternalContextModelParser.g:3983:2: ( () otherlv_1= Float64_1 )
            // InternalContextModelParser.g:3984:3: () otherlv_1= Float64_1
            {
            // InternalContextModelParser.g:3984:3: ()
            // InternalContextModelParser.g:3985:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFloat64ArrayAccess().getFloat64ArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Float64_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getFloat64ArrayAccess().getFloat64Keyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulefloat64Array"


    // $ANTLR start "entryRulestring0Array"
    // InternalContextModelParser.g:3999:1: entryRulestring0Array returns [EObject current=null] : iv_rulestring0Array= rulestring0Array EOF ;
    public final EObject entryRulestring0Array() throws RecognitionException {
        EObject current = null;

        EObject iv_rulestring0Array = null;


        try {
            // InternalContextModelParser.g:3999:53: (iv_rulestring0Array= rulestring0Array EOF )
            // InternalContextModelParser.g:4000:2: iv_rulestring0Array= rulestring0Array EOF
            {
             newCompositeNode(grammarAccess.getString0ArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulestring0Array=rulestring0Array();

            state._fsp--;

             current =iv_rulestring0Array; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulestring0Array"


    // $ANTLR start "rulestring0Array"
    // InternalContextModelParser.g:4006:1: rulestring0Array returns [EObject current=null] : ( () otherlv_1= String_2 ) ;
    public final EObject rulestring0Array() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:4012:2: ( ( () otherlv_1= String_2 ) )
            // InternalContextModelParser.g:4013:2: ( () otherlv_1= String_2 )
            {
            // InternalContextModelParser.g:4013:2: ( () otherlv_1= String_2 )
            // InternalContextModelParser.g:4014:3: () otherlv_1= String_2
            {
            // InternalContextModelParser.g:4014:3: ()
            // InternalContextModelParser.g:4015:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getString0ArrayAccess().getStringArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,String_2,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getString0ArrayAccess().getStringKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulestring0Array"


    // $ANTLR start "entryRulebyteArray"
    // InternalContextModelParser.g:4029:1: entryRulebyteArray returns [EObject current=null] : iv_rulebyteArray= rulebyteArray EOF ;
    public final EObject entryRulebyteArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulebyteArray = null;


        try {
            // InternalContextModelParser.g:4029:50: (iv_rulebyteArray= rulebyteArray EOF )
            // InternalContextModelParser.g:4030:2: iv_rulebyteArray= rulebyteArray EOF
            {
             newCompositeNode(grammarAccess.getByteArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulebyteArray=rulebyteArray();

            state._fsp--;

             current =iv_rulebyteArray; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulebyteArray"


    // $ANTLR start "rulebyteArray"
    // InternalContextModelParser.g:4036:1: rulebyteArray returns [EObject current=null] : ( () otherlv_1= Byte_1 ) ;
    public final EObject rulebyteArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:4042:2: ( ( () otherlv_1= Byte_1 ) )
            // InternalContextModelParser.g:4043:2: ( () otherlv_1= Byte_1 )
            {
            // InternalContextModelParser.g:4043:2: ( () otherlv_1= Byte_1 )
            // InternalContextModelParser.g:4044:3: () otherlv_1= Byte_1
            {
            // InternalContextModelParser.g:4044:3: ()
            // InternalContextModelParser.g:4045:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getByteArrayAccess().getByteArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Byte_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getByteArrayAccess().getByteKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulebyteArray"


    // $ANTLR start "entryRulecharArray"
    // InternalContextModelParser.g:4059:1: entryRulecharArray returns [EObject current=null] : iv_rulecharArray= rulecharArray EOF ;
    public final EObject entryRulecharArray() throws RecognitionException {
        EObject current = null;

        EObject iv_rulecharArray = null;


        try {
            // InternalContextModelParser.g:4059:50: (iv_rulecharArray= rulecharArray EOF )
            // InternalContextModelParser.g:4060:2: iv_rulecharArray= rulecharArray EOF
            {
             newCompositeNode(grammarAccess.getCharArrayRule()); 
            pushFollow(FOLLOW_1);
            iv_rulecharArray=rulecharArray();

            state._fsp--;

             current =iv_rulecharArray; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulecharArray"


    // $ANTLR start "rulecharArray"
    // InternalContextModelParser.g:4066:1: rulecharArray returns [EObject current=null] : ( () otherlv_1= Char_1 ) ;
    public final EObject rulecharArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:4072:2: ( ( () otherlv_1= Char_1 ) )
            // InternalContextModelParser.g:4073:2: ( () otherlv_1= Char_1 )
            {
            // InternalContextModelParser.g:4073:2: ( () otherlv_1= Char_1 )
            // InternalContextModelParser.g:4074:3: () otherlv_1= Char_1
            {
            // InternalContextModelParser.g:4074:3: ()
            // InternalContextModelParser.g:4075:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCharArrayAccess().getCharArrayAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Char_1,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCharArrayAccess().getCharKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulecharArray"


    // $ANTLR start "entryRuleHeader"
    // InternalContextModelParser.g:4089:1: entryRuleHeader returns [EObject current=null] : iv_ruleHeader= ruleHeader EOF ;
    public final EObject entryRuleHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHeader = null;


        try {
            // InternalContextModelParser.g:4089:47: (iv_ruleHeader= ruleHeader EOF )
            // InternalContextModelParser.g:4090:2: iv_ruleHeader= ruleHeader EOF
            {
             newCompositeNode(grammarAccess.getHeaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleHeader=ruleHeader();

            state._fsp--;

             current =iv_ruleHeader; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleHeader"


    // $ANTLR start "ruleHeader"
    // InternalContextModelParser.g:4096:1: ruleHeader returns [EObject current=null] : ( () otherlv_1= Header ) ;
    public final EObject ruleHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:4102:2: ( ( () otherlv_1= Header ) )
            // InternalContextModelParser.g:4103:2: ( () otherlv_1= Header )
            {
            // InternalContextModelParser.g:4103:2: ( () otherlv_1= Header )
            // InternalContextModelParser.g:4104:3: () otherlv_1= Header
            {
            // InternalContextModelParser.g:4104:3: ()
            // InternalContextModelParser.g:4105:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getHeaderAccess().getHeaderAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,Header,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getHeaderAccess().getHeaderKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHeader"


    // $ANTLR start "entryRuleSpecBaseRef"
    // InternalContextModelParser.g:4119:1: entryRuleSpecBaseRef returns [EObject current=null] : iv_ruleSpecBaseRef= ruleSpecBaseRef EOF ;
    public final EObject entryRuleSpecBaseRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecBaseRef = null;


        try {
            // InternalContextModelParser.g:4119:52: (iv_ruleSpecBaseRef= ruleSpecBaseRef EOF )
            // InternalContextModelParser.g:4120:2: iv_ruleSpecBaseRef= ruleSpecBaseRef EOF
            {
             newCompositeNode(grammarAccess.getSpecBaseRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpecBaseRef=ruleSpecBaseRef();

            state._fsp--;

             current =iv_ruleSpecBaseRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleSpecBaseRef"


    // $ANTLR start "ruleSpecBaseRef"
    // InternalContextModelParser.g:4126:1: ruleSpecBaseRef returns [EObject current=null] : ( ( ruleEString ) ) ;
    public final EObject ruleSpecBaseRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalContextModelParser.g:4132:2: ( ( ( ruleEString ) ) )
            // InternalContextModelParser.g:4133:2: ( ( ruleEString ) )
            {
            // InternalContextModelParser.g:4133:2: ( ( ruleEString ) )
            // InternalContextModelParser.g:4134:3: ( ruleEString )
            {
            // InternalContextModelParser.g:4134:3: ( ruleEString )
            // InternalContextModelParser.g:4135:4: ruleEString
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getSpecBaseRefRule());
            				}
            			

            				newCompositeNode(grammarAccess.getSpecBaseRefAccess().getReferenceTopicSpecCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;


            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSpecBaseRef"


    // $ANTLR start "entryRuleArraySpecRef"
    // InternalContextModelParser.g:4152:1: entryRuleArraySpecRef returns [EObject current=null] : iv_ruleArraySpecRef= ruleArraySpecRef EOF ;
    public final EObject entryRuleArraySpecRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySpecRef = null;


        try {
            // InternalContextModelParser.g:4152:53: (iv_ruleArraySpecRef= ruleArraySpecRef EOF )
            // InternalContextModelParser.g:4153:2: iv_ruleArraySpecRef= ruleArraySpecRef EOF
            {
             newCompositeNode(grammarAccess.getArraySpecRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArraySpecRef=ruleArraySpecRef();

            state._fsp--;

             current =iv_ruleArraySpecRef; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleArraySpecRef"


    // $ANTLR start "ruleArraySpecRef"
    // InternalContextModelParser.g:4159:1: ruleArraySpecRef returns [EObject current=null] : ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) ;
    public final EObject ruleArraySpecRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:4165:2: ( ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket ) )
            // InternalContextModelParser.g:4166:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            {
            // InternalContextModelParser.g:4166:2: ( ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket )
            // InternalContextModelParser.g:4167:3: ( ( ruleEString ) ) otherlv_1= LeftSquareBracketRightSquareBracket
            {
            // InternalContextModelParser.g:4167:3: ( ( ruleEString ) )
            // InternalContextModelParser.g:4168:4: ( ruleEString )
            {
            // InternalContextModelParser.g:4168:4: ( ruleEString )
            // InternalContextModelParser.g:4169:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getArraySpecRefRule());
            					}
            				

            					newCompositeNode(grammarAccess.getArraySpecRefAccess().getReferenceTopicSpecCrossReference_0_0());
            				
            pushFollow(FOLLOW_53);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,LeftSquareBracketRightSquareBracket,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getArraySpecRefAccess().getLeftSquareBracketRightSquareBracketKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArraySpecRef"


    // $ANTLR start "entryRuleKEYWORD"
    // InternalContextModelParser.g:4191:1: entryRuleKEYWORD returns [String current=null] : iv_ruleKEYWORD= ruleKEYWORD EOF ;
    public final String entryRuleKEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleKEYWORD = null;


        try {
            // InternalContextModelParser.g:4191:47: (iv_ruleKEYWORD= ruleKEYWORD EOF )
            // InternalContextModelParser.g:4192:2: iv_ruleKEYWORD= ruleKEYWORD EOF
            {
             newCompositeNode(grammarAccess.getKEYWORDRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKEYWORD=ruleKEYWORD();

            state._fsp--;

             current =iv_ruleKEYWORD.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleKEYWORD"


    // $ANTLR start "ruleKEYWORD"
    // InternalContextModelParser.g:4198:1: ruleKEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) ;
    public final AntlrDatatypeRuleToken ruleKEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:4204:2: ( (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time ) )
            // InternalContextModelParser.g:4205:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            {
            // InternalContextModelParser.g:4205:2: (kw= Goal | kw= Message | kw= Result | kw= Feedback | kw= Name | kw= Value | kw= Service | kw= Type | kw= Action | kw= Duration | kw= Time )
            int alt39=11;
            switch ( input.LA(1) ) {
            case Goal:
                {
                alt39=1;
                }
                break;
            case Message:
                {
                alt39=2;
                }
                break;
            case Result:
                {
                alt39=3;
                }
                break;
            case Feedback:
                {
                alt39=4;
                }
                break;
            case Name:
                {
                alt39=5;
                }
                break;
            case Value:
                {
                alt39=6;
                }
                break;
            case Service:
                {
                alt39=7;
                }
                break;
            case Type:
                {
                alt39=8;
                }
                break;
            case Action:
                {
                alt39=9;
                }
                break;
            case Duration:
                {
                alt39=10;
                }
                break;
            case Time:
                {
                alt39=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalContextModelParser.g:4206:3: kw= Goal
                    {
                    kw=(Token)match(input,Goal,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getGoalKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalContextModelParser.g:4212:3: kw= Message
                    {
                    kw=(Token)match(input,Message,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getMessageKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalContextModelParser.g:4218:3: kw= Result
                    {
                    kw=(Token)match(input,Result,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getResultKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalContextModelParser.g:4224:3: kw= Feedback
                    {
                    kw=(Token)match(input,Feedback,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getFeedbackKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalContextModelParser.g:4230:3: kw= Name
                    {
                    kw=(Token)match(input,Name,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getNameKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalContextModelParser.g:4236:3: kw= Value
                    {
                    kw=(Token)match(input,Value,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getValueKeyword_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalContextModelParser.g:4242:3: kw= Service
                    {
                    kw=(Token)match(input,Service,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getServiceKeyword_6());
                    		

                    }
                    break;
                case 8 :
                    // InternalContextModelParser.g:4248:3: kw= Type
                    {
                    kw=(Token)match(input,Type,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTypeKeyword_7());
                    		

                    }
                    break;
                case 9 :
                    // InternalContextModelParser.g:4254:3: kw= Action
                    {
                    kw=(Token)match(input,Action,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getActionKeyword_8());
                    		

                    }
                    break;
                case 10 :
                    // InternalContextModelParser.g:4260:3: kw= Duration
                    {
                    kw=(Token)match(input,Duration,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getDurationKeyword_9());
                    		

                    }
                    break;
                case 11 :
                    // InternalContextModelParser.g:4266:3: kw= Time
                    {
                    kw=(Token)match(input,Time,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getKEYWORDAccess().getTimeKeyword_10());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleKEYWORD"


    // $ANTLR start "entryRuleEString"
    // InternalContextModelParser.g:4275:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalContextModelParser.g:4275:47: (iv_ruleEString= ruleEString EOF )
            // InternalContextModelParser.g:4276:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalContextModelParser.g:4282:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalContextModelParser.g:4288:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalContextModelParser.g:4289:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalContextModelParser.g:4289:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ID) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalContextModelParser.g:4290:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalContextModelParser.g:4298:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

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

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\1\10\2\11\10\uffff";
    static final String dfa_3s = "\3\131\4\uffff\1\131\3\uffff";
    static final String dfa_4s = "\3\160\4\uffff\1\162\3\uffff";
    static final String dfa_5s = "\3\uffff\1\2\1\3\1\4\1\5\1\uffff\1\7\1\1\1\6";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\10\3\uffff\1\7\1\10\6\uffff\1\3\1\6\1\4\1\5\6\uffff\1\2\1\1",
            "\1\11\1\uffff\1\10\2\uffff\1\11\20\uffff\2\11",
            "\1\11\1\uffff\1\10\2\uffff\1\11\20\uffff\2\11",
            "",
            "",
            "",
            "",
            "\1\12\3\uffff\2\12\6\uffff\4\12\6\uffff\2\12\1\uffff\1\10",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1643:2: (this_ParameterString_0= ruleParameterString | this_ParameterBase64_1= ruleParameterBase64 | this_ParameterInteger_2= ruleParameterInteger | this_ParameterDouble_3= ruleParameterDouble | this_ParameterBoolean_4= ruleParameterBoolean | this_ParameterList_5= ruleParameterList | this_ParameterStruct_6= ruleParameterStruct )";
        }
    }
    static final String dfa_8s = "\44\uffff";
    static final String dfa_9s = "\36\uffff\2\43\4\uffff";
    static final String dfa_10s = "\1\26\35\uffff\2\65\4\uffff";
    static final String dfa_11s = "\1\160\35\uffff\2\127\4\uffff";
    static final String dfa_12s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\2\uffff\1\40\1\41\1\37\1\36";
    static final String dfa_13s = "\44\uffff}>";
    static final String[] dfa_14s = {
            "\1\32\1\33\1\uffff\1\17\2\uffff\1\34\1\25\1\27\1\31\3\uffff\1\12\1\13\1\24\1\26\1\30\4\uffff\1\23\2\uffff\1\20\3\uffff\1\21\1\35\1\uffff\1\41\1\uffff\1\22\3\uffff\1\14\1\5\1\7\1\11\3\uffff\1\4\1\6\1\10\2\uffff\1\3\3\uffff\1\1\1\15\1\40\1\uffff\1\2\2\uffff\1\16\33\uffff\1\37\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\43\41\uffff\1\42",
            "\1\43\41\uffff\1\42",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "2888:2: (this_bool_0= rulebool | this_int8_1= ruleint8 | this_uint8_2= ruleuint8 | this_int16_3= ruleint16 | this_uint16_4= ruleuint16 | this_int32_5= ruleint32 | this_uint32_6= ruleuint32 | this_int64_7= ruleint64 | this_uint64_8= ruleuint64 | this_float32_9= rulefloat32 | this_float64_10= rulefloat64 | this_string0_11= rulestring0 | this_byte_12= rulebyte | this_time_13= ruletime | this_duration_14= ruleduration | this_Header_15= ruleHeader | this_boolArray_16= ruleboolArray | this_int8Array_17= ruleint8Array | this_uint8Array_18= ruleuint8Array | this_int16Array_19= ruleint16Array | this_uint16Array_20= ruleuint16Array | this_int32Array_21= ruleint32Array | this_uint32Array_22= ruleuint32Array | this_int64Array_23= ruleint64Array | this_uint64Array_24= ruleuint64Array | this_float32Array_25= rulefloat32Array | this_float64Array_26= rulefloat64Array | this_string0Array_27= rulestring0Array | this_byteArray_28= rulebyteArray | this_SpecBaseRef_29= ruleSpecBaseRef | this_ArraySpecRef_30= ruleArraySpecRef | this_char_31= rulechar | this_charArray_32= rulecharArray )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0080000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000100L,0x0000000200000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000000L,0x0000800200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xF15890F8F2C00000L,0x0001800000097138L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0400000000004000L,0x0000000000000044L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0400000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000004000L,0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000040030L,0x0001000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000112000L,0x0000000200000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000102000L,0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000100000L,0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000408080000L,0x0000800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000002L,0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000002L,0x0000000020000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000042000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0003600300000000L,0x0000000000000802L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0001800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x000181E020000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0001800040000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});

}