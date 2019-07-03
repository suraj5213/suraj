package Pattern;

public class Char {

	public static void main(String[] args) {

		for(char i='A';i<'F';i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
//		for(int i=50;i<=100;i++)
//		{
//			int b=0;
//			for(int j=2;j<i;j++)
//			{
//				if(i%j==0)
//				{	
//					b=b+1;
//				}
//			}
//				if(b==0)
//				{
//					if(i%10==3 || i%10==7)
//					System.out.println("prime no "+i);
//				}
//		}
	}
	
}
