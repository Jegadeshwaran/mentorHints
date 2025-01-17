
public class PerfectSquare {

	public static void main(String[] args) {
		int n=24;
		int range = n/2;
		boolean perfect=false;
		for(int i=1;i<range;i++) {
			if(i*i==n) {
				perfect = true;
				break;
			}
			if(i*i>n) {
				break;
			}
		}
		if(perfect)
			System.out.println("The given number is perfect square");
		else
		    System.out.println("Not a perfect square");
	}

}
