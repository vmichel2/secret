package pExpr.pNonTerminal.pEnsemble;
import pExpr.Expression;
import pExpr.pNonTerminal.NonTerminal;


public abstract class Ensemble extends NonTerminal {
    Expression[] ensemble;
    public Ensemble(Expression... expr){
        ensemble=expr;
    }
}

// Ensemble	::=	{ ExprArith (, ExprArith)* }