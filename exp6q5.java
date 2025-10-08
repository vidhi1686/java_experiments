abstract class Marks{
	abstract double getPer();

}
class A extends Marks{
	double s1,s2,s3;
	A(double s1,double s2, double s3){
	this.s1=s1;
	this.s2=s2;
	this.s3=s3;
	}
	double getPer() {
        return (s1 + s2 + s3) / 3.0;
    }
}
class B extends Marks{
	double s1,s2,s3,s4;
	B(double s1,double s2, double s3,double s4){
	this.s1=s1;
	this.s2=s2;
	this.s3=s3;
	this.s4=s4;

	}
	double getPer() {
        return (s1 + s2 + s3 + s4) / 4.0;
    }
}
public class exp6q5 {
    public static void main(String[] args) {
        System.out.println("Vidhi Jindal,24csu324");
        A studentA = new A(85, 90, 80);         
        B studentB = new B(75, 80, 70, 90);     

        System.out.println("Percentage of Student A: " + studentA.getPer() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPer() + "%");
    }
}
