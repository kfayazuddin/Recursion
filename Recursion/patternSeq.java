package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class patternSeq {

    static Scanner s = new Scanner(System.in);
    public static void printF(int i,int arr[],ArrayList<Integer>list,int sum,int k)
    {
    	if(i>=arr.length)
    	{
    		if(sum == k)
    		{
    			for(int j= 0;j<list.size();j++)
    			{
    				System.out.print(list.get(j));
    			}
    			System.out.println();
    		}
    		return;
    	}
    	printF(i+1,arr,list,sum,k);
    	list.add(arr[i]);
    	printF(i+1,arr,list,sum+=arr[i],k);
    	list.remove(list.size()-1);
    	//printF(i+1,arr,list,sum-=arr[i],k);
    		
    }
	public static void main(String[] args) 
	{
    	// TODO Auto-generated method stub
		int arr[] = {1,-4,2,3};
		int k = 2;
		ArrayList<Integer>list = new ArrayList<Integer>();
		printF(0,arr,list,0,k); 
	}

}
