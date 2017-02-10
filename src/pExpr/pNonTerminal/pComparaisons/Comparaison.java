package pExpr.pNonTerminal.pComparaisons;

import pExpr.Expression;
import pExpr.pNonTerminal.NonTerminal;

public abstract class Comparaison extends NonTerminal {
    protected Expression exprg;
    protected Expression exprd;
    public Comparaison(Expression exprg, Expression exprd){
        this.exprg=exprg;
        this.exprd=exprd;
    }
}

/*
Comparaison	::=	ComparaisonArithm�tique
            |	ComparaisonEnsembliste
 */