package Builder;

public class BuilderMain {
    public static void main(String[] args){
        //Electric Car
        CarBuilder builder = new ElectricCarBuilder();
        CarEngineer inginer = new CarEngineer(builder);
        inginer.buildCar();
        Car masina = inginer.getCar();
        System.out.println(masina.showDetails());

        //Regular Car
        CarBuilder builder1 = new RegularCarBuilder();
        CarEngineer inginer1 = new CarEngineer(builder1);
        inginer1.buildCar();
        Car masina1 = inginer1.getCar();
        System.out.println(masina1.showDetails());
    }
}
