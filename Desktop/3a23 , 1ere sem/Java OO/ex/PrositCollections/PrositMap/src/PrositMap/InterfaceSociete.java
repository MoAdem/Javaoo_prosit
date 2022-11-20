package PrositMap;

import PrositMap.Employe;

public interface InterfaceSociete {

    public void ajouterEmployeDepartement(Employe e,departement d);
    public void supprimerEmploye(Employe e);
    public void afficherLesEmployesLeursDepartements();
    public void afficherLesEmployes();
    public void afficherLesDepartements();
    public void afficherDepartement(Employe e);
    public boolean rechercherEmploye(Employe e);
    public boolean rechercherDepartement(departement e);

}