package prosit5;

import java.text.ParseException;

public class ProduitFruit extends Produit implements Critere {

    private String saison;
    private float quantite;

    public ProduitFruit(int identifiant, String libelle, String marque, double prix, String dateexp, String saison, float quantite) throws ParseException {
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
        if (saison == this.saison) {
            return true;
        } else {
            return false;
        }
    }
}
