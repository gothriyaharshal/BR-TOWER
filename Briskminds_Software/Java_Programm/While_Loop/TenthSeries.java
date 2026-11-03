/*
10) Print the below series!
1,6,13,22,33,46,…………for n-time

Author -> Harshal Gothriya
Date   -> 15/10/2026

*/
 

import java.util.Scanner;

class TenthSeries {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide till how many times you want this series");
		int numberOfTimes = sc.nextInt();
		System.out.println("Please provide your starting odd number");
		int startingOddNumber = sc.nextInt();
		int total = 1;
 		System.out.print(total + " ");

		while(numberOfTimes >= 2) {
			total = total + startingOddNumber ;
			System.out.print(total + " ");
			numberOfTimes--;
                        startingOddNumber = nextOddNumber(startingOddNumber);
		}
	}

	public static int nextOddNumber(int x) {
		return x+2;
        }
}