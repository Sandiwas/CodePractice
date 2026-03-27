package ExtendsAndImplemensKeyword;

// class use extends to inherit another class 
//Interface also  use extends to inherit another interface 
interface Animal1 {
	abstract void eat();
}

interface Bird {
	abstract void fly();
}

interface Pet extends Animal1, Bird {
	abstract void play();
}

class Dog1 implements Pet {
	public void eat() {
		System.out.println("Dog eats bones");
	}

	public void fly() {
		System.out.println("bride fly");
	}

	public void play() {
		System.out.println("Dog play with bird");
	}
}

public class C4_MultipleInterfaceExtends {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.eat();
		d.play();
		d.play();
	}
}
