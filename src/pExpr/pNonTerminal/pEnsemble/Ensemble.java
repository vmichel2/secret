package pExpr.pNonTerminal.pEnsemble;
import pExpr.Expression;
import pExpr.pNonTerminal.NonTerminal;
import pExpr.pTerminal.Litteral;


public abstract class Ensemble extends NonTerminal {
    Expression[] ensemble;
    public Ensemble(Expression... expr){
        ensemble=expr;
    }
}

// Ensemble	::=	{ ExprArith (, ExprArith)* }