package assignment;

public class StringHelloWord {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "World";
		str1 += str2;
		
		str2 = str1.substring(0,str1.length()-str2.length());
		str1 = str1.substring(str1.length()-str2.length());
		
		System.out.println("Str1 = "+ str1 );
		System.out.println("Str2 = "+str2);
	}
}
