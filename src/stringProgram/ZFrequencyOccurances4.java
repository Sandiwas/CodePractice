package stringProgram;

public class ZFrequencyOccurances4  {

	public static void main(String[] args) {
		String str = "Automation";
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0') {
				continue; // already processed
			}
			char ch = arr[i];
			int count = 0;

			for (int j = 0; j < arr.length; j++) {
				if (arr[j] == ch) {
					count++;
					arr[j] = '0'; // mark as done
				}
			}
			System.out.println(ch + " = " + count);
		}
	}
}
