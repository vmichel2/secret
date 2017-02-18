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

public interface Visiteur {
    Object visit(Litteral litteral, Object data);

    Object visit(Entier entier, Object data);

    Object visit(Booleen booleen, Object data);

    Object visit(Etlogique etlogique, Object data);

    Object visit(IlExiste ilExiste, Object data);

    Object visit(Non non, Object data);

    Object visit(Oulogique oulogique, Object data);

    Object visit(QuelqueSoit quelqueSoit, Object data);

    Object visit(InclusStricteDans inclusStricteDans, Object data);

    Object visit(InclusDans inclusDans, Object data);

    Object visit(AppartientA appartientA, Object data);

    Object visit(Plus plus, Object data);

    Object visit(Moins moins, Object data);

    Object visit(Cardinalite cardinalite, Object data);

    Object visit(Ensemble ensemble, Object data);

    Object visit(Inegal inegal, Object data);

    Object visit(Egal egal, Object data);

    Object visit(Egalite egalite, Object data);

    Object visit(Inegalite inegalite, Object data);

    Object visit(Plusgrandegalque plusgrandegalque, Object data);

    Object visit(Plusgrandque plusgrandque, Object data);

    Object visit(Pluspetitegalque pluspetitegalque, Object data);

    Object visit(Pluspetitque pluspetitque, Object data);
}
