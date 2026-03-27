package set_3;

public class D7_DuplicateStringInUsingFor9 {
	public static void main(String[] args) {
		String[] arr = { "pune", "pune", "mumbai", "mumbai", "chennai", "chennai","chennai"  };
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr[i].equals("0")) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
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
