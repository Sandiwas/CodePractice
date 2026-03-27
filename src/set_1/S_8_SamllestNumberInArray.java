package set_1;

public class S_8_SamllestNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };
		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.print("Smallest number in array is : " + smallest);
	}
}