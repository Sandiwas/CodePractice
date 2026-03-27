package set_2;

public class P28 {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				char ch = (i % 2 == 0) ? '*' : '&';
				System.out.print(ch);
			}
			System.out.println(" ");

		}
	}
}

 