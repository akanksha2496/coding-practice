package array_RB1;

import java.util.HashMap;
import java.util.Scanner;

public class largest_difference {
	static int max(int[] a,int i,String s)
	{
		int max=a[i],index=i;
		for(int x=i;x<a.length;x++)
		{
			if(s=="max")
			{
				if(max<=a[x])
				{
					max=a[x];
					index=x;
				}
			}
			else if(s=="min")
			{
				if(max>=a[x])
				{
					max=a[x];
					index=x;
				}
			}
		}
		return index;
	}
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int[] a= {4,3,10,2,9,1,6};
		int j,i=0,max_so_far=-1;
		do {
			j=max(a,i,"max");
			int min=a[0],index=0;
			for(int c=0;c<j;c++)
			{
				if(a[c]<=min)
				{
					min=a[c];
					index=c;
				}
			}
			System.out.println("min index: "+index+" min elemnent: "+min+" max index: "+j+"max element: "+a[j]);
			max_so_far=Math.max(a[j]-min, max_so_far);
		    i=j+1;
			
			
		}while(i<a.length);
		
		System.out.println("max so far: "+max_so_far);
	}

}
