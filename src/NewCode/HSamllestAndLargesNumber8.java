package NewCode;

public class HSamllestAndLargesNumber8 {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 3, 2, 4, 6, 5, 9, 1 };

		int smallest = arr[0];
		int largesrt = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largesrt) {
				largesrt = arr[i];
			} else if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println("Samllest number in array : " + smallest);
		System.out.println("Largest number in array : " + largesrt);

	}
}
