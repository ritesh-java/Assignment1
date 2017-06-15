package packageone;

import java.util.Scanner;

public class ReverseNumber{
	public static long reverseNumber(long x){
		long reverse = 0;
		while(x!=0){
			int remainder = (int) (x%10);
			x = x / 10;
			reverse = (reverse*10) + remainder; 
		}	
		return reverse;
	}
	
	public static void main(String[] args){
      
		System.out.println("Enter the number to be reversed");
		Scanner scan = new Scanner(System.in);	
		long val = scan.nextLong();
		System.out.println("Reverse number is "+reverseNumber(val));
	}
}

/*
Output:
Enter the number to be reversed
34653451
Reverse number is 15435643
*/