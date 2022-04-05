package me.ahmedbargady.vehicule;

public class Voiture extends Vehicule {
    private String couleur;
    private int nb_cheveaux;

    public Voiture(String marque, String couleur, int nb_cheveaux) {
        super(marque);
        this.couleur = couleur;
        this.nb_cheveaux = nb_cheveaux;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getNbCheveaux() {
        return nb_cheveaux;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setNbCheveaux(int nb_cheveaux) {
        this.nb_cheveaux = nb_cheveaux;
    }

    public void afficherDescription() {
        System.out.println("Je suis une voiture de marque " + getMarque() + ". Ma couleur est " + couleur);

    }

}
