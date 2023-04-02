package EXERCITIUL1;

public class ClasicBurgerBuilder implements BurgerBuilder{
    private Burger burger;

    ClasicBurgerBuilder() {
        this.burger = new ClasicBurger();
    }

    @Override
    public void buildTipChifla() {
        this.burger.setTipChifla("Chifla clasic burger");

    }

    @Override
    public void buildCondimente() {
        this.burger.setCondimente("Condimente clasic burger");
    }

    @Override
    public void buildLegume() {
        this.burger.setLegume("Legume clasic burger");
    }

    @Override
    public void buildCarne() {
        this.burger.setCarne("Carne clasic burger");
    }

    @Override
    public void buildSos() {
        this.burger.setSos("Sos clasic burger");
    }

    public void buildPretStandard(){
        ((ClasicBurger)burger).setPretStandard(15.5);
    }

    @Override
    public Burger getBurger() {
        return this.burger;
    }
}
