package WEEK5;

import java.util.Scanner;

abstract class shape{
	abstract void area();
}
class Rectangle extends shape{
	void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length and width");
		int l=sc.nextInt();
		int w=sc.nextInt();
		System.out.println(l*w);
	}
}
class circle extends shape{
	void area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius of the circle");
		int r =sc.nextInt();
		double area = 3.14 * r;
		System.out.println(area);
	}
}
public class AbstractExampleShape {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.area();
	}

}
