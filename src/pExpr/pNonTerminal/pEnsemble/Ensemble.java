package pExpr.pNonTerminal.pEnsemble;
import pExpr.Expression;
import pExpr.pNonTerminal.NonTerminal;


public class Ensemble extends NonTerminal {
    Expression[] ensemble;
    public Ensemble(Expression... expr){
        ensemble=expr;
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Ensemble");
        for (Expression expr : ensemble) {
            expr.afficher(prefixe+"\t");
        }

    }
}

// Ensemble	::=	{ ExprArith (, ExprArith)* }