package pExpr.pTerminal;

public class Litteral extends Terminal {

    private String litteral;

    public Litteral(String litteral) {
        this.litteral=litteral;
    }

    public void afficher(String prefixe) {
        System.out.println(prefixe + "Litteral : " + this.litteral);
    }
}