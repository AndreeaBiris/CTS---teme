package EXERCITIUL1;

public class FastFood {
    private BurgerBuilder builder;

    FastFood(BurgerBuilder builder) {
        this.builder = builder;
    }

    public void buidBurger(){
        builder.buildCarne();
        builder.buildCondimente();
        builder.buildLegume();
        builder.buildSos();
        builder.buildTipChifla();
        if(builder instanceof ClasicBurgerBuilder){
            ((ClasicBurgerBuilder) builder).buildPretStandard();
        }
        else {
            ((MegaBurgerExtra) builder).buildPretExtra();
        }
    }

    public Burger getBurger(){
        return builder.getBurger();
    }
}
