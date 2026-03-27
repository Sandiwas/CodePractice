package Interview;

public class CheckArmstrongString6 {
	public static void main(String[] args) {
		String str = "radar";
		System.out.println(isArmstrongString(str));
	}

	public static String reverseString(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

	public static String isArmstrongString(String str) {
		if (str.equals(reverseString(str))) {
			return "Given String is Aramstrong String";
		} else {
			return "Given String is Not Aramstrong String";
		}
	}
}
