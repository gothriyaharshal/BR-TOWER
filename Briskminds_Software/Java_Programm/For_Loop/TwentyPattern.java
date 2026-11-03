//print the below pattern

import java.util.Scanner;

class TwentyPattern {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide how many row do you want");
		int row = sc.nextInt();

		System.out.println("Please provide how many column do you want");
		int column = sc.nextInt();

		for(int i = 1 ; i <= row ; i++) {

			for(int space = 1 ; space <= row-i ; space++) {
				System.out.print(" ");
			}

			for(int j = 1 ; j <= 2*i-1 ; j++) {								System.out.print("*");
			}

			System.out.println();
		}
	}
}