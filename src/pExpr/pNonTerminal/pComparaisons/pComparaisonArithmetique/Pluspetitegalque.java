package pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class Pluspetitegalque extends ComparaisonArithmetique {
    public Pluspetitegalque(Expression exprg, Expression exprd) {
        super(exprg, exprd);
    }


    public Object Accepte (Visiteur v){
        return v.visit(this);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Plus petit ou égal que");
        exprg.afficher(prefixe+"\t");
        exprd.afficher(prefixe+"\t");
    }
}
