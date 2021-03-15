/**
* Name: Manoj Kumar P S
* Description:Find the sum of the cubes of the digits of an n digit number
* Date: 3/14/2021
*/
import java.util.Scanner;
public class SumOfCubes {
    
	public static void main(String[] args) {
		Scanner no1=new Scanner(System.in);
		Scanner no2=new Scanner(System.in);
		System.out.println("Enter the number and its length");
		int num=no1.nextInt();
		int n=no2.nextInt();
		int sum=sCubes(num,n);
		System.out.println(sum);
	}

	private static int sCubes(int num,int n) {
       int rem,sum=0;
       for(int i=0;i<n;i++) {
    	   rem=num%10;
    	   sum=sum+(rem*rem*rem);
    	   num=num/10;
       }
       return sum;
       
		
	}

}
