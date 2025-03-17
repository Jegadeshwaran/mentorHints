package IOStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable{
	private int student_id;
	private String name;
	public student(int student_id, String name) {
		super();
		this.student_id = student_id;
		this.name = name;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
public class studentObjectSerialization {

	public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException {
		
		student s = new student(1,"jega");
		
		FileOutputStream fileO = new FileOutputStream("student.ser");
		try {
			ObjectOutputStream o = new ObjectOutputStream(fileO);
			o.writeObject(s);
			o.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		FileInputStream fileI = new FileInputStream("student.ser");
        try (ObjectInputStream i = new ObjectInputStream(fileI)){
			student restudent = (student) i.readObject();
			System.out.println(restudent.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
