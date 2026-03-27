import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 4, 5, 0, 6, 7, 8 };

		int n = arr.length;
		System.out.println(n);
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}
