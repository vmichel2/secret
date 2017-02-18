package pExpr.pNonTerminal.pSousExpr.pExprLogique;


import pExpr.Expression;
import pVisiteurs.Visiteur;

public class IlExiste extends ExpressionLogique {
    Expression expr2;
    Expression expr3;
    public IlExiste(Expression expr, Expression expr2, Expression expr3) {
        super(expr);
        this.expr2=expr2;
        this.expr3=expr3;
    }

    public Expression getExpr2() {
        return expr2;
    }

    public Expression getExpr3() {
        return expr3;
    }

    public Object Accepte (Visiteur v, Object data){
        return v.visit(this, data);
    }

    public void afficher(String prefixe) {

        System.out.println(prefixe + "IlExiste");
        expr.afficher(prefixe+"\t");
        expr2.afficher(prefixe+"\t");
        expr3.afficher(prefixe+"\t");
    }
}
//(? Litt�ral . ExprEnsembliste ? Expr )
