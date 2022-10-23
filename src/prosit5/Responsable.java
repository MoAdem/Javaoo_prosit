package prosit5;

public class Responsable extends Employe {

    private float prime;

    public Responsable(int identifiant, String nom, String adresse, int nbr_heures, float prime) {
        super(identifiant, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    public void AfficherDetails() {
        System.out.println(this.getIdentifiant() + ", " + this.getNom() + ", " + this.getAdresse() + ", " + this.getNbr_heures() + ", " + this.prime);
    }

    public void AfficherSalaire() {

        if (this.getNbr_heures() > 160) {
            System.out.println("la salaire de l'employe responsable est: " + this.getIdentifiant() + " ''" + this.getNom() + " '': " + ((160 * 10) + this.prime + ((this.getNbr_heures() - 160) * 12)));
        } else {
            System.out.println("la salaire de l'employe responsable est: " + this.getIdentifiant() + " ''" + this.getNom() + " '': " + ((this.getNbr_heures() * 10) + this.prime));
        }

    }
}
