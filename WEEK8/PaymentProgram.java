package WEEK8;

interface Payment{
	void pay(double amount);
}

class Account1{
	private double Balance;
	
	public Account1(double balance) {
		this.Balance = balance;
	}
	public double getBalance() {
		return Balance;
	}

	public void setBalance(double d) {
		Balance = d;
	}
	
}
class CreditcardPay implements Payment{
	Account1 acc;
	CreditcardPay(Account1 acc){
		this.acc = acc;
	}
	public void pay(double amount) {
		if(acc.getBalance()>amount) {
			System.out.println("Creditcard payment successful");
			acc.setBalance(acc.getBalance()-amount);
			System.out.println("Remaining balance" + acc.getBalance());
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
}

class UPIPay implements Payment{
	Account1 acc;
	UPIPay(Account1 acc){
		this.acc = acc;
	}
	public void pay(double amount) {
		if(acc.getBalance()>amount) {
			System.out.println("UPI payment successful");
			acc.setBalance(acc.getBalance()-amount);
			System.out.println("Remaining balance" + acc.getBalance());
		}
		else {
			System.out.println("Insufficient balance");
		}
	}
}
public class PaymentProgram {

	public static void main(String[] args) {
		Account1 acc = new Account1(2000);
		CreditcardPay c = new CreditcardPay(acc);
		UPIPay u = new UPIPay(acc);
		c.pay(500);
		u.pay(700);
	}

}
