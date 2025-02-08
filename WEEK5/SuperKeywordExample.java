package WEEK5;
class A{
	void display() {
		System.out.println("class A");
	}
}
class B extends A{
	void display() {
		super.display();
		System.out.println("class B");
	}
}
public class SuperKeywordExample {

	public static void main(String[] args) {
		A a = new B();
		a.display();
	}

}
