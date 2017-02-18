package pExpr.pNonTerminal.pComparaisons.pComparaisonsEnsemblistes;

import pExpr.Expression;
import pExpr.pNonTerminal.pComparaisons.Comparaison;

public abstract class ComparaisonEnsembliste extends Comparaison {
    public ComparaisonEnsembliste(Expression exprg, Expression exprd) {
        super(exprg, exprd);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "C E");
        this.exprg.afficher(prefixe+"\t");
        this.exprd.afficher(prefixe+"\t");
    }
}
