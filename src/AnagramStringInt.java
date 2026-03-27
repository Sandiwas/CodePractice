import java.util.Arrays;

class AnagramStringInt {
	public static void main(String[] args) {
		String s1 = "ar m y";
		String s2 = "m a r y";

		s1 = getStringWithspaceLowerCaseString(s1);
		s2 = getStringWithspaceLowerCaseString(s2);

		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();

		sortCharArray(arr1);
		sortCharArray(arr2);

		if (isEqual(arr1, arr2)) {
			System.out.println("Anagram String");
		} else {
			System.out.println("Not Anagram String");
		}
	}

	public static String getStringWithspaceLowerCaseString(String str) {

		char[] arr = str.toCharArray();
		String result = "";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				result = result + arr[i];
			}
		}
		return result.toLowerCase();
	}

	
	public static void sortCharArray(char[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n -i- 1; j++) {
				if (arr[i] > arr[j + 1]) {
					char temp = arr[i];
					arr[i] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static boolean isEqual(char[] arr1, char[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}
}
