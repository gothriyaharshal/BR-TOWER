/*

Author = "Harshal Gothriya"
Date = 16/10/2026

*/

import java.util.Scanner;

public class MultiplicationMatrix {
	public static void main(String args []) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide your first 2-D array row size");
		int row1 = sc.nextInt();
		System.out.println("Please provide your first 2-D array column size");
		int column1 = sc.nextInt();
		int arr1[][] = new int[row1][column1];
		for(int i = 0 ; i < arr1.length ; i++) {
			for(int j = 0 ; j < arr1[i].length ; j++) {
				arr1[i][j] = sc.nextInt();
			}
			System.out.println();
		}

		

		System.out.println("Please provide your second 2-D array row size");
		int row2 = sc.nextInt();		
		System.out.println("Please provide your second 2-D array column size");
		int column2 = sc.nextInt();
		int arr2[][] = new int[row2][column2];
		for(int i = 0 ; i < arr2.length ; i++) {
			for(int j = 0 ; j < arr2[i].length ; j++) {
				arr2[i][j] = sc.nextInt();
			}
			System.out.println();
		}



		//addition only possible if both array have same row and same column
		
		if(column1 == row2) {
		int ans[][] = mul(arr1 , arr2 , row1 , column1 , row2 , column2);
		displayingArray(ans);	
		}   
		else{
			System.out.println("Your first array column is not equal to second column row");
		}
	}




	public static int[][] mul(int arr1[][] , int arr2[][] , int row1 , int column1 , int row2 , int column2) {
		int ans[][] = new int[row1][column2];
		for(int i = 0 ; i < row1 ; i++) {
			for(int j = 0 ; j < column2 ; j++) {
				for(int k = 0 ; k < column1 ; k++ ) {
					ans[i][j] = ans[i][j] + (arr1[i][k] * arr2[k][j]);
				}
			}
		}
		return ans;
	}

	public static void displayingArray(int arr[][])	{
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}