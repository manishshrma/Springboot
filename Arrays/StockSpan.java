package Arrays;

import java.util.Scanner;
// my on solution without using stack. O(n) and without stack AWSM!!!yeah!! yes!! i did it.
public class StockSpan {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		
		int arr[] = { 1, 30, 90, 3, 30, 80 };
		int n = scr.nextInt();
		int store[] = new int[n];
		for (int i = 0; i < n; i++) {
			store[i] = 1;
		}
		stockSpan(store, arr);

	}

	public static void stockSpan(int store[], int arr[]) {
		int i = 0;
		int j = 1;
		while (i < arr.length - 1&&j<arr.length) {
			if (i < 0) {
				i = j;
				j = j + 1;
			}
			else if (arr[i] > arr[j]) {
				if(store[j]==1)
				{
				store[j] = 1;
				}
				i = j;
				j = j + 1;
			} 
			
			else if (arr[i] <= arr[j]) {
				store[j] = store[j] + 1;
				i--;
			}
		}
		for(int val:store)
		{
			System.out.print(val+" ");
		}
	}

}
