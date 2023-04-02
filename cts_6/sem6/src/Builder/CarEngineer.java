package Builder;

public class CarEngineer {
    private CarBuilder builder;

    CarEngineer(CarBuilder builder) {
        this.builder = builder;
    }

    public void buildCar(){
        builder.buildSasiu();
        builder.buildMotor();
        builder.buildDesignInterior();
        builder.buildRoti();
        if(builder instanceof ElectricCarBuilder){
            ((ElectricCarBuilder) builder).buildIncarcator();
        }
        else{
            ((RegularCarBuilder) builder).buildAditivi();
        }
    }

    public Car getCar(){
        return builder.getCar();
    }
}
