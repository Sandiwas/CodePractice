package ExtendsAndImplemensKeyword;

// class use extends to inherit another class 
//Interface also  use extends to inherit another interface 
interface InterfaceA {
	abstract void methodA();
}

interface InterfaceB {
	abstract void methodB();
}

interface InterfaceC extends InterfaceA, InterfaceB {
	abstract void methodC();
}

class MyClass implements InterfaceC {
	public void methodA() {
		System.out.println("Method A implemented");
	}

	public void methodB() {
		System.out.println("Method B implemented");
	}

	public void methodC() {
		System.out.println("Method C implemented");
	}
}

public class C5_MultipleInterfaceExtends {
	public static void main(String[] args) {
		MyClass d = new MyClass();
		d.methodA();
		d.methodB();
		d.methodC();
	}
}
