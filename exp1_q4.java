 //print sum  of digits of num,q4(ii)
 import java.util.Scanner;
 class sum_num{
 public static void main(String[] args){
 System.out.println("Vidhi Jindal, 24csu324");
 int num;
 int sum=0;
 Scanner sc= new Scanner(System.in);
 System.out.println("Provide num");
 num=sc.nextInt();
 while(num!=0){
 int digit=num%10;
 sum=sum+digit;
 num=num/10;
 }
 System.out.println("the sum of num is " + sum);
 }
 }
