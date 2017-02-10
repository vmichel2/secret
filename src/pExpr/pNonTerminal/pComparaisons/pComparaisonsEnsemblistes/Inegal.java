package pExpr.pNonTerminal.pComparaisons.pComparaisonsEnsemblistes;

import pExpr.Expression;

public class Inegal extends ComparaisonEnsembliste {

    public Inegal(Expression exprg, Expression exprd) {
        super(exprg, exprd);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "C !=");
        this.exprg.afficher(prefixe+"\t");
        this.exprd.afficher(prefixe+"\t");
    }
}
