package ropeCutting;
import java.util.*;
public class RopeCutting {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of the rope and three possible cut sizes");
		int l=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(maxPieces(l,a,b,c));
		
	}
	public static int maxPieces(int l,int a,int b,int c)
	{
		if(l==0)
		{
			return 1;
			
		}
		if(l<0)
			return 0;
		
		return maxPieces(l-a,a,b,c)+maxPieces(l-b,a,b,c)+maxPieces(l-c,a,b,c);
		
		
			
			 
	}
}
