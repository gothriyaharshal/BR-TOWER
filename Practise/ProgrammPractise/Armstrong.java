
/*
15) WAP to check whether the is Armstrong number or not.
For example, 
153 = 13 + 53 + 33

1634 = 14 + 64 + 34 + 44
*/

import java.util.Scanner;

class Armstrong {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide your number lets see it");
		int number = sc.nextInt();
		int temp = number;
		int count = 0;
		int sum = 0;
		while(number > 0){
			count++;
			number = number/10;
		}
		number = temp; 

		while(number > 0) {
			int digit = number%10;
			sum = 	sum + power(count , digit);
			number = number/10;
		}

		if(temp == sum)
			System.out.println("Our number is armstrong");
		else
			System.out.println("No");	
	}

	public static int power(int power , int digit) {
		int p = 1 ;
		while(power >= 1) {
			p = p * digit;
			power--;
		}
		return p;
	}
}