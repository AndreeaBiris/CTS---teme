package EXERCITIUL3;

public class PrototypeMain {

//    Restaurantul dorește să implementeze un modul în cadrul aplicației, astfel încât dacă un client a
//    mai fost la restaurant și revine pentru a fi realiza o rezervare aici să nu fie necesară reconstruirea
//    unui cont respectivului client, deoarece prin construire clientului durează foarte mult

    public static void main(String[] args){
        GeneratorRezervare generatorRezervare = new GeneratorRezervare();
        Rezervare rezervare = generatorRezervare.generateRezervare("sala1", "Popescu Maria", "Miercuri");

    }

}
