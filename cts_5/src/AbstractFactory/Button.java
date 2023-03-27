package AbstractFactory;

public class Button implements View{
    String type;
    public Button(String type) {
        this.type=type;
    }

    @Override
    public void showView() {
        System.out.println("This is a button "+type);
    }
}