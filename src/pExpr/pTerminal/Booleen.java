package pExpr.pTerminal;

import pVisiteurs.Visiteur;

public class Booleen extends Terminal {

    private boolean booleen;

    public Booleen(boolean booleen) {
        this.booleen=booleen;
    }

    public Object Accepte (Visiteur v){
        return v.visit(this);
    }
    public void afficher(String prefixe) {
        System.out.println(prefixe + "Booléen : " + this.booleen);
    }

}


