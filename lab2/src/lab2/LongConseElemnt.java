package lab2;
/**
* Name: Manoj Kumar P S
* Description:Length of longest Consecutive element
* Date: 3/17/2021
*/
import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math; 

public class LongConseElemnt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sizeOfArray,difference,j=0;
		System.out.println("Enter the size of array");
		sizeOfArray=sc.nextInt();
		int array[]=new int[sizeOfArray];
		int arrayDiff[]=new int[sizeOfArray];
		System.out.println("Enter the array");
		for(int i=0; i<sizeOfArray;i++)
			array[i]=sc.nextInt();
		Arrays.sort(array);
		for(int i=0; i<sizeOfArray-1;i++)
		{
			difference=Math.abs(array[i+1]-array[i]);
			if(difference==1)
			{
				arrayDiff[j]+=1;
				continue;
			}
			j++;	
		}
		Arrays.sort(arrayDiff);
		System.out.println(arrayDiff[arrayDiff.length-1]+1);

	}

}
