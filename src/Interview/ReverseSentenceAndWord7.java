package Interview;

public class ReverseSentenceAndWord7 {
	public static void main(String[] args) {
		String str = "Sandip Gahudas Wasekar";

		System.out.println(reverseString(str));
	}

	public static String reverseString(String str) {
		
		String[] arr = str.split(" ");
		String result = "";
		
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			String reverserString = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverserString = reverserString + word.charAt(j);
			}
			result = result + reverserString + " ";
		}
		return result;
	}
}
