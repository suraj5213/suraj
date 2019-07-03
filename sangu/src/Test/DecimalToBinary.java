package Test;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		//-------------using built method------------------//
		System.out.println("Enter the decimal no ");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		int temp = no;
		sc.close();
		String Binary = Integer.toBinaryString(no);
		System.out.println("using built method ");
		System.out.println("Binary no "+Binary);
		System.out.println();
		
		//-------------without using built method------------------//
		//-------------using array---------------------//
		
		int BinaryArray [] = new int[32];
		int index = BinaryArray.length-1;
		while(no>0)
		{
			BinaryArray[index]=no%2;
			no=no/2;
			index--;
		}
		System.out.println("using array binary no ");
		for(int n : BinaryArray)
		{
			System.out.print(n);
		}
		System.out.println();
		
		//--------------using string concatenation----------------//
		System.out.println();
		String str="";
		while(temp!=0)
		{
			int rem=temp%2;
			str=rem+str;
			temp=temp/2;
		}
		System.out.println("using string concatenation ");
		System.out.println(str);
	}

}