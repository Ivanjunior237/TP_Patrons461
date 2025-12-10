package builder.model;

import builder.model.Pizza;
import builder.model.MonteurPizza;
import builder.model.MonteurPizzaPiquante;
import builder.model.MonteurPizzaReine;
import builderPerso.MonteurPizzaPillee; // Importez votre nouvelle classe

public class Directeur {
    public Pizza construirePizzaPiquante() {
        MonteurPizza pizzap = new MonteurPizzaPiquante();
        return pizzap.getPizza();
    }

    public Pizza construirePizzaReine() {
        MonteurPizza pizzaReine = new MonteurPizzaReine();
        return pizzaReine.getPizza();
    }

    public Pizza construirePizzaPillee() { // Nouvelle méthode
        MonteurPizza pizzaPillee = new MonteurPizzaPillee();
        return pizzaPillee.getPizza();
    }
}