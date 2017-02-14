package pExpr.pNonTerminal.pSousExpr.pExprLogique;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class Etlogique extends ExpressionLogique{
    private Expression expr2;
    public Etlogique(Expression expr, Expression expr2) {
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

        System.out.println(prefixe + "EtLogique");
        expr.afficher(prefixe+"\t");
        expr2.afficher(prefixe+"\t");
    }

}
//Expr ? Expr
