import java.util.Scanner;
class roots{
	public static void main(String args[]){
		System.out.println("Vidhi Jindal, 24csu324");
	Scanner sc= new Scanner(System.in);
	System.out.println("enter value of a");
	double a=sc.nextDouble();
	System.out.println("enter value of b");
	double b=sc.nextDouble();
	System.out.println("enter value of c");
	double c=sc.nextDouble();

	double d= (b*b)-4*a*c;
	if(a==0){
	System.out.println("not a quadratic equation");
	}
	else{
	if(d>0){
	double r1= (-b +Math.sqrt(d))/(2*a);
	double r2= (-b -Math.sqrt(d))/(2*a);
	System.out.println("the roots are real and distinct"+r1+","+ r2);

	}
	else if(d==0){
	double r = -b / (2 * a);
    System.out.println("Roots are real and equal: " + r + " , " + r);
	}
	else {
    double real = -b / (2 * a);
    double imag = Math.sqrt(-d) / (2 * a);
    System.out.println("Roots are complex: " + real + " + " + imag + "i , " + real + " - " + imag + "i");
            }
	}


	}
}