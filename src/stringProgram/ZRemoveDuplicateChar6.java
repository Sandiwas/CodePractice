package stringProgram;

public class ZRemoveDuplicateChar6 {

	public static void main(String[] args) {
		String str = "Automation";
		str = removeSpace(str);
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0') {
				continue; // already processed
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = '0'; // mark as done
				}
			}
			if (arr[i] != '0') {
				System.out.print(arr[i] + "");
			}
		}
	}

	public static String removeSpace(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				result = result + str.charAt(i);
			}
		}
		return result.toLowerCase();
	}
}
