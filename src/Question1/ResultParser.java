package Question1;

import java.util.Objects;

public class ResultParser {
    private Card jogador;
    private Card computador;

    private String[] cartasAtributos = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};

    public ResultParser(Card jogador, Card computador) {
        this.jogador = jogador;
        this.computador = computador;
        startAnalise();

    }
    public void startAnalise(){
        final String RESET = "\u001B[0m";
        final String GREEN = "\u001B[32m";
        final String RED = "\u001B[31m";
        final String YELLOW = "\u001B[33m";

        int indexCardJogador = -1;
        int indexCardComputador = -1;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < cartasAtributos.length; j++) {
                if(i == 0){
                    if (Objects.equals(jogador.getAtributo(), cartasAtributos[j])){
                        indexCardJogador = j;
                    }
                }else{
                    if (Objects.equals(computador.getAtributo(), cartasAtributos[j])){
                        indexCardComputador = j;
                    }
                }
            }
        }
        if(indexCardJogador > indexCardComputador){
            System.out.println(GREEN+"O jogador Ganhou!"+RESET);
        }else if (indexCardJogador < indexCardComputador){
            System.out.println(RED+"O computador Ganhou!"+RESET);
        }else{
            System.out.println(YELLOW+"Deu empate!"+RESET);
        }
    }
}