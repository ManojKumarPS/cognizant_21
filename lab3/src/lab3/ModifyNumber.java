package lab3;

import java.util.Scanner;
import java.lang.Math;

/**
* Name: Manoj Kumar P S
* Description:  Accepts the number and modifies as required
* Date: 3/20/2021
*/

public class ModifyNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num;
		num=sc.nextInt();
		System.out.println(modifyNumber(num));
		

	}

	private static int modifyNumber(int num) {
		String S=Integer.toString(num);
		int diff=0,mNum=0;
		for(int i=0;i<S.length()-1;i++)
		{
			diff=Integer.parseInt(Character.toString(S.charAt(i)))-Integer.parseInt(Character.toString(S.charAt(i+1)));
			mNum=mNum*10+Math.abs(diff);
		}
		mNum=mNum*10+num%10;
		return mNum;
	}

}
