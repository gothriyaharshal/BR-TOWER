
import java.util.Scanner;

class FiftheenthSeries {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your number");
		int number = sc.nextInt();
		System.out.println( armstrongOrNot(number) );
        }

	public static boolean armstrongOrNot(int number) {
		
		int digitCount = count(number);
		int sum = 0 ;
		int temp = number ;

		while(temp > 0 ) {
			int remainder = temp % 10;
			sum = sum + power(remainder , digitCount);
			temp = temp / 10;
		}
		if(sum == number)
			return true;
		else
			return false;
	}

	public static int power(int remainder , int digitCount) {
		int answer = 1;
		while(digitCount > 0 ) {
			answer = remainder * answer ;
			digitCount--;
		}
                return answer;
        }

	public static int count(int number) {
		int count = 0;
		while(number > 0 ) {
			count++;
			number = number/10;
		}
		return count;
	}
 }