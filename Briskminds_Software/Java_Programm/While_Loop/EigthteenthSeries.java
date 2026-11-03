
import java.util.Scanner;

class EigthteenthSeries {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your number sir for checking palimdrome or not");
		int number = sc.nextInt();
		System.out.println(isPalimdrom(number));		
	}
	public static boolean isPalimdrom(int number) {
		int temp = number ;
		int reverse = 0;
		while(temp > 0) {
		int digit = temp % 10;
                reverse = reverse * 10 + digit ;
		temp = temp / 10;
		}
		if(reverse == number)
			return true;
		else
			return false;
	}
}