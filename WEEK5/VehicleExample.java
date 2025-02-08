package WEEK5;
class vehicle{
	protected void start() {
		System.out.println("The vehicle is starting");
	}
}
class Car extends vehicle{
	public void start() {
		System.out.println("Car is starting");
	}
}
public class VehicleExample {

	public static void main(String[] args) {
		vehicle v = new Car();
		v.start();
	}

}
