package stringProgram;

public class SeprateAcendingDecending1 {
	public static void main(String[] args) {
		String str = "djjeiHDU2746@$%#";

		String upperletters = "";
		String lowerletters = "";
		String numbers = "";
		String symboles = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upperletters += ch;
			} else if ((ch >= 'a' && ch <= 'z')) {
				lowerletters += ch;
			} else if (ch >= '0' && ch <= '9') {
				numbers += ch;
			} else {
				symboles += ch;
			}
		}
		System.out.println(acendingOrder(upperletters));
		System.out.println(acendingOrder(lowerletters));
		System.out.println(acendingOrder(numbers));
		System.out.println(acendingOrder(symboles) + "\n");

		System.out.println(decendingOrder(upperletters));
		System.out.println(decendingOrder(lowerletters));
		System.out.println(decendingOrder(numbers));
		System.out.println(decendingOrder(symboles));
	}
	// unicode based bubble sort
	public static String acendingOrder(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		String result = "";
		char temp;
		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n-1-i; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (char ch : arr) {
			result = result + ch;
		}
		return result;
	}
	// unicode based bubble sort
	public static String decendingOrder(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		char temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// for(char ch:arr){
		// result=result+ch;
		// }
		return new String(arr);
	}
    public static String decendingOrder1(String str){
        char[] arr=str.toCharArray();
        String result="";
        for(int i=arr.length-1;i>=0;i--){
         result=result+arr[i];   
        }
        return result;
   }
}
