import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("X: ");
        int x = ler.nextInt();

        System.out.print("Y: ");
        int y = ler.nextInt();

        int i;
        int result = 0;
        for (i = 0; i < y; i++) {
            result += x;
        }

        System.out.println("X . Y = " + result);
    }
}
