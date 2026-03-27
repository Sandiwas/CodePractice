package Interview;

public class CountNumberOccurrence11 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 10, 40, 50, 20, 30, 10 };
		countOccurrences(arr);
	}

	public static void countOccurrences(int[] arr) {
		
		for (int i = 0; i <arr.length; i++) {
			int count = 1;
			if (arr[i] == -1) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}
			if (count > 1 && arr[i] != -1) {
				System.out.print(arr[i] + " = " + count + "\n");
			}
		}

	}
}
