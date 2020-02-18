package Arrays;

import java.util.Scanner;

public class Array_sum {
	public static void main(String[] args) {
		// Scanner s =new Scanner(System.in);
		int t;
		int p;
		Scanner scr = new Scanner(System.in);
		int m = scr.nextInt();
		int a[] = new int[m];
		for (p = 0; p < m; p++) {
			a[p] = scr.nextInt();
		}
		int n = scr.nextInt();

		int b[] = new int[n];
		for (p = 0; p < n; p++) {
			b[p] = scr.nextInt();
		}
		int i = a.length - 1;
		int j = b.length - 1;
		if (i > j)
			t = i + 2;
		else
			t = j + 2;

		int x[] = new int[t];
		// doingsum(a,b,x);
		int print[] = doingsum(a, b, x);

		if (x[0] != 0) {
			System.out.println(x[0]);
		}
		for (int i1 = 1; i1 < x.length; i1++) {
			System.out.println(x[i1]);
		}
	}

	public static int[] doingsum(int[] a, int[] b, int[] x) {
		int i = a.length - 1;
		int j = b.length - 1;
		int t = x.length - 1;

		int sum = 0;
		int carry = 0;
		while (i >= 0 && j >= 0) {

			sum = carry + a[i] + b[j];
			int k = sum % 10;
			carry = sum / 10;

			x[t] = k;
			t--;
			i--;
			j--;
			sum = 0;
		}
		if (j < 0) {
			
			while (i >= 0) {

				sum = carry + a[i];
				int k = sum % 10;
				carry = sum / 10;

				x[t] = k;
				i--;
				t--;
				sum = 0;
			}
		} else if (i < 0) {
			while (j >= 0) {

				sum = carry + b[j];
				int k = sum % 10;
				carry = sum / 10;
                  
				x[t] = k;
				j--;
				t--;
				sum = 0;
			}
		}

		return (x);
	}

}
