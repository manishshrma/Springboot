package Arrays;

import java.util.Scanner;

public class PrintAllpossiblecode {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String s=scr.next();
		StringBuilder sb=new StringBuilder();
		
		  code(s,sb);
		
		
	}
	public static String code(String s,StringBuilder sb)
	{
		
		if(s.length()==0)
		{
			return sb.toString();
		}
		
		String str=s.substring(0, 1);
		String str2=s.substring(0,2);
		
		 String ros=s.substring(1);
		 String a=s.substring(0, 1);
		   sb.append(a);
		 code(ros,sb);
		 String ros2=s.substring(2);
		 if(s.length()>=2)
		 {
		 String b=s.substring(0, 2); 
		 
		 sb.append(b);
		 code(ros2,sb);
		 }
		return sb.toString();
		
	}

}
