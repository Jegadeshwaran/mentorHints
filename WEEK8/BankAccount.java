package WEEK8;


class Account{
	int balance  = 500;
	public  void withdraw(int amt) {
		
			balance = balance-amt;
			System.out.println("balance after withdraw" + balance);
		
	}
}

class raju extends Thread{
	Account account;
	private int amt;
	raju(Account acc,int amt){
		account = acc;
		this.amt = amt;
	}
	public void run() {
		account.withdraw(amt);
		System.out.println("raju");
	}
}
class rani extends Thread{
	Account account;
	private int amt;
	rani(Account acc,int amt){
		account = acc;
		this.amt = amt;
	}
	public void run() {
		account.withdraw(amt);
		System.out.println("rani");
	}
}
public class BankAccount {

	public static void main(String[] args) {
		Account account = new Account();
		Thread t1 = new Thread(new raju(account,300));
		Thread t2 = new Thread(new raju(account,300));
		t1.start();
		t2.start();
	}

}
