/* 
Author -> Harshal gothriya
Date -> 20 / 10 / 2026

*/

import java.util.Scanner;

public class TestArrayUtility {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your array size");
	
		int n = sc.nextInt();
		int arr[] = new int[n];

		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Displaying original array.");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}

		ArrayUtility.sortingArray(arr);
		System.out.println("Displaying array after sorting");
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}

		System.out.println("Please provide which number do you want to search in this array we found its first index");
		int number = sc.nextInt();
	
		int index = ArrayUtility.searchFirstIndex(number , arr);

		if(index > 0 )
			System.out.println("First index of this element in this array is" + index);
		else 
			System.out.println("There is no existing of this element in this array");
	}
}