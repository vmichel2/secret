package pExpr.pNonTerminal.pSousExpr.pExprArith;

import pExpr.Expression;
import pExpr.pNonTerminal.NonTerminal;

public class ExprArith extends NonTerminal {
    protected Expression expr;
    public ExprArith(Expression expr){
        this.expr=expr;
    }

}
