package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Allpair_array {
	public static void main(String[] args) {
int k;		
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(k=0;k<size;k++)
		{
			arr[k]=s.nextInt();
			
		}
		Arrays.sort(arr);
		int i=0;
		int j=arr.length-1;
		int x=s.nextInt();
		
		while(i<j)
		{
			if(arr[i]+arr[j]==x)
			{
				System.out.println(arr[i]+"and"+arr[j]);
				i++;
				j--;
			}
			
			if(arr[i]+arr[j]>x)
				j--;
			if(arr[i]+arr[j]<x)
				i++;
			
		}
	}	
}
