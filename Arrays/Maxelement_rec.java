package Arrays;

public class Maxelement_rec {
	public static void main(String[] args) {

		int arr[] = new int[] { 2, -1, 5, 3, 67, 6 };
		int k = maxe(arr, 0);
		System.out.println(k);

	}

	public static int maxe(int[] arr, int vidx) {
		if (vidx == arr.length - 1)
			return arr[vidx];
		int misa = maxe(arr, vidx + 1);
		if (arr[vidx] > misa) {
			misa = arr[vidx];
		}

		return misa;
	}
}
