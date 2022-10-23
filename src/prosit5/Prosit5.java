package prosit5;

import java.text.ParseException;


public class Prosit5 {

    public static void main(String[] args) throws ParseException {
        Produit P1 = new ProduitFruit(1254, "Fraise", "Inconnu", 1000.0, "01-01-2022", "Mars", (float) 12.3);
        Produit P2 = new ProduitFruit(1224, "Pastèque", "Inconnu", 1000.0, "01-01-2022", "Juin", (float) 50);
        Produit P3 = new ProduitFruit(7896, "Mandarine", "Inconnu", 1000.0, "01-01-2022", "Décembre", (float) 25.6);
        Produit P4 = new ProduitLegume(8521, "Artichauts", "Inconnu", 1000.0, "01-01-2022", "Janvier", (float) 14);

        Magasin M1 = new Magasin(1, "Carrefour", "Centre-Ville");

        M1.ajouterProduit(P1);
        M1.ajouterProduit(P2);
        M1.ajouterProduit(P3);
        M1.ajouterProduit(P4);

        System.out.println("Stock fruit total de Magasin " + M1.getNom() + " : " + M1.calculStock());

        System.out.println("Fruit " + P1.getIdentifiant() + " " + P1.getLibelle()+ " Frais (avec saison Mars) : " + ((ProduitFruit) P1).estFrais("Mars"));
        System.out.println("Fruit " + P1.getIdentifiant() + " " + P1.getLibelle()+ " Frais (avec saison Février) : " + ((ProduitFruit) P1).estFrais("Février"));

        System.out.println("Légume " + P4.getIdentifiant() + " " + P4.getLibelle()+ " Frais (avec saison Mars) : " + ((ProduitLegume) P4).estFrais("Janvier"));
        System.out.println("Légume " + P4.getIdentifiant() + " " + P4.getLibelle()+ " Frais (avec saison Avril) : " + ((ProduitLegume) P4).estFrais("Février"));
        System.out.println("Légume " + P4.getIdentifiant() + " " + P4.getLibelle()+ " Frais (avec saison Mai) : " + ((ProduitLegume) P4).estFrais("Mars"));

    }

}