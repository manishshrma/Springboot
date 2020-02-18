package Arrays;

import java.util.Scanner;

public class Find_pivot_and_search {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int arr1[] = { 5, 6, 7, 8, 9, -2, 1, 2, 3 };
		int n = arr1.length;
		int pivot = findPivot1(arr1, 0, arr1.length - 1, n);
		System.out.println("my pivot index is  " + pivot);

	}

	public static int findpivot(int arr[], int start, int end, int n) {
		int mid = (start + end) / 2;
		if (arr[mid] > arr[mid + 1]) {
			return mid;
		}

		if (arr[start] > arr[mid])// means u r in 2nd part of array
		{
			return findpivot(arr, start, mid - 1, n);
		}
		if (arr[start] < arr[mid]) {
			return findpivot(arr, mid + 1, end, n);
		}
		return findpivot(arr, start, end, n);// return anything here as this statement will never reach if input array
												// is correct

	}
	public static int findPivot1(int arr[], int low, int high,int n) 
	    { 
	       // base cases 
	       if (high < low)   
	            return -1; 
	       if (high == low)  
	            return low; 
	         
	       /* low + (high - low)/2; */
	       int mid = (low + high)/2;    
	       if (mid < high && arr[mid] > arr[mid + 1]) 
	           return mid; // return  pivot index
	       if (mid > low && arr[mid] < arr[mid - 1]) 
	           return (mid-1); 
	       if (arr[low] >= arr[mid]) 
	           return findPivot1(arr, low, mid-1,n); 
	       
	       
	       return findPivot1(arr, mid + 1, high,n); 
	    } 

}
