/* 
author - > Harshal Gothriya
Date   - > 14/10/2026
*/

import java.util.Scanner;
class CheckingNumberSign {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide your number");
		int number = sc.nextInt();

		//we have Strict Rules for not checking number with if-else , we were using ternary
		String result = (number>=0 ? "Number is Positive" : "Number is Negative");
		System.out.println(result);
	}
}