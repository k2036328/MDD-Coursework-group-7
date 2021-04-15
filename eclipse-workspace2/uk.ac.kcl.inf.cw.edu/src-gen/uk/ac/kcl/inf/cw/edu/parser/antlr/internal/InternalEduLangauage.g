/*
 * generated by Xtext 2.24.0
 */
grammar InternalEduLangauage;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package uk.ac.kcl.inf.cw.edu.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleTrigoProgram
entryRuleTrigoProgram returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrigoProgramRule()); }
	iv_ruleTrigoProgram=ruleTrigoProgram
	{ $current=$iv_ruleTrigoProgram.current; }
	EOF;

// Rule TrigoProgram
ruleTrigoProgram returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getTrigoProgramAccess().getStatementsStatementParserRuleCall_0());
			}
			lv_statements_0_0=ruleStatement
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getTrigoProgramRule());
				}
				add(
					$current,
					"statements",
					lv_statements_0_0,
					"uk.ac.kcl.inf.cw.edu.EduLangauage.Statement");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleStatement
entryRuleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStatementRule()); }
	iv_ruleStatement=ruleStatement
	{ $current=$iv_ruleStatement.current; }
	EOF;

// Rule Statement
ruleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStatementAccess().getSideStatementParserRuleCall_0());
		}
		this_SideStatement_0=ruleSideStatement
		{
			$current = $this_SideStatement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getTrigoStatementParserRuleCall_1());
		}
		this_TrigoStatement_1=ruleTrigoStatement
		{
			$current = $this_TrigoStatement_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStatementAccess().getVariableDeclarationParserRuleCall_2());
		}
		this_VariableDeclaration_2=ruleVariableDeclaration
		{
			$current = $this_VariableDeclaration_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleVariableDeclaration
entryRuleVariableDeclaration returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableDeclarationRule()); }
	iv_ruleVariableDeclaration=ruleVariableDeclaration
	{ $current=$iv_ruleVariableDeclaration.current; }
	EOF;

// Rule VariableDeclaration
ruleVariableDeclaration returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='var'
		{
			newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getVariableDeclarationRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='='
		{
			newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getVariableDeclarationAccess().getValuePrimaryExpressionParserRuleCall_3_0());
				}
				lv_value_3_0=rulePrimaryExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
					}
					set(
						$current,
						"value",
						lv_value_3_0,
						"uk.ac.kcl.inf.cw.edu.EduLangauage.PrimaryExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSideStatement
entryRuleSideStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSideStatementRule()); }
	iv_ruleSideStatement=ruleSideStatement
	{ $current=$iv_ruleSideStatement.current; }
	EOF;

// Rule SideStatement
ruleSideStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSideStatementAccess().getCommandSideCommandEnumRuleCall_0_0());
				}
				lv_command_0_0=ruleSideCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSideStatementRule());
					}
					set(
						$current,
						"command",
						lv_command_0_0,
						"uk.ac.kcl.inf.cw.edu.EduLangauage.SideCommand");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getSideStatementAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSideStatementAccess().getStepsREALParserRuleCall_2_0());
				}
				lv_steps_2_0=ruleREAL
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSideStatementRule());
					}
					set(
						$current,
						"steps",
						lv_steps_2_0,
						"uk.ac.kcl.inf.cw.edu.EduLangauage.REAL");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getSideStatementAccess().getRightParenthesisKeyword_3());
		}
		otherlv_4='cm'
		{
			newLeafNode(otherlv_4, grammarAccess.getSideStatementAccess().getCmKeyword_4());
		}
	)
;

// Entry rule entryRuleREAL
entryRuleREAL returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getREALRule()); }
	iv_ruleREAL=ruleREAL
	{ $current=$iv_ruleREAL.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule REAL
ruleREAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		this_INT_0=RULE_INT
		{
			$current.merge(this_INT_0);
		}
		{
			newLeafNode(this_INT_0, grammarAccess.getREALAccess().getINTTerminalRuleCall_0());
		}
		kw='.'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getREALAccess().getFullStopKeyword_1());
		}
		this_INT_2=RULE_INT
		{
			$current.merge(this_INT_2);
		}
		{
			newLeafNode(this_INT_2, grammarAccess.getREALAccess().getINTTerminalRuleCall_2());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleTrigoStatement
entryRuleTrigoStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTrigoStatementRule()); }
	iv_ruleTrigoStatement=ruleTrigoStatement
	{ $current=$iv_ruleTrigoStatement.current; }
	EOF;

// Rule TrigoStatement
ruleTrigoStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTrigoStatementAccess().getCommandAngleCommandEnumRuleCall_0_0());
				}
				lv_command_0_0=ruleAngleCommand
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrigoStatementRule());
					}
					set(
						$current,
						"command",
						lv_command_0_0,
						"uk.ac.kcl.inf.cw.edu.EduLangauage.AngleCommand");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getTrigoStatementAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTrigoStatementAccess().getStepsPrimaryExpressionParserRuleCall_2_0());
				}
				lv_steps_2_0=rulePrimaryExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTrigoStatementRule());
					}
					set(
						$current,
						"steps",
						lv_steps_2_0,
						"uk.ac.kcl.inf.cw.edu.EduLangauage.PrimaryExpression");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_3=')'
			{
				newLeafNode(otherlv_3, grammarAccess.getTrigoStatementAccess().getRightParenthesisKeyword_3());
			}
		)*
	)
;

// Entry rule entryRuleAddition
entryRuleAddition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAdditionRule()); }
	iv_ruleAddition=ruleAddition
	{ $current=$iv_ruleAddition.current; }
	EOF;

// Rule Addition
ruleAddition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getAdditionAccess().getMultiplDivisionParserRuleCall_0());
		}
		this_MultiplDivision_0=ruleMultiplDivision
		{
			$current = $this_MultiplDivision_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAdditionAccess().getAdditionLeftAction_1_0(),
						$current);
				}
			)
			otherlv_2='+'
			{
				newLeafNode(otherlv_2, grammarAccess.getAdditionAccess().getPlusSignKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getAdditionAccess().getRightMultiplDivisionParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleMultiplDivision
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAdditionRule());
						}
						add(
							$current,
							"right",
							lv_right_3_0,
							"uk.ac.kcl.inf.cw.edu.EduLangauage.MultiplDivision");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleMultiplDivision
entryRuleMultiplDivision returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiplDivisionRule()); }
	iv_ruleMultiplDivision=ruleMultiplDivision
	{ $current=$iv_ruleMultiplDivision.current; }
	EOF;

// Rule MultiplDivision
ruleMultiplDivision returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMultiplDivisionAccess().getPrimaryExpressionParserRuleCall_0());
		}
		this_PrimaryExpression_0=rulePrimaryExpression
		{
			$current = $this_PrimaryExpression_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getMultiplDivisionAccess().getMultiplicationLeftAction_1_0_0(),
							$current);
					}
				)
				otherlv_2='*'
				{
					newLeafNode(otherlv_2, grammarAccess.getMultiplDivisionAccess().getAsteriskKeyword_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMultiplDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_0_2_0());
						}
						lv_right_3_0=rulePrimaryExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMultiplDivisionRule());
							}
							add(
								$current,
								"right",
								lv_right_3_0,
								"uk.ac.kcl.inf.cw.edu.EduLangauage.PrimaryExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
			    |
			(
				(
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getMultiplDivisionAccess().getDivisionLeftAction_1_1_0(),
							$current);
					}
				)
				otherlv_5='/'
				{
					newLeafNode(otherlv_5, grammarAccess.getMultiplDivisionAccess().getSolidusKeyword_1_1_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getMultiplDivisionAccess().getRightPrimaryExpressionParserRuleCall_1_1_2_0());
						}
						lv_right_6_0=rulePrimaryExpression
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getMultiplDivisionRule());
							}
							add(
								$current,
								"right",
								lv_right_6_0,
								"uk.ac.kcl.inf.cw.edu.EduLangauage.PrimaryExpression");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRulePrimaryExpression
entryRulePrimaryExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPrimaryExpressionRule()); }
	iv_rulePrimaryExpression=rulePrimaryExpression
	{ $current=$iv_rulePrimaryExpression.current; }
	EOF;

// Rule PrimaryExpression
rulePrimaryExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getIntLiteralParserRuleCall_0());
		}
		this_IntLiteral_0=ruleIntLiteral
		{
			$current = $this_IntLiteral_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getVariableReferenceParserRuleCall_1());
		}
		this_VariableReference_1=ruleVariableReference
		{
			$current = $this_VariableReference_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		(
			otherlv_2='('
			{
				newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0());
			}
			{
				newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAdditionParserRuleCall_2_1());
			}
			this_Addition_3=ruleAddition
			{
				$current = $this_Addition_3.current;
				afterParserOrEnumRuleCall();
			}
			otherlv_4=')'
			{
				newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_2());
			}
		)
	)
;

// Entry rule entryRuleIntLiteral
entryRuleIntLiteral returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntLiteralRule()); }
	iv_ruleIntLiteral=ruleIntLiteral
	{ $current=$iv_ruleIntLiteral.current; }
	EOF;

// Rule IntLiteral
ruleIntLiteral returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			lv_val_0_0=RULE_INT
			{
				newLeafNode(lv_val_0_0, grammarAccess.getIntLiteralAccess().getValINTTerminalRuleCall_0());
			}
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getIntLiteralRule());
				}
				setWithLastConsumed(
					$current,
					"val",
					lv_val_0_0,
					"org.eclipse.xtext.common.Terminals.INT");
			}
		)
	)
;

// Entry rule entryRuleVariableReference
entryRuleVariableReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getVariableReferenceRule()); }
	iv_ruleVariableReference=ruleVariableReference
	{ $current=$iv_ruleVariableReference.current; }
	EOF;

// Rule VariableReference
ruleVariableReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getVariableReferenceRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getVariableReferenceAccess().getVarVariableDeclarationCrossReference_0());
			}
		)
	)
;

// Rule SideCommand
ruleSideCommand returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='adjacent'
			{
				$current = grammarAccess.getSideCommandAccess().getAdjacentEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getSideCommandAccess().getAdjacentEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='opposite'
			{
				$current = grammarAccess.getSideCommandAccess().getOppositeEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getSideCommandAccess().getOppositeEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='hypotenuse'
			{
				$current = grammarAccess.getSideCommandAccess().getHypotenuseEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getSideCommandAccess().getHypotenuseEnumLiteralDeclaration_2());
			}
		)
	)
;

// Rule AngleCommand
ruleAngleCommand returns [Enumerator current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			enumLiteral_0='sin'
			{
				$current = grammarAccess.getAngleCommandAccess().getSinEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_0, grammarAccess.getAngleCommandAccess().getSinEnumLiteralDeclaration_0());
			}
		)
		    |
		(
			enumLiteral_1='cos'
			{
				$current = grammarAccess.getAngleCommandAccess().getCosEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_1, grammarAccess.getAngleCommandAccess().getCosEnumLiteralDeclaration_1());
			}
		)
		    |
		(
			enumLiteral_2='tan'
			{
				$current = grammarAccess.getAngleCommandAccess().getTanEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
				newLeafNode(enumLiteral_2, grammarAccess.getAngleCommandAccess().getTanEnumLiteralDeclaration_2());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
