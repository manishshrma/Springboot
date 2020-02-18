package Arrays;

public class Indexes_print {
	public static void main(String[] args) {
		int[] arr = { 12, 5, 3, 19, 3, 3, 2, 3 };

		find(arr, 0, 3);
		// System.out.println();

	}

	public static void find(int[] arr, int vidx, int n) {
		if (vidx == arr.length)
			return;
		if (arr[vidx] == n) {
			System.out.println(vidx);
		}
		find(arr, vidx + 1, n);

	}

}
