package pExpr.pNonTerminal.pSousExpr.pExprLogique;

import pExpr.Expression;

public class QuelqueSoit extends ExpressionLogique {
    protected Expression expr2;
    protected Expression expr3;
    public QuelqueSoit(Expression expr, Expression expr2, Expression expr3) {
        super(expr);
        this.expr2=expr2;
        this.expr3=expr3;
    }

}
//(? Litt�ral . ExprEnsembliste ? Expr )
