package assignment;

public class RemoveElement {
	public static void main(String[] args) {
		int arr[] = {1,2,4,5,7};
		int k =5;
		
		for(int i=0;i<arr.length;i++) {
			if(k == arr[i]) {
				for(int j =i+1;j<arr.length;j++,i++) {
					arr[i] = arr[j];
				}
				arr[arr.length-1] = 0;
				break;
			}
		}
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
