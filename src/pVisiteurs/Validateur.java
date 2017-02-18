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
import pExpr.pTerminal.Terminal;

public class Validateur implements Visiteur {

    //Todo : Fill ALL the methods
    /*
    Pour s'acquitter de l'object data, on renvoie un 1 (Integer) si tout va bien et un faux (booleen) sinon.
    Seuls les types "Terminal" (feuilles) renvoient un objet du type qui leur correspond.
    De ce fait, une récursion comme 1 + (1 + 2) renverra 1, car tous les Terminaux utilisés sont des entiers ou des noms de variables.
                                    1 + (true + 2) renverra false, car (true + 2) aura renvoyé faux (car true est un booléen).

    @Override
    public String visit(Litteral litteral) {
        return litteral.getLitteral();
    }

    @Override
    public int visit(Entier entier) {
        return entier.getEntier();
    }

    @Override
    public boolean visit(Booleen booleen) {
        return booleen.getBooleen();
    }

    @Override
    public Object visit(Etlogique etlogique) {
        return ((etlogique.getExpr().Accepte(this) &&
                 etlogique.getExpr2().Accepte(this)));
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
        return ((appartientA.getExpr().Accepte(this) instanceof Integer &&
                 appartientA.getExpr2().Accepte(this) instanceof Integer)) ;
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
        for (Expression e : ensemble.getEnsemble()){
            if (!( e instanceof Entier)){
                return false;
            }
        }
        return 1;
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
        return ((egalite.getExprg().Accepte(this) instanceof Integer) &&
                (egalite.getExprd().Accepte(this) instanceof Integer));
    }

    @Override
    public Object visit(Inegalite inegalite) {
        return ((inegalite.getExprg().Accepte(this) instanceof Integer) &&
                (inegalite.getExprd().Accepte(this) instanceof Integer));
    }

    @Override
    public Object visit(Plusgrandegalque plusgrandegalque) {
        return ((plusgrandegalque.getExprg().Accepte(this) instanceof Integer) &&
                (plusgrandegalque.getExprd().Accepte(this) instanceof Integer));
    }

    @Override
    public Object visit(Plusgrandque plusgrandque) {
        return ((plusgrandque.getExprg().Accepte(this) instanceof Integer) &&
                (plusgrandque.getExprd().Accepte(this) instanceof Integer));
    }

    @Override
    public Object visit(Pluspetitegalque pluspetitegalque) {
        return((pluspetitegalque.getExprg().Accepte(this) instanceof Integer) &&
               (pluspetitegalque.getExprd().Accepte(this) instanceof Integer));
    }

    @Override
    public Object visit(Pluspetitque pluspetitque) {
        if ((pluspetitque.getExprg().Accepte(this) instanceof Integer) &&
            (pluspetitque.getExprd().Accepte(this) instanceof Integer))
                return 1;
        return false;
    }
*/










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
}
