package Question1;

public class Card {
    private String atributo;
    private Suit naipe;

    public Card(String atributo, Suit naipe) {
        this.atributo = atributo;
        this.naipe = naipe;
    }

    public String getAtributo() {
        return atributo;
    }

    public Suit getNaipe() {
        return naipe;
    }
}
