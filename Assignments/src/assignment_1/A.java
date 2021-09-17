package assignment_1;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		int a = 7;
		int b = 5;
		
		B obj = new B();
		obj.display(a, b);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		a = sc.nextInt();
		System.out.println("Enter another Number");
		b = sc.nextInt();
		obj.display(a, b);
		sc.close();
	}
}
