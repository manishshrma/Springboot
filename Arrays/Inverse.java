package Arrays;

import java.util.Scanner;

public class Inverse {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int a = 0; a < size; a++) {
			arr[a] = s.nextInt();
		}
		int[] inv = new int[size];
		int srs[] = inverse(arr, inv, i);
		for (int x : srs) {
			System.out.println(x);

		}
		for (i = 0; i < size; i++) {
			if (arr[i] != inv[i])
				break;
		}
		if (i == size - 1)
			System.out.println("false");
		else
			System.out.println("true");

	}

	public static int[] inverse(int arr[], int inv[], int i) {
		if (i == arr.length)
			return inv;
		// inv[arr[i]]=i;
		int index = arr[i];
		inv[index] = i;
		return (inverse(arr, inv, i + 1));

	}

}
