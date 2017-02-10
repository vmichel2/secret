package pExpr.pNonTerminal.pSousExpr.pExprArith;

import pExpr.Expression;

public class Cardinalite extends ExprArith {

    public Cardinalite(Expression expr) {
        super(expr);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Cardinalite");
        expr.afficher(prefixe+"\t");
    }
}


//card(Ensemble)