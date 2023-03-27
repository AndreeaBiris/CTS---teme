package AbstractFactory;

public class WindowsGUIFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new Button("Windows button");
    }

    @Override
    public Menu createMenu() {
        return new Menu("Windows menu");
    }
}
