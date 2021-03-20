package lab2;

/**
* Name: Manoj Kumar P S
* Description:List of products with duplicate values
* Date: 3/17/2021
*/
import java.util.Scanner;
import java.util.Arrays;

public class FindDuplicate {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int numberOfProducts,k=0;
		System.out.println("Enter the size of products" );
		numberOfProducts=sc.nextInt();
		int products[]=new int[numberOfProducts];
		System.out.println("Enter the  products");
		for(int i=0; i<numberOfProducts;i++) 
			products[i]=sc.nextInt();	
		Arrays.sort(products);
		for(int i=0; i<numberOfProducts-1;i++)
		{
			for(int j=i+1; i<numberOfProducts;j++)
			{
				if(products[i]==products[j])
				{
					i++;
					k++;
					continue;
				}
				else break;
				}
			if(k>0)
				{
				System.out.println(products[i]);
				k=0;
				}
		}
		}
		}
	