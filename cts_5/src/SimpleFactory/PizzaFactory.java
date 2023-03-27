package SimpleFactory;

public class PizzaFactory {
    public static Pizza createPizza(PizzaType pizzaType) throws Exception {
        switch (pizzaType) {
            case Cheese:
                return new CheesePizza();
            case Pepperoni:
                return new PepperoniPizza();
            case Margherita:
                return new MargheritaPizza();
            default:
                throw new Exception("Tipul primit este incorect");
        }
    }
}