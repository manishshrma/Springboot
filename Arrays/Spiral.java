package manish;

import java.util.Scanner;

public class Spiral {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int row = scr.nextInt();
		int clm = scr.nextInt();
		int a[][] = new int[row][clm];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < clm; j++) {
				a[i][j] = scr.nextInt();
				System.out.println(a[i][j]+"..");
			}
			System.out.println();
		}
		int[][] b = new int[row][clm];
//		int []b=new int[row*clm];
		waverowwise(a, b, a.length-1, a[0].length-1);
		// waveclmwise(a,b,row,clm);

	}

	public static void waverowwise(int a[][], int b[][], int rmax, int cmax) {
		int k = 0;
		int j = 0;
		int i = 0;
		int rmin=0; int cmin=0;int m=0;int n=0;
		while (rmin<rmax)
		{
			for(int c=cmin;c<=cmax;c++)
			{
			 b[m][n]=a[rmin][c];n++;
			 System.out.print(a[m][n]+"first");
			}
			rmin++;m++;n=0;
			for(int r=rmin;r<=rmax;r++)
			{
				b[m][n]=a[r][cmax];
				 System.out.print(b[m][n]+"second");

			}
			cmax--;m++;n=0;
			for(int c=cmax;c>=cmin;c--)
			{
				b[m][n]=a[rmax][c];
				 System.out.print(b[m][n]+"third");

			}
			rmax--;m++;n=0;
			for(int r=rmax;r>=rmin;r--)
			{
				b[m][n]=a[r][cmin];
				 System.out.print(b[m][n]+"last line");

			}
			cmin++;m++;n=0;
			
		}
		for( i=0;i<a.length;i++)
		{
			for(j=0;j<a[0].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
		}

			

	}
	/////////////////////////My  Alternate///////////////////////////////////////////
	public static void waverowwise(int a[][], int b[], int row, int clm) {
		int k = 0;
		int j = 0;
		int i = 0;
		while (i <row*clm) {

			for (j = 0; j < clm && i < row*clm; j++) {
				b[i] = a[k][j];
				i++;
			}
			k++;
			for (j = clm - 1; j >= 0 && i < row*clm; j--) {
				b[i] = a[k][j];
				i++;
			}
			k++;
		}
		for (int r = 0; r < row*clm; r++) {
				System.out.print(b[r] + " ");
			}

	}

}
