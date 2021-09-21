package assignment_4;

public class ReplaceNumber {
	public static void main(String[] args) {
		int x[] =  {1,2,4,6,8,12,76,23,64};
		int n = 76;
		
		for(int i=0;i<x.length;i++) {
			if(x[i] == n) {
				x[i] = 0;
				break;
			}
		}
		System.out.print("[ ");
		for(int i =0; i<x.length;i++) {
			if(i == x.length-1) {
				System.out.print(x[i]);
			}else System.out.print(x[i]+ ", ");
		}
		System.out.print("]");
	}
}
