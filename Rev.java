/**
* Name: Manoj Kumar P S
* Description: convert rupees to dollars
* Date: 3/12/2021
*/
class Rev
{
	public static void main(String[] args)
	{
		int sum=0,rem,a=5687;
		for(int i=0;i<4;i++)
		{
			rem=a%10;
			sum=sum*10+rem;
			a=a/10;
		}
		System.out.println(sum);
	}
}	