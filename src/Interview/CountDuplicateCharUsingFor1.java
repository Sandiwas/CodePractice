package Interview;

public class CountDuplicateCharUsingFor1 {

	public static void main(String[] args) {

		String str = "Sandip Gahudas Wasekar";
		str = removeSapceMakeLowerCase(str);
		System.out.println(str);	
	}
	public static String removeSapceMakeLowerCase(String str) {
		char[] arr = str.toCharArray();
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ')
				result = result + arr[i];
		}
		return result.toLowerCase();
	}
}
