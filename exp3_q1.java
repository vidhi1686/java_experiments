// print array , sum of elements, min ,max reverse
import java.util.Scanner;
class array_que{
	public static void main(String [] args){
		System.out.println("Vidhi jindal , 24csu324");
	Scanner sc =  new Scanner(System.in);
	System.out.println("enter size of array");
	int size=sc.nextInt();
	int arr[] =new int[size];
	System.out.println("enter elements");
	for(int i=0;i<size;i++){
	arr[i]=sc.nextInt();
	}
	System.out.print("array elements");
	for(int i=0;i<size;i++){
	System.out.print(arr[i]+ " ");
	}
	// Q4. SUM OF ALL ELEMENTS

	int sum=0;
	for(int i=0;i<size;i++){
	sum=sum+arr[i];
	}
	System.out.println("the sum is" + sum);

	// Q1.FIND MAX MIN IN ARRAY

	int min=arr[0];
	for(int i=1;i<size;i++){
	if(arr[i]<min){
	min=arr[i];
	}
	
	}
	System.out.println("the min element is"+min);
	int max=arr[0];
	for(int i=1;i<size;i++){
	if(arr[i]>max){
	max=arr[i];
	}
	
	}
	System.out.println("the max element is"+max);

	for(int i=size-1 ; i>=0 ;i--){
		System.out.print(arr[i]+ " ");

	}



	}
}
