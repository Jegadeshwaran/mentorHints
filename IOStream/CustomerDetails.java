package IOStream;

import java.io.BufferedReader;
import java.io.File;
import java.io.Reader;
import java.io.FileReader;
import java.io.IOException;


public class CustomerDetails {

	public static void main(String[] args) throws IOException {
		File file = new File("CustomerDetails.txt");
		FileReader f = new FileReader(file);
		int lineCount = 0;
		
		try (BufferedReader in = new BufferedReader(f)) {
			String s = in.readLine();
			while(s != null) {

				lineCount += 1;

				 s = in.readLine();
			}
		}
		System.out.println(lineCount);
	}

}
