package ninjaConfig;

import java.util.LinkedList;
import records.NinjaRecord;

public class Ninja {

    LinkedList<NinjaRecord> ninjaCadastro = new LinkedList<>();

    public void cadastrarNinja(NinjaRecord ninja) {
        ninjaCadastro.add(ninja);
    }

    public void listarNinjas() {
        for (NinjaRecord ninja : ninjaCadastro) {
            System.out.println("\n________Ninja_______\n");
            System.out.println("Ninja: " + ninja.nome()
                    + "\nIdade: " + ninja.idade()
                    + "\nVila: " + ninja.vila());
        }
        
    }

    public NinjaRecord procurarNinja(String nome) {
        for (NinjaRecord ninja : ninjaCadastro) {
            if (ninja.nome().equals(nome)) {
                return ninja;
            }
        }
        return null;
    }

    public void removerNinja(String nome) {
        for (NinjaRecord ninja : ninjaCadastro) {
            if (ninja.nome().equals(nome)) {
                ninjaCadastro.remove(ninja);
                return;
            }
        }
    }

    public void ninjascadastrados() {
        cadastrarNinja(new NinjaRecord("Ninja1", 20, "Nevoa"));
        cadastrarNinja(new NinjaRecord("Ninja2", 21, "Nevoa"));
        cadastrarNinja(new NinjaRecord("Ninja3", 22, "Folha"));
        cadastrarNinja(new NinjaRecord("Ninja4", 23, "Folha"));
        cadastrarNinja(new NinjaRecord("Ninja5", 24, "Areia"));
        cadastrarNinja(new NinjaRecord("Ninja6", 25, "Chuva"));
        cadastrarNinja(new NinjaRecord("Ninja7", 26, "Chuva"));

    }

}
