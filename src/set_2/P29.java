package set_2;

public class P29 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			char ch;
			if (i % 2 == 1) {
				ch = '*';
			} else {
				ch = '&';
			}
			for (int j = 1; j <= 4; j++) {
				System.out.print(ch);
			}
			System.out.println("");
		}
	}
}
