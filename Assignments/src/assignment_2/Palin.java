package assignment_2;

public class Palin {
	public static void main(String[] args) {
		String str = "MADAM";
		int a = str.length();
		boolean flag = false;
		for(int i =0; i<a/2;i++) {
			if(str.charAt(i) == str.charAt(a-i-1)) {
				continue;
			}else {
				flag = true;
				break;
			}	
		}
		if(flag) {
			System.out.println("Not a Palindrom");
		}else {
			System.out.println("Palindrom");
		}
	}
}
