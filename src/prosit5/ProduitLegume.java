package prosit5;

import java.text.ParseException;

public class ProduitLegume extends Produit {

    private String saison;
    private float quantite;

    public ProduitLegume(int identifiant, String libelle, String marque, double prix, String dateexp, String saison, float quantite) throws ParseException {
        super(identifiant, libelle, marque, prix, dateexp);
        this.saison = saison;
        this.quantite = quantite;
    }

    public String getSaison() {
        return this.saison;
    }

    public float getQuantite() {
        return this.quantite;
    }

    public boolean estFrais(String saison) {
        var x = 0;
        var y = 0;
        switch (saison) {
            case "Janvier":
                x = 1;
                break;
            case "Février":
                x = 2;
                break;
            case "Mars":
                x = 3;
                break;
            case "Avril":
                x = 4;
                break;
            case "Mai":
                x = 5;
                break;
            case "Juin":
                x = 6;
                break;
            case "Juillet":
                x = 7;
                break;
            case "Aout":
                x = 8;
                break;
            case "Septembre":
                x = 9;
                break;
            case "Octobre":
                x = 10;
                break;
            case "Novembre":
                x = 11;
                break;
            case "Décembre":
                x = 12;
                break;
        }

        switch (this.saison) {
            case "Janvier":
                y = 1;
                break;
            case "Février":
                y = 2;
                break;
            case "Mars":
                y = 3;
                break;
            case "Avril":
                y = 4;
                break;
            case "Mai":
                y = 5;
                break;
            case "Juin":
                y = 6;
                break;
            case "Juillet":
                y = 7;
                break;
            case "Aout":
                y = 8;
                break;
            case "Septembre":
                y = 9;
                break;
            case "Octobre":
                y = 10;
                break;
            case "Novembre":
                y = 11;
                break;
            case "Décembre":
                y = 12;
                break;
        }

        if (x > y + 1) {
            return false;
        } else {
            return true;
        }
    }
}