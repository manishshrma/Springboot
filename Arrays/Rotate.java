package Arrays;

import java.util.Scanner;

public class Rotate {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		int x=0,y=0;
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int r = s.nextInt();
		int n1 = 0, n2 = 0, num = 0;
		int nod = 0;
		int tempnum = n;
		while (tempnum != 0) {
			tempnum = tempnum / 10;
			nod++;
		}
		
		if(r<0)
			r=nod+r;
		x=(int)Math.pow(10,r);
		y=(int)Math.pow(10, nod-r);
		
			n1 = n / x;
			n2 = n % x;
			num = n2 * y + n1;
			System.out.println(num);
		
	}

}
