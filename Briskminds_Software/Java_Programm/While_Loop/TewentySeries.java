import java.util.Scanner;

class TewentySeries {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide decimal number");
		
		int decimal = sc.nextInt();
		int place = 1;

		while(decimal >  0) {
			int digit = decimal % 2 ;
			binary = binary + digit * place ; 
			place = place * 10 ;
			decimal = decimal / 10 ;
		}
		System.out.println(binary);
	}
}