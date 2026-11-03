//print the below pattern

import java.util.Scanner;

class NineteenPattern {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide how many row do you want");
		int row = sc.nextInt();

		System.out.println("Please provide how many column do you want");
		int column = sc.nextInt();

		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j <= column ; j++) {
				if(i == 1 || i== row || j == 1 || j == column)
					System.out.print("*");
				else
					System.out.print(" ");
			}

			System.out.println();
		}
	}
}