package Arrays;

public class Find_index {
	
	
	
	public static void main(String[] args) {
		int[] arr = {12, 5, 3, 19, 3, 2};
           int k=   find(arr,0,3);
		System.out.println(k);

	}

	public static int find(int []arr,int vidx,int n)
	{
	//	if(vidx==arr.length)
		//	return 0;
		if(arr[vidx]==n)
			return vidx;
		
		
	int g=	find(arr,vidx+1,n);
		return g;
		
		
		

}
}
