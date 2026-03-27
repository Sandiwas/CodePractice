package ExtendsAndImplemensKeyword;

//A class can implements one or multiple interface 

interface Vehicle {
	void start();
}

interface Machine {
	void stop();
}

class Car implements Vehicle, Machine {

	public void stop() {
		System.out.println("Car Stop with break");
	}

	public void start() {
		System.out.println("Car start with key");
	}
}

public class C2_ImplementsKeyword {
	public static void main(String[] args) {
		Car c = new Car();

		c.start();
		c.start();
	}
}
