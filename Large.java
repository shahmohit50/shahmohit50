package Cal;

public class Large {
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,66,3,6,33,54,433,2};
		if(arr.length > 0) {
			int max = arr[0];
			for(int i = 0; i<arr.length;i++) {
				if(max < arr[i]) {
					max = arr[i];
				}
			}
			System.out.println("Max Number in Array = "+max);
		}
		else{
		System.out.println("No values in Array");	
		
		}
	}
}
