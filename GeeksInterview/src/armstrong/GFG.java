package armstrong;

import java.util.Scanner;

public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int a=in.nextInt();
			int sum=0,temp=a;
			while(temp>0) {
				sum=(int) (sum+Math.pow((temp%10), 3));
				temp=temp/10;
			}
			if(a==sum) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
			
			t--;
			
		}

	}

}
