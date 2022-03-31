package me.ahmedbargady.vehicule;

public class TestVehicule {
    public static void main(String[] args){
        Camion c1 = new Camion("DAF", 25);
        Camion c2 = new Camion("Volvo", 30);
        Voiture v1 = new Voiture("BMW", "blanche", 250);
        Voiture v2 = new Voiture("Audi", "grise", 300);

        // Description
        c1.afficherDescription(c1.getCapacite());
        c2.afficherDescription(c2.getCapacite());
        v1.afficherDescription(v1.getCouleur());
        v2.afficherDescription(v2.getCouleur());
        // Capacité totale
        System.out.println("La capacité totale est: " + (c1.getCapacite() + c2.getCapacite()));
    }
}
