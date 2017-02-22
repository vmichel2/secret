package pVisiteurs;

import pExpr.Expression;
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

public class PrettyPrinter implements Visiteur {
    @Override
    public Object visit(Litteral litteral, Object data) {
        return litteral.getLitteral();
    }

    @Override
    public Object visit(Entier entier, Object data) {
        return Integer.toString(entier.getEntier());
    }

    @Override
    public Object visit(Booleen booleen, Object data) {
        return Boolean.toString(booleen.getBooleen());
    }

    @Override
    public Object visit(Etlogique etLogique, Object data) {

        return "(" + etLogique.getExpr().Accepte(this, data) + ") && (" +
                etLogique.getExpr2().Accepte(this, data) + ")";
    }

    @Override
    public Object visit(IlExiste ilExiste, Object data) {
        return "(∃ " + ilExiste.getExpr().Accepte(this, data) + " . " +
                ilExiste.getExpr2().Accepte(this, data) + " ∧ " +
                ilExiste.getExpr3().Accepte(this, data) + ")";
    }

    @Override
    public Object visit(Non non, Object data) {
        return "not(" + non.getExpr().Accepte(this, data) + ")";
    }

    @Override
    public Object visit(Oulogique ouLogique, Object data) {
        return "(" + ouLogique.getExpr().Accepte(this, data) + ") || (" +
                ouLogique.getExpr2().Accepte(this, data) + ")";
    }

    @Override
    public Object visit(QuelqueSoit quelqueSoit, Object data) {
        return "(∀ " + quelqueSoit.getExpr().Accepte(this, data) + " . " +
                quelqueSoit.getExpr2().Accepte(this, data) + " => " +
                quelqueSoit.getExpr3().Accepte(this, data) + ")";
    }

    @Override
    public Object visit(InclusStricteDans inclusStricteDans, Object data) {
        return inclusStricteDans.getExpr().Accepte(this, data) + " ⊂ " +
                inclusStricteDans.getExpr2().Accepte(this, data);
    }

    @Override
    public Object visit(InclusDans inclusDans, Object data) {
        return inclusDans.getExpr().Accepte(this, data) + " ⊆ " +
                inclusDans.getExpr2().Accepte(this, data);
    }

    @Override
    public Object visit(AppartientA appartientA, Object data) {
        return appartientA.getExpr().Accepte(this, data) + " ∈ " +
                appartientA.getExpr2().Accepte(this, data);
    }

    @Override
    public Object visit(Plus plus, Object data) {
        return plus.getExpr().Accepte(this, data) + " + " +
                plus.getExpr2().Accepte(this, data);
    }

    @Override
    public Object visit(Moins moins, Object data) {

        return moins.getExpr().Accepte(this, data) + " - " +
                moins.getExpr2().Accepte(this, data);

    }

    @Override
    public Object visit(Cardinalite cardinalite, Object data) {

        return "card(" + cardinalite.getExpr().Accepte(this, data) + ")";

    }

    @Override
    public Object visit(Ensemble ensemble, Object data) {
        String tmp = "";
        for (Expression expr : ensemble.getEnsemble()) {
            if (!tmp.equals("")) { tmp += ", "; }
            tmp += expr.Accepte(this, data);
        }
        return "{" + tmp + "}";
    }

    @Override
    public Object visit(Inegal inegal, Object data) {
        return inegal.getExprg().Accepte(this, data) + " ≠ " +
                inegal.getExprd().Accepte(this, data);
    }

    @Override
    public Object visit(Egal egal, Object data) {
        return egal.getExprg().Accepte(this, data) + " = " +
                egal.getExprd().Accepte(this, data);
    }

    @Override
    public Object visit(Inegalite inegalite, Object data) {

        return inegalite.getExprg().Accepte(this, data) + " ≠ " +
                inegalite.getExprd().Accepte(this, data);
    }

    @Override
    public Object visit(Egalite egalite, Object data) {

        return egalite.getExprg().Accepte(this, data) + " = " +
                egalite.getExprd().Accepte(this, data);

    }

    @Override
    public Object visit(Plusgrandegalque plusgrandegalque, Object data) {

        return plusgrandegalque.getExprg().Accepte(this, data) + " ≥ " +
                plusgrandegalque.getExprd().Accepte(this, data);

    }

    @Override
    public Object visit(Plusgrandque plusgrandque, Object data) {

        return plusgrandque.getExprg().Accepte(this, data) + " > " +
                plusgrandque.getExprd().Accepte(this, data);

    }

    @Override
    public Object visit(Pluspetitegalque pluspetitegalque, Object data) {

        return pluspetitegalque.getExprg().Accepte(this, data) + " ≤ " +
                pluspetitegalque.getExprd().Accepte(this, data);

    }

    @Override
    public Object visit(Pluspetitque pluspetitque, Object data) {
        return pluspetitque.getExprg().Accepte(this, data) + " < " +
                pluspetitque.getExprd().Accepte(this, data);
    }

}