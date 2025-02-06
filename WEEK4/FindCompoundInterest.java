package WEEK4;

public class FindCompoundInterest {
	 static double compoundInterest(double PA,double n,double interest) {
		        double amt =  PA*Math.pow(1+interest,n);
		        return amt-PA;
	 }
	public static void main(String[] args) {
		double pricipleAmount = 1000;
		double noOfYears =2;
		double interest = 5.0/100;
		System.out.println(compoundInterest(pricipleAmount,noOfYears,interest));
		
	}

}
