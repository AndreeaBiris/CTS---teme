package Prototype_generic;

public class PrototypeMain {
    public static void main(String[] args){
        Client client = new Client();
        Prototype prototypeA = client.create("A");
        Prototype prototypeB = client.create("B");
    }
}
