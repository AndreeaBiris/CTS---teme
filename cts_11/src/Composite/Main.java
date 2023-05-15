package Composite;

public class Main {
    public static void main(String[] args) {
        Component btn1 = new Button();
        Component btn2 = new Button();
        Component campText = new TextField();

        ComponentPanel panou = new Panel();
        panou.adaugaComponenta(btn1);
        panou.adaugaComponenta(btn2);
        panou.adaugaComponenta(campText);

        panou.render();
    }
}