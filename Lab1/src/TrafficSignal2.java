/**
* Name: Manoj Kumar P S
* Description: Traffic signal using switch
* Date: 3/12/2021
*/
import java.util.Scanner;
public class TrafficSignal2 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the appropriate number \n 1. Red \n 2. yellow\n 3. Green");
			int num=sc.nextInt();
			switch(num)
			{
			case 1: System.out.println("Stop");
			break;
			case 2: System.out.println("ready");
			break;
			case 3:System.out.println("Go");
			break;
			default:
				System.out.println("enter proper number");
			}
	}

}
