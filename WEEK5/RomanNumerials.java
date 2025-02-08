package WEEK5;

public class RomanNumerials {
	static int getNumericValue(char c) {
		switch(c) {
		case 'I':return 1;
		case 'V':return 5;
		case 'X':return 10;
		case 'L':return 50;
		case 'C':return 100;
		case 'D':return 500;
		case 'M':return 1000;
		default:return 0;
		}
	}
	static int findNumber(String s) {
		int total = 0;
		int prev =0;
		for(int i=s.length()-1;i>=0;i--) {
			int n = getNumericValue(s.charAt(i));
			if(n<prev) {
				total -=n;
			}
			else {
				total +=n;
			}
			prev=n;
		}
		return total;
	}
	public static void main(String[] args) {
		String s="IX";
		System.out.println(findNumber(s));
		
		
	}

}
