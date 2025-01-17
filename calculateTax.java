
public class calculateTax {

	public static void main(String[] args) {
		int income = 3_10_000;
		float taxPercentage = 2.2f;
		float tax = income*(taxPercentage/100);
		System.out.println(tax);
	}

}
