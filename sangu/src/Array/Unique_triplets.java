package Array;

import java.util.ArrayList;
import java.util.List;

public class Unique_triplets {
	
	public List<List<Integer>> threeSum(int[] a, int target) {
        List<List<Integer>> my_List = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i; j < a.length ;j++)
            {
                for(int k = j; k < a.length;k++)
                {
                    if ( i != j && j != k && i != k && (a[i] + a[j] + a[k] == target))
                    {
                        List<Integer> l = new ArrayList<Integer>();
                        l.add(a[i]);
                        l.add(a[j]);
                        l.add(a[k]);
                        my_List.add(l);
                    }
                }
            }
        }
       return my_List;
    }

	public static void main(String[] args) {
		 int[] a = {1, -2, 0, 5, -1, -4};
			int target = 2;
			Unique_triplets r = new Unique_triplets();
	        System.out.println(r.threeSum(a,target));
	}

}
