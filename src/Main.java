import pExpr.Expression;
import pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique.Egalite;
import pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique.Plusgrandque;
import pExpr.pNonTerminal.pEnsemble.Ensemble;
import pExpr.pNonTerminal.pSousExpr.pExprArith.Cardinalite;
import pExpr.pNonTerminal.pSousExpr.pExprEnsembliste.AppartientA;
import pExpr.pNonTerminal.pSousExpr.pExprLogique.Etlogique;
import pExpr.pNonTerminal.pSousExpr.pExprLogique.IlExiste;
import pExpr.pNonTerminal.pSousExpr.pExprLogique.Oulogique;
import pExpr.pNonTerminal.pSousExpr.pExprLogique.QuelqueSoit;
import pExpr.pTerminal.Entier;
import pExpr.pTerminal.Litteral;

public class Main {
    public static void main(String args[]) {
        Litteral x = new Litteral("x");
        Litteral X = new Litteral("X");
        Expression exemple1 = new Etlogique(
                new Egalite(X, new Ensemble(new Entier(1), new Entier(2), new Entier(3))),
                new QuelqueSoit(x, new AppartientA(x, X), new Plusgrandque(x, new Entier(0))));

        exemple1.afficher("");
        System.out.println();
        System.out.println("================================");
        System.out.println();

        Litteral Y = new Litteral("Y");
        Litteral Z = new Litteral("Z");
        Expression exemple2 = new Etlogique(
                new Egalite(Y, new Ensemble(new Entier(4), new Entier(5), new Entier(6))),
                new IlExiste(Z, new Ensemble(Z, Y), new Egalite(new Cardinalite(Z), new Entier(3))));

        exemple2.afficher("");
        System.out.println();
        System.out.println("================================");
        System.out.println();

        Litteral a = new Litteral("x");
        Litteral A = new Litteral("X");
        Expression exemple3 = new Etlogique(
                new Egalite(X, new Ensemble(new Entier(1), new Entier(2), new Entier(3))),
                new IlExiste(x, new AppartientA(x, X), new Egalite(new Cardinalite(x), new Entier(1))));

        exemple3.afficher("");
        System.out.println();
        System.out.println("================================");
        System.out.println();

        Litteral Q = new Litteral("X");
        Expression exemple4 = new Oulogique(
                new Egalite(X, new Ensemble()),
                new Ensemble(new Entier(1), new Entier(2), new Entier(3))
        );

        exemple4.afficher("");
        System.out.println();
        System.out.println("================================");
        System.out.println();

    }

    /*
    Todo : Visiteur pretty-printer
    Todo : Visiteur vérificateur
    Todo : Visiteur évaluateur
     */
}