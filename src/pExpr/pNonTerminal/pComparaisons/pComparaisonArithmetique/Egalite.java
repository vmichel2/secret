package pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique;

import pExpr.Expression;

public class Egalite extends ComparaisonArithmetique {

    public Egalite(Expression exprg, Expression exprd) {
        super(exprg, exprd);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Egalite");
        exprg.afficher(prefixe+"\t");
        exprd.afficher(prefixe+"\t");
    }

}
