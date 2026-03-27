package integerProgram;

public class JoinStringArrayFindDuplicate {

	public static void main(String[] args) {

        char[] arr1 = {'a', 'b', 'c', 'd'};
        char[] arr2 = {'c', 'd', 'e', 'f'};


		char[] result = new char[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			result[arr1.length + i] = arr2[i];
		}
		System.out.print("Duplicate are : ");
		for (int i = 0; i < result.length; i++) {
			for (int j = i + 1; j < result.length; j++) {
				if (result[i] == result[j]) {
					System.out.print(result[i]+"\t");
					break;
				}
			}
		}
	}

}
