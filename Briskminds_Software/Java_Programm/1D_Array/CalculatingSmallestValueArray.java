/*

WAP to create an Array of n size, input Array element by user and find out the smallest value.

*/

import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;

class CalculatingSmallestValueArray {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int min = Integer.MAX_VALUE;;
		System.out.println("Provide Size of Array you want");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
	
		System.out.println("Please Enter your array elements");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}


		for(int i = 0 ; i < arr.length ; i++) {
			
			if(min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println("Smallest Value of array is  -> " + min);
		
	}
} 