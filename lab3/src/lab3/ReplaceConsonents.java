package lab3;

import java.util.Scanner;
import java.util.Arrays;

/**
* Name: Manoj Kumar P S
* Description:  String replacing all the consonants with the next character
* Date: 3/19/2021
*/
public class ReplaceConsonents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=new String();
		System.out.println("Enter the string");
		input=sc.next();
		System.out.println(alterString(input));
	}

	private static String alterString(String input) {
		char ch[]=(input.toLowerCase()).toCharArray();
		int findLoc=-1;
		char alphaList[]="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();		
		for( int i=0;i<ch.length;i++) {
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U')
				continue;
			findLoc=Arrays.binarySearch(alphaList,ch[i]);
			if(findLoc>=0)
			{
				ch[i]=alphaList[findLoc+1];
			}
		}
			
		String S=new String(ch);
		return S;
	}

}
