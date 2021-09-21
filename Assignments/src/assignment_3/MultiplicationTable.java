package assignment_3;

public class MultiplicationTable {
 public static void main(String[] args) {
	int num = 10;
	
	for(int i=1; i<= num ;i++) {
		for(int j=1;j<=10;j++) {
			System.out.print(i*j+"    ");
		}
		System.out.println();
	}
}
}
