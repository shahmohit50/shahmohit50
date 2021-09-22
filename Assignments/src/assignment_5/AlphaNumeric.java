package assignment_5;

public class AlphaNumeric {
	public static void main(String[] args) {
		String str = "ABC123";
		boolean character = false, integer = false;
		for (int i = 0; i < str.length(); i++) {
			if(character && integer) {
				break;
			}
			if(character == false)
			character = isChar(str.charAt(i));
			
			if(integer == false)
			integer = isInt(str.charAt(i));
		}
		if(character && integer) {
			System.out.println("Alpha Numeric");
		}else {
			System.out.println("Not Alphanumeric");
		}
	}
	
	public static boolean isChar(char ch) {
		
		if((ch >= 'a'
		&& ch <= 'z')
		|| (ch >='A'
		&& ch <= 'Z')) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isInt(char ch) {
		if(ch >='0' && ch <='9') {
			return true;
		}
		
		return false;
	}
}
