package Test;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {

		//-------------using built method------------------//
		System.out.println("Enter the binary no ");
		Scanner sc = new Scanner(System.in);
		String BinaryNo = sc.next();
		sc.close();
		int Decimal = Integer.parseInt(BinaryNo,2);
		System.out.println("Using Inbuilt Function");
		System.out.println("Decimal no "+Decimal);
		
		//-----------without using built method--------------//
		System.out.println("without using built method ");
		int temp = Integer.parseInt(BinaryNo);
		int power = 0;
		int DecimalNo = 0;
		while(temp>0)
		{
			int rem = temp%10;
			DecimalNo = DecimalNo + rem*(int)Math.pow(2, power);
			power++;
			temp=temp/10;
		}
		System.out.println("Decimal no "+DecimalNo);
	}

}