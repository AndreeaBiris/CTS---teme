import AbstractFactory.Button;
import AbstractFactory.MacGUIFactory;
import AbstractFactory.Menu;
import AbstractFactory.WindowsGUIFactory;
import FactoryMethod.*;
import SimpleFactory.CheesePizza;
import SimpleFactory.MargheritaPizza;
import SimpleFactory.PizzaFactory;
import SimpleFactory.PizzaType;

public class Main {
    public static void main(String[] args) throws Exception {

        //SIMPLE FACTORY
        CheesePizza cheesePizza = null;
        cheesePizza = (CheesePizza) PizzaFactory.createPizza(PizzaType.Cheese);
        cheesePizza.getTopping();

        MargheritaPizza margheritaPizza = null;
        margheritaPizza = (MargheritaPizza) PizzaFactory.createPizza(PizzaType.Margherita);
        margheritaPizza.getTopping();

        //FACTORY METHOD
        DogFactory dogFactory = new DogFactory();
        Dog dog= (Dog) dogFactory.createAnimal();
        dog.makeSound();

        CatFactory catFactory = new CatFactory();
        Cat cat = (Cat) catFactory.createAnimal();
        cat.makeSound();

        GiraffeFactory giraffeFactory = new GiraffeFactory();
        Giraffe giraffe = (Giraffe) giraffeFactory.createAnimal();
        giraffe.makeSound();

        //ABSTRACT FACTORY
        WindowsGUIFactory windowsGUIFactory = new WindowsGUIFactory();
        Button buttonWin = windowsGUIFactory.createButton();
        Menu menuWin = windowsGUIFactory.createMenu();
        buttonWin.showView();
        menuWin.showView();

        MacGUIFactory macGUIFactory = new MacGUIFactory();
        Button buttonMac = macGUIFactory.createButton();
        Menu menuMac = macGUIFactory.createMenu();
        buttonMac.showView();
        menuMac.showView();
    }
}