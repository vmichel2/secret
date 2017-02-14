package pExpr.pTerminal;

import pVisiteurs.Visiteur;

public class Entier extends Terminal {

    private int entier;

    public Entier(int entier) {
        this.entier=entier;
    }

    public int getEntier() {
        return entier;
    }

    public Object Accepte (Visiteur v){
        return v.visit(this);
    }
    public void afficher(String prefixe) {
        System.out.println(prefixe + "Entier : " + this.entier);
    }

}