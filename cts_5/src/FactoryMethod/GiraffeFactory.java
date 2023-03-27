package FactoryMethod;

public class GiraffeFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        return new Giraffe();
    }
}