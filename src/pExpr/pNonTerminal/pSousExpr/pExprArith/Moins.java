package pExpr.pNonTerminal.pSousExpr.pExprArith;

import pExpr.Expression;

public class Moins extends ExprArith {

    protected Expression expr2;
    public Moins(Expression expr,Expression expr2) {
        super(expr);
        this.expr2=expr2;

    }
}
//ExprArith - ExprArith
