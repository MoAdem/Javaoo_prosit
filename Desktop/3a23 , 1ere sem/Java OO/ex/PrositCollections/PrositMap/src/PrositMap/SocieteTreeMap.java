package PrositMap ;
import java.util.TreeMap;
public class SocieteTreeMap implements InterfaceSociete{

    TreeMap<Employe, departement> tmap;

    public SocieteTreeMap() {
        tmap = new TreeMap<Employe, departement>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, departement d) {
        tmap.put(e, d);

    }

    @Override
    public void supprimerEmploye(Employe e) {
        tmap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (java.util.Map.Entry<Employe, departement> e : tmap.entrySet()) {
            System.out.println(e);
        }

    }

    @Override
    public void afficherLesEmployes() {
        for (Employe e : tmap.keySet()) {
            System.out.println(e);
        }
    }

    @Override
    public void afficherLesDepartements() {
        for (departement d : tmap.values()) {
            System.out.println(d);
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        System.out.print(tmap.get(e));

    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return tmap.containsKey(e) ;
    }

    @Override
    public boolean rechercherDepartement(departement e) {
        return tmap.containsValue(e) ;
    }

}