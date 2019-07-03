package Test;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {

		System.out.println("Enter the no ");
		Scanner sc = new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=a/2;
		
		if(b*2==a)
			System.out.println("Even");
		else
			System.out.println("Odd");
		sc.close();
		}
	}
