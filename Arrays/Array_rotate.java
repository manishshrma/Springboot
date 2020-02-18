package Arrays;

import java.util.Scanner;

public class Array_rotate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the size");
		int size = s.nextInt();
		int i;
		int a[] = new int[size];//created array of input size
		for (i = 0; i < size; i++) {
			a[i] = s.nextInt();// goving values to created  array
		}
		System.out.println("enter the shift position");
		int shift = s.nextInt();// entering the positon by which array is to be shifted
		int[] temp = new int[50];//new temp array 
		for (i = 0; i < shift; i++) {
			temp[i] = a[i];// inserted the shifted values of create array into this temp aray
		}
		for (i = 0; i < size - shift; i++) {
			a[i] = a[i + shift];// rearranging the values by shifting in the same old a[] array
		}
		for (i = 0; i < size - shift; i++) {
			System.out.print(a[i] + " ");// printing old array
		}
		for (i = 0; i < shift; i++) {
			System.out.print(" " + temp[i]);//and then add the temp array in the last
		}

	}// NOTE: it is left shifte that i did. same can be done for right shifting. take an example of shifting the array of 2 position left//

}
