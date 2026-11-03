/*
 author -> Harshal Gothriya
 Date -> 14/10/2026
*/


import java.util.Scanner;

class CheckingValueEvenOrOdd {
	public static void main(String args [] ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Provide your number sir");
		
		int number = sc.nextInt();
                if(number % 2 == 0) {
			System.out.println("Your number is even");
		}
		else {
			System.out.println("Your number is odd");
		}
        }
}  