/*
Author -> Harshal Gothriya
Date -> 20/10/2026
*/

import java.util.Scanner;

public class TestNumberUtility {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your number for checking is that number is prime or not then checking number is palimdrome or not then checking Armstrong or not " );
		
		int number = sc.nextInt();

		boolean prime = NumberUtility.isPrime(number);
		if(prime)
			System.out.println("Number is prime");
		else
			System.out.println("Number is not prime");

		
		
		boolean palimdrome = NumberUtility.isPalimdrome(number);
		if(palimdrome)
			System.out.println("Number is palimdrome");
		else
			System.out.println("Number is not palimdrome");

		
		boolean armstrong = NumberUtility.isArmstrong(number);
		if(armstrong)
			System.out.println("Number is armstrong");
		else
			System.out.println("Number is not  armstrong");
				
	}
}
