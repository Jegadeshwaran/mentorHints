package WEEK_7_AND_8;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		try {
			String s = "5";
			int n = Integer.parseInt(s);
			try {
				n = n/0;
			}
			catch(ArithmeticException e) {
				e.printStackTrace();
			}
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}

	}

}
