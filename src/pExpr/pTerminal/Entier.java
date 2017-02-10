package pExpr.pTerminal;

public class Entier extends Terminal {

    private int entier;

    public Entier(int entier) {
        this.entier=entier;
    }

    public void afficher(String prefixe) {
        System.out.println(prefixe + "Entier : " + this.entier);
    }

}