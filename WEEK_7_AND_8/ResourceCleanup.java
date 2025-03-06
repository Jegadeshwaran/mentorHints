package WEEK_7_AND_8;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ResourceCleanup {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		String filePath = "sample.txt";
		Reader fis = new FileReader(filePath);
		try(BufferedReader br = new BufferedReader(fis)){
			String line;
			while((line=br.readLine()) != null) {
				System.out.println(line);
			}
		}
	}

}
