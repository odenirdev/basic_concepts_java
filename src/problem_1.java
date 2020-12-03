import java.util.Arrays;
import java.util.Scanner;

class MediaAluno {
    private int[] notas = new int[4];

    private double media() {
        int i;
        double soma = 0;
        for (i = 0; i < 4; i++) {
            soma += notas[i];
        }

        return soma / notas.length;
    }

    private void adicionarNota(int index,int nota) {
        notas[index] = nota;

    }

    static boolean validarNota(int nota) {
        if (nota < 0 || nota > 100) return false;

        return true;
    }

    public static void main(String[] args) {
        MediaAluno Problema = new MediaAluno();
        Scanner ler = new Scanner(System.in);
        int i;
        int nota;

        System.out.printf("Nome: Odenir Gomes\n\n");
        for (i = 0; i < 4; i++) {
            System.out.printf("Nota " + (i + 1) + " : ");

            nota = ler.nextInt();


            if (validarNota(nota)) {
                Problema.adicionarNota(i, nota);
            } else {
                System.out.printf("\nEntrada invalida\n");
                i -= 1;
            }
        }

        System.out.printf("\nMédia do aluno: " + Problema.media() );
    }
}
