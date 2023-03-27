package SimpleFactory;

public class PepperoniPizza implements Pizza{
    public PepperoniPizza() { }
    @Override
    public void getTopping() {
        System.out.println("Pepperoni pizza");
    }
}
