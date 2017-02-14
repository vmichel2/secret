package pExpr.pNonTerminal.pEnsemble;
import pExpr.Expression;
import pExpr.pNonTerminal.NonTerminal;
import pVisiteurs.Visiteur;


public class Ensemble extends NonTerminal {
    Expression[] ensemble;
    public Ensemble(Expression... expr){
        ensemble=expr;
    }


    public Object Accepte (Visiteur v){
        return v.visit(this);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Ensemble");
        for (Expression expr : ensemble) {
            expr.afficher(prefixe+"\t");
        }

    }
}

// Ensemble	::=	{ ExprArith (, ExprArith)* }