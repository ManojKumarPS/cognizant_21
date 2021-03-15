/**
* Name: Manoj Kumar P S
* Description: traffic signal using ifelse
* Date: 3/14/2021
*/
import java.util.Scanner;
public class TrafficSignal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the appropriate number \n 1. Red \n 2. yellow\n 3. Green");
		int num=sc.nextInt();
		if(num==1)
			System.out.println("Stop");
		else if(num==2)
			System.out.println("ready");
		else if(num==3)
			System.out.println("Go");
		else System.out.println("enter proper number");
	}

}
