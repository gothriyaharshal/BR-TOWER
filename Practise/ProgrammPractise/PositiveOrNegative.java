/*
2) Write a Java program to get a number from the user and print whether it is positive or negative.

Note: using if-else
*/

import java.util.Scanner;

class PositiveOrNegative {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your 3 number sir");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();

		if(a > b) 
			if(a > c) 
				if(a > d)
					System.out.println("D is greater");
				else
					System.out.println("A is greater");
			else
				if(c > d) 
					System.out.println("D is greater");
				else
					System.out.println("C is greater");
		else 
			if(b > c) 
				if(b > d) 
					System.out.println("D is greater");
				else												System.out.println("B is greater");
			else 
				if(c > d) 
					System.out.println("D is greater");
				else
					System.out.println("C is greater");
		
					
	}
}