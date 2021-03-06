package pExpr.pNonTerminal.pSousExpr.pExprEnsembliste;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class AppartientA extends ExpressionEnsembliste {
    public AppartientA(Expression expr, Expression expr2) {
        super(expr, expr2);
    }


    public Object Accepte (Visiteur v, Object data){
        return v.visit(this, data);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "AppartientA");
        expr.afficher(prefixe+"\t");
        expr2.afficher(prefixe+"\t");
    }
}
//	Element ? Ensemble