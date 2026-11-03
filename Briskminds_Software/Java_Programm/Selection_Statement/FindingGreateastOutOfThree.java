/*
 author -> Harshal Gothriya
 Date -> 14/10/2026
*/

import java.util.Scanner;

class FindingGreateastOutOfThree {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Provide your first number");
		int a = sc.nextInt();

		
		System.out.println("Provide your second number");
		int b = sc.nextInt();

		
		System.out.println("Provide your third number");
		int c = sc.nextInt();

		//using Conditional operators
		if(a > b) 
			if(a > c)
				System.out.println("A is Greater");
                         else                                              //here a less then c
                                 System.out.println("B is Greater");       //c is greater then a and b then c is greater
	        else 
			if(b > c)                              //if b is greater then a and b is greater then c we took this
				System.out.println("B is Greater");
			else
				System.out.println("C is Greater");  			
	}
}