package Prototype_generic;

public class ConcretePrototypeB implements Prototype {
    public Prototype clone() {
        return new ConcretePrototypeB();
    }
}
