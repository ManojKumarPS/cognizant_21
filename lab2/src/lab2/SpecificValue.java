package lab2;
/**
* Name: Manoj Kumar P S
* Description: Test if an array contains a specific value
* Date: 3/17/2021
*/
import java.util.Scanner;
import java.util.Arrays;

public class SpecificValue {

	public static void main(String[] args) {
		int specificValue,sizeOfArray;
		int indexLocation=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		sizeOfArray=sc.nextInt();
		int array[]=new int[sizeOfArray];
		System.out.println("Enter the array");
		for(int i=0; i<sizeOfArray;i++)
			array[i]=sc.nextInt();
		System.out.println("Enter the specificValue");
		specificValue=sc.nextInt();
		indexLocation=Arrays.binarySearch(array,specificValue);
		if(indexLocation>=0)
			System.out.println("location is="+indexLocation);
		else
			System.out.println("not found");
	}

}
