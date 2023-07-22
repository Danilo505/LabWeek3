package Question3;

import Question1.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println(ConsoleColors.GREEN_BOLD + "Professor Titular");
        System.out.println();

        Titular titular = new Titular("Ciências");
        titular.teach();

        System.out.println();
        System.out.println(ConsoleColors.CYAN_BOLD + "Professor Substituto");
        System.out.println();

        Substituto substituto = new Substituto();
        substituto.assign("Ciências");
        substituto.assign("Ginástica");
        substituto.assign("Música");
        substituto.teach();

    }
}
