package Interview;

public class RemoveDuplcateWordInSentence4 {
	public static void main(String[] args) {
		String str = "Sandip Gahudas Gahudas Wasekar Sandip";
		System.out.println(rmoveDuplicateWord(str));
	}

	public static String rmoveDuplicateWord(String str) {
		String[] arr = str.split(" ");
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("0")) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					arr[j] = "0";
				}
			}
			if (!arr[i].equals("0")) {
				result = result + arr[i] + " ";
			}
		}
		return result;
	}
}
