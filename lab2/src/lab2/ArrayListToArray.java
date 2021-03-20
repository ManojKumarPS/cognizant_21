package lab2;
/**
* Name: Manoj Kumar P S
* Description: convert an ArrayList to an array
* Date: 3/19/2021
*/

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		Integer arr[]=new Integer[arrList.size()];
		arrList.toArray(arr);
		System.out.println("In array: ");
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
	}

}
