/**
* Name: Manoj Kumar P S
* Description:   check if a number is a power of two or not
* Date: 3/20/2021
*/
import java.util.Scanner;
public class PowerOTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		System.out.println(checkNumber(number));
}

	
	public static  boolean checkNumber(int n)
{
	boolean status=false;
	int mul=1;
	while(true)
	{
		mul*=2;
		if(mul==n)
		{
			status=true;
			break;
		}
		else if(mul>n)
			break;
		
	}
    
	return status;
}

}

