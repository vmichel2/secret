package pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class Egalite extends ComparaisonArithmetique {

    public Egalite(Expression exprg, Expression exprd) {
        super(exprg, exprd);
    }


    public Object Accepte (Visiteur v, Object data){
        return v.visit(this, data);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Egalite");
        exprg.afficher(prefixe+"\t");
        exprd.afficher(prefixe+"\t");
    }

}
