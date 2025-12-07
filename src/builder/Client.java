package builder;

import builder.model.Directeur;  // Assurez-vous que ce chemin est correct

public class Client {

    public static void main(String[] args) {
        Directeur directeur = new Directeur();

        // Construire pizza Reine
        System.out.println("Pizza Reine Fabriquée : ");
        directeur.construirePizzaReine().print();

        // Construire pizza Piquante
        System.out.println("Pizza Piquante Fabriquée : ");
        directeur.construirePizzaPiquante().print();
    }
}