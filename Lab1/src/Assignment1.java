/**
* Name: Manoj Kumar P S
* Description:reverse a string word by word
* Date: 3/16/2021
*/
public class Assignment1 {

	public static void main(String[] args) {
		String str="Hello My Dear Friend";
		String ch[]=str.split(" ");
		for(int i=0;i<ch.length;i++)
		System.out.print(ch[ch.length-1-i]+" ");

	}

}

