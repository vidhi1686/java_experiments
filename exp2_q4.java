import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        System.out.println("Vidhi Jindal,24csu324");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println(num + " is NOT a Prime number.");
        } else {
            int count = 0;   // counter for divisors

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;  // no need to check further
                }
            }

            if (count == 0)
                System.out.println(num + " is a Prime number.");
            else
                System.out.println(num + " is NOT a Prime number.");
        }
    }
}
