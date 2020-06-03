
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		    int n=s.nextInt();
		    int k=s.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		        a[i]=s.nextInt();
		  //  due to atmost k
		    for(int i=0;i<=n-k;i+=k)
		    {
		  //  	System.out.println("i: "+i+"+++++++++++");
		      for(int j=i+1;j<i+k;j++)
		      {
		          //System.out.println("j: "+j+"a[j]: "+a[j]+" i+k: "+(i+k));
		          
		          int key=a[j];
		          int g=j-1;
		          while(g>=i && key<a[g])
		          {
		              a[g+1]=a[g];
		              g--;
		          }
		          a[g+1]=key;
		       }
		      
		  //    for(int f=i;f<i+k;f++)
			 //   {
			 //    System.out.print(a[f]+" ");   
			 //   }
		  //    System.out.println();   
		    }
		    
		    for(int f=0;f<n;f++)
		    {
		     System.out.print(a[f]+" ");   
		    }
		  System.out.println();   
		}
	}
}