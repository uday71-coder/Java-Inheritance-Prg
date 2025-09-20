package inheritancepack;

//1.Design of account object.[Abstract Class]
abstract class Account {
	protected String cname;
	protected long accno;
	protected double balance;

	abstract public void createAccount(String cname, long accno, double balance);

	abstract public void printAccount();

	public void showLoans() {
		System.out.println("Loans Available");
		System.out.println("-".repeat(50));
		System.out.println("1. Home Loan");
		System.out.println("2. Car Loan");
		System.out.println("3. Personal Loan");
	}
}

//2. Implementation of Design.[Concrete Class]
class MyAccount extends Account {

	@Override
	public void createAccount(String cname, long accno, double balance) {
		this.cname = cname;
		this.accno = accno;
		this.balance = balance;
	}

	@Override
	public void printAccount() {
		System.out.println("Account Details.");
		System.out.println("-".repeat(50));
		System.out.println("Customer Name = " + cname);
		System.out.println("Account Number = " + accno);
		System.out.println("Balance = " + balance);
		System.out.println("-".repeat(50));
	}

	// Additional Methods.
	public void showCurrentBalance() {
		System.out.println("Current Balance in Account Number " + accno + " is: " + balance);
		System.out.println("-".repeat(50));
	}

}

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3.Create and use object.
		// 3.1 Super class reference variable programming.
		Account acc = new MyAccount();
		acc.createAccount("Harish", 2056352415L, 90000.0);
		acc.printAccount();
		acc.showLoans();
		System.out.println();
		// 3.2 Sub class reference variable programming.
		MyAccount m1 = new MyAccount();
		m1.createAccount("Uday Sai", 2364410502L, 250000.00);
		m1.printAccount();
		m1.showCurrentBalance();
		m1.showLoans();

	}

}
