package Array;

import java.util.Scanner;

public class Split_array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter the element ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println();
		System.out.println("Enter the no ");
		int b=sc.nextInt();
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(b==a[j])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.print(" "+temp);
		}
		sc.close();
	}

}
