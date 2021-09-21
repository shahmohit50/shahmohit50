package assignment_3;

public class Fibbonacci {
 public static void main(String[] args) {
	int f =1, s = 1, ans = 0;
	int count = 7;
	System.out.print(f+", "+s);
	for(int i=2; i<=count; i++)
	{
		ans = f+s;
		System.out.print(", "+ans);
		f = s;
		s = ans;
	}
}
}
