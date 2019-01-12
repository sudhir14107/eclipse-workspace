import java.util.Scanner;

class GFG 
{ 
	public static void main(String args[]) 
    {
		int i = 0, j = 9; 
        do { 
            i++; 
            if (j-- < i++) { 
                break; 
            } 
        } while (i < 5); 
          System.out.println(i + "" + j); 
    }
}  