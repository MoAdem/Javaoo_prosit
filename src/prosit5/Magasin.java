/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prosit5;

public class Magasin {

    private int identifiant;
    private String nom;
    private String addresse;
    private int capacite = 0;
    private int ecapacite = 0;
    private Produit[] ensprod = new Produit[50];
    private Employe[] employes = new Employe[20];
    public static int nbrProduits = 0;

    Magasin(int identifiant, String nom, String addresse) {
        this.identifiant = identifiant;
        this.nom = nom;
        this.addresse = addresse;
    }

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAddresse() {
        return addresse;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public int getCapacite() {
        return capacite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEcapacite() {
        return ecapacite;
    }

    public void setEcapacite(int ecapacite) {
        this.ecapacite = ecapacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void ajouterProduit(Produit q) {
        if (this.capacite < 50) {


            if (chercher(q) == true) {
                System.out.println("Produit Existe !");
            } else {
                this.nbrProduits++;
                this.ensprod[this.capacite] = q;

                this.capacite++;
            }
        } else {
            System.out.println("Capacité Max !");
        }

    }

    public void afficherChara() {
        System.out.println("Magasin no : " + this.identifiant + " | " + this.addresse + " | " + this.capacite);
        System.out.println("ces produits ----- : ");
        for (int i = 0; i <= this.capacite - 1; i++) {
            System.out.println("Produit no : " + this.ensprod[i].getIdentifiant() + " | " + this.ensprod[i].getLibelle() + " | " + this.ensprod[i].getPrix() + " | " + this.ensprod[i].getDateexp());
        }

        System.out.println("ces employes ----- : ");
        for (int i = 0; i <= this.ecapacite - 1; i++) {
            this.employes[i].AfficherDetails() ;

        }
        System.out.println();
    }

    public boolean chercher(Produit p) {
        var x = false;
        if (this.capacite != 0) {
            for (int i = 0; i < this.capacite; i++) {
                x = p.comparer(this.ensprod[i], p);
                if (x == true) {
                    break;
                }
            }
        }
        return x;

    }


    public void supprimerProduit(Produit p) {
        var x = false;
        if (this.capacite != 0) {
            for (int i = 0; i < this.capacite; i++) {
                x = p.comparer(this.ensprod[i], p);
                if (x == true) {
                    for (int j = i; j < this.capacite; j++) {
                        if (j + 1 < this.capacite) {
                            this.ensprod[j] = this.ensprod[j + 1];
                        } else {
                            this.ensprod[j] = null;
                        }

                    }
                    this.capacite--;
                    i = this.capacite;;
                    nbrProduits--;

                }
            }

        }
    }

    public static void comparerMagasin(Magasin p1, Magasin p2) {
        if (p1.getCapacite() > p2.getCapacite()) {
            System.out.println("Magasin " + p1.getIdentifiant() + " ( " + p1.getAddresse() + " ) a plus produits que magasin " + p2.getIdentifiant() + " ( " + p2.getAddresse() + ")");
        } else if (p1.getCapacite() < p2.getCapacite()) {
            System.out.println("Magasin " + p2.getIdentifiant() + " ( " + p2.getAddresse() + " ) a plus produits que magasin " + p1.getIdentifiant() + " ( " + p1.getAddresse() + ")");
        } else {
            System.out.println("Magasin " + p1.getIdentifiant() + " ( " + p1.getAddresse() + " ) a le meme nombre des produits de magasin " + p2.getIdentifiant() + " ( " + p2.getAddresse() + ")");
        }
    }

    public void ajouterEmployee(Employe e){
        if (this.ecapacite < 20) {


            this.employes[this.ecapacite] = e;
            this.ecapacite++;

        } else {
            System.out.println("Capacité Max !");
        }



    }

    public float calculStock() {
        float x = 0 ;
        for (int i = 0; i < this.capacite; i++) {
            if (ensprod[i].determinerTypeProduit() == "Fruit")
            {

                x = x + ((ProduitFruit)ensprod[i]).getQuantite() ;
            }

        }


        return x ;
    }

}