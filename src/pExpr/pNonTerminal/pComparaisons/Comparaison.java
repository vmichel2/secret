package pExpr.pNonTerminal.pComparaisons;

import pExpr.Expression;
import pExpr.pNonTerminal.NonTerminal;

public class Comparaison extends NonTerminal {
    protected Expression exprg;
    protected Expression exprd;
    public Comparaison(Expression exprg, Expression exprd){
        this.exprg=exprg;
        this.exprd=exprd;
    }
    public void afficher(String prefixe) { }

}

/*
Comparaison	::=	ComparaisonArithm�tique
            |	ComparaisonEnsembliste
 */