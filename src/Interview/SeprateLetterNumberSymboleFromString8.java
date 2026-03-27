package Interview;

public class SeprateLetterNumberSymboleFromString8 {
	public static void main(String[] args) {
		String str = "12sad#$2";

		String letters = "";
		String numbers = "";
		String symbols = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				letters=letters+ch;
			} else if (ch >= '0' && ch <= '9') {
				numbers += ch;
			} else {
				symbols += ch;
			}

		}
		System.out.println("Letters = " + letters);
		System.out.println("Numbers = " + numbers);
		System.out.println("Symbols = " + symbols);
	}
}
