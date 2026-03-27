
public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] arr = { 10, 4, 7, 15, 3 ,6};
		int largest = arr[0];
		int secondLargest = arr[0];

		// find largest number
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
			}
		// find second largest
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println(secondLargest);

	}

}
