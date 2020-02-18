package Arrays;

import java.util.Scanner;

public class Max_subarray_alternate {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scr.nextInt();
		}
		int current_max=arr[0];
		int global_max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			current_max=Math.max(current_max+arr[i], arr[i]);
			if(current_max>global_max)
			{
				global_max=current_max;
			}
		}
		System.out.println(global_max);
	}

}
