package Interview;

public class AcendingAndDecendingString9 {

	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";

		char[] arr = str.toCharArray();
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			char temp;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.print("Acending order : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();

		System.out.print("Decending order : ");
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j]);
		}
		
	}
}
