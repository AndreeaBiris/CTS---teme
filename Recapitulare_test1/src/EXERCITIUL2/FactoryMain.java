package EXERCITIUL2;

public class FactoryMain {
    public static void main(String[] args){
       /* Restaurantul servește mai multe tipuri de supe: supă de legume, supă de ciuperci, supă de vită,
        etc. Să se implementeze modulul care permite realizarea de obiecte din familia supelor. Modulul
        trebuie realizat, astfel încât pentru adăugări de noi tipuri de supă să nu fie necesare modificări în
        codul existent
        */

        SupaFactory s1,s2, s3;
        s1 = new SupaDeLegumeFactory();
        s1.creareSupa();
        s2 = new SupaDeCiuperciFactory();
        s2.creareSupa();
        s3 = new SupaDeVitaFactory();
        s3.creareSupa();
    }
}
