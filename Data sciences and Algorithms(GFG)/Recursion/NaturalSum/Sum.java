package NaturalSum;
import java.util.*;
public class Sum {
    public static void main(String [] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a number upto which calculation");
    	int n=sc.nextInt();
    	System.out.println(sum(n));
    }
    public static int sum(int n)
    {
    	if(n<10)
    		return n;
    	return sum(SumD(n)) ;
    }
    public static int SumD(int n)
    {
    	if(n==0)
    		return 0;
    	return (n%10)+SumD(n/10);
    }
}
