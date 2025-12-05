public class Main {
    public static void main(String[] args) {
// Choix de la famille
        FabriqueFamille fabrique = new FabriqueCategorie1(); // ou FabriqueCategorie2
        Client client = new Client(fabrique);
        client.faireOperation();
    }
}