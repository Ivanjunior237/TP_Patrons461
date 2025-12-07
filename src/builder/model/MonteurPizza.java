package builder.model;

public abstract class MonteurPizza {
    protected Pizza pizza = new Pizza();

    public Pizza getPizza() {
        // TODO: méthode générée automatiquement
        // Appel des méthodes pour construire respectivement la pâte, le sauce et la garniture
        monterPate();
        monterSauce();
        monterGarniture();
        return pizza;
    }

    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();
}