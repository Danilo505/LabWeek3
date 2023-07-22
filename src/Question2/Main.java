package Question2;

import Question1.ConsoleColors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta("Danilo", 100);
        Conta c2 = new Conta("Danilo",500);
        Conta c3 = new Conta("Danilo",500);

        Cartao t1 = new Credito();
        t1.set(c1);

        Cartao t2 = new Debito(1000);
        t2.set(c2);

        Cartao t3 = new PrepaidCard(500);
        t3.set(c3);

        System.out.println(ConsoleColors.GREEN_BOLD + "Bem vindo ao banco JalaSoft");
        System.out.println();
        System.out.println(ConsoleColors.YELLOW_BOLD + "Aqui abaixo esta sua lista de cartões");

        boolean start = true;

        while (start){
            int menu = menu();
            switch (menu){
                case 1-> credito(t1);
                case 2-> debito(t2);
                case 3-> prePago(t3);
                case 4 -> start = false;
            }

        }

    }

    public static int  menu(){
        Scanner input = new Scanner(System.in);
        int escolha = 0;
        System.out.println();
        System.out.println(ConsoleColors.GREEN_BOLD + "Escolha uma das opções abaixo:");
        System.out.println(ConsoleColors.YELLOW_BOLD + "1 - Cartão de Crédito.");
        System.out.println(ConsoleColors.YELLOW_BOLD + "2 - Cartão de Débito.");
        System.out.println(ConsoleColors.YELLOW_BOLD + "3 - Cartão de Pré-Pago.");
        System.out.println(ConsoleColors.RED_BOLD + "4 - Sair");
        try {
            System.out.print(ConsoleColors.CYAN_BOLD + "Sua escolha:");
            escolha = input.nextInt();
        }catch (Exception e){
            System.out.println();
            System.out.println(ConsoleColors.RED_BOLD + "Tipo de escolha invalida");
            System.out.println();
        }
        System.out.println();

        return escolha;

    }
    public static void credito(Cartao cartao){
        System.out.println(ConsoleColors.YELLOW_BOLD + "Cartão de Crétido selecionado");
        Scanner input = new Scanner(System.in);
        int escolha = 2;
        System.out.println(ConsoleColors.GREEN_BOLD + "Escolha uma das opções abaixo:");
        System.out.println(ConsoleColors.YELLOW_BOLD + "1 - Sacar");
        System.out.println(ConsoleColors.YELLOW_BOLD + "2 - Saldo");
        try {
            System.out.print(ConsoleColors.CYAN_BOLD + "Sua escolha: ");
            escolha = input.nextInt();
        }catch (Exception e){
            System.out.println();
            System.out.println(ConsoleColors.RED_BOLD + "Tipo de escolha invalida");
            System.out.println();
        }

        switch (escolha){
            case 1 -> {
                double valor;
                System.out.print(ConsoleColors.GREEN_BOLD + "Digite o valor a ser sacado: ");
                valor = input.nextDouble();

                cartao.sacar(valor);
            }
            case 2 -> cartao.saldo();
            default -> System.out.println(ConsoleColors.RED_BOLD + "Opção invalida!");
        }
    }
    public static void debito(Cartao cartao){
        System.out.println(ConsoleColors.YELLOW_BOLD + "Cartão de Débito selecionado");
        Scanner input = new Scanner(System.in);
        int escolha = 2;
        System.out.println(ConsoleColors.GREEN_BOLD + "Escolha uma das opções abaixo:");
        System.out.println(ConsoleColors.YELLOW_BOLD + "1 - Sacar");
        System.out.println(ConsoleColors.YELLOW_BOLD + "2 - Saldo");
        try {
            System.out.print(ConsoleColors.CYAN_BOLD + "Sua escolha: ");
            escolha = input.nextInt();
        }catch (Exception e){
            System.out.println();
            System.out.println(ConsoleColors.RED_BOLD +"Tipo de escolha invalida");
            System.out.println();
        }

        switch (escolha){
            case 1 -> {
                double valor;
                System.out.print(ConsoleColors.GREEN_BOLD + "Digite o valor a ser sacado: ");
                valor = input.nextDouble();

                cartao.sacar(valor);
            }
            case 2 -> cartao.saldo();
            default -> System.out.println(ConsoleColors.RED_BOLD + "Opção invalida!");
        }
    }
    public static void prePago(Cartao cartao){
        System.out.println(ConsoleColors.CYAN_BOLD + "Cartão Pre-Pago selecionado");
        Scanner input = new Scanner(System.in);
        int escolha = 2;
        System.out.println(ConsoleColors.GREEN_BOLD + "Escolha uma das opções abaixo:");
        System.out.println(ConsoleColors.YELLOW_BOLD + "1 - Sacar");
        System.out.println(ConsoleColors.YELLOW_BOLD + "2 - Saldo");
        try {
            System.out.print(ConsoleColors.CYAN_BOLD + "Sua escolha: ");
            escolha = input.nextInt();
        }catch (Exception e){
            System.out.println();
            System.out.println(ConsoleColors.RED_BOLD + "Tipo de escolha invalida");
            System.out.println();
        }

        switch (escolha){
            case 1 -> {
                double valor;
                System.out.print(ConsoleColors.GREEN_BOLD + "Digite o valor a ser sacado: ");
                valor = input.nextDouble();

                cartao.sacar(valor);
            }
            case 2 -> cartao.saldo();
            default -> System.out.println(ConsoleColors.RED_BOLD + "Opção invalida!");
        }
    }
}