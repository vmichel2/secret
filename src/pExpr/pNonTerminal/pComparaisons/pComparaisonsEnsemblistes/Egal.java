package pExpr.pNonTerminal.pComparaisons.pComparaisonsEnsemblistes;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class Egal extends ComparaisonEnsembliste {

    public Egal(Expression exprg, Expression exprd) {
        super(exprg, exprd);
    }

    public Object Accepte (Visiteur v){
        return v.visit(this);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "C =");
        this.exprg.afficher(prefixe+"\t");
        this.exprd.afficher(prefixe+"\t");
    }

}
