package lab2;
/**
* Name: Manoj Kumar P S
* Description: sorted list of product names
* Date: 3/17/2021
*/
import java.util.Scanner;
import java.util.Arrays;

public class SortName {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numberOfNames;
		System.out.println("Enter the number of names");
		numberOfNames=sc.nextInt();
		String names[]=new String[numberOfNames];
		System.out.println("Enter the names");
	    for(int i=0; i<numberOfNames;i++)
	    	names[i]=sc.next();
	    Arrays.sort(names);
	    for(int i=0; i<numberOfNames;i++)
		   System.out.println(names[i]);
	    }
}
