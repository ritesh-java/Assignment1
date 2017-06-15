import java.util.Scanner;

public class Armstrong{
	
	public static void checkArmstrong(int x){
          int temp, newval=0, remainder;
          temp = x;
          
          while(temp!=0){
        	  remainder = temp%10;
        	  newval = (int) (newval + Math.pow(remainder, 3));
        	  temp = temp/10;
          }
          
          if(newval==x)
        	  System.out.println(x+" is a Armstrong number");
          
          else
        	  System.out.println(x+" is not a Armstrong number");         
          
         }
 
	
	public static void main(String[] args){
		System.out.println("Enter the number to check if it's Armstrong or not");
		Scanner scan = new Scanner(System.in);
		
		int val = scan.nextInt();
		
		checkArmstrong(val);
		
	}
}

/*
Output:
Enter the number to check if it's Armstrong or not
407
407 is a Armstrong number


Enter the number to check if it's Armstrong or not
4657
4657 is not a Armstrong number
*/