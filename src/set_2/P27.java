package set_2;

public class P27 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			char ch = (i % 2 == 0) ? '*' : '&';

			for (int j = 4; j >= i; j--) {
				System.out.print(ch);
			}
			System.out.println(" ");
		}
	}
}

 