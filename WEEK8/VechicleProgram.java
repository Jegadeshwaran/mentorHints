package WEEK8;

interface Vechicle{
	 default void start() {
		System.out.println("vechicle is starting");
	}
}

class Car implements Vechicle{
	public void start() {
		System.out.println("Car is starting");
	}
}
public class VechicleProgram {

	public static void main(String[] args) {
		Vechicle c = new Car();
		c.start();
	}

}
