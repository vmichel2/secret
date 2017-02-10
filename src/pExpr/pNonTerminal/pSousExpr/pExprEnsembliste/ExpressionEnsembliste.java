package pExpr.pNonTerminal.pSousExpr.pExprEnsembliste;

import pExpr.Expression;
import pExpr.pNonTerminal.NonTerminal;

public class ExpressionEnsembliste extends NonTerminal {
    protected Expression expr;
    protected Expression expr2;
    public ExpressionEnsembliste(Expression expr, Expression expr2){
        this.expr=expr;
        this.expr2=expr;
    }
}
/*
ExprEnsembliste	::=	Element ? Ensemble
|	Ensemble ? Ensemble
|	Ensemble ? Ensemble
 */
