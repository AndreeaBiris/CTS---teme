package EXERCITIUL1;

public class MegaBurgerExtra implements BurgerBuilder{
    private Burger b;

    MegaBurgerExtra() {
        this.b = new MegaBurger();
    }

    @Override
    public void buildTipChifla() {
        this.b.setTipChifla("Chifla mega burger");
    }

    @Override
    public void buildCondimente() {
        this.b.setCondimente("Condimente mega burger");
    }

    @Override
    public void buildLegume() {
        this.b.setLegume("Legume mega burger");
    }

    @Override
    public void buildCarne() {
        this.b.setCarne("Carne mega burger");
    }

    @Override
    public void buildSos() {
        this.b.setSos("Sos mega burger");
    }

    public void buildPretExtra(){
        ((MegaBurger)b).setPretExtra(22.5);
    }
    @Override
    public Burger getBurger() {
        return this.b;
    }
}
