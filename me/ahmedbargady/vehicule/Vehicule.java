package me.ahmedbargady.vehicule;

public class Vehicule {
    private String marque;
    private final static int tarif_int = 50;

    public Vehicule(String marque) {
        this.marque = marque;
    }

    public String getMarque() {
        return this.marque;
    }

    public int getTarif() {
        return tarif_int;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double calculerPrix() {
        return 0.0;
    }

    public void afficherDescription() {
    }

}