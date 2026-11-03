//addition of two matrix

//printing two D array

import java.util.Scanner;

class TraverSingAnMatrix {
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

		int newArr[][] = new int[col1][row1];
		for(int i = 0 ; i < newArr.length ; i++) {
			for(int j = 0 ; j < newArr[i].length ; j++) {
				newArr[i][j] = arr[j][i];
			}
		}

		displaying(newArr);
	}

	public static void displaying(int arr[][]){
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ; j++) {
				System.out.print(arr[i][j] + " " );
			}
			System.out.println();
		}
	}
 }
