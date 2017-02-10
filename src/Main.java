import pExpr.Expression;
import pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique.Egalite;
import pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique.Plusgrandque;
import pExpr.pNonTerminal.pEnsemble.Ensemble;
import pExpr.pNonTerminal.pSousExpr.pExprEnsembliste.AppartientA;
import pExpr.pNonTerminal.pSousExpr.pExprLogique.Etlogique;
import pExpr.pNonTerminal.pSousExpr.pExprLogique.QuelqueSoit;
import pExpr.pTerminal.Entier;
import pExpr.pTerminal.Litteral;

public class Main {
    public void main (String args[]){
        Litteral x = new Litteral("x");
        Litteral X = new Litteral("X");
        Expression exemple1 = new Etlogique(
                new Egalite(X, new Ensemble(new Entier(1), new Entier(2), new Entier(3))),
                new QuelqueSoit(x, new AppartientA(x, X), new Plusgrandque(x, new Entier(0))));
    }
}
