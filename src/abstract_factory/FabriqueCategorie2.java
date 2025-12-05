public class FabriqueCategorie2 implements FabriqueFamille {
    public ProduitTypeA createProduitA() {
        return new ProduitA_Categorie2();
    }

    public ProduitTypeB createProduitB() {
        return new ProduitB_Categorie2();
    }
}