/*

WAP to shift an integer array by N number of places.
For e.g. your actual array is as below
{1,2,3,4,5,6,7,8,9,10}
Now suppose user want to shift array by 4 places, so after shift element your array should be look like as below
{5,6,7,8,9,10,1,2,3,4}

*/

import java.util.Scanner;

class ShiftingArray {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Provide Size of Array you want");
		
		int size = sc.nextInt();
		int arr[] = new int[size];
		int n = arr.length - 1;
		System.out.println("Please provide how many time you want rotation");
		int k = sc.nextInt();
		k = k % arr.length;
		
		System.out.println("Please Enter your array elements");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Before shifting");
		displayingArray(arr);

		reversing(arr , 0 , k-1);
		reversing(arr , n-k-1 , n);
		reversing(arr , 0 , n);
                
		System.out.println("After shifting");
		displayingArray(arr);

	}

	public static void reversing(int arr[] , int start , int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--; 
		}
	}
	
	public static void displayingArray(int[] arr) {
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
