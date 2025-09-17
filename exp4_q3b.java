import java.util.Scanner;

public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("Vidhi Jindal, 24CSU324");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter breadth: ");
        int b = sc.nextInt();

        Rectangle rect = new Rectangle(l, b);
        System.out.println("Area of rectangle: " + rect.getArea());

        sc.close();
    }
}
