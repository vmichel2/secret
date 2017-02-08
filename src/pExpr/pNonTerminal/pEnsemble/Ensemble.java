package pExpr.pNonTerminal.pEnsemble;
import pExpr.pNonTerminal.NonTerminal;
import pExpr.pNonTerminal.pSousExpr.pExprArith.ExprArith;

import java.util.ArrayList;

public abstract class Ensemble extends NonTerminal {
    ExprArith[] ensemble;
    public Ensemble(ExprArith ... expr){
        ensemble=expr;
    }
}

// Ensemble	::=	{ ExprArith (, ExprArith)* }