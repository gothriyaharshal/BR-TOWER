/*

12) Print the below series!
1,2,9,28,65............for n-time

Author -> Harshal Gothriya
Date   -> 15/10/2026
*/


import java.util.Scanner;

class TwelveSeries {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide till how many times you want this series");
		int range = sc.nextInt();
		
		System.out.println("Please provide from which number you want to start enter 1" );
		int total = sc.nextInt();
		System.out.print(total + " ");

		int x = 1;
		
		while(range >= 2) {

			total = 1 + cube(x);	
			System.out.print(total + " ");
			x++;
			range--;	 
		}
	}

	public static int cube(int digit) {
		int answer = 1;
		int power = 3;
		while(power > 0 ) {
			answer = digit * answer ;
			power--;
		}
                return answer;
        }
}