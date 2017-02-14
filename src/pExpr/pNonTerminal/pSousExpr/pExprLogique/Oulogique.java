package pExpr.pNonTerminal.pSousExpr.pExprLogique;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class Oulogique extends ExpressionLogique {
    protected Expression expr2;
    public Oulogique(Expression expr, Expression expr2) {
        super(expr);
        this.expr2=expr2;
    }

    public Expression getExpr2() {
        return expr2;
    }

    public Object Accepte (Visiteur v){
        return v.visit(this);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "Ou");
        expr.afficher(prefixe+"\t");
        expr2.afficher(prefixe+"\t");
    }

}
//Expr ? Expr
