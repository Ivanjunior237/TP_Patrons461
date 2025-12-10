
package builderPerso.model;

public abstract class MonteurPizza {
    protected Pizza pizza;

    public MonteurPizza() {
        this.pizza = new Pizza(); // Créer une nouvelle instance de Pizza
    }

    public Pizza getPizza() {
        return pizza; // Retourner l'objet Pizza
    }

    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();
}