/*
WAP to input an integer value and calculate factorial.

Author -> Harshal Gothriya
Date   -> 15/10/2026

*/

import java.util.Scanner;

class Factorial {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide your number we calculates its factorial");
		int number = sc.nextInt();
		int fact = 1;
		while(number >= 1) {
			fact = fact * number;
			number--;
		}
		System.out.println("Total factorial is => " + fact );
	}
}