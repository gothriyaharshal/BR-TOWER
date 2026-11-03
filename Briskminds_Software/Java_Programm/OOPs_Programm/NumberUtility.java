/*
Author -> Harshal Gothriya
Date -> 20/10/2026
*/

class NumberUtility {

	public static boolean isPrime(int number) {
		
		if(number <= 1) {
			System.out.println("Number is equal or less then 1");
			return false;
		}

		for(int i = 2 ; i < number ; i++) {
			if(number % i == 0) {
				return false; 			}
		}
		return false;
	}

	
	public static boolean isPalimdrome(int number) {
		//number reverse is equal to same number is known as palimdrom number

		int temp = number ;
		int reverse = 0;

		while(number > 0) {
			int remainder = number % 10;
			reverse = reverse * 10 + remainder;
			number = number/10;	
		}

		if(reverse == temp)
			return true;
		else 
			return false;
	}


	public static boolean isArmstrong(int number) {

		int count = numberofElement(number);
		int sum = 0 ;
		int temp = number ;

		while(temp > 0 ) {
			int remainder = temp % 10;
			sum = sum + powerOfElementAddition(remainder , count);
			temp = temp / 10;
		}
		if(sum == number)
			return true;
		else
			return false;
	}
	
	public static int numberofElement(int number) {
		int count = 0;

		while(number > 0) {
			count++;
			number = number / 10;
		}
		return count ;
	}

	public static int powerOfElementAddition(int number , int power) {
		int p = 1;
		while(power > 0) {
			p = p * number;
			power--;
		}
		return p;
	}

}







