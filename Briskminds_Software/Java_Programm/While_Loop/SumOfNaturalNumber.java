/*
Sum of natural numer for n_time.

Author -> Harshal Gothriya
Date   -> 15/10/2026

*/

import java.util.Scanner;

class SumOfNaturalNumber {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide your last natural digit till you want sum");
		int lastDigit = sc.nextInt();
		int sum = 0;

		while(lastDigit >= 1) {
			sum = sum + lastDigit;
			lastDigit--;
		}
		System.out.println("Total sum is => " + sum );
	}
}