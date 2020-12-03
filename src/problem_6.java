import java.util.Scanner;

class SeriesMatematica {
    public int elevadoA(int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }
}

public class problem_6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("X: ");
        int x = ler.nextInt();
        System.out.print("Y: ");
        int y = ler.nextInt();

        System.out.println("Resultado: " + new SeriesMatematica().elevadoA(x, y));
    }
}
