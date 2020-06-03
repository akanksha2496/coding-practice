package array_RB1;

import java.util.HashMap;
import java.util.Scanner;

public class odd_number_element_USINGxor{
	
	public static void main(String ar[])
	{
		
		Scanner s=new Scanner(System.in);
		int[] arr= {3,2,1,2,1};
		int x=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			x=x^arr[i];
			System.out.println("x: "+x);
		}
		System.out.println(x);
	}

}
