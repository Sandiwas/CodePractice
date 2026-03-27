package stringProgram;

public class ZReverseStringWithoutBuildInMethod2 {

	public static void main(String[] args) {
		String str = "Automation";
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		System.out.println(result);
	}
}
