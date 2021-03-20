/**
* Name: Manoj Kumar P S
* Description:  calculate the sum of first n natural numbers which are divisible by 3 or 5. 
* Date: 3/19/2021
*/
import java.util.Scanner;
public class SumOfNaturalNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println(" Sum is:"+calculateSum(num));
		

	}
	private static int calculateSum(int num)
	{
		int sum=0;
		for(int i=3;i<=num;i++)
		{
			if((i%3==0)||(i%5==0))
			{
				sum+=i;
			}
		}
		return sum;
	}
}


