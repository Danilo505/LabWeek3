package Question1;

public enum Suit {
    PAUS("P"),
    OURO("O"),
    COPAS("C"),
    ESPADAS("E");

    private final String inicial;

    Suit(String inicial) {
        this.inicial = inicial;
    }

    public String getInicial() {
        return inicial;
    }
}
