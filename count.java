package Cal;

public class count {
	public static void main(String[] args) {
		int a = 123321;
		int sum = 0;
		int count = 0;
		while(a>0) {
			sum = sum + a%10;
			count ++;
			a = a/10;
		}
		System.out.println("sum = "+sum);
		System.out.println("Count = "+count);

	}
}
