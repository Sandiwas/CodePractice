package Inheritance;

class A {
	void printa() {
		System.out.println("Class A");
	}
}

class B extends A {
	void printB() {
		System.out.println("Class B");
	}
}

class C extends A {
	void printC() {
		System.out.println("Class c");
	}
}

class D extends A {
	void printD() {
		System.out.println("Class D");

	}
}

public class HierachicalInheritance3 {
	public static void main(String[] args) {
		B b = new B();
		b.printa();
		b.printB();

		C c = new C();
		c.printa();
		c.printC();
		
		D d = new D();
		d.printa();
		d.printD();
	}
}
