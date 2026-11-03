/*
16) Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.	
*/

import java.util.Scanner;

class Programm {
	public static void main(String args [] ){
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int i = 1;
		int c = 0;
		int b = 0;
		while(i <= 10) {
			 b = sc.nextInt();

			if(a < b) {
				c = b;	
				b = a;
			}	
			if(c < a) 
				a = c;
			i++;
		}

		System.out.println("Smallest " + a);
		
		System.out.println("Greatest " + b);
	}
}