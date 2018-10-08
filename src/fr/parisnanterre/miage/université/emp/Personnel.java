package fr.parisnanterre.miage.université.emp;

public abstract class Personnel {


    private String nom;
    private String prenom;
    private String num;

    public Personnel(String nom, String prenom, String num) {
        this.nom = nom;
        this.prenom = prenom;
        this.num = num;
    }
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNum() {
        return num;
    }
}
