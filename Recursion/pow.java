package Recursion;

public class pow {

	public static double pow(double x,int n)
	{
		if(n == 1)return 2;
		double result = (x)*pow(x,n-1);
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pow(2.3,3));
	}

}
