abstract class Bank{
	abstract void getBalance();

}
class BankA extends Bank{
	void getBalance(){
	System.out.println("Balance in A is 100 dollars");
	}
}
class BankB extends Bank{
	void getBalance(){
	System.out.println("Balance in B is 150 dollars");
	}
}
class BankC extends Bank{
	void getBalance(){
	System.out.println("Balance in B is 200 dollars");
	}
}
public class exp6q4{
	public static void main(String args[]){
		System.out.println("Vidhi Jindal, 24csu324");
	BankA a= new BankA();
	a.getBalance();
	BankB b= new BankB();
	b.getBalance();
	BankC c= new BankC();
	c.getBalance();
	}
}