/*
3) WAP to create an Array of n size, input Array element by user and find out the largest value.

*/

import java.util.Scanner;
import static java.lang.Integer.MAX_VALUE;

class CalculatingLargesttValueArray {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = Integer.MIN_VALUE;;
		System.out.println("Provide Size of Array you want");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
	
		System.out.println("Please Enter your array elements");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}


		for(int i = 0 ; i < arr.length ; i++) {
			
			if(max < arr[i]) {
				max = arr[i];
			}

		}
		System.out.println("Largest Value of array is  -> " + max);
		
	}
} 