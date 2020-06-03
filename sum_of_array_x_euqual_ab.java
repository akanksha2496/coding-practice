package array_RB1;

import java.util.HashMap;
import java.util.Scanner;

public class sum_of_array_x_euqual_ab {
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int[] a= {1,20,5,6,9,2,10};
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>(); 
	    for(int i=0;i<a.length;i++)
	    {
	    	h.put(a[i],a[i]);
	    }
	    int x=s.nextInt();
	    System.out.println();
	    for(int i=0;i<a.length;i++)
	    {
	    	if(h.containsValue((Math.abs(a[i]-x))))
	    	{
	    		System.out.print(a[i]+" ");
	    	}
	    }
	}

}
