import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of statements
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the remaining newline character

        int x = 0;

        // Process each statement
        for (int i = 0; i < n; i++) {
            String statement = scanner.nextLine();

            if (statement.contains("++")) {
                x++;
            } else if (statement.contains("--")) {
                x--;
            }
        }

        // Output the final value of x
        System.out.println(x);

        scanner.close();
    }
}
