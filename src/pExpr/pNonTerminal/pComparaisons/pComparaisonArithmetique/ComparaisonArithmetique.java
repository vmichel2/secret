package pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique;

import pExpr.Expression;
import pExpr.pNonTerminal.pComparaisons.Comparaison;

public class ComparaisonArithmetique extends Comparaison {
    public ComparaisonArithmetique(Expression exprg, Expression exprd) {
        super(exprg, exprd);
    }
}
/*
ComparaisonArithm�tique	::=	ExprArith = ExprArith
|	ExprArith ? ExprArith
|	ExprArith ? ExprArith
|	ExprArith > ExprArith
|	ExprArith < ExprArith
|	ExprArith ? ExprArith
 */