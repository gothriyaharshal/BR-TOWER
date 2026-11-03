/*
Author -> Harshal Gothriya
Date   -> 20/10/2026
*/


import java.util.Scanner;
class TestRational {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your numerator");
		int numerator = sc.nextInt();	
			
		System.out.println("Please provide your denominator");
		int denominator = sc.nextInt();	
		

		Rational r = new Rational(numerator,denominator);
		r.displaying();	

		
		System.out.println("Please provide your 2 numerator");
		int numerator2 = sc.nextInt();	
			
		System.out.println("Please provide your 2 denominator");
		int denominator2 = sc.nextInt();	
		

		Rational r2 = new Rational(numerator2,denominator2);
		r2.displaying();	


		System.out.println("Addition of 2 rational number");
		Rational r3 = r.addition(r2);
		r3.displaying();

		System.out.println("");

		System.out.println("Substraction of 2 rational number is");
		Rational r4 = r.substraction(r2);	
		r4.displaying();
	}
}