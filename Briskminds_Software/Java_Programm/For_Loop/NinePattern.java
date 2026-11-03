//print the below pattern

import java.util.Scanner;

class NinePattern {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide how many row do you want");
		int row = sc.nextInt();

		System.out.println("Please provide how many column do you want");
		int column = sc.nextInt();

		for(int i = row ; i >= 1 ; i--) {

			for(int space = 1 ; space <= row-i ; space++) {
				System.out.print(" ");
			}

			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j);
 			}
			
			System.out.println();
		}
	}
}