import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
     System.out.println("Vidhi Jindal ,24csu324");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
