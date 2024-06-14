import java.util.Scanner;

public class Chewbaca_and_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();  // Read the input as a String to easily handle individual digits.
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n.length(); i++) {
            int digit = n.charAt(i) - '0';  // Convert character to digit.
            int transformedDigit = 9 - digit;

            // Apply the transformation rule, but avoid leading zero by checking the first digit.
            if (transformedDigit < digit && !(i == 0 && transformedDigit == 0)) {
                result.append(transformedDigit);
            } else {
                result.append(digit);
            }
        }

        System.out.println(result);
    }
}
