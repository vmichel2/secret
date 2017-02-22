import pExpr.Expression;
import pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique.Egalite;
import pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique.Inegalite;
import pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique.Plusgrandegalque;
import pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique.Plusgrandque;
import pExpr.pNonTerminal.pComparaisons.pComparaisonsEnsemblistes.Egal;
import pExpr.pNonTerminal.pComparaisons.pComparaisonsEnsemblistes.Inegal;
import pExpr.pNonTerminal.pEnsemble.Ensemble;
import pExpr.pNonTerminal.pSousExpr.pExprArith.Cardinalite;
import pExpr.pNonTerminal.pSousExpr.pExprEnsembliste.AppartientA;
import pExpr.pNonTerminal.pSousExpr.pExprEnsembliste.InclusDans;
import pExpr.pNonTerminal.pSousExpr.pExprLogique.Etlogique;
import pExpr.pNonTerminal.pSousExpr.pExprLogique.IlExiste;
import pExpr.pNonTerminal.pSousExpr.pExprLogique.Oulogique;
import pExpr.pNonTerminal.pSousExpr.pExprLogique.QuelqueSoit;
import pExpr.pTerminal.Entier;
import pExpr.pTerminal.Litteral;
import pVisiteurs.*;

public class Main {
    public static void main(String args[]) {

        /* Constructeur de la fabrique et des visiteurs */
        FabriqueVisiteurs fabrique = new FabriqueVisiteurs();
        Visiteur prettyprinter, validateur, evaluateur;
        try {
            prettyprinter = fabrique.getVisiteur("prettyprinter");
            validateur = fabrique.getVisiteur("validateur");;
            evaluateur = fabrique.getVisiteur("evaluateur");;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        /* Construction des exemples */

        // Exemple 1
        Litteral x = new Litteral("x");
        Litteral X = new Litteral("X");
        Expression exemple1 = new Etlogique(
                new Egalite(X, new Ensemble(new Entier(1), new Entier(2), new Entier(3))),
                new QuelqueSoit(x, new AppartientA(x, X), new Plusgrandque(x, new Entier(0))));


        // Exemple 2
        Litteral Y = new Litteral("Y");
        Litteral Z = new Litteral("Z");
        Expression exemple2 = new Etlogique(
                new Egalite(Y, new Ensemble(new Entier(4), new Entier(5), new Entier(6))),
                new IlExiste(Z, new Ensemble(Z, Y), new Egalite(new Cardinalite(Z), new Entier(3))));


        // Exemple 3
        Litteral a = new Litteral("x");
        Litteral A = new Litteral("X");
        Expression exemple3 = new Etlogique(
                new Egalite(X, new Ensemble(new Entier(1), new Entier(2), new Entier(3))),
                new IlExiste(x, new AppartientA(x, X), new Egalite(new Cardinalite(x), new Entier(1))));

        // Exemple 4
        Litteral Q = new Litteral("X");
        Expression exemple4 = new Oulogique(
                new Egalite(X, new Ensemble()),
                new Ensemble(new Entier(1), new Entier(2), new Entier(3))
        );


        /* Test des méthodes afficher */

        System.out.println("Exemple 1 (afficher) :");
        exemple1.afficher("");
        System.out.println();
        System.out.println("================================");
        System.out.println();

        System.out.println("Exemple 2 (afficher) :");
        exemple2.afficher("");
        System.out.println();
        System.out.println("================================");
        System.out.println();

        System.out.println("Exemple 3 (afficher) :");
        exemple3.afficher("");
        System.out.println();
        System.out.println("================================");
        System.out.println();

        System.out.println("Exemple 4 (afficher) :");
        exemple4.afficher("");
        System.out.println();
        System.out.println("================================");
        System.out.println();


        /* Test des visiteurs */
        System.out.println("Exemple 1 (visiteurs) :");
        System.out.println(exemple1.Accepte(prettyprinter, new Object()));
        System.out.println();
        System.out.println(exemple1.Accepte(validateur, new Object()));
        System.out.println();
        System.out.println(exemple1.Accepte(evaluateur, new Object()));
        System.out.println();
        System.out.println("================================");
        System.out.println();

        System.out.println("Exemple 2 (visiteurs) :");
        System.out.println(exemple2.Accepte(prettyprinter, new Object()));
        System.out.println();
        System.out.println(exemple2.Accepte(validateur, new Object()));
        System.out.println();
        System.out.println(exemple2.Accepte(evaluateur, new Object()));
        System.out.println();
        System.out.println("================================");
        System.out.println();


        System.out.println("Exemple 3 (visiteurs) :");
        System.out.println(exemple3.Accepte(prettyprinter, new Object()));
        System.out.println();
        System.out.println(exemple3.Accepte(validateur, new Object()));
        System.out.println();
        System.out.println(exemple3.Accepte(evaluateur, new Object()));
        System.out.println();
        System.out.println("================================");
        System.out.println();

        System.out.println("Exemple 4 (visiteurs) :");
        System.out.println(exemple4.Accepte(prettyprinter, new Object()));
        System.out.println();
        System.out.println(exemple4.Accepte(validateur, new Object()));
        System.out.println();
        System.out.println(exemple4.Accepte(evaluateur, new Object()));
        System.out.println();
        System.out.println("================================");
        System.out.println();

        /*

        // Quelques tests supplémentaires pour la validation
        System.out.println("1 "+exemple1.Accepte(validateur, new Object())); // OK
        System.out.println("2 "+exemple2.Accepte(validateur, new Object())); // OK
        System.out.println("3 "+exemple3.Accepte(validateur, new Object())); // OK
        System.out.println("4 "+exemple4.Accepte(validateur, new Object())); // renvoie ERROR (ne doit pas être parsé)

        // Quelques tests supplémentaires pour l'évaluation
        Expression exemple5 = new Egalite(new Entier(4),new Entier(5));
        Expression exemple6 = new Inegalite(new Entier(4),new Entier(5));
        Expression exemple7 = new Plusgrandegalque(new Entier(5),new Entier(5));
        Expression exemple8 = new Inegal(new Ensemble(new Entier(42)),new Ensemble(new Entier(42)));
        Expression exemple9 = new Egal(new Ensemble(new Entier(42)),new Ensemble(new Entier(42)));
        Expression exemple10 = new Egal(new Ensemble(new Entier(42)),new Ensemble(new Entier(45)));
        Expression exemple11 = new AppartientA(new Entier(10),new Ensemble(new Entier(5), new Entier(10)));
        Expression exemple12 = new InclusDans(new Ensemble(new Entier(5)),new Ensemble((new Entier(5)), new Entier(10)));
        Expression exemple13 = new Cardinalite(new Ensemble(new Entier(49)));
        System.out.println("5 "+exemple5.Accepte(evaluateur,new Object())); // renvoie false, normal 4!=5
        System.out.println("6 "+exemple6.Accepte(evaluateur,new Object())); // renvoie true, normal 4!=5
        System.out.println("7 "+exemple7.Accepte(evaluateur,new Object())); // renvoie true, normal 5>=5
        System.out.println("8 "+exemple8.Accepte(evaluateur,new Object())); // renvoie false, normal {42} = {42}
        System.out.println("9 "+exemple9.Accepte(evaluateur,new Object())); // renvoie true, normal {42} = {42}
        System.out.println("10 "+exemple10.Accepte(evaluateur,new Object())); // renvoie false, normal {42} = {45}
        System.out.println("11 "+exemple11.Accepte(evaluateur,new Object())); // renvoie true, normal 10 appartient à  {5,10}
        System.out.println("12 "+exemple12.Accepte(evaluateur,new Object())); // renvoie true, normal {5} est inclus dans  {5,10}
        System.out.println("13 "+exemple13.Accepte(evaluateur,new Object())); // renvoie 1, normal {49} contient 1 élément

        */
    }

    /*
    Todo : Visiteur pretty-printer
    Todo : finir Visiteur évaluateur
     */

}