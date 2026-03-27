package stringProgram;

public class One1trim {

	public static void main(String[] args) {

		String text = " San dip ";
		text = text.trim().replaceAll("\\s","").toLowerCase();
		System.out.println(text);
	
	}

}
