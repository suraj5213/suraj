package Test;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		String s;
		String r="";
		System.out.println("Enter string");
		Scanner sc=new Scanner(System.in);
		
		s=sc.nextLine();
		String[] str=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			StringBuffer sb=new StringBuffer(str[i]);
			r=r+sb.reverse()+" ";
		}
		System.out.println(r);
		sc.close();

	}

}
