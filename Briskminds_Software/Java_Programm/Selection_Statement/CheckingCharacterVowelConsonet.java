/*
 author -> Harshal Gothriya
 Date -> 14/10/2026
*/


import java.util.Scanner;

class CheckingCharacterVowelConsonet {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Provide Your Character");
		char ch = sc.next().charAt(0);
                
    		switch(ch) {
			case 'a' : 
			case 'e' :
			case 'i' : 
			case 'o' :
			case 'u' :
				System.out.println("Your character is an Vowel");
				break;
			default :
				System.out.println("Your character is an consonent");
		} 
	}
}