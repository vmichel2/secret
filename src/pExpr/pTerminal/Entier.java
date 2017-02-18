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

    public Object Accepte (Visiteur v, Object data){
        return v.visit(this, data);
    }
    public void afficher(String prefixe) {
        System.out.println(prefixe + "Entier : " + this.entier);
    }

}