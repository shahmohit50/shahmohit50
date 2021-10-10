package assignment;

public class RepeativeXor {
	public static void main(String[] args) {
		int arr[] = {1,5,8,6,5,1,6,2};
		int xor = 0;
		for(int i=0;i<arr.length;i++) {
			xor ^= arr[i];
		}
		int ans = xor & ~(xor-1);
		
	}
}
