public class Etudiant {
    private int id;
    private  String nom , prenom ;

    public Etudiant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }


    @Override
    public boolean equals(Object obj) {
        return ((Etudiant)obj).id == this.id;

    }

    @Override
    public String toString() {
        return ("Student:"+this.id+"\n"+"name:"+this.nom+"\n"+"prenom: "+this.prenom);

    }
}
