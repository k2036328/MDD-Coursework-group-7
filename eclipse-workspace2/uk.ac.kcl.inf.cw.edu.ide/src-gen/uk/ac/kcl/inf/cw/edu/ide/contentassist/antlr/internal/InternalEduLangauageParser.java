package uk.ac.kcl.inf.cw.edu.ide.contentassist.antlr.internal;

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
import uk.ac.kcl.inf.cw.edu.services.EduLangauageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEduLangauageParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'adjacent'", "'opposite'", "'hypotenuse'", "'sin'", "'cos'", "'tan'", "'var'", "'='", "'('", "')'", "'cm'", "'.'", "'+'", "'*'", "'/'"
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
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

    	public void setGrammarAccess(EduLangauageGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTrigoProgram"
    // InternalEduLangauage.g:53:1: entryRuleTrigoProgram : ruleTrigoProgram EOF ;
    public final void entryRuleTrigoProgram() throws RecognitionException {
        try {
            // InternalEduLangauage.g:54:1: ( ruleTrigoProgram EOF )
            // InternalEduLangauage.g:55:1: ruleTrigoProgram EOF
            {
             before(grammarAccess.getTrigoProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleTrigoProgram();

            state._fsp--;

             after(grammarAccess.getTrigoProgramRule()); 
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
    // $ANTLR end "entryRuleTrigoProgram"


    // $ANTLR start "ruleTrigoProgram"
    // InternalEduLangauage.g:62:1: ruleTrigoProgram : ( ( rule__TrigoProgram__StatementsAssignment )* ) ;
    public final void ruleTrigoProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:66:2: ( ( ( rule__TrigoProgram__StatementsAssignment )* ) )
            // InternalEduLangauage.g:67:2: ( ( rule__TrigoProgram__StatementsAssignment )* )
            {
            // InternalEduLangauage.g:67:2: ( ( rule__TrigoProgram__StatementsAssignment )* )
            // InternalEduLangauage.g:68:3: ( rule__TrigoProgram__StatementsAssignment )*
            {
             before(grammarAccess.getTrigoProgramAccess().getStatementsAssignment()); 
            // InternalEduLangauage.g:69:3: ( rule__TrigoProgram__StatementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=11 && LA1_0<=17)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEduLangauage.g:69:4: rule__TrigoProgram__StatementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__TrigoProgram__StatementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getTrigoProgramAccess().getStatementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrigoProgram"


    // $ANTLR start "entryRuleStatement"
    // InternalEduLangauage.g:78:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // InternalEduLangauage.g:79:1: ( ruleStatement EOF )
            // InternalEduLangauage.g:80:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // InternalEduLangauage.g:87:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:91:2: ( ( ( rule__Statement__Alternatives ) ) )
            // InternalEduLangauage.g:92:2: ( ( rule__Statement__Alternatives ) )
            {
            // InternalEduLangauage.g:92:2: ( ( rule__Statement__Alternatives ) )
            // InternalEduLangauage.g:93:3: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // InternalEduLangauage.g:94:3: ( rule__Statement__Alternatives )
            // InternalEduLangauage.g:94:4: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleVariableDeclaration"
    // InternalEduLangauage.g:103:1: entryRuleVariableDeclaration : ruleVariableDeclaration EOF ;
    public final void entryRuleVariableDeclaration() throws RecognitionException {
        try {
            // InternalEduLangauage.g:104:1: ( ruleVariableDeclaration EOF )
            // InternalEduLangauage.g:105:1: ruleVariableDeclaration EOF
            {
             before(grammarAccess.getVariableDeclarationRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDeclaration();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationRule()); 
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
    // $ANTLR end "entryRuleVariableDeclaration"


    // $ANTLR start "ruleVariableDeclaration"
    // InternalEduLangauage.g:112:1: ruleVariableDeclaration : ( ( rule__VariableDeclaration__Group__0 ) ) ;
    public final void ruleVariableDeclaration() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:116:2: ( ( ( rule__VariableDeclaration__Group__0 ) ) )
            // InternalEduLangauage.g:117:2: ( ( rule__VariableDeclaration__Group__0 ) )
            {
            // InternalEduLangauage.g:117:2: ( ( rule__VariableDeclaration__Group__0 ) )
            // InternalEduLangauage.g:118:3: ( rule__VariableDeclaration__Group__0 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getGroup()); 
            // InternalEduLangauage.g:119:3: ( rule__VariableDeclaration__Group__0 )
            // InternalEduLangauage.g:119:4: rule__VariableDeclaration__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableDeclaration"


    // $ANTLR start "entryRuleSideStatement"
    // InternalEduLangauage.g:128:1: entryRuleSideStatement : ruleSideStatement EOF ;
    public final void entryRuleSideStatement() throws RecognitionException {
        try {
            // InternalEduLangauage.g:129:1: ( ruleSideStatement EOF )
            // InternalEduLangauage.g:130:1: ruleSideStatement EOF
            {
             before(grammarAccess.getSideStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleSideStatement();

            state._fsp--;

             after(grammarAccess.getSideStatementRule()); 
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
    // $ANTLR end "entryRuleSideStatement"


    // $ANTLR start "ruleSideStatement"
    // InternalEduLangauage.g:137:1: ruleSideStatement : ( ( rule__SideStatement__Group__0 ) ) ;
    public final void ruleSideStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:141:2: ( ( ( rule__SideStatement__Group__0 ) ) )
            // InternalEduLangauage.g:142:2: ( ( rule__SideStatement__Group__0 ) )
            {
            // InternalEduLangauage.g:142:2: ( ( rule__SideStatement__Group__0 ) )
            // InternalEduLangauage.g:143:3: ( rule__SideStatement__Group__0 )
            {
             before(grammarAccess.getSideStatementAccess().getGroup()); 
            // InternalEduLangauage.g:144:3: ( rule__SideStatement__Group__0 )
            // InternalEduLangauage.g:144:4: rule__SideStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SideStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSideStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSideStatement"


    // $ANTLR start "entryRuleREAL"
    // InternalEduLangauage.g:153:1: entryRuleREAL : ruleREAL EOF ;
    public final void entryRuleREAL() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEduLangauage.g:157:1: ( ruleREAL EOF )
            // InternalEduLangauage.g:158:1: ruleREAL EOF
            {
             before(grammarAccess.getREALRule()); 
            pushFollow(FOLLOW_1);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getREALRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleREAL"


    // $ANTLR start "ruleREAL"
    // InternalEduLangauage.g:168:1: ruleREAL : ( ( rule__REAL__Group__0 ) ) ;
    public final void ruleREAL() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:173:2: ( ( ( rule__REAL__Group__0 ) ) )
            // InternalEduLangauage.g:174:2: ( ( rule__REAL__Group__0 ) )
            {
            // InternalEduLangauage.g:174:2: ( ( rule__REAL__Group__0 ) )
            // InternalEduLangauage.g:175:3: ( rule__REAL__Group__0 )
            {
             before(grammarAccess.getREALAccess().getGroup()); 
            // InternalEduLangauage.g:176:3: ( rule__REAL__Group__0 )
            // InternalEduLangauage.g:176:4: rule__REAL__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getREALAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleREAL"


    // $ANTLR start "entryRuleTrigoStatement"
    // InternalEduLangauage.g:186:1: entryRuleTrigoStatement : ruleTrigoStatement EOF ;
    public final void entryRuleTrigoStatement() throws RecognitionException {
        try {
            // InternalEduLangauage.g:187:1: ( ruleTrigoStatement EOF )
            // InternalEduLangauage.g:188:1: ruleTrigoStatement EOF
            {
             before(grammarAccess.getTrigoStatementRule()); 
            pushFollow(FOLLOW_1);
            ruleTrigoStatement();

            state._fsp--;

             after(grammarAccess.getTrigoStatementRule()); 
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
    // $ANTLR end "entryRuleTrigoStatement"


    // $ANTLR start "ruleTrigoStatement"
    // InternalEduLangauage.g:195:1: ruleTrigoStatement : ( ( rule__TrigoStatement__Group__0 ) ) ;
    public final void ruleTrigoStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:199:2: ( ( ( rule__TrigoStatement__Group__0 ) ) )
            // InternalEduLangauage.g:200:2: ( ( rule__TrigoStatement__Group__0 ) )
            {
            // InternalEduLangauage.g:200:2: ( ( rule__TrigoStatement__Group__0 ) )
            // InternalEduLangauage.g:201:3: ( rule__TrigoStatement__Group__0 )
            {
             before(grammarAccess.getTrigoStatementAccess().getGroup()); 
            // InternalEduLangauage.g:202:3: ( rule__TrigoStatement__Group__0 )
            // InternalEduLangauage.g:202:4: rule__TrigoStatement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TrigoStatement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrigoStatementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrigoStatement"


    // $ANTLR start "entryRuleAddition"
    // InternalEduLangauage.g:211:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalEduLangauage.g:212:1: ( ruleAddition EOF )
            // InternalEduLangauage.g:213:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
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
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalEduLangauage.g:220:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:224:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalEduLangauage.g:225:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalEduLangauage.g:225:2: ( ( rule__Addition__Group__0 ) )
            // InternalEduLangauage.g:226:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalEduLangauage.g:227:3: ( rule__Addition__Group__0 )
            // InternalEduLangauage.g:227:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplDivision"
    // InternalEduLangauage.g:236:1: entryRuleMultiplDivision : ruleMultiplDivision EOF ;
    public final void entryRuleMultiplDivision() throws RecognitionException {
        try {
            // InternalEduLangauage.g:237:1: ( ruleMultiplDivision EOF )
            // InternalEduLangauage.g:238:1: ruleMultiplDivision EOF
            {
             before(grammarAccess.getMultiplDivisionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplDivision();

            state._fsp--;

             after(grammarAccess.getMultiplDivisionRule()); 
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
    // $ANTLR end "entryRuleMultiplDivision"


    // $ANTLR start "ruleMultiplDivision"
    // InternalEduLangauage.g:245:1: ruleMultiplDivision : ( ( rule__MultiplDivision__Group__0 ) ) ;
    public final void ruleMultiplDivision() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:249:2: ( ( ( rule__MultiplDivision__Group__0 ) ) )
            // InternalEduLangauage.g:250:2: ( ( rule__MultiplDivision__Group__0 ) )
            {
            // InternalEduLangauage.g:250:2: ( ( rule__MultiplDivision__Group__0 ) )
            // InternalEduLangauage.g:251:3: ( rule__MultiplDivision__Group__0 )
            {
             before(grammarAccess.getMultiplDivisionAccess().getGroup()); 
            // InternalEduLangauage.g:252:3: ( rule__MultiplDivision__Group__0 )
            // InternalEduLangauage.g:252:4: rule__MultiplDivision__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultiplDivision__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplDivisionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplDivision"


    // $ANTLR start "entryRulePrimaryExpression"
    // InternalEduLangauage.g:261:1: entryRulePrimaryExpression : rulePrimaryExpression EOF ;
    public final void entryRulePrimaryExpression() throws RecognitionException {
        try {
            // InternalEduLangauage.g:262:1: ( rulePrimaryExpression EOF )
            // InternalEduLangauage.g:263:1: rulePrimaryExpression EOF
            {
             before(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FOLLOW_1);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionRule()); 
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
    // $ANTLR end "entryRulePrimaryExpression"


    // $ANTLR start "rulePrimaryExpression"
    // InternalEduLangauage.g:270:1: rulePrimaryExpression : ( ( rule__PrimaryExpression__Alternatives ) ) ;
    public final void rulePrimaryExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:274:2: ( ( ( rule__PrimaryExpression__Alternatives ) ) )
            // InternalEduLangauage.g:275:2: ( ( rule__PrimaryExpression__Alternatives ) )
            {
            // InternalEduLangauage.g:275:2: ( ( rule__PrimaryExpression__Alternatives ) )
            // InternalEduLangauage.g:276:3: ( rule__PrimaryExpression__Alternatives )
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 
            // InternalEduLangauage.g:277:3: ( rule__PrimaryExpression__Alternatives )
            // InternalEduLangauage.g:277:4: rule__PrimaryExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleIntLiteral"
    // InternalEduLangauage.g:286:1: entryRuleIntLiteral : ruleIntLiteral EOF ;
    public final void entryRuleIntLiteral() throws RecognitionException {
        try {
            // InternalEduLangauage.g:287:1: ( ruleIntLiteral EOF )
            // InternalEduLangauage.g:288:1: ruleIntLiteral EOF
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
    // InternalEduLangauage.g:295:1: ruleIntLiteral : ( ( rule__IntLiteral__ValAssignment ) ) ;
    public final void ruleIntLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:299:2: ( ( ( rule__IntLiteral__ValAssignment ) ) )
            // InternalEduLangauage.g:300:2: ( ( rule__IntLiteral__ValAssignment ) )
            {
            // InternalEduLangauage.g:300:2: ( ( rule__IntLiteral__ValAssignment ) )
            // InternalEduLangauage.g:301:3: ( rule__IntLiteral__ValAssignment )
            {
             before(grammarAccess.getIntLiteralAccess().getValAssignment()); 
            // InternalEduLangauage.g:302:3: ( rule__IntLiteral__ValAssignment )
            // InternalEduLangauage.g:302:4: rule__IntLiteral__ValAssignment
            {
            pushFollow(FOLLOW_2);
            rule__IntLiteral__ValAssignment();

            state._fsp--;


            }

             after(grammarAccess.getIntLiteralAccess().getValAssignment()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleVariableReference"
    // InternalEduLangauage.g:311:1: entryRuleVariableReference : ruleVariableReference EOF ;
    public final void entryRuleVariableReference() throws RecognitionException {
        try {
            // InternalEduLangauage.g:312:1: ( ruleVariableReference EOF )
            // InternalEduLangauage.g:313:1: ruleVariableReference EOF
            {
             before(grammarAccess.getVariableReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableReference();

            state._fsp--;

             after(grammarAccess.getVariableReferenceRule()); 
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
    // $ANTLR end "entryRuleVariableReference"


    // $ANTLR start "ruleVariableReference"
    // InternalEduLangauage.g:320:1: ruleVariableReference : ( ( rule__VariableReference__VarAssignment ) ) ;
    public final void ruleVariableReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:324:2: ( ( ( rule__VariableReference__VarAssignment ) ) )
            // InternalEduLangauage.g:325:2: ( ( rule__VariableReference__VarAssignment ) )
            {
            // InternalEduLangauage.g:325:2: ( ( rule__VariableReference__VarAssignment ) )
            // InternalEduLangauage.g:326:3: ( rule__VariableReference__VarAssignment )
            {
             before(grammarAccess.getVariableReferenceAccess().getVarAssignment()); 
            // InternalEduLangauage.g:327:3: ( rule__VariableReference__VarAssignment )
            // InternalEduLangauage.g:327:4: rule__VariableReference__VarAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableReference__VarAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableReferenceAccess().getVarAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableReference"


    // $ANTLR start "ruleSideCommand"
    // InternalEduLangauage.g:336:1: ruleSideCommand : ( ( rule__SideCommand__Alternatives ) ) ;
    public final void ruleSideCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:340:1: ( ( ( rule__SideCommand__Alternatives ) ) )
            // InternalEduLangauage.g:341:2: ( ( rule__SideCommand__Alternatives ) )
            {
            // InternalEduLangauage.g:341:2: ( ( rule__SideCommand__Alternatives ) )
            // InternalEduLangauage.g:342:3: ( rule__SideCommand__Alternatives )
            {
             before(grammarAccess.getSideCommandAccess().getAlternatives()); 
            // InternalEduLangauage.g:343:3: ( rule__SideCommand__Alternatives )
            // InternalEduLangauage.g:343:4: rule__SideCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SideCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSideCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSideCommand"


    // $ANTLR start "ruleAngleCommand"
    // InternalEduLangauage.g:352:1: ruleAngleCommand : ( ( rule__AngleCommand__Alternatives ) ) ;
    public final void ruleAngleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:356:1: ( ( ( rule__AngleCommand__Alternatives ) ) )
            // InternalEduLangauage.g:357:2: ( ( rule__AngleCommand__Alternatives ) )
            {
            // InternalEduLangauage.g:357:2: ( ( rule__AngleCommand__Alternatives ) )
            // InternalEduLangauage.g:358:3: ( rule__AngleCommand__Alternatives )
            {
             before(grammarAccess.getAngleCommandAccess().getAlternatives()); 
            // InternalEduLangauage.g:359:3: ( rule__AngleCommand__Alternatives )
            // InternalEduLangauage.g:359:4: rule__AngleCommand__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AngleCommand__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAngleCommandAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAngleCommand"


    // $ANTLR start "rule__Statement__Alternatives"
    // InternalEduLangauage.g:367:1: rule__Statement__Alternatives : ( ( ruleSideStatement ) | ( ruleTrigoStatement ) | ( ruleVariableDeclaration ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:371:1: ( ( ruleSideStatement ) | ( ruleTrigoStatement ) | ( ruleVariableDeclaration ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
            case 12:
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
            case 15:
            case 16:
                {
                alt2=2;
                }
                break;
            case 17:
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
                    // InternalEduLangauage.g:372:2: ( ruleSideStatement )
                    {
                    // InternalEduLangauage.g:372:2: ( ruleSideStatement )
                    // InternalEduLangauage.g:373:3: ruleSideStatement
                    {
                     before(grammarAccess.getStatementAccess().getSideStatementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSideStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getSideStatementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduLangauage.g:378:2: ( ruleTrigoStatement )
                    {
                    // InternalEduLangauage.g:378:2: ( ruleTrigoStatement )
                    // InternalEduLangauage.g:379:3: ruleTrigoStatement
                    {
                     before(grammarAccess.getStatementAccess().getTrigoStatementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTrigoStatement();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getTrigoStatementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEduLangauage.g:384:2: ( ruleVariableDeclaration )
                    {
                    // InternalEduLangauage.g:384:2: ( ruleVariableDeclaration )
                    // InternalEduLangauage.g:385:3: ruleVariableDeclaration
                    {
                     before(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableDeclaration();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_2()); 

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
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__MultiplDivision__Alternatives_1"
    // InternalEduLangauage.g:394:1: rule__MultiplDivision__Alternatives_1 : ( ( ( rule__MultiplDivision__Group_1_0__0 ) ) | ( ( rule__MultiplDivision__Group_1_1__0 ) ) );
    public final void rule__MultiplDivision__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:398:1: ( ( ( rule__MultiplDivision__Group_1_0__0 ) ) | ( ( rule__MultiplDivision__Group_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==24) ) {
                alt3=1;
            }
            else if ( (LA3_0==25) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEduLangauage.g:399:2: ( ( rule__MultiplDivision__Group_1_0__0 ) )
                    {
                    // InternalEduLangauage.g:399:2: ( ( rule__MultiplDivision__Group_1_0__0 ) )
                    // InternalEduLangauage.g:400:3: ( rule__MultiplDivision__Group_1_0__0 )
                    {
                     before(grammarAccess.getMultiplDivisionAccess().getGroup_1_0()); 
                    // InternalEduLangauage.g:401:3: ( rule__MultiplDivision__Group_1_0__0 )
                    // InternalEduLangauage.g:401:4: rule__MultiplDivision__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplDivision__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplDivisionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduLangauage.g:405:2: ( ( rule__MultiplDivision__Group_1_1__0 ) )
                    {
                    // InternalEduLangauage.g:405:2: ( ( rule__MultiplDivision__Group_1_1__0 ) )
                    // InternalEduLangauage.g:406:3: ( rule__MultiplDivision__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultiplDivisionAccess().getGroup_1_1()); 
                    // InternalEduLangauage.g:407:3: ( rule__MultiplDivision__Group_1_1__0 )
                    // InternalEduLangauage.g:407:4: rule__MultiplDivision__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultiplDivision__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplDivisionAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__MultiplDivision__Alternatives_1"


    // $ANTLR start "rule__PrimaryExpression__Alternatives"
    // InternalEduLangauage.g:415:1: rule__PrimaryExpression__Alternatives : ( ( ruleIntLiteral ) | ( ruleVariableReference ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) );
    public final void rule__PrimaryExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:419:1: ( ( ruleIntLiteral ) | ( ruleVariableReference ) | ( ( rule__PrimaryExpression__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case RULE_ID:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalEduLangauage.g:420:2: ( ruleIntLiteral )
                    {
                    // InternalEduLangauage.g:420:2: ( ruleIntLiteral )
                    // InternalEduLangauage.g:421:3: ruleIntLiteral
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getIntLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIntLiteral();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getIntLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduLangauage.g:426:2: ( ruleVariableReference )
                    {
                    // InternalEduLangauage.g:426:2: ( ruleVariableReference )
                    // InternalEduLangauage.g:427:3: ruleVariableReference
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableReference();

                    state._fsp--;

                     after(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEduLangauage.g:432:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    {
                    // InternalEduLangauage.g:432:2: ( ( rule__PrimaryExpression__Group_2__0 ) )
                    // InternalEduLangauage.g:433:3: ( rule__PrimaryExpression__Group_2__0 )
                    {
                     before(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 
                    // InternalEduLangauage.g:434:3: ( rule__PrimaryExpression__Group_2__0 )
                    // InternalEduLangauage.g:434:4: rule__PrimaryExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimaryExpression__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryExpressionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__PrimaryExpression__Alternatives"


    // $ANTLR start "rule__SideCommand__Alternatives"
    // InternalEduLangauage.g:442:1: rule__SideCommand__Alternatives : ( ( ( 'adjacent' ) ) | ( ( 'opposite' ) ) | ( ( 'hypotenuse' ) ) );
    public final void rule__SideCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:446:1: ( ( ( 'adjacent' ) ) | ( ( 'opposite' ) ) | ( ( 'hypotenuse' ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt5=1;
                }
                break;
            case 12:
                {
                alt5=2;
                }
                break;
            case 13:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalEduLangauage.g:447:2: ( ( 'adjacent' ) )
                    {
                    // InternalEduLangauage.g:447:2: ( ( 'adjacent' ) )
                    // InternalEduLangauage.g:448:3: ( 'adjacent' )
                    {
                     before(grammarAccess.getSideCommandAccess().getAdjacentEnumLiteralDeclaration_0()); 
                    // InternalEduLangauage.g:449:3: ( 'adjacent' )
                    // InternalEduLangauage.g:449:4: 'adjacent'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getSideCommandAccess().getAdjacentEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduLangauage.g:453:2: ( ( 'opposite' ) )
                    {
                    // InternalEduLangauage.g:453:2: ( ( 'opposite' ) )
                    // InternalEduLangauage.g:454:3: ( 'opposite' )
                    {
                     before(grammarAccess.getSideCommandAccess().getOppositeEnumLiteralDeclaration_1()); 
                    // InternalEduLangauage.g:455:3: ( 'opposite' )
                    // InternalEduLangauage.g:455:4: 'opposite'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getSideCommandAccess().getOppositeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEduLangauage.g:459:2: ( ( 'hypotenuse' ) )
                    {
                    // InternalEduLangauage.g:459:2: ( ( 'hypotenuse' ) )
                    // InternalEduLangauage.g:460:3: ( 'hypotenuse' )
                    {
                     before(grammarAccess.getSideCommandAccess().getHypotenuseEnumLiteralDeclaration_2()); 
                    // InternalEduLangauage.g:461:3: ( 'hypotenuse' )
                    // InternalEduLangauage.g:461:4: 'hypotenuse'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSideCommandAccess().getHypotenuseEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__SideCommand__Alternatives"


    // $ANTLR start "rule__AngleCommand__Alternatives"
    // InternalEduLangauage.g:469:1: rule__AngleCommand__Alternatives : ( ( ( 'sin' ) ) | ( ( 'cos' ) ) | ( ( 'tan' ) ) );
    public final void rule__AngleCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:473:1: ( ( ( 'sin' ) ) | ( ( 'cos' ) ) | ( ( 'tan' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 15:
                {
                alt6=2;
                }
                break;
            case 16:
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
                    // InternalEduLangauage.g:474:2: ( ( 'sin' ) )
                    {
                    // InternalEduLangauage.g:474:2: ( ( 'sin' ) )
                    // InternalEduLangauage.g:475:3: ( 'sin' )
                    {
                     before(grammarAccess.getAngleCommandAccess().getSinEnumLiteralDeclaration_0()); 
                    // InternalEduLangauage.g:476:3: ( 'sin' )
                    // InternalEduLangauage.g:476:4: 'sin'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getAngleCommandAccess().getSinEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEduLangauage.g:480:2: ( ( 'cos' ) )
                    {
                    // InternalEduLangauage.g:480:2: ( ( 'cos' ) )
                    // InternalEduLangauage.g:481:3: ( 'cos' )
                    {
                     before(grammarAccess.getAngleCommandAccess().getCosEnumLiteralDeclaration_1()); 
                    // InternalEduLangauage.g:482:3: ( 'cos' )
                    // InternalEduLangauage.g:482:4: 'cos'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getAngleCommandAccess().getCosEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEduLangauage.g:486:2: ( ( 'tan' ) )
                    {
                    // InternalEduLangauage.g:486:2: ( ( 'tan' ) )
                    // InternalEduLangauage.g:487:3: ( 'tan' )
                    {
                     before(grammarAccess.getAngleCommandAccess().getTanEnumLiteralDeclaration_2()); 
                    // InternalEduLangauage.g:488:3: ( 'tan' )
                    // InternalEduLangauage.g:488:4: 'tan'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getAngleCommandAccess().getTanEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__AngleCommand__Alternatives"


    // $ANTLR start "rule__VariableDeclaration__Group__0"
    // InternalEduLangauage.g:496:1: rule__VariableDeclaration__Group__0 : rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 ;
    public final void rule__VariableDeclaration__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:500:1: ( rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1 )
            // InternalEduLangauage.g:501:2: rule__VariableDeclaration__Group__0__Impl rule__VariableDeclaration__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableDeclaration__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__1();

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
    // $ANTLR end "rule__VariableDeclaration__Group__0"


    // $ANTLR start "rule__VariableDeclaration__Group__0__Impl"
    // InternalEduLangauage.g:508:1: rule__VariableDeclaration__Group__0__Impl : ( 'var' ) ;
    public final void rule__VariableDeclaration__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:512:1: ( ( 'var' ) )
            // InternalEduLangauage.g:513:1: ( 'var' )
            {
            // InternalEduLangauage.g:513:1: ( 'var' )
            // InternalEduLangauage.g:514:2: 'var'
            {
             before(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__0__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__1"
    // InternalEduLangauage.g:523:1: rule__VariableDeclaration__Group__1 : rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 ;
    public final void rule__VariableDeclaration__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:527:1: ( rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2 )
            // InternalEduLangauage.g:528:2: rule__VariableDeclaration__Group__1__Impl rule__VariableDeclaration__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__VariableDeclaration__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__2();

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
    // $ANTLR end "rule__VariableDeclaration__Group__1"


    // $ANTLR start "rule__VariableDeclaration__Group__1__Impl"
    // InternalEduLangauage.g:535:1: rule__VariableDeclaration__Group__1__Impl : ( ( rule__VariableDeclaration__NameAssignment_1 ) ) ;
    public final void rule__VariableDeclaration__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:539:1: ( ( ( rule__VariableDeclaration__NameAssignment_1 ) ) )
            // InternalEduLangauage.g:540:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            {
            // InternalEduLangauage.g:540:1: ( ( rule__VariableDeclaration__NameAssignment_1 ) )
            // InternalEduLangauage.g:541:2: ( rule__VariableDeclaration__NameAssignment_1 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 
            // InternalEduLangauage.g:542:2: ( rule__VariableDeclaration__NameAssignment_1 )
            // InternalEduLangauage.g:542:3: rule__VariableDeclaration__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__1__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__2"
    // InternalEduLangauage.g:550:1: rule__VariableDeclaration__Group__2 : rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 ;
    public final void rule__VariableDeclaration__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:554:1: ( rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3 )
            // InternalEduLangauage.g:555:2: rule__VariableDeclaration__Group__2__Impl rule__VariableDeclaration__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__VariableDeclaration__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3();

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
    // $ANTLR end "rule__VariableDeclaration__Group__2"


    // $ANTLR start "rule__VariableDeclaration__Group__2__Impl"
    // InternalEduLangauage.g:562:1: rule__VariableDeclaration__Group__2__Impl : ( '=' ) ;
    public final void rule__VariableDeclaration__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:566:1: ( ( '=' ) )
            // InternalEduLangauage.g:567:1: ( '=' )
            {
            // InternalEduLangauage.g:567:1: ( '=' )
            // InternalEduLangauage.g:568:2: '='
            {
             before(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__2__Impl"


    // $ANTLR start "rule__VariableDeclaration__Group__3"
    // InternalEduLangauage.g:577:1: rule__VariableDeclaration__Group__3 : rule__VariableDeclaration__Group__3__Impl ;
    public final void rule__VariableDeclaration__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:581:1: ( rule__VariableDeclaration__Group__3__Impl )
            // InternalEduLangauage.g:582:2: rule__VariableDeclaration__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__Group__3__Impl();

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
    // $ANTLR end "rule__VariableDeclaration__Group__3"


    // $ANTLR start "rule__VariableDeclaration__Group__3__Impl"
    // InternalEduLangauage.g:588:1: rule__VariableDeclaration__Group__3__Impl : ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) ;
    public final void rule__VariableDeclaration__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:592:1: ( ( ( rule__VariableDeclaration__ValueAssignment_3 ) ) )
            // InternalEduLangauage.g:593:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            {
            // InternalEduLangauage.g:593:1: ( ( rule__VariableDeclaration__ValueAssignment_3 ) )
            // InternalEduLangauage.g:594:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            {
             before(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 
            // InternalEduLangauage.g:595:2: ( rule__VariableDeclaration__ValueAssignment_3 )
            // InternalEduLangauage.g:595:3: rule__VariableDeclaration__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDeclaration__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDeclarationAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__Group__3__Impl"


    // $ANTLR start "rule__SideStatement__Group__0"
    // InternalEduLangauage.g:604:1: rule__SideStatement__Group__0 : rule__SideStatement__Group__0__Impl rule__SideStatement__Group__1 ;
    public final void rule__SideStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:608:1: ( rule__SideStatement__Group__0__Impl rule__SideStatement__Group__1 )
            // InternalEduLangauage.g:609:2: rule__SideStatement__Group__0__Impl rule__SideStatement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__SideStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SideStatement__Group__1();

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
    // $ANTLR end "rule__SideStatement__Group__0"


    // $ANTLR start "rule__SideStatement__Group__0__Impl"
    // InternalEduLangauage.g:616:1: rule__SideStatement__Group__0__Impl : ( ( rule__SideStatement__CommandAssignment_0 ) ) ;
    public final void rule__SideStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:620:1: ( ( ( rule__SideStatement__CommandAssignment_0 ) ) )
            // InternalEduLangauage.g:621:1: ( ( rule__SideStatement__CommandAssignment_0 ) )
            {
            // InternalEduLangauage.g:621:1: ( ( rule__SideStatement__CommandAssignment_0 ) )
            // InternalEduLangauage.g:622:2: ( rule__SideStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getSideStatementAccess().getCommandAssignment_0()); 
            // InternalEduLangauage.g:623:2: ( rule__SideStatement__CommandAssignment_0 )
            // InternalEduLangauage.g:623:3: rule__SideStatement__CommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SideStatement__CommandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSideStatementAccess().getCommandAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SideStatement__Group__0__Impl"


    // $ANTLR start "rule__SideStatement__Group__1"
    // InternalEduLangauage.g:631:1: rule__SideStatement__Group__1 : rule__SideStatement__Group__1__Impl rule__SideStatement__Group__2 ;
    public final void rule__SideStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:635:1: ( rule__SideStatement__Group__1__Impl rule__SideStatement__Group__2 )
            // InternalEduLangauage.g:636:2: rule__SideStatement__Group__1__Impl rule__SideStatement__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__SideStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SideStatement__Group__2();

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
    // $ANTLR end "rule__SideStatement__Group__1"


    // $ANTLR start "rule__SideStatement__Group__1__Impl"
    // InternalEduLangauage.g:643:1: rule__SideStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__SideStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:647:1: ( ( '(' ) )
            // InternalEduLangauage.g:648:1: ( '(' )
            {
            // InternalEduLangauage.g:648:1: ( '(' )
            // InternalEduLangauage.g:649:2: '('
            {
             before(grammarAccess.getSideStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getSideStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SideStatement__Group__1__Impl"


    // $ANTLR start "rule__SideStatement__Group__2"
    // InternalEduLangauage.g:658:1: rule__SideStatement__Group__2 : rule__SideStatement__Group__2__Impl rule__SideStatement__Group__3 ;
    public final void rule__SideStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:662:1: ( rule__SideStatement__Group__2__Impl rule__SideStatement__Group__3 )
            // InternalEduLangauage.g:663:2: rule__SideStatement__Group__2__Impl rule__SideStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__SideStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SideStatement__Group__3();

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
    // $ANTLR end "rule__SideStatement__Group__2"


    // $ANTLR start "rule__SideStatement__Group__2__Impl"
    // InternalEduLangauage.g:670:1: rule__SideStatement__Group__2__Impl : ( ( rule__SideStatement__StepsAssignment_2 ) ) ;
    public final void rule__SideStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:674:1: ( ( ( rule__SideStatement__StepsAssignment_2 ) ) )
            // InternalEduLangauage.g:675:1: ( ( rule__SideStatement__StepsAssignment_2 ) )
            {
            // InternalEduLangauage.g:675:1: ( ( rule__SideStatement__StepsAssignment_2 ) )
            // InternalEduLangauage.g:676:2: ( rule__SideStatement__StepsAssignment_2 )
            {
             before(grammarAccess.getSideStatementAccess().getStepsAssignment_2()); 
            // InternalEduLangauage.g:677:2: ( rule__SideStatement__StepsAssignment_2 )
            // InternalEduLangauage.g:677:3: rule__SideStatement__StepsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SideStatement__StepsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSideStatementAccess().getStepsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SideStatement__Group__2__Impl"


    // $ANTLR start "rule__SideStatement__Group__3"
    // InternalEduLangauage.g:685:1: rule__SideStatement__Group__3 : rule__SideStatement__Group__3__Impl rule__SideStatement__Group__4 ;
    public final void rule__SideStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:689:1: ( rule__SideStatement__Group__3__Impl rule__SideStatement__Group__4 )
            // InternalEduLangauage.g:690:2: rule__SideStatement__Group__3__Impl rule__SideStatement__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__SideStatement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SideStatement__Group__4();

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
    // $ANTLR end "rule__SideStatement__Group__3"


    // $ANTLR start "rule__SideStatement__Group__3__Impl"
    // InternalEduLangauage.g:697:1: rule__SideStatement__Group__3__Impl : ( ')' ) ;
    public final void rule__SideStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:701:1: ( ( ')' ) )
            // InternalEduLangauage.g:702:1: ( ')' )
            {
            // InternalEduLangauage.g:702:1: ( ')' )
            // InternalEduLangauage.g:703:2: ')'
            {
             before(grammarAccess.getSideStatementAccess().getRightParenthesisKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSideStatementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SideStatement__Group__3__Impl"


    // $ANTLR start "rule__SideStatement__Group__4"
    // InternalEduLangauage.g:712:1: rule__SideStatement__Group__4 : rule__SideStatement__Group__4__Impl ;
    public final void rule__SideStatement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:716:1: ( rule__SideStatement__Group__4__Impl )
            // InternalEduLangauage.g:717:2: rule__SideStatement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SideStatement__Group__4__Impl();

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
    // $ANTLR end "rule__SideStatement__Group__4"


    // $ANTLR start "rule__SideStatement__Group__4__Impl"
    // InternalEduLangauage.g:723:1: rule__SideStatement__Group__4__Impl : ( 'cm' ) ;
    public final void rule__SideStatement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:727:1: ( ( 'cm' ) )
            // InternalEduLangauage.g:728:1: ( 'cm' )
            {
            // InternalEduLangauage.g:728:1: ( 'cm' )
            // InternalEduLangauage.g:729:2: 'cm'
            {
             before(grammarAccess.getSideStatementAccess().getCmKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSideStatementAccess().getCmKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SideStatement__Group__4__Impl"


    // $ANTLR start "rule__REAL__Group__0"
    // InternalEduLangauage.g:739:1: rule__REAL__Group__0 : rule__REAL__Group__0__Impl rule__REAL__Group__1 ;
    public final void rule__REAL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:743:1: ( rule__REAL__Group__0__Impl rule__REAL__Group__1 )
            // InternalEduLangauage.g:744:2: rule__REAL__Group__0__Impl rule__REAL__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__REAL__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__1();

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
    // $ANTLR end "rule__REAL__Group__0"


    // $ANTLR start "rule__REAL__Group__0__Impl"
    // InternalEduLangauage.g:751:1: rule__REAL__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:755:1: ( ( RULE_INT ) )
            // InternalEduLangauage.g:756:1: ( RULE_INT )
            {
            // InternalEduLangauage.g:756:1: ( RULE_INT )
            // InternalEduLangauage.g:757:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__0__Impl"


    // $ANTLR start "rule__REAL__Group__1"
    // InternalEduLangauage.g:766:1: rule__REAL__Group__1 : rule__REAL__Group__1__Impl rule__REAL__Group__2 ;
    public final void rule__REAL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:770:1: ( rule__REAL__Group__1__Impl rule__REAL__Group__2 )
            // InternalEduLangauage.g:771:2: rule__REAL__Group__1__Impl rule__REAL__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__REAL__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__REAL__Group__2();

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
    // $ANTLR end "rule__REAL__Group__1"


    // $ANTLR start "rule__REAL__Group__1__Impl"
    // InternalEduLangauage.g:778:1: rule__REAL__Group__1__Impl : ( '.' ) ;
    public final void rule__REAL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:782:1: ( ( '.' ) )
            // InternalEduLangauage.g:783:1: ( '.' )
            {
            // InternalEduLangauage.g:783:1: ( '.' )
            // InternalEduLangauage.g:784:2: '.'
            {
             before(grammarAccess.getREALAccess().getFullStopKeyword_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__1__Impl"


    // $ANTLR start "rule__REAL__Group__2"
    // InternalEduLangauage.g:793:1: rule__REAL__Group__2 : rule__REAL__Group__2__Impl ;
    public final void rule__REAL__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:797:1: ( rule__REAL__Group__2__Impl )
            // InternalEduLangauage.g:798:2: rule__REAL__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__REAL__Group__2__Impl();

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
    // $ANTLR end "rule__REAL__Group__2"


    // $ANTLR start "rule__REAL__Group__2__Impl"
    // InternalEduLangauage.g:804:1: rule__REAL__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__REAL__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:808:1: ( ( RULE_INT ) )
            // InternalEduLangauage.g:809:1: ( RULE_INT )
            {
            // InternalEduLangauage.g:809:1: ( RULE_INT )
            // InternalEduLangauage.g:810:2: RULE_INT
            {
             before(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getREALAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__REAL__Group__2__Impl"


    // $ANTLR start "rule__TrigoStatement__Group__0"
    // InternalEduLangauage.g:820:1: rule__TrigoStatement__Group__0 : rule__TrigoStatement__Group__0__Impl rule__TrigoStatement__Group__1 ;
    public final void rule__TrigoStatement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:824:1: ( rule__TrigoStatement__Group__0__Impl rule__TrigoStatement__Group__1 )
            // InternalEduLangauage.g:825:2: rule__TrigoStatement__Group__0__Impl rule__TrigoStatement__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__TrigoStatement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrigoStatement__Group__1();

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
    // $ANTLR end "rule__TrigoStatement__Group__0"


    // $ANTLR start "rule__TrigoStatement__Group__0__Impl"
    // InternalEduLangauage.g:832:1: rule__TrigoStatement__Group__0__Impl : ( ( rule__TrigoStatement__CommandAssignment_0 ) ) ;
    public final void rule__TrigoStatement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:836:1: ( ( ( rule__TrigoStatement__CommandAssignment_0 ) ) )
            // InternalEduLangauage.g:837:1: ( ( rule__TrigoStatement__CommandAssignment_0 ) )
            {
            // InternalEduLangauage.g:837:1: ( ( rule__TrigoStatement__CommandAssignment_0 ) )
            // InternalEduLangauage.g:838:2: ( rule__TrigoStatement__CommandAssignment_0 )
            {
             before(grammarAccess.getTrigoStatementAccess().getCommandAssignment_0()); 
            // InternalEduLangauage.g:839:2: ( rule__TrigoStatement__CommandAssignment_0 )
            // InternalEduLangauage.g:839:3: rule__TrigoStatement__CommandAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TrigoStatement__CommandAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTrigoStatementAccess().getCommandAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrigoStatement__Group__0__Impl"


    // $ANTLR start "rule__TrigoStatement__Group__1"
    // InternalEduLangauage.g:847:1: rule__TrigoStatement__Group__1 : rule__TrigoStatement__Group__1__Impl rule__TrigoStatement__Group__2 ;
    public final void rule__TrigoStatement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:851:1: ( rule__TrigoStatement__Group__1__Impl rule__TrigoStatement__Group__2 )
            // InternalEduLangauage.g:852:2: rule__TrigoStatement__Group__1__Impl rule__TrigoStatement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__TrigoStatement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrigoStatement__Group__2();

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
    // $ANTLR end "rule__TrigoStatement__Group__1"


    // $ANTLR start "rule__TrigoStatement__Group__1__Impl"
    // InternalEduLangauage.g:859:1: rule__TrigoStatement__Group__1__Impl : ( '(' ) ;
    public final void rule__TrigoStatement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:863:1: ( ( '(' ) )
            // InternalEduLangauage.g:864:1: ( '(' )
            {
            // InternalEduLangauage.g:864:1: ( '(' )
            // InternalEduLangauage.g:865:2: '('
            {
             before(grammarAccess.getTrigoStatementAccess().getLeftParenthesisKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTrigoStatementAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrigoStatement__Group__1__Impl"


    // $ANTLR start "rule__TrigoStatement__Group__2"
    // InternalEduLangauage.g:874:1: rule__TrigoStatement__Group__2 : rule__TrigoStatement__Group__2__Impl rule__TrigoStatement__Group__3 ;
    public final void rule__TrigoStatement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:878:1: ( rule__TrigoStatement__Group__2__Impl rule__TrigoStatement__Group__3 )
            // InternalEduLangauage.g:879:2: rule__TrigoStatement__Group__2__Impl rule__TrigoStatement__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__TrigoStatement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TrigoStatement__Group__3();

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
    // $ANTLR end "rule__TrigoStatement__Group__2"


    // $ANTLR start "rule__TrigoStatement__Group__2__Impl"
    // InternalEduLangauage.g:886:1: rule__TrigoStatement__Group__2__Impl : ( ( rule__TrigoStatement__StepsAssignment_2 ) ) ;
    public final void rule__TrigoStatement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:890:1: ( ( ( rule__TrigoStatement__StepsAssignment_2 ) ) )
            // InternalEduLangauage.g:891:1: ( ( rule__TrigoStatement__StepsAssignment_2 ) )
            {
            // InternalEduLangauage.g:891:1: ( ( rule__TrigoStatement__StepsAssignment_2 ) )
            // InternalEduLangauage.g:892:2: ( rule__TrigoStatement__StepsAssignment_2 )
            {
             before(grammarAccess.getTrigoStatementAccess().getStepsAssignment_2()); 
            // InternalEduLangauage.g:893:2: ( rule__TrigoStatement__StepsAssignment_2 )
            // InternalEduLangauage.g:893:3: rule__TrigoStatement__StepsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TrigoStatement__StepsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrigoStatementAccess().getStepsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrigoStatement__Group__2__Impl"


    // $ANTLR start "rule__TrigoStatement__Group__3"
    // InternalEduLangauage.g:901:1: rule__TrigoStatement__Group__3 : rule__TrigoStatement__Group__3__Impl ;
    public final void rule__TrigoStatement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:905:1: ( rule__TrigoStatement__Group__3__Impl )
            // InternalEduLangauage.g:906:2: rule__TrigoStatement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TrigoStatement__Group__3__Impl();

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
    // $ANTLR end "rule__TrigoStatement__Group__3"


    // $ANTLR start "rule__TrigoStatement__Group__3__Impl"
    // InternalEduLangauage.g:912:1: rule__TrigoStatement__Group__3__Impl : ( ( ')' )* ) ;
    public final void rule__TrigoStatement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:916:1: ( ( ( ')' )* ) )
            // InternalEduLangauage.g:917:1: ( ( ')' )* )
            {
            // InternalEduLangauage.g:917:1: ( ( ')' )* )
            // InternalEduLangauage.g:918:2: ( ')' )*
            {
             before(grammarAccess.getTrigoStatementAccess().getRightParenthesisKeyword_3()); 
            // InternalEduLangauage.g:919:2: ( ')' )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==20) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEduLangauage.g:919:3: ')'
            	    {
            	    match(input,20,FOLLOW_12); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTrigoStatementAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrigoStatement__Group__3__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalEduLangauage.g:928:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:932:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalEduLangauage.g:933:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

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
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalEduLangauage.g:940:1: rule__Addition__Group__0__Impl : ( ruleMultiplDivision ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:944:1: ( ( ruleMultiplDivision ) )
            // InternalEduLangauage.g:945:1: ( ruleMultiplDivision )
            {
            // InternalEduLangauage.g:945:1: ( ruleMultiplDivision )
            // InternalEduLangauage.g:946:2: ruleMultiplDivision
            {
             before(grammarAccess.getAdditionAccess().getMultiplDivisionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplDivision();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplDivisionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalEduLangauage.g:955:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:959:1: ( rule__Addition__Group__1__Impl )
            // InternalEduLangauage.g:960:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

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
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalEduLangauage.g:966:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Group_1__0 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:970:1: ( ( ( rule__Addition__Group_1__0 )* ) )
            // InternalEduLangauage.g:971:1: ( ( rule__Addition__Group_1__0 )* )
            {
            // InternalEduLangauage.g:971:1: ( ( rule__Addition__Group_1__0 )* )
            // InternalEduLangauage.g:972:2: ( rule__Addition__Group_1__0 )*
            {
             before(grammarAccess.getAdditionAccess().getGroup_1()); 
            // InternalEduLangauage.g:973:2: ( rule__Addition__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==23) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEduLangauage.g:973:3: rule__Addition__Group_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__Addition__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__0"
    // InternalEduLangauage.g:982:1: rule__Addition__Group_1__0 : rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 ;
    public final void rule__Addition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:986:1: ( rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1 )
            // InternalEduLangauage.g:987:2: rule__Addition__Group_1__0__Impl rule__Addition__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Addition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__1();

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
    // $ANTLR end "rule__Addition__Group_1__0"


    // $ANTLR start "rule__Addition__Group_1__0__Impl"
    // InternalEduLangauage.g:994:1: rule__Addition__Group_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:998:1: ( ( () ) )
            // InternalEduLangauage.g:999:1: ( () )
            {
            // InternalEduLangauage.g:999:1: ( () )
            // InternalEduLangauage.g:1000:2: ()
            {
             before(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 
            // InternalEduLangauage.g:1001:2: ()
            // InternalEduLangauage.g:1001:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1__1"
    // InternalEduLangauage.g:1009:1: rule__Addition__Group_1__1 : rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 ;
    public final void rule__Addition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1013:1: ( rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2 )
            // InternalEduLangauage.g:1014:2: rule__Addition__Group_1__1__Impl rule__Addition__Group_1__2
            {
            pushFollow(FOLLOW_6);
            rule__Addition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2();

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
    // $ANTLR end "rule__Addition__Group_1__1"


    // $ANTLR start "rule__Addition__Group_1__1__Impl"
    // InternalEduLangauage.g:1021:1: rule__Addition__Group_1__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1025:1: ( ( '+' ) )
            // InternalEduLangauage.g:1026:1: ( '+' )
            {
            // InternalEduLangauage.g:1026:1: ( '+' )
            // InternalEduLangauage.g:1027:2: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1__2"
    // InternalEduLangauage.g:1036:1: rule__Addition__Group_1__2 : rule__Addition__Group_1__2__Impl ;
    public final void rule__Addition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1040:1: ( rule__Addition__Group_1__2__Impl )
            // InternalEduLangauage.g:1041:2: rule__Addition__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1__2__Impl();

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
    // $ANTLR end "rule__Addition__Group_1__2"


    // $ANTLR start "rule__Addition__Group_1__2__Impl"
    // InternalEduLangauage.g:1047:1: rule__Addition__Group_1__2__Impl : ( ( rule__Addition__RightAssignment_1_2 ) ) ;
    public final void rule__Addition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1051:1: ( ( ( rule__Addition__RightAssignment_1_2 ) ) )
            // InternalEduLangauage.g:1052:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            {
            // InternalEduLangauage.g:1052:1: ( ( rule__Addition__RightAssignment_1_2 ) )
            // InternalEduLangauage.g:1053:2: ( rule__Addition__RightAssignment_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 
            // InternalEduLangauage.g:1054:2: ( rule__Addition__RightAssignment_1_2 )
            // InternalEduLangauage.g:1054:3: rule__Addition__RightAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1__2__Impl"


    // $ANTLR start "rule__MultiplDivision__Group__0"
    // InternalEduLangauage.g:1063:1: rule__MultiplDivision__Group__0 : rule__MultiplDivision__Group__0__Impl rule__MultiplDivision__Group__1 ;
    public final void rule__MultiplDivision__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1067:1: ( rule__MultiplDivision__Group__0__Impl rule__MultiplDivision__Group__1 )
            // InternalEduLangauage.g:1068:2: rule__MultiplDivision__Group__0__Impl rule__MultiplDivision__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__MultiplDivision__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplDivision__Group__1();

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
    // $ANTLR end "rule__MultiplDivision__Group__0"


    // $ANTLR start "rule__MultiplDivision__Group__0__Impl"
    // InternalEduLangauage.g:1075:1: rule__MultiplDivision__Group__0__Impl : ( rulePrimaryExpression ) ;
    public final void rule__MultiplDivision__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1079:1: ( ( rulePrimaryExpression ) )
            // InternalEduLangauage.g:1080:1: ( rulePrimaryExpression )
            {
            // InternalEduLangauage.g:1080:1: ( rulePrimaryExpression )
            // InternalEduLangauage.g:1081:2: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplDivisionAccess().getPrimaryExpressionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplDivisionAccess().getPrimaryExpressionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplDivision__Group__0__Impl"


    // $ANTLR start "rule__MultiplDivision__Group__1"
    // InternalEduLangauage.g:1090:1: rule__MultiplDivision__Group__1 : rule__MultiplDivision__Group__1__Impl ;
    public final void rule__MultiplDivision__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1094:1: ( rule__MultiplDivision__Group__1__Impl )
            // InternalEduLangauage.g:1095:2: rule__MultiplDivision__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplDivision__Group__1__Impl();

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
    // $ANTLR end "rule__MultiplDivision__Group__1"


    // $ANTLR start "rule__MultiplDivision__Group__1__Impl"
    // InternalEduLangauage.g:1101:1: rule__MultiplDivision__Group__1__Impl : ( ( rule__MultiplDivision__Alternatives_1 )* ) ;
    public final void rule__MultiplDivision__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1105:1: ( ( ( rule__MultiplDivision__Alternatives_1 )* ) )
            // InternalEduLangauage.g:1106:1: ( ( rule__MultiplDivision__Alternatives_1 )* )
            {
            // InternalEduLangauage.g:1106:1: ( ( rule__MultiplDivision__Alternatives_1 )* )
            // InternalEduLangauage.g:1107:2: ( rule__MultiplDivision__Alternatives_1 )*
            {
             before(grammarAccess.getMultiplDivisionAccess().getAlternatives_1()); 
            // InternalEduLangauage.g:1108:2: ( rule__MultiplDivision__Alternatives_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=24 && LA9_0<=25)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalEduLangauage.g:1108:3: rule__MultiplDivision__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__MultiplDivision__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getMultiplDivisionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplDivision__Group__1__Impl"


    // $ANTLR start "rule__MultiplDivision__Group_1_0__0"
    // InternalEduLangauage.g:1117:1: rule__MultiplDivision__Group_1_0__0 : rule__MultiplDivision__Group_1_0__0__Impl rule__MultiplDivision__Group_1_0__1 ;
    public final void rule__MultiplDivision__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1121:1: ( rule__MultiplDivision__Group_1_0__0__Impl rule__MultiplDivision__Group_1_0__1 )
            // InternalEduLangauage.g:1122:2: rule__MultiplDivision__Group_1_0__0__Impl rule__MultiplDivision__Group_1_0__1
            {
            pushFollow(FOLLOW_17);
            rule__MultiplDivision__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplDivision__Group_1_0__1();

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
    // $ANTLR end "rule__MultiplDivision__Group_1_0__0"


    // $ANTLR start "rule__MultiplDivision__Group_1_0__0__Impl"
    // InternalEduLangauage.g:1129:1: rule__MultiplDivision__Group_1_0__0__Impl : ( () ) ;
    public final void rule__MultiplDivision__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1133:1: ( ( () ) )
            // InternalEduLangauage.g:1134:1: ( () )
            {
            // InternalEduLangauage.g:1134:1: ( () )
            // InternalEduLangauage.g:1135:2: ()
            {
             before(grammarAccess.getMultiplDivisionAccess().getMultiplicationLeftAction_1_0_0()); 
            // InternalEduLangauage.g:1136:2: ()
            // InternalEduLangauage.g:1136:3: 
            {
            }

             after(grammarAccess.getMultiplDivisionAccess().getMultiplicationLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplDivision__Group_1_0__0__Impl"


    // $ANTLR start "rule__MultiplDivision__Group_1_0__1"
    // InternalEduLangauage.g:1144:1: rule__MultiplDivision__Group_1_0__1 : rule__MultiplDivision__Group_1_0__1__Impl rule__MultiplDivision__Group_1_0__2 ;
    public final void rule__MultiplDivision__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1148:1: ( rule__MultiplDivision__Group_1_0__1__Impl rule__MultiplDivision__Group_1_0__2 )
            // InternalEduLangauage.g:1149:2: rule__MultiplDivision__Group_1_0__1__Impl rule__MultiplDivision__Group_1_0__2
            {
            pushFollow(FOLLOW_6);
            rule__MultiplDivision__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplDivision__Group_1_0__2();

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
    // $ANTLR end "rule__MultiplDivision__Group_1_0__1"


    // $ANTLR start "rule__MultiplDivision__Group_1_0__1__Impl"
    // InternalEduLangauage.g:1156:1: rule__MultiplDivision__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__MultiplDivision__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1160:1: ( ( '*' ) )
            // InternalEduLangauage.g:1161:1: ( '*' )
            {
            // InternalEduLangauage.g:1161:1: ( '*' )
            // InternalEduLangauage.g:1162:2: '*'
            {
             before(grammarAccess.getMultiplDivisionAccess().getAsteriskKeyword_1_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMultiplDivisionAccess().getAsteriskKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplDivision__Group_1_0__1__Impl"


    // $ANTLR start "rule__MultiplDivision__Group_1_0__2"
    // InternalEduLangauage.g:1171:1: rule__MultiplDivision__Group_1_0__2 : rule__MultiplDivision__Group_1_0__2__Impl ;
    public final void rule__MultiplDivision__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1175:1: ( rule__MultiplDivision__Group_1_0__2__Impl )
            // InternalEduLangauage.g:1176:2: rule__MultiplDivision__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplDivision__Group_1_0__2__Impl();

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
    // $ANTLR end "rule__MultiplDivision__Group_1_0__2"


    // $ANTLR start "rule__MultiplDivision__Group_1_0__2__Impl"
    // InternalEduLangauage.g:1182:1: rule__MultiplDivision__Group_1_0__2__Impl : ( ( rule__MultiplDivision__RightAssignment_1_0_2 ) ) ;
    public final void rule__MultiplDivision__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1186:1: ( ( ( rule__MultiplDivision__RightAssignment_1_0_2 ) ) )
            // InternalEduLangauage.g:1187:1: ( ( rule__MultiplDivision__RightAssignment_1_0_2 ) )
            {
            // InternalEduLangauage.g:1187:1: ( ( rule__MultiplDivision__RightAssignment_1_0_2 ) )
            // InternalEduLangauage.g:1188:2: ( rule__MultiplDivision__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getMultiplDivisionAccess().getRightAssignment_1_0_2()); 
            // InternalEduLangauage.g:1189:2: ( rule__MultiplDivision__RightAssignment_1_0_2 )
            // InternalEduLangauage.g:1189:3: rule__MultiplDivision__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplDivision__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplDivisionAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplDivision__Group_1_0__2__Impl"


    // $ANTLR start "rule__MultiplDivision__Group_1_1__0"
    // InternalEduLangauage.g:1198:1: rule__MultiplDivision__Group_1_1__0 : rule__MultiplDivision__Group_1_1__0__Impl rule__MultiplDivision__Group_1_1__1 ;
    public final void rule__MultiplDivision__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1202:1: ( rule__MultiplDivision__Group_1_1__0__Impl rule__MultiplDivision__Group_1_1__1 )
            // InternalEduLangauage.g:1203:2: rule__MultiplDivision__Group_1_1__0__Impl rule__MultiplDivision__Group_1_1__1
            {
            pushFollow(FOLLOW_15);
            rule__MultiplDivision__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplDivision__Group_1_1__1();

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
    // $ANTLR end "rule__MultiplDivision__Group_1_1__0"


    // $ANTLR start "rule__MultiplDivision__Group_1_1__0__Impl"
    // InternalEduLangauage.g:1210:1: rule__MultiplDivision__Group_1_1__0__Impl : ( () ) ;
    public final void rule__MultiplDivision__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1214:1: ( ( () ) )
            // InternalEduLangauage.g:1215:1: ( () )
            {
            // InternalEduLangauage.g:1215:1: ( () )
            // InternalEduLangauage.g:1216:2: ()
            {
             before(grammarAccess.getMultiplDivisionAccess().getDivisionLeftAction_1_1_0()); 
            // InternalEduLangauage.g:1217:2: ()
            // InternalEduLangauage.g:1217:3: 
            {
            }

             after(grammarAccess.getMultiplDivisionAccess().getDivisionLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplDivision__Group_1_1__0__Impl"


    // $ANTLR start "rule__MultiplDivision__Group_1_1__1"
    // InternalEduLangauage.g:1225:1: rule__MultiplDivision__Group_1_1__1 : rule__MultiplDivision__Group_1_1__1__Impl rule__MultiplDivision__Group_1_1__2 ;
    public final void rule__MultiplDivision__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1229:1: ( rule__MultiplDivision__Group_1_1__1__Impl rule__MultiplDivision__Group_1_1__2 )
            // InternalEduLangauage.g:1230:2: rule__MultiplDivision__Group_1_1__1__Impl rule__MultiplDivision__Group_1_1__2
            {
            pushFollow(FOLLOW_6);
            rule__MultiplDivision__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultiplDivision__Group_1_1__2();

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
    // $ANTLR end "rule__MultiplDivision__Group_1_1__1"


    // $ANTLR start "rule__MultiplDivision__Group_1_1__1__Impl"
    // InternalEduLangauage.g:1237:1: rule__MultiplDivision__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__MultiplDivision__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1241:1: ( ( '/' ) )
            // InternalEduLangauage.g:1242:1: ( '/' )
            {
            // InternalEduLangauage.g:1242:1: ( '/' )
            // InternalEduLangauage.g:1243:2: '/'
            {
             before(grammarAccess.getMultiplDivisionAccess().getSolidusKeyword_1_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMultiplDivisionAccess().getSolidusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplDivision__Group_1_1__1__Impl"


    // $ANTLR start "rule__MultiplDivision__Group_1_1__2"
    // InternalEduLangauage.g:1252:1: rule__MultiplDivision__Group_1_1__2 : rule__MultiplDivision__Group_1_1__2__Impl ;
    public final void rule__MultiplDivision__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1256:1: ( rule__MultiplDivision__Group_1_1__2__Impl )
            // InternalEduLangauage.g:1257:2: rule__MultiplDivision__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultiplDivision__Group_1_1__2__Impl();

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
    // $ANTLR end "rule__MultiplDivision__Group_1_1__2"


    // $ANTLR start "rule__MultiplDivision__Group_1_1__2__Impl"
    // InternalEduLangauage.g:1263:1: rule__MultiplDivision__Group_1_1__2__Impl : ( ( rule__MultiplDivision__RightAssignment_1_1_2 ) ) ;
    public final void rule__MultiplDivision__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1267:1: ( ( ( rule__MultiplDivision__RightAssignment_1_1_2 ) ) )
            // InternalEduLangauage.g:1268:1: ( ( rule__MultiplDivision__RightAssignment_1_1_2 ) )
            {
            // InternalEduLangauage.g:1268:1: ( ( rule__MultiplDivision__RightAssignment_1_1_2 ) )
            // InternalEduLangauage.g:1269:2: ( rule__MultiplDivision__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getMultiplDivisionAccess().getRightAssignment_1_1_2()); 
            // InternalEduLangauage.g:1270:2: ( rule__MultiplDivision__RightAssignment_1_1_2 )
            // InternalEduLangauage.g:1270:3: rule__MultiplDivision__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MultiplDivision__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplDivisionAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplDivision__Group_1_1__2__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0"
    // InternalEduLangauage.g:1279:1: rule__PrimaryExpression__Group_2__0 : rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 ;
    public final void rule__PrimaryExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1283:1: ( rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1 )
            // InternalEduLangauage.g:1284:2: rule__PrimaryExpression__Group_2__0__Impl rule__PrimaryExpression__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__PrimaryExpression__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__1();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__0"


    // $ANTLR start "rule__PrimaryExpression__Group_2__0__Impl"
    // InternalEduLangauage.g:1291:1: rule__PrimaryExpression__Group_2__0__Impl : ( '(' ) ;
    public final void rule__PrimaryExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1295:1: ( ( '(' ) )
            // InternalEduLangauage.g:1296:1: ( '(' )
            {
            // InternalEduLangauage.g:1296:1: ( '(' )
            // InternalEduLangauage.g:1297:2: '('
            {
             before(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__0__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1"
    // InternalEduLangauage.g:1306:1: rule__PrimaryExpression__Group_2__1 : rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 ;
    public final void rule__PrimaryExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1310:1: ( rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2 )
            // InternalEduLangauage.g:1311:2: rule__PrimaryExpression__Group_2__1__Impl rule__PrimaryExpression__Group_2__2
            {
            pushFollow(FOLLOW_9);
            rule__PrimaryExpression__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__1"


    // $ANTLR start "rule__PrimaryExpression__Group_2__1__Impl"
    // InternalEduLangauage.g:1318:1: rule__PrimaryExpression__Group_2__1__Impl : ( ruleAddition ) ;
    public final void rule__PrimaryExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1322:1: ( ( ruleAddition ) )
            // InternalEduLangauage.g:1323:1: ( ruleAddition )
            {
            // InternalEduLangauage.g:1323:1: ( ruleAddition )
            // InternalEduLangauage.g:1324:2: ruleAddition
            {
             before(grammarAccess.getPrimaryExpressionAccess().getAdditionParserRuleCall_2_1()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getPrimaryExpressionAccess().getAdditionParserRuleCall_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__1__Impl"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2"
    // InternalEduLangauage.g:1333:1: rule__PrimaryExpression__Group_2__2 : rule__PrimaryExpression__Group_2__2__Impl ;
    public final void rule__PrimaryExpression__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1337:1: ( rule__PrimaryExpression__Group_2__2__Impl )
            // InternalEduLangauage.g:1338:2: rule__PrimaryExpression__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimaryExpression__Group_2__2__Impl();

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
    // $ANTLR end "rule__PrimaryExpression__Group_2__2"


    // $ANTLR start "rule__PrimaryExpression__Group_2__2__Impl"
    // InternalEduLangauage.g:1344:1: rule__PrimaryExpression__Group_2__2__Impl : ( ')' ) ;
    public final void rule__PrimaryExpression__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1348:1: ( ( ')' ) )
            // InternalEduLangauage.g:1349:1: ( ')' )
            {
            // InternalEduLangauage.g:1349:1: ( ')' )
            // InternalEduLangauage.g:1350:2: ')'
            {
             before(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimaryExpression__Group_2__2__Impl"


    // $ANTLR start "rule__TrigoProgram__StatementsAssignment"
    // InternalEduLangauage.g:1360:1: rule__TrigoProgram__StatementsAssignment : ( ruleStatement ) ;
    public final void rule__TrigoProgram__StatementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1364:1: ( ( ruleStatement ) )
            // InternalEduLangauage.g:1365:2: ( ruleStatement )
            {
            // InternalEduLangauage.g:1365:2: ( ruleStatement )
            // InternalEduLangauage.g:1366:3: ruleStatement
            {
             before(grammarAccess.getTrigoProgramAccess().getStatementsStatementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getTrigoProgramAccess().getStatementsStatementParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrigoProgram__StatementsAssignment"


    // $ANTLR start "rule__VariableDeclaration__NameAssignment_1"
    // InternalEduLangauage.g:1375:1: rule__VariableDeclaration__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VariableDeclaration__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1379:1: ( ( RULE_ID ) )
            // InternalEduLangauage.g:1380:2: ( RULE_ID )
            {
            // InternalEduLangauage.g:1380:2: ( RULE_ID )
            // InternalEduLangauage.g:1381:3: RULE_ID
            {
             before(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__NameAssignment_1"


    // $ANTLR start "rule__VariableDeclaration__ValueAssignment_3"
    // InternalEduLangauage.g:1390:1: rule__VariableDeclaration__ValueAssignment_3 : ( rulePrimaryExpression ) ;
    public final void rule__VariableDeclaration__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1394:1: ( ( rulePrimaryExpression ) )
            // InternalEduLangauage.g:1395:2: ( rulePrimaryExpression )
            {
            // InternalEduLangauage.g:1395:2: ( rulePrimaryExpression )
            // InternalEduLangauage.g:1396:3: rulePrimaryExpression
            {
             before(grammarAccess.getVariableDeclarationAccess().getValuePrimaryExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getVariableDeclarationAccess().getValuePrimaryExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableDeclaration__ValueAssignment_3"


    // $ANTLR start "rule__SideStatement__CommandAssignment_0"
    // InternalEduLangauage.g:1405:1: rule__SideStatement__CommandAssignment_0 : ( ruleSideCommand ) ;
    public final void rule__SideStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1409:1: ( ( ruleSideCommand ) )
            // InternalEduLangauage.g:1410:2: ( ruleSideCommand )
            {
            // InternalEduLangauage.g:1410:2: ( ruleSideCommand )
            // InternalEduLangauage.g:1411:3: ruleSideCommand
            {
             before(grammarAccess.getSideStatementAccess().getCommandSideCommandEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSideCommand();

            state._fsp--;

             after(grammarAccess.getSideStatementAccess().getCommandSideCommandEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SideStatement__CommandAssignment_0"


    // $ANTLR start "rule__SideStatement__StepsAssignment_2"
    // InternalEduLangauage.g:1420:1: rule__SideStatement__StepsAssignment_2 : ( ruleREAL ) ;
    public final void rule__SideStatement__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1424:1: ( ( ruleREAL ) )
            // InternalEduLangauage.g:1425:2: ( ruleREAL )
            {
            // InternalEduLangauage.g:1425:2: ( ruleREAL )
            // InternalEduLangauage.g:1426:3: ruleREAL
            {
             before(grammarAccess.getSideStatementAccess().getStepsREALParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleREAL();

            state._fsp--;

             after(grammarAccess.getSideStatementAccess().getStepsREALParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SideStatement__StepsAssignment_2"


    // $ANTLR start "rule__TrigoStatement__CommandAssignment_0"
    // InternalEduLangauage.g:1435:1: rule__TrigoStatement__CommandAssignment_0 : ( ruleAngleCommand ) ;
    public final void rule__TrigoStatement__CommandAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1439:1: ( ( ruleAngleCommand ) )
            // InternalEduLangauage.g:1440:2: ( ruleAngleCommand )
            {
            // InternalEduLangauage.g:1440:2: ( ruleAngleCommand )
            // InternalEduLangauage.g:1441:3: ruleAngleCommand
            {
             before(grammarAccess.getTrigoStatementAccess().getCommandAngleCommandEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAngleCommand();

            state._fsp--;

             after(grammarAccess.getTrigoStatementAccess().getCommandAngleCommandEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrigoStatement__CommandAssignment_0"


    // $ANTLR start "rule__TrigoStatement__StepsAssignment_2"
    // InternalEduLangauage.g:1450:1: rule__TrigoStatement__StepsAssignment_2 : ( rulePrimaryExpression ) ;
    public final void rule__TrigoStatement__StepsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1454:1: ( ( rulePrimaryExpression ) )
            // InternalEduLangauage.g:1455:2: ( rulePrimaryExpression )
            {
            // InternalEduLangauage.g:1455:2: ( rulePrimaryExpression )
            // InternalEduLangauage.g:1456:3: rulePrimaryExpression
            {
             before(grammarAccess.getTrigoStatementAccess().getStepsPrimaryExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getTrigoStatementAccess().getStepsPrimaryExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TrigoStatement__StepsAssignment_2"


    // $ANTLR start "rule__Addition__RightAssignment_1_2"
    // InternalEduLangauage.g:1465:1: rule__Addition__RightAssignment_1_2 : ( ruleMultiplDivision ) ;
    public final void rule__Addition__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1469:1: ( ( ruleMultiplDivision ) )
            // InternalEduLangauage.g:1470:2: ( ruleMultiplDivision )
            {
            // InternalEduLangauage.g:1470:2: ( ruleMultiplDivision )
            // InternalEduLangauage.g:1471:3: ruleMultiplDivision
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplDivisionParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplDivision();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplDivisionParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_2"


    // $ANTLR start "rule__MultiplDivision__RightAssignment_1_0_2"
    // InternalEduLangauage.g:1480:1: rule__MultiplDivision__RightAssignment_1_0_2 : ( rulePrimaryExpression ) ;
    public final void rule__MultiplDivision__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1484:1: ( ( rulePrimaryExpression ) )
            // InternalEduLangauage.g:1485:2: ( rulePrimaryExpression )
            {
            // InternalEduLangauage.g:1485:2: ( rulePrimaryExpression )
            // InternalEduLangauage.g:1486:3: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplDivision__RightAssignment_1_0_2"


    // $ANTLR start "rule__MultiplDivision__RightAssignment_1_1_2"
    // InternalEduLangauage.g:1495:1: rule__MultiplDivision__RightAssignment_1_1_2 : ( rulePrimaryExpression ) ;
    public final void rule__MultiplDivision__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1499:1: ( ( rulePrimaryExpression ) )
            // InternalEduLangauage.g:1500:2: ( rulePrimaryExpression )
            {
            // InternalEduLangauage.g:1500:2: ( rulePrimaryExpression )
            // InternalEduLangauage.g:1501:3: rulePrimaryExpression
            {
             before(grammarAccess.getMultiplDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimaryExpression();

            state._fsp--;

             after(grammarAccess.getMultiplDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MultiplDivision__RightAssignment_1_1_2"


    // $ANTLR start "rule__IntLiteral__ValAssignment"
    // InternalEduLangauage.g:1510:1: rule__IntLiteral__ValAssignment : ( RULE_INT ) ;
    public final void rule__IntLiteral__ValAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1514:1: ( ( RULE_INT ) )
            // InternalEduLangauage.g:1515:2: ( RULE_INT )
            {
            // InternalEduLangauage.g:1515:2: ( RULE_INT )
            // InternalEduLangauage.g:1516:3: RULE_INT
            {
             before(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntLiteral__ValAssignment"


    // $ANTLR start "rule__VariableReference__VarAssignment"
    // InternalEduLangauage.g:1525:1: rule__VariableReference__VarAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableReference__VarAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEduLangauage.g:1529:1: ( ( ( RULE_ID ) ) )
            // InternalEduLangauage.g:1530:2: ( ( RULE_ID ) )
            {
            // InternalEduLangauage.g:1530:2: ( ( RULE_ID ) )
            // InternalEduLangauage.g:1531:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableReferenceAccess().getVarVariableDeclarationCrossReference_0()); 
            // InternalEduLangauage.g:1532:3: ( RULE_ID )
            // InternalEduLangauage.g:1533:4: RULE_ID
            {
             before(grammarAccess.getVariableReferenceAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableReferenceAccess().getVarVariableDeclarationIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVariableReferenceAccess().getVarVariableDeclarationCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableReference__VarAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000003F802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});

}