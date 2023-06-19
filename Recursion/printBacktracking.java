package Recursion;
import java.util.*;
public class printBacktracking {
    public static Scanner s = new Scanner(System.in);
    public static void func(int i,int n)
    {
    	if(i>n)return;
    	func(i+1,n);
    	System.out.println(i);
    }
	public static void main(String[] args) 
	{
	  int n = s.nextInt();
	  func(1,n);
	}
}
