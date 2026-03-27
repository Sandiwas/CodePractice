package set_1;

public class S_9_LargestNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };
		int largest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.print("Largest number in array is : " + largest);
	}
}