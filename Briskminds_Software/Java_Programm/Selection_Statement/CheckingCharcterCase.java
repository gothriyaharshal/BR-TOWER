/*
 author -> Harshal Gothriya
 Date -> 14/10/2026
*/


import java.util.Scanner;

class CheckingCharcterCase {
	public static void main(String args [] ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Provide your Character name sir");
		
		char ch = sc.next().charAt(0);
		
		if(ch >= 97) {
			if(ch <= 122) {
				System.out.println("Character is in LowerCase");
			}
		}
		if(ch >= 65) {
			if(ch <= 90) {
				System.out.println("Character is in UpperCase");
			}
		}
	}
}