package IOStream;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Book implements Externalizable{

	
	private String title;
	private String author;
	private double price;
	
	public Book(){
		this.title = " ";
		author = " ";
		price = 0.0;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeChars(author);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		author = in.readLine();
	}
	
}
public class BookProgram {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
		
		Book b = new Book();
		b.setAuthor("jega");
		//serialize
		FileOutputStream fileO = new FileOutputStream("serializeViaExternalizable.txt");
		ObjectOutputStream o = new ObjectOutputStream(fileO);
		o.writeObject(b);
		o.close();
		
      //deserialize
		
		FileInputStream fileI = new FileInputStream("serializeViaExternalizable.txt");
		try (ObjectInputStream i = new ObjectInputStream(fileI)) {
			Book reBook = (Book) i.readObject();
			System.out.println(reBook.getAuthor());
			i.close();
		}
	}

}
