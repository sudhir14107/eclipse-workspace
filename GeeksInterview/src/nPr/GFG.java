package nPr;

import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		long t=in.nextLong();
		while(t>0)
		{
			long n=in.nextLong();
			long r=in.nextLong();
			System.out.println(fact(n)/fact(n-r));
			t--;
		}

	}

	private static long fact(long l) {
		// TODO Auto-generated method stub
		long fact=1;
		for(long i=1;i<=l;i++)
		{
		  	fact=fact*i;
		}
		
		return fact;
	}

}
