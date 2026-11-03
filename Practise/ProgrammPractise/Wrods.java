//converting 4 digit into words

import java.util.Scanner;
public class Wrods {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide your number sir");

		int number = sc.nextInt();
		//1234
System.out.println(number%100);
		int th = number/1000;
		int hn = (number/100) % 10;
		int ten = (number/10) % 10;
		int unit = number % 10;

		switch(th) {
			case 1 :
				System.out.println("one thousand");
				break;
			
			case 2 :
				System.out.println("two thousand"); break;
			
			case 3 :
				System.out.println("three thousand"); break;
			
			case 4 :
				System.out.println("four thousand"); break;
			
			case 5 :
				System.out.println("five thousand"); break;
			
			case 6 :
				System.out.println("six thousand"); break;
			
			case 7 :
				System.out.println("seven thousand"); break;
			
			case 8 :
				System.out.println("eight thousand"); break;
		
			case 9 :
				System.out.println("nine thousand"); break;
		}

		switch(hn) {
			case 1 :
				System.out.println("one hundred"); break;
			
			case 2 :
				System.out.println("two hundred"); break;
			
			case 3 :
				System.out.println("three hundred"); break;
			
			case 4 :
				System.out.println("four hundred"); break;
			
			case 5 :
				System.out.println("five hundred"); break;
			
			case 6 :
				System.out.println("six hundred"); break;
			
			case 7 :
				System.out.println("seven hundred"); break;
			
			case 8 :
				System.out.println("eight hundred"); break;
		
			case 9 :
				System.out.println("nine hundred"); break;
		}

		
		switch(ten) {
			case 1 :
				switch(unit) {
					case 1 :
						System.out.println("Eleven"); break;
					case 2 :
						System.out.println("twelve");break;
					case 3 :
						System.out.println("thirteen");break;
					case 4 :
						System.out.println("fourteen");break;
					case 5 :
						System.out.println("fifteen");break;
					case 6 :
						System.out.println("sixteen");break;
					case 7 :
						System.out.println("seventeen");break;
					case 8 :
						System.out.println("eighteen");break;
					case 9 :
						System.out.println("nineteen");break;
				}
				break;
			case 2 :
				System.out.println("Twenty");break;
			
			case 3 :
				System.out.println("thirty");break;
			
			case 4 :
				System.out.println("fourty");break;
			
			case 5 :
				System.out.println("fifty");break;
			
			case 6 :
				System.out.println("sixty");break;
			
			case 7 :
				System.out.println("seventy");break;
			
			case 8 :
				System.out.println("eighty");break;
		
			case 9 :
				System.out.println("ninty");break;
		}

		if(number%100 > 20) {
		switch(unit) {
					case 1 :
						System.out.println("one");break;
					case 2 :
						System.out.println("two");break;
					case 3 :
						System.out.println("three");break;
					case 4 :
						System.out.println("four");break;
					case 5 :
						System.out.println("five");break;
					case 6 :
						System.out.println("six");break;
					case 7 :
						System.out.println("seven");break;
					case 8 :
						System.out.println("eight");break;
					case 9 :
						System.out.println("nine");break;
		}
	}

	}
}