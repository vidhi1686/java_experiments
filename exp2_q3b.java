import java.util.Scanner;

public class LeftTriangle {
    public static void main(String[] args) {
    System.out.println("Vidhi Jindal ,24csu324");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
