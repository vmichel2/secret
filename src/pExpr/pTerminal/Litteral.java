package pExpr.pTerminal;

import pVisiteurs.Visiteur;

public class Litteral extends Terminal {

    private String litteral;

    public Litteral(String litteral) {
        this.litteral=litteral;
    }

    public Object Accepte (Visiteur v){
        return v.visit(this);
    }

    public void afficher(String prefixe) {
        System.out.println(prefixe + "Litteral : " + this.litteral);
    }
}