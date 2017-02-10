package pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique;

import pExpr.Expression;

public class Plusgrandque extends ComparaisonArithmetique  {
    public Plusgrandque(Expression exprg, Expression exprd) {
        super(exprg, exprd);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Plus grand que");
        exprg.afficher(prefixe+"\t");
        exprd.afficher(prefixe+"\t");
    }
}
