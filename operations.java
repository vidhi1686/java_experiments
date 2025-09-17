//Basic Operations q1
import java.util.Scanner;
class operations{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Vidhi Jindal , 24csu324");
        int a,b;
        System.out.println("provide a");
        a=s.nextInt();
        System.out.println("provide b");
        b=s.nextInt();
        
        int sum=a+b;
        int diff=a-b;
        int multi=a*b;
        int div=a/b;
        int modulus=a%b;
        System.out.println("the sum is"+sum);
        System.out.println("the difference is"+diff);
        System.out.println("the product is "+multi);
        System.out.println("the divide is"+div);
        System.out.println("the remainder is"+modulus);
        
    }
}