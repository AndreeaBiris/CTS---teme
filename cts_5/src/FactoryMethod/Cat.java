package FactoryMethod;

public class Cat implements Animal {
    public Cat() {
        System.out.println("Cat");
    }
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}