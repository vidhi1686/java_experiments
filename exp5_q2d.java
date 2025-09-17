import java.util.Scanner;
public class VehicleDemo {
    public static void main(String[] args) {
        System.out.println("Vidhi Jindal, 24csu324");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of tyres: ");
        int N = sc.nextInt();
        Vehicle v;
        switch (N) {
            case 2:
                v = new Bike();
                break;
            case 4:
                v = new Car();
                break;
            default:
                v = new Vehicle();
        }
        v.display();
    }
}
