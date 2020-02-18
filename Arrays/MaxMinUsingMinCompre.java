package Arrays;

import java.util.Scanner;

public class MaxMinUsingMinCompre {

	static class Pair {
		int max;
		int min;

		Pair(int max, int min) {
			this.max = max;
			this.min = min;
		}
	}

	public static Pair max_min_using_minimum_comparison(int arr[]) {
		Pair p = new Pair(Integer.MAX_VALUE, Integer.MIN_VALUE);

		if (arr[0] > arr[1]) {
			p.max = arr[0];
			p.min = arr[1];
		} else {
			p.max = arr[1];
			p.min = arr[0];
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > p.max) {
				p.max = arr[i];

			} else if (arr[i] < p.min) {
				p.min = arr[i];
			}
		}
		return p;

	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scr.nextInt();
		}
		Pair res=max_min_using_minimum_comparison(arr);
		System.out.println("max value is: "+res.max);
		System.out.println("min value is: "+res.min);

	}

}
