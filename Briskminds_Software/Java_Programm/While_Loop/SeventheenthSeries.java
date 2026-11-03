
import java.util.Scanner;

class SeventheenthSeries {
	public static void main(String args [] ){
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide your number lets check it is prime or not");
		int number = sc.nextInt();

		int i = 2 ;
		while(number > i) {
			if( (number % i) == 0) {
				break;
			}	
			i++;
		}
		if(i == number)
			System.out.println("Number is prime");
		else	
			System.out.println("Number is not prime");
	}
}