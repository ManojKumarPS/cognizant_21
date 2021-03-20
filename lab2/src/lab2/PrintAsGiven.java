package lab2;
/**
* Name: Manoj Kumar P S
* Description:Take 20 integer inputs from user and print the following:
	1. number of positive numbers
	2. number of negative numbers
	3. number of odd numbers
	4. number of even numbers
	5. number of 0s.

* Date: 3/17/2021
*/
import java.util.Scanner;
import java.lang.Math;

public class PrintAsGiven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int positiveNum=0,evenNum=0,oddNum=0,negativeNum=0,numOfZero=0;
		int array[]=new int[20];
		System.out.println("Enter the 20 numbers");
		for(int i=0; i<20;i++)
			array[i]=sc.nextInt();
		for(int i=0; i<20;i++)
		{
			if(array[i]>0) {
				positiveNum++;
				if(array[i]%2==0)
					evenNum++;
				else oddNum++;
			}
			else if(array[i]<0) {
				negativeNum++;
				if(Math.abs(array[i]%2)==0)
					evenNum++;
				else oddNum++;
			}
			else {
				numOfZero++;
				evenNum++;
			}
		}
		System.out.println("Number of positive numbers="+positiveNum);
		System.out.println("Number of negative numbers="+negativeNum);
		System.out.println("number of odd numbers="+oddNum);
		System.out.println("number of even numbers="+evenNum);
		System.out.println("number of zeros ="+numOfZero);

	}

}
