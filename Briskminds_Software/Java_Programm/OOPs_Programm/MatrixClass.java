/*

Author -> "Harshal Gothriya"
Date   -> 20/10/2026

*/

import java.util.Scanner;

class MatrixClass {
	
	Scanner sc = new Scanner(System.in);

	int[][] matrix ;

	public MatrixClass() {

	}
	MatrixClass(int row , int column) {

		System.out.println("Please provide elements of your matrix");

		matrix = new int[row][column];		

		for(int i = 0 ; i < matrix.length ; i++) {
			for(int j = 0 ; j < matrix[i].length ; j++) {
				matrix[i][j] = sc.nextInt();
			}
			System.out.println();
		}			
	}

	public void displaying() {
		for(int i = 0 ; i < matrix.length ; i++) {
			for(int j = 0 ; j < matrix[i].length ; j++) {
				System.out.print(matrix[i][j]);
			}
		System.out.println();
		}
	}

	public MatrixClass add(MatrixClass other) {
		MatrixClass result = null;
		if(matrix.length == other.matrix.length && matrix[0].length == other.matrix[0].length)	{
			result = new MatrixClass();
			result.matrix = new int[matrix.length][matrix[0].length];

			for(int i = 0 ; i < matrix.length ; i++) {
				for(int j = 0 ; j < matrix[i].length ; j++) {
					result.matrix[i][j] = matrix[i][j] + other.matrix[i][j];	
				}
			}
		}
		return result;	
	}

	public MatrixClass transpose() {
	
		MatrixClass resultTranspose = new MatrixClass();

		resultTranspose.matrix = new int[matrix[0].length][matrix.length];

		for(int i = 0 ; i < matrix[0].length ; i++) {
			for(int j = 0 ; j < matrix.length ; j++) {
				resultTranspose.matrix[i][j] = matrix[j][i];
			}
		}
		return resultTranspose;	
	}


	public MatrixClass multiplication(MatrixClass other2) {
		
		MatrixClass resultMulti = null;
		if(matrix[0].length == other2.matrix.length) {
			resultMulti = new MatrixClass();
			resultMulti.matrix = new int[matrix.length][other2.matrix[0].length];
			
			for(int i = 0 ; i < matrix.length ; i++) {
				for(int j = 0 ; j < other2.matrix[0].length ; j++) {
					for(int k = 0 ; k < matrix[0].length ; k++) {
						resultMulti.matrix[i][j] = resultMulti.matrix[i][j] + (matrix[i][k] * other2.matrix[k][j]);
					}
				}
			}	
		}
		return resultMulti;
	}
	
}