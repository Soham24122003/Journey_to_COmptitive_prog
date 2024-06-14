import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int row = -1, col = -1;

        // Reading the input matrix and finding the position of '1'
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 1) {
                    row = i;
                    col = j;
                }
            }
        }

        // Calculate the number of moves to bring '1' to the center (2, 2) in 0-based index
        int moves = Math.abs(row - 2) + Math.abs(col - 2);

        // Print the result
        System.out.println(moves);
    }
}
