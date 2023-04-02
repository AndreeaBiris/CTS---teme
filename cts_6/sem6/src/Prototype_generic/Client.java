package Prototype_generic;

import java.util.HashMap;
import java.util.Map;

public class Client {
    //map folosim cand avem mai multe obiecte pe care dorim sa le instantiem
    private Map<String, Prototype> prototypes = new HashMap<>();

    public Client() {
        prototypes.put("A", new ConcretePrototypeA());
        prototypes.put("B", new ConcretePrototypeB());
    }

    public Prototype create(String type) {
        return prototypes.get(type).clone();
    }
}
