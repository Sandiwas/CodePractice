package stringProgram;

import java.util.Arrays;

public class One1Split {

	public static void main(String[] args) {
		String result="";
		String text = "A-B-C";
		String[] parts = text.split("-");
		System.out.println(Arrays.toString(parts));
        for(String str:parts) {
        	result=result+str;
        }
        System.out.println(result);
	}

}
