package ExtendsAndImplemensKeyword;
//

//A class can extends another class(only one);

//The child class (Subclass) inherits fields and methods from the parents class

class Animal {
	public void eat() {
		System.out.println("This animal eating food");
	}
}

class Dog extends Animal {
	public void bark() {
		System.out.println("Dog bark ");
	}
}

public class C1_ExtendsKeyword {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}