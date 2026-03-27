package set_3;

public class D7_DuplicateStringInUsingFor {
	public static void main(String[] args) {
		String[] arr = { "pune", "pune", "mumbai", "mumbai", "chennai", "chennai" };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println(arr[i]);
				}
			}
		}
	}
}
