/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mohamed
 */
public class Produit {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateexp;

    public Produit() {
        this.identifiant = 0;

    }

    Produit(int i, String l, String m) {
        this.identifiant = i;
        this.libelle = l;
        this.marque = m;
    }

    Produit(int i, String l, String m, double p) {
        this.identifiant = i;
        this.libelle = l;
        this.marque = m;
        this.prix = p;
    }

    public void AfficherDetails() {
        System.out.println(this.identifiant + ", " + this.libelle + ", " + this.libelle + ", " + this.prix + ", " + this.dateexp);
    }

    public void setPrix(double p) {
        if (p < 0) {
            System.out.print("Prix Négative !");
        } else {
            this.prix = p;
        }
    }

    public String toString() {
        return (this.identifiant + ", " + this.libelle + ", " + this.libelle + ", " + this.prix + ", " + this.dateexp);
    }

    public void setDateexp(String d) throws ParseException {

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date dd = formatter.parse(d);
        this.dateexp = dd;
    }

    public void setDateexp(Date d) {
        this.dateexp = d;
    }

    public double getPrix() {
        return this.prix;
    }

    public Date getDateexp() {
        return dateexp;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getIdentifiant() {
        return this.identifiant;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public String getMarque() {
        return this.marque;
    }

    public static boolean comparer(Produit p1, Produit p2) {
        var x = false;
        if ((p1.getIdentifiant() == p2.getIdentifiant()) && (p1.getLibelle() == p2.getLibelle()) && (p1.getPrix() == p2.getPrix())) {
            x = true;
        }

        return x;
    }

    public boolean comparer(Produit p) {
        var x = false;
        if (this.identifiant == p.getIdentifiant() && (this.libelle == p.getLibelle()) && (this.prix == p.getPrix())) {
            x = true;
        }

        return x;
    }



}
