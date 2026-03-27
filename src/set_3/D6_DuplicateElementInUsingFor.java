package set_3;

public class D6_DuplicateElementInUsingFor {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 2, 6, 3, 1,2 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
