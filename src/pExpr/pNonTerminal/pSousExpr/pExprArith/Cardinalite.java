package pExpr.pNonTerminal.pSousExpr.pExprArith;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class Cardinalite extends ExprArith {

    public Cardinalite(Expression expr) {
        super(expr);
    }


    public Object Accepte (Visiteur v, Object data){
        return v.visit(this, data);
    }


    public void afficher(String prefixe) {

        System.out.println(prefixe + "Cardinalite");
        expr.afficher(prefixe+"\t");
    }
}


//card(Ensemble)