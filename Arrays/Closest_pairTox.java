package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class Closest_pairTox {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scr.nextInt();
		}
//		for (int i = 0; i < n; i++) {
//			arr[i] = scr.nextInt();
//		}
//		int tar = scr.nextInt();
//		pair_sum_x(arr, arr, tar);
//		closestx(arr, tar);
//		closestProduct(arr, tar);
		/////////////////////////
		int k=scr.nextInt();int val=scr.nextInt();
		Kclosestval(arr, k, val);
		//////////////////////////
	}

	public static void pair_sum_x(int a[], int b[], int target) {

		int smallestdiff = a[0] + b[0] - target;// here finding smallest diff as arrays is sorted so smallest diff is
												// actually this. just think
		Arrays.sort(a);
		Arrays.sort(b);
		int i = 0;
		int j = a.length - 1;

		while (i < a.length && j >= 0) {
			int currdiff = a[i] + b[j] - target;

			if (Math.abs(currdiff) < Math.abs(smallestdiff)) {
				smallestdiff = Math.abs(currdiff);
				System.out.println(a[i] + " " + b[j]);

			}
			if (currdiff == 0) {
//				System.out.println(a[i] + " " + b[j]);
				return;

			} else if (currdiff < 0) {
				i++;
			} else {
				j--;
			}

		}

	}

	////////////// here finding the closest number to x in the
	////////////// single/////////////////////////////////////////////////////////////////////////////
	////////////// array(basically finding second maximum)
	public static int closestx(int arr[], int target) {
		int globaldiff = Integer.MAX_VALUE;
		int closest = 0;
		for (int i = 0; i < arr.length; i++) {
			int diff = Math.abs(arr[i] - target);
			if (diff == 0) {

			} else if (diff < globaldiff) {
				globaldiff = diff;
				closest = arr[i];

			}
		}
		return closest;
//		System.out.println("closest value is: " + closest);

	}
	/////////////////////////// closest pair for product as any num
	//i can optimize this code by using while(i<j) a time will come when diff start increasing at that time i don't want my loop to iterate further
	// so i will just start decrement the j pointer at that time loop will shrink and end fast 
	/////////////////////////// x/////////////////////////////////////////

	public static void closestProduct(int arr[], int target) {
		int spd = Integer.MAX_VALUE;
		int cpd = 0;
		int i = 0;
		int j = arr.length - 1;
		int val1 = 0;
		int val2 = 0;
		while (i < j) {
			cpd = (arr[i] * arr[j]) - target;
			if (Math.abs(cpd) <= spd) {
				spd = cpd;
				val1 = arr[i];
				val2 = arr[j];

			}
			if (cpd > 0) {
				j--;
			} else {
				i++;
			}
		}
		System.out.println(val1 + " " + val2);
	}
	public static void Kclosestval(int arr[],int k,int val)
	{
		int i=0; int j=arr.length-1; int smallestval=Integer.MAX_VALUE; int globalval=0;
		
//	    int closest=closestx(arr, val);
	   ///LATER/////////////////////
		            
		
		
	}
}
