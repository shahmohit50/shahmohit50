package assignment_1;

import java.util.Scanner;

public class TypeCast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int a = sc.nextInt();
		System.out.println("Number in Integer "+ a);
		System.out.println("Number in Float "+ (float)a);
		System.out.println("Number in Double "+ (double)a);
		System.out.println("Number in Long int "+ (long)a);
		System.out.println("Number in Short int "+ (short)a);
		 
		System.out.println("Number in String "+a );
		
		
		sc.close();
	}

}
