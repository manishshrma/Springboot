package manish;

import java.util.Arrays;
import java.util.Scanner;

public class Target_sum_trilplet {
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
		int m=i+1;
		int j=arr.length-1;
		int x=s.nextInt();
		
		while(i<j)
		{
			 m=i+1;
				 j=arr.length-1;
			
			while(m<j){
			if(arr[i]+arr[m]+arr[j]==x)
			{
				System.out.println(arr[i]+","+arr[m]+"and"+arr[j]);
				//i++;
				m++;
				j--;
			}
			
			if(arr[i]+arr[m]+arr[j]>x)
				j--;
			if(arr[i]+arr[m]+arr[j]<x)
				m++;
			}
			i++;
			
			
		}
	}	
}

