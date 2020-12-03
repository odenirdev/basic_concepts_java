import java.util.Scanner;

class Problem_3 {
    Scanner ler = new Scanner(System.in);

    private void crescente(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    private void decrescente(int num) {
        for (int i = num; i >= 0; i--) {
            System.out.print(i);
        }
        System.out.println();
    }

    private int entrada() {
        System.out.print("\nEntre com um numero: ");
        return ler.nextInt();
    }

    public static void main(String[] args) {
        int opcao = 0;
        Scanner ler = new Scanner(System.in);
        Problem_3 problema = new Problem_3();

        System.out.println("Lista crescente e decrescente");

        do {
            System.out.println("\n1. Crescente");
            System.out.println("2. Decrescente");
            System.out.println("0. Sair");

            System.out.print("\nEntre com a opcao: ");
            opcao = ler.nextInt();

            int num;

            switch (opcao) {
                case 1:
                    num = problema.entrada();
                    problema.crescente(num);
                    break;

                case 2:
                    num = problema.entrada();
                    problema.decrescente(num);
                    break;

                default:
                    if (opcao != 0) {
                        System.out.println("\nEntrada invalida");
                    }
                    break;
            }
        } while (opcao != 0);
    }
}

