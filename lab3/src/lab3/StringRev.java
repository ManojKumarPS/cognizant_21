package lab3;

import java.util.Scanner;

/**
* Name: Manoj Kumar P S
* Description:  create the mirror image of a String and return the two Strings separated with a pipe(|) symbol 
* Date: 3/19/2021
*/
public class StringRev {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=new String();
		System.out.println("Enter the string");
		input=sc.next();
		System.out.println(getImage(input));
	}

	private static String getImage(String input) {
		StringBuilder sb=new StringBuilder(input);  
	    sb.reverse();
	    sb.toString();
		return input+'|'+sb;	
	}

}
