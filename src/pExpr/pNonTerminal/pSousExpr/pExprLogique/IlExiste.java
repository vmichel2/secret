package pExpr.pNonTerminal.pSousExpr.pExprLogique;


import pExpr.Expression;

public class IlExiste extends ExpressionLogique {
    Expression expr2;
    Expression expr3;
    public IlExiste(Expression expr, Expression expr2, Expression expr3) {
        super(expr);
        this.expr2=expr2;
        this.expr3=expr3;
    }
}
//(? Litt�ral . ExprEnsembliste ? Expr )
