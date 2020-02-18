package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Intersection_array {
	public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	int size1=s.nextInt();
    	int size2=s.nextInt();
    	int arr1[]=new int[size1];
    	int arr2[]=new int[size2];
    	int i=0;
    	for(i=0;i<size1;i++)
    	{
    		arr1[i]=s.nextInt();
    	}
    	for(i=0;i<size2;i++)
    	{
    		arr2[i]=s.nextInt();
    	}
    	
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		ArrayList<Integer> list1=new ArrayList<Integer>(intersection(arr1,arr2));
		System.out.println(list1);
		
	}
/*	public static int[] sorting1(int arr1[])
	{
		for(int i=0;i<arr1.length;i++)
		{
			int min=i;
			for(int j=i+1;j<arr1.length;j++)
				
				if(arr1[j]<arr1[min])
					min=j;
			int temp=arr1[min];
			arr1[min]=arr1[i];
			arr1[i]=temp;
		}
		return arr1;	
			
		}*/
	public static ArrayList<Integer>intersection(int arr1[],int arr2[] )
	{
		int size;
		if(arr1.length>=arr2.length)
			 size=arr1.length;
		   size=arr2.length;
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=0,j=0;i<arr1.length && j<arr2.length;)
		{
			if(arr1[i]==arr2[j])	
			{
				list.add(arr1[i]);
				i++;
				j++;
			}
			else{
				if(arr1[i]>arr2[j]){
					j++;
				}
				else{
					i++;
				}
			}
			
		}
		return list;	
	}
}
