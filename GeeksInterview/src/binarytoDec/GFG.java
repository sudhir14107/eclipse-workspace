package binarytoDec;

import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		long t=in.nextLong();
		while(t>0)
		{
			long a=in.nextLong();
			long sum=0,index=0;
			while(a>0)
			{
				sum=(int) (sum+Math.pow(2, index)*(a%10));
				index++;
				a=a/10;
			}
			System.out.println(sum);
			t--;	
		}

	}

}
