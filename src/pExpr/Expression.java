package pExpr;

public abstract class Expression {

    public Expression() {

    }

    public abstract void afficher(String prefixe);

}
// ToDo => consignes à mettre dans le readme
// Pour chaque terminal ou non term : constructeur, affichage et visite -> 3 fcts
// code métier dans le visiteur

/*
Expr	::=	ExprEnsembliste
|	ExprLogique
|	Comparaison
 */