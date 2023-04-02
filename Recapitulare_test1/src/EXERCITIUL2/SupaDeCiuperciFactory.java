package EXERCITIUL2;

public class SupaDeCiuperciFactory implements SupaFactory{
    @Override
    public Supa creareSupa() {
        return new SupaDeCiuperci();
    }
}
