package WEEK4;

public class Palindrome {

	public static void main(String[] args) {
		int[] array = {1,3,2,2,1};
		int i=array.length-1;
		int sign=1;
		for(int j=0;j<array.length/2;j++) {
			if(array[j] != array[i]) {
				sign = -1;
				break;
			}
			i--;
		}
		if(sign == -1) {
			System.out.println("array is not palindrome");
		}
		else {
			System.out.println("array is palindrome");
		}
	}

}
