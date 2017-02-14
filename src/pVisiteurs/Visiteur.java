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
    Object visit(Litteral litteral);

    Object visit(Entier entier);

    Object visit(Booleen booleen);

    Object visit(Etlogique etlogique);

    Object visit(IlExiste ilExiste);

    Object visit(Non non);

    Object visit(Oulogique oulogique);

    Object visit(QuelqueSoit quelqueSoit);

    Object visit(InclusStricteDans inclusStricteDans);

    Object visit(InclusDans inclusDans);

    Object visit(AppartientA appartientA);

    Object visit(Plus plus);

    Object visit(Moins moins);

    Object visit(Cardinalite cardinalite);

    Object visit(Ensemble ensemble);

    Object visit(Inegal inegal);

    Object visit(Egal egal);

    Object visit(Egalite egalite);

    Object visit(Inegalite inegalite);

    Object visit(Plusgrandegalque plusgrandegalque);

    Object visit(Plusgrandque plusgrandque);

    Object visit(Pluspetitegalque pluspetitegalque);

    Object visit(Pluspetitque pluspetitque);
}
