package me.ahmedbargady.vehicule;

public class Camion extends Vehicule {
    private int capacite;

    public Camion(String marque, int capacite) {
        super(marque);
        this.capacite = capacite;
    }

    public int getCapacite() {
        return this.capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void afficherDescription() {
        System.out.println(
                "Je suis une camion de marque " + getMarque() + ". Ma capacité est " + capacite + " mètre cube.");
    }

}
