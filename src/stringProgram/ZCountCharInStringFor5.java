package stringProgram;

public class   ZCountCharInStringFor5{

	public static void main(String[] args) {
		String str = "Automation";
		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0') {
				continue; // already processed
			}
			int count = 1;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					count++;
					arr[j] = '0'; // mark as done
				}
			}
			if (count > 1 && arr[i] != '0') {
				System.out.println(arr[i] + " = " + count);
			}
		}
	}
}
