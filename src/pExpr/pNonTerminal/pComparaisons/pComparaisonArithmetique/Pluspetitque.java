package pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class Pluspetitque extends ComparaisonArithmetique  {
    public Pluspetitque(Expression exprg, Expression exprd) {
        super(exprg, exprd);
    }


    public Object Accepte (Visiteur v, Object data){
        return v.visit(this, data);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Plus petit que");
        exprg.afficher(prefixe+"\t");
        exprd.afficher(prefixe+"\t");
    }

}
