package AbstractFactory;

public class MacGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new Button("Mac button");
    }

    @Override
    public Menu createMenu() {
        return new Menu("Mac menu");
    }
}
