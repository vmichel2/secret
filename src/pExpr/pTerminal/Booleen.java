package pExpr.pTerminal;

public class Booleen extends Terminal {

    private boolean booleen;

    public Booleen(boolean booleen) {
        this.booleen=booleen;
    }

    public void afficher(String prefixe) {
        System.out.println(prefixe + "Booléen : " + this.booleen);
    }

}


