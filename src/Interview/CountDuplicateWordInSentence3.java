package Interview;

public class CountDuplicateWordInSentence3 {
	public static void main(String[] args) {
		String str = "Sandip Gahudas Wasekar SandiP";
		findDuplicateWord(str);
	}

	public static void findDuplicateWord(String str) {
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr[i].equals("0")) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					count++;
					arr[j] = "0";
				}
			}
			if (count > 1 && !arr[i].equals("0")) {
				System.out.println(arr[i] + " = " + count);
			}
		}
	}
}
