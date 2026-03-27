package stringProgram;

public class ZSeprateAndSort1 {
	public static void main(String[] args) {
		String str = "A5C2B9D1";

		String letters = "";
		String numbers = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				letters += ch;
			} else {
				numbers += ch;
			}
		}
		System.out.println(letters);
		System.out.println(numbers+"\n");

		System.out.println(acendingsort(letters));
		System.out.println(acendingsort(numbers)+"\n");

		System.out.println(decendingSort(letters));
		System.out.println(decendingSort(numbers)+"\n");

	}

	public static String acendingsort(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		char temp;
		String result = "";
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// for(int i=0;i<arr.length;i++){
		// result=result+arr[i];
		// }
		return String.valueOf(arr);
	}

	public static String decendingSort(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		char temp;
		String result = "";
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// for(int i=0;i<arr.length;i++){
		// result=result+arr[i];
		// }
		return String.valueOf(arr);
	}
}
