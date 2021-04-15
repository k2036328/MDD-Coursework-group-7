package uk.ac.kcl.inf.cw.edu.parser.antlr.internal;

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
import uk.ac.kcl.inf.cw.edu.services.EduLangauageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEduLangauageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'('", "')'", "'cm'", "'.'", "'+'", "'*'", "'/'", "'adjacent'", "'opposite'", "'hypotenuse'", "'sin'", "'cos'", "'tan'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalEduLangauageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEduLangauageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEduLangauageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEduLangauage.g"; }



     	private EduLangauageGrammarAccess grammarAccess;

        public InternalEduLangauageParser(TokenStream input, EduLangauageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "TrigoProgram";
       	}

       	@Override
       	protected EduLangauageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleTrigoProgram"
    // InternalEduLangauage.g:65:1: entryRuleTrigoProgram returns [EObject current=null] : iv_ruleTrigoProgram= ruleTrigoProgram EOF ;
    public final EObject entryRuleTrigoProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigoProgram = null;


        try {
            // InternalEduLangauage.g:65:53: (iv_ruleTrigoProgram= ruleTrigoProgram EOF )
            // InternalEduLangauage.g:66:2: iv_ruleTrigoProgram= ruleTrigoProgram EOF
            {
             newCompositeNode(grammarAccess.getTrigoProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigoProgram=ruleTrigoProgram();

            state._fsp--;

             current =iv_ruleTrigoProgram; 
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
    // $ANTLR end "entryRuleTrigoProgram"


    // $ANTLR start "ruleTrigoProgram"
    // InternalEduLangauage.g:72:1: ruleTrigoProgram returns [EObject current=null] : ( (lv_statements_0_0= ruleStatement ) )* ;
    public final EObject ruleTrigoProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;



        	enterRule();

        try {
            // InternalEduLangauage.g:78:2: ( ( (lv_statements_0_0= ruleStatement ) )* )
            // InternalEduLangauage.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            {
            // InternalEduLangauage.g:79:2: ( (lv_statements_0_0= ruleStatement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=20 && LA1_0<=25)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEduLangauage.g:80:3: (lv_statements_0_0= ruleStatement )
            	    {
            	    // InternalEduLangauage.g:80:3: (lv_statements_0_0= ruleStatement )
            	    // InternalEduLangauage.g:81:4: lv_statements_0_0= ruleStatement
            	    {

            	    				newCompositeNode(grammarAccess.getTrigoProgramAccess().getStatementsStatementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_statements_0_0=ruleStatement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getTrigoProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"statements",
            	    					lv_statements_0_0,
            	    					"uk.ac.kcl.inf.cw.edu.EduLangauage.Statement");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


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
    // $ANTLR end "ruleTrigoProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalEduLangauage.g:101:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // InternalEduLangauage.g:101:50: (iv_ruleStatement= ruleStatement EOF )
            // InternalEduLangauage.g:102:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalEduLangauage.g:108:1: ruleStatement returns [EObject current=null] : (this_SideStatement_0= ruleSideStatement | this_TrigoStatement_1= ruleTrigoStatement | this_VariableDeclaration_2= ruleVariableDeclaration ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        EObject this_SideStatement_0 = null;

        EObject this_TrigoStatement_1 = null;

        EObject this_VariableDeclaration_2 = null;



        	enterRule();

        try {
            // InternalEduLangauage.g:114:2: ( (this_SideStatement_0= ruleSideStatement | this_TrigoStatement_1= ruleTrigoStatement | this_VariableDeclaration_2= ruleVariableDeclaration ) )
            // InternalEduLangauage.g:115:2: (this_SideStatement_0= ruleSideStatement | this_TrigoStatement_1= ruleTrigoStatement | this_VariableDeclaration_2= ruleVariableDeclaration )
            {
            // InternalEduLangauage.g:115:2: (this_SideStatement_0= ruleSideStatement | this_TrigoStatement_1= ruleTrigoStatement | this_VariableDeclaration_2= ruleVariableDeclaration )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
            case 22:
                {
                alt2=1;
                }
                break;
            case 23:
            case 24:
            case 25:
                {
                alt2=2;
                }
                break;
            case 11:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEduLangauage.g:116:3: this_SideStatement_0= ruleSideStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getSideStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_SideStatement_0=ruleSideStatement();

                    state._fsp--;


                    			current = this_SideStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEduLangauage.g:125:3: this_TrigoStatement_1= ruleTrigoStatement
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getTrigoStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_TrigoStatement_1=ruleTrigoStatement();

                    state._fsp--;


                    			current = this_TrigoStatement_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEduLangauage.g:134:3: this_VariableDeclaration_2= ruleVariableDeclaration
                    {

                    			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableDeclaration_2=ruleVariableDeclaration();

                    state._fsp--;


                    			current = this_VariableDeclaration_2;
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
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalEduLangauage.g:146:1: entryRuleVariableDeclaration returns [EObject current=null] : iv_ruleVariableDeclaration= ruleVariableDeclaration EOF ;
    public final EObject entryRuleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDeclaration = null;


        try {
            // InternalEduLangauage.g:146:60: (iv_ruleVariableDeclaration= ruleVariableDeclaration EOF )
            // InternalEduLangauage.g:147:2: iv_ruleVariableDeclaration= ruleVariableDeclaration EOF
            {
             newCompositeNode(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDeclaration=ruleVariableDeclaration();

            state._fsp--;

             current =iv_ruleVariableDeclaration; 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalEduLangauage.g:153:1: ruleVariableDeclaration returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimaryExpression ) ) ) ;
    public final EObject ruleVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalEduLangauage.g:159:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimaryExpression ) ) ) )
            // InternalEduLangauage.g:160:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimaryExpression ) ) )
            {
            // InternalEduLangauage.g:160:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimaryExpression ) ) )
            // InternalEduLangauage.g:161:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_value_3_0= rulePrimaryExpression ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
            		
            // InternalEduLangauage.g:165:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEduLangauage.g:166:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEduLangauage.g:166:4: (lv_name_1_0= RULE_ID )
            // InternalEduLangauage.g:167:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVariableDeclarationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
            		
            // InternalEduLangauage.g:187:3: ( (lv_value_3_0= rulePrimaryExpression ) )
            // InternalEduLangauage.g:188:4: (lv_value_3_0= rulePrimaryExpression )
            {
            // InternalEduLangauage.g:188:4: (lv_value_3_0= rulePrimaryExpression )
            // InternalEduLangauage.g:189:5: lv_value_3_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValuePrimaryExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_3_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_3_0,
            						"uk.ac.kcl.inf.cw.edu.EduLangauage.PrimaryExpression");
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
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleSideStatement"
    // InternalEduLangauage.g:210:1: entryRuleSideStatement returns [EObject current=null] : iv_ruleSideStatement= ruleSideStatement EOF ;
    public final EObject entryRuleSideStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSideStatement = null;


        try {
            // InternalEduLangauage.g:210:54: (iv_ruleSideStatement= ruleSideStatement EOF )
            // InternalEduLangauage.g:211:2: iv_ruleSideStatement= ruleSideStatement EOF
            {
             newCompositeNode(grammarAccess.getSideStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSideStatement=ruleSideStatement();

            state._fsp--;

             current =iv_ruleSideStatement; 
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
    // $ANTLR end "entryRuleSideStatement"


    // $ANTLR start "ruleSideStatement"
    // InternalEduLangauage.g:217:1: ruleSideStatement returns [EObject current=null] : ( ( (lv_command_0_0= ruleSideCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleREAL ) ) otherlv_3= ')' otherlv_4= 'cm' ) ;
    public final EObject ruleSideStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Enumerator lv_command_0_0 = null;

        AntlrDatatypeRuleToken lv_steps_2_0 = null;



        	enterRule();

        try {
            // InternalEduLangauage.g:223:2: ( ( ( (lv_command_0_0= ruleSideCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleREAL ) ) otherlv_3= ')' otherlv_4= 'cm' ) )
            // InternalEduLangauage.g:224:2: ( ( (lv_command_0_0= ruleSideCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleREAL ) ) otherlv_3= ')' otherlv_4= 'cm' )
            {
            // InternalEduLangauage.g:224:2: ( ( (lv_command_0_0= ruleSideCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleREAL ) ) otherlv_3= ')' otherlv_4= 'cm' )
            // InternalEduLangauage.g:225:3: ( (lv_command_0_0= ruleSideCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= ruleREAL ) ) otherlv_3= ')' otherlv_4= 'cm'
            {
            // InternalEduLangauage.g:225:3: ( (lv_command_0_0= ruleSideCommand ) )
            // InternalEduLangauage.g:226:4: (lv_command_0_0= ruleSideCommand )
            {
            // InternalEduLangauage.g:226:4: (lv_command_0_0= ruleSideCommand )
            // InternalEduLangauage.g:227:5: lv_command_0_0= ruleSideCommand
            {

            					newCompositeNode(grammarAccess.getSideStatementAccess().getCommandSideCommandEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_command_0_0=ruleSideCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSideStatementRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_0_0,
            						"uk.ac.kcl.inf.cw.edu.EduLangauage.SideCommand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getSideStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEduLangauage.g:248:3: ( (lv_steps_2_0= ruleREAL ) )
            // InternalEduLangauage.g:249:4: (lv_steps_2_0= ruleREAL )
            {
            // InternalEduLangauage.g:249:4: (lv_steps_2_0= ruleREAL )
            // InternalEduLangauage.g:250:5: lv_steps_2_0= ruleREAL
            {

            					newCompositeNode(grammarAccess.getSideStatementAccess().getStepsREALParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_steps_2_0=ruleREAL();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSideStatementRule());
            					}
            					set(
            						current,
            						"steps",
            						lv_steps_2_0,
            						"uk.ac.kcl.inf.cw.edu.EduLangauage.REAL");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getSideStatementAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSideStatementAccess().getCmKeyword_4());
            		

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
    // $ANTLR end "ruleSideStatement"


    // $ANTLR start "entryRuleREAL"
    // InternalEduLangauage.g:279:1: entryRuleREAL returns [String current=null] : iv_ruleREAL= ruleREAL EOF ;
    public final String entryRuleREAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleREAL = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEduLangauage.g:281:2: (iv_ruleREAL= ruleREAL EOF )
            // InternalEduLangauage.g:282:2: iv_ruleREAL= ruleREAL EOF
            {
             newCompositeNode(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleREAL=ruleREAL();

            state._fsp--;

             current =iv_ruleREAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalEduLangauage.g:291:1: ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleREAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEduLangauage.g:298:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalEduLangauage.g:299:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalEduLangauage.g:299:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalEduLangauage.g:300:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_11); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,16,FOLLOW_8); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleTrigoStatement"
    // InternalEduLangauage.g:326:1: entryRuleTrigoStatement returns [EObject current=null] : iv_ruleTrigoStatement= ruleTrigoStatement EOF ;
    public final EObject entryRuleTrigoStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigoStatement = null;


        try {
            // InternalEduLangauage.g:326:55: (iv_ruleTrigoStatement= ruleTrigoStatement EOF )
            // InternalEduLangauage.g:327:2: iv_ruleTrigoStatement= ruleTrigoStatement EOF
            {
             newCompositeNode(grammarAccess.getTrigoStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigoStatement=ruleTrigoStatement();

            state._fsp--;

             current =iv_ruleTrigoStatement; 
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
    // $ANTLR end "entryRuleTrigoStatement"


    // $ANTLR start "ruleTrigoStatement"
    // InternalEduLangauage.g:333:1: ruleTrigoStatement returns [EObject current=null] : ( ( (lv_command_0_0= ruleAngleCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= rulePrimaryExpression ) ) (otherlv_3= ')' )* ) ;
    public final EObject ruleTrigoStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Enumerator lv_command_0_0 = null;

        EObject lv_steps_2_0 = null;



        	enterRule();

        try {
            // InternalEduLangauage.g:339:2: ( ( ( (lv_command_0_0= ruleAngleCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= rulePrimaryExpression ) ) (otherlv_3= ')' )* ) )
            // InternalEduLangauage.g:340:2: ( ( (lv_command_0_0= ruleAngleCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= rulePrimaryExpression ) ) (otherlv_3= ')' )* )
            {
            // InternalEduLangauage.g:340:2: ( ( (lv_command_0_0= ruleAngleCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= rulePrimaryExpression ) ) (otherlv_3= ')' )* )
            // InternalEduLangauage.g:341:3: ( (lv_command_0_0= ruleAngleCommand ) ) otherlv_1= '(' ( (lv_steps_2_0= rulePrimaryExpression ) ) (otherlv_3= ')' )*
            {
            // InternalEduLangauage.g:341:3: ( (lv_command_0_0= ruleAngleCommand ) )
            // InternalEduLangauage.g:342:4: (lv_command_0_0= ruleAngleCommand )
            {
            // InternalEduLangauage.g:342:4: (lv_command_0_0= ruleAngleCommand )
            // InternalEduLangauage.g:343:5: lv_command_0_0= ruleAngleCommand
            {

            					newCompositeNode(grammarAccess.getTrigoStatementAccess().getCommandAngleCommandEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
            lv_command_0_0=ruleAngleCommand();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrigoStatementRule());
            					}
            					set(
            						current,
            						"command",
            						lv_command_0_0,
            						"uk.ac.kcl.inf.cw.edu.EduLangauage.AngleCommand");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getTrigoStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEduLangauage.g:364:3: ( (lv_steps_2_0= rulePrimaryExpression ) )
            // InternalEduLangauage.g:365:4: (lv_steps_2_0= rulePrimaryExpression )
            {
            // InternalEduLangauage.g:365:4: (lv_steps_2_0= rulePrimaryExpression )
            // InternalEduLangauage.g:366:5: lv_steps_2_0= rulePrimaryExpression
            {

            					newCompositeNode(grammarAccess.getTrigoStatementAccess().getStepsPrimaryExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_12);
            lv_steps_2_0=rulePrimaryExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrigoStatementRule());
            					}
            					set(
            						current,
            						"steps",
            						lv_steps_2_0,
            						"uk.ac.kcl.inf.cw.edu.EduLangauage.PrimaryExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEduLangauage.g:383:3: (otherlv_3= ')' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEduLangauage.g:384:4: otherlv_3= ')'
            	    {
            	    otherlv_3=(Token)match(input,14,FOLLOW_12); 

            	    				newLeafNode(otherlv_3, grammarAccess.getTrigoStatementAccess().getRightParenthesisKeyword_3());
            	    			

            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleTrigoStatement"


    // $ANTLR start "entryRuleAddition"
    // InternalEduLangauage.g:393:1: entryRuleAddition returns [EObject current=null] : iv_ruleAddition= ruleAddition EOF ;
    public final EObject entryRuleAddition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAddition = null;


        try {
            // InternalEduLangauage.g:393:49: (iv_ruleAddition= ruleAddition EOF )
            // InternalEduLangauage.g:394:2: iv_ruleAddition= ruleAddition EOF
            {
             newCompositeNode(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAddition=ruleAddition();

            state._fsp--;

             current =iv_ruleAddition; 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalEduLangauage.g:400:1: ruleAddition returns [EObject current=null] : (this_MultiplDivision_0= ruleMultiplDivision ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplDivision ) ) )* ) ;
    public final EObject ruleAddition() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_MultiplDivision_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEduLangauage.g:406:2: ( (this_MultiplDivision_0= ruleMultiplDivision ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplDivision ) ) )* ) )
            // InternalEduLangauage.g:407:2: (this_MultiplDivision_0= ruleMultiplDivision ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplDivision ) ) )* )
            {
            // InternalEduLangauage.g:407:2: (this_MultiplDivision_0= ruleMultiplDivision ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplDivision ) ) )* )
            // InternalEduLangauage.g:408:3: this_MultiplDivision_0= ruleMultiplDivision ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplDivision ) ) )*
            {

            			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplDivisionParserRuleCall_0());
            		
            pushFollow(FOLLOW_13);
            this_MultiplDivision_0=ruleMultiplDivision();

            state._fsp--;


            			current = this_MultiplDivision_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEduLangauage.g:416:3: ( () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplDivision ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEduLangauage.g:417:4: () otherlv_2= '+' ( (lv_right_3_0= ruleMultiplDivision ) )
            	    {
            	    // InternalEduLangauage.g:417:4: ()
            	    // InternalEduLangauage.g:418:5: 
            	    {

            	    					current = forceCreateModelElementAndSet(
            	    						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
            	    						current);
            	    				

            	    }

            	    otherlv_2=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1());
            	    			
            	    // InternalEduLangauage.g:428:4: ( (lv_right_3_0= ruleMultiplDivision ) )
            	    // InternalEduLangauage.g:429:5: (lv_right_3_0= ruleMultiplDivision )
            	    {
            	    // InternalEduLangauage.g:429:5: (lv_right_3_0= ruleMultiplDivision )
            	    // InternalEduLangauage.g:430:6: lv_right_3_0= ruleMultiplDivision
            	    {

            	    						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplDivisionParserRuleCall_1_2_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_right_3_0=ruleMultiplDivision();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getAdditionRule());
            	    						}
            	    						add(
            	    							current,
            	    							"right",
            	    							lv_right_3_0,
            	    							"uk.ac.kcl.inf.cw.edu.EduLangauage.MultiplDivision");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplDivision"
    // InternalEduLangauage.g:452:1: entryRuleMultiplDivision returns [EObject current=null] : iv_ruleMultiplDivision= ruleMultiplDivision EOF ;
    public final EObject entryRuleMultiplDivision() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplDivision = null;


        try {
            // InternalEduLangauage.g:452:56: (iv_ruleMultiplDivision= ruleMultiplDivision EOF )
            // InternalEduLangauage.g:453:2: iv_ruleMultiplDivision= ruleMultiplDivision EOF
            {
             newCompositeNode(grammarAccess.getMultiplDivisionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiplDivision=ruleMultiplDivision();

            state._fsp--;

             current =iv_ruleMultiplDivision; 
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
    // $ANTLR end "entryRuleMultiplDivision"


    // $ANTLR start "ruleMultiplDivision"
    // InternalEduLangauage.g:459:1: ruleMultiplDivision returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimaryExpression ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimaryExpression ) ) ) )* ) ;
    public final EObject ruleMultiplDivision() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_3_0 = null;

        EObject lv_right_6_0 = null;



        	enterRule();

        try {
            // InternalEduLangauage.g:465:2: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimaryExpression ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimaryExpression ) ) ) )* ) )
            // InternalEduLangauage.g:466:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimaryExpression ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimaryExpression ) ) ) )* )
            {
            // InternalEduLangauage.g:466:2: (this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimaryExpression ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimaryExpression ) ) ) )* )
            // InternalEduLangauage.g:467:3: this_PrimaryExpression_0= rulePrimaryExpression ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimaryExpression ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimaryExpression ) ) ) )*
            {

            			newCompositeNode(grammarAccess.getMultiplDivisionAccess().getPrimaryExpressionParserRuleCall_0());
            		
            pushFollow(FOLLOW_14);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;


            			current = this_PrimaryExpression_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalEduLangauage.g:475:3: ( ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimaryExpression ) ) ) | ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimaryExpression ) ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    alt5=1;
                }
                else if ( (LA5_0==19) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEduLangauage.g:476:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimaryExpression ) ) )
            	    {
            	    // InternalEduLangauage.g:476:4: ( () otherlv_2= '*' ( (lv_right_3_0= rulePrimaryExpression ) ) )
            	    // InternalEduLangauage.g:477:5: () otherlv_2= '*' ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // InternalEduLangauage.g:477:5: ()
            	    // InternalEduLangauage.g:478:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplDivisionAccess().getMultiplicationLeftAction_1_0_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_2=(Token)match(input,18,FOLLOW_6); 

            	    					newLeafNode(otherlv_2, grammarAccess.getMultiplDivisionAccess().getAsteriskKeyword_1_0_1());
            	    				
            	    // InternalEduLangauage.g:488:5: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // InternalEduLangauage.g:489:6: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // InternalEduLangauage.g:489:6: (lv_right_3_0= rulePrimaryExpression )
            	    // InternalEduLangauage.g:490:7: lv_right_3_0= rulePrimaryExpression
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_0_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMultiplDivisionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"right",
            	    								lv_right_3_0,
            	    								"uk.ac.kcl.inf.cw.edu.EduLangauage.PrimaryExpression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalEduLangauage.g:509:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimaryExpression ) ) )
            	    {
            	    // InternalEduLangauage.g:509:4: ( () otherlv_5= '/' ( (lv_right_6_0= rulePrimaryExpression ) ) )
            	    // InternalEduLangauage.g:510:5: () otherlv_5= '/' ( (lv_right_6_0= rulePrimaryExpression ) )
            	    {
            	    // InternalEduLangauage.g:510:5: ()
            	    // InternalEduLangauage.g:511:6: 
            	    {

            	    						current = forceCreateModelElementAndSet(
            	    							grammarAccess.getMultiplDivisionAccess().getDivisionLeftAction_1_1_0(),
            	    							current);
            	    					

            	    }

            	    otherlv_5=(Token)match(input,19,FOLLOW_6); 

            	    					newLeafNode(otherlv_5, grammarAccess.getMultiplDivisionAccess().getSolidusKeyword_1_1_1());
            	    				
            	    // InternalEduLangauage.g:521:5: ( (lv_right_6_0= rulePrimaryExpression ) )
            	    // InternalEduLangauage.g:522:6: (lv_right_6_0= rulePrimaryExpression )
            	    {
            	    // InternalEduLangauage.g:522:6: (lv_right_6_0= rulePrimaryExpression )
            	    // InternalEduLangauage.g:523:7: lv_right_6_0= rulePrimaryExpression
            	    {

            	    							newCompositeNode(grammarAccess.getMultiplDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_1_2_0());
            	    						
            	    pushFollow(FOLLOW_14);
            	    lv_right_6_0=rulePrimaryExpression();

            	    state._fsp--;


            	    							if (current==null) {
            	    								current = createModelElementForParent(grammarAccess.getMultiplDivisionRule());
            	    							}
            	    							add(
            	    								current,
            	    								"right",
            	    								lv_right_6_0,
            	    								"uk.ac.kcl.inf.cw.edu.EduLangauage.PrimaryExpression");
            	    							afterParserOrEnumRuleCall();
            	    						

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleMultiplDivision"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalEduLangauage.g:546:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // InternalEduLangauage.g:546:58: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // InternalEduLangauage.g:547:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalEduLangauage.g:553:1: rulePrimaryExpression returns [EObject current=null] : (this_IntLiteral_0= ruleIntLiteral | this_VariableReference_1= ruleVariableReference | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_IntLiteral_0 = null;

        EObject this_VariableReference_1 = null;

        EObject this_Addition_3 = null;



        	enterRule();

        try {
            // InternalEduLangauage.g:559:2: ( (this_IntLiteral_0= ruleIntLiteral | this_VariableReference_1= ruleVariableReference | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) ) )
            // InternalEduLangauage.g:560:2: (this_IntLiteral_0= ruleIntLiteral | this_VariableReference_1= ruleVariableReference | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            {
            // InternalEduLangauage.g:560:2: (this_IntLiteral_0= ruleIntLiteral | this_VariableReference_1= ruleVariableReference | (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case 13:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalEduLangauage.g:561:3: this_IntLiteral_0= ruleIntLiteral
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIntLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_IntLiteral_0=ruleIntLiteral();

                    state._fsp--;


                    			current = this_IntLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalEduLangauage.g:570:3: this_VariableReference_1= ruleVariableReference
                    {

                    			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableReference_1=ruleVariableReference();

                    state._fsp--;


                    			current = this_VariableReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalEduLangauage.g:579:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    {
                    // InternalEduLangauage.g:579:3: (otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')' )
                    // InternalEduLangauage.g:580:4: otherlv_2= '(' this_Addition_3= ruleAddition otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAdditionParserRuleCall_2_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Addition_3=ruleAddition();

                    state._fsp--;


                    				current = this_Addition_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2());
                    			

                    }


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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalEduLangauage.g:601:1: entryRuleIntLiteral returns [EObject current=null] : iv_ruleIntLiteral= ruleIntLiteral EOF ;
    public final EObject entryRuleIntLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntLiteral = null;


        try {
            // InternalEduLangauage.g:601:51: (iv_ruleIntLiteral= ruleIntLiteral EOF )
            // InternalEduLangauage.g:602:2: iv_ruleIntLiteral= ruleIntLiteral EOF
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
    // InternalEduLangauage.g:608:1: ruleIntLiteral returns [EObject current=null] : ( (lv_val_0_0= RULE_INT ) ) ;
    public final EObject ruleIntLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_val_0_0=null;


        	enterRule();

        try {
            // InternalEduLangauage.g:614:2: ( ( (lv_val_0_0= RULE_INT ) ) )
            // InternalEduLangauage.g:615:2: ( (lv_val_0_0= RULE_INT ) )
            {
            // InternalEduLangauage.g:615:2: ( (lv_val_0_0= RULE_INT ) )
            // InternalEduLangauage.g:616:3: (lv_val_0_0= RULE_INT )
            {
            // InternalEduLangauage.g:616:3: (lv_val_0_0= RULE_INT )
            // InternalEduLangauage.g:617:4: lv_val_0_0= RULE_INT
            {
            lv_val_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_val_0_0, grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getIntLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"val",
            					lv_val_0_0,
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


    // $ANTLR start "entryRuleVariableReference"
    // InternalEduLangauage.g:636:1: entryRuleVariableReference returns [EObject current=null] : iv_ruleVariableReference= ruleVariableReference EOF ;
    public final EObject entryRuleVariableReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableReference = null;


        try {
            // InternalEduLangauage.g:636:58: (iv_ruleVariableReference= ruleVariableReference EOF )
            // InternalEduLangauage.g:637:2: iv_ruleVariableReference= ruleVariableReference EOF
            {
             newCompositeNode(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableReference=ruleVariableReference();

            state._fsp--;

             current =iv_ruleVariableReference; 
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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalEduLangauage.g:643:1: ruleVariableReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalEduLangauage.g:649:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalEduLangauage.g:650:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalEduLangauage.g:650:2: ( (otherlv_0= RULE_ID ) )
            // InternalEduLangauage.g:651:3: (otherlv_0= RULE_ID )
            {
            // InternalEduLangauage.g:651:3: (otherlv_0= RULE_ID )
            // InternalEduLangauage.g:652:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getVarVariableDeclarationCrossReference_0());
            			

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
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "ruleSideCommand"
    // InternalEduLangauage.g:666:1: ruleSideCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'adjacent' ) | (enumLiteral_1= 'opposite' ) | (enumLiteral_2= 'hypotenuse' ) ) ;
    public final Enumerator ruleSideCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEduLangauage.g:672:2: ( ( (enumLiteral_0= 'adjacent' ) | (enumLiteral_1= 'opposite' ) | (enumLiteral_2= 'hypotenuse' ) ) )
            // InternalEduLangauage.g:673:2: ( (enumLiteral_0= 'adjacent' ) | (enumLiteral_1= 'opposite' ) | (enumLiteral_2= 'hypotenuse' ) )
            {
            // InternalEduLangauage.g:673:2: ( (enumLiteral_0= 'adjacent' ) | (enumLiteral_1= 'opposite' ) | (enumLiteral_2= 'hypotenuse' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt7=1;
                }
                break;
            case 21:
                {
                alt7=2;
                }
                break;
            case 22:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEduLangauage.g:674:3: (enumLiteral_0= 'adjacent' )
                    {
                    // InternalEduLangauage.g:674:3: (enumLiteral_0= 'adjacent' )
                    // InternalEduLangauage.g:675:4: enumLiteral_0= 'adjacent'
                    {
                    enumLiteral_0=(Token)match(input,20,FOLLOW_2); 

                    				current = grammarAccess.getSideCommandAccess().getAdjacentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getSideCommandAccess().getAdjacentEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEduLangauage.g:682:3: (enumLiteral_1= 'opposite' )
                    {
                    // InternalEduLangauage.g:682:3: (enumLiteral_1= 'opposite' )
                    // InternalEduLangauage.g:683:4: enumLiteral_1= 'opposite'
                    {
                    enumLiteral_1=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getSideCommandAccess().getOppositeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getSideCommandAccess().getOppositeEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEduLangauage.g:690:3: (enumLiteral_2= 'hypotenuse' )
                    {
                    // InternalEduLangauage.g:690:3: (enumLiteral_2= 'hypotenuse' )
                    // InternalEduLangauage.g:691:4: enumLiteral_2= 'hypotenuse'
                    {
                    enumLiteral_2=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getSideCommandAccess().getHypotenuseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getSideCommandAccess().getHypotenuseEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleSideCommand"


    // $ANTLR start "ruleAngleCommand"
    // InternalEduLangauage.g:701:1: ruleAngleCommand returns [Enumerator current=null] : ( (enumLiteral_0= 'sin' ) | (enumLiteral_1= 'cos' ) | (enumLiteral_2= 'tan' ) ) ;
    public final Enumerator ruleAngleCommand() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEduLangauage.g:707:2: ( ( (enumLiteral_0= 'sin' ) | (enumLiteral_1= 'cos' ) | (enumLiteral_2= 'tan' ) ) )
            // InternalEduLangauage.g:708:2: ( (enumLiteral_0= 'sin' ) | (enumLiteral_1= 'cos' ) | (enumLiteral_2= 'tan' ) )
            {
            // InternalEduLangauage.g:708:2: ( (enumLiteral_0= 'sin' ) | (enumLiteral_1= 'cos' ) | (enumLiteral_2= 'tan' ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalEduLangauage.g:709:3: (enumLiteral_0= 'sin' )
                    {
                    // InternalEduLangauage.g:709:3: (enumLiteral_0= 'sin' )
                    // InternalEduLangauage.g:710:4: enumLiteral_0= 'sin'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getAngleCommandAccess().getSinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getAngleCommandAccess().getSinEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEduLangauage.g:717:3: (enumLiteral_1= 'cos' )
                    {
                    // InternalEduLangauage.g:717:3: (enumLiteral_1= 'cos' )
                    // InternalEduLangauage.g:718:4: enumLiteral_1= 'cos'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getAngleCommandAccess().getCosEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getAngleCommandAccess().getCosEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEduLangauage.g:725:3: (enumLiteral_2= 'tan' )
                    {
                    // InternalEduLangauage.g:725:3: (enumLiteral_2= 'tan' )
                    // InternalEduLangauage.g:726:4: enumLiteral_2= 'tan'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getAngleCommandAccess().getTanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getAngleCommandAccess().getTanEnumLiteralDeclaration_2());
                    			

                    }


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
    // $ANTLR end "ruleAngleCommand"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000003F00802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0002L});

}