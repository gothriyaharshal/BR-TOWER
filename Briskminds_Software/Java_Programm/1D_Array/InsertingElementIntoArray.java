/*
3) WAP to create an Array of n size, input Array element by user and find out the largest value.

*/

import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;

class InsertingElementIntoArray {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Provide Size of Array you want");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
	
		System.out.println("Please Enter your array elements");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}


		displayingArray(arr);

		System.out.println("Please Provide position of your digit , if your array is of length => " + arr.length + "then your total position starts from 0 to " + (arr.length - 1));
		int position = sc.nextInt();

		System.out.println("Please Provide Digit which you want");
		int digit = sc.nextInt();

		
		int[] arr2 = insertingElementInArray(arr,position,digit);
		displayingArray(arr2);
	}

	public static void displayingArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	public static int[] insertingElementInArray(int[] arr, int position , int digit) {
		int newArr[] = new int[arr.length + 1];	
		
		for(int i = 0 ; i < position ; i++) {
			newArr[i] = arr[i];
		}
		newArr[position] = digit ;

		for(int j = position ; j < arr.length ; j++) {
			newArr[j + 1] = arr[j];
		}		 
		return newArr;
	}
} 