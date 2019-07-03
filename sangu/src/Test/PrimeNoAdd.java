package Test;

import java.util.Scanner;

public class PrimeNoAdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 no");
		int a = sc.nextInt();
		int c = sc.nextInt();
		int sum = 0;
		for (int i = a; i <= c; i++) {
			int b = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = b + 1;
				}
			}
			if (b == 0) {

				System.out.println("prime no " + i);
				sum = sum + i;
			}

		}
		System.out.println("Add " + sum);
		sc.close();

	}

}
