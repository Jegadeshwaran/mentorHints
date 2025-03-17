package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PasswordManager {

	
	Scanner sc = new Scanner(System.in);
	
	public void savePassword() throws FileNotFoundException {
		System.out.println("Enter the password : ");
		String password = sc.next();
		FileOutputStream fileO = new FileOutputStream("password.txt",true);
		String passwithLine = password+System.lineSeparator();
		byte[] b = passwithLine.getBytes();
		try {
			fileO.write(b);
			System.out.println("password stored");
			fileO.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void display() throws FileNotFoundException {
		FileInputStream fileO = new FileInputStream("password.txt");
		Scanner sc = new Scanner(fileO);
		
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			System.out.println(s);
		}
		sc.close();
	}
}
