package WEEK_7_AND_8;


class BankAccount{
	double accountBalance;
	BankAccount(double amount){
		accountBalance = amount;
	}
	public synchronized void deposit(double amount) {
		System.out.println("depositing");
		accountBalance += amount;
	}
	public synchronized void withdraw(double amount) {
		if(accountBalance<amount) {
			System.out.println("Insufficient fund");
		}
		else {
			accountBalance -= amount;
			System.out.println("Take the card and wait for cash");
		}
	}
}
class Transaction extends Thread{
	BankAccount account;
	boolean isDeposit;
	double amount;
	Transaction(BankAccount account,boolean isDeposit,double amount){
		this.account = account;
		this.isDeposit = isDeposit;
		this.amount = amount;
	}
	
	public void run() {
		if(isDeposit) {
			account.deposit(amount);
		}
		else {
			account.withdraw(amount);
		}
	}
}
public class BankExample {

	public static void main(String[] args) {
		BankAccount B = new BankAccount(1000);
		Thread t1 = new Thread(new Transaction(B,false,1500));
		Thread t2 = new Thread(new Transaction(B,true,100));
		Thread t3 = new Thread(new Transaction(B,false,500));
		Thread t4 = new Thread(new Transaction(B,true,500));
		Thread t5 = new Thread(new Transaction(B,false,700));
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();

	}

}
