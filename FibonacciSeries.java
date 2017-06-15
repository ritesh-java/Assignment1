package packageone;

import java.util.Scanner;

public class FibonacciSeries{
    public static void fibonacci(int x){
		int prev1 =0;
		int prev2 = 1;
		
    	for(int i=0;i<x;i++){
    		if(i==0 || i ==1)
    			System.out.print(i+", ");
    		
    		else{
    			int temp = prev1 + prev2;
    			System.out.print(temp+", ");
    			prev1 = prev2;
    			prev2 = temp;
    		}
    			
    	}
    }
	
	public static void main(String[] args){
		System.out.println("Fibonacci series till Nth number, enter the integer value:");
		Scanner scan = new Scanner(System.in);	
		int val = scan.nextInt();
		fibonacci(val);
		scan.close();
	}
}

/*
Output: 

Fibonacci series till Nth number, enter the integer value:
10
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 


Fibonacci series till Nth number, enter the integer value:
20
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 

*/