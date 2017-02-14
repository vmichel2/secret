package pExpr.pNonTerminal.pSousExpr.pExprLogique;

import pExpr.Expression;
import pVisiteurs.Visiteur;

public class QuelqueSoit extends ExpressionLogique {
    protected Expression expr2;
    protected Expression expr3;
    public QuelqueSoit(Expression expr, Expression expr2, Expression expr3) {
        super(expr);
        this.expr2=expr2;
        this.expr3=expr3;
    }


    public Object Accepte (Visiteur v){
        return v.visit(this);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "QuelqueSoit");
        expr.afficher(prefixe+"\t");
        expr2.afficher(prefixe+"\t");
        expr3.afficher(prefixe+"\t");

    }

}
//(? Litt�ral . ExprEnsembliste ? Expr )
