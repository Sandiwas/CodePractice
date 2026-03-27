package set_2;

public class P3 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
