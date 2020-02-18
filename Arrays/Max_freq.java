package Arrays;

public class Max_freq
{
	static void getMaxOccuringChar(String str)
	{
		
		
		int i,j,k=1;
	//	int max=0;
		int max=1;
		for(i=0;i<str.length();i++)
		{
			for(j=1;j<str.length()-i;j++)
			{
				if(str.charAt(j+i)==str.charAt(i))
				{
	            //	k++;
	            //	k=str.charAt(i);
	            			k++;
			}
			}
			if(max >=k)
			{
				if(i==str.length()-1)
				{
					System.out.println(str.charAt(k-1));
				System.out.println(max);
				}
			}
			else
			{
				max=k;
			}
			k=1;
			}
	}
	public static void main(String[] args)
	{
		String str="bggggbaaggaggggggggg";
		getMaxOccuringChar(str);

	//	System.out.println(z);
	}
	
	}
	