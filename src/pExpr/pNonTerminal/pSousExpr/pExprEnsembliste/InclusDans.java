package pExpr.pNonTerminal.pSousExpr.pExprEnsembliste;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class InclusDans extends ExpressionEnsembliste {
    public InclusDans(Expression expr, Expression expr2) {
        super(expr, expr2);
    }


    public Object Accepte (Visiteur v){
        return v.visit(this);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "InclusDans");
        expr.afficher(prefixe+"\t");
        expr2.afficher(prefixe+"\t");
    }

}
//	Ensemble ? Ensemble
