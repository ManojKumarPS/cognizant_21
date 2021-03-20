package lab3;

import java.util.Scanner;

/**
* Name: Manoj Kumar P S
* Description:read a line of integers and then displays each integer and the sum of all integers. 
* Date: 3/19/2021
*/

public class SumOfIntegers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=new String();
		System.out.println("Enter the number");
		input=sc.nextLine();
		String arr[]=new String[20];
		arr=input.split(" ");
		int sumOfAllInt=0;
		for(String S:arr)
		{
			System.out.println(S);
			sumOfAllInt=sumOfAllInt+Integer.parseInt(S);
		}
		System.out.println("sum off all integers="+sumOfAllInt);

	}

}
