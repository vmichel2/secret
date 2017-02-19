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

import java.util.ArrayList;

public class Evaluateur implements Visiteur {


    @Override
    public Object visit(Litteral litteral, Object data) {
        return litteral.getLitteral();
    }

    @Override
    public Object visit(Entier entier, Object data) {
        return entier.getEntier();
    }

    @Override
    public Object visit(Booleen booleen, Object data) {
        return booleen.getBooleen();
    }

    @Override
    public Object visit(Etlogique etlogique, Object data) {
        return ((Boolean) etlogique.getExpr().Accepte(this, data) && (Boolean) etlogique.getExpr2().Accepte(this, data));
    }

    //Todo
    @Override
    public Object visit(IlExiste ilExiste, Object data) {
        return true;
    }

    @Override
    public Object visit(Non non, Object data) {
        return !((Boolean) non.getExpr().Accepte(this, data));
    }

    @Override
    public Object visit(Oulogique oulogique, Object data) {
        return ((Boolean) oulogique.getExpr().Accepte(this, data) && (Boolean) oulogique.getExpr2().Accepte(this, data));

    }

    //Todo
    @Override
    public Object visit(QuelqueSoit quelqueSoit, Object data) {
        return true;
    }


    @Override
    public Object visit(InclusStricteDans inclusStricteDans, Object data) {
        Ensemble ensg = (Ensemble)inclusStricteDans.getExpr();
        Ensemble ensd = (Ensemble)inclusStricteDans.getExpr2();

        ArrayList<Integer> ensemblegauche = new ArrayList<Integer>();
        ArrayList<Integer> ensembledroite = new ArrayList<Integer>();


        for (Expression e : (ensg.getEnsemble())){
            ensemblegauche.add(((Entier) e).getEntier());
        }

        for (Expression e : (ensd.getEnsemble())){
            ensembledroite.add (((Entier)e).getEntier());
        }

        // l'inclusion stricte implique que les ensembles ne sont pas égaux !
        if (ensemblegauche.equals(ensembledroite)){
            return false;
        }

        // si on trouve un élément qui n'est pas dans l'autre ensemble, bingo ils sont inégaux
        for (Integer e : ensemblegauche) {
            if (!(ensembledroite.contains(e)))
                return false;
        }


        return true;
    }


    @Override
    public Object visit(InclusDans inclusDans, Object data) {

        Ensemble ensg = (Ensemble)inclusDans.getExpr();
        Ensemble ensd = (Ensemble)inclusDans.getExpr2();

        ArrayList<Integer> ensemblegauche = new ArrayList<Integer>();
        ArrayList<Integer> ensembledroite = new ArrayList<Integer>();


        for (Expression e : (ensg.getEnsemble())){
            ensemblegauche.add(((Entier) e).getEntier());
        }

        for (Expression e : (ensd.getEnsemble())){
            ensembledroite.add (((Entier)e).getEntier());
        }

        // si on trouve un élément qui n'est pas dans l'autre ensemble, bingo ils sont inégaux
        for (Integer e : ensemblegauche) {
            if (!(ensembledroite.contains(e)))
                return false;
        }


        return true;
    }


    @Override
    public Object visit(AppartientA appartientA, Object data) {
        Entier entiergauche = (Entier) appartientA.getExpr();

        //traduction du tableau d'Entier en tableau d'Integer
        Ensemble ens = (Ensemble)appartientA.getExpr2();
        ArrayList<Integer> ensemble = new ArrayList<Integer>();
        for (Expression e : (ens.getEnsemble())){
            ensemble.add(((Entier) e).getEntier());
        }


        //si le tableau d'entier contient l'entier à gauche, on renvoie true
        return ensemble.contains(entiergauche.getEntier());
    }

    @Override
    public Object visit(Plus plus, Object data) {
        return (Integer) plus.getExpr().Accepte(this, data) + (Integer) plus.getExpr2().Accepte(this, data);
    }


    @Override
    public Object visit(Moins moins, Object data) {
        return (Integer) moins.getExpr().Accepte(this, data) - (Integer) moins.getExpr2().Accepte(this, data);

    }

    @Override
    public Object visit(Cardinalite cardinalite, Object data) {
        return ((Expression[])cardinalite.getExpr().Accepte(this, data)).length;
    }


    @Override
    public Object visit(Ensemble ensemble, Object data) {
        return ensemble.getEnsemble();
    }

    @Override
    public Object visit(Inegal inegal, Object data) {
        // ensemblegauche.equals(ensembledroite) ne marchant pas, nous allons devoir voir si les deux ensembles sont égaux

        Ensemble ensg = (Ensemble)inegal.getExprg();
        Ensemble ensd = (Ensemble)inegal.getExprd();

        ArrayList<Integer> ensemblegauche = new ArrayList<Integer>();
        ArrayList<Integer> ensembledroite = new ArrayList<Integer>();


        for (Expression e : (ensg.getEnsemble())){
            ensemblegauche.add(((Entier) e).getEntier());
        }

        for (Expression e : (ensd.getEnsemble())){
            ensembledroite.add (((Entier)e).getEntier());
        }

        // si on trouve un élément qui n'est pas dans l'autre ensemble, bingo ils sont inégaux
        for (Integer e : ensemblegauche) {
            if (!(ensembledroite.contains(e)))
                return true;
        }

        for (Integer e : ensembledroite) {
            if (!(ensemblegauche.contains(e)))
                return true;
        }


        return false;
    }


    @Override
    public Object visit(Egal egal, Object data) {
        // ensemblegauche.equals(ensembledroite) ne marchant pas, nous allons devoir voir si les deux ensembles sont égaux

        Ensemble ensg = (Ensemble)egal.getExprg();
        Ensemble ensd = (Ensemble)egal.getExprd();

        ArrayList<Integer> ensemblegauche = new ArrayList<Integer>();
        ArrayList<Integer> ensembledroite = new ArrayList<Integer>();


        for (Expression e : (ensg.getEnsemble())){
            ensemblegauche.add(((Entier) e).getEntier());
        }

        for (Expression e : (ensd.getEnsemble())){
            ensembledroite.add (((Entier)e).getEntier());
        }

        // si on trouve un élément qui n'est pas dans l'autre ensemble, bingo ils sont inégaux
        for (Integer e : ensemblegauche) {
            if (!(ensembledroite.contains(e)))
                return false;
        }

        for (Integer e : ensembledroite) {
            if (!(ensemblegauche.contains(e)))
                return false;
        }


        return true;
    }


    @Override
    public Object visit(Egalite egalite, Object data) {
        return egalite.getExprg().equals(egalite.getExprd());

    }

    @Override
    public Object visit(Inegalite inegalite, Object data) {
        return !(inegalite.getExprg().equals(inegalite.getExprd()));
    }


    @Override
    public Object visit(Plusgrandegalque plusgrandegalque, Object data) {
        return (Integer) plusgrandegalque.getExprg().Accepte(this, data) >= (Integer) plusgrandegalque.getExprd().Accepte(this, data);
    }


    @Override
    public Object visit(Plusgrandque plusgrandque, Object data) {
        return (Integer) plusgrandque.getExprg().Accepte(this, data) >= (Integer) plusgrandque.getExprd().Accepte(this, data);

    }

    @Override
    public Object visit(Pluspetitegalque pluspetitegalque, Object data) {
        return (Integer) pluspetitegalque.getExprg().Accepte(this, data) <= (Integer) pluspetitegalque.getExprd().Accepte(this, data);

    }

    @Override
    public Object visit(Pluspetitque pluspetitque, Object data) {
        return (Integer) pluspetitque.getExprg().Accepte(this, data) < (Integer) pluspetitque.getExprd().Accepte(this, data);

    }
}
