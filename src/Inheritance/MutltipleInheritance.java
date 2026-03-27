package Inheritance;

interface Parent1 {
	public void methodParent1();
}

interface Parent2 {
	public void methodParent2();
}

class Child implements Parent1, Parent2 {

	public void methodParent1() {
		System.out.println("Method form Parent1 ");
	}

	public void methodParent2() {
		System.out.println("Method form Parent2 ");
	}
}

public class MutltipleInheritance {
	public static void main(String[] args) {

		Child c = new Child();
		c.methodParent1();
		c.methodParent2();
	}

}
