package WEEK_7_AND_8;

import java.util.ArrayList;
import java.util.Scanner;

class InvalidInputException extends Exception{
	InvalidInputException(String message){
		super(message);
	}
}

class integerList{
	
	
	int isvalidinteger() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
			System.out.println("enter the number");
			int in = sc.nextInt();
			if(in>=0) {
				return in;
			 }
			else {
				throw new InvalidInputException("please enter positive integer");
			 }
			}
			catch(InvalidInputException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	void acceptInput(int n)  {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			list.add(isvalidinteger());
		}
		System.out.println("completed");
	}
}
public class InputValidation {

	public static void main(String[] args) {
		integerList i = new integerList();
		i.acceptInput(3);

	}

}
