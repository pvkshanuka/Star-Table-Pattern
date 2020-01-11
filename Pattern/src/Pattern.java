import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;

        try {
            System.out.println("Please enter row count.");
            rows = Integer.parseInt(scanner.next());

            printStarPattern(rows);

        } catch (Exception e) {
            System.out.println("Invalid row count.");
        }
    }

    private static void printStarPattern(int size) {

        for (int i = 1; i <= size; i++) {

            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println("");

        }

        for (int i = 1; i <= size - 1; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= ((size - i) * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println("");

        }

    }

}
