package Arrays;

//import java.util.Scanner;

public class Find_data {
	public static void main(String[] args) {
		int[] arr = { 12, 5, 3, 19, 3, 2 };
		int data = 19;
		boolean k = find(arr, 0, data);
		System.out.println(k);

	}

	public static boolean find(int[] arr, int vidx, int n) {
	
		if (vidx == arr.length) {
			return false;
		}

		 if (arr[vidx] == n) {
					return true;
			}

			boolean fisa = find(arr, vidx + 1, n);
			return fisa;
			

}
}
