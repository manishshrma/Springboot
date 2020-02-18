package Arrays;

public class Conti_array {
	public static void main(String[] args)
	{
		int i,j;
		int  a[]=new int [] {2,5,4,3,1,2};
		int n=6;
		for(i=0;i<n;i++)
		{
			for(j=1;j<n;j++)
			{
				if(a[i]>=a[j+i])
				{
					int t=a[i];
					a[i]=a[j+1];
					a[j+1]=t;
					
				}
				else{
			
				}
			}
		}
		for(i=0;i<=n;i++)
		{
			System.out.println(a[i]);
		}
		for(i=0;i<=n;i++)
		{
			for(j=1;j<n;j++){
			if(a[j]-a[i]==1)
			{
				System.out.println("tru");
			}
			else{
				System.out.println("fasle");
			}
			}
		}
	}

}
