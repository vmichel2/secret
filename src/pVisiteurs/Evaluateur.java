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

public class Evaluateur implements Visiteur {
    @Override
    public Object visit(Litteral litteral, Object data) {
        return null;
    }

    @Override
    public Object visit(Entier entier, Object data) {
        return null;
    }

    @Override
    public Object visit(Booleen booleen, Object data) {
        return null;
    }

    @Override
    public Object visit(Etlogique etlogique, Object data) {
        return null;
    }

    @Override
    public Object visit(IlExiste ilExiste, Object data) {
        return null;
    }

    @Override
    public Object visit(Non non, Object data) {
        return null;
    }

    @Override
    public Object visit(Oulogique oulogique, Object data) {
        return null;
    }

    @Override
    public Object visit(QuelqueSoit quelqueSoit, Object data) {
        return null;
    }

    @Override
    public Object visit(InclusStricteDans inclusStricteDans, Object data) {
        return null;
    }

    @Override
    public Object visit(InclusDans inclusDans, Object data) {
        return null;
    }

    @Override
    public Object visit(AppartientA appartientA, Object data) {
        return null;
    }

    @Override
    public Object visit(Plus plus, Object data) {
        return null;
    }

    @Override
    public Object visit(Moins moins, Object data) {
        return null;
    }

    @Override
    public Object visit(Cardinalite cardinalite, Object data) {
        return null;
    }

    @Override
    public Object visit(Ensemble ensemble, Object data) {
        return null;
    }

    @Override
    public Object visit(Inegal inegal, Object data) {
        return null;
    }

    @Override
    public Object visit(Egal egal, Object data) {
        return null;
    }

    @Override
    public Object visit(Egalite egalite, Object data) {
        return null;
    }

    @Override
    public Object visit(Inegalite inegalite, Object data) {
        return null;
    }

    @Override
    public Object visit(Plusgrandegalque plusgrandegalque, Object data) {
        return null;
    }

    @Override
    public Object visit(Plusgrandque plusgrandque, Object data) {
        return null;
    }

    @Override
    public Object visit(Pluspetitegalque pluspetitegalque, Object data) {
        return null;
    }

    @Override
    public Object visit(Pluspetitque pluspetitque, Object data) {
        return null;
    }
    //Todo : Fill ALL the methods
}