public class FabriqueCategorie1 implements FabriqueFamille {
    public ProduitTypeA createProduitA() {
        return new ProduitA_Categorie1();
    }

    public ProduitTypeB createProduitB() {
        return new ProduitB_Categorie1();
    }
}