package pExpr.pNonTerminal.pEnsemble;
import pExpr.Expression;
import pExpr.pNonTerminal.NonTerminal;
import pVisiteurs.Visiteur;


public class Ensemble extends NonTerminal {
    Expression[] ensemble;
    public Ensemble(Expression... expr){
        ensemble=expr;
    }


    public Expression[] getEnsemble() {
        return ensemble;
    }

    public Object Accepte (Visiteur v, Object data){
        return v.visit(this, data);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Ensemble");
        for (Expression expr : ensemble) {
            expr.afficher(prefixe+"\t");
        }

    }
    public int getSize(){
        return ensemble.length;
    }
}

// Ensemble	::=	{ ExprArith (, ExprArith)* }