package builderPerso.model;

import builder.model.Pizza; // Importation correcte
import builder.model.MonteurPizza;
import builder.model.MonteurPizzaPiquante;
import builder.model.MonteurPizzaReine;
import builderPerso.MonteurPizzaPillee;

public class Directeur {
    public Pizza construirePizzaPiquante() {
        MonteurPizza pizzap = new MonteurPizzaPiquante();
        return pizzap.getPizza();
    }

    public Pizza construirePizzaReine() {
        MonteurPizza pizzaReine = new MonteurPizzaReine();
        return pizzaReine.getPizza();
    }

    public Pizza construirePizzaPillee() {
        MonteurPizza pizzaPillee = new MonteurPizzaPillee();
        return pizzaPillee.getPizza(); // Utilisation de la classe Pizza ici
    }
}