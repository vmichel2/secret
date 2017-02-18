package pExpr.pTerminal;

import pVisiteurs.Visiteur;

public class Booleen extends Terminal {

    private boolean booleen;

    public Booleen(boolean booleen) {
        this.booleen=booleen;
    }

    public boolean getBooleen() {
        return booleen;
    }

    public Object Accepte (Visiteur v, Object data){
        return v.visit(this, data);
    }
    public void afficher(String prefixe) {
        System.out.println(prefixe + "Booléen : " + this.booleen);
    }

}


