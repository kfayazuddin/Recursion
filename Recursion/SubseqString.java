package Recursion;

public class SubseqString {

	public static String[]getSubsequence(String str)
	{
		if(str.length() == 0)
		{
			String ans[] = {""};
			return ans;
			
		}
		// Asumming that all previously subsequences i will receive
		 String Output[] = getSubsequence(str.substring(1));
		 String ans[] = new String[2*Output.length]; // to copy the sequnce till half and left half will be appended with first character
		 int k = 0;
		 for(int i = 0;i<Output.length;i++)
		 {
			 ans[k++] = Output[i];
		 }
		 for(int i = 0;i<Output.length;i++)
		 {
			 ans[k++] = str.charAt(0)+Output[i];
		 } 
		return ans;
	}
	public static void main(String[] args) 
	{
		  String str = "Hel";
		  String[] output = getSubsequence(str);
		  for(int i = 0;i<output.length;i++)
		  {
			  System.out.println(output[i]);
		  }
		  return ;
	}

}
