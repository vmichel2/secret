package pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class Inegalite extends ComparaisonArithmetique {
    public Inegalite(Expression exprg, Expression exprd) {
        super(exprg, exprd);
    }


    public Object Accepte (Visiteur v, Object data){
        return v.visit(this, data);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Inegalite");
        exprg.afficher(prefixe+"\t");
        exprd.afficher(prefixe+"\t");
    }
}
