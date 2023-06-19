package Recursion;
import java.util.*;
public class printn {

	public static void printcall(int cnt,int n)
	{
		if(cnt == n)return;
		System.out.println("Name");
		printcall(++cnt,n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter n");
		int n = s.nextInt();
		printcall(0,n);
	}

}
