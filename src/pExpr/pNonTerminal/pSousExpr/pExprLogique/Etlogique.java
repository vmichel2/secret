package pExpr.pNonTerminal.pSousExpr.pExprLogique;

import pExpr.Expression;

public class Etlogique extends ExpressionLogique{
    private Expression expr2;
    public Etlogique(Expression expr, Expression expr2) {
        super(expr);
        this.expr2=expr2;
    }
}
//Expr ? Expr
