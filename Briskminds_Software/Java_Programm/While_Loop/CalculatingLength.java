/*
 WAP to input an integer value from user and calculate length.

Author -> Harshal Gothriya
Date   -> 15/10/2026

*/

import java.util.Scanner;

class CalculatingLength {
	public static void main(String args [] ) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your value we calculate its lenght");
		
		int value = sc.nextInt();
		int count = 0;
		while(value > 0) {
    			value = value/10;
 			count++;
		}		
		System.out.println("Total length of your value is => " + count);
	}
}