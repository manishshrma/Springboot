package Arrays;

import java.util.Scanner;

public class MIrrorinverse {
	public static void main(String[] args) {
		
	int i;int count=1;
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int arr[]=new int[size];
	
	int reverse[]=new int[size];
	
	int mirror[]=new int[size];
	for(i=0;i<size;i++)
	{
		arr[i]=s.nextInt();	
	}

	for (i = 0; i < size; i++) {
//		reverse[size - 1 - i] = arr[i];
//		int k=reverse[size - 1 - i];
//		 mirror[k]=size-1-i;
		reverse[arr[i]] = i;
	}
	
	for(i=0;i<size;i++)
	{
		System.out.println(reverse[i]);	
	}
//	for(i=0;i<size;i++)
//	{
//		if(arr[i]-reverse[i]==0)
//			return 
//		else
//			count++;
//	}
//	if(count==size)
//	{
//		if(count==0)
//	
//		System.out.println("true");
//		}
//	else
//		System.out.println("false");
	for(i=0;i<size;i++)
	{
		if(arr[i]!=reverse[i])
			break;
	}
	if(i==size-1)
		System.out.println("true");
	else
		System.out.println("false");
	

}
}
