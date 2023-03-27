package AbstractFactory;

public class Menu implements View{
    String type;
    public Menu(String type) {
        this.type=type;
    }
    @Override
    public void showView() {
        System.out.println("This is a menu "+type);
    }
}