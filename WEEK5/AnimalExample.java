package WEEK5;
class Animal{
	void sound() {
		System.out.println("animal sound");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog sound");
	}
}
class Cat extends Animal{
	void sound() {
		System.out.println("Cat sound");
	}
}
public class AnimalExample {
	static void makeSound(Animal animal) {
		animal.sound();
	}
	public static void main(String[] args) {
		Animal d = new Dog();
		Animal c = new Cat();
		makeSound(d);
		makeSound(c);
	}

}
