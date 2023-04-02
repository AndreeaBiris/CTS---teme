package EXERCITIUL1;

public class ClasicBurger implements Burger{
    private String tipChifla;
    private String carne;
    private String sos;
    private String legume;
    private String condimente;

    private double pretStandard;

    public void setTipChifla(String tipChifla) {
        this.tipChifla = tipChifla;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public void setSos(String sos) {
        this.sos = sos;
    }

    public void setLegume(String legume) {
        this.legume = legume;
    }

    public void setCondimente(String condimente) {
        this.condimente = condimente;
    }

    public void setPretStandard(double pretStandard) {
        this.pretStandard = pretStandard;
    }

    @Override
    public String showDetails() {
        return "ClasicBurger{" +
                "tipChifla='" + tipChifla + '\'' +
                ", carne='" + carne + '\'' +
                ", sos='" + sos + '\'' +
                ", legume='" + legume + '\'' +
                ", condimente='" + condimente + '\'' +
                ", pretStandard=" + pretStandard +
                '}';
    }
}
