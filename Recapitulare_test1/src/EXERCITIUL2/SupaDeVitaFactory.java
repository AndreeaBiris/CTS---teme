package EXERCITIUL2;

public class SupaDeVitaFactory implements SupaFactory{
    @Override
    public Supa creareSupa() {
        return new SupaDeVita();
    }
}
