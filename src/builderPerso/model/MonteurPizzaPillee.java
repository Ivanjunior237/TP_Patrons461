package builderPerso.model;

import builder.model.MonteurPizza; // Assurez-vous que cela correspond à l'emplacement

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