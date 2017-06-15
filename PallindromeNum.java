package packageone;

import java.util.Scanner;

public class PallindromeNum{
	public static void pallindrome(long x){
		long originalval = x;
		long reverse = 0;
		while(x!=0){
			int remainder = (int) (x%10);
			x = x / 10;
			reverse = (reverse*10) + remainder; 
		}
		
		if(reverse==originalval)
			System.out.println(originalval+" is a palindrome number");		
		else 
			System.out.println(originalval+" is a not palindrome number");
	}
	
	public static void main(String[] args){      
		System.out.println("Enter the number to check if it's pallindrome or not");
		Scanner scan = new Scanner(System.in);	
		long val = scan.nextLong();
		pallindrome(val);
		scan.close();
	}
}

/*
Output:
Enter the number to check if it's pallindrome or not
123454321
123454321 is a palindrome number

Enter the number to check if it's pallindrome or not
12545231
12545231 is a not palindrome number

*/