package WEEK_7_AND_8;

class InsufficientFundsException extends Exception{
	public InsufficientFundsException(String message) {
		super(message);
	}
}

class Bank{
	double amount = 2000.00;
	double originalbalance = amount;
	public void withdrawal(double amount) throws InsufficientFundsException{
		if(amount>this.amount) {
			amount = originalbalance;
			throw new InsufficientFundsException("Insufficient fund please enter valid amount");
		}
		else {
			this.amount = this.amount-amount;
			System.out.println("remove the card and wait for the cash");
		}
	}
}
public class TransactionRollBacl {

	public static void main(String[] args) {
		Bank b = new Bank();
		try {
			b.withdrawal(2500.00);
		} catch (InsufficientFundsException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
