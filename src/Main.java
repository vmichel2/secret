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
import pVisiteurs.Evaluateur;
import pVisiteurs.PrettyPrinter;
import pVisiteurs.Validateur;
import pVisiteurs.Visiteur;

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





        Visiteur v = new Validateur();
        System.out.println("1 "+exemple1.Accepte(v, new Object())); // OK
        System.out.println("2 "+exemple2.Accepte(v, new Object())); // OK
        System.out.println("3 "+exemple3.Accepte(v, new Object())); // OK
        System.out.println("4 "+exemple4.Accepte(v, new Object())); // renvoie ERROR (ne doit pas être parsé)




        Visiteur ve = new Evaluateur();
        Expression exemple5 = new Egalite(new Entier(4),new Entier(5));
        Expression exemple6 = new Inegalite(new Entier(4),new Entier(5));
        Expression exemple7 = new Plusgrandegalque(new Entier(5),new Entier(5));
        Expression exemple8 = new Inegal(new Ensemble(new Entier(42)),new Ensemble(new Entier(42)));
        Expression exemple9 = new Egal(new Ensemble(new Entier(42)),new Ensemble(new Entier(42)));
        Expression exemple10 = new Egal(new Ensemble(new Entier(42)),new Ensemble(new Entier(45)));
        Expression exemple11 = new AppartientA(new Entier(10),new Ensemble(new Entier(5), new Entier(10)));
        Expression exemple12 = new InclusDans(new Ensemble(new Entier(5)),new Ensemble((new Entier(5)), new Entier(10)));
        Expression exemple13 = new Cardinalite(new Ensemble(new Entier(49)));
        System.out.println("5 "+exemple5.Accepte(ve,new Object())); // renvoie false, normal 4!=5
        System.out.println("6 "+exemple6.Accepte(ve,new Object())); // renvoie true, normal 4!=5
        System.out.println("7 "+exemple7.Accepte(ve,new Object())); // renvoie true, normal 5>=5
        System.out.println("8 "+exemple8.Accepte(ve,new Object())); // renvoie false, normal {42} = {42}
        System.out.println("9 "+exemple9.Accepte(ve,new Object())); // renvoie true, normal {42} = {42}
        System.out.println("10 "+exemple10.Accepte(ve,new Object())); // renvoie false, normal {42} = {45}
        System.out.println("11 "+exemple11.Accepte(ve,new Object())); // renvoie true, normal 10 appartient à  {5,10}
        System.out.println("12 "+exemple12.Accepte(ve,new Object())); // renvoie true, normal {5} est inclus dans  {5,10}
        System.out.println("13 "+exemple13.Accepte(ve,new Object())); // renvoie 1, normal {49} contient 1 élément


        Visiteur ve2 = new PrettyPrinter();
        Object o1 = exemple1.Accepte(ve2, new Object());
        System.out.println(o1);

        Object o2 = exemple2.Accepte(ve2, new Object());
        System.out.println(o2);

        Object o3 = exemple3.Accepte(ve2, new Object());
        System.out.println(o3);

        Object o4 = exemple4.Accepte(ve2, new Object());
        System.out.println(o4);
        // to come...
    }

    /*
    Todo : Visiteur pretty-printer
    Todo : finir Visiteur évaluateur
     */

}