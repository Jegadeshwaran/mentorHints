package WEEK5;

abstract class Shape{
	abstract void draw();
}
class circle2 extends Shape{
	void draw() {
		System.out.println("drawing circle");
	}
}
class square extends Shape{
	void draw() {
		System.out.println("drawing square");
	}
}
public class ArrayExample {

	public static void main(String[] args) {
		Shape[] s = new Shape[5];
		s[0] = new circle2();
		s[1] = new square();
		s[2] = new circle2();
		s[3] = new circle2();
		s[4] = new square();
		for(Shape sh:s) {
			sh.draw();
		}
	}

}
