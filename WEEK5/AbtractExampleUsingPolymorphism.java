package WEEK5;

import java.util.Scanner;

abstract class shape1{
	abstract void area();
}
class Rectangle1 extends shape{
	private int length;
	private int width;
	Rectangle1(int l,int w){
		length = l;
		width = w;
	}
	void area() {
		System.out.println(length*width);
	}
}
class circle1 extends shape{
	private int radius;
	circle1(int r){
		radius =r;
	}
	void area() {
		double area = 3.14 * radius;
		System.out.println(area);
	}
}
public class AbtractExampleUsingPolymorphism {

	public static void main(String[] args) {
		circle1 c = new circle1(5);
		c.area();

	}

}
