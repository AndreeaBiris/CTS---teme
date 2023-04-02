package Builder;

public class RegularCarBuilder implements CarBuilder{

    private Car m;

    RegularCarBuilder() {
        this.m = new RegularCar();
    }

    @Override
    public void buildSasiu() {
        this.m.setSasiu("Sasiu de masina normala");
    }

    @Override
    public void buildRoti() {
        this.m.setRoti("Roti de masina normala");
    }

    @Override
    public void buildMotor() {
        this.m.setMotor("Motor de masina normala");
    }

    @Override
    public void buildDesignInterior() {
        this.m.setDesignInterior("Interior de masina normala");
    }

    public void buildAditivi(){
        ((RegularCar)m).setAditivi("Aditivi");
    }

    @Override
    public Car getCar() {
        return this.m;
    }
}
