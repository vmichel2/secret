package pExpr.pNonTerminal.pSousExpr.pExprLogique;

import pExpr.Expression;

public class ExpressionLogique extends Expression {
}
/*
ExprLogique	::=	Expr ? Expr
|	Expr ? Expr
|	not(Expr)
|	(? Litt�ral . ExprEnsembliste ? Expr )
|	(? Litt�ral . ExprEnsembliste ? Expr )
|	true
|	false
 */