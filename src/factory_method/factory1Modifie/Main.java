// Interface pour les produits
interface Produit {
    void afficher();
}

// Implémentations concrètes des produits
class ProduitPDF implements Produit {
    public void afficher() {
        System.out.println("Produit PDF");
    }
}

class ProduitHTML implements Produit {
    public void afficher() {
        System.out.println("Produit HTML");
    }
}

class ProduitCVS implements Produit {
    public void afficher() {
        System.out.println("Produit CVS");
    }
}
// Ajout de la classe pour le produit texte
class ProduitTXT implements Produit {
    public void afficher() {
        System.out.println("Produit TXT");
    }
}

// Abstrait la fabrique de produits
abstract class FabriqueProduit {
    public abstract Produit creerProduit(String type);
}

// Fabrique spécifique qui crée les produits
class FabriqueSpecifique extends FabriqueProduit {
    public Produit creerProduit(String type) {
        switch (type.toLowerCase()) {
            case "pdf":
                return new ProduitPDF();
            case "html":
                return new ProduitHTML();
            case "cvs":
                return new ProduitCVS();
            case "txt":
                return new ProduitTXT(); // nouvelle gestion ici
            default:
                throw new IllegalArgumentException("Type inconnu : " + type);
        }
    }
}

// Classe principale pour tester
public class Main {
    public static void main(String[] args) {
        FabriqueProduit fabrique = new FabriqueSpecifique();

        Produit p1 = fabrique.creerProduit("pdf");
        p1.afficher();

        Produit p2 = fabrique.creerProduit("html");
        p2.afficher();

        Produit p3 = fabrique.creerProduit("cvs");
        p3.afficher();

        // Ajout du test pour le type texte
        Produit p4 = fabrique.creerProduit("txt");
        p4.afficher(); // affichera "Produit TXT"
    }

}