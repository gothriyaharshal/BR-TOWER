/*
Remove duplicate element from an Array.
*/

/*
3) WAP to create an Array of n size, input Array element by user and find out the largest value.

*/

import java.util.Scanner;

class RemovingDuplicateElement {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Provide Size of Array you want");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		

		System.out.println("Please Enter your array elements");
		
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}
	
		System.out.println("Before remove");
		displayingArray(arr , arr.length);
		int n = arr.length;
		int afterRemoveDuplicatelength = 0 ;

		for(int i = 0 ; i < n ; i++) {
			for(int j = i+1 ; j < n ; j++) {
				if(arr[i] == arr[j] ) {
					 
					for(int k = j ; k < n-1 ; k++) {
						arr[k] = arr[k+1];
					}
					n--;
					j--;
				}
			}

		}
		afterRemoveDuplicatelength = n ;
	
		System.out.println("After remove");
		displayingArray(arr , afterRemoveDuplicatelength);
	}

	public static void displayingArray(int[] arr , int length) {
		for(int i = 0 ; i < length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
} 