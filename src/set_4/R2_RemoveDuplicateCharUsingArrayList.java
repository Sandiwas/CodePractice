package set_4;

import java.util.ArrayList;


public class R2_RemoveDuplicateCharUsingArrayList {
	public static void main(String[] args) {
		String str = "programming";
		System.out.println("Input String is " + str + " output string is " + removechar(str));
	}

	private static String removechar(String str) {
		char[] arr = str.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();

		for (char ele : arr) {
			if (!list.contains(ele)) {
				list.add(ele);
			}
		}
		StringBuffer sb = new StringBuffer();

		for (char ch : list) {
			sb.append(ch);
		}

		return sb.toString();
	}
}
