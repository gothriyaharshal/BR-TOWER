/*
3) WAP to create an Array of n size, input Array element by user and find out the largest value.

*/

import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;

class DeletingElementIntoArray {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Provide Size of Array you want");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
	
		System.out.println("Please Enter your array elements");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Please Provide position of your digit , if your array is of length => " + arr.length + "then your total position starts from 0 to " + (arr.length - 1));
		int position = sc.nextInt();

				
		int[] arr2 = deletingElementInArray(arr,position);
		displayingArray(arr2);
	}

	public static void displayingArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static int[] deletingElementInArray(int[] arr, int position ) {
		int newArr[] = new int[arr.length - 1];	
		int j = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(i == position) {
				continue;
			}
		newArr[j] = arr[i];
		j++;			
		}
		return newArr;
	}
} 