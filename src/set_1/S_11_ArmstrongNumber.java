package set_1;

public class S_11_ArmstrongNumber {
	public static void main(String[] args) {
		int a;
		int n = 407;
		int c = 0;
		int temp = n;
	
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c) {
			System.out.println("Given number is armstrong number");
		} else {
			System.out.println("Given number is not armstring number");
		}
	}
}