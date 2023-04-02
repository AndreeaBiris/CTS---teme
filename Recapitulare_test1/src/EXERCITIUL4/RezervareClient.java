package EXERCITIUL4;

public class RezervareClient implements Rezervare {
    private String nume;
    private int nrPersoane;
    private boolean aseazareLaGeam;
    private boolean scauneErgonomice;
    private boolean decorareMasa;
    private boolean muzicaAmbientala;
    private String genMuzica;
    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public void setAseazareLaGeam(boolean aseazareLaGeam) {
        this.aseazareLaGeam = aseazareLaGeam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareMasa(boolean decorareMasa) {
        this.decorareMasa = decorareMasa;
    }

    public void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }


    public String showDetails() {
        return "RezervareClient{" +
                "nume='" + nume + '\'' +
                ", nrPersoane='" + nrPersoane + '\'' +
                ", aseazareLaGeam=" + aseazareLaGeam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareMasa=" + decorareMasa +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}

