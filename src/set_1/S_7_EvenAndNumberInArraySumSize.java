package set_1;

import java.util.ArrayList;

public class S_7_EvenAndNumberInArraySumSize {
	public static void main(String[] args) {

		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };

		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}

		int sumOfEven = 0;
		int sumOfOdd = 0;
		
		System.out.print("Even number are : ");
		for (int no : even) {
			sumOfEven = sumOfEven + no;
			System.out.print(no + " ");
		}
		System.out.println(" ");
		System.out.println("Sum of all even number is : " + sumOfEven);
		System.out.println("Total number of even number is:  " + even.size());
		
		System.out.print("Odd number are : ");
		for (int no : odd) {
			sumOfOdd = sumOfOdd + no;
			System.out.print(no + " ");
		}
		System.out.println(" ");
		System.out.println("Sum of all odd number is : " + sumOfOdd);
		System.out.println("Total number of odd number is: " + odd.size());
	}
}