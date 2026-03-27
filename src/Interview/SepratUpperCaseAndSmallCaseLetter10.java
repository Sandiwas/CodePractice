package Interview;

public class SepratUpperCaseAndSmallCaseLetter10 {

	public static void main(String[] args) {
		String str = "ywukjhfddaNJFDDA";
	
	    String upperCase="";
	    String lowerCase="";
	    
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
		 if((ch>='A' && ch<='Z')) {
			 upperCase+=ch;
		 }else {
			 lowerCase+=ch;
		 }
		}	
		System.out.println(upperCase);
		System.out.println(lowerCase);
	}
}
