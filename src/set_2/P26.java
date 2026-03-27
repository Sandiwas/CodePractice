package set_2;

public class P26 {

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				char ch = (i % 2 == 0) ? '*' : '&';
				System.out.print(ch);
			}
			System.out.println(" ");

		}
	}
}