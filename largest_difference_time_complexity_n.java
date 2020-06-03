package array_RB1;

import java.util.HashMap;
import java.util.Scanner;

public class largest_difference_time_complexity_n{
	
	public static void main(String ar[])
	{
		
		Scanner s=new Scanner(System.in);
		int[] arr= {-1,0,-3};
		int max_so_far=0,a=0,min_so_far=Integer.MAX_VALUE;
		for(int i=1;i<arr.length;i++)
		{
		  if(arr[i]<arr[a])
		  {
			  a=i;
			  min_so_far=arr[i];
		  }
		  if(max_so_far<(arr[i]-min_so_far))
		  {
			  max_so_far=(arr[i]-min_so_far);
		  }
		  
		}
		System.out.print("max_so_far: "+max_so_far);
	}

}
