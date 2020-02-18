package Arrays;

import java.util.Scanner;

public class MIn_jump_array {
	public static void main(String[] args) {
		
	Scanner scr=new Scanner(System.in);
	int size = scr.nextInt();
	int arr[] = new int[size];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scr.nextInt();
		
	}
	boolean res=minjump(arr);
	System.out.println(res);
	}
	public static boolean minjump(int arr[])
	{
		int i=0; int j=0;
		
		int jump[]=new int[arr.length];
		jump[0]=0;
		if(arr[0]==0||arr.length==0)
		{
			return false;
		}
		for(i=1;i<arr.length;i++)
		{
			jump[i]=Integer.MAX_VALUE;
			for(j=0;j<i;j++)
			{
			if(arr[j]+ j>=i)
			{
				jump[i]=jump[j]+1;
				break;
			}
			}
		}
		if(jump[arr.length-1]==Integer.MAX_VALUE)
		{
			return false;
		}
		return true;
//		System.out.println(jump[arr.length-1]);
			
		}
	}
