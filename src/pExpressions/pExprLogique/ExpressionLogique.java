package pExpressions.pExprLogique;

import pExpressions.Expression;

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