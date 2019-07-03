package String;

import java.util.Scanner;

public class Upper_lower {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		sc.close();
	}
}
