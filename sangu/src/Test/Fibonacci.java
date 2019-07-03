package Test;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Enter the no ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int a=0,b=0;
		int temp=1;
		for(int i=0;i<n;i++)
		{
			a=b;
			System.out.print(" "+a);
			b=temp;
			temp=a+b;		
		}
	}

}
