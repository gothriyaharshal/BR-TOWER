/*
WAP to calculate power.

Author -> Harshal Gothriya
Date   -> 15/10/2026

*/
 

import java.util.Scanner;

class CalculatingPower {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);		

		System.out.println("Please provide your digit");
		int digit = sc.nextInt();

		System.out.println("Please provide power of digit you want");
		int power = sc.nextInt();
	
		int answer = 1;

		while(power > 0 ) {
			answer = digit * answer ;
			power--;
		}
		System.out.println("your answer is => " + answer );
		
	}
}