package lab2;

import java.util.Arrays;
import java.util.Scanner;

/**
* Name: Manoj Kumar P S
* Description:get 2nd smallest number
* Date: 3/17/2021
*/

public class GetSecondSmallestNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sizeOfArray,secSmallest;
		System.out.println("Enter the size of array");
		sizeOfArray=sc.nextInt();
		int array[]=new int[sizeOfArray];
		System.out.println("Enter the array");
		for(int i=0; i<sizeOfArray;i++)
			array[i]=sc.nextInt();
		secSmallest=getSecondSmallest(array);
		System.out.println(secSmallest);
	}

	private static int getSecondSmallest(int[] array) {
		Arrays.sort(array);
		return array[1];
	}

}
