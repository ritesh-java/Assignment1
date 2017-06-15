package packageone;

import java.util.Scanner;

public class PerfectNum{
    public static void perfectnumber(int x){
		int sum = 0;
    	for(int i=1;i<=x/2;i++){ 		
    		if(x%i==0){
    			sum = sum + i;
    			System.out.print(i+", ");
    		}
    	}
    	System.out.println();	
    	if(sum==x){
    		System.out.println("Summation of above numbers is equal to the given number.");
    		System.out.println("Hence, "+x+" is a perfect number!!");
    	}
    	else{
    		System.out.println("Summation of above numbers is not equal to the given number.");
    		System.out.println("Hence, "+x+" is not a perfect number");
    	} 		
    }
	public static void main(String[] args){
		System.out.println("Enter the number to check if it's perfect number or not");
		Scanner scan = new Scanner(System.in);	
		int val = scan.nextInt();
		perfectnumber(val);
		scan.close();
	}
}

/*
Output:
Enter the number to check if it's perfect number or not
496
1, 2, 4, 8, 16, 31, 62, 124, 248, 
Summation of above numbers is equal to the given number.
Hence, 496 is a perfect number!!


Enter the number to check if it's perfect number or not
28
1, 2, 4, 7, 14, 
Summation of above numbers is equal to the given number.
Hence, 28 is a perfect number!!


Enter the number to check if it's perfect number or not
346
1, 2, 173, 
Summation of above numbers is not equal to the given number.
Hence, 346 is not a perfect number
*/