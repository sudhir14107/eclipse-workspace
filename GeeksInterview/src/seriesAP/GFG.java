package seriesAP;

import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int a=in.nextInt();
			int b=in.nextInt();
			int n=in.nextInt();
			System.out.println(a+(n-1)*(b-a));
			t--;
			
		}

	}

}
