package EXERCITIUL1;

public class MegaBurger implements Burger{
    private String tipChifla;
    private String carne;
    private String sos;
    private String legume;
    private String condimente;
    private double pretExtra;

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

    public void setPretExtra(double pretExtra) {
        this.pretExtra = pretExtra;
    }

    @Override
    public String showDetails() {
        return "MegaBurger{" +
                "tipChifla='" + tipChifla + '\'' +
                ", carne='" + carne + '\'' +
                ", sos='" + sos + '\'' +
                ", legume='" + legume + '\'' +
                ", condimente='" + condimente + '\'' +
                ", pretExtra=" + pretExtra +
                '}';
    }
}
