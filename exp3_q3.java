import java.util.Scanner;
class sum_array{
	public static void main(String [] args){
	System.out.println("vidhi,24csu324");
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

	int sum=0;
	for(int i=0;i<size;i++){
	sum=sum+arr[i];
	}
	System.out.println("the sum of array is" +sum);
	int alter_sum=0;
	System.out.println("the sum is" + sum);
	for(int i=0;i<size;i=i+2){
	alter_sum=alter_sum+arr[i];

	}
	System.out.println("the  alternate sum is" + alter_sum);
	}
	}
