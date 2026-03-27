package Inheritance;

class Vehicle {
	public void start() {
		System.out.println("Vehicle starting");
	}
}

class Car extends Vehicle {
	public void drive() {
		System.out.println("Car driving");

	}
}

public class TestSingleLevelInheritance2 {
	public static void main(String[] args) {
		Car d = new Car();
		d.start(); //Inherited from Vehicle
		d.drive(); //defined in car
	}
}
