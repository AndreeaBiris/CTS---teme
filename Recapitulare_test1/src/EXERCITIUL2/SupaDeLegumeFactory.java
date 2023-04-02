package EXERCITIUL2;

public class SupaDeLegumeFactory implements SupaFactory{
    @Override
    public Supa creareSupa() {
        return new SupaDeLegume();
    }
}
