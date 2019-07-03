package Pattern;

public class Add_patter {

	public static void main(String[] args) {
		
		for(int i=0;i<=6;i++)
		{
			int temp=1;
			for(int j=5;j>=i;j--)
			{
				System.out.print("   ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print(temp+"    ");
				temp=temp*(i-j)/(j+1);
			}
			System.out.println();
		}
	}

}