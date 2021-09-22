package assignment_5;

public class PrimeNumber {
public static void main(String[] args) {
	for(int i=15;i<=80;i++) {
		if(isPrime(i)) {
			System.out.print(i+ "  ");
		}
	}
}
public static boolean isPrime(int n) {
	boolean flag = false;
	for(int i=2;i<=n/2;i++) {
		if(n%i == 0) {
			flag = true;
			break;
		}
	}
	
	if(!flag) {
		return true;
	}
	return false;
}
}
