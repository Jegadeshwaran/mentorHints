package WEEK8;


class Account{
	int balance  = 0;
	
	public synchronized void deposit(int amt) {
		System.out.println("running 1");
		balance = amt;
		System.out.println("Amount successfully deposited " + balance);
	
}
	
	public  synchronized void withdraw(int amt) {
		System.out.println("running 0");
		 if(balance>=amt) {
			balance = balance-amt;
			System.out.println("balance after withdraw " + balance);
		 }
		 else {
			 System.out.println("insuffient balance");
		 }
	}
}

class raju extends Thread{
	private Account acc;
	private String process;
	private int amt;
	
	raju(Account acc,String process,int amt){
		this.acc = acc;
		this.process =process;
		this.amt = amt;
		}
	
	public void run() {
		if(process.equals("withdraw")) {
			acc.withdraw(amt);
		}
		if(process.equals("deposit")) {
			acc.deposit(amt);
		}
		
	}
}
public class BankAccount {

	public static void main(String[] args) {
		Account account = new Account();
		Thread t2 = new Thread(new raju(account,"withdraw",500));
		Thread t1 = new Thread(new raju(account,"deposit",500));
		
		t1.start();
		t2.start();
	}

}
