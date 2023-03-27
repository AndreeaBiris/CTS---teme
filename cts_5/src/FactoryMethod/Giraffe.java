package FactoryMethod;

public class Giraffe implements Animal{

    public Giraffe() {
        System.out.println("Giraffe");
    }
    @Override
    public void makeSound() {
        System.out.println("No sound");
    }
}
