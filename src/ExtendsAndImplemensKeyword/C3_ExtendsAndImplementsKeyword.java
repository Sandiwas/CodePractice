package ExtendsAndImplemensKeyword;

//A class extends another class and at the same time implements interface \
class Person {
	public void walk() {
		System.out.println("person can walk");
	}
}

interface Son {
	void play();
}

interface Employee {
	void work();
}

class Devloper extends Person implements Employee, Son {
	public void work() {
		System.out.println("Devloper write code");
	}

	public void play() {
		System.out.println("Son play");
	}
}

public class C3_ExtendsAndImplementsKeyword {
	public static void main(String[] args) {
		Devloper d = new Devloper();
		d.work();
		d.walk();
		d.play();
	}
}
