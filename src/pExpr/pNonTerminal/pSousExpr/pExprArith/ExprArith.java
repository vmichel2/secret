package pExpr.pNonTerminal.pSousExpr.pExprArith;

import pExpr.Expression;
import pExpr.pNonTerminal.NonTerminal;

public abstract class ExprArith extends NonTerminal {
    protected Expression expr;
    public ExprArith(Expression expr){
        this.expr=expr;
    }
    public Expression getExpr() {
        return expr;
    }
}
