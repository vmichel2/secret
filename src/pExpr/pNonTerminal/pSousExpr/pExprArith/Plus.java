package pExpr.pNonTerminal.pSousExpr.pExprArith;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class Plus extends ExprArith {

    protected Expression expr2;
    public Plus(Expression expr,Expression expr2) {
        super(expr);
        this.expr2=expr2;
    }

    public Object Accepte (Visiteur v){
        return v.visit(this);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Plus");
        expr.afficher(prefixe+"\t");
        expr2.afficher(prefixe+"\t");
    }
}
//ExprArith + ExprArith
