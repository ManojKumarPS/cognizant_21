/**
* Name: Manoj Kumar P S
* Description:   find the difference between the sum of the squares and the square of the sum of the first n natural numbers. 
* Date: 3/19/2021
*/
import java.util.Scanner;
public class DifferenceOfSquares {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the number");
			int n=sc.nextInt();
	        System.out.println("Difference :"+calculateDifference(n));
		}
	    private static int calculateDifference(int n)
	    {
	  	    int sumOfNum=0,sumOfSquares=0;
	    	for(int i=1;i<=n;i++)
	    	{
	    		sumOfNum+=i;
	    		sumOfSquares+=i*i;	
	    	}
	    	return (sumOfNum*sumOfNum)-sumOfSquares;
	}

}
