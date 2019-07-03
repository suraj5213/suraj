package String;

import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {

		System.out.println("Enter the string ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String rev=" ";
		
		for(int i=s.length()-1;i>-1;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		sc.close();
	}

}
