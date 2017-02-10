package pExpr.pNonTerminal.pSousExpr.pExprLogique;

import pExpr.Expression;

public class Oulogique extends ExpressionLogique {
    protected Expression expr2;
    public Oulogique(Expression expr, Expression expr2) {
        super(expr);
        this.expr2=expr2;
    }
}
//Expr ? Expr
