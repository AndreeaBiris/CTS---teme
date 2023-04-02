package EXERCITIUL4;

public class RezervariSistem{
    RezervareBuilder builder;

    RezervariSistem(RezervareBuilder builder) {
        this.builder=builder;
    }

    public void build() {
        builder.buildNume();
        builder.buildNrPersoane();
        if (builder instanceof RezervareClientBuilder) {
            ((RezervareClientBuilder) builder).buildDecorareMasa();
            ((RezervareClientBuilder) builder).buildAsezareLaGeam();
            ((RezervareClientBuilder) builder).buildScauneErgonomice();
            ((RezervareClientBuilder) builder).buildMuzicaAmbientala();
            ((RezervareClientBuilder) builder).buildGenMuzica();
        }

    }

    public Rezervare getRezervare() {
        return builder.getRezervare();
    }

}
