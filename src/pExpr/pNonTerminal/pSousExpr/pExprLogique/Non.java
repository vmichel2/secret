package pExpr.pNonTerminal.pSousExpr.pExprLogique;

import pExpr.Expression;

public class Non extends ExpressionLogique{
    public Non(Expression expr) {
        super(expr);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Non");
        expr.afficher(prefixe+"\t");
    }

}
//not(expr)