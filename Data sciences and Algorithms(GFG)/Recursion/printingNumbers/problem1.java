package printingNumbers;
import java.util.*;
public class problem1 {
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a length");
	   int l=sc.nextInt();
	   int temp=l;
	   print(l,1);
	   
   }
   public static void print(int n,int k)
   {
	   if(n==0)
	   {
		   return;
	   }
	   if(k%3!=0)
	   System.out.print(k);
	   print(n-1,k+1);
   }
}
