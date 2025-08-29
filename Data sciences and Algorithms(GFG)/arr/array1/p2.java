package array1;
import java.util.*;
public class p2 {
    public static void main(String [] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter length and elements of the array");
    	int l=sc.nextInt();
    	int n[]=new int[l];
    	for(int i=0;i<l;i++)
    		n[i]=sc.nextInt();
    	freq(n);
    	
    }
    
    	public static void freq(int arr[])
    	{
    		int  c=0,f=1;
    		for(int i=1;i<arr.length;i++)
    		{
    			if(arr[i]==arr[c])
    				f++;
    			else
    			{
    				c=i;
    				System.out.println(arr[i-1]+" "+f);
    				f=1;
    			}
    		}
    		System.out.println(arr[arr.length-1]+" "+f);
    	}
}

