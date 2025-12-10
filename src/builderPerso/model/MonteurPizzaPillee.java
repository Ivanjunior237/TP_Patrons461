package builderPerso;

import builder.model.MonteurPizza;
import builder.model.Pizza;

public class MonteurPizzaPillee extends MonteurPizza {
    @Override
    public void monterPate() {
        pizza.setPate("fine");
    }

    @Override
    public void monterSauce() {
        pizza.setSauce("barbecue");
    }

    @Override
    public void monterGarniture() {
        pizza.setGarniture("poulet + oignons");
    }
}