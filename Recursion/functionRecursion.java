package Recursion;
import java.util.*;
public class functionRecursion {

	public static Scanner s = new Scanner(System.in);
	public static int func(int n)
	{
		if(n == 0)return 0;
		return n+func(n-1);
	}
	public static void main(String[] args) 
	{
		 System.out.println("Enter the n");
		 int n = s.nextInt();
		 System.out.println("Sum"+" "+func(n));
	}
}
