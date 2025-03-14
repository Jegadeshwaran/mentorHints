package WEEK8;

import java.util.Scanner;

interface Shape{
	public void calculateArea();
}

class Circle implements Shape{
	private float PI = 3.14f;
	public void calculateArea() {
		System.out.println("Enter the radius of the circle");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		System.out.println("Area of circle is "+(PI*r));
	}
}

class Rectangle implements Shape{
	public void calculateArea() {
		System.out.println("Enter the Length of the circle");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		System.out.println("Enter the Breadth of the circle");
		int breadth = sc.nextInt();
		System.out.println("Area of Rectangle is "+ (length*breadth));
	}
}
public class ShapeExample {

	public static void main(String[] args) {
		Shape c = new Circle();
		Shape r = new Rectangle();
		c.calculateArea();
		r.calculateArea();
	}

}
