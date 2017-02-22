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

public abstract class Visiteur {

    private static Visiteur instance = null;

    protected Visiteur() {}

    public synchronized static Visiteur getInstance() { return null; }

    public abstract Object visit(Litteral litteral, Object data);

    public abstract Object visit(Entier entier, Object data);

    public abstract Object visit(Booleen booleen, Object data);

    public abstract Object visit(Etlogique etlogique, Object data);

    public abstract Object visit(IlExiste ilExiste, Object data);

    public abstract Object visit(Non non, Object data);

    public abstract Object visit(Oulogique oulogique, Object data);

    public abstract Object visit(QuelqueSoit quelqueSoit, Object data);

    public abstract Object visit(InclusStricteDans inclusStricteDans, Object data);

    public abstract Object visit(InclusDans inclusDans, Object data);

    public abstract Object visit(AppartientA appartientA, Object data);

    public abstract Object visit(Plus plus, Object data);

    public abstract Object visit(Moins moins, Object data);

    public abstract Object visit(Cardinalite cardinalite, Object data);

    public abstract Object visit(Ensemble ensemble, Object data);

    public abstract Object visit(Inegal inegal, Object data);

    public abstract Object visit(Egal egal, Object data);

    public abstract Object visit(Egalite egalite, Object data);

    public abstract Object visit(Inegalite inegalite, Object data);

    public abstract Object visit(Plusgrandegalque plusgrandegalque, Object data);

    public abstract Object visit(Plusgrandque plusgrandque, Object data);

    public abstract Object visit(Pluspetitegalque pluspetitegalque, Object data);

    public abstract Object visit(Pluspetitque pluspetitque, Object data);
}
