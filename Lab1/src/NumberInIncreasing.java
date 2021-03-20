import java.util.Scanner;

/**
* Name: Manoj Kumar P S
* Description:   check if a number is an increasing number 
* Date: 3/19/2021
*/
public class NumberInIncreasing {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the number");
			int n=sc.nextInt();
	        checkNumber(n);
	}

	private static void checkNumber(int n) {
		String S=Integer.toString(n);
		int check=0;
		for(int i=0;i<S.length()-1;i++) 
		{
			if(Integer.parseInt(Character.toString(S.charAt(i)))<=Integer.parseInt(Character.toString(S.charAt(i+1))))
				continue;
			else
			{
				check=1;
				break;
			}	
		}
		if(check==0)
			System.out.println("The number is in increasing order");
		else
			System.out.println("the number is not in increasing order");
				
		}
	}


