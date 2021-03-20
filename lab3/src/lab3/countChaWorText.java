package lab3;

import java.util.Scanner;

/**
* Name: Manoj Kumar P S
* Description:  display the number of characters, lines and words in a text
* Date: 3/20/2021
*/
public class countChaWorText {

	public static void main(String[] args) {
		int cc=0,cw=1,cl=1;
		String str="I am manoj. I am good";
		
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='.') {
				cl++;
			}
			else if (str.charAt(i) ==' ') {
				cw++;
			}
			else if (str.charAt(i)!=' ') {
				cc++;
			}
		}
		 System.out.println("\nNumber of lines : "+cl);
         System.out.println("\nNumber of words : "+cw);
         System.out.println("\nNumber of characters : "+cc);
	}

		
		
		

	}

