package builderPerso.model; // Assurez-vous que c'est correct

public class Pizza {
    private String pate;
    private String sauce;
    private String garniture;

    public void setPate(String pate) {
        this.pate = pate;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setGarniture(String garniture) {
        this.garniture = garniture;
    }

    public void print() {
        System.out.println("Pizza avec pate: " + pate + ", sauce: " + sauce + ", garniture: " + garniture);
    }
}