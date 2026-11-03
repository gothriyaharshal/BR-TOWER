/*
 Author = Harshal Gothriya
 Date = 14-10-2026
*/


import java.util.Scanner;
class SimpleInterest {
	public static void main(String args []) {

		Scanner sc = new Scanner(System.in);

                System.out.println("Please Enter Your Amount Sir");
		int principle = sc.nextInt();
		
		System.out.println("Provide your interest Rate per annum");
		int rate = sc.nextInt();

		System.out.println("Provide Total Amount of Time");
		int time = sc.nextInt();

		int simpleInterest = (principle*rate*time)/100;
		System.out.println("Your Simple Interest is => " + simpleInterest);
			
	} 
}


/*
What we have ->
   total amount deposit by men - > principle(2000)
   interest rate - > 6%
   Time -> 3 Years

  Simple Interest = p*r*t/100;
*/