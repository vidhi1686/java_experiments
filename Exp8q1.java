import java.util.Scanner;

// User-defined exception class
class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class Exp8q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vidhi Jindal,24csu324");

        try {
            // DOD 2: Ask the user to enter the number of arguments
            System.out.print("Enter the number of arguments: ");
            int n = sc.nextInt();

            // Check if less than 5
            if (n < 5) {
                throw new CheckArgumentException("Error: You must enter 5 integers!");
            }

            // DOD 3: Use for loop to enter the arguments
            int sum = 0;
            System.out.println("Enter " + n + " integer values:");
            for (int i = 0; i < n; i++) {
                int value = sc.nextInt();
                sum += value;
            }

            // DOD 4: Calculate and print the sum
            System.out.println("The sum of the numbers is: " + sum);

        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter integers only.");
        } finally {
            sc.close();
        }
    }
}
