package factorial;
import java.util.*;
public class fact1 {
    public static void main(String [] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter an integer");
    	int n=sc.nextInt();
    	System.out.println(sum(n));
    	
    }
    public static int fact(int i)
    {
    	if(i==0||i==1)
    		return 1;
    	return i*fact(i-1);
    	
    }
    public static int sum(int n)
    {
    	if(n==0)
    		return 0;
    	int r=fact(n);
    	
    	return r+sum(n-1);    	
    }
}
