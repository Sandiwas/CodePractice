package StringAndStringBuffer;

public class Equlas1 {

	public static void main(String[] args) {

		StringBuffer sb1 = new StringBuffer("Sandip");
		StringBuffer sb2 = new StringBuffer("Sandip");

		System.out.println(sb1 == sb2);
		System.out.println(sb1.equals(sb2));
	}

}
