/*
 author -> Harshal Gothriya
 Date -> 14/10/2026
*/


import java.util.Scanner;

class CheckingCharcterType {
	public static void main(String args [] ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Provide your Character name sir");
		
		char ch = sc.next().charAt(0);
		if(ch >= 65) {
			if(ch<=122) {
				System.out.println("You contains an letter");
			}
		}
		else if(ch>=48)	{
			if(ch<=57) {
                        	System.out.println("You contains an number");
			}
		}
		else {
			System.out.println("You contains an special symbol");
		}
	}
}	            