package Recursion;
import java.util.*;
public class Linearly1toN {

	static Scanner s = new Scanner(System.in);
	public static void func(int i,int n)
	{
		if(i>n)return;
		System.out.println(i);
		func(i+1,n);
	}
	public static void main(String[] args) 
	{
        System.out.println("Enter the N");
        int n = s.nextInt();
        func(1,n);
	}

}
