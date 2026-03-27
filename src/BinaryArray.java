import java.util.Arrays;

public class BinaryArray {

	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 1, 0, 1, 0, 1 };
		int zeroCount = 0;
		// zero count
		for (int num : arr) {
			if (num == 0) {
				zeroCount++;
			}
		}
		// zero set first
		for (int i = 0; i < zeroCount; i++) {
			arr[i] = 0;
		}
		// set 1
		for (int i = zeroCount; i < arr.length; i++) {
			arr[i] = 1;
		}

		System.out.println(Arrays.toString(arr));
		for (int num : arr) {
			System.out.print(num+" ");
		}
	}
}
