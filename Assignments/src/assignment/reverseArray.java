package assignment;

public class reverseArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int rev[] = new int[arr.length];
		for(int i =arr.length-1, j=0;i>=0; i--,j++) {
			rev[j] = arr[i];
		}
		for(int i=0; i< rev.length;i++) {
			System.out.print(rev[i]+" ");
		}
	}
}
