/*
 author -> Harshal Gothriya
 Date -> 14/10/2026
*/

import java.util.Scanner;

class FindingGreateastOutOfFour {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Provide your first number");
		int a = sc.nextInt();

		
		System.out.println("Provide your second number");
		int b = sc.nextInt();

		
		System.out.println("Provide your third number");
		int c = sc.nextInt();

		System.out.println("Provide your fourth number");
		int d = sc.nextInt();

		//using Conditional operators
		if(a > b && a > c && a > d) 
				System.out.println("A is Greater");
                else if(b > a && b > c && b> d) 
				System.out.println("b is Greater");
                else if(c > a && c > b && c > d) 
				System.out.println("c is Greater");
        	else 
			System.out.println("D is Greater");
        }
}