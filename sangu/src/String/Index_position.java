package String;

import java.util.Scanner;

public class Index_position {

	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println("Enter the char");
		String b = sc.next();
		System.out.println(s.indexOf(b));
		sc.close();
	}

}
