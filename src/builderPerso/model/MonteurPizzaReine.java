package builderPerso.model;

public class MonteurPizzaReine extends MonteurPizza {
    @Override
    public void monterPate() {
        pizza.setPate("épaisse");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("tomate");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("jambon + champignons");
    }
}