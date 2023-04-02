package EXERCITIUL4;

public class RezervareClientBuilder implements RezervareBuilder{
    private Rezervare rezervare;
    RezervareClientBuilder() {
        this.rezervare = new RezervareClient();
    }

    @Override
    public void buildNume() {
        this.rezervare.setNume("Nume client");
    }

    @Override
    public void buildNrPersoane() {
        this.rezervare.setNrPersoane(8);
    }

    void buildAsezareLaGeam() {
        ((RezervareClient)rezervare).setAseazareLaGeam(true);
    }

    void buildScauneErgonomice() {
        ((RezervareClient)rezervare).setScauneErgonomice(false);
    }

    void buildDecorareMasa() {
        ((RezervareClient)rezervare).setDecorareMasa(true);
    }
    void buildMuzicaAmbientala() {
        ((RezervareClient)rezervare).setMuzicaAmbientala(false);
    }
    void buildGenMuzica() {
        ((RezervareClient)rezervare).setGenMuzica("Muzica usoara");
    }

    @Override
    public Rezervare getRezervare() {
        return this.rezervare;
    }
}
