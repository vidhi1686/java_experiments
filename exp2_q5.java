import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
    System.out.println("Vidhi Jindal,24csu324");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");   
            int next = first + second;      
            first = second;                  
            second = next;
        }
    }
}
