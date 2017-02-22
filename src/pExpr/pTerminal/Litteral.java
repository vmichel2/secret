package pExpr.pTerminal;

import pVisiteurs.Visiteur;

public class Litteral extends Terminal {

    private String litteral;

    public Litteral(String litteral) {
        this.litteral=litteral;
    }

    public Object Accepte (Visiteur v, Object data){
        return v.visit(this, data);
    }

    public void afficher(String prefixe) {
        System.out.println(prefixe + "Litteral : " + litteral);
    }

    public String getLitteral() {
        return litteral;
    }

}