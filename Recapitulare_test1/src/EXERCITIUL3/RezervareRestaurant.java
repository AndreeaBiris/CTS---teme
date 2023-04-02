package EXERCITIUL3;

public class RezervareRestaurant implements Rezervare {
    private String nume;
    private String data;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void generateRezervare(){
        System.out.println("Rezervarea de pe numele: " + nume + " se face pe data de: " + data);
    }

    @Override
    public Rezervare clone() throws CloneNotSupportedException{
        return (RezervareRestaurant) super.clone();
    }
}
