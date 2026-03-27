package Inheritance;

class A2 {
	void displyA() {
		System.out.println("class A method");
	}
}

class B2 extends A2 {
	void displayB() {
		System.out.println("class B method");
	}
}

class C2 extends A2 {
	void displayC() {
		System.out.println("class C method");
	}
}

class D2 extends B2 {
	void displayD() {
		System.out.println("class D method");
	}
}

public class HybridInheritance {
	public static void main(String[] args) {
		D2 d = new D2();
		d.displyA();
		d.displayB();
		d.displayD();

		C2 c = new C2();
		c.displyA();
		c.displayC();
	}
}
