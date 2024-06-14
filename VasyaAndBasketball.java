import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class VasyaAndBasketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of throws of the first team
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Read the number of throws of the second team
        int m = scanner.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        // Sort the distances
        Arrays.sort(a);
        Arrays.sort(b);

        // Collect all unique distances
        TreeSet<Integer> uniqueDistances = new TreeSet<>();
        for (int distance : a) {
            uniqueDistances.add(distance);
        }
        for (int distance : b) {
            uniqueDistances.add(distance);
        }

        // Initialize variables to track the best score and difference
        int maxDifference = Integer.MIN_VALUE;
        int bestScoreA = 0;
        int bestScoreB = 0;

        // Two-pointer technique to calculate scores
        int i = 0, j = 0;
        for (int d : uniqueDistances) {
            // Calculate score for team A
            while (i < n && a[i] <= d) {
                i++;
            }
            int scoreA = i * 2 + (n - i) * 3;

            // Calculate score for team B
            while (j < m && b[j] <= d) {
                j++;
            }
            int scoreB = j * 2 + (m - j) * 3;

            // Calculate the difference
            int difference = scoreA - scoreB;

            // Update the best score and difference
            if (difference > maxDifference || (difference == maxDifference && scoreA > bestScoreA)) {
                maxDifference = difference;
                bestScoreA = scoreA;
                bestScoreB = scoreB;
            }
        }

        // Special case when d is less than the smallest element in both arrays (d = 0)
        // Calculate score when all throws are considered as 3 points
        int scoreA = n * 3;
        int scoreB = m * 3;
        int difference = scoreA - scoreB;
        if (difference > maxDifference || (difference == maxDifference && scoreA > bestScoreA)) {
            maxDifference = difference;
            bestScoreA = scoreA;
            bestScoreB = scoreB;
        }

        // Print the best possible score
        System.out.println(bestScoreA + ":" + bestScoreB);
    }
}
