package Test;

import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Scanner;

public class Set {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
//		HashSet h = new HashSet3();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size");
		int n = sc.nextInt();
		System.out.println("enter the element ");
		
		for(int i=0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		System.out.println(a);
		System.out.println("enter the no");
		int m = sc.nextInt();
		int z=0;
		for(int i=0;i<n;i++)
		{
			if(m==a.indexOf(i))
			{
				z=a.indexOf(i)-1;
			}
		}
		System.out.println(z);
		sc.close();
	}

}
