package Arrays;

import java.util.Scanner;
////////Don't delete this is efficent one. better than geeks for geeks 
public class Arrays_all_ques {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		  arr[i]=scr.nextInt();
		}
		rotate(arr,4,0);
	}
	public static void rotatebyone(int arr[])
	{
		int spc=arr[0];
		int i=0;
     
		for( i=0;i<arr.length-1;i++)
		{
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		arr[arr.length-1]=spc;
	}
	public static void rotate(int arr[],int r,int idx)
	{
		while(idx<r)
		{
			if(arr.length==r)
			{
				break;
			}
		rotatebyone(arr);
		idx++;
		}
	    for(int i=0;i<arr.length;i++)
	    {
	    	System.out.print(arr[i]+" ");
	    }
		
		return;
		
	}

}
