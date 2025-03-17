package IOStream;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) throws FileNotFoundException {
		PasswordManager p = new PasswordManager();	
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("enter the choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:p.savePassword();
				   break;
			case 2:p.display();
					break;
			case 3:sc.close();
				System.exit(0);
			default:System.out.println("wrong input");
			}
		}
		
		
	}

}
