package packageone;

import java.util.Scanner;

public class FactorialVal{
    public static long factorial(long x){
        long val = 1;
    	if(x==1)
    		return 1;
    	
    	if(x>1){
    		val = x * factorial(x-1);  //Making recursive call until the x is 1.
    	}
    	
     return val;  	
    }
	
	public static void main(String[] args){
      
		System.out.println("Enter the number to find a factorial");
		Scanner scan = new Scanner(System.in);	
		long val = scan.nextLong();
		System.out.println("Factorial of "+val+" is "+factorial(val));
		scan.close();
	}
}

/*
Enter the number to find a factorial
6
Factorial of 6 is 720

Enter the number to find a factorial
7
Factorial of 7 is 5040

Enter the number to find a factorial
12
Factorial of 12 is 479001600

*/
