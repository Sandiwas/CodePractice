import java.util.Arrays;

public class SelelctionSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 4, 5, 0, 6, 7, 8 };

		int n = arr.length;
		System.out.println(n);
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.print(Arrays.toString(arr));
	}
}
