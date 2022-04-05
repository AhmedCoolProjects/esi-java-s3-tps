package me.ahmedbargady.vehicule;

public class TestVehicule {
    public static void main(String[] args) {
        Camion c1 = new Camion("DAF", 25);
        Camion c2 = new Camion("Volvo", 30);
        Voiture v1 = new Voiture("BMW", "blanche", 250);
        Voiture v2 = new Voiture("Audi", "grise", 300);
        // afficher
        Vehicule[] vehicules = { c1, c2, v1, v2 };
        for (Vehicule v : vehicules) {
            v.afficherDescription();
        }
        // Capacité totale
        int capaciteTotale = 0;
        Camion[] l = { c1, c2 };
        for (Camion c : l) {
            capaciteTotale += c.getCapacite();
        }

        System.out.println("la capacité totale est: " + capaciteTotale);

    }
}
