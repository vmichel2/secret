package pExpressions.pExprLogique;

import pExpressions.Expression;

public class ExpressionLogique extends Expression {
}
/*
ExprLogique	::=	Expr ? Expr
|	Expr ? Expr
|	not(Expr)
|	(? Littéral . ExprEnsembliste ? Expr )
|	(? Littéral . ExprEnsembliste ? Expr )
|	true
|	false
 */