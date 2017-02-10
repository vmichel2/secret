package pExpr.pNonTerminal.pSousExpr.pExprLogique;

import pExpr.Expression;
import pExpr.pNonTerminal.NonTerminal;

public class ExpressionLogique extends NonTerminal {
    protected Expression expr;
    public ExpressionLogique(Expression expr){
        this.expr=expr;
    }

    public void afficher(String prefixe) { }
}
/*
ExprLogique	::=	Expr ? Expr
|	Expr ? Expr
|	not(Expr)
|	(? Litt�ral . ExprEnsembliste ? Expr )
|	(? Litt�ral . ExprEnsembliste ? Expr )
|	true
|	false
 */
//ToDo builder