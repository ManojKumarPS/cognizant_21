import java.util.Scanner;

/**
* Name: Manoj Kumar P S
* Description:Prime number upto the given integer
* Date: 3/14/2021
*/
import java.util.Scanner;
public class PrimeNm {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		for(int i=2;i<=num;i++)
		{
			int k=0;
			for(int j=2;j<i;j++)
			{
				if((i%j)==0)
					{
					k=1;
					
					break;
					}
			}
			if(k==0)
				System.out.println(i);
			
		}
	

	}

}
