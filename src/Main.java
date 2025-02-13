
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GerenciadorNinjas menu = new GerenciadorNinjas();
        Scanner scan = new Scanner(System.in);

        while (true) {

            menu.Menu();

            int escolha = scan.nextInt();

            switch (escolha) {

                case 1 ->
                    menu.cadastro();
                case 2 ->
                    menu.listarNinjas();

                case 3 -> {
                    menu.removerNinja();
                }
                case 4 -> {
                    menu.procurarNinja();
                }
                case 0 -> {
                    System.out.println("Saindo...");
                    scan.close();
                    return;
                }
                default ->
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
