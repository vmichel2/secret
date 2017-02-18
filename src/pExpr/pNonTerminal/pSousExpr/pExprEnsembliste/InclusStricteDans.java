package pExpr.pNonTerminal.pSousExpr.pExprEnsembliste;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class InclusStricteDans extends ExpressionEnsembliste{
    public InclusStricteDans(Expression expr, Expression expr2) {
        super(expr, expr2);
    }


    public Object Accepte (Visiteur v, Object data){
        return v.visit(this, data);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "InclusStricteDans");
        expr.afficher(prefixe+"\t");
        expr2.afficher(prefixe+"\t");
    }
}
//Ensemble ? Ensemble

