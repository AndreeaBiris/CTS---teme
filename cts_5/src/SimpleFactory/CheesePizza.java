package SimpleFactory;

public class CheesePizza implements Pizza{
    public CheesePizza() { }
    @Override
    public void getTopping() {
        System.out.println("Cheese pizza");
    }
}

