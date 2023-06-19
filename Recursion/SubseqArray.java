package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubseqArray {

	public static void subseq(int indx,int arr[],ArrayList<Integer>ans)
	{
		if(indx>=arr.length)
		{
			for(int i = 0;i<ans.size();i++)
			{
				System.out.print(ans.get(i)+" ");
			}
			System.out.println();
			return;
		}
		subseq(indx+1,arr,ans);
		ans.add(arr[indx]);
		subseq(indx+1,arr,ans);
		//Not taking
		ans.remove(ans.size()-1);
		//subseq(indx+1,arr,ans);
	}
	public static void main(String[] args) 
	{
		 int arr[] = {1,2,3,4};
		 ArrayList<Integer> list = new ArrayList<Integer>();
		 subseq(0,arr,list);
	}

}
