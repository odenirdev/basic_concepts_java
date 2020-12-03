import java.util.ArrayList;
import java.util.Scanner;

public class problem_8 {
    private ArrayList<Integer> unique(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for (int i : list) {
            if (!newList.contains(i)) {
                newList.add(i);
            }
        }

        return newList;
    }


    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        problem_8 problema = new problem_8();

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
                    System.out.print("\nNumero: ");
                    list.add(ler.nextInt());
                    break;

                case 2:
                    System.out.println("\nVisualizar");
                    for (int i : list) {
                        System.out.print(i + " ");
                    }
                    break;

                case 3:
                    for (int i : problema.unique(list)) {
                        System.out.print(i + " ");
                    }
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
