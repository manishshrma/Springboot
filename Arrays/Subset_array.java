package manish;

import java.util.Scanner;

public class Subset_array {
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
	//	String s=scn.next();
		int n=scn.nextInt();
		int x[]=new int[n];
		
		int num=x.length;
				for(int i=0;i<n;i++)
				{
					x[i]=scn.nextInt();
				}
		num=(int)Math.pow(2, num);
		
		int i;
		for(i=0;i<num;i++)
		{
			int count=0;
			int temp=i;			
			int rem[]=new int[n];
			while(count<=n-1)
			{

				int r=temp%2;
				temp=temp/2;
				rem[count]=r;
				count++;
			}
			System.out.print("[");
			for(int j=0;j<n;j++)
			{
				
				if(rem[j]==1)
				{
				//	System.out.print("[");

					System.out.print(x[j]+" ");
					
				}
				
			}
			System.out.print("]");

		
			System.out.println();
		}
		
	}

}
