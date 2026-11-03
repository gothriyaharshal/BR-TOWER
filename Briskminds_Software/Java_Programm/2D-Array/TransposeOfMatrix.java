/*

Transpose of Matrix

*/

import java.util.Scanner;
class TransposeOfMatrix {
	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your row sir");
		int row = sc.nextInt();

		System.out.println("Please provide your column sir");
		int column = sc.nextInt();

		int arr[][] = new int[row][column];

		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		System.out.println("Before Transposing an array");
		displayingArray(arr);

		System.out.println("After transposing an array");
		int ans[][] = transposing(arr , row , column);
		displayingArray(ans);			
	}


	public static int[][] transposing(int arr[][] ,int row ,int column) {
		int ans[][] = new int[column][row];
		for(int i = 0 ; i < column ; i++)  {
			for(int j = 0 ; j < row ; j++) {
				ans[i][j] = arr[j][i];
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