package String;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String s = sc.next();
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<s.length()-1;j++)
			{
				if(s.charAt(i) == s.charAt(j) && i!=j)
				{
					count=count+1;
					break;
				}
			}
			if(count == 1)
			{
				System.out.print(s.charAt(i));
			}
		}
		sc.close();
	}

}
