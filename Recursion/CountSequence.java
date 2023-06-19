package Recursion;
import java.util.*;
public class CountSequence {

	public static int printF(int i,int s,int arr[],int k)
	{
		
		if(i>=arr.length)
		{
			if(s == k)return 1;
			else return 0;
		}
		// Taking the element
		s+=arr[i];
		int l = printF(i+1,s,arr,k);
		// Not taking the element
		s-=arr[i];
		int r = printF(i+1,s,arr,k);
		return l+r;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[] = {1,2,-1,3};
		int p = printF(0,0,arr,2);
		System.out.println(p);
        
	}

}
