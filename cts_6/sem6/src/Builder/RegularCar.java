package Builder;

public class RegularCar implements Car{
    private String roti;
    private String sasiu;
    private String motor;
    private String designInterior;
    private String aditivi; // suplimentar

    public void setRoti(String roti) {
        this.roti = roti;
    }

    public void setSasiu(String sasiu) {
        this.sasiu = sasiu;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setDesignInterior(String designInterior) {
        this.designInterior = designInterior;
    }

    public void setAditivi(String aditivi) {
        this.aditivi = aditivi;
    }

    @Override
    public String showDetails() {
        return "RegularCar{" +
                "roti='" + roti + '\'' +
                ", sasiu='" + sasiu + '\'' +
                ", motor='" + motor + '\'' +
                ", designInterior='" + designInterior + '\'' +
                ", aditivi='" + aditivi + '\'' +
                '}';
    }
}
