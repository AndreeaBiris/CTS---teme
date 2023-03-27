package FactoryMethod;

public class Dog  implements Animal{
    public Dog() {
        System.out.println("Dog");
    }
    @Override
    public void makeSound() {
        System.out.println("Ham");
    }
}
