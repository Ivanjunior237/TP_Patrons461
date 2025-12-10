package builder;

import builder.model.Directeur;

public class Main {
    public static void main(String[] args) {
        Directeur directeur = new Directeur();

        // Construire pizza Reine
        System.out.println("Pizza Reine Fabriquée : ");
        directeur.construirePizzaReine().print();

        // Construire pizza Piquante
        System.out.println("Pizza Piquante Fabriquée : ");
        directeur.construirePizzaPiquante().print();

        // Construire pizza Pillee
        System.out.println("Pizza Pillee Fabriquée : ");
        directeur.construirePizzaPillee().print(); // Ligne pour la pizza Pillee
    }
}