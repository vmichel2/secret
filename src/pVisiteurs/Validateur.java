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

import java.util.ArrayList;

public class Validateur implements Visiteur {

    /*
    Data contient le type de l'objet retourné par le visiteur, par exemple si on a un " true - 42 ", le visiteur renverra :
    "booleen" - "entier" pour chacunes des feuilles, puis ERROR pour la soustraction en elle même,
    car on ne peut pas soustraire un entier à un booléen, le code ERROR remontera jusqu'au noeud racine.
     */



    @Override
    public Object visit(Litteral litteral, Object data) {
        return "litteral";
    }

    @Override
    public Object visit(Entier entier, Object data) {
        return "entier";
    }

    @Override
    public Object visit(Booleen booleen, Object data) {
        return "booleen";
    }

    @Override
    public Object visit(Etlogique etlogique, Object data) {

        if (etlogique.getExpr().Accepte(this, data)=="booleen" &&
            etlogique.getExpr2().Accepte(this, data)=="booleen") {
            return "booleen";
        }
        return "ERROR";
    }

    //Todo
    @Override
    public Object visit(IlExiste ilExiste, Object data) {
        return "booleen";
    }

    @Override
    public Object visit(Non non, Object data) {
        if (non.getExpr().Accepte(this, data)=="booleen" ) {
            data = "booleen";
        }else {
            data = "ERROR";
        }
        return data;
    }

    @Override
    public Object visit(Oulogique oulogique, Object data) {
        if (oulogique.getExpr().Accepte(this, data)=="booleen" &&
            oulogique.getExpr2().Accepte(this, data)=="booleen") {
            return "booleen";
        }
        return "ERROR";
    }

    //Todo
    @Override
    public Object visit(QuelqueSoit quelqueSoit, Object data) {
        return "booleen";
    }


    @Override
    public Object visit(InclusStricteDans inclusStricteDans, Object data) {
        if (inclusStricteDans.getExpr().Accepte(this,data)=="ensemble" &&
            inclusStricteDans.getExpr2().Accepte(this,data)=="ensemble"){
                return "booleen";
        }
        return "ERROR";

    }


    @Override
    public Object visit(InclusDans inclusDans, Object data) {
        if (inclusDans.getExpr().Accepte(this,data)=="ensemble" &&
            inclusDans.getExpr2().Accepte(this,data)=="ensemble"){
            return "booleen";
        }
        return "ERROR";
    }


    @Override
    public Object visit(AppartientA appartientA, Object data) {
        ArrayList terminaux= new ArrayList<String>();
        terminaux.add("litteral");
        terminaux.add("entier");
        terminaux.add("booleen");
        if (terminaux.contains(appartientA.getExpr().Accepte(this,data)) && // si on a bien un terminal à gauche
            appartientA.getExpr2().Accepte(this,data)=="ensemble"){
            return "booleen";
        }
        return "ERROR";
    }

    @Override
    public Object visit(Plus plus, Object data) {
        ArrayList intorstr= new ArrayList<String>();
        intorstr.add("litteral");
        intorstr.add("entier");
        if(intorstr.contains(plus.getExpr().Accepte(this,data)) &&
           intorstr.contains(plus.getExpr2().Accepte(this,data))){
            return "entier";
        }
        return "ERROR";
    }


    @Override
    public Object visit(Moins moins, Object data) {
        ArrayList intorstr= new ArrayList<String>();
        intorstr.add("litteral");
        intorstr.add("entier");
        if(intorstr.contains(moins.getExpr().Accepte(this,data)) &&
           intorstr.contains(moins.getExpr2().Accepte(this,data))){
            return "entier";
        }
        return "ERROR";
    }

    @Override
    public Object visit(Cardinalite cardinalite, Object data) {
        if (cardinalite.getExpr().Accepte(this,data)=="ensemble") {
            return "entier";
        }
        return "ERROR";
    }

    @Override
    public Object visit(Ensemble ensemble, Object data) {
            for (Expression e : ensemble.getEnsemble()){
                if (!( e.Accepte(this,data)=="entier")){
                    return "ERROR";
                }
            }
            return "ensemble";
    }

    @Override
    public Object visit(Inegal inegal, Object data) {
        ArrayList intorstr= new ArrayList<String>();
        intorstr.add("litteral");
        intorstr.add("entier");
        if(intorstr.contains(inegal.getExprg().Accepte(this,data)) &&
                intorstr.contains(inegal.getExprd().Accepte(this,data))){
            return "booleen";
        }
        return "ERROR";
    }

    @Override
    public Object visit(Egal egal, Object data) {
        if (egal.getExprg().Accepte(this,data)=="ensemble" &&
            egal.getExprd().Accepte(this,data)=="ensemble") {
            return "booleen";
        }
        return "ERROR";
    }

    @Override
    public Object visit(Egalite egalite, Object data) {
        ArrayList intorstrorens= new ArrayList<String>();
        intorstrorens.add("litteral");
        intorstrorens.add("entier");
        intorstrorens.add("ensemble");
        if(egalite.getExprg().Accepte(this,data)=="litteral" &&
           intorstrorens.contains(egalite.getExprd().Accepte(this,data))){
            return "booleen";
        }
        return "ERROR";
    }

    @Override
    public Object visit(Inegalite inegalite, Object data) {
        ArrayList intorstr= new ArrayList<String>();
        intorstr.add("litteral");
        intorstr.add("entier");
        if(intorstr.contains(inegalite.getExprg().Accepte(this,data)) &&
                intorstr.contains(inegalite.getExprd().Accepte(this,data))){
            return "booleen";
        }
        return "ERROR";
    }

    @Override
    public Object visit(Plusgrandegalque plusgrandegalque, Object data) {
        ArrayList intorstr= new ArrayList<String>();
        intorstr.add("litteral");
        intorstr.add("entier");
        if(intorstr.contains(plusgrandegalque.getExprg().Accepte(this,data)) &&
           intorstr.contains(plusgrandegalque.getExprd().Accepte(this,data))){
            return "booleen";
        }
        return "ERROR";
    }


    @Override
    public Object visit(Plusgrandque plusgrandque, Object data) {
        ArrayList intorstr= new ArrayList<String>();
        intorstr.add("litteral");
        intorstr.add("entier");
        if(intorstr.contains(plusgrandque.getExprg().Accepte(this,data)) &&
                intorstr.contains(plusgrandque.getExprd().Accepte(this,data))){
            return "booleen";
        }
        return "ERROR";
    }

    @Override
    public Object visit(Pluspetitegalque pluspetitegalque, Object data) {
        ArrayList intorstr= new ArrayList<String>();
        intorstr.add("litteral");
        intorstr.add("entier");
        if(intorstr.contains(pluspetitegalque.getExprg().Accepte(this,data)) &&
                intorstr.contains(pluspetitegalque.getExprd().Accepte(this,data))){
            return "booleen";
        }
        return "ERROR";
    }

    @Override
    public Object visit(Pluspetitque pluspetitque, Object data) {
        ArrayList intorstr= new ArrayList<String>();
        intorstr.add("litteral");
        intorstr.add("entier");
        if(intorstr.contains(pluspetitque.getExprg().Accepte(this,data)) &&
                intorstr.contains(pluspetitque.getExprd().Accepte(this,data))){
            return "booleen";
        }
        return "ERROR";    }
}
