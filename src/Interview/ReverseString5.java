package Interview;

public class ReverseString5 {
	public static void main(String[] args) {
		String str = "Sandip Gahudas Wasekar";
		System.out.println(removeSapceMakeLowerCase(str));
		str = removeSapceMakeLowerCase(str);
		System.out.println(reverseString(str));
	}

	public static String reverseString(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
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
