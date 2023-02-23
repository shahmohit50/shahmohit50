package Cal;

public class sum {
	public static void main(String args[]) {
		int [] arr = {1,2,3,4,5};
		int sum = 0;
		for(int i= 0; i< arr.length; i++) {
			int elm = arr[i];
			sum = sum + elm;
		}
		System.out.println("Sum of array is "+sum );
	}
}

