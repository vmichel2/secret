package pExpr.pNonTerminal.pSousExpr.pExprLogique;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class Non extends ExpressionLogique{
    public Non(Expression expr) {
        super(expr);
    }

    public Object Accepte (Visiteur v){
        return v.visit(this);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Non");
        expr.afficher(prefixe+"\t");
    }

}
//not(expr)