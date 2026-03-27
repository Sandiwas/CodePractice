package Inheritance;

class Animal {
	void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends Animal {

	void bark() {
		System.out.println("Braking...");
	}
}

public class TestSingleLevelInheritance {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat(); //inherited from Animal
		d.bark(); // defined in dog
	}
}
