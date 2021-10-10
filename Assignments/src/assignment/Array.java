package assignment;

public class Array {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		int arr[] = {1,2,3,4,5};
		int arr2[] = {6,4,5,7};
		int ii=0;
		for(int i=0; i< arr2.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j] == arr2[i]) {
					if(ii>0) System.out.print(",");
					System.out.print(arr[j]);
					ii++;
					break;
				}
			}
		}
		
	}

}
