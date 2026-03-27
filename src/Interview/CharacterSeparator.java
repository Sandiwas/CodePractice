package Interview;

public class CharacterSeparator {
	public static void main(String[] args) {
		String str = "SDFA3jdjdn3765678#$%^#";
		
		String lettres = "";
		String numbers = "";
		String symboles = "";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				lettres += ch;
			} else if (ch >= '0' && ch <= '9') {
				numbers += ch;
			} else {
				symboles += ch;
			}
		}
		System.out.print("Ascending:\t");
		System.out.print(sortAcendingOrder(lettres)+ "\t");
		System.out.print(sortAcendingOrder(numbers)+ "\t");
		System.out.print(sortAcendingOrder(symboles)+ "\t");

		System.out.print("\nDescending:\t");
		System.out.print(decendingOrder(lettres)+ "\t");
		System.out.print(decendingOrder(numbers)+ "\t");
		System.out.print(decendingOrder(symboles) +"\t");
		
		System.out.println("\n");
		
		System.out.println("Letters: " + sortAcendingOrder(lettres));
		System.out.println("Numbers: " + sortAcendingOrder(numbers));
		System.out.println("Symbols: " + sortAcendingOrder(symboles) + "\n");

		System.out.println("Descending:");
		System.out.println("Letters: " + decendingOrder(lettres));
		System.out.println("Numbers: " + decendingOrder(numbers));
		System.out.println("Symbols: " + decendingOrder(symboles));

	}

	public static String sortAcendingOrder(String str) {

		char[] arr = str.toCharArray();
		int n = arr.length;
		String result = "";
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
		for (char ch : arr) {
			result = result + ch;
		}
		return result;
	}

	public static String decendingOrder(String str) {

		char[] arr = str.toCharArray();
		int n = arr.length;
		String result = "";
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
		for (int i = arr.length - 1; i >= 0; i--) {
			result = result + arr[i];
		}
		return result;
	}

}