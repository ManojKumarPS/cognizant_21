package lab3;
/**
* Name: Manoj Kumar P S
* Description: accepts a String and checks if it is a positive string
* Date: 3/20/2021
*/
import java.util.Scanner;

public class CheckPositive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str=sc.next();	
        System.out.println(checkIfPos(str));
	}
	private static String checkIfPos(String posStr)
	{
		int count=0;
		String out="";
		for(int i=0;i<posStr.length()-1;i++)
		{
			if(posStr.charAt(i)<posStr.charAt(i+1))
				count++;
			else
				break;
			
		}
		if(count==posStr.length()-1)
			out+="positive";
		else
			out+="not positive";
		return out;
	}
	}


