package numPlaindrome;

import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int a=in.nextInt();
			int sum=0,sum1=0;
			while(a>0)
			{
				sum=sum+(a%10);
				a=a/10;
			}
			a=sum;
			while(sum>0) {
				sum1=(sum1*10)+(sum%10);
				sum=sum/10;
			}
			if(sum1==a) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
			t--;
			
		}

	}

}
