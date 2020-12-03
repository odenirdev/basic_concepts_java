import java.util.Scanner;

class Nome {
    private String nomeProprio;
    private String nomeMeio;
    private String nomeFamilia;

    public Nome(String nomeProprio, String nomeMeio, String nomeFamilia) {
        this.nomeProprio = nomeProprio;
        this.nomeMeio = nomeMeio;
        this.nomeFamilia = nomeFamilia;
    }

    public String show() {
        return this.nomeProprio + " " + this.nomeMeio + " " + this.nomeFamilia;
    }

    public String rubrica() {
        return ("" + this.nomeProprio.charAt(0) + this.nomeMeio.charAt(0) + this.nomeFamilia.charAt(0)).toLowerCase();
    }

    public String assinatura() {
        return this.nomeProprio.charAt(0) + "." + this.nomeMeio.charAt(0)  + "." + this.nomeFamilia;
    }
}

public class problem_5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Cadastro\n");

        System.out.print("Nome próprio: ");
        String nomeProprio = ler.nextLine();

        System.out.print("\nNome do meio: ");
        String nomeMeio = ler.nextLine();

        System.out.print("\nNome de familia: ");
        String nomeFamilia = ler.nextLine();

        Nome nome = new Nome(nomeProprio, nomeMeio, nomeFamilia);

        int opcao = 0;
        do {
            System.out.println("\nMenu\n");
            System.out.println("1. Visualizar");
            System.out.println("2. Rubrica");
            System.out.println("3. Assinatura");
            System.out.println("0. Sair");

            System.out.print("\nEntre com a opcao: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(nome.show());
                    break;

                case 2:
                    System.out.println(nome.rubrica());
                    break;

                case 3:
                    System.out.println(nome.assinatura());
                    break;

                default:
                    if (opcao != 0) {
                        System.out.println("\nOpcao invalida");
                    }
                    break;
            }
        } while (opcao != 0);
    }
}
