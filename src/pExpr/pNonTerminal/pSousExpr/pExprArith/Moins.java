package pExpr.pNonTerminal.pSousExpr.pExprArith;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class Moins extends ExprArith {

    protected Expression expr2;
    public Moins(Expression expr,Expression expr2) {
        super(expr);
        this.expr2=expr2;

    }

    public Expression getExpr2() {
        return expr2;
    }

    public Object Accepte (Visiteur v, Object data){
        return v.visit(this, data);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Moins");
        expr.afficher(prefixe+"\t");
        expr2.afficher(prefixe+"\t");
    }
}
//ExprArith - ExprArith
