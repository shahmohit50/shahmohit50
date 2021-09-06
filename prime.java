package Cal;

public class prime {
	public static void main(String[] args) {
		int num = 123;
		if(num == 0 || num == 1) {
			System.out.println("Number is not prime nor composite");
		}else {
			int mid = num/2;
			boolean flag = false;
			for(int i=2;i<=mid;i++) {
			if(num%i == 0) {
				System.out.println("Number is Not Prime");
				flag = true;
				break;
			}
			}
			
			if(flag == false) {
				System.out.println("Number is prime");
			}
		}
		
	}
}
