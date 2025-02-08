package WEEK5;
class A1{
	static void display() {
		System.out.println("superclass static method");
	}
	void print() {
		System.out.println("superclass print method");
	}
}
class B1 extends A1{
	static void display() {
		System.out.println("subclass static method");
	}
	void print() {
		System.out.println("subclass print method");
	}
}
public class StaticExample {

	public static void main(String[] args) {
		A1 a = new B1();
		a.display();
		a.print();
		B1.display();
	}

}
