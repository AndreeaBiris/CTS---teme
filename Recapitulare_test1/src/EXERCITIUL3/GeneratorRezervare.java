package EXERCITIUL3;

import java.util.HashMap;
import java.util.Map;

public class GeneratorRezervare {
    private Map<String, Rezervare> rezervari = new HashMap<>();

    GeneratorRezervare() {
        rezervari.put("sala1", new RezervareRestaurant());
    }

    public Rezervare generateRezervare(String sala, String nume, String data) {
        try{
            Rezervare rezervare = rezervari.get(sala).clone();
            rezervare.setNume(nume);
            rezervare.setData(data);
            rezervare.generateRezervare();
            return rezervare;
        } catch (CloneNotSupportedException e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }
}
