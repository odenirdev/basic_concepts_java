public class problem_7 {
    public static void main(String[] args) {
        for (int x = -100; x <= 100; x++) {
            for (int y = -100; y <= 100; y++) {
                int result = x + y;
                if (result == 100 || result == -100) {
                    System.out.println("\nX= " + x + "\nY= " + y );
                    System.out.println("X + Y = " + result);
                }
            }
        }
    }
}
