package assignment;

public class DiagMatrixCheck {
public static void main(String[] args) {
//	int[][] arr = new int[3][3];
	int [][]arr = {{1,2,3},{2,11,3},{2,3,1}};
//	System.out.println(arr.length);
	boolean flag = false;
	int number = Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		for(int j=0 ;j<arr[i].length;j++) {
			if(i==j) {
				if(number == Integer.MAX_VALUE) {
					number = arr[i][j];
				}else if(number != arr[i][j]) {
					flag = true;
					break;
				}
			}
		}
		if(flag) break;
	}
	if(flag) {
		System.out.println("Flase");
	}else {
		System.out.println("True");
	}
}
}
