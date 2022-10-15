package prosit4;

public class Prosit4 {

    public static void main(String[] args) {


        Magasin mg1 = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin mg2 = new Magasin(2, "Monoprix", "Menzah 6");


        Caissier c1 = new Caissier(1111111, "adem", "Tunis", 150,2);
        Caissier c2 = new Caissier(2222222, "ahmed", "ariana", 150, 3);
        Vendeur v1 = new Vendeur(3333333, "mehdi", "manouba", 160, 130);
        Responsable r1 = new Responsable(44444444, "dhia", "Bir Bai", 130, 30);

        Caissier c3 = new Caissier(55555555, "lina", "Tunis", 140, 1);
        Vendeur v2 = new Vendeur(6666666, "ranim", "manouba", 80, 30);
        Vendeur v3 = new Vendeur(7777777, "ahmed", "Tunis", 99, 15);
        Vendeur v4 = new Vendeur(8888888, "khalil", "arina", 89, 10);
        Responsable r2 = new Responsable(9999999, "ihab", "ghazala", 160, 20);

        mg1.ajouterEmployee(c1);
        mg1.ajouterEmployee(c2);
        mg1.ajouterEmployee(v1);
        mg1.ajouterEmployee(r1);

        mg2.ajouterEmployee(c3);
        mg2.ajouterEmployee(v2);
        mg2.ajouterEmployee(v3);
        mg2.ajouterEmployee(v4);
        mg2.ajouterEmployee(r2);


        mg1.ajouterProduit(1, "water", "sabrine", 1200, "8-8-2025");
        mg1.ajouterProduit(2, "chocola", "Said", 400, "8-8-2025");

        mg2.ajouterProduit(5, "lait", "delice", 2000, "9-9-2025");
        mg2.ajouterProduit(7, "Yagourt", "delice", 450, "9-9-2025");

        System.out.println("les détails de chaque magasin :");
     mg1.afficherChara();
   mg2.afficherChara();
 System.out.println("nombre total des produits dans tous magasin : " + Magasin.nbrProduits);

System.out.println("les salaires des employés :");
        c1.AfficherSalaire();
        c2.AfficherSalaire();
        v1.AfficherSalaire();
        r1.AfficherSalaire();
        c3.AfficherSalaire();
        v2.AfficherSalaire();
        v3.AfficherSalaire();
        v4.AfficherSalaire();
        r2.AfficherSalaire();

    }
}

