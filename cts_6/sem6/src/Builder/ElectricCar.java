package Builder;

public class ElectricCar implements Car{
    private String roti;
    private String sasiu;
    private String motor;
    private String designInterior;
    private String incarcator; // suplimentar

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

    public void setIncarcator(String incarcator) {
        this.incarcator = incarcator;
    }

    @Override
    public String showDetails() {
        return "ElectricCar{" +
                "roti='" + roti + '\'' +
                ", sasiu='" + sasiu + '\'' +
                ", motor='" + motor + '\'' +
                ", designInterior='" + designInterior + '\'' +
                ", incarcator='" + incarcator + '\'' +
                '}';
    }
}
