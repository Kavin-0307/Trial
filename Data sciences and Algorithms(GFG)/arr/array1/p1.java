package array1;
import java.util.*;
public class p1 {
    public static void main(String [] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter length and elements of the array");
    	int l=sc.nextInt();
    	int arr[]=new int[l];
    	for(int i=0;i<l;i++)
    		arr[i]=sc.nextInt();
    	maxdiff(arr);
    	
    }  	
    
    public static void freq(int arr[])
    {
    	int n=arr.length;
    	int c=0,f=1;
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i]==arr[c])
    			f++;
    		if(arr[i]!=arr[c])
    			{System.out.println(arr[i-1]+" "+f);
    			f=0;
    			c=i;
    			}
    	}
    	System.out.println(arr[n-1]+ " "+f);

    }
    public static void maxdiff(int arr[])
    {
    	int n=arr.length;int minv=arr[0],maxd=arr[1]-arr[0];
    	for(int i=0;i<n;i++)
    	{
    		if(arr[i]-minv>maxd)
    		{
    			maxd=arr[i]-minv;
    			
    		}
    		if(arr[i]<minv)
    			minv=arr[i];
    	}
    	System.out.println(maxd);
    }
}
