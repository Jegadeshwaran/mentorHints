package WEEK5;
abstract class Person{
	protected String name;
	protected int age;
	Person (String name,int age){
		this.name=name;
		this.age=age;
	}
	abstract void display();
} 
class Student extends Person{
	private String grade;
	Student(String name, int age, String grade){
		super(name,age);
		this.grade=grade;
	}
	void display() {
		System.out.println(name);		
		System.out.println(age);
		System.out.println(grade);

	}
}
public class PersonExample {

	public static void main(String[] args) {
	Person p = new Student("Jega",24,"B+");
	p.display();
	}

}
