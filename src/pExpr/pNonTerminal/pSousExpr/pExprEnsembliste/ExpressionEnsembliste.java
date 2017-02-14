package pExpr.pNonTerminal.pSousExpr.pExprEnsembliste;

import pExpr.Expression;
import pExpr.pNonTerminal.NonTerminal;

public abstract class ExpressionEnsembliste extends NonTerminal {
    protected Expression expr;
    protected Expression expr2;
    public ExpressionEnsembliste(Expression expr, Expression expr2){
        this.expr=expr;
        this.expr2=expr;
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Expression ensembliste");
        expr.afficher(prefixe+"\t");
        expr2.afficher(prefixe+"\t");
    }

    public Expression getExpr() {
        return expr;
    }

    public Expression getExpr2() {
        return expr2;
    }
}
/*
ExprEnsembliste	::=	Element ? Ensemble
|	Ensemble ? Ensemble
|	Ensemble ? Ensemble
 */
