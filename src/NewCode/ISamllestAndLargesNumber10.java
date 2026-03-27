package NewCode;

public class ISamllestAndLargesNumber10 {
	public static void main(String[] args) {
		String str = "B4a1C3d2A9";
		String upper = "";
		String lower = "";
		String even = "";
		String odd = "";

		// Separate characters
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upper += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				lower += ch;
			} else if (ch >= '0' && ch <= '9') {
				int num = ch - '0';
				if (num % 2 == 0) {
					even += ch;
				} else {
					odd += ch;
				}
			}
		}
		// Sort each category manually
		upper = sortString(upper);
		lower = sortString(lower);
		even = sortString(even);
		odd = sortString(odd);

		// Print results
		System.out.println("Uppercase   : " + upper);
		System.out.println("Lowercase   : " + lower);
		System.out.println("Even digits : " + even);
		System.out.println("Odd digits  : " + odd + "\n");

		upper = sortDecendingString(upper);
		lower = sortDecendingString(lower);
		even = sortDecendingString(even);
		odd = sortDecendingString(odd);

		System.out.println("Uppercase   : " + upper);
		System.out.println("Lowercase   : " + lower);
		System.out.println("Even digits : " + even);
		System.out.println("Odd digits  : " + odd);

	}

	public static String sortString(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				char temp;
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return new String(arr);
	}

	public static String sortDecendingString(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				char temp;
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return new String(arr);
	}

}
