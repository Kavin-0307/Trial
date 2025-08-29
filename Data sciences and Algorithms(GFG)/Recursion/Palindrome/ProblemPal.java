package Palindrome;
import java.util.*;
public class ProblemPal {
    public static void main(String [] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter an integer:");
    	
    	String s1=sc.nextLine();
    	String result=LongestPrefix(s1,s1.length());
    	System.out.println(result);
    	
    }
    public  static boolean isPalin(String s,int start,int end) {
    	if(start>=end)
    		return true;
    	return (s.charAt(start)==s.charAt(end)&&isPalin(s,start+1,end-1));
    	
    }
    public static String LongestPrefix(String s, int len)
    {
    	if(len==0)
    		return "";
    	if(isPalin(s,0,len-1))
    		return s.substring(0,len);
    	return LongestPrefix(s,len-1);
    }
}
