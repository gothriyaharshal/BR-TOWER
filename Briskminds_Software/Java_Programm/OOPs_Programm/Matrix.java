/*

Author -> "Harshal Gothriya"
Date   -> 20/10/2026

*/

import java.util.Scanner;

class Matrix {
	public static void main(String args) {
		Scanner sc = new Scanner(System.in);

		int[][] matrix ;
		
		System.out.println();
		Matrix(int rows , int column) {
			matrix = new int[row][column];
			
			for(int i = 0 ; i < arr.length ; i++) {
				for(int j = 0 ; j < arr[i].length ; j++) {
					matrix[i][j] = sc.nextInt();
				}
			}			
		}

		//displaying the matrix function
		displaying(matrix);
	}

	public static void displaying(int arr[][]) {
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
	}

}