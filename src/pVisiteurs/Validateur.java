package pVisiteurs;

import pExpr.pNonTerminal.pComparaisons.pComparaisonArithmetique.*;
import pExpr.pNonTerminal.pComparaisons.pComparaisonsEnsemblistes.Egal;
import pExpr.pNonTerminal.pComparaisons.pComparaisonsEnsemblistes.Inegal;
import pExpr.pNonTerminal.pEnsemble.Ensemble;
import pExpr.pNonTerminal.pSousExpr.pExprArith.Cardinalite;
import pExpr.pNonTerminal.pSousExpr.pExprArith.Moins;
import pExpr.pNonTerminal.pSousExpr.pExprArith.Plus;
import pExpr.pNonTerminal.pSousExpr.pExprEnsembliste.AppartientA;
import pExpr.pNonTerminal.pSousExpr.pExprEnsembliste.InclusDans;
import pExpr.pNonTerminal.pSousExpr.pExprEnsembliste.InclusStricteDans;
import pExpr.pNonTerminal.pSousExpr.pExprLogique.*;
import pExpr.pTerminal.Booleen;
import pExpr.pTerminal.Entier;
import pExpr.pTerminal.Litteral;

public class Validateur implements Visiteur {
    //Todo : Fill ALL the methods

    @Override
    public Object visit(Litteral litteral) {
        return null;
    }

    @Override
    public Object visit(Entier entier) {
        return null;
    }

    @Override
    public Object visit(Booleen booleen) {
        return null;
    }

    @Override
    public Object visit(Etlogique etlogique) {
        return null;
    }

    @Override
    public Object visit(IlExiste ilExiste) {
        return null;
    }

    @Override
    public Object visit(Non non) {
        return null;
    }

    @Override
    public Object visit(Oulogique oulogique) {
        return null;
    }

    @Override
    public Object visit(QuelqueSoit quelqueSoit) {
        return null;
    }

    @Override
    public Object visit(InclusStricteDans inclusStricteDans) {
        return null;
    }

    @Override
    public Object visit(InclusDans inclusDans) {
        return null;
    }

    @Override
    public Object visit(AppartientA appartientA) {
        return null;
    }

    @Override
    public Object visit(Plus plus) {
        return null;
    }

    @Override
    public Object visit(Moins moins) {
        return null;
    }

    @Override
    public Object visit(Cardinalite cardinalite) {
        return null;
    }

    @Override
    public Object visit(Ensemble ensemble) {
        return null;
    }

    @Override
    public Object visit(Inegal inegal) {
        return null;
    }

    @Override
    public Object visit(Egal egal) {
        return null;
    }

    @Override
    public Object visit(Egalite egalite) {
        return null;
    }

    @Override
    public Object visit(Inegalite inegalite) {
        return null;
    }

    @Override
    public Object visit(Plusgrandegalque plusgrandegalque) {
        return null;
    }

    @Override
    public Object visit(Plusgrandque plusgrandque) {
        return null;
    }

    @Override
    public Object visit(Pluspetitegalque pluspetitegalque) {
        return null;
    }

    @Override
    public Object visit(Pluspetitque pluspetitque) {
        return null;
    }
}
