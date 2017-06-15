import java.util.Scanner;

public class PrimeNumber{
	
	public static void main(String[] args){
      
		System.out.println("Enter the number to check if it's prime or not");
		
		Scanner scan = new Scanner(System.in);
		
		int val = scan.nextInt();
		int primeflag = 0;
		
		for(int i=2;i<(val/2);i++){  //Need to check if the value is divisible by first half range of it's value.
		
			if(val%i==0){  //If the number is divisible then just set the flag and break out of the loop. No need to check for remaining values.
				primeflag = 1;
				break;
			}
				
		}
		
		if(primeflag==1)
			System.out.println(val+" is not a prime number");
		
		else
			System.out.println(val+" is a prime number");
			
	}
}

/*
Output:
Enter the number to check if it's prime or not
23
23 is a prime number
*/