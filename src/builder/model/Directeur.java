package builder.model;  // Cela doit être dans le package 'builder.model'

import builder.model.Pizza;  // Importations correctes
import builder.model.MonteurPizza;
import builder.model.MonteurPizzaPiquante;
import builder.model.MonteurPizzaReine;

public class Directeur {

    // Construire une pizza Piquante
    public Pizza construirePizzaPiquante() {
        MonteurPizza pizzap = new MonteurPizzaPiquante();
        return pizzap.getPizza();
    }

    // Construire une pizza piquante
    public Pizza construirePizzaReine() {
        MonteurPizza pizzaReine = new MonteurPizzaReine();
        return pizzaReine.getPizza();
    }
}