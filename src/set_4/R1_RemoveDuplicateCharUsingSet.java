package set_4;

import java.util.LinkedHashSet;
import java.util.Set;

public class R1_RemoveDuplicateCharUsingSet {
	public static void main(String[] args) {
		String str = "programming";
		System.out.println("Input string is " + str + " output string is " +removChar(str));
	}

	public static String removChar(String str) {

		char[] arr = str.toCharArray();
		Set<Character> mySet = new LinkedHashSet<>();

		for (char ele : arr) {
			mySet.add(ele);
		}
		
		StringBuffer sb = new StringBuffer();

		for (char ele : mySet) {
			sb.append(ele);
		}
		return sb.toString();
	}
}
