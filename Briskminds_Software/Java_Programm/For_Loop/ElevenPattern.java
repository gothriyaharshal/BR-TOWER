//print the below pattern

import java.util.Scanner;

class ElevenPattern {
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

			for(int j = 1 ; j<=i ; j++) {
				if( (j % 2) == 0)
					System.out.print(0);
 				else
					System.out.print(1);
			}
			System.out.println();
		}
	}
}