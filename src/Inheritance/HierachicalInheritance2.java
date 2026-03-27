package Inheritance;

class Animal1 {
	public void eat1() {
		System.out.println("eating...");

	}
}

class Dog1 extends Animal1 {
	public void bark() {
		System.out.println("dog bark...");
	}
}

class Cat extends Animal1 {
	public void meow() {
		System.out.println("Cat meow...");
	}
}

public class HierachicalInheritance2 {
	public static void main(String[] args) {

		Dog1 d = new Dog1();
		Cat c = new Cat();

		d.eat1();
		d.bark();
		c.eat1();
		c.meow();

	}
}
