package pVisiteurs;

public class FabriqueVisiteurs {

    public FabriqueVisiteurs() {}

    public Visiteur getVisiteur(String typeVisiteur) throws IllegalArgumentException {
        Visiteur visiteur = null;
        switch (typeVisiteur) {
            case "prettyprinter":
                visiteur = PrettyPrinter.getInstance();
                break;
            case "validateur":
                visiteur = Validateur.getInstance();
                break;
            case "evaluateur":
                visiteur = Evaluateur.getInstance();
                break;
            default:
                throw new IllegalArgumentException("Type de visiteur invalide : " + typeVisiteur);
        }
        return visiteur;
    }
}
