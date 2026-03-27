package Inheritance;

class Vehicle1 {
	public void start() {
		System.out.println("Starting...");
	}
}

class Car1 extends Vehicle1 {
	public void drive() {
		System.out.println("Driving...");
	}
}

class Bike extends Vehicle1 {
	public void ride() {
		System.out.print("Riding....");
	}
}

public class HierachicalInheritance {
	public static void main(String[] args) {

		Car1 c = new Car1();
		Bike b = new Bike();

		c.start();
		c.drive();
		b.start();
		b.ride();

	}
}
