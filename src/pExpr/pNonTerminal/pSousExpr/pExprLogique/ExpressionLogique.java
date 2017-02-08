package pExpr.pNonTerminal.pSousExpr.pExprLogique;

import pExpr.pNonTerminal.NonTerminal;

public class ExpressionLogique extends NonTerminal {
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