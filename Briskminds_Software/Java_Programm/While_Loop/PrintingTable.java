/*
printing an table for X times
Author -> Harshal Gothriya
Date   -> 15/10/2026
*/

import java.util.Scanner ;

class PrintingTable {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please provide which table you want to print => ");
		int table = sc.nextInt();

		System.out.print("Please provide how many multiple of this tables do you want => ");
		int numberOfTime = sc.nextInt();
                int start = 1;

		while(numberOfTime >= 1) {
			System.out.print(table * start + " ");
			start++;
			numberOfTime--;
		}
        }
}

