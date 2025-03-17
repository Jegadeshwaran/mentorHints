package IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class MergeFileExample {

	public static void main(String[] args) {

		
		try {
			File file1 = new File("file1.txt");
			File file2 = new File("file2.txt");
			File file3 = new File("file3.txt");
			File[] fileList = {file1,file2,file3};
			File Mergedfile = new File("MergerFile.txt");
			Mergedfile.createNewFile();
			for(int n=0;n<fileList.length;n++) {
			InputStream inputStream = new FileInputStream(fileList[n]);
			OutputStream outputStream = new FileOutputStream(Mergedfile,true);
			try {
				int i = inputStream.read();
				while(i != -1) {
					System.out.println((char)i);
					outputStream.write((char)i);
					 i = inputStream.read();
				}
			}finally {
				inputStream.close();
				outputStream.close();
			}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
