package WEEK_7_AND_8;


interface Drawable{
	void draw();
}
class Circle implements Drawable{
	public void draw() {
		System.out.println("Drawing circle");
	}
}
class Square implements Drawable{
	public void draw() {
		System.out.println("Drawing Square");
	}
}
class Triangle implements Drawable{
	public void draw() {
		System.out.println("Drawing Triangle");
	}
}
public class DrawExample {

	public static void main(String[] args) {
		Drawable c = new Circle();
		Drawable s = new Square();
		Drawable t = new Triangle();
		c.draw();
		s.draw();
		t.draw();
	}

}
