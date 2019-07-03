package Array;

import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size ");
		int n = sc.nextInt();
		
		int a[]=new int[n];
		
		System.out.println("Enter the element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Sorting array");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			System.out.print(" "+a[i]);
		}
		
//		for(int i=0;i<a.length;i++)
//		{
//			System.out.print(" "+a[i]);
//		}
		
		sc.close();
	}
}
