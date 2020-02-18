package Arrays;

import java.util.Scanner;

public class Maxvalue_array {
	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);

		int size = scr.nextInt();
		if(size<1||size>Math.pow(10,9)){
			System.out.println("Invalid Input");
			return;
		}
		
		//int x = scr.nextInt();
		int[] arr = new int[size];
	//	int x = scr.nextInt();

		int i;
		for (i = 0; i < size; i++) {
			arr[i] = scr.nextInt();
			if(arr[i]<0 || arr[i]> 1000000000){
				System.out.println("Invalid Input");
				return;
			}
		}
		int x = scr.nextInt();

     		int y = maximum(arr, size, x);
		System.out.println(y);

	}

	public static int maximum(int arr[], int size, int x) {
		int i, max = 0;
		// int z=Integer.MIN_VALUE;
		for (i = 0; i < size; i++) {
			if (arr[i] == x) {
				return i;
			} else if (i == size - 1) {
				if (arr[i] != x)

					return -1;
			}

		}
		//if ((x < Integer.MIN_VALUE) && (x > Integer.MAX_VALUE))
		
		return x;
	}
}
