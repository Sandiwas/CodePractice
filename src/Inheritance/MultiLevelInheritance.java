package Inheritance;

class First {
	public void firstName() {
		System.out.println("First name ");
	}
}

class Second extends First {
	public void middleName() {
		System.out.println("Middle name");
	}
}

class Third extends Second {
	public void lastName() {
		System.out.println("Last name");
	}
}

public class MultiLevelInheritance {
	public static void main(String[] args) {
		Third t = new Third();
		t.firstName();
		t.middleName();
		t.lastName();
	}
}
