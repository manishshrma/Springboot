package Arrays;

import java.util.Scanner;

public class Min_subarray {
	public static void main(String[] args) {
		
	
	Scanner scr = new Scanner(System.in);
	int n = scr.nextInt();
	int arr[] = new int[n];
	for (int i = 0; i < n; i++) {
		arr[i] = scr.nextInt();
	}
	min_subarray(arr);
	}
	public static void min_subarray(int arr[])
	{
		int cmin=arr[0]; int gmin=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			cmin=Math.min(arr[i], cmin+arr[i]);
			if(cmin<gmin)
			{
				gmin=cmin;
			}
		}
		System.out.println(gmin);
	}

}
