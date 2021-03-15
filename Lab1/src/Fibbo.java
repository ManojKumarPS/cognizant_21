/**
* Name: Manoj Kumar P S
* Description: Fibbonacci series of first n terms
* Date: 3/14/2021
*/
import java.util.Scanner;
public class Fibbo {	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth term");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			int k=find(i);
			System.out.println(k);
			
		}
	}

	private static int find(int i) {
		if(i==1)
			return 0;
		if(i==2)
			return 1;
		if(i==3)
			return 1;
		int fib1=1,fib2=1,nextFib=0;
		for(int j=0;j<i-3;j++)
		{
			nextFib=fib1+fib2;
			
			fib1=fib2;
			fib2=nextFib;
		}
		return nextFib;
		
		
		
	}
}