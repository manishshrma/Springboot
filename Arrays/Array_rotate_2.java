package Arrays;

import java.util.Scanner;
//Geeks for geeks ques2.
public class Array_rotate_2 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the size");
		int size = scr.nextInt();
		System.out.println("enter the shift position");
		int shift = scr.nextInt();

		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scr.nextInt();
		}
		rotate(arr, shift);
	}

	public static void rotate(int arr[], int shift) {
		reverse(arr, 0, shift - 1);
		reverse(arr, shift, arr.length - 1);
		reverse(arr,0,arr.length-1);
		print(arr);

	}

	public static void reverse(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;end--;
		}
		return;

	}

	public static void print(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
