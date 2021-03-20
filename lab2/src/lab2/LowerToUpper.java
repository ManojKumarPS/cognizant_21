package lab2;
/**
* Name: Manoj Kumar P S
* Description: lower to upper case
* Date: 3/19/2021
*/
import java.util.Scanner;

public class LowerToUpper {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String lowString;
		System.out.println("Enter the lowercase string");
		lowString=sc.next();
		System.out.println("uppersting is :"+ lowString.toUpperCase());
		

	}

}
