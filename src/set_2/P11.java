package set_2;

public class P11 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 4; k >= i; k--) {
				System.out.print("*");
			}
			for (int l = 3; l >= i; l--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}