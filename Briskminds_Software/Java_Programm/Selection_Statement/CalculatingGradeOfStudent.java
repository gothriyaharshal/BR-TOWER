/*
 author -> Harshal Gothriya
 Date -> 14/10/2026
*/


import java.util.Scanner;

class CalculatingGradeOfStudent {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);
                System.out.println("Please provide your marks sir");
		int marks = sc.nextInt();

		if(marks >= 80) {
			System.out.println("Your Grade is A");	
		}
		else if(marks >= 60) {
			System.out.println("Your Grade is B");
		}
		else if(marks >= 40) {
			System.out.println("Your Grade is C");
		}
		else {
			System.out.println("your grade is D");
		}
       }
}