package Arrays;

import java.util.Scanner;

public class MaxEffort {
	

	public static void main(String[] args)
	{
		int i,x,n;
		
		System.out.println("enter the number for fabonaaci series");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		fab(n);
		for(i=0;i<=n;i++)
		{
			System.out.print(" "+fab(i));
		}
		
		
	}

	public static int fab(int x)
	{
		int y;
	
		if(x==0)
		{
			return 0;
		}
		else if(x==1||x==2){
			return 1;}
		else
		{
			y=fab(x-1)+fab(x-2);
		}
		return y;
	}
}
		