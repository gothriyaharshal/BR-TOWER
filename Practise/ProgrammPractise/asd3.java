/* 
    1
   121
  12321
 1234321
123454321

*/

import java.util.Scanner;

public class asd3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		int row = sc.nextInt();

		for(int i = 1 ; i <= row ; i++) {
			//space
			for(int space = 1 ; space <= row-i ; space++) {
				System.out.print(" ");
			}

			//forword
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j);
			}

			//backword
			//forword
			for(int k = i-1 ; k >= 1 ; k--) {
				System.out.print(k);
			}
	
			System.out.println();
		}		
	}
}