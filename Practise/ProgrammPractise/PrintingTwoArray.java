//printing two D array

import java.util.Scanner;

class PrintingTwoArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide your row size of array");
		int row = sc.nextInt();

		System.out.println("Please provide your column size of array");
		int column = sc.nextInt();

		int arr[][] = new int[row][column];

		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		displaying(arr);
	}

	public static void displaying(int arr[][]){
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
 }
