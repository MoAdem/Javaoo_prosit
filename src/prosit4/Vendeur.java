package prosit4;

public class Vendeur extends Employe {

    private float tauxDeVente;

    public Vendeur(int identifiant, String nom, String adresse, int nbr_heures, float tauxDeVente) {
        super(identifiant, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    public void AfficherDetails() {
        System.out.println(this.getIdentifiant() + ", " + this.getNom() + ", " + this.getAdresse() + ", " + this.getNbr_heures() + ", " + this.tauxDeVente);
    }

    public void AfficherSalaire() {

        System.out.println("la salaire de l'employe vendeur est : " + this.getIdentifiant() + " ''" + this.getNom() + " '': " + ((450 * (1 + (this.tauxDeVente / 100)))));


    }
}
