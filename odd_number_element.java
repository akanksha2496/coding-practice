package array_RB1;

import java.util.HashMap;
import java.util.Scanner;

public class odd_number_element{
	
	public static void main(String ar[])
	{
		
		Scanner s=new Scanner(System.in);
		int[] arr= {3,2,1,2,3,1,1,3};
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(h.containsKey(arr[i])==true)
			{
				h.put(arr[i],h.get(arr[i])+1);
			}
			else
			{
				h.put(arr[i], 1);
			}
		}
		 for (int i : h.keySet())  
	        { 
	            // search  for value 
	            Integer url = h.get(i); 
	            if(url%2==1)
	            {
	            	System.out.println("Key = "+i);
	            	break;
	            }
	            
	        } 
	}

}
