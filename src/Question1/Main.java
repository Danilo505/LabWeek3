package Question1;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Deck deckPartida = new Deck();

        int jogadorEscolha = random.nextInt(10);
        int computadorEscolha = random.nextInt(10);
        Card cartaJogador = deckPartida.card(jogadorEscolha);
        Card cartaComputador = deckPartida.card(computadorEscolha);

        System.out.println(ConsoleColors.GREEN_BOLD + "Jogo iniciado!\n");
        System.out.println(ConsoleColors.YELLOW_BOLD + "_______________________________ ");
        System.out.print(ConsoleColors.BLUE_BOLD + "A carta do nosso jogador é: ");
        System.out.println(cartaJogador.getNaipe().getInicial()+cartaJogador.getAtributo());
        System.out.print(ConsoleColors.CYAN_BOLD + "\nA carta do computador é: ");
        System.out.println(cartaComputador.getNaipe().getInicial()+cartaComputador.getAtributo());
        System.out.println(ConsoleColors.YELLOW_BOLD + "_______________________________\n");
        ResultParser resultParser = new ResultParser(cartaJogador,cartaComputador);

    }
}