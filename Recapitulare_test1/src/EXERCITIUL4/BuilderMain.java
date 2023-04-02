package EXERCITIUL4;

public class BuilderMain {
    public static void main(String[] args){
        /* Atunci când un client face o rezervare poate alege una din următoarele opțiuni: așezare la geam,
        scaune ergonomice, decorarea mesei, muzica ambientala personalizata, gen muzica. În cazul în
        care clientul nu specifică vreun element dintre acestea, este setat pe false. Să se implementeze
        modulul care permite crearea de obiecte de tip rezervare cu aceste opțiuni extra */

        RezervareBuilder builder = new RezervareClientBuilder();
        RezervariSistem rezervari = new RezervariSistem(builder);
        rezervari.build();
        Rezervare client = rezervari.getRezervare();
        System.out.println(client.showDetails());

    }
}
