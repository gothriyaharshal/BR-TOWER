//addition of two matrix

//printing two D array

import java.util.Scanner;

class AdditionOfTwoMatrix {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide your row size of array");
		int row1 = sc.nextInt();

		System.out.println("Please provide your column size of array");
		int col1 = sc.nextInt();

		int arr[][] = new int[row1][col1];

		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		displaying(arr);

		
		System.out.println("Please provide your row size of array");
		int row2 = sc.nextInt();

		System.out.println("Please provide your column size of array");
		int col2 = sc.nextInt();

		int arr2[][] = new int[row2][col2];

		for(int i = 0 ; i < arr2.length ; i++) {
			for(int j = 0 ; j < arr2[i].length ; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}

		displaying(arr2);

		if(row1 == row2 && col1 == col2) {
		int arr3[][] = adding(arr , arr2 , row1 , col1 );
		displaying(arr3);
 		}

	}

	public static void displaying(int arr[][]){
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public static int[][] adding(int arr[][] , int arr2[][] , int row , int col ) {
		
		int[][] arr4 = new int[row][col]; 
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				arr4[i][j] = arr[i][j] + arr2[i][j];
			}
		}
		return arr4;
	}
 }
