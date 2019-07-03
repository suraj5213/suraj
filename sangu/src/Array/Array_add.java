package Array;

public class Array_add {

	public static void main(String[] args) {

		char a[] = {'1','2','3','4'};
		char b[] = {'5','6','7','8'};
		char c[] = new char[8];
		
		char temp=0;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
			{
				c[temp++]=a[i];
			}
			if(i<b.length)
			{
				c[temp++]=b[i];
			}
			System.out.print(" "+c[i]);
		}
	}
}