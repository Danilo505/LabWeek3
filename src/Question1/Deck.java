package Question1;

import java.util.Arrays;
import java.util.Random;

public class Deck {
    private Card[] deck = new Card[10];
    private Random random = new Random();

    public Deck() {
        createDack();
    }
    private void createDack(){
        String[] atributos = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        Suit[] suits = {Suit.PAUS,Suit.ESPADAS, Suit.OURO,Suit.COPAS};
        for (int i = 0; i < deck.length; i++) {
            int atributo = random.nextInt(atributos.length);
            int suit = random.nextInt(suits.length);

            Card carta = new Card(atributos[atributo], suits[suit]);

            deck[i] = carta;

        }
    }

    public Card card(int index){
        Card cartaDoDeck = deck[index];
        return cartaDoDeck;

    }
}
