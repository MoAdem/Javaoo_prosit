package PrositMap;

import java.util.HashMap;
import java.util.Map;


public class SocieteHashMap implements InterfaceSociete {

    HashMap<Employe, departement> hmap;

    public SocieteHashMap() {
        hmap = new HashMap<Employe, departement>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, departement d) {
        hmap.put(e, d);

    }

    @Override
    public void supprimerEmploye(Employe e) {
        hmap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, departement> e : hmap.entrySet()) {
            System.out.println(e);
        }

    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : hmap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (departement d : hmap.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.print(hmap.get(e));

    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return hmap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(departement e) {
        return hmap.containsValue(e);
    }
}