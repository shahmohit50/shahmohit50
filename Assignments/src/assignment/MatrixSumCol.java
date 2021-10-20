package assignment;

public class MatrixSumCol {
public static void main(String[] args) {
	int[][]arr = {{1,2,3},{2,3,5},{3,3,7}};
	boolean flag = false;
	for(int i=0;i<arr.length;i++) {
		int sum =0;
		for(int j=0;j<arr[i].length;j++) {
			if(j == arr[i].length-1) {
				if(sum != arr[i][j]) {
					flag = true;
					break;
				}
			}else {
				sum += arr[i][j];
			}
		}
		if(flag) break;
	}
	if(flag) {
		System.out.println("False");
	}else {
		System.out.println("True");
	}
		
}
}
