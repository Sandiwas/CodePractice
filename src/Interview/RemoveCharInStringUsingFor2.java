package Interview;

public class RemoveCharInStringUsingFor2 {

	public static void main(String[] args) {
		String str = "Sandip Gahudas Wasekar";
		str = removeSapceMakeLowerCase(str);
		System.out.println(removeDuplicateChar(str));
	}

	public static String removeDuplicateChar(String str) {
		char[] arr = str.toCharArray();
		String result = "";

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0') {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = '0';
				}
			}
			if (arr[i] != '0') {
				result = result + arr[i];
			}
		}
		return result;
	}

	public static String removeSapceMakeLowerCase(String str) {
		char[] arr = str.toCharArray();
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				result = result + arr[i];
			}
		}
		return result.toLowerCase();
	}
}
