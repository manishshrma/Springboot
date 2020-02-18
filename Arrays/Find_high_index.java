package Arrays;

public class Find_high_index {

	public static void main(String[] args) {
		int[] arr = { 12, 5, 3, 19, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2 };
		int k = find(arr, 0, 3);
		System.out.println(k);

	}

	public static int find(int[] arr, int vidx, int n) {

		if (vidx == arr.length - 1)
			return vidx;
		int p = find(arr, vidx + 1, n);
		if (arr[p] == n)
			return p;
		else
			return vidx;

	}
}
