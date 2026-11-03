/*
11) Print the below series!
3,7,15,31,63,127…………for n-time

Author -> Harshal Gothriya
Date   -> 15/10/2026

*/
 

import java.util.Scanner;

class EleventhSeries {
	public static void main(String args []) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please provide till how many times you want this series");
		int range = sc.nextInt();

		System.out.println("Please provide from which number you want to start (Recommendation = 3) " );
		int total = sc.nextInt();
		System.out.print(total + " ");

		int startingPower = 4;
		
		while(range >= 2) {

			total = total + startingPower;	
			System.out.print(total + " ");
			range--;
			startingPower = MultiplicationMethod(startingPower);	 
		}
	}
	public static int MultiplicationMethod(int x) {
		return x*2;
        }

}