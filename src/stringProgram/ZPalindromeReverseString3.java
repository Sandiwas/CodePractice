package stringProgram;

public class ZPalindromeReverseString3 {

	public static void main(String[] args) {
		String str = "Automation";
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
	
		if (str.equalsIgnoreCase(result)) {
			System.out.println("Pralindriome String");
		} else {
			System.out.println("Not Pralindriome String");
		}
	}
}
