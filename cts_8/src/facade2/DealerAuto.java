package facade2;

public class DealerAuto {
    private MasinaFamilie masinaFamilie;
    private MasinaSport masinaSport;
    private MasinaElectrica masinaElectrica;
    public DealerAuto() {
        masinaElectrica = new MasinaElectrica("Masina electrica");
        masinaSport = new MasinaSport("Masina sport");
        masinaFamilie = new MasinaFamilie("Masina familie");
    }

    public String descriereMasinaSport(){
        return masinaSport.descriere();
    }
    public String descriereMasinaFamilie(){
        return masinaFamilie.descriere();
    }
    public String descriereMasinaElectrica(){
        return masinaElectrica.descriere();
    }
}