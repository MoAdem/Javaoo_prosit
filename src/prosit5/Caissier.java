package prosit5;

public class Caissier extends Employe {

    private int numeroDeCaisse;

    public Caissier(int identifiant, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(identifiant, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    public void AfficherDetails() {
        System.out.println(this.getIdentifiant() + ", " + this.getNom() + ", " + this.getAdresse() + ", " + this.getNbr_heures() + ", " + this.numeroDeCaisse);
    }

    public void AfficherSalaire() {
        if (this.getNbr_heures() > 180) {
            System.out.println("la salaire de l'employe caissier est: " + this.getIdentifiant() + " ''" + this.getNom() + " '': " + ((180 * 5)+ ((this.getNbr_heures() - 180) * 11.5)));
        } else {
            System.out.println("la salaire de l'employe caissier est :" + this.getIdentifiant() + " ''" + this.getNom() + " '': " + ((this.getNbr_heures() * 5) ));
        }

    }
}
