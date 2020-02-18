package manish;

public class Sum_rec {
	public static void main(String[] args) {
		int[] arr = {12, 5, 3, 19, 3, 2};
		int sume=0;
		for(int i=0;i<arr.length;i++)
		{
		sume=sume+arr[i];
		}
		System.out.println(sume);
        int k=   sum(arr,0);
		System.out.println(k);
		
		
	}
public static int sum(int arr[], int var)
	{
		
		if(var==arr.length-1)
			return arr[var];
	int k=	sum(arr,var+1);
	      int t=arr[var]+k;
	      return(t);
		
	}

}
