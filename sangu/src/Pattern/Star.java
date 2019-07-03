package Pattern;

public class Star {

	public static void main(String[] args) {

		for(int i=1;i<6;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=4;i>=1;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
