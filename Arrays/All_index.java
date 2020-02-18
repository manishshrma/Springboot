package Arrays;

public class All_index {
	public static void main(String[] args) {
		int[] arr = { 12, 5, 3, 19, 3, 3, 2, 3 };

	int []srr=allindex(arr,0,3,0);
	
	for(int i : srr)
	{
	   System.out.println(i);
	}
		
		
	}
	
	public static int[] allindex(int arr[],int vidx,int n,int count)
	{
	
	if(vidx==arr.length)
		return(new int[count]);
				
	     if(arr[vidx]==n)
	    	 count++;
int[] rarr	=allindex(arr,vidx+1,n,count);
	if(arr[vidx]==n){
		count--;
	rarr[count]=vidx;
	}
	return rarr;
	
		
	}

}
