
package PrositSet;

import java.util.HashSet;

public class EspritHashSet implements GestionEnseignant {

    HashSet<Enseignant> hset;

    public EspritHashSet() {
        this.hset = new HashSet();
    }

    @Override
    public void ajouterEnseignant(Enseignant e) {
        hset.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return hset.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        boolean x = false;
        for (Enseignant r : hset) {
            if (r.getId() == id) {
                x = true;
            } else {
                x = false;
            }
        };
        return x;
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        hset.remove(e);
    }

    @Override
    public void displayEnseignants() {
        System.out.println(hset);
    }

}