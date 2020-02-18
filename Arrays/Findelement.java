package Arrays;

import java.util.Scanner;

public class Findelement {
	public static void main(String[] args)
	{
		int i;
		System.out.println("eenter the size of array");
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		int ary[]=new int[N];
		for(i=0;i<=N;i++)
		{
			ary[i]=s.nextInt();
		}
		System.out.println("number to be find");
		int x=s.nextInt();
		for(i=0;i<=N;i++)
		{
			if(ary[i]==x){
				System.out.println(i);
		//	break;
			}
			else{
				System.out.println("invalid");
			}
		}
		
	}

}
