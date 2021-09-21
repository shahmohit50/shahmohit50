package assignment_2;

import java.util.Scanner;

public class StrlengthCheck {
	public static void main(String[] args) {
		// Check the length of string > 4 print Long else short
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		
		try {
			char q = s.charAt(5);
			System.out.println("Long");
		}catch (Exception e) {
			System.out.println("Short");
		}
		sc.close();
		
	}

}
