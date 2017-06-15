
import java.util.Scanner;

public class MinValue{
	
	public static void main(String[] args){
		
    System.out.println("Enter four numbers followed by delimiter and get the minimum value:");
	Scanner s= new Scanner(System.in);
	int[] val = new int[4];
	int i=0;
	while(s.hasNext()){  //Will always look for next value entered in console.
		if(s.hasNextInt()){  //Will scan for next int value.
			val[i] = s.nextInt();   //Storing the int value in array.
			i++;	
		}else{
			break;
		}
	}
	
	int minval = val[0];
	for(int x =1;x<val.length;x++){	
		if(minval>val[x]){   //Updating the minimum value if the minval has a greater value.
			minval = val[x];
		}else{
			continue;
		}
		
	}
	
	System.out.println("Minimum value is "+minval);	
	}
	
}

/*
INPUT: 
Enter four numbers followed by delimiter and get the minimum value:
65 22 7 14 +

OUTPUT: 
Minimum value is 7
*/