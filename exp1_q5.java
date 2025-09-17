//reverse the num, q4(i)
import java.util.Scanner;
class reverse{
	public static void main(String [] args){
	System.out.println("Vidhi Jindal, 24csu324");
	int num;
	int reversed=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("enter num");
	num=sc.nextInt();
	while(num!=0){
	int digit =num%10;
	reversed =(reversed*10)+digit;
	num=num/10;

	}
	System.out.println("the reversed digit is "+reversed);
	}
}
