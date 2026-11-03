
import java.util.Scanner;

class ConvertingLowerCaseToUpperCase {
	public static void main(String args [] ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide character");

		char ch = sc.next().charAt(0);
		
		if(ch >= 65 && ch<=122) {

			if(ch >= 97 && ch <= 122) {
			ch = (char)(ch-32);
			System.out.println("Charcter converted from lower Case to upperCase => " + ch);
			}
				
		}
	}
}
