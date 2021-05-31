package Test;

import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//			String s1="Velocity";
			Scanner s=new Scanner(System.in);
			
			System.out.println("Enter String");
			String s1=s.nextLine();
			int len=s1.length();   //return length of string=8
			
			String rev=" ";
			for(int i=len-1;i>=0;i--)
			{
				rev=rev+s1.charAt(i);
				
			}
			System.out.println(rev);
	
	}

}
