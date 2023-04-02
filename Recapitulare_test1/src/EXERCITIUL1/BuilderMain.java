package EXERCITIUL1;

public class BuilderMain {

    /* Sa se implementeze un builder pentru crearea unui obiect de tip
     * Burger, avand campurile  ”tip de chifla”, ”carne”, ”sos”, ”legume” si ”condimente”.
     * Builderul trebuie sa ofere metode pentru a seta fiecare camp in parte, respectiv
     * ”setChifla(String)”, ”setCarne(String)”, ”setSos(String)”, ”setLegume(String)” si ”setCondimente(String)”.
     * De asemenea, builderul trebuie sa ofere o metoda build() pentru a crea obiectul Burger cu valorile
     * setate in campuri. Trebuie sa se asigure ca obiectul Burger creat are toate campurile setate corect.
     *   */

    public static void main(String[] args){
        //Classic burger
        BurgerBuilder builder = new ClasicBurgerBuilder();
        FastFood fastFood1 = new FastFood(builder);
        fastFood1.buidBurger();
        Burger clasicBurger = fastFood1.getBurger();
        System.out.println(clasicBurger.showDetails());

        //Extra burger
        BurgerBuilder builder1 = new MegaBurgerExtra();
        FastFood fastFood2 = new FastFood(builder1);
        fastFood2.buidBurger();
        Burger megaBurger = fastFood2.getBurger();
        System.out.println(megaBurger.showDetails());
    }


}
