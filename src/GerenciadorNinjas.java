
import java.util.Scanner;
import ninjaConfig.Ninja;
import records.NinjaRecord;

public class GerenciadorNinjas extends Ninja {

    Scanner scan = new Scanner(System.in);

    public void cadastro() {
        System.out.print("Nome: ");
        String nome = scan.next();
        System.out.print("Idade: ");
        int idade = scan.nextInt();
        System.out.print("Vila: ");
        String vila = scan.next();

        NinjaRecord ninja = new NinjaRecord(nome, idade, vila);
        ninja.nome();
        ninja.idade();
        ninja.vila();

        cadastrarNinja(ninja);
    }

    public void Menu() {
        System.out.println("\n_____________Gerenciamento de Ninjas_____________\n");
        System.out.println("1 - Cadastrar Ninja");
        System.out.println("2 - Listar Ninjas");
        System.out.println("3 - Remover Ninja");
        System.out.println("4 - Procurar Ninja");
        System.out.print("\nEscolha uma opção: ");
    }

    public void procurarNinja() {
        System.out.print("Nome do Ninja: ");
        String nome = scan.next();
        NinjaRecord ninja = procurarNinja(nome);
        if (ninja != null) {
            System.out.println(ninja.toString());
        } else {
            System.out.println("Ninja nao cadastrado!");
        }
    }

    public void removerNinja() {
        System.out.print("Nome do Ninja: ");
        String nome = scan.next();
        removerNinja(nome);

    }

}
