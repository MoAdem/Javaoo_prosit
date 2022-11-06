import java.util.ArrayList;
import java.util.Collections;

public class EspritArrayList implements University {
    ArrayList<Etudiant> list ;

    @Override
    public void ajouterEtudiant(Etudiant e) {
        list.add(e) ;
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return list.contains(e) ;
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        return list.contains(nom) ;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        list.remove(e) ;
    }

    @Override
    public void displayEtudiants() {
        System.out.println(list);
    }

    @Override
    public void trierEtudiantsParId() {
        Collections.sort(list);
    }

    @Override
    public void trierEtudiantsParNom() {
        Collections.sort(list,String) ;
    }



}