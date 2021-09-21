package assignment_4;

public class MissingNumber {
	public static void main(String[] args) {
		int x[]= {1,2,3,4,5,6,7,8,9,10,11,12,14,15};
		int sum = 0;
		int lastnum = x[x.length-1];
		int actualSum = (lastnum*(lastnum+1))/2;
		System.out.println("Number Series");
		for(int i = 0;i <x.length;i++) {
			System.out.print(x[i]+", ");
			sum += x[i];
		}
		System.out.println("The missing number is "+(actualSum-sum));
		
	}
}
