public class Client {
    private ProduitTypeA produitA;
    private ProduitTypeB produitB;

    public Client(FabriqueFamille fabrique) {
        produitA = fabrique.createProduitA();
        produitB = fabrique.createProduitB();
    }

    public void faireOperation() {
        produitA.operationA();
        produitB.operationB();
    }
}