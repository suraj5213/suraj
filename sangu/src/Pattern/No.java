package Pattern;

public class No {

	public static void main(String[] args) {
		
		
		for(int i=1;i<=5;i++)
		{
			int temp=i;
			for(int j=4;j>=i;j--)
			{
				System.out.print("    ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(temp--+"   ");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(j+"   ");
			}
			System.out.println();
		}

	}

}
