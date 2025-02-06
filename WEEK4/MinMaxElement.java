package WEEK4;

public class MinMaxElement {

	public static void main(String[] args) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int[] array = {1,7,2,9,4,3,5};
		for(int n:array) {
			min = Math.min(n, min);
			max = Math.max(n, max);
		}
		System.out.println("Minimum Element "+min);
		System.out.println("Maximum Element "+max);
	}

}
