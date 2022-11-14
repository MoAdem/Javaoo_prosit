package PrositSet;

import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant {

    TreeSet <Enseignant> tset ;

    public EspritTreeSet() {
        this.tset = new TreeSet() ;
    }


    @Override
    public void ajouterEnseignant(Enseignant e) {
        tset.add(e);
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return tset.contains(e) ;
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        boolean x = false;
        for (Enseignant r : tset) {
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
        tset.remove(e) ;
    }

    @Override
    public void displayEnseignants() {
        System.out.println(tset) ;
    }

}