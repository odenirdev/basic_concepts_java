import java.util.ArrayList;
import java.util.Scanner;

public class problem_2 {
    String nome;


    public static void main(String[] args) {
        int opcao = 0;
        Scanner ler = new Scanner(System.in);
        Agenda agenda = new Agenda();

        do {
            System.out.println("\nAgenda");
            System.out.println("\n1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Pesquisa por nome");
            System.out.println("4. Remover por nome");
            System.out.println("0. Sair");
            System.out.print("\nEntre com a opcao: ");

            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    agenda.novoContato();
                    break;

                case 2:
                    agenda.listar();
                    break;

                case 3:
                    agenda.buscar();
                    break;

                case 4:
                    agenda.remover();
                    break;

                default:
                    if (opcao != 0) {
                        System.out.print("\nEntrada invalida");
                    }
                    break;

            }
        } while (opcao != 0);
    }
}

class Contato {
    private String nome;
    private String email;

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String apresentar() {
        return "\nContato\n" + "Nome: " + this.nome + "\nE-mail: " + this.email + "\n";
    }

    public String buscarNome() {
        return this.nome;
    }
}

class Agenda {
    private ArrayList<Contato> contatos = new ArrayList<Contato>();
    Scanner ler = new Scanner(System.in);

    public void novoContato() {
        System.out.println("\nNovo Contato\n");
        System.out.print("Nome: ");
        String nome = ler.nextLine();
        System.out.print("E-mail: ");
        String email = ler.nextLine();

        contatos.add(new Contato(nome, email));
    }

    public void listar() {
        System.out.println("\nListar Agenda");

        contatos.forEach(contato -> {
            System.out.println(contato.apresentar());
        });
    }

    public void buscar() {
        System.out.println("\nPesquisa por nome\n");
        System.out.print("Entre com o nome: ");
        String nome = ler.nextLine();

        contatos.forEach(contato -> {
            if (new String(contato.buscarNome()).equals(nome)) {
                System.out.println(contato.apresentar());
            }
        });
    }

    public void remover() {
        System.out.println("\nRemover por nome\n");
        System.out.print("Entre com o nome: ");
        String nome = ler.nextLine();

        int i;
        for (i = 0; i < contatos.size(); i++) {
            if (new String(contatos.get(i).buscarNome()).equals(nome)) {
                contatos.remove(i);

                System.out.println("Contato removido");
            }
        }
    }
}