//Convert minutes to years months and days ,q2
import java.util.Scanner;
class minutes{
	public static void main(String [] args){
	long days, months ,years;
	System.out.println("Vidhi Jindal, 24csu324");
	Scanner sc =new Scanner(System.in);
	System.out.println("enter no of minutes");
	long min=sc.nextInt();
	long min_years =60*24*365;
	years= min/ min_years;
	min=min%min_years;
	long min_month=60*24*30;
	months=min/min_month;
	min=min%min_month;
	long min_days=60*24;
	days=min/min_days;
	min=min%min_days;
	System.out.println(min +" minutes "+ " = " + years +" years "+ months +" months "+ days +" days");




	}
}
