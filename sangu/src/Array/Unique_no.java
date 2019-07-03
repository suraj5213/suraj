package Array;

public class Unique_no {
	
	
	static void findThePairs(int a[], int inputNumber)
	    {
	        System.out.println("Pairs of elements whose sum is "+inputNumber+" are : ");
	 
	        for (int i = 0; i < a.length; i++)
	        {
	            for (int j = i+1; j < a.length; j++)
	            {
	                if(a[i]+a[j] == inputNumber)
	                {
	                    System.out.println("("+a[i]+","+a[j]+") ");
	                }
	            }
	        }
	        System.out.println("("+inputNumber+")");
	    }
	

	public static void main(String[] args) 
	{
		findThePairs(new int[] {2, 4, 3, 5, 6, -2, 4, 7, 8, 9}, 7);
	}

}
