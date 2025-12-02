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
    }
}