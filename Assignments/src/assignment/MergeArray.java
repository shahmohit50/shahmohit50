package assignment;

public class MergeArray {
	public static void main(String[] args) {
		int arr1[] = { 4, 5, 6, 7, 8 };
		int arr2[] = { 1, 2, 3, 4 };

		int co[] = new int[arr1.length + arr2.length];
		int i = 0;
		for (i = 0; i < arr1.length; i++) {
			co[i] = arr1[i];
		}
		for (int j = 0; j < arr2.length; j++, i++) {
			co[i] = arr2[j];
		}

		for (int a = 0; a < co.length; a++) {
			for (int b = a; b < co.length; b++) {
				if (co[b] < co[a]) {
					int temp = co[a];
					co[a] = co[b];
					co[b] = temp;
				}
			}

		}
		for (int x = 0; x < co.length; x++) {
			System.out.print(co[x]);
			System.out.print(" ");
		}
	}
}
