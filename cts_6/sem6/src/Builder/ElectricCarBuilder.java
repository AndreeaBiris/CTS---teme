package Builder;

public class ElectricCarBuilder implements CarBuilder{
    private Car car;

    ElectricCarBuilder() {
        this.car = new ElectricCar();
    }

    @Override
    public void buildSasiu() {
        this.car.setSasiu("Sasiu de masina electrica");
    }

    @Override
    public void buildRoti() {
        this.car.setRoti("Roti de masina electrica");
    }

    @Override
    public void buildMotor() {
        this.car.setMotor("Motor de masina electrica");
    }

    @Override
    public void buildDesignInterior() {
        this.car.setSasiu("Interior de masina electrica");
    }

    public void buildIncarcator(){
        ((ElectricCar)car).setIncarcator("Incarcator");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
