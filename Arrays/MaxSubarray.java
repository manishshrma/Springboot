package Arrays;

import java.math.BigInteger;
import java.util.Scanner;

public class MaxSubarray {
	public static void main(String[] args)
	{
	int i,j,n,sum=0;
	int arr[]=new int[33];
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	
	for(i=0;i<=n;i++)
	{
		arr[i]=s.nextInt();
	}
	for(i=0;i<=n;i++)
	{
		for(j=1;j<=n;j++)
		{
			sum=sum+arr[i]+arr[j+i]-arr[i];
			int large=-1111111;
			if(sum>large)
			{
				System.out.print(sum);
			}
			else{
				System.out.print(large);
			}
		}
		sum=0;
	}

}
	
}

