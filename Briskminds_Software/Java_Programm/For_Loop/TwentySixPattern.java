//print the below pattern

import java.util.Scanner;

class TwentySixPattern {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);

			
		System.out.println("Please provide how many row do you want");
		int row = sc.nextInt();

	/*	System.out.println("Please provide how many column do you want");
		int column = sc.nextInt();
*/
		int number = 1 ;

		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				
				if(i <= (row/2) + 1) 
					if(j == 1 || j == i)
						System.out.print(j);
					else
						System.out.print(" ");
				else if(i >= (row/2) + 2)
					if(j == 1 || j == i-number) {
						System.out.print(j);
						number++;
			                 } 
					else {
						System.out.print(" ");
					}             
 			}

			System.out.println();
		}
	}
}