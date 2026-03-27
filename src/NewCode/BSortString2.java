package NewCode;

public class BSortString2 {
	public static void main(String[] args) {
		String str = "testing";
		char[] arr = str.toCharArray();
		int n = arr.length;
		char temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.print(new String(arr));
	}
}
