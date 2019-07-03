package Test;

import java.util.Scanner;

public class Sorting_no {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the no ");
		String a=sc.nextLine();
		sc.close();
		char[] b=a.toCharArray();
		
		for (int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length-1;j++)
			{
				if(b[j]>b[j+1])
				{
					char temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;					
				}
			}
		}
		System.out.println(new String(b));
	}
}