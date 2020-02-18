package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int size = scr.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = scr.nextInt();
		}
//		segregateOddandEven(arr,0,arr.length-1);
//		replaceby_prev_next(arr);
		int k=scr.nextInt();
		Kthlargest(arr, k);
	}

	public static void segregateOddandEven(int arr[], int s, int e) {
		if (s == e) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
			return;
		}

		if (arr[s] % 2 == 0 && arr[e] % 2 == 0) {
			segregateOddandEven(arr, s + 1, e);
		}
		if (arr[s] % 2 == 0 && arr[e] % 2 != 0) {
			segregateOddandEven(arr, s + 1, e - 1);
		}
		if (arr[s] % 2 != 0 && arr[e] % 2 == 0) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			segregateOddandEven(arr, s + 1, e - 1);
		}
		if (arr[s] % 2 != 0 && arr[e] % 2 != 0) {
			segregateOddandEven(arr, s, e - 1);
		}
	}

	public static void replaceby_prev_next(int arr[]) {
		Arrays.sort(arr);
		int s = 0;
		int e = arr.length - 1;

		int[] temp = new int[arr.length];
		for (int i = 0; i < temp.length; i++) {
			if (i % 2 == 0) {
				temp[i] = arr[s];
				s++;
			}
			if (i % 2 != 0) {
				temp[i] = arr[e];
				e--;

			}
		}
		for (int i = 0; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}

	}

	public static void Kthlargest(int arr[], int k) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int idx = 0;
		int j = 0;
		int kmax = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				idx = i;

			}
		}
		int maxvalue = max;
		max = Integer.MIN_VALUE;
		if(k==0)
		{
			System.out.println("kth max value is: "+maxvalue);
			return;
		}
		

		while (j < k) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] < maxvalue && arr[i] > max) {
					max = arr[i];
					kmax = max;
				}
			}
			maxvalue = kmax;
			max = Integer.MIN_VALUE;
			j++;
		}
		System.out.println("kth maximum value is: " + kmax);// if k=2 give 3rd max value.

	}
}
