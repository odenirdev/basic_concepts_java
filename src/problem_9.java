import java.util.ArrayList;
import java.util.Scanner;

public class problem_9 {

    private ArrayList<String> unique(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<String>();

        for (String i : list) {
            if (!newList.contains(i)) {
                newList.add(i);
            }
        }

        return newList;
    }


    public void count(ArrayList<String> list) {
        for (String i : this.unique(list)) {
            int count = 0;

            for (String j : list) {
                if (i.equals(j)) {
                    count += 1;
                }
            }

            System.out.println(i + " -> " + count);
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        problem_9 Problema = new problem_9();

        int opcao = 0;
        do {
            System.out.println("\nMenu\n");
            System.out.println("1. Adicionar");
            System.out.println("2. Visualizar");
            System.out.println("3. Singularizar");
            System.out.println("0. Sair");

            System.out.print("\nEntre com a opcao: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nPalavra: ");

                    list.add(ler.next());
                    break;

                case 2:
                    System.out.println("\nVisualizar");
                    for (String i : list) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                    break;

                case 3:
                    Problema.count(list);
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
